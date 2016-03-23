# 请先安装 node
请自行安装node

# 安装grunt
npm install -g grunt-cli

# 安装bower
npm install -g bower

# 安装grunt和bower依赖文件

npm install
bower install

> 友情提示:
	1. bower.json 作为bower包管理文件,负责项目类库的依赖
	2. package.json 作为npm包管理器,负责grunt打包等事项
	
	以上bower和npm分工协作

	使用帮助:
		如需要新增项目依赖的类库,执行bower install 类库名 --save
		如新增grunt相关,执行npm install grunt插件名 --save-dev
		
		
	注意：bower 管理的iscroll 有个bug（会将所有文件拷贝），修复如下：
	bower_components/iscroll/.bower.json 添加字段： "main": "build/*", 	

static_template 静态页面的切图 样式直接引用build/css/style.css
bulid 目录为构建后的项目代码
