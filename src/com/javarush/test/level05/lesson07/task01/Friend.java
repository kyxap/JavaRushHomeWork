package com.javarush.test.level05.lesson07.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    //Напишите тут ваш код

    private String name;
    int age;
    String sex;

    public void initialize(String name){
        name = this.name;
    }
    public void initialize(String name, int age){
        name = this.name;
        age = this.age;
    }
    public void initialize(String name, int age, String sex){
        name = this.name;
        age = this.age;
        sex = this.sex;
    }

}
