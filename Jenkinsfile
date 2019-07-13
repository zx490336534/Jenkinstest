pipeline{
   agent {
      label 'mymac'
   }
   stages{
      stage('Example'){
         steps{
            withPythonEnv('/usr/local/bin/python3'){
               sh """
               python -m pip install pytest && 
               python -m pip install allure-pytest && 
               python -m pytest --alluredir=allure-results
               """
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