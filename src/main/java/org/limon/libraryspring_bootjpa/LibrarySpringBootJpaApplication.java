package org.limon.libraryspring_bootjpa;

import jakarta.annotation.PostConstruct;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.limon.libraryspring_bootjpa.models.Author;
import org.limon.libraryspring_bootjpa.models.Book;
import org.limon.libraryspring_bootjpa.models.Member;
import org.limon.libraryspring_bootjpa.repo.AuthorRepository;
import org.limon.libraryspring_bootjpa.repo.BookRepository;
import org.limon.libraryspring_bootjpa.service.AuthorService;
import org.limon.libraryspring_bootjpa.service.BookService;
import org.limon.libraryspring_bootjpa.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@SpringBootApplication
public class LibrarySpringBootJpaApplication {


    private final AuthorService authorService;
    private final BookService bookService;
    private final MemberService memberService;

    public LibrarySpringBootJpaApplication(AuthorService authorService, BookService bookService, MemberService memberService) {
        this.authorService = authorService;
        this.bookService = bookService;
        this.memberService = memberService;
    }

    public static void main(String[] args) {
        SpringApplication.run(LibrarySpringBootJpaApplication.class, args);
    }

    @PostConstruct
    @Transactional
    public void init() {
        Author author1 = new Author("author1");
        Author author2 = new Author("author2");
        Author author3 = new Author("author3");

        Book book1 = new Book("book1");
        Book book2 = new Book("book2");
        Book book3 = new Book("book3");

        author1.setBooks(List.of(book1, book2, book3));
        book1.setAuthor(author1);
        book2.setAuthor(author2);
        book3.setAuthor(author3);

        Member member1 = new Member("member1");
        Member member2 = new Member("member2");
        Member member3 = new Member("member3");

        member1.setBooks(List.of(book1, book2));
        member2.setBooks(List.of(book3));
        book1.setMembers(List.of(member1));
        book2.setMembers(List.of(member1));
        book3.setMembers(List.of(member2));


        System.out.println("-------saving 3 authors-------");
        authorService.save(author1);
        authorService.save(author2);
        authorService.save(author3);

        memberService.save(member1);
        memberService.save(member2);
        memberService.save(member3);


        bookService.save(book1);
        bookService.save(book2);
        bookService.save(book3);



    }

}
