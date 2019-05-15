<template>
    <el-container>
      <!--顶部容器 -->
      <el-header height="156px" class="header">
        <Header></Header>
      </el-header>
      <el-container>
        <!--左侧容器-->
        <el-aside>
          <LeftAside></LeftAside>
        </el-aside>
        <!--主容器-->
        <el-main>
          <CanvasPanel></CanvasPanel>
        </el-main>
      </el-container>
    </el-container>
</template>

<script>
    import MyComponent from "./myComponent";
    import Header from "./header/Header";
    import CanvasPanel from "./main/CanvasPanel";
    import LeftAside from "./left/LeftAside";
    export default {
        name: "KindEditor",
      components: {LeftAside, CanvasPanel, Header, MyComponent}
    }
</script>

<style scoped>
  .header{
    padding:0px;
  }
</style>
