pipeline{
   agent any
   stages{
      stage('Example'){
         steps{
            withPythonEnv('/usr/lib/python3'){
               sh 'pip install pytest'
               sh 'pip install allure-pytest'
               sh 'pytest --alluredir=allure-results'
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