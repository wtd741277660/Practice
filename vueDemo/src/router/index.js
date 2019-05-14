import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import FromDemo from '@/components/FromDemo'
import KindEditor from '@/components/KindEditor'



Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'HelloWorld',
      component: HelloWorld
    },
    {
      path: '/formDemo',
      name: 'FormDemo',
      component: FromDemo
    },
    {
      path: '/KindEditor',
      name: 'KindEditor',
      component: KindEditor
    }
  ]
})
