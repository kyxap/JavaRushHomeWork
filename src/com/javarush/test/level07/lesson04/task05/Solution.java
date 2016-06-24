package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int arSize = 20;
        int inputCounts = arSize;
        //initialize ar
        int[] ar = initializeArray(arSize, inputCounts);

        int[] ar2 = copyFromArToAr(ar, 0, ar.length/2);
        int[] ar3 = copyFromArToAr(ar, ar.length/2, ar.length);

        //print all stuff
        printIntAr(ar3);

    }

    //or you can use something like Arrays.copyOfRange
    public static int[] initializeArray(int arSize, int inputCounts) throws IOException {
        //Инициализируйте (создайте и заполните) массив тут
        int[] intAr = new int[arSize];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < inputCounts; i++){
            intAr[i] = Integer.parseInt(reader.readLine());
        }
        return intAr;
    }

    public static void printIntAr(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int[] copyFromArToAr(int[] fromAr, int startCopyIndex, int stopCopyIndex) {
        int[] ar = new int[stopCopyIndex - startCopyIndex];
        int midIndex = startCopyIndex;
        for (int i = 0; i < ar.length; i++) {
            ar[i] = fromAr[midIndex];
            midIndex++;
        }
        return ar;
    }
}
