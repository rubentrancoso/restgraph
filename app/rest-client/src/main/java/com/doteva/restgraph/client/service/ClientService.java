package com.doteva.restgraph.client.service;

import java.util.Map;
import java.util.Properties;

//import javax.annotation.PostConstruct;
//import javax.annotation.PreDestroy;
//import javax.inject.Inject;
//import javax.inject.Named;
//import javax.inject.Singleton;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
//import org.slf4j.Logger;

import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

//@Named
//@Singleton
public class ClientService {

	//@Inject
	//Logger log;
	
//	ClientConfig config;
//	Client client;
//
//	//@PostConstruct
//	void init() {
//		//log.info("@@@@ initializing Client");
//		config = new DefaultClientConfig();
//		client = Client.create(config);
//	}
//
//	//@PreDestroy
//	void shutdown() {
//		//log.info("@@@@ Destroying Client");
//	}
//	
//	public JSONObject get(String uri) {
//		//log.info("@@@@ Get");
//		WebResource webResource = client.resource(uri);
//		ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);
//		if (response.getStatus() != 200) {
//		   throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
//		}
//		JSONObject jsonObj = null;
//		try {
//			jsonObj = new JSONObject(response.getEntity(String.class));
//		} catch (ClientHandlerException | UniformInterfaceException | JSONException e) {
//			e.printStackTrace();
//		}
//		return jsonObj;
//	}
//
//	public JSONObject post(String uri, String input) {
//		WebResource webResource = client.resource(uri);
//		ClientResponse response = webResource.type("application/json").post(ClientResponse.class, input);
//
//		if (response.getStatus() != 200) {
//		   throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
//		}
//		JSONObject jsonObj = null;
//		try {
//			jsonObj = new JSONObject(response.getEntity(String.class));
//		} catch (ClientHandlerException | UniformInterfaceException | JSONException e) {
//			e.printStackTrace();
//		}
//		return jsonObj;
//	}	
//
//	public JSONObject post(String uri, Properties properties) {
//		WebResource webResource = client.resource(uri);
//		ClientResponse response = webResource.type("application/json").post(ClientResponse.class, properties2Json(properties));
//
//		if (response.getStatus() != 200) {
//		   throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
//		}	
//		JSONObject jsonObj = null;
//		try {
//			jsonObj = new JSONObject(response.getEntity(String.class));
//		} catch (ClientHandlerException | UniformInterfaceException | JSONException e) {
//			e.printStackTrace();
//		}
//		return jsonObj;
//	}
//
//	public JSONObject delete(String uri) {
//		WebResource webResource = client.resource(uri);
//		ClientResponse response = webResource.type("application/json").delete(ClientResponse.class);
//
//		if (response.getStatus() != 200) {
//		   throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
//		}
//		JSONObject jsonObj = null;
//		try {
//			jsonObj = new JSONObject(response.getEntity(String.class));
//		} catch (ClientHandlerException | UniformInterfaceException | JSONException e) {
//			e.printStackTrace();
//		}
//		return jsonObj;
//	}
//	
//	private String properties2Json(Properties properties) {
//		Map<Object, Object> meta = properties;
//		Gson input = new Gson();
//		return input.toJson(meta);		
//	}
	
//	
//
//	
//	public String delete(String uri) {
//		WebResource webResource = client.resource(uri);
//		ClientResponse response = webResource.type("application/json").delete(ClientResponse.class);
//
//		if (response.getStatus() != 200) {
//		   throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
//		}
//		String output = response.getEntity(String.class);
//		return output;
//	}	
//	
//	public String delete(String uri, String input) {
//		WebResource webResource = client.resource(uri);
//		ClientResponse response = webResource.type("application/json").delete(ClientResponse.class, input);
//
//		if (response.getStatus() != 200) {
//		   throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
//		}
//		String output = response.getEntity(String.class);
//		return output;
//	}		
	
}
