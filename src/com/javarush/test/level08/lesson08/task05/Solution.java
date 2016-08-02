package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    //for testing only
    public static void main(String[] args) throws Exception
    {
        HashMap<String, String> map = createMap();
        System.out.println("before: " + map);
        removeTheFirstNameDuplicates(map);
        System.out.println("after: " + map);
    }

    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put( "Ivanov", "Ivan" );
        map.put( "Petrov", "Petr" );
        map.put( "Sidorov", "Ivan" );
        map.put( "Semenov", "Sergey" );
        map.put( "Frolov", "Igor" );
        map.put( "Sergeev", "Igor" );
        map.put( "Kostenko", "Alexey" );
        map.put( "Petrenko", "Sergey" );
        map.put( "Dmitriev", "Sergey" );
        map.put( "Nikonov", "Petr" );
        return map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код
        Set<String> rep = new HashSet<>();
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pairs : copy.entrySet()){
            if (!rep.contains(pairs.getValue())){
                rep.add(pairs.getValue());
            } else removeItemFromMapByValue(map, pairs.getValue());
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
