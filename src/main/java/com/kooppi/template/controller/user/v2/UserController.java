package com.kooppi.template.controller.user.v2;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.kooppi.template.model.user.IUserService;

@Path("/v2/hello")
public class UserController /*implements IUserController*/ {

	@Inject
	@Named("UserServiceV2") 
	IUserService service;

	@GET
    public String sayHelloWorld() {
        return "Hello world_" + service.getUserName();
    }   
 
	@GET
    @Path("/{name}")
    public String sayHello(@PathParam("name") String name) {
        return "Hello, " + name;
    }
}
