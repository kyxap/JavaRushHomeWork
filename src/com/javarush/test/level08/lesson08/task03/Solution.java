package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    //for testing only
//    public static void main(String[] args) throws Exception
//    {
//        HashMap<String, String> map = createMap();
//        System.out.println("getCountTheSameFirstName: " + getCountTheSameFirstName(map, "Какашка"));
//        System.out.println("getCountTheSameLastName: " + getCountTheSameLastName(map, "Писюн"));
//
//    }
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("Писюн1","Какашка");
        map.put("Писюн","Какашка");
        map.put("Писюн","Какашка7");
        map.put("Писюн","Какашка5");
        map.put("Писюн4","Какашка3");
        map.put("Писюн5","Какашка2");
        map.put("Писюн6","Какашка");
        map.put("Писюн3","Какашка");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet()){
            if (name.equals(pair.getValue())){
                count++;
            }

        }
        return count;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet()){
            if (lastName.equals(pair.getKey())){
                count++;

            }
        }
        return count;

    }
}
