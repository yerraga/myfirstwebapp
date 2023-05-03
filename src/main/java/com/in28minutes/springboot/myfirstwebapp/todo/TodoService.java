package com.in28minutes.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class TodoService {

	private static List <Todo> todos = new ArrayList();
	
	static {
		todos.add(new Todo (1, "Ganesh", "Learn AWS", LocalDate.now().plusYears(1), false));
		todos.add(new Todo (2, "Ganesh", "Learn Devops", LocalDate.now().plusYears(2), false));
		todos.add(new Todo (3, "Ganesh", "Learn GCP", LocalDate.now().plusYears(3), false));
	}
	
	public List <Todo> findByUserName(String username){
		return todos;
	}
}
