package org.limon.libraryspring_bootjpa.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table()
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "author")
    private List<Book> books;

    public Author() {}
    public Author(Long id, String name) {
        this.id = id;
        this.name = name;
    }


}
