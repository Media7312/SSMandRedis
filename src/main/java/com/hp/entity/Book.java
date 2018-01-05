package com.hp.entity;

import java.io.Serializable;
import java.util.List;

public class Book implements Serializable{
    private static final long serialVersionUID = 6047232650905658062L;
    int book_id;
    String book_name;
    private List<Category> categoryList;

    @Override
    public String toString() {
        return "Book{" +
                "book_id=" + book_id +
                ", book_name='" + book_name + '\'' +
                ", categoryList=" + categoryList +
                '}';
    }




    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }
}
