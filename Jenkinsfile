pipeline{
   agent any
   stages{
      stage('Example'){
         steps{
            script{
               def browsers = ['chrome','firefox']
               for (int i = 0; i < browsers.size(); ++i){
                  println "Testing the $(browsers[i]) browsers"
               }
            }
         }
      }
   }
}