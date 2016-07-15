package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни
 их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        //Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
        Human gf1 = new Human("Борис", true, 72);
        Human gf2 = new Human("Борис2", true, 73);
        Human gm1 = new Human("Сиси", false, 74);
        Human gm2 = new Human("Сиси2", false, 71);
        Human f1 = new Human("Батя", true, 55, gf1, gm1);
        Human m1 = new Human("Мамка", false, 50, gf2, gm2);
        Human c1 = new Human("Ребенок1", true, 55, f1, m1);
        Human c2 = new Human("Ребенок2", false, 55, f1, m1);
        Human c3 = new Human("Ребенок3", true, 55, f1, m1);

        System.out.println(gf1.toString());
        System.out.println(gf2.toString());
        System.out.println(gm1.toString());
        System.out.println(gm2.toString());
        System.out.println(f1.toString());
        System.out.println(m1.toString());
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());


    }

    public static class Human
    {
        //напишите тут ваш код
        //имя(String), пол(boolean),возраст(int), отец(Human), мать(Human)
        String name;
        Boolean sex;
        int age;
        Human father;
        Human mother;

        Human(String name, Boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        Human(String name, Boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = null;
            this.mother = null;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
