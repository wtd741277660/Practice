<template>
  <el-tabs class="tool-tab"
           type="border-card"
           v-model="activeName"
  >
    <el-tab-pane label="文件" name="file"><HeaderFile></HeaderFile></el-tab-pane>
    <el-tab-pane label="开始" name="start"><HeaderStart></HeaderStart></el-tab-pane>
    <el-tab-pane label="插入" name="insert"><HeaderInsert></HeaderInsert></el-tab-pane>
    <el-tab-pane label="设计" name="design"><HeaderDesign></HeaderDesign></el-tab-pane>
    <el-tab-pane label="数据" name="data"><HeaderData></HeaderData></el-tab-pane>
    <el-tab-pane label="流程"><HeaderProcess></HeaderProcess></el-tab-pane>
    <el-tab-pane label="审阅"><HeaderCheck></HeaderCheck></el-tab-pane>
    <el-tab-pane label="视图"><HeaderView></HeaderView></el-tab-pane>
  </el-tabs>
</template>

<script>
    import HeaderFile from "./HeaderFile";
    import HeaderStart from "./HeaderStart";
    import HeaderInsert from "./HeaderInsert";
    import HeaderDesign from "./HeaderDesign";
    import HeaderData from "./HeaderData";
    import HeaderProcess from "./HeaderProcess";
    import HeaderCheck from "./HeaderCheck";
    import HeaderView from "./HeaderView";
    export default {
      name: "Header",
      components: {
        HeaderView,
        HeaderCheck, HeaderProcess, HeaderData, HeaderDesign, HeaderInsert, HeaderStart, HeaderFile},
      data(){
        return {
          activeName:"start",
        }
      }
    }
</script>

<style>
  .tool-tab{
    /*background-color:#F1F1F1;*/
  }
  .tool-tab .el-tabs__content{
    padding-top:2px;
    padding-bottom:2px;
    height:89px;
  }
  .tool-tab .el-tab-pane{
    /*height:100%;*/
  }
</style>
