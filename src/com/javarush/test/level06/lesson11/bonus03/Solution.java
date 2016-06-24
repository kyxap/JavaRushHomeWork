package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        int charNums = 5;
        int[] myIntArray = new int[charNums];
        for (int i = 0; i < charNums; i++){
            int entered = Integer.parseInt(reader.readLine());
            myIntArray[i] = entered;
        }
        Arrays.sort(myIntArray);
        for (int i = 0; i < charNums; i++){
            System.out.println(myIntArray[i]);
        }

    }
}
