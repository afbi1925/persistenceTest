package com.kooppi.template.config;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import io.swagger.jaxrs.config.BeanConfig;

 
@ApplicationPath("swagger")
public class MyApplication extends Application { //ResourceConfig{
	
    public MyApplication(){
        //http://localhost:8080/TemplateWebAPI/swagger/swagger.json
        //https://github.com/swagger-api/swagger-core/wiki/Swagger-Core-RESTEasy-2.X-Project-Setup-1.5#using-the-application-class
    	BeanConfig beanConfig = new BeanConfig();
        beanConfig.setVersion("1.0.2");
        beanConfig.setSchemes(new String[]{"http"});
        beanConfig.setHost("localhost:8080");
        beanConfig.setBasePath("/TemplateWebAPI");
        beanConfig.setResourcePackage("com.kooppi.template.controller");
        beanConfig.setScan(true);
    }

}
