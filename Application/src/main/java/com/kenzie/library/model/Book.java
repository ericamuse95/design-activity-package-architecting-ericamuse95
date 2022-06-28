package com.kenzie.library.model;

public abstract class Book {
    public String title;
    public String author;

    public String convertBookToString(String title, String author){
        return convertBookToString(title,author);
    }

    public void setBookInfo(String detailString){
        this.title = title;
        this.author = author;
    }

}
