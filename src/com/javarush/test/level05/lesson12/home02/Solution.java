package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        //создай по два объекта каждого класса тут
        Man man1 = new Man("Vasya", 25, "Moskov");
        Man man2 = new Man("Vasya2", 235, "Mosko1v");

        Women w1 = new Women("Kisa", 22, "Ivankov");
        Women w2 = new Women("Pisya", 23, "LA");

        //выведи их на экран тут
        System.out.println(man1.toString());
        System.out.println(man2.toString());

        System.out.println(w1.toString());
        System.out.println(w2.toString());

    }

    public static class Man
    {
        String name;
        int age;
        String address;

//        public Man(String name, int age){
//            this.name = name;
//            this.age = age;
//            this.address  = "NA";
//        }
//
//        public Man(int age){
//            this.name = "No Name";
//            this.age = age;
//            this.address  = "NA";
//        }
//
//        public Man(String name){
//            this.name = name;
//            this.age = 0;
//            this.address  = "address";
//        }
//
//        public Man(String name, String address){
//            this.name = name;
//            this.age = 0;
//            this.address = address;
//        }

        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString()
        {
            return name + " " + age + " " + address;
        }
    }

    public static class Women
    {
        String name;
        int age;
        String address;

//        public Women(String name, int age){
//            this.name = name;
//            this.age = age;
//            this.address  = "NA";
//        }
//
//        public Women(int age){
//            this.name = "No Name";
//            this.age = age;
//            this.address  = "NA";
//        }
//
//        public Women(String name){
//            this.name = name;
//            this.age = 0;
//            this.address  = "address";
//        }
//
//        public Women(String name, String address){
//            this.name = name;
//            this.age = 0;
//            this.address = address;
//        }

        public Women(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString()
        {
            return name + " " + age + " " + address;
        }
    }
}
