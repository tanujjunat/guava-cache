package com.caching.guavacache.repository;

import com.caching.guavacache.pojo.Book;

public interface BookRepository {

	  Book getByIsbn(String isbn);

	}
