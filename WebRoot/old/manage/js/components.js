(function(window, document){
    'use strict';

    var components={};

    var alert={
        options:{
            title:'温馨提示',
            content:'',
            btnText:'知道了'
        },
        initialize:function () {
            var $this=this;
            $this.$el = $('#app-alert');
            if (!$this.$el.length) {
                $this.$el = $('<div id="app-alert"><div class="alert-main"><div class="alert-content"><div class="box"><div class="alert-img"><strong class="plaint">!</strong></div><div class="flex-1"><h3 class="alert-title"></h3></div></div><div class="alert-text"></div></div><div class="alert-foot"></div></div></div>');
                $('body').append($this.$el);
                $this.addEvent();
            }
        },
        addEvent:function () {
            var $this=this;
            $('.alert-foot',$this.$el).on(basis.tapName,function (e) {
                $this.hide();
            });
            $this.$el.on(basis.tapName,function (e) {
                if(e.target.id=='app-alert') $this.hide();
            });
        },
        show:function (ops,callback) {
            var $this=this;
            var options=$.extend({},$this.options,ops);
            $this.callback=callback;
            $this.initialize();
            $('.alert-title',$this.$el).text(options.title);
            $('.alert-text',$this.$el).text(options.content);
            $('.alert-foot',$this.$el).text(options.btnText);
            $this.$el.show();
        },
        hide:function () {
            var $this=this;
            $this.$el.hide();

            $this.callback && $this.callback();
            $this.callback=null;
        }
    };  // alert

    components.alert=function (content) {
        alert.show({content:content});
    };
    components.prompt=function (ops,callback) {
        alert.show(ops,callback);
    };



    window.components=components;
})(window, document);


