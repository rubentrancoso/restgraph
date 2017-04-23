package com.doteva.restgraph.front.controller;

import org.springframework.http.MediaType;
import javax.ws.rs.core.Response;

//import org.neo4j.driver.v1.Record;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.doteva.restgraph.spi.Graph;

//import client.ClientService;
////import main.controllers.SimpleController;
//import service.GraphService;

@RestController
@EnableAutoConfiguration
public class GraphController {

	
	@Autowired
	Graph graphService;
	
//	@Autowired
//	Graph graphService;

//	@Autowired
//	GraphService graphService;
//	
//	@Autowired
//	ClientService clientService;
	
	private static final Logger logger = LoggerFactory.getLogger(GraphController.class);

	// create a new entity
//	@POST
//	@Path("/{entity}")
//	@Consumes(MediaType.APPLICATION_JSON)
//	public Response create(@PathParam("entity") String entity, InputStream jsonData) {
//		logger.info("creating " + entity);
//		JSONObject result = null;
//		result = graphService.addVertexWithLabel(entity, jsonData);
//		return Response.status(200).entity(result.toString()).build();
//	}	
	
	// create a new entity
	//@GET
	//@Path("/teste/{entity}")
	//@Produces(MediaType.APPLICATION_JSON)
	
//    @RequestMapping(value = "/factory/create/{entity}", produces = MediaType.APPLICATION_JSON)
//	@ResponseBody	
//	public Response create(@PathVariable("entity") String entity) {
//    	logger.info("/factory/create/" + entity);
////		Record result = graphService.addVertexWithLabel(entity);
//		//return Response.status(200).entity(result).build();
//		return Response.status(200).build();
//	}
    
    @RequestMapping(value = "/factory/wipe", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody	
	public Response wipe() {
		logger.info("/factory/wipe");
		graphService.wipedata();
		return Response.status(200).build();
	}    

}
