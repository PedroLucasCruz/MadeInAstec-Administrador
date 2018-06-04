package com.adminportal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adminportal.domain.Book;
import com.adminportal.repository.BookRepository;
import com.adminportal.service.BookService;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookRepository bookRepository;
	
	public Book salvar(Book book) {
		return bookRepository.save(book);
	}
	
	public List<Book> encontrarTudo() {
		return (List<Book>) bookRepository.findAll();
	}
	
	public Book encontrarUm(Long id) {
		return bookRepository.findOne(id);
	}
	
	public void removerUm(Long id) {
		bookRepository.delete(id);
	}
}
