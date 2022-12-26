package com.demoStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AddingItems {
    public static void main(String[] args) {
        List<Items1> itemslist = new ArrayList<>();
        itemslist.add(new Items1("APPLE",1,20000) );
        itemslist.add(new Items1("Sony vio", 2, 30000 ));
        itemslist.add(new Items1("Intel Core",3,25000) );
        // Printing by using Stream API
        List<Float> floatList1=itemslist.stream().filter(p -> p.price>10000f).map(p->p.price).collect(Collectors.toList());
        System.out.println(itemslist);
    }
}
