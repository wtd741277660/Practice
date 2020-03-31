<template>
    <div id="componentTest">
      <Child atr1="aaaa" :num.sync="num"></Child>
      <span>parent num:{{num}}</span>
      <button @click="addOne">click me</button>
    </div>
</template>

<script>
    import Child from "./Child";
    export default {
      name: "ComponentTest",
      components: {Child},
      data(){
        return{
          num:1
        }
      },
      methods:{
        addOne(){
          this.num++;
        },
        parentMethod(){
          console.info("parent")
        }
      }
    }
</script>

<style scoped>

</style>
