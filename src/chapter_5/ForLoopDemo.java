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
public class ForLoopDemo {
    public static void main(String[] args) {
        /*
        for (int i = 0;i < 4; i++) {
            System.out.println("Counter "+i);
        }
        */
        int i =0;
        for (; i < 5; ) {
            
            System.out.println("I is "+i);
            i++;
        }
        
        for (int j = 0,k=0; j < 10; j++,k++) {
            System.out.println("K "+k);
        }
    }
}
