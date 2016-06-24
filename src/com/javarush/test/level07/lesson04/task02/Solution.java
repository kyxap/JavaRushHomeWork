package com.javarush.test.level07.lesson04.task02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* Массив из строчек в обратном порядке
1. Создать массив на 10 строчек.
2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        int arSize = 10;
        int inputCounts = 8;
        //initialize ar
        String[] ar = initializeArray(arSize, inputCounts);
        //print all stuff
        printStrAr(ar);
    }

    public static String[] initializeArray(int arSize, int inputCounts) throws IOException
    {
        //Инициализируйте (создайте и заполните) массив тут
        String[] strAr = new String[arSize];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < inputCounts; i++){
            strAr[i] = reader.readLine();
        }
        return strAr;
    }

    public static void printStrAr(String[] array) {
        //Will be print each ar[n] + '\n'
        for (int i = 1; i < array.length + 1; i++) {
            System.out.println(array[array.length - i]);
        }
    }
}