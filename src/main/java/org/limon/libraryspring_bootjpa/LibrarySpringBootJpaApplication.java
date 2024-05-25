package org.limon.libraryspring_bootjpa;

import jakarta.annotation.PostConstruct;
import jakarta.persistence.EntityManager;
import org.limon.libraryspring_bootjpa.models.Author;
import org.limon.libraryspring_bootjpa.models.Book;
import org.limon.libraryspring_bootjpa.repo.AuthorRepository;
import org.limon.libraryspring_bootjpa.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class LibrarySpringBootJpaApplication {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public LibrarySpringBootJpaApplication(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(LibrarySpringBootJpaApplication.class, args);
    }

    @PostConstruct
    public void init() {
        Author author1 = new Author();
        author1.setName("author1");
        Book book1 = new Book();
        book1.setTitle("book1");
        List<Book> author1Books = new ArrayList<>();
        author1Books.add(book1);

        author1.setBooks(author1Books);
        book1.setAuthor(author1);

        authorRepository.save(author1);
        bookRepository.save(book1);



    }

}
