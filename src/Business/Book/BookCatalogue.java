/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Book;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class BookCatalogue {
    
    ArrayList<Book> bookCatalogue;

    public BookCatalogue() {

        bookCatalogue = new ArrayList<Book>();


        Book book1 = new Book("Wuthering Heights", "Emily Bronte", 20);
        Book book2 = new Book("Pride & Prejudice", "Jane Austen", 15);
        Book book3 = new Book("Anna Karenina", "Leo Tolstoy", 9);
        Book book4 = new Book("Frankenstein", "Mary Shelley", 5);
        
        bookCatalogue.add(book1);
        bookCatalogue.add(book2);
        bookCatalogue.add(book3);
        bookCatalogue.add(book4);
    }

    public ArrayList<Book> getBookCatalogue() {
        return bookCatalogue;
    }

    public void setBookCatalogue(ArrayList<Book> bookCatalogue) {
        this.bookCatalogue = bookCatalogue;
    }

    
        public Book getCarAtIndex(int index){
        return bookCatalogue.get(index);
    }
        
       public void deleteBook(int index){
        
        bookCatalogue.remove(index);    
    }

 
    public void addBook(Book book) {
        bookCatalogue.add(book);
         
    }
    
    public void addBookNEW(String title1, String author1, int j){
        Book book = new Book(title1, author1, j);
        bookCatalogue.add(book);
    }

}
