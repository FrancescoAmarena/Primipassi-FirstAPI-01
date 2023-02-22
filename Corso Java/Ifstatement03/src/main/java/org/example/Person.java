package org.example;

public class Person {
    int age;
    Person(){
        int max=80;
        int min=5;
        Math.floor(Math.random()*(max-min+1)+min);
    }
}
