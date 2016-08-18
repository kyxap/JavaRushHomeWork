package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал
 true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(isDateOdd("AUG 1 2020"));
        System.out.println(isDateOdd("DEC 1 2011"));
        System.out.println(isDateOdd("JAN 1 2020")); //0
        System.out.println(isDateOdd("JAN 2 2020")); //1
        System.out.println(isDateOdd("JAN 3 2020")); //2
        System.out.println(isDateOdd("JAN 4 2020")); //3
        System.out.println(isDateOdd("JAN 5 2020")); //4
    }

    public static boolean isDateOdd(String date)
    {
        Date d = new Date(date);
        boolean rez;

        long diff = Math.abs(d.getTime()) - Math.abs(new Date("JAN 1 " + (1900 + d.getYear())).getTime());
        long diffDays = diff / (24 * 60 * 60 * 1000);
        //System.out.print(">>> " + diffDays);
        if (diffDays % 2 == 0){
            rez = true;
        } else rez = false;
        return rez;
    }
}
