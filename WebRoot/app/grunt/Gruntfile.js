module.exports = function(grunt) {

 var pkg = grunt.file.readJSON('package.json');
 var rootPath='',buildPath='';

 var jsFiles=['Gruntfile.js'];
 

  grunt.initConfig({
	pkg: pkg,
	bower:{
		install: {
			options: {
				targetDir: './../lib',
				layout: 'byComponent',
				install: true,
				verbose: false,
				cleanTargetDir: false,
				cleanBowerDir: false,
				bowerOptions: {

				}
			}
		}
	},
    jshint: {
      files: jsFiles,
      options: {
        globals: {
          jQuery: true
        }
      }
    },
    watch: {
      files: ['<%= jshint.files %>'],
      tasks: ['jshint']
    }
  });





  grunt.loadNpmTasks('grunt-contrib-jshint');
  grunt.loadNpmTasks('grunt-contrib-watch');
  grunt.loadNpmTasks('grunt-bower-task');
  grunt.loadNpmTasks('grunt-contrib-sass');



  grunt.registerTask('default', ['jshint']);

  grunt.registerTask('wl', ['jshint','watch']);

  grunt.registerTask('init', ['bower']);
  
};