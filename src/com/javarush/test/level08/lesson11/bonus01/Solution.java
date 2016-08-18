package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(nameToNumbMonth(reader.readLine()));
    }

    public static String nameToNumbMonth(String str ){

        Date date = new Date("1 " + str + " 2015");
        return str + " is " + (date.getMonth() + 1) + " month";
    }

}
