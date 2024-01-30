package de.neuefische;

import java.util.Objects;

/**
 * private - innerhalb der Klasse verfügbar
 * public - verfügbar für andere Klassen
 * protected - innerhalb eines Pakets verfügbar
 */
public class Cat {
    // Eigenschaften
    private String name;
    private String color;
    private int age;
    // Konstruktor
    public Cat(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }
    // Methoden
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name) && Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color);
    }
}
