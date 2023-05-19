package homework4;
import fauna.Animal;
import fauna.Cat;
import fauna.Crocodile;

public class classes {

    public static void main(String[] args) {
        Animal cat = new Cat("Barsik", 5, "red ");

        System.out.print("Name: " + cat.getName() + " " + "Age: " + cat.getAge() + " " + cat.getColor());

        cat.sound(); // Вызов метода sound() из класса Cat

        Animal crocodile = new Crocodile("Crock", 11, 6.5);


        System.out.print(crocodile.getName() + " " + crocodile.getAge() + " " + crocodile.getLength());

        crocodile.sound(); // Вызов метода sound() из класса Crocodile
    }
}

