<template>
    <div id="demo">
      <input v-model="k"/>
      <input v-model="v"/>
      <div id="btn-div">
        <button @click="pushList()">push</button>
        <button @click="popList()">pop</button>
        <button @click="shiftList()">shift</button>
        <button @click="unshiftList">unshift</button>
        <button @click="spliceList">splice</button>
        <button @click="sortList">sort</button>
        <button @click="reverseList">reverse</button>
        <button @click="setList">$set</button>
        <button @click="removeList">$remove</button>
      </div>
      <div v-for="li in list">
        <p>{{li.k}}-{{li.v}}</p>
        <test-a v-ref="test"></test-a>
      </div>
      <button v-el:aaa @click="test">test</button>
    </div>
</template>

<script>
    import TestA from "./test/testA";
    export default {
      name: "Demo",
      components: {TestA},
      data(){
        return {
          k:"",
          v:"",
          searchText:"",
          list:[
            {k:"a",v:"A"},
            {k:"b",v:"B"}
          ]
        }
      },
      methods:{
        test(){
          console.info(this.$els)
        },
        pushList(){
          var temp = {k:this.k,v:this.v};
          this.list.push(temp);
        },
        popList(){
          this.list.pop();
        },
        shiftList(){
          this.list.shift();
        },
        unshiftList(){
          this.list.unshift();
        },
        spliceList(){
          this.list.splice();
        },
        sortList(){
          this.list.sort();
        },
        reverseList(){
          this.list.reverse();
        },
        setList(){
          this.list.$set(0,{k:"a",v:'A'});
        },
        removeList(){
          var temp = {k:"a",v:'A'};
          this.list.$remove(temp);
        }
      }
    }
</script>

<style scoped>

</style>
