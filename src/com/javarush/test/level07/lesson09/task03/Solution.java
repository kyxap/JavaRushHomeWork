package com.javarush.test.level07.lesson09.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Слово «именно»
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for вывести результат на экран, каждый элемент списка с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        ArrayList<String> strList = new ArrayList<>(0);
        strList.add("мама");
        strList.add("мыла");
        strList.add("раму");

        int temp = strList.size();
        for (int i = 0; i < temp; i++){
            strList.add(i + 1 + i, "именно");
        }

        for (String x : strList){
            System.out.println(x);
        }





    }
}
