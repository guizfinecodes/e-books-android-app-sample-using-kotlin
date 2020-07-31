package com.brianguiz.e_books;

public class Book {
    public String id;
    public String title;
    public String subTitle;
    public String[] authors;
    public String publishers;
    public String publishedDate;

    public Book(String id, String title, String subTitle, String[] authors, String publishers, String publishedDate) {
        this.id = id;
        this.title = title;
        this.subTitle = subTitle;
        this.authors = authors;
        this.publishers = publishers;
        this.publishedDate = publishedDate;
    }

}
