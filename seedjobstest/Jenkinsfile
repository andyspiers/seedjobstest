#!/usr/bin/env groovy
pipeline {
  agent any
  options {
    buildDiscarder(logRotator(numToKeepStr: '15'))
  }

  stages {
    stage('Build  Jenkins job item') {
      // agent {
      //   label 'seedjobsonly'
      // }
      steps {
        script {
          if ( env.BRANCH_NAME == 'master' ) {
            checkout scm
            jobDsl targets: ['folders/*.groovy', 'jobs/**/*.groovy'].join('\n'), removedJobAction: 'DELETE'
          }
          else {
            println "Not on master branch - doing nothing."
          }
        }
      }
    }
  }
}
