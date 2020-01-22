/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaevaluation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Students
 */
public class JavaEvaluation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Number number = new Number();
        int cas = 2;
        try {
            File file = new File("D:\\input.txt");
            String str;
            try (Scanner myReader = new Scanner(file)) {
                number.num = Integer.parseInt( myReader.next());
                str = myReader.next();
                System.out.println(str);
                myReader.close();
            }
            
            if( str.startsWith("fac")) System.out.println("Factorial : " + number.factorial());
            else System.out.println("isPrime : " + number.isPrime());

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }

    }

}
