package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        String input;
        int sum = 0;
        Scanner user_input = new Scanner(System.in);


        while (true){
            input = user_input.next();
            if (input.equals("сумма")){
                break;
            } else sum += Integer.parseInt(input);
        }
        System.out.println(sum);
    }
}
