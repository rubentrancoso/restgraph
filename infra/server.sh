#!/bin/bash

wget http://www-eu.apache.org/dist/maven/maven-3/3.3.9/binaries/apache-maven-3.3.9-bin.tar.gz
sudo tar xzf apache-maven-3.3.9-bin.tar.gz --directory /opt
sudo ln -s /opt/apache-maven-3.3.9 /opt/maven
rm -rf apache-maven-3.3.9-bin.tar.gz

sudo cat <<EOF>  /etc/profile.d/maven.sh
export M2_HOME=/opt/maven
export PATH=$M2_HOME/bin:${PATH}
EOF

source /etc/profile.d/maven.sh

adduser rest
sudo cp rest.service /usr/lib/systemd/system/
sudo systemctl enable rest.service
sudo systemctl daemon-reload
sudo systemctl stop rest.service

cd ./../backend
git pull origin master
mvn clean install
sudo mkdir /opt/server
sudo cp -R config /opt/server
sudo cp -R target/server-0.0.1-SNAPSHOT.jar /opt/server/server.jar

sudo firewall-cmd --zone=public --add-port=8080/tcp --permanent
sudo firewall-cmd --reload
sudo firewall-cmd --permanent --zone=public --list-all
sudo systemctl restart firewalld.service

sudo systemctl start rest.service
sudo systemctl status rest.service

git config --global user.email "rubentrancoso@gmail.com"
git config --global user.name "Ruben Trancoso"
git status
