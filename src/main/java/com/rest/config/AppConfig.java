package com.rest.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({DaoConfig.class,WebConfig.class,ServiceConfig.class})
public class AppConfig {

	public AppConfig() {
		super();
	}



}
