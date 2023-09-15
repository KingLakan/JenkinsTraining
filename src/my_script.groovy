#!/usr/bin/env groovy

def myFunction() {
    echo "Building"
    dir('Build'){
        sh 'cmake ..'
    }

    dir('Build'){
        sh 'make'
    }
}