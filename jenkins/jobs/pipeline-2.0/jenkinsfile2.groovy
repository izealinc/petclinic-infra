
pipeline {
    agent any
    def rootDir = pwd()
    def ex = load "${rootDir}/ex.groovy"
    stages {
        stage ('Compile Stage') {

            steps {
                ex.printStr 'building petclinic project'
               // withMaven() {
                    bat 'mvn clean compile'
              //  }
            }
        }

        stage ('Testing Stage') {

            steps {
                ex.printStr('hello world')
               // withMaven() {
                    bat 'mvn test'
               // }
            }
        }


        stage ('Deployment Stage') {
            steps {
                echo 'hello world'
              //  withMaven() {
                    bat 'mvn deploy'
               // }
            }
        }
    }
}