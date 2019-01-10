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
public class MainClass {
    public static void main(String[] args) {
        Cow cow = new Cow();
        Animal a = cow;
        Vegetarian v = cow;
        Object obj = cow;
        
        a.eat();
        cow.getWeight();
        v.getNutrition();
//        Cat cat = new Cat();
//        cat.sleep();
        
//        Animal animal = new Animal();
//        Bird bird = new Bird();
//        Dog dog = new Dog();
//        System.out.println();
//        animal.sleep();
//        animal.eat();
//        bird.sleep();
//        bird.eat();
//        dog.sleep();
//        dog.eat();
    }
}
