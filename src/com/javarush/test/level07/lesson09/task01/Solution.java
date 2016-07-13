package com.javarush.test.level07.lesson09.task01;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        int arSize = 20;
        ArrayList<Integer> myAr = inizializeMe(arSize);
        ArrayList<Integer> myAr3 = returnDivN(myAr, 3);
        ArrayList<Integer> myAr2 = returnDivN(myAr, 2);
        ArrayList<Integer> myAr1 = returnZZZ(myAr);

        printList(myAr3);
        printList(myAr2);
        printList(myAr1);



    }

    public static ArrayList<Integer> inizializeMe(int size) throws IOException
    {
        ArrayList<Integer> intAr = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < size; i++){
            intAr.add(Integer.parseInt(reader.readLine()));
        }
        return intAr;
    }

    public static ArrayList<Integer> returnDivN(ArrayList<Integer> ar, int n){
        ArrayList<Integer>  returnAr = new ArrayList<>();
        for (int i = 0; i < ar.size(); i++){
            if (ar.get(i) % n == 0){
                returnAr.add(ar.get(i));
            }
        }
        return returnAr;
    }

    public static ArrayList<Integer> returnZZZ(ArrayList<Integer> ar){
        ArrayList<Integer>  returnAr = new ArrayList<>();
        for (int i = 0; i < ar.size(); i++){
            if (ar.get(i) % 2 != 0 && ar.get(i) % 3 != 0){
                returnAr.add(ar.get(i));
            }
        }
        return returnAr;
    }

    public static void printList(List<Integer> list)
    {
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
