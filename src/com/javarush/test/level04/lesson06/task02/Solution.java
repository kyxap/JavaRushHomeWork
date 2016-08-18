package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a1 = Integer.parseInt(reader.readLine());
        int a2 = Integer.parseInt(reader.readLine());
        int a3 = Integer.parseInt(reader.readLine());
        int a4 = Integer.parseInt(reader.readLine());

        Solution sol = new Solution();
        System.out.println(sol.findMax4(a1, a2, a3, a4));

    }

    private int findMax4(int a1, int a2, int a3, int a4)
    {
        int[] myIntArray = {a1, a2, a3, a4};
        int temp = a1;
        for (int i = 0; i < myIntArray.length; i++)
            if (myIntArray[i] > temp)
            {
                temp = myIntArray[i];
            } //else continue;
        return temp;
    }
}
