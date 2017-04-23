package com.doteva.restgraph.spi.provider;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.doteva.restgraph.spi.Graph;

@Configuration
public class OrientDBConfig {

    @Bean
    @ConditionalOnProperty(name = "graph.spi", havingValue = "orientdb", matchIfMissing = true)
    public Graph orientDBGraphService() {
        return new OrientDB();
    }
	
}
