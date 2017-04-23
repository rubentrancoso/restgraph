package com.doteva.restgraph.spi.provider;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.codehaus.jettison.json.JSONObject;
import org.neo4j.driver.v1.AuthTokens;
import org.neo4j.driver.v1.Driver;
import org.neo4j.driver.v1.GraphDatabase;
import org.neo4j.driver.v1.Record;
import org.neo4j.driver.v1.Session;
import org.neo4j.driver.v1.StatementResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
public class GraphService {

	private Driver driver;

	public GraphService() {
		driver = GraphDatabase.driver( "bolt://localhost:7687", AuthTokens.basic( "neo4j", "123456" ) );;
	}
	
	private static final Logger logger = LoggerFactory.getLogger(GraphService.class);

	// public void teste() {
	// Driver driver = GraphDatabase.driver("bolt://localhost:7687",
	// AuthTokens.basic( "neo4j", "123456" ) );
	// Session session = driver.session();
	//
	// session.run( "CREATE (a:Person {name: {name}, title: {title}})",
	// parameters( "name", "Arthur", "title", "King" ) );
	//
	// StatementResult result = session.run( "MATCH (a:Person) WHERE a.name =
	// {name} " +
	// "RETURN a.name AS name, a.title AS title",
	// parameters( "name", "Arthur" ) );
	//
	// while ( result.hasNext() )
	// {
	// Record record = result.next();
	// System.out.println( record.get( "title" ).asString() + " " + record.get(
	// "name" ).asString() );
	// }
	//
	// session.close();
	// driver.close();
	// }

	public Record addVertexWithLabel(String entity) {
		Session session = driver.session();
		StatementResult result;
		session.run("CREATE (a:"+ entity + " {name:'Juca',idade:'3'})");
		result = session.run("Match (n:"+ entity + ") Return { id: ID(n), name: n.name } Order by n.created_at desc Limit 1");
		
		Record record = null;
		while (result.hasNext()) {
			record = result.next();
		}
		session.close();
		return record;
	}

	public void wipedata() {
		Session session = driver.session();
		logger.info("MATCH (n) DETACH DELETE n");
		session.run("MATCH (n) DETACH DELETE n");
		session.close();
	}
}
