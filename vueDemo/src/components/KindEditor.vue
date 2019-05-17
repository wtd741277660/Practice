<template>
    <el-container>
      <!--顶部容器 -->
      <el-header height="136px" class="header" v-if="showHeader">
        <Header></Header>
      </el-header>
      <el-container>
        <!--左侧容器-->
        <el-aside width="200px">
          <LeftAside></LeftAside>
        </el-aside>
        <!--主容器-->
        <el-main>
          <CanvasPanel></CanvasPanel>
        </el-main>
      </el-container>
      <!--底部容器-->
      <el-footer height="40px"><Footer></Footer></el-footer>
    </el-container>
</template>

<script>
    import MyComponent from "./myComponent";
    import Header from "./header/Header";
    import CanvasPanel from "./main/CanvasPanel";
    import LeftAside from "./left/LeftAside";
    import Footer from "./footer/Footer";
    export default {
      name: "KindEditor",
      components: {Footer, LeftAside, CanvasPanel, Header, MyComponent},
      data(){
        return {
          showHeader:true
        }
      }
    }
</script>

<style scoped>
  .header,.el-footer,.el-main{
    padding:0px;
  }
  .el-container{
    /*display: flex;*/
    /*flex-direction: inherit;*/
    /*flex: 1;*/
    /*flex-basis: auto;*/
    /*box-sizing: border-box;*/
    /*min-width: 0;*/
    margin:0px;
    background-color:#F1F1F1;
  }
  .el-aside{
    /*box-sizing: border-box;*/
    /*flex-shrink: 0;*/
  }
</style>
