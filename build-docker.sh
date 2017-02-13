#!/bin/bash

set -e

mvn clean test package
sudo docker build -t java-api-guidelines .
