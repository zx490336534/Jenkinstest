pipeline{
   agent any
   stages{
      stage('Example'){
         steps{
            withPythonEnv('/usr/lib/python3'){
               sh 'pip install pytest && pip install allure-pytest && python -m pytest --alluredir=allure-results'
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