<template>
    <el-container>
      <!--顶部容器 -->
      <el-header height="100px">
        <Header></Header>
      </el-header>
      <!--左侧容器-->
      <el-aside></el-aside>
      <!--主容器-->
      <el-main></el-main>
    </el-container>
</template>

<script>
    import MyComponent from "./myComponent";
    import Header from "./header/Header";
    export default {
        name: "KindEditor",
      components: {Header, MyComponent}
    }
</script>

<style scoped>

</style>
