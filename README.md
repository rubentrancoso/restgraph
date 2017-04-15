# Spring boot rest + Angular + Neo4j
Simple Rest with angularjs and neo4j
                        
in 20 minutes install with arround 4 scripts you have a CentOS 7 box setup with:

   - [x] Nginx on port 80 443  (angular.doteva.com) serving a angular front
   - [x] Neo4J database ready  (neo.doteva.com) change password after install 
   - [x] Rest Server ready     (api.doteva.com/api/hello/folks)
   
 ## Installation procedure  

### on a fesh CentOS 7 create a buildhost.sh file with the same content of this same file from this repository
```
# vi buildhost.sh
```
copy content from [buildhost.sh](infra/buildhost.sh) into 
```
# chmod +x buildhost.sh
# ./buildhost.sh
```
total time to run: 9 min

### from restgraph/infra/ run
```
# ./server.sh
# ./nginx.sh
```
total time to run: 2 and 9 min

### from restgraph/front run
```
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

