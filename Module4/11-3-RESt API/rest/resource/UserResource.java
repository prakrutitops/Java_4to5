package com.kb.rest.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.kb.model.User;
import com.kb.service.UserService;

@Path("/userInfo")
public class UserResource 
{
	UserService userService = new UserService();

	// CRUD -- CREATE operation
	@POST
	@Produces(MediaType.TEXT_XML)
	@Consumes(MediaType.APPLICATION_XML)
	public User createUser(User user) {
		User userResponse = userService.createUser(user);
		return userResponse;
	}

	// CRUD -- READ operation
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<User> getAllUsers() {
		List<User> userList = userService.getAllUsers();
		return userList;
	}

	// CRUD -- READ operation
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_XML)
	public User getUserForId(@PathParam("id") String id) {
		User user = userService.getUserForId(id);
		return user;
	}

	// CRUD -- UPDATE operation
	@PUT
	@Produces(MediaType.TEXT_XML)
	@Consumes(MediaType.APPLICATION_XML)
	public User updateUser(User user) {
		User userResponse = userService.updateUser(user);
		return userResponse;
	}

	// CRUD -- DELETE operation
	@DELETE
	@Path("/{id}")
	@Produces(MediaType.TEXT_XML)
	public User deleteeUser(@PathParam("id") String id) {
		User userResponse = userService.deleteUser(id);
		return userResponse;
	}
}
