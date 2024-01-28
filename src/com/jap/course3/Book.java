package com.jap.course3;

import java.util.Random;
public class Book {
    private int isbn_number;
    private String bookName;
    private String bookDescription;
    private double price;
    private Author author;
    private static Random rand;
    static {
        rand=new Random();
    }
    Book(){
        this("","",0.0,new Author());
    }
    Book(String name,String description,double money,Author a){
        isbn_number=rand.nextInt();
        bookName=name;
        bookDescription=description;
        price=money;
        author=a;
    }
    public void setBookName(String name) {
        bookName=name;
    }
    public void setBookDescription(String description) {
        bookDescription=description;
    }
    public void setBookPrice(double money) {
        price=money;
    }
    public void setAuthor(Author a) {
        author=a;
    }
    public int getisbnnumber() {
        return isbn_number;
    }
    public String getBookName() {
        return bookName;
    }
    public String getBookDescription() {
        return bookDescription;
    }
    public double getPrice() {
        return price;
    }
    public Author getAuthor() {
        return author;
    }
    public void displayDetails() {
        System.out.println("************Book Details*****************");
        System.out.println("Book ID : "+getisbnnumber());
        System.out.println("Book Name : "+getBookName());
        System.out.println("Book Description : "+getBookDescription());
        System.out.println("Price : "+getPrice());
        System.out.println("***********Author Details*****************");
        System.out.println(author.toString());
    }

}



