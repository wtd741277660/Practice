// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
import 'element-ui/lib/theme-chalk/display.css'
import moment from 'moment'

//import ali iconfont
import './assets/iconfont/iconfont.css'

import axios from 'axios'

Vue.prototype.$http = axios
Vue.use(ElementUI)

Vue.config.devtools = true

Vue.config.productionTip = false

Vue.filter('moment', function (value, formatString) {
  formatString = formatString || 'YYYY-MM-DD HH:mm:ss';
  return moment(value).format("YYYY-MM-DD"); // value可以是普通日期 20170723
});

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})
