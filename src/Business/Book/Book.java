/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Book;

/**
 *
 * @author Dell
 */
public class Book {
    
    private String title1;
    private String author1;
    private int quantity1;
    
    public Book( String title1, String author1, int quantity1){
        
        this.author1=author1;
        this.title1=title1;
        this.quantity1=quantity1;
        
        
    }

    public Book() {
        System.out.println("New Book Created");
    }

    public String getTitle1() {
        return title1;
    }

    public void setTitle1(String title1) {
        this.title1 = title1;
    }

    public String getAuthor1() {
        return author1;
    }

    public void setAuthor1(String author1) {
        this.author1 = author1;
    }


    public int getQuantity1() {
        return quantity1;
    }

    public void setQuantity1(int quantity1) {
        this.quantity1 = quantity1;
    }
    
    
    
    public int getQuantity() {
        return quantity1;
    }

    public void setQuantity(int quantity1) {
        this.quantity1 = quantity1;
    }
    

}
