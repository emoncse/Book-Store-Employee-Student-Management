/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package imran;

/**
 *
 * @author User
 */
public class Book {
    public String bookTitle;
    public String bookAuthor;
    public String bookISBN;
    public int numOfCopies;

    public Book() {
    }
    
    
    
    
    
    public Book(String bookTitle, String bookAuthor, String bookISBN, int numOfCopies) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookISBN = bookISBN;
        this.numOfCopies = numOfCopies;
    }
    
    
    
    void display(){
        System.out.println("Book Name : " + bookTitle + " Book Author : " + bookAuthor + " Book ISBN Number : " + bookISBN + " Number of Copies : " + numOfCopies);
    }  
    
}
