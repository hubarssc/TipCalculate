package fauna;

import java.util.Objects;

public abstract class Animal {
    private String name;
    private int age;
    private String color;
    private Double length;


    public Animal() {
        // Конструктор без параметров
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Геттеры и сеттеры для полей
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getLength() {
        return length;
    }

    public void setLength() {
        this.length = length;
    }

    public abstract void sound(); // Абстрактный метод, который будет реализован в дочерних классах

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + Objects.hashCode(name);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Animal))
            return false;
        Animal other = (Animal) obj;
        return age == other.age && Objects.equals(name, other.name);
    }

    @Override
    public String toString() {
        return "Animal [name=" + name + ", age=" + age + "]";
    }
}
