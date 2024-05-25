package org.limon.libraryspring_bootjpa.models;

import jakarta.persistence.*;

@Entity
@Table()
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    public Book() {
    }

    public Book(String title, Long id) {
        this.title = title;
        this.id = id;
    }


}
