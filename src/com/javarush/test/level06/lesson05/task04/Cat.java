package com.javarush.test.level06.lesson05.task04;

/* Cчётчик котов
В конструкторе класса Cat [public Cat()] увеличивать счётчик котов (статическую переменную этого же класса catCount)
 на 1. В методе finalize уменьшать на 1.
*/

public class Cat
{
    public static int catCount = 0;
    private int lol = 3;

    //напишите тут ваш код
    public Cat() {
        catCount = catCount + 1;
    }

    protected void finalize() throws Throwable{
        catCount = catCount - 1;
    }

    public static void main(String[] args) {
        Cat nc = new Cat();
        nc.lol = 12;
        System.out.println(nc.lol);
    }
}
