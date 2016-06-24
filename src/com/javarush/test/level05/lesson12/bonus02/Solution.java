package com.javarush.test.level05.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] ar = new int[5];

        ar[0] = Integer.parseInt(reader.readLine());
        ar[1] = Integer.parseInt(reader.readLine());
        ar[2] = Integer.parseInt(reader.readLine());
        ar[3]= Integer.parseInt(reader.readLine());
        ar[4] = Integer.parseInt(reader.readLine());

        int minimum = min(ar);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int ar[])
    {
        java.util.Arrays.sort(ar);
        return ar[0];
    }

}
