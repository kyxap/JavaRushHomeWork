package com.javarush.test.level05.lesson12.home03;

/* Создай классы Dog, Cat, Mouse
Создай классы Dog, Cat, Mouse. Добавь по три поля в каждый класс, на твой выбор. Создай объекты для героев мультика
 Том и Джерри. Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse(“Jerry”, 12 , 5), где 12 - высота в см, 5 - длина хвоста в см.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Mouse jerryMouse = new Mouse("Jerry", 12 , 5);
        Cat jerryCat = new Cat("Jer2ry", 112 , 52);
        Dog jerryDog = new Dog("J1rry", 112 , 53);

        //напишите тут ваш код
    }

    public static class Mouse
    {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }

        public Mouse(String name)
        {
            this.name = name;
            this.height = 0;
            this.tail = 0;
        }

        public Mouse(int height, int tail)
        {
            this.name = "No name";
            this.height = height;
            this.tail = tail;
        }

        public Mouse(String name, int height)
        {
            this.name = name;
            this.height = height;
            this.tail = 0;
        }
    }

    //добавьте тут ваши классы
    public static class Cat
    {
        String name;
        int height;
        int tail;

        public Cat(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }

        public Cat(String name)
        {
            this.name = name;
            this.height = 0;
            this.tail = 0;
        }

        public Cat(int height, int tail)
        {
            this.name = "No name";
            this.height = height;
            this.tail = tail;
        }

        public Cat(String name, int height)
        {
            this.name = name;
            this.height = height;
            this.tail = 0;
        }
    }

    public static class Dog
    {
        String name;
        int height;
        int tail;

        public Dog(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }

        public Dog(String name)
        {
            this.name = name;
            this.height = 0;
            this.tail = 0;
        }

        public Dog(int height, int tail)
        {
            this.name = "No name";
            this.height = height;
            this.tail = tail;
        }

        public Dog(String name, int height)
        {
            this.name = name;
            this.height = height;
            this.tail = 0;
        }
    }

}
