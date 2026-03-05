pipeline
{
    agent {
        docker{
<<<<<<< HEAD
            image 'eclipse-temurin:11'
=======
            image 'openjdk:11'
>>>>>>> 474eb2fd0bd3b0dd72cc0d64ae69f1d1068f71f9
        }
    }
    environment
    {
        APP_NAME = "java-hello-world"
        VERSION = "1.0"
        DEVELOPER = "Hamza Shafiq"
    }
    stages
    {
        stage('Checkout Code')
        {
            steps
            {
                echo "Checking out code from Github."
                checkout scm
            }
        }
        stage('Compile')
        {
            steps
            {
                echo "Compiling Java code.."
                sh 'javac src/HelloWorld.java'
            }
        }
        stage('Run App')
        {
            steps
            {
                echo "Running Application"
                sh 'java -cp src HelloWorld'
            }
        }
    }
    post
    {
        success {echo "Build Successful! App is working!"}
        failure {echo "Build Failed! Check the logs!"}
        always {echo "Pipeline finished! Container destroyed!"}
    }
}