package com.adminportal.service;

import java.util.List;

import com.adminportal.domain.Book;

public interface BookService {
	
	Book salvar(Book book);

	List<Book> encontrarTudo(); 
	
	Book encontrarUm(Long id);
	
	void removerUm(Long id);
}
