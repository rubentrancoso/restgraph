package com.doteva.restgraph.spi.provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.doteva.restgraph.spi.Graph;

public class OrientDB implements Graph {

	private static final Logger logger = LoggerFactory.getLogger(OrientDB.class);
	
	public OrientDB() {
		logger.info("provider instantiated");
	}
	
	@Override
	public void wipedata() {
		logger.info("wipedata");
	}

}
