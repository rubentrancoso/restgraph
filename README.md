# Spring boot rest + Angular + Neo4j
Simple Rest with angularjs and neo4j
                        
in 20 minutes install with one script you have a CentOS 7 box setup with:

   - [x] Nginx on port 80 443  (angular.doteva.com) serving a angular front
   - [x] Neo4J database ready  (neo.doteva.com) change password after install 
   - [x] Rest Server ready     (api.doteva.com/api/hello/folks)
   - [x] SSL Certificates installed
   
## Installation procedure  

### on a fesh CentOS 7 from /root
```
# yum install -y git 
# git clone https://github.com/rubentrancoso/restgraph.git
# cd restgraph
```
REVIEW PARAMETERS file and than
```
# ./install.sh
```

enjoy!

Change the hostnames according to your environment

### Roadmap

- fix websocket communication with neo4j
- write neo4j boilerplate
- autorenew certificate
- api authentication

### for later

https://maxdemarzi.com/2014/03/10/its-over-9000-neo4j-on-websockets/

