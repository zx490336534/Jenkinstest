@Library('extended-library') _
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
   }
}
