package com.javarush.test.level05.lesson12.home04;

/* Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде "21 02 2014".
*/

import java.util.Date;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Date day = new Date();

        System.out.println(day.getDate() + " " + 0+ (day.getMonth() + 1) + " " + (day.getYear()+1900) );

    }
}
