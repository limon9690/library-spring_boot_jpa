package org.limon.libraryspring_bootjpa.service;

import org.limon.libraryspring_bootjpa.models.Author;
import org.limon.libraryspring_bootjpa.repo.AuthorRepository;

import java.util.List;

public class AuthorService {
    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author save(Author author) {
        return authorRepository.save(author);
    }

    public Author findById(Integer id) {
        return authorRepository.findById(id).orElse(null);
    }

    public List<Author> findAll() {
        return authorRepository.findAll();
    }

    public void delete(Integer id) {
        authorRepository.deleteById(id);
    }
}
