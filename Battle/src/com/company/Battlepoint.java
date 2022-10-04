package com.company;

import java.util.ArrayList;

public class Battlepoint {
    ArrayList<Point> ship=new ArrayList<>();

    public void ShowMap(){
        System.out.println("  1  2  3  4  5  6  7  8  9");
    for (int i=0; i<10; i++) {
        for(int j=0; j<10; j++){
            Point d=new Point(i,j);
            if (j==0)
            System.out.print(i);
            else if(ship.indexOf(d)>-1) System.out.println(" x ");
            else   System.out.print(" - ");
        }
        System.out.println();
     }
    }
     public void shipPoints(){
        Point a =new Point(7,4);
        Point b= new Point(3,3);
        Point c=new Point(9,2);
        ship.add(a);
        ship.add(b);
        ship.add(c);


        }

    }
