<template>
    <div id="tongxin">
      <button @click="handleIncrease">+1</button>
      <button @click="handleReduse">-1</button>
    </div>
</template>

<script>
    export default {
      name: "tongxin",
      data(){
        return {
          counter:0
        }
      },
      methods:{
        handleIncrease(){
          this.counter++;
          // this.$emit("increase",this.counter);
          this.$emit("input",this.counter);
        },
        handleReduse(){
          this.counter--;
          // this.$emit("reduse",this.counter);
          this.$emit("input",this.counter);
        }
      }
    }
</script>

<style scoped>

</style>
