<template>
    <div id="left-aside">
      <el-tabs tab-position="left" style="height:100%;">
        <el-tab-pane label="基础图形">
          <BasicGraph></BasicGraph>
        </el-tab-pane>
      </el-tabs>
    </div>
</template>

<script>
    import BasicGraph from "./BasicGraph";
    export default {
        name: "LeftAside",
      components: {BasicGraph}
    }
</script>

<style scoped>
  #left-aside{
    border:1px solid #000000;
    height:500px;
  }
</style>
