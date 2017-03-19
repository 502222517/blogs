define(['jquery', 'Backbone', 'map'], function($, Backbone, map) {

    var Router = Backbone.Router.extend({
        routes: {
            '': 'home',
        },

        initialize: function() {
            //路由初始化可以做一些事
        },
        home: function() {
            //这里不能用模块依赖的写法，而改为url的写法，是为了grunt requirejs打包的时候断开依赖链，分开多个文件
            require([map.home], function(View) {
                // 切换视图
//              manager.instance().changeView(1);
//              var view = new View();
            });
        }
    });
    var router = new Router();
	
	//这里route是路由对应的方法名
    router.on('route', function(route, params) {
        console.log('hash change', arguments);
		// 路由监听
//		manager.instance().routeChange();
    });

    return router;
});
