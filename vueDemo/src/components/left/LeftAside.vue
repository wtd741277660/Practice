<template>
    <div id="left-aside">
      <el-row class="tac">
        <el-col :span="24">
          <el-menu
            default-active="1"
            :unique-opened=true
            background-color="transparent"
            class="el-menu-vertical-left"
            @open="handleOpen"
            @close="handleClose">
            <el-submenu index="1">
              <template slot="title">
                <i class="el-icon-menu"></i>
                <span>导航一</span>
              </template>
              <el-menu-item-group>
                <template slot="title">分组一</template>
                <el-menu-item index="1-1">选项1</el-menu-item>
                <el-menu-item index="1-2">选项2</el-menu-item>
              </el-menu-item-group>
              <el-menu-item-group title="分组2">
                <el-menu-item index="1-3">选项3</el-menu-item>
              </el-menu-item-group>
            </el-submenu>
          </el-menu>
        </el-col>
      </el-row>
    </div>
</template>

<script>
    import BasicGraph from "./BasicGraph";
    export default {
      name: "LeftAside",
      components: {BasicGraph},
      methods: {
        handleOpen(key, keyPath) {
          console.log(key, keyPath);
        },
        handleClose(key, keyPath) {
          console.log(key, keyPath);
        }
      }
    }
</script>

<style scoped>
  #left-aside{
    /*border:1px solid #000000;*/
    height:500px;
  }
  .el-menu-vertical-left:not(.el-menu--collapse) {
    width: 200px;
    height: auto;
  }
</style>
