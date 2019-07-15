@Library('extended-library') _ 
//可以指定共享库在代码仓库中的版本 @Library('xxx@<version>') _
// version可以是分支，tag标签，git commit id
// 添加多个共享库 @Library(['a','b']) _ 
pipeline {
   agent any
   parameters {
      extendedChoice bindings: '', description: '', groovyClasspath: '', groovyScript: sayHello(), multiSelectDelimiter: ',', name: 'Policy', quoteValue: false, saveJSONParameterToFile: false, type: 'PT_JSON', visibleItemCount: 5
   }
   stages {
      stage('build') {
         steps{
            echo "Hello"
            }
      }
      stage('test') {
         steps{
            script {
               def util = new codes.showme.Utils()
               def v = util.getVersion("${BUILD_NUMBER}","${GIT_COMMIT}")
               echo "${v}"
            }
            }
      }
   }
}
