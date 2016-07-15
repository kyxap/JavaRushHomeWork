package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int  maximum;
        int  minimum;

        //напишите тут ваш код
        int size = 20; //FIX to 20
        int[] ar = new int[size];
        for (int i = 0; i < ar.length; i++){
            ar[i] = Integer.parseInt(reader.readLine());
        }

        maximum = maxInt(ar);
        minimum = minInt(ar);

        System.out.print(maximum + " " + minimum);
    }

    public static int maxInt(int[] ar){
        int max = 0;
        for (int i = 0; i < ar.length; i++){
            if (ar[i] > max){
                max = ar[i];
            }
        }
        return max;
    }

    public static int minInt(int[] ar){
        int min = ar[0];
        for (int i = 0; i < ar.length; i++){
            if (ar[i] < min){
                min = ar[i];
            }
        }
        return min;
    }
}
