package com.wtd.backend.distributed.redisson;

import org.redisson.Redisson;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class RedissonLockTest {
    static int fixNum = 5;
    private static Config config = new Config();

    public static void main(String[] args) throws InterruptedException {
        init();
        CountDownLatch latch = new CountDownLatch(fixNum);
        //链接redisson
        RedissonClient redisson = Redisson.create(config);

        ExecutorService exec = Executors.newFixedThreadPool(fixNum);
        //设置5个线程
        for(int i = 0;i < 5;i++){
            exec.submit(new TestLock("client-" + i,redisson,latch));
        }
        exec.shutdown();
        latch.await();
        System.out.println("所有任务执行完毕");
    }

    static class TestLock implements Runnable{
        private String name;
        private RedissonClient redisson;
        private CountDownLatch latch;

        public TestLock(String name, RedissonClient redisson, CountDownLatch latch) {
            this.name = name;
            this.redisson = redisson;
            this.latch = latch;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            //定义锁
            RLock lock = redisson.getLock("TestLock");
            //Redisson的分布式可重入锁
            try{
                System.out.println("--------" + this.name + "------等待获取锁");
                //获取锁
                //尝试加锁，做多等待300毫秒，上锁后30毫秒自动解锁
                if(lock.tryLock(300,30, TimeUnit.MILLISECONDS)){
                    try{
                        System.out.println("--------" + this.name + "-------获得锁");
                        Thread.sleep(200);//模拟业务执行
                        System.out.println("---------" + this.name + "-------锁使用完毕");
                        latch.countDown();
                    }finally {
                        //释放锁
                        lock.unlock();
                        System.out.println("-----------" + this.name + "----------释放锁");
                    }
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    private static void init(){
        try {
            config.useSingleServer().setAddress("redis://47.93.239.66:6379");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
