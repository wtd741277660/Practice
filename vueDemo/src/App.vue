<template>
  <div id="app">
<!--    <img src="./assets/logo.png">-->
<!--    <router-view/>-->
<!--    <router-view>/myComponent</router-view>-->
    <KindEditor></KindEditor>
  </div>
</template>

<script>
import KindEditor from "./components/KindEditor";
export default {
  name: 'App',
  components: {KindEditor},
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  /*text-align: center;*/
  /*color: #2c3e50;*/
  /*margin-top: 60px;*/
}
</style>
