package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        ArrayList<String> MyAr = inicialize();
        String longest = findLongestStr(MyAr);
        printStrNtimes(longest, findStrCountInAr(MyAr, longest));
    }

    public static ArrayList<String> inicialize() throws IOException {
        ArrayList<String> arStr = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++){
            arStr.add(reader.readLine());
        }
        return arStr;
    }

    public static String findLongestStr(ArrayList<String> ar){
        String longest = "";
        for (int i = 0; i < ar.size(); i++){
            if (ar.get(i).length() > longest.length()){
                longest = ar.get(i);
            }
        }
        return longest;
    }

    public static int findStrCountInAr(ArrayList<String> list, String str){
        int strCount = 0;
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).equals(str)){
                strCount++;
            }
        }
        return strCount;
    }

    public static void printStrNtimes(String str, int count){
        for (int i = 0; i < count; i++){
            System.out.println(str);
        }
    }
}
