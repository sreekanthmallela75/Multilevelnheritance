package com.DemoSream1;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class AddingItems {
    public static void main(String[] args) {
        List<Items> List1 = new ArrayList<>();
        List1.add(new Items("Milk", 1, 35f));
        List1.add(new Items("Eggs", 2, 60f));
        List1.add(new Items("Veg Meals", 3, 50f));
        //To print the added items in list we use Stream API
      /*  List<Float> ArraysList = List1.stream().filter(p -> p.price>10).map(p -> p.price).collect(Collectors.toList());
        System.out.println(List1);/*

       List<Float> ArrayList = List1.Stream().filter(p -> p.price>10).map(p -> p.price).collect(Collectors.toList());*/
        // print price using collections
        List<Float> list2= new ArrayList<>();
        for (Items p : List1) {
            if (p.price > 10f) {
            list2.add(p.price);
            }
        }
        System.out.println(list2);
    }
}

