package com.company;

import java.util.ArrayList;

public class Battlepoint {
    ArrayList<Point> ship = new ArrayList<>();
    //add new
    public Battlepoint(){
        shipPoints();
        ShowMap();
        shoot(7,4);
        ship.forEach(a-> System.out.println(a));
        System.out.println(ship.contains (new Point(7,4)));
        shoot(3,3);
        System.out.println(ship.indexOf (new Point(7,4)));
        shoot(9,2);
        System.out.println(ship.indexOf (new Point(9,2)));
        ShowMap();


    }
//---------------------
        private void ShowMap(){
            System.out.println("\n   1 2 3 4 5 6 7 8 9 ");
            for (int row=1;row<10;row++){
                for(int column=1;column<10;column++){
                    if (column==1){
                        System.out.print(row+" ");
                    }
                    System.out.print(" ");
                    Point cell=new Point(column,row);
                    if(ship.indexOf (cell)> -1){
                        System.out.print("X");
                    } else{
                        System.out.print(".");
                    }
                    System.out.print(" ");
                }
                System.out.println();
            }
            System.out.println();
        }
//    public void ShowMap() {
//        System.out.println("  1  2  3  4  5  6  7  8  9");
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                Point d = new Point(i, j);
//                if (j == 0)
//                    System.out.print(i);
//                else if (ship.indexOf(d) > -1) System.out.println(" x ");
//                else System.out.print(" - ");
//            }
//            System.out.println();
//        }
//    }

    public void shipPoints() {
        Point a = new Point(7, 4);
        Point b = new Point(3, 3);
        Point c = new Point(9, 2);
        ship.add(a);
        ship.add(b);
        ship.add(c);


    }

//add new
    private void shoot(int x, int y) {
        Point shot = new Point(x, y);
        System.out.print("Shot on ( " + x + "," + y + " ). . . ");
        if (ship.indexOf(shot) > -1) {

            System.out.println("You have sunk a Battleship!");
            ship.remove(shot);
        } else {
            System.out.println("Past .");
        }

    }
}
