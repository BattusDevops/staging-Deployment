pipeline {
   agent any 
   stages {
     stage('Init') {
         steps
           {
              echo 'hi this is srinivas self learn'
              echo 'fuck off'    
           }
           }
     stage('Build') {
         steps {
              echo 'Builiding simple maven project'
           } 
           }
     stage('Deploy') {
         steps {
              echo 'Deploy in staging area'
            }
            }
            }
            }
