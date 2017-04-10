#!/bin/bash
#
# yum install dos2unix -y; wget https://docs.google.com/document/d/18ADVMAbWn8zqPyy7T38JAn07RzpSOYwgIGBXUMr9QCQ/export?format=txt; mv export\?format\=txt neo4j-install.txt; dos2unix -n neo4j-install.txt neo4j-install.sh;chmod +x neo4j-install.sh; ./neo4j-install.sh

# Ruben Trancoso - 9/abril/2017

sudo systemctl enable firewalld.service
sudo systemctl start firewalld.service
# sleep 10s
sudo systemctl status firewalld.service
sudo yum update -y
sudo yum install git mlocate telnet dos2unix -y

cd /tmp
sudo wget http://debian.neo4j.org/neotechnology.gpg.key
sudo rpm --import neotechnology.gpg.key

sudo cat <<EOF>  /etc/yum.repos.d/neo4j.repo
[neo4j]
name=Neo4j Yum Repo
baseurl=http://yum.neo4j.org/stable
enabled=1
gpgcheck=1
EOF

sudo yum install neo4j -y
sudo rpm --nodeps -e java-1.8.0-openjdk-headless

cd ~
wget --no-cookies --no-check-certificate --header "Cookie: gpw_e24=http%3A%2F%2Fwww.oracle.com%2F; oraclelicense=accept-securebackup-cookie" "http://download.oracle.com/otn-pub/java/jdk/8u60-b27/jdk-8u60-linux-x64.rpm"
sudo yum localinstall jdk-8u60-linux-x64.rpm -y
rm ~/jdk-8u60-linux-x64.rpm


ETH0_IP=`ifconfig eth0 | grep 'inet ' | sed 's/ \+/,/g' | cut -d',' -f3`

sudo sed -i '/#dbms.connectors.default_advertised_address=localhost/a dbms.connectors.default_advertised_address='${ETH0_IP}'\ndbms.connector.bolt.address=0.0.0.0:7687\ndbms.connectors.default_listen_address=0.0.0.0' /etc/neo4j/neo4j.conf

sudo firewall-cmd --set-default-zone=public
sudo firewall-cmd --permanent --zone=public --change-interface=eth0
sudo firewall-cmd --zone=public --add-port=80/tcp --permanent
sudo firewall-cmd --zone=public --add-port=443/tcp --permanent
sudo firewall-cmd --zone=public --add-port=7474/tcp --permanent
sudo firewall-cmd --zone=public --add-port=7687/tcp --permanent
sudo firewall-cmd --reload
sudo firewall-cmd --permanent --zone=public --list-all


sudo systemctl enable neo4jhttps://github.com/rubentrancoso/restgraph.git
sudo systemctl start neo4j
sudo systemctl status neo4j

curl -sSL https://agent.digitalocean.com/install.sh | sh

sudo git clone https://github.com/rubentrancoso/restgraph.git

sudo updatedb
