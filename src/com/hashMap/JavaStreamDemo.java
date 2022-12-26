package com.hashMap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamDemo {
    public static void main(String[] args) {
        List<Product1> product1List = new ArrayList<>();
        product1List.add(new Product1(1,"Hp",30000f));
        product1List.add(new Product1(2,"Lenovo",30000f));
        product1List.add(new Product1(3,"Ascer",30000f));
        product1List.add(new Product1(4,"Dell",10000f));
        //By using Stream API
        List<Float> pricelist2 = product1List.stream().filter(p -> p.price > 400000f).map(p->p.price).collect(Collectors.toList());
        System.out.println(pricelist2);
    }
}
