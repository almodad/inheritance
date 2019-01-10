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
public class Dog extends Animal {
    public Dog() {
        super();
        System.out.println("A new dog has been created!");
    }
    @Override
    public void sleep() {
        System.out.println("A dog sleeps...");
    }
    @Override
    public void eat() {
        System.out.println("A dog eats...");
    }
}
