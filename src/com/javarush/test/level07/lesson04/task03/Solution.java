package com.javarush.test.level07.lesson04.task03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 2 массива
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел. Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        int arSize = 10;
        String[] ar = new String[arSize];
        int[] ar2 = new int[arSize];


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < arSize; i++)
        {
            ar[i] = reader.readLine();
            ar2[i] = ar[i].length();
        }

        printIntAr(ar2);
    }

    public static void printIntAr(int[] array) {
        //Will be print each ar[n] + '\n'
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
