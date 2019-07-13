pipeline{
   agent any
   environment {
      CC = 'clang'
   }
   stages{
      stage('Example'){
         environment {
            DEBUG_FLAGS = '-g'
         }
         steps{
            script{
               echo "${env.g_name}"
            }
         }
      }
   }
}