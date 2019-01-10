/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

/**
 *
 * @author Almodad
 */
public class Animal {
    public Animal() {
        System.out.println("A new animal has been created!");
    }
    public Animal(String type) {
        System.out.println("A new "+type+" has been created!");
    }
    
    public void sleep() {
        System.out.println("An animal sleeps...");
    }
    public void eat() {
        System.out.println("An animal eats...");
    }
}
