package org.limon.libraryspring_bootjpa.repo;

import org.limon.libraryspring_bootjpa.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
