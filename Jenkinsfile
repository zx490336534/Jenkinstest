pipeline{
   agent any
   parameters {
      string defaultValue: 'none', description: '字符串', name: 'D_ENV', trim: true
      text defaultValue: 'a\nb\nc\n', description: '文本', name: 'D_TEXT'
      choice choices: 'a\nb\nc\n', description: '选一个', name: 'D_CHOICE'
      booleanParam defaultValue: false, description: '布尔值参数', name: 'FLAG'
      password name: 'PASSWORD',defaultValue:'SECRET',description: 'password'
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