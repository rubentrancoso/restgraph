package engine.controllers;

import java.io.InputStream;
import java.util.logging.Logger;

//import javax.enterprise.context.RequestScoped;
//import javax.inject.Inject;
//import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
c
import javax.ws.rs.core.Response;

//import com.app.service.TitanGraphService;


/**
 * JAX-RS Example
 * <p/>
 * This class produces a RESTful service to read/write the contents of the
 * members table.
 */
//@Path("/v1.0")
//@RequestScoped
public class UserServiceREST {

//	@Inject
//	private Logger log;
//
//	@Inject
//	@Named("titanGraphService")
//	private TitanGraphService titanGraphService;

//	// create a new entity
//	@POST
//	@Path("/{entity}")
//	@Consumes(MediaType.APPLICATION_JSON)
//	public Response create(@PathParam("entity") String entity, InputStream jsonData) {
//		log.info("creating " + entity);
//		JSONObject result = null;
//		result = titanGraphService.addVertexWithLabel(entity, jsonData);
//		return Response.status(200).entity(result.toString()).build();		
//	}
//	
//	// list entities
//	@GET
//	@Path("/{entity}")
//	@Produces(MediaType.APPLICATION_JSON)
//	public Response list(
//			@PathParam("entity") String entity, 
//			@DefaultValue("10") @QueryParam("limit") Integer limit, 
//			@DefaultValue("0") @QueryParam("offset") Integer offset,
//			@DefaultValue("") @QueryParam("orderby") String orderby
//			) {
//		log.info("listing " + entity);
//		JSONObject result = null;
//		result = titanGraphService.getVertexesWithLabel(entity, limit, offset);
//		return Response.status(200).entity(result.toString()).build();	
//	}
//
//	// list entity
//	@GET
//	@Path("/{entity}/{id}")
//	@Produces(MediaType.APPLICATION_JSON)
//	public Response list(@PathParam("entity") String entity, @PathParam("id") Integer id) {
//		log.info("listing " + entity);
//		JSONObject result = null;
//		result = titanGraphService.getVertexesById(entity, id);
//		return Response.status(200).entity(result.toString()).build();	
//	}
//	
//	// delete a entity
//	@DELETE
//	@Path("/{entity}/{id}")
//	@Produces(MediaType.APPLICATION_JSON)
//	public Response delete(@PathParam("entity") String entity, @PathParam("id") Integer id) {
//		log.info("delete " + entity + " " + id);
//		JSONObject result = null;
//		result = titanGraphService.deleteVertexById(entity, id);
//		return Response.status(200).entity(result.toString()).build();	
//	}
//	
//	// delete all entities from a given type
//	@DELETE
//	@Path("/{entity}")
//	@Produces(MediaType.APPLICATION_JSON)
//	public Response delete(@PathParam("entity") String entity) {
//		log.info("delete all " + entity);
//		JSONObject result = null;
//		result = titanGraphService.deleteAllVertexesWithLabel(entity);
//		return Response.status(200).entity(result.toString()).build();	
//	}
//	
//	// create graph index
//	@GET
//	@Path("/mixedindex/{indexName}/{propertyName}/{dataType}")
//	@Produces(MediaType.APPLICATION_JSON)
//	public Response addGraphMixedIndex(
//			@PathParam("indexName") String indexName,
//			@PathParam("propertyName") String propertyName,
//			@PathParam("dataType") String dataType
//			) {
//		log.info("adding graph mixed index  " + indexName);
//		JSONObject result = null;
//		result = titanGraphService.addGraphMixedIndex(indexName, propertyName, dataType);
//		return Response.status(200).entity(result.toString()).build();	
//	}
	
	
	//addGraphMixedIndex(String indexName, String propertyName, String dataType)

//	// upudate user
//	@PUT 
//	@Path("/users")
//	@Consumes(MediaType.APPLICATION_JSON)
//	@Produces(MediaType.APPLICATION_JSON)
//	public Response updateuser(@FormParam("email") String email) {
//		log.info("update users");
//		Response.ResponseBuilder builder = null;
//		//graphService.addUser("rubentrancoso@gmailcom");
//		builder = Response.ok();
//		return builder.build();
//	}
//	
//	// delete all users
//	@DELETE
//	@Path("/users")
//	@Consumes(MediaType.APPLICATION_JSON)
//	@Produces(MediaType.APPLICATION_JSON)
//	public Response deleteAllUser() {
//		log.info("delete all users");
//		graphService.removeAllUsers();
//		String result = "All users deleted";
//		return Response.status(200).entity(result).build();
//	}	
	
}
