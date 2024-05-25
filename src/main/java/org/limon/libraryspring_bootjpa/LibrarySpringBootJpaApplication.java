package org.limon.libraryspring_bootjpa;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibrarySpringBootJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibrarySpringBootJpaApplication.class, args);
    }

    @PostConstruct
    public void init() {

    }

}
