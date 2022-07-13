import allanimals.Animals;
import allanimals.birds.Duck;
import allanimals.pets.Cat;
import allanimals.pets.Dog;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        ArrayList<Animals> animalList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);


        while(true) {
            System.out.println("Выбирите из меню add/list/exit");
            String choise = sc.next().toUpperCase().trim();

            switch (choise) {
                case "ADD":
                    System.out.println("Какое животное добавить cat/dog/duck");
                    String animalName = sc.next();
                    if (animalName.equals("cat")) {
                        Animals cat = new Cat();
                        createAnimal(cat, sc);
                        animalList.add(cat);
                        cat.say();
                    } else if (animalName.equals("dog")) {
                        Animals dog = new Dog();
                        createAnimal(dog, sc);
                        animalList.add(dog);
                        dog.say();
                    } else if (animalName.equals("duck")) {
                        Animals duck = new Duck();
                        createAnimal(duck, sc);
                        animalList.add(duck);
                        duck.say();
                    }
                    break;
                case "LIST":
                    for (Animals ani : animalList) {
                        System.out.println(ani.toString());
                    }
                    break;
                case "EXIT":
                    System.out.println("Выход из программы");
                    System.exit(0); //0 - штатное завершение
                default:
                    System.out.println("Неизвестная команда");

            }
        }

    }
    public static void createAnimal(Animals animals,Scanner scanner){
        System.out.println("Введите имя животного");
        animals.setName(scanner.next());

        System.out.println("Введите возвраст животного");
        while(!scanner.hasNextInt()) {
            System.out.println("Некорректное значение возроста. Пожалуйста, повторите попытку и введите число.");
            scanner.next();}
        animals.setAge(scanner.nextInt());

        System.out.println("Введите вес животного");
        while(!scanner.hasNextInt()){
            System.out.println("Некорректное значение веса. Пожалуйста, повторите попытку и введите число.");
            scanner.next();}
            animals.setWeight(scanner.nextInt());

        System.out.println("Введите цвет животного");
        animals.setColor(scanner.next());
    }
}
