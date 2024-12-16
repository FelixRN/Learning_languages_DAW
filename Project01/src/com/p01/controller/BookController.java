package com.p01.controller;

import java.util.List;

import com.p01.model.IModel;
import com.p01.model.entities.Book;
import com.p01.model.repository.ModelDatabase;
import com.p01.model.repository.ModelMemory;

public class BookController {
	private IModel model;

	public BookController() {
		model = new ModelDatabase();
	}
	
	public List<Book> list() {
		List<Book> list = model.list();
		return list;
	}
	
	public Book add(String isbn, String title) {
		Book book = model.add(isbn, title);
		return book;
	}
}
