// vars/evenOrOdd.groovy
def call(int buildNumber) {
    def props = readJSON file: 'pipeline.json'
    if (buildNumber % 2 == 0) {
        pipeline {
            agent any
            stages {
                stage('Even Stage') {
                    steps {
                        echo "${props.name}"
                    }
                }
            }
        }
    } else {
        pipeline {
            agent any
            stages {
                stage('Odd Stage') {
                    steps {
                        echo "The build number is odd"
                    }
                }
            }
        }
    }
}