package com.kooppi.template.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("rest")
public class MyResourceConfig extends ResourceConfig {
	
    public MyResourceConfig(){
    	register(new MyApplicationBinder());
        packages("com.kooppi.template");
    }
    
}
