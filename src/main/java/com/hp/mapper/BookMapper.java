package com.hp.mapper;

import com.hp.entity.Book;
import com.hp.mybatis.MyBatisMapper;

import java.util.List;
@MyBatisMapper
public interface BookMapper {
    List<Book> getBook();
}
