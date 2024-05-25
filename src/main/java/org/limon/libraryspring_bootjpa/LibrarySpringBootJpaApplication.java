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
import java.util.Optional;


@SpringBootApplication
public class LibrarySpringBootJpaApplication {



    public static void main(String[] args) {
        SpringApplication.run(LibrarySpringBootJpaApplication.class, args);
    }

    @PostConstruct
    public void init() {

    }

}
