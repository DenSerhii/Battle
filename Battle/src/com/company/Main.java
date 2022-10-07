package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
    //    Battlepoint battlepoint=new Battlepoint();

        System.out.println("Test");

//        ArrayList<Integer>arrayList=new ArrayList<>();
//        arrayList.add(1);
//        arrayList.add(2);
//        ArrayList<Integer>arrayList1=new ArrayList<>();
//        arrayList1.add(3);
//        arrayList1.add(1);
//        System.out.println(arrayList.indexOf(arrayList1.get(1)));

        ArrayList<Point>arrayList=new ArrayList<>();
        arrayList.add(new Point(1,1));
        arrayList.add(new Point(4,5));
        arrayList.add(new Point(3,8));

        System.out.println(arrayList);
        ArrayList<Point>arrayList1=new ArrayList<>();

        arrayList1.add(new Point(1,1));
        arrayList1.add(new Point(1,1));
        System.out.println(arrayList.indexOf(arrayList1.get(1)));
        System.out.println(arrayList.contains(arrayList1.get(0)));
        System.out.println(arrayList.contains(new Point(1,1)));
        Point point=new Point(3,8);
        System.out.println(point);
        System.out.println(arrayList.get(2)==point);

    }
}
