/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaevaluation;

/**
 *
 * @author Students
 */
public class Number {
    public int num;

    public Number(int num) {
        this.num = num;
    }

    public Number() {
    }
    
    
    boolean isPrime(){
        boolean flag = true;
        for(int i = 2; i <= Math.sqrt(num); i++){
            if( num % i == 0 ){
                flag = false;
                break;
            }
        }
        return true;
    }
    int factorial(){
        return factorial(num);
    }

    int factorial(int i) {
        if( i == 1 || i == 0 ) return 1;
        return i * factorial( i - 1 );
    }
}
