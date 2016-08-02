package com.javarush.test.level08.lesson08.task04;

import java.util.*;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    //for testing only
//    public static void main(String[] args) throws Exception
//    {
//        HashMap<String, Date>  map = createMap();
//        System.out.println("before: " + map);
//        removeAllSummerPeople(map);
//        System.out.println("after: " + map);
//    }

    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stallone2", new Date("JUNE 1 1980"));
        map.put("Stallone3", new Date("JUNE 1 1980"));
        map.put("Stallone4", new Date("JUNE 1 1980"));
        map.put("Stallone5", new Date("JUNE 1 1980"));
        map.put("Stallone6", new Date("AUG 1 1980"));
        map.put("Stallone7", new Date("AUGUST 1 1980"));
        map.put("Stallone8", new Date("OCT 1 1980")); //this should left
        map.put("Stallone9", new Date("JULY 1 1980"));
        map.put("Stallone10", new Date("JULY 1 1980"));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //напишите тут ваш код
        Set<String> set = new HashSet<>();
        for (Map.Entry<String, Date> pair : map.entrySet()){
            if (pair.getValue().toString().contains("Aug")){
                set.add(pair.getKey());
            }
            if (pair.getValue().toString().contains("Jun")){
                set.add(pair.getKey());
            }
            if (pair.getValue().toString().contains("Jul")){
                set.add(pair.getKey());
            }
    }
        for (String key : set){
            map.remove(key);
        }

    }
}
