<template>
    <div id="basic-form">
      <input v-model="name" placeholder="input name"/>
      <span>{{name}}</span>
      <br>
      <input type="checkbox" value="a" v-model="checked"/>
      <input type="checkbox" value="b" v-model="checked"/>
      <input type="checkbox" value="c" v-model="checked"/>
      <label>{{checked}}</label>
      <hr>
      <input type="radio" value="1" v-model="radioSelected"/>
      <input type="radio" value="2" v-model="radioSelected"/>
      <label>{{radioSelected}}</label>
      <hr>
      <select v-model="selected" multiple>
        <option value="a" selected>AAA</option>
        <option>BBB</option>
        <option>CCC</option>
        <option>DDD</option>
      </select>
      <label>{{selected}}</label>
      <hr>
      <select v-model="selected1">
        <option v-for="option in options" :value="option.v">{{option.text}}</option>
      </select>
    </div>
</template>

<script>
    export default {
      name: "BasicTest",
      data(){
        return {
          name:"",
          checked:"",
          radioSelected:"",
          selected:"",
          selected1:"",
          options:[
            {v:1,text:"qqq"},
            {v:2,text:"www"},
            {v:3,text:"eee"}
          ],
        }
      }
    }
</script>

<style scoped>

</style>
