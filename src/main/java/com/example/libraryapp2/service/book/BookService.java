package com.example.libraryapp2.service.book;

import com.example.libraryapp2.domain.book.Book;
import com.example.libraryapp2.domain.book.BookRepository;
import com.example.libraryapp2.dto.book.request.BookCreateRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @Transactional
    public void saveBook(BookCreateRequest request){
        bookRepository.save(new Book(request.getName()));
    }
}
