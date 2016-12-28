/*
* gulp 打包配置
* gulp wl  开发watch模式
* gulp pro 发布
*/
var gulp =require('gulp');
var sass = require('gulp-sass');

// 清除
gulp.task('clear',function () {

});
//
gulp.task('sass',function () {
    return gulp.src(['../sass/**/*.scss','!../sass/variables.scss','!../sass/mixin.scss'])
        .pipe(sass().on('error', sass.logError))
        .pipe(gulp.dest('../css'));
});

 

gulp.task('default',['sass']);