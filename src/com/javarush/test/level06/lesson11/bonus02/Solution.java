package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача:
У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию.

 Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.

Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку(папин папа), бабушку(мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFatherName = reader.readLine();
        Cat catGrandFather = new Cat(grandFatherName);

        String grandMotherName = reader.readLine();
        Cat catGrandMother = new Cat(grandMotherName);

        String fatherName = reader.readLine();
        Cat catfather = new Cat(fatherName, catGrandFather, false);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandMother, true);

        //Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
        String sunName = reader.readLine();
        Cat catSun = new Cat(sunName, catfather, catMother);

        //Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catfather, catMother);

        System.out.println(catGrandFather);
        System.out.println(catGrandMother);
        System.out.println(catfather);
        System.out.println(catMother);
        System.out.println(catSun);
        System.out.println(catDaughter);


    }

    public static class Cat
    {
        private String name;
        //private Cat parent;
        private boolean sex;
        private Cat mom;
        private Cat dad;


        Cat(String name)
        {
            this.name = name;
        }

        Cat(String name, Cat dad, Cat mom)
        {
            this.name = name;
            this.mom = mom;
            this.dad = dad;
        }

        Cat(String name, Cat parent, boolean sex)
        {
            this.name = name;
            if (sex){
                this.mom = parent;
            } else this.dad = parent;

        }

        @Override
        public String toString()
        {
            if (mom == null && dad != null)
                return "Cat name is " + name + ", no mother, father is " + dad.name;
            else if (dad == null && mom != null)
                return "Cat name is " + name + ", mother is " + mom.name + ", no father ";
            else if (mom == null && dad == null)
                return "Cat name is " + name + ", no mother, no father ";
            else
                return "Cat name is " + name + ", mother is " + mom.name + ", father is " + dad.name;
        }
    }

}
