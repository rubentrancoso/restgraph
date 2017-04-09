#!/bin/bash
sudo systemctl daemon-reload
sudo systemctl stop rest.service

cd /home/baduga/source/vanhackathon2017/backend
git pull origin develop
mvn clean install
sudo cp -R config /opt/server
sudo cp -R target/coursebuilder-0.0.1-SNAPSHOT.jar /opt/server/server.jar

sudo systemctl start rest.service
sudo systemctl status rest.service

git status
