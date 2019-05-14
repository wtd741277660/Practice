<template>
    <!--开始工具栏-->
  <el-row :gutter="1">
    <el-col :span="2">
      <div class="grid-content bg-purple cut-panel">
        <el-row>
          <el-col :span="12">
            <i class="el-icon-s-order" style="font-size:50px;color:#9d8d19"></i>
            粘贴
          </el-col>
          <el-col :span="12">
            <el-row class="clo-2">
              <el-col><i class="el-icon-scissors">剪切</i></el-col>
              <el-col><i class="el-icon-copy-document">复制</i></el-col>
              <el-col><i class="el-icon-s-management">格式刷</i></el-col>
            </el-row>
          </el-col>
        </el-row>
        <p>剪切板</p>
      </div>
    </el-col>
    <el-col :span="4">
      <div class="grid-content bg-purple">
        <el-row type="flex" justify="end">
          <el-col :span="24">
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
            <a><i>A+</i></a>
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
            <el-dropdown>
              <span class="el-dropdown-link">
                Aa<i class="el-icon-arrow-down el-icon--right"></i>
              </span>
              <el-dropdown-menu slot="dropdown">
                <el-dropdown-item>正常</el-dropdown-item>
                <el-dropdown-item>全部大写</el-dropdown-item>
                <el-dropdown-item>每个单词首字母大写</el-dropdown-item>
                <el-dropdown-item>小型大写字母</el-dropdown-item>
              </el-dropdown-menu>
            </el-dropdown>
          </el-col>
          <el-col :span="4">
            <div class="block">
              <span class="demonstration">A</span>
              <el-color-picker v-model="fontColor" popper-class="font-color" size="mini"></el-color-picker>
            </div>
          </el-col>
        </el-row>
        <p>字体</p>
      </div>
    </el-col>
    <el-col :span="4"><div class="grid-content bg-purple"></div></el-col>
    <el-col :span="3"><div class="grid-content bg-purple"></div></el-col>
    <el-col :span="3"><div class="grid-content bg-purple"></div></el-col>
    <el-col :span="3"><div class="grid-content bg-purple"></div></el-col>
    <el-col :span="3"><div class="grid-content bg-purple"></div></el-col>
  </el-row>
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
  .bg-purple {
    /*background: #d3dce6;*/
  }
  .grid-content {
    /*border-radius: 4px;*/
    min-height: 36px;
    border-right:1px solid #000;
    height:85px;
  }
  .grid-content p{

  }
  i,div {
    font-size:13px;
    font-style:normal;
  }
  .cut-panel .clo-2 i{
    line-height: 23px;
    float:left;
  }
  .demonstration {
    display: block;
    color: #8492a6;
    /*font-size: 14px;*/
    /*margin-bottom: 20px;*/
  }
  .font-color{
    height:20px;
  }
</style>
