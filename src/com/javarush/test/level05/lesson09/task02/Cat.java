package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    String name = null;
    int weight = 2;
    int age = 1;
    String address = null;
    String color = null;

    //- Имя,
    Cat(String name){
        this.name = name;
    }

    //- Имя, вес, возраст
    Cat(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    //- Имя, возраст (вес стандартный)
    Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    //- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
    Cat(int weight, String color){
        this.weight = weight;
        this.color = color;
    }

    //- вес, цвет, адрес ( чужой домашний кот)
    Cat(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
    }
}
