package com.javarush.test.level04.lesson16.home04;

/* Меня зовут 'Вася'...
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»
Пример:
Меня зовут Вася
Я родился 15.2.1988
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //Напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String name = r.readLine();
        int y = Integer.parseInt(r.readLine());
        int m = Integer.parseInt(r.readLine());
        int d = Integer.parseInt(r.readLine());

        System.out.print("Меня зовут " + name + "\n" +
                "Я родился " + d + "." +m+ "." +y);

    }
}
