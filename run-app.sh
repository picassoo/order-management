#!/bin/sh
cd order-management
echo $PWD
mvn clean install -U package
echo 'Package was created successfully.'
cd ..
docker image build -t order-management-app .
echo 'Package was dockerized successfully.'
docker-compose up
