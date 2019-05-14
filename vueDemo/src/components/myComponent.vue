<template>
    <div id="myComponent">
      <h1>I am a title</h1>
      <a>written by {{autor}}</a>
    </div>
</template>

<script>
    export default {
        name: "myComponent",
      data(){
          return {
              autor:"wtd"
          }
      }
    }
</script>

<style scoped>

</style>
