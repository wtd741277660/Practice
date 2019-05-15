<template>
    <div id="basic-graph">
      <el-row>
          <draggable
            class="dragArea list-group"
            :list="basicGraphs"
            :group="{ name: 'people', pull: 'clone', put: false }"
            :clone="cloneDog"
            @change="log"
          >
          <el-col :span="4" v-for="item in basicGraphs" :key="item.id">
            <i :class="item.className"></i>
          </el-col>
        </draggable>
      </el-row>
    </div>
</template>

<script>
  import draggable from 'vuedraggable';
    export default {
      name: "BasicGraph",
      components: {draggable},
      props: {
      },
      data(){
        return {
          basicGraphs:[
            {
              id:1,
              className:"el-icon-delete"
            },
            {
              id:2,
              className:"el-icon-edit"
            }
          ]
        }
      },
      // updated() {
      //   console.info(1111111)
      // },
      methods: {
        log: function(evt) {
          window.console.log(evt);
        },
        cloneDog({ id }) {
          return {
            name: `cat ${id}`
          };
        }
      }
    }
</script>

<style scoped>

</style>
