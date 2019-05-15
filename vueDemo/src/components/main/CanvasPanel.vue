<template>
    <div id="canvas-panel">
      <draggable
        class="dragArea list-group"
        :list="list2"
        group="people"
        @change="log"
        @drop="drop"
      >
        <div class="list-group-item" v-for="element in list2" :key="element.id">
          {{ element.name }}
        </div>
      </draggable>
    </div>
</template>

<script>
  import draggable from 'vuedraggable';
    export default {
      name: "CanvasPanel",
      components: {draggable},
      data(){
        return {
          list2: [
            { name: "cat 5", id: 5 },
            { name: "cat 6", id: 6 },
            { name: "cat 7", id: 7 }
          ]
        }
      },
      methods: {
        log: function(evt) {
          window.console.log(evt);
        },
        cloneDog({ id }) {
          return {
            name: `cat ${id}`
          };
        },
        drop:function () {
          
        }
      }
    }
</script>

<style scoped>
  #canvas-panel{
    width:100%;
    height:100%;
    margin:0px;
    padding:0px;
    background-color: #97ff82;
  }
</style>
