package com.jap.course3;

public class BookImpl {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Book b1 = new Book();
        Book b2 = new Book("Harry Potter", "Fantasy", 450.66, new Author("JK Rowling", "Princess"));
        b1.setBookName("Avengers");
        b1.setBookDescription("Superhero");
        b1.setBookPrice(500.89);
        b1.setAuthor(new Author("Stan lee", "King of marvel"));
        b1.displayDetails();
        b2.displayDetails();
    }
}


