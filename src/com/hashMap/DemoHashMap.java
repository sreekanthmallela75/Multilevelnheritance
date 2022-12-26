package com.hashMap;

import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {
    public static void main(String[] args) {
        HashMap<Integer , String> map = new HashMap<>();
        map.put(1,"Sreekanth");
        map.put(2, "sanjay");
        for (Map.Entry entry: map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
