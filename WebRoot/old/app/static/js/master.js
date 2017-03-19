(function($,window){
	
	// nav data
	
	 
	$(function(){
		
		var headerComplete=function(){
			// 添加nav选中状态
			var tag=$('#main-menu');
			var pathname=window.location.pathname;
			var elemt=null;
			$('ul.menu>li',tag).each(function(i,v){
				var _url=$(this).find('a').attr('href');
				if(pathname.indexOf(_url)!=-1){
					elemt=$(this);
				}
			});
			if(!elemt.hasClass('nav-current')){
				$('ul.menu>li.nav-current',tag).removeClass('nav-current');
				elemt.addClass('nav-current');
			}
		}
		 
		// tmpl
		$('#master-header').load('master/header.tmpl',headerComplete);
		$('#master-sidebar').load('master/sidebar.tmpl');
		$('#master-footer').load('master/footer.tmpl');
		
		 
	});
	
	
})(jQuery,window)
