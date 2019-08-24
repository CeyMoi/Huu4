/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson2;

import java.util.Scanner;

public class Lesson2 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        if (1 == 1) {
            // toan tu so sanh: innt float char byte long
            // > < >= <= != (equals)
        }
        // ax + b = 0
        // x = -b/a

        // ax^2 + bx + c = 0
        // a = 0 thi giai pt bx + c = 0
        // a !=0 thi delta = b*b - 4 + ac
        // delta < 0 vo nghiem dealta >0 2 nghiem
        float a = 9;
        float b = 10;
        float c = 5;

        if (a == 0) { // giai pt ax + b = 0
            if (b == 0) {
                if (c == 0) {
                    System.out.println("phuong trinh vo so nghiem.");

                }
                int delta = 0;
                if (delta == 0) {
                    System.out.println("nghiem kep: " + (-b / 2 / a));
                }
                if (delta > 0) {
                    System.out.println("co nghiem: ");
                    float x1 = (float) ()
                }

            }
        }
        int n = -3;
        String k;

        k = (n > 0) ? ("N lon hon 0") : ("N nho hon 0");
        System.out.println(k); // k = ( (condition) ? (true value) : (false value) ) 
        int aa = 3;
        int bb = 4;
        System.out.println(aa > bb ? (aa + ">" + bb) : (aa + "<" + bb));

        int condition = 0;
        while (true) {
            System.out.println(" huu ");
            condition = new Scanner(System.in).nextInt();
            if (condition == 9) {
                break;
            } else {
                System.out.println("so vua nhap ko phai 9");
            }

        }
             for ( int j = 0; j < 10; j++) {
                 if(j==3||j==7) continue;
                 System.out.println("j="+j);
             } 
        
        System.out.println("nhap vao so: ");
        int z = new Scanner(System.in).nextInt();
        System.out.println("so chan la: ");
        for ( int j=1 ; j < z;j++ ) {
        if(j%2==0){
            System.out.println(j); // nhap vao 1 so, in ra so chan 
        }
             }
        System.out.println("nhap vao so: ");
        int v = new Scanner(System.in).nextInt();
        System.out.println("uoc la: ");
        for (int x=1 ; x < v ; x++ ) {
            //
            System.out.println("x: " + x + " v: " + v);
            if(v%x==0){
                System.out.println(x);
            }
        }
    }
}


