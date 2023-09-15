#!/usr/bin/env groovy

def myFunction() {
    echo "Building ${WORKSPACE}"
    dir('Build'){
        sh 'cmake .. -G "MinGW Makefiles"'
    }

    dir('Build'){
        c:\MinGW\bin\mingw32-make.exe
    }
}