#!/usr/bin/env groovy

def myFunction() {
    echo "Building"
    echo "${WORKSPACE}"
    dir('Build'){
        sh 'cmake .. -G "MinGW Makefiles"'
        echo "${WORKSPACE}"
    }

    dir('Build'){
        sh 'make'
        echo "{WORKSPACE}"
    }
}