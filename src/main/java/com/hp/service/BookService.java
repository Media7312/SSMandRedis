package com.hp.service;

import com.hp.entity.Book;
import com.hp.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookMapper bookMapper;

    public List<Book> getBook()throws Exception{
        return bookMapper.getBook();
    }

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }
}
