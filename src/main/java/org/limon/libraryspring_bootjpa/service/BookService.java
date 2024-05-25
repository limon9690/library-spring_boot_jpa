package org.limon.libraryspring_bootjpa.service;

import org.limon.libraryspring_bootjpa.models.Book;
import org.limon.libraryspring_bootjpa.repo.BookRepository;

import java.util.List;

public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book save(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    public Book findById(Integer id) {
        return bookRepository.findById(id).orElse(null);
    }

    public void delete(Integer id) {
        bookRepository.deleteById(id);
    }

}
