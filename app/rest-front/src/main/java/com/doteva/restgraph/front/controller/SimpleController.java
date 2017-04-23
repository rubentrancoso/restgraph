package com.doteva.restgraph.front.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

@RestController
@EnableAutoConfiguration
public class SimpleController {

    private static final Logger logger = LoggerFactory.getLogger(SimpleController.class);

    @RequestMapping(value = "/hello/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	Map<String, Object> recommend(@PathVariable("name") String name) {
		logger.info("processing request");

        Map<String, Object> response = new HashMap<String, Object>();
        try {
        	response.put("result","Hello " + name);
            response.put("status", "success");
        } catch (Exception e) {
            logger.error("Error occurred while trying to process api request", e);
            response.put("status", "fail");
        }

        return response;
    }


}