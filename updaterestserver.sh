#!/bin/bash
cd app
git pull
mvn clean install
sudo cp -R rest-front/config /opt/server
sudo cp -R rest-front/target/rest-front-0.0.1-SNAPSHOT.jar /opt/server/server.jar

sudo systemctl start rest.service
sudo systemctl status rest.service
