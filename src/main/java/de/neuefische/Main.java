package de.neuefische;

public class Main {
    public static void main(String[] args) {
        Cat mauzi = new Cat("mauzi", "green", 7); // Instanziieren einer Klasse Cat
        System.out.println(mauzi.getName());
        System.out.println(mauzi.getColor());
        System.out.println(mauzi);
        Cat fluffy = new Cat("mauzi", "green", 8);
        System.out.println(mauzi.getAge() == fluffy.getAge());
    }
}