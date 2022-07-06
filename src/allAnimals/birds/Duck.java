package allAnimals.birds;

import allAnimals.Animals;

public class Duck extends Animals implements Flying {


    public void say(){
        System.out.println("Кря");
    }
    public void fly(){
        System.out.println("Я лечу");
    }
}
