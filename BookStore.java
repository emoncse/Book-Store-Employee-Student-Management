/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package imran;

import java.util.ArrayList;


/**
 *
 * @author User
 */
public class BookStore {
    
  //  Book[] books = new Book[ 10 ]; 
    ArrayList<Book> books =  new ArrayList<Book>();
   
    
    
    void sell(String bookTitle, int noOfCopies){
        
        for(int i = 0; i < books.size(); i++){
            Book book = books.get(i);
            if( book.bookTitle == null ? bookTitle == null : book.bookTitle.equals(bookTitle) ){
                 book.numOfCopies -= noOfCopies;
               // else System.out.println("Book Found but number of copies is less than buy copies.");
            }
        }
        
    }
    
    void order(String title, String author, String isbn, int noOfCopies){
        boolean flag = false;
        for(int i = 0; i < books.size(); i++){
            Book book = books.get(i);
            if(book.bookISBN == isbn){
                book.numOfCopies += noOfCopies;
                flag = true;
            }
        }
        if( !flag ){
            books.add(new Book(title, author, isbn, noOfCopies));
        }
    }
    
    
    void display(){
        for(int i = 0; i < books.size(); i++){
            books.get(i).display();
        }
    }
}
