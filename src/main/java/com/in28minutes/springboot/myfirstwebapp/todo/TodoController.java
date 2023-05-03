package com.in28minutes.springboot.myfirstwebapp.todo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoController {

	private TodoService todoService;
	public TodoController(TodoService todoService) {
		super();
		this.todoService = todoService;
	}
	@RequestMapping("list-todo")
	public String listAllTodo(ModelMap model) {
		List<Todo> todos =  todoService.findByUserName("Ganesh");
		model.addAttribute("todos", todos);
		return "listTodo";
	}
	
}
