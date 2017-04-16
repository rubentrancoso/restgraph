# Spring boot rest + Angular + Neo4j
Simple Rest with angularjs and neo4j
                        
in 20 minutes install with arround 4 scripts you have a CentOS 7 box setup with:

   - [x] Nginx on port 80 443  (angular.doteva.com) serving a angular front
   - [x] Neo4J database ready  (neo.doteva.com) change password after install 
   - [x] Rest Server ready     (api.doteva.com/api/hello/folks)
   
 ## Installation procedure  

### on a fesh CentOS 7 create a buildhost.sh file with the same content of this same file from this repository
```
# yum install -y git 
# git clone https://github.com/rubentrancoso/restgraph.git
# cd restgraph
# ./install.sh
```

enjoy!

Change the hostnames according to your environment

### Roadmap

- automate certificate creationg and installation
- write neo4j boilerplate
- integrate scripts and extenalize hardcoded parameters

### for later

https://maxdemarzi.com/2014/03/10/its-over-9000-neo4j-on-websockets/

