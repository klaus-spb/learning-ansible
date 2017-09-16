stage("asd"){
    node("master"){
        //println tool name: 'java 1.8', type: 'jdk'
        withEnv(["JAVA_HOME=${ tool 'java 1.8' }"]) {

            sh "java -version"

        }
        stage('Clone sources') {
            git branch: 'dev', credentialsId: 'github-klaus-spb', url: 'https://github.com/klaus-spb/ansible-configs.git'
        }

    }
}