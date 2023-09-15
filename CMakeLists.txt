cmake_minimum_required(VERSION 3.0.0)
project(Jenkins VERSION 0.1.0 LANGUAGES C CXX)

include(CTest)
enable_testing()

set(SOURCE_FILES
    src/main.cpp
)
add_executable(Jenkins ${SOURCE_FILES})

set(CPACK_PROJECT_NAME ${PROJECT_NAME})
set(CPACK_PROJECT_VERSION ${PROJECT_VERSION})
include(CPack)
