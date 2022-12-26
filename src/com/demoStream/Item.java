package com.demoStream;
import java.util.ArrayList;
import  java.util.List;
import java.util.stream.Collectors;

public class Item {
    int id;
    String name;
    float price;

    public Item(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

}

class StreamDemo {
    public static void main(String[] args) {
        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item(1, "HP", 50000f));
        itemList.add(new Item(2, "Lenvo", 40000f));
        itemList.add(new Item(3, "Dell", 45000f));
        itemList.add(new Item(4, "Samsung", 55000f));
        // Print price using collection
        //       List<Float> itemPriceList = new ArrayList<>();
//        for (Item p : itemList){
//            if (p.price < 55000f){
//                itemPriceList.add(p.price);
//            }
//        }
//        System.out.println(itemPriceList);
//    }

        //Print price using Stream API
        List<Float> itemPriceList = itemList.stream().filter(p -> p.price < 55000f).map(p->p.price).collect(Collectors.toList());
        System.out.println(itemPriceList);
    }
}

