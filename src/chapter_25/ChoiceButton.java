/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_25;

import java.awt.Choice;

/**
 *
 * @author thetkhine
 */
public class ChoiceButton extends GeneralFrame{
    
    public ChoiceButton() {
        super("Choice Button");
        init();
    }
    public void init()
    {
        Choice browser = new Choice();
        browser.add("Firefox");
        browser.add("IE");
        browser.add("Chrome");
        
        add(browser);
        
        browser.addItemListener(ie->{
            System.out.println("Selected "+ browser.getSelectedItem());
        });
    }
    public static void main(String[] args) {
        new ChoiceButton();
    }
}
