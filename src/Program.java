import fauna.Animal;
import fauna.Cat;
import fauna.Crocodile;

public class Program {

    public static void main(String[] args) {
        Animal cat = new Cat("Barsik;", 5, "red ");

        System.out.print("Name: " + cat.getName() + " " + "Age: " + cat.getAge() + " Color: " + cat.getColor());

        cat.sound(); // Вызов метода sound() из класса Cat

        Animal crocodile = new Crocodile("Crock;", 11, 6.5);


        System.out.print("Name: " + crocodile.getName() + " Age: " + crocodile.getAge() + " Length: " + crocodile.getLength());

        crocodile.sound(); // Вызов метода sound() из класса Crocodile
    }
}