#!/bin/sh

echo $PWD
mvn clean install -U package
echo 'Package was created successfully.'
docker image build -t order-management-app .
echo 'Package was dockerized successfully.'
docker-compose up
