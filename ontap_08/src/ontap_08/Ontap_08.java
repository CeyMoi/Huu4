/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontap_08;

import java.util.Scanner;

/**
 *
 * @author CasMoif
 */
public class Ontap_08 {

    static int x, y;
    static int endX, endY;
    static final int LENGTH = 5; // co dinh bang 5 

    public static void main(String[] args) {

        endX = 4;
        endY = 4;
        x = 2;
        y = 2;
            show();
        String vuanhap = input();
        move(vuanhap);
        show();
      boolean thangHayChua = check();
    }

    static void show() {
        for (int i = 0; i < LENGTH; i++) {
            for (int j = 0; j < LENGTH; j++) {
                if (i == y && j == x) {
                    System.out.print("X ");
                } else if (i == endX && j == endY) {
                    System.out.print("O ");
                } else {
                    System.out.print("- ");
                }

            }
            System.out.println();
        }
    }

    static String input() {
        System.out.println("nhap vao: TRAI PHAI TREN DUOI");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        return input;
    }

    static void move(String vuanhap) {
        switch (vuanhap) {
            case "trai":
                x = x - 1;
                break;

            case "phai":
                x = x + 1;
                break;
               

            case "tren":
                y = y - 1;
                break;

            case "xuong":
                y = y + 1;
                break;

        }
    }

     static boolean check() {
       
         if ( x == endX && y == endY){
             return true;
                 
         }
            return false;
    }
}
