/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package details;

import java.util.Scanner;

/**
 *
 * @author revle
 */
public class Details {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); //Need to be created only once
        System.out.println("Type your name");
        String myname = input.next();
        
        System.out.println("Type the year of your birth");
        int birth = input.nextInt();
        
        System.out.println("Type the current year");
        int year = input.nextInt();
        
        int age = year - birth;
        
        System.out.println("Hello my name is " +myname +" and my age is " +age);
        
//        int birth = 1990;
//        int now = 2020;
//        String name = "Aggelos";
//        int age = now - birth;
//        System.out.println("My name is " +name +" and my age is " +age);
        
    }
    
}
