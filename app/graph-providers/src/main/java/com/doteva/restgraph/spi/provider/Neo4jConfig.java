package com.doteva.restgraph.spi.provider;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.doteva.restgraph.spi.Graph;

@Configuration
public class Neo4jConfig {

    @Bean
    @ConditionalOnProperty(name = "graph.spi", havingValue = "neo4j", matchIfMissing = true)
    public Graph neo4jGraphService() {
        return new Neo4j();
    }
	
}
