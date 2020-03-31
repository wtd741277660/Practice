<template>
    <div id="child">
      <input v-model="atr1"></input>
      <input v-model="num"/>
    </div>
</template>

<script>
    export default {
      name: "Child",
      props:{
        atr1:{
          type:String,
          coerce(val){
            alert("123")
            return val + "  child"
          }
        },
        num:{
          type:Number,
          coerce(val){//测试无效。。。
            return val * 100;
          }
        }
      },
      mounted() {
        console.info(this.$parent.parentMethod())
      }
    }
</script>

<style scoped>

</style>
