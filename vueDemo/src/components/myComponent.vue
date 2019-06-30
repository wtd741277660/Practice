<template>
    <div id="myComponent">
      <h1>I am a title</h1>
      <a>written by {{autor}}</a>
      <p>总数：{{total}}</p>
      <tongxin
        @increase="handleGetTotal"
        @reduse="handleGetTotal"
        v-model="total"
      ></tongxin>
    </div>
</template>

<script>
  import tongxin from "./demo/tongxin";
    export default {
      name: "myComponent",
      components:{tongxin},
      data(){
          return {
            autor:"wtd",
            total:0
          }
      },
      methods:{
          handleGetTotal(total){
            this.total = total;
          }
      }
    }
</script>

<style scoped>

</style>
