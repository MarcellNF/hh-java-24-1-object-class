package de.neuefische;

import de.neuefische.cat.Cat;

public class Main {
    public static void main(String[] args) {
        Cat mauzi = new Cat(); // Instanziieren einer Klasse Cat
        mauzi.color = "blue";
        mauzi.name = "Mauzi";
        System.out.println(mauzi.color);
        mauzi.color = "red";
        System.out.println(mauzi.color);
        Cat fluffy = new Cat("fluffy", "grey");
        fluffy.name = "fluffy2";
        System.out.println(fluffy.name);
    }
}