Bower ����


һ����װbower
1.��װnodejs    �ο���http://jingyan.baidu.com/article/b0b63dbfca599a4a483070a5.html
2.��װGit  �ο���http://jingyan.baidu.com/article/90895e0fb3495f64ed6b0b50.html

3.ʹ��npm ��װbower   -g ȫ�ְ�װ
����������룺npm install -g bower

������Ӳ������
1����дbower.json�ļ�,�ο���https://github.com/bower/spec/blob/master/json.md#name
2��bower install bootstrap --save  // ����



Grunt����

һ����װ  ���� nodejs npm
1.ȫ�ֻ����а�װ grunt-cli �� npm install -g grunt-cli 

����������װ�������
1.���� package.js�ļ���������npm init�����ο���http://www.gruntjs.net/getting-started

2.��װgrunt :npm install grunt --save-dev
3.��װjshint:npm install grunt-contrib-jshint --save-dev
4.��װ�������ο���http://www.gruntjs.net/plugins
5.��װgrunt-bower-task��npm install grunt-bower-task --save-dev
  gruntѹ������bower�����Ĳ�������bowerʹ��


����������Ŀ���
1.��������Gruntfile.js �ļ� , �ο���http://www.gruntjs.net/sample-gruntfile








�ġ�ע������
1.bower �����ʱ.bower.json�ļ�û������main�������û��������ȷ�ļ���
	���������
       	<1>.��Ҫ�޸�bower_components\bootstrap\.bower.json�ļ���mainֵ��

	<2> �����Ҫ���ö�Ӧ�Ķ���ļ������Ŀ¼��������޸�bower.json��
        ���磺 bootstrap bower ���ļ����ɰ���
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
  �Ƽ�������ʹ�õڶ��ַ���������⣬�Ͼ�bower.json����svn�ύ����bower_componentsĿ¼һ�㲻���ύ

2.bower����nice-validator��Ŀʱ��dist���ز�����������֣��������ý��������
  ���Լ�ȥgithub������һ��:https://github.com/niceue/nice-validator




	


 




















