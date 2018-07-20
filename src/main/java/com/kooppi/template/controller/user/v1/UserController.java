package com.kooppi.template.controller.user.v1;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.kooppi.template.controller.user.IUserController;
import com.kooppi.template.model.user.IUserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;

@Path("/v1/hello")
@Api(value="/v1/hello")
public class UserController implements IUserController {

	@Inject
	@Named("UserServiceV1") 
	IUserService service;
	
	@GET
	@Produces("text/plain")
    @ApiOperation(value="Get hello world", httpMethod = "GET", response=String.class)
    @ApiResponse(code=200, message="Success to get the response")
	@Inject
    public String sayHelloWorld() {
        return "Hello world_" + service.getUserName();
    }   
 
	@GET
    @Path("/{name}")
	@Produces("text/plain")
    @ApiOperation(value="Get hello world", httpMethod = "GET", response=String.class)
    @ApiResponse(code=200, message="Success to get the response")
    public String sayHello(@PathParam("name") String name) {
        return "Hello, " + name;
    }
}
