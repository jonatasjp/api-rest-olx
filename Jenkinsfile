pipeline {
 
 agent any
 
 stages{
  
  stage ("Checkout") {
   
   steps {
   
    scm {
     git {
        remote {
            url("https://github.com/jonatasjp/api-rest-olx")
            branch("*/master")
        }
        extensions {
            localBranch("master")
        }
     }
    }
    
   }
  
  }
  
  stage("Build Project") {
	
   steps {

    bat 'mvn clean install -DskipTests'
    
   }	
  
  }
 
 }

}