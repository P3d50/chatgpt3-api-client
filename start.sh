#!/bin/bash

sudo apt-get update
sudo apt-get install docker.io
sudo docker build -t chatgpt3-api-client .
sudo docker run -dp 8082:8082 chatgpt3-api-client
sudo docker ps

