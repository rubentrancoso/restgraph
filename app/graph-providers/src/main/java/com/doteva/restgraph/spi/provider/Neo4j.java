package com.doteva.restgraph.spi.provider;

import org.neo4j.driver.v1.AuthTokens;
import org.neo4j.driver.v1.Driver;
import org.neo4j.driver.v1.GraphDatabase;
import org.neo4j.driver.v1.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.doteva.restgraph.spi.Graph;

public class Neo4j implements Graph {

	private Driver driver;

	private static final Logger logger = LoggerFactory.getLogger(Neo4j.class);

	public Neo4j() {
		logger.info("provider instantiated");
		driver = GraphDatabase.driver( "bolt://localhost:7687", AuthTokens.basic( "neo4j", "123456" ) );;
	}
	
	@Override
	public void wipedata() {
		logger.info("wipedata");
		Session session = driver.session();
		logger.info("MATCH (n) DETACH DELETE n");
		session.run("MATCH (n) DETACH DELETE n");
		session.close();
	}	

}
