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
public class Cow extends Animal implements Vegetarian{

    public Cow(){
        super("Cow");
    }
    @Override
    public void eat(){
        System.out.println("A cow eats");
    }
    @Override
    public void getNutrition() {
        System.out.println("I eat grass");
    }

    @Override
    public float getWeight() {
        return 100;
    }
    
}
