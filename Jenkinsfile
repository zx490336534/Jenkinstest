pipeline{
   agent any
   stages{
      stage('Example'){
         steps{
            withPythonEnv('/usr/local/bin/python3'){
               sh 'pip install pytest'
               sh 'pip install allure-pytest'
               sh 'pytest --alluredir=allure_results'
            }
         }
      }
   }
}