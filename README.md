# Spring boot rest + Angular + Neo4j
Simple Rest with angularjs and neo4j
                        
in 20 minutes install with one script you have a CentOS 7 box setup with:

   - [x] Nginx on port 80 443  (http://angularjs.doteva.com) serving a angular front
   - [x] Neo4J database ready through SPI (http://neo4j.doteva.com) change password after install 
   - [x] Rest Server ready     (http://restapi.doteva.com/api/hello/folks)
   - [x] SSL Certificates installed
   
## Installation procedure  

### on a fesh CentOS 7 from /root
```
# yum install -y git 
# git clone https://github.com/rubentrancoso/restgraph.git
# cd restgraph
# git checkout develop
# git branch
```
REVIEW PARAMETERS file and then
```
# ./install.sh
```
all commands in one line
```
# yum install -y git; git clone https://github.com/rubentrancoso/restgraph.git; cd restgraph; git checkout develop; git branch; ./install.sh
```

enjoy!

Change the hostnames according to your environment

### Roadmap

- enable acme-challenge
- ~~autorenew certificate~~
- ~~fix websocket communication with neo4j~~
- ~~write neo4j boilerplate~~
- api authentication (Oauth)

### Other future topics

- spring cloud contract
- ~~fix workflow when changing remote files~~
- reactjs
- micro services architecture
- custom neo4j database path

https://maxdemarzi.com/2014/03/10/its-over-9000-neo4j-on-websockets/

