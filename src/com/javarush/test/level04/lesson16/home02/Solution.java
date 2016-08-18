package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //Напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int a1 = Integer.parseInt(r.readLine());
        int a2 = Integer.parseInt(r.readLine());
        int a3 = Integer.parseInt(r.readLine());

        if (a1 > a2 && a1 < a3){
            System.out.println(a1);
        }

        if (a1 < a2 && a1 > a3){
            System.out.println(a1);
        }

        if (a2 > a1 && a2 < a3){
            System.out.println(a2);
        }

        if (a2 < a1 && a2 > a3){
            System.out.println(a2);
        }

        if (a3 > a2 && a3 < a1){
            System.out.println(a3);
        }

        if (a3 < a2 && a3 > a1){
            System.out.println(a3);
        }
    }
}
