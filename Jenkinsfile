pipeline {
 
 agent any
 
 stages{
  
  stage ("Checkout") {
   
   steps {
   
    checkout scm
    
    echo "M2_HOME = ${M2_HOME}"
    
    echo "PATH = ${PATH}"

   }
  
  }
  
  stage("Build Project") {
	
   steps {

    sh "mvn clean install"
    
   }	
  
  }
 
 }

}