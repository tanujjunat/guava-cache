package com.caching.guavacache.repository;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.caching.guavacache.pojo.Book;

@Component
public class SimpleBookRepository implements BookRepository {

  @Override
  @Cacheable("bookData")
  public Book getByIsbn(String isbn) {
    simulateSlowService();
    return new Book(isbn, "Some book");
  }

  // Don't do this at home
  private void simulateSlowService() {
    try {
      long time = 3000L;
      Thread.sleep(time);
    } catch (InterruptedException e) {
      throw new IllegalStateException(e);
    }
  }

}
