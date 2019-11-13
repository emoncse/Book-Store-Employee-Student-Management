/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package imran;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class BookStoreApp {
    
    public static void main(String[] args){
        
        Scanner myObj = new Scanner(System.in);
        BookStore bookStore = new BookStore();
        
        System.out.println("1. Display\n2. Order\n3. Sell\n4. Exit");
        int op;
        while(true){
            boolean flag = false;
             op = myObj.nextInt();
             switch( op ){
                 case 1:{
                     System.out.println("All Items :\n");
                     bookStore.display();
                 }
                 break;
                 case 2: {
                     System.out.println("Order :\nTitle + Author + ISBN + Copies : ");
                     String bookTitlal = myObj.next(), bookAuthor = myObj.next(), isbn = myObj.next();
                     int copies = myObj.nextInt();     
                     bookStore.order( bookTitlal, bookAuthor, isbn , copies);
                 }
                 break;
                 case 3:{
                     System.out.println("Sell :\nTitle + Copies : ");
                     String bookName = myObj.next();
                     int copies = myObj.nextInt();
                     bookStore.sell(bookName, copies);
                 }
                 break;
                 case 4:
                     flag = true;
                     break;
             }
             if(flag) break;
             
        }
    }
}
