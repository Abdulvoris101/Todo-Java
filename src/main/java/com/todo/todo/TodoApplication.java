package com.todo.todo;

import com.todo.todo.annotations.Print;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication {

	@Print(value = "Hello world")
	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

}
