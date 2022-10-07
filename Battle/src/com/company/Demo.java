package com.company;

import java.util.ArrayList;

public class Demo {
        ArrayList<Point> targets = new ArrayList<Point>();
        public Demo(){
            createTargets();
            showMap();
            shoot(7,4);
            shoot(3,3);
            shoot(9,2);
            showMap();
        }
        private void showMap(){
            System.out.println("\n 1 2 3 4 5 6 7 8 9 ");
            for (int row=1;row<10;row++){
                for(int column=1;column<10;column++){
                    if (column==1){
                        System.out.print(row+" ");
                    }
                    System.out.print(" ");
                    Point cell=new Point(column,row);
                    if(targets.indexOf (cell)> -1){
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
        private void createTargets(){

            Point p1= new Point(5,9);
            targets.add(p1);
            Point p2=new Point(4,5);
            targets.add(p2);
            Point p3= new Point (9,2);
            targets.add(p3);
        }
        private void shoot (int x, int y){
            Point shot =new Point (x,y);
            System.out.print("Shot on ( "+x+","+y+" ). . . ");
            if (targets.indexOf (shot)> -1){

                System.out.println("You have sunk a Battleship!");
                targets.remove(shot);
            } else{
                System.out.println("Past .");
            }
        }


        public static void main (String []args){
            new Demo ();
        }
    }
