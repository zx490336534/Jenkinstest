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
               sh "${CC} ${DEBUG_FLAGS}"
               sh "printenv"
            }
         }
      }
   }
}