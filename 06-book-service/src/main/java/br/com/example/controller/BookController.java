package br.com.example.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.example.model.Book;
import br.com.example.repository.BookRepository;

@RestController
@RequestMapping("book-service")
public class BookController {
	
	@Autowired
	private Environment environment;
	
	@Autowired
	private BookRepository repository;
	
	@GetMapping(value = "/{id}/{currency}")
	public Book findBook(@PathVariable("id") Long id,
			@PathVariable("currency") String currency) {
		
		//acessar o bd e retornar o obj como está no banco, ainda sem converter dolar para real
		var book = repository.getById(id);
		if (book == null) throw new RuntimeException("Book not found");
		
		var port = environment.getProperty("local.server.port");
		book.setEnvironment(port);
		
		return book;
	}
}
