#!/usr/bin/env groovy

def myFunction() {
    echo "Building"
    echo "{WORKSPACE}"
    dir('Build'){
        sh 'cmake ..'
        echo "{WORKSPACE}"
    }

    dir('Build'){
        sh 'make'
        echo "{WORKSPACE}"
    }
}