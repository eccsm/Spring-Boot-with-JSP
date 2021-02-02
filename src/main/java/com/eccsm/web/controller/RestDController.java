package com.eccsm.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eccsm.web.model.ToDo;
import com.eccsm.web.service.ToDoService;

@RestController
public class RestDController {
	@Autowired
	private ToDoService service;

	@RequestMapping(value = "/rest/todos", method = RequestMethod.GET)
	public List<ToDo> listAllTodos() {
		List<ToDo> users = service.retrieveTodos("in28Minutes");
		return users;
	}
	
	@RequestMapping(value = "/rest/todos/{id}", method = RequestMethod.GET)
    public ToDo retrieveTodo(@PathVariable("id") int id) {
        return service.retrieveTodo(id);
    }

}
