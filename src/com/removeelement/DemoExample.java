package com.removeelement;

import java.util.ArrayList;
import java.util.Scanner;

public class DemoExample {
    public static void main(String[] args) {
        //creating arraylist with datatype string
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Sreekanth");
        arrayList.add("Sujit");
        arrayList.add("Ajeet");
        arrayList.add("Ram");
        arrayList.add("Aniket");
// calling removeElement method by using object with the class name
        DemoExample d =new DemoExample();
           d.removeElements(arrayList);//passing reference of Arraylist as argument
    }
    public void removeElements(ArrayList<String> arrayList){//passing reference of Arraylist as argument
        Scanner sc = new Scanner(System.in);
         String remove = sc.next();
         //iterating arraylist
         for (int i = 0; i<arrayList.size(); i++){
         if (arrayList.get(i).equals(remove)){
             arrayList.remove(i);
         }

         }
        System.out.println(arrayList);
    }
}
