@Library('extended-library')
pipeline{
   agent any
   parameters {
      extendedChoice bindings: '', description: '', groovyClasspath: '', groovyScript: extended(), multiSelectDelimiter: ',', name: 'Policy', quoteValue: false, saveJSONParameterToFile: false, type: 'PT_JSON', visibleItemCount: 5
   }
   stages{
      stage('Example'){
         steps{
            withPythonEnv('/usr/bin/python'){
               sh 'python -m pip install pytest '
               sh 'python -m pip install allure-pytest'
               sh 'python -m pytest -v test_allure.py --alluredir=allure-results'
            }
            exit 0
         }
      }
   }
   post{
      always{
         allure includeProperties: false, jdk: '', results: [[path: 'allure-results']]
      }
   }
}