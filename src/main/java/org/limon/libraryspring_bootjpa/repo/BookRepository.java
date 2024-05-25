package org.limon.libraryspring_bootjpa.repo;

import org.limon.libraryspring_bootjpa.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
