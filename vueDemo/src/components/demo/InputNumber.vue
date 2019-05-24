<template>
    <div id="input-number">
      <input :value="currentValue"
             @change="handleChange"
             @keyup.up="handlePlus"
             @keyup.down="handleDown"
      />
      <button @click="handlePlus"
              :disabled="currentValue >= max"
      >
        +</button>
      <button @click="handleDown"
              :disabled="currentValue <= min"
      >
        -</button>
      <slot name="aaa"></slot>
      <slot></slot>
    </div>
</template>

<script>
    export default {
      name: "InputNumber",
      props:{
        min:{
          type:Number,
          default:Infinity
        },
        max:{
          type:Number,
          default:Infinity
        },
        value:{
          type:Number,
          default:0
        },
        step:{
          type:Number,
          default:1
        }
      },
      data(){
        return {
          currentValue:this.value,
        }
      },
      watch:{
        currentValue:function(val){
          this.$emit("input",val);
        },
        value:function(val){
          this.updateValue(val);
        }
      },
      methods:{
        handlePlus(){
          if(this.currentValue >= this.max){
            return;
          }
          this.currentValue+=this.step;
        },
        handleDown(){
          if(this.currentValue <= this.min){
            return;
          }
          this.currentValue-=this.step;
        },
        handleChange(event){
          var val = event.target.value.trim();
          var max = this.max;
          var min = this.min;
          val = Number(val);

          if(val > max){
            this.currentValue = max;
          }else if(val < min){
            this.currentValue = min;
          }else{
            this.currentValue = val;
          }
        },
        updateValue(val){
          if(val >= this.max){
            val = this.max;
          }
          if(val <= this.min){
            val = this.min;
          }
          this.currentValue = val;
        }
      },
      mounted() {
        this.updateValue(this.value);
      }
    }
</script>

<style scoped>

</style>
