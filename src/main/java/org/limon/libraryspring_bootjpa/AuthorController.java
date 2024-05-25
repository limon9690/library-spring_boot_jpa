package org.limon.libraryspring_bootjpa;

import org.limon.libraryspring_bootjpa.models.Author;
import org.limon.libraryspring_bootjpa.repo.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authors")
public class AuthorController {
    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }
    public Iterable<Author> getAuthors() {
        return authorRepository.findAll();
    }
}
