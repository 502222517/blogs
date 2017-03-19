require(['map'], function(map){
	require.config({
		urlArgs: 'version=1',
baseUrl:"./",
		paths : map,
		shim : {
			'underscore': {
	            exports: '_'
	        },
	        'jquery': {
	            exports: '$'
	        },
		    'Backbone': {
				deps: ['underscore','jquery'], 
				exports: 'Backbone'
			},
		    'cookie': {
				deps: ['jquery']
			},
			'iscrollComponent':{
				deps: ['iscroll']
			}
		}
	});
	// 
	require([ 'jquery','underscore','Backbone','router', 'basis'], function($,_,Backbone,router, wxApi, basis){
		// 开始
		Backbone.history.start();
	});
});




