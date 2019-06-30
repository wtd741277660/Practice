<template>
    <div id="computedTest">
      <input v-if="showFirst" v-model="first"/>
      <input v-model="last"/>
      <input v-model="temp"/>
      <div>{{assemble}}</div>
      <button @click="test">click me</button>
      <button @click="toggleShowFirst">Toggle show first</button>
    </div>
</template>

<script>
    export default {
        name: "ComputedTest",
      data(){
          return{
            first:"first",
            last:"last",
            temp:"temp",
            showFirst:true,
          }
      },
      methods:{
        test(){
          console.info(this.assemble)
        },
        toggleShowFirst(){
            this.showFirst = !this.showFirst;
        }
      },
      computed:{
          assemble:{
            cache:true,
            get:function(){
              alert("assemble")
              return this.first + ">>>" + this.last + ">>>" + Date.now();
            }
          }
      }
    }
</script>

<style scoped>

</style>
