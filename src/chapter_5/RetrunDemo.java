/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_5;

/**
 *
 * @author thetkhine
 */
public class RetrunDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            
            if(i==5)
            {
                return;
            }
            System.out.println("I is "+i);
        }
        System.out.println("End of loop");
    }
}
