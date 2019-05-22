pipeline {
 
 agent any
 
 stages{
  
  stage ("Checkout") {
   
   steps {
   
    checkout scm
    
   }
  
  }
  
  stage("Build Project") {
	
   steps {

    bat 'mvn clean install -DskipTests'
    
   }	
  
  }
 
 }

}