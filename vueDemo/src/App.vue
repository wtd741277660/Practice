<template>
  <div id="app">
<!--    <img src="./assets/logo.png">-->
<!--    <router-view/>-->
<!--    <router-view>/myComponent</router-view>-->
<!--    <KindEditor></KindEditor>-->
    <ComponentTest></ComponentTest>
  </div>
</template>

<script>
import KindEditor from "./components/KindEditor";
import Demo from "./components/Demo";
import ComputedTest from "./components/test/ComputedTest";
import BasicTest from "./components/test/form/BasicTest";
import ComponentTest from "./components/test/component/ComponentTest";
export default {
  name: 'App',
  components: {ComponentTest, BasicTest, ComputedTest, Demo, KindEditor},
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
