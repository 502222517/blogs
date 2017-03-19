(function(window, document){
    'use strict';

    var basis={
        tapName:('ontouchend' in window || 'MSPointerCancel' in window) ? "tap" : "click",
        stringify:function (record) {
            return encodeURIComponent(JSON.stringify(record));
        },
        parseJSON:function (str) {
            var record=null;
            str=decodeURIComponent(str);
            try{
                record=JSON.parse(str);
            }catch (e){
                console.log('parse error:',str);
            }
            return record || str;
        },
        navigate:function(_url,isReplace){
            var $this=this;
            //  添加随机数
            $this.setUrlParam(_url,'r',Math.random());
            if(isReplace){
                window.location.replace(_url);
            }else{
                window.location.href=_url;
            }
        },
        getUrlParam:function(name,_url){  //获取url参数
            var paramsText= _url ||  window.location.search;
            if(typeof name !=='undefined'){
                var regex = new RegExp("[\\?&]"+name+"=([^&#]*)&?",["i"]);
                var qs = regex.exec(paramsText);
                return qs ? qs[1] : '';
            }
            if(!paramsText.length){
                return {};
            }
            //获取所有参数
            var arrs=paramsText.substring(1).split('&'),param={},items;
            for(var i= 0,len=arrs.length;i<len;i++){
                items=arrs[i].split('=');
                param[items[0]]=items[1]
            }
            return param;
        },
        setUrlParam:function(url,name,value){  //设置url参数 存在替换，不存在添加
            var regex = new RegExp("([\\?&]"+name+"=)([^&#]*)&?",["i"])
                ,match = regex.exec(url)
                ,temp='',index=-1;

            if(match == null)
            {
                temp=(url.indexOf('?')>-1 ? '&':'?')+name+'='+value;
                return url.indexOf('#')>-1 ? url.replace('#',temp+'#') :url+temp;
            }
            else
            {
                return url.replace(regex,'$1' + value + '&');
            }
        },
        getSession:function(k){
            return window.sessionStorage.getItem(k);
        },
        setSession:function(k,v){
            window.sessionStorage.setItem(k,v);
        },
        removeSession:function(k){
            window.sessionStorage.removeItem(k);
        },
        setUidSession: function(id){
            this.setSession('uid', id);
        },
        getUidSession: function(){
            return this.getSession('uid');
        },
        setUserCache: function(key, value){
            if(this.getUidSession()){
                this.setSession('uid:' + this.getUidSession() + '-' + key, JSON.stringify(value));
            }
        },
        getUserCache: function(key){
            // uid存在且是登录状态
            if(this.getUidSession()){
                var data = this.getSession('uid:' + this.getUidSession() + '-' + key);
                if(data && data != 'undefined'){
                    try {
                        data =JSON.parse(data);
                    }catch(e){ }

                   return data;
                }
            }
        }
    };  //

    basis.date={
        leftZero:function (num) {
            if(num < 10){
                num = '0' + num;
            }
            return num;
        },
        getDates:function (timestamp) { // [yyyy,mm,dd,HH,MM,SS]
            var leftZero = this.leftZero;
            var date = new Date(timestamp);
            return [date.getFullYear() , leftZero((date.getMonth() + 1)), leftZero(date.getDate()) , leftZero(date.getHours()) , leftZero(date.getMinutes()) , leftZero(date.getSeconds())];
        },
        format:function (timestamp,format) {
            var $this=this;
            var format=format || 'YYYY-mm-dd HH:MM:SS';
            var dates=$this.getDates(timestamp);
            format=format.replace(/YYYY/g,dates[0]);
            format=format.replace(/mm/g,dates[1]);
            format=format.replace(/dd/g,dates[2]);
            format=format.replace(/HH/g,dates[3]);
            format=format.replace(/MM/g,dates[4]);
            format=format.replace(/SS/g,dates[5]);
            return format;
        }
    }  //  date end

    basis.dom={
        getTmpl:function(tmpl,id){
            var regex=new RegExp('<script[^>]*?id="'+id+'"[^>]*?>([\\s\\S]*?)<\/script>','gim');
            var _html='';
            var arrs= regex.exec(tmpl);
            if(arrs){
                _html=arrs[1] || '';
            }
            return _html;
        }
    }  // dom end

    basis.tel={
        format:function(tel,connect){
            var arrs=[],connect=connect || ' ';
            if(!tel) return '';
            tel=tel.replace(/\s/g,'');
            arrs.push(tel.substring(0,3));
            arrs.push(tel.substring(3,7));
            arrs.push(tel.substring(7,11));
            return arrs.join(connect).trimRight();
        },
        install:function (tag) {
            var $this=this;
            tag.on('keydown',function(e){
                // 48-57 96-105  8 46
                var code=e.keyCode;
                if((code>=48 && code<=57) || (code>=96 && code<=105) || code==8  || code==13 || code==116){
                    return true;
                }
                return false;
            }).on('input',function(){
                var tel=$(this).val();
                $(this).val($this.format(tel));
            });
        },
        uninstall:function (tag) {
            tag.off('keydown').off('input');
        },
        trim:function (tel) {  // 152 7080 0388 ==> 15270800388
            return tel.replace(/\s/g,'');
        }
    } // basis.tel end
    
   









    window.basis=basis;
})(window, document);