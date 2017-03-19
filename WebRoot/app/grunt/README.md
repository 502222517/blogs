# Bower 工具
一、安装bower
	1.安装nodejs    参考：http://jingyan.baidu.com/article/b0b63dbfca599a4a483070a5.html
	2.安装Git  参考：http://jingyan.baidu.com/article/90895e0fb3495f64ed6b0b50.html
	3.使用npm 安装bower   -g 全局安装
	打开命令窗口输入：npm install -g bower

二、添加插件依赖
	1、编写bower.json文件,参考：https://github.com/bower/spec/blob/master/json.md#name
	2、bower install bootstrap --save  // 下载


# Grunt工具
一、安装  依赖 nodejs npm
	1.全局环境中安装 grunt-cli ： npm install -g grunt-cli 

二、按需求安装依赖插件
	1.创建 package.js文件，（输入npm init），参考：http://www.gruntjs.net/getting-started
	2.安装grunt :npm install grunt --save-dev
	3.安装jshint:npm install grunt-contrib-jshint --save-dev
	4.安装其他：参考：http://www.gruntjs.net/plugins
	5.安装grunt-bower-task：npm install grunt-bower-task --save-dev
	  grunt压缩生成bower依赖的插件，配合bower使用
	  
三、配置项目打包
	1.创建创建Gruntfile.js 文件 , 参考：http://www.gruntjs.net/sample-gruntfile

四、注意事项
	1.bower 打包有时.bower.json文件没有配置main，打包后没有生成正确文件。
		解决方案：
	       	<1>.需要修改bower_components\bootstrap\.bower.json文件的main值。

	<2> 如果需要配置对应的多个文件，多个目录，则可以修改bower.json。
	        例如： bootstrap bower 按文件生成案例
		"dependencies": {
		    "jquery": "~2.2.2",
		    "bootstrap": "~3.3.6"
		  },
		  "exportsOverride": {
		    "bootstrap": {
		      "js": "dist/js/bootstrap.js",
		      "css": ["dist/css/bootstrap.css","dist/css/bootstrap-theme.css"],
		      "fonts": "dist/fonts/*"
		    }
		  }
  		推荐：建议使用第二种方案解决问题，毕竟bower.json方便svn提交，而bower_components目录一般不会提交

	2.bower下载nice-validator项目时，dist下载不完整，很奇怪，暂无良好解决方案。
  		先自己去github上下载一份:https://github.com/niceue/nice-validator
