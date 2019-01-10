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
public class Bird extends Animal {
    public Bird() {
        super();
        System.out.println("A new bird has been created!");
    }
    @Override
    public void sleep() {
        System.out.println("A bird sleeps...");
    }
    @Override
    public void eat() {
        System.out.println("A bird eats...");
    }
}
