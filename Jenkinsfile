pipeline{
   agent any
   stages{
      stage('Example'){
         steps{
            withPythonEnv('/usr/bin/python'){
               sh 'python -m pip install pytest '
               sh 'python -m pip install allure-pytest'
               sh 'python -m pytest --alluredir=allure-results'
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