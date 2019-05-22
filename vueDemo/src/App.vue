<template>
  <div id="app">
<!--    <img src="./assets/logo.png">-->
<!--    <router-view/>-->
<!--    <router-view>/myComponent</router-view>-->
<!--    <KindEditor></KindEditor>-->
<!--    <my-component></my-component>-->
    <!--数字输入框组件-->
    <input-number v-model="value" :min="0" :max="100" :step="10"></input-number>
  </div>
</template>

<script>
import KindEditor from "./components/KindEditor";
import MyComponent from "./components/myComponent";
import InputNumber from "./components/demo/InputNumber";
export default {
  name: 'App',
  components: {InputNumber, MyComponent, KindEditor},
  data(){
    return {
      value:5
    }
  },
  watch:{
    value(val,old){
      console.info(old + ">>>" + val)
    }
  }
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
