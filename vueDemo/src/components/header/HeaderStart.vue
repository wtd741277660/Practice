<template>
    <!--开始工具栏-->
  <div id="tool-start">
    <el-row :gutter="1">
      <el-col :span="2">
        <div class="grid-content bg-purple cut-panel">
          <el-row>
            <el-col :span="12">
              <i class="el-icon-s-order" style="font-size:50px;color:#9d8d19"></i>
              <label>粘贴</label>
            </el-col>
            <el-col :span="12">
              <el-row class="clo-2">
                <el-col><i class="el-icon-scissors">剪切</i></el-col>
                <el-col><i class="el-icon-copy-document">复制</i></el-col>
                <el-col><i class="el-icon-s-management">格式刷</i></el-col>
              </el-row>
            </el-col>
          </el-row>
<!--          <label>剪切板</label>-->
        </div>
      </el-col>
      <el-col :span="4">
        <div class="grid-content bg-purple font-panel">
          <el-row type="flex" justify="end">
            <el-col :span="20">
              <!--            <el-select v-model="currentFontSize" placeholder="请选择" size="mini" style="width:40%">-->
              <!--              <el-option-->
              <!--                v-for="item in fontSizes"-->
              <!--                :key="item.value"-->
              <!--                :label="item.label"-->
              <!--                :value="item.value">-->
              <!--              </el-option>-->
              <!--            </el-select>-->
              <el-select v-model="currentFontSize" placeholder="请选择" size="mini">
                <el-option
                  v-for="item in fontSizes"
                  :key="item.value"
                  :label="item.label"
                  :value="item.value">
                </el-option>
              </el-select>
            </el-col>
            <el-col :span="2">
              <a><i>A+</i></a>
            </el-col>
            <el-col :span="2">
              <a><i>A-</i></a>
            </el-col>
          </el-row>
          <el-row type="flex" justify="start" style="margin-top:10px;">
            <el-col :span="3">
              <a style="font-weight: bold;font-size:17px;">B</a>
            </el-col>
            <el-col :span="3">
              <a style="font-style:italic;font-size:17px;">I</a>
            </el-col>
            <el-col :span="3">
              <a style="text-decoration: underline;font-size:17px;">U</a>
            </el-col>
            <el-col :span="3">
              <a style="text-decoration: line-through">abc</a>
            </el-col>
            <el-col :span="4" style="border-right:1px solid #000;">
              <el-dropdown placement="top-end" trigger="click" size="mini">
                <span class="el-dropdown-link">
                  Aa<i class="el-icon-arrow-down el-icon--right"></i>
                </span>
                <el-dropdown-menu slot="dropdown" >
                  <el-dropdown-item>正常</el-dropdown-item>
                  <el-dropdown-item>全部大写</el-dropdown-item>
                  <el-dropdown-item>每个单词首字母大写</el-dropdown-item>
                  <el-dropdown-item>小型大写字母</el-dropdown-item>
                </el-dropdown-menu>
              </el-dropdown>
            </el-col>
            <el-col :span="4">
              <div class="font-block">
                <span class="font-color-text">A</span>
                <el-color-picker v-model="fontColor" popper-class="font-color-select" size="mini"></el-color-picker>
              </div>
            </el-col>
          </el-row>
        </div>
      </el-col>
      <el-col :span="2">
        <div class="grid-content bg-purple section-panel">
          <el-row type="flex" justify="start" style="margin-top:10px;">
            <el-col :span="6">
              <a><i style="font-size: 16px;" class="editor-iconfont editor-iconchuizhiduiqishang"></i></a>
            </el-col>
            <el-col :span="6">
              <a><i style="font-size: 16px;" class="editor-iconfont editor-iconchuizhiduiqizhong"></i></a>
            </el-col>
            <el-col :span="6">
              <a><i style="font-size: 16px;" class="editor-iconfont editor-iconchuizhiduiqixia"></i></a>
            </el-col>
          </el-row>
          <el-row type="flex" justify="start" style="margin-top:10px;">
            <el-col :span="6">
              <a><i style="font-size: 16px;" class="editor-iconfont editor-iconword-left"></i></a>
            </el-col>
            <el-col :span="6">
              <a><i style="font-size: 16px;" class="editor-iconfont editor-iconword-left"></i></a>
            </el-col>
            <el-col :span="6">
              <a><i style="font-size: 16px;" class="editor-iconfont editor-iconword-right"></i></a>
            </el-col>
            <el-col :span="6">
              <a><i style="font-size: 16px;" class="editor-iconfont editor-iconliangduanduiqi"></i></a>
            </el-col>
          </el-row>
        </div>
      </el-col>
      <el-col :span="3"><div class="grid-content bg-purple"></div></el-col>
      <el-col :span="3"><div class="grid-content bg-purple"></div></el-col>
      <el-col :span="3"><div class="grid-content bg-purple"></div></el-col>
      <el-col :span="3"><div class="grid-content bg-purple"></div></el-col>
    </el-row>
  </div>
</template>

<script>
    export default {
      name: "HeaderStart",
      data:function(){
        return {
          fontSizes: [{
            value: '6',
            label: '6px'
          }, {
            value: '8',
            label: '8px'
          }, {
            value: '10',
            label: '10px'
          }, {
            value: '12',
            label: '12px'
          }, {
            value: '14',
            label: '14px'
          }],
          currentFontSize: '8',
          fontColor:"#000000",
          preColors:["#ccc","#ddd"],
        }
      },
      methods:{

      }
    }
</script>

<style scoped>
  #tool-start{
    height:100%;
    text-align:center;
  }
  #tool-start a{
    cursor:pointer;
  }
  .font-panel .el-col{
    display: flex;                /*设置为flex布局*/
    justify-content: center;   /*水平居中*/
    align-items: center;     /*垂直居中*/
  }
  .cut-panel {
    /*background: #d3dce6;*/
    display: flex;                /*设置为flex布局*/
    justify-content: center;   /*水平居中*/
    align-items: center;     /*垂直居中*/
  }
  .grid-content {
    min-height: 36px;
    border-right:1px solid #b4b4b4;
    height:85px;
  }
  .grid-content p{

  }
  #tool-start i,div {
    font-size:13px;
    font-style:normal;
  }
  .cut-panel .clo-2 i{
    line-height: 23px;
    float:left;
  }
  .font-block .font-color-text {
    display: block;
    color: #8492a6;
    /*font-size: 14px;*/
    /*margin-bottom: 20px;*/
  }
  .font-color-select{
    height:20px;
  }
</style>
<style>
  /*重写颜色选择器的样式*/
  .font-block .el-color-picker--mini{
    height:10px;
  }
  .font-block .el-color-picker__trigger{
    padding:0px;
    height:10px;
  }
</style>
