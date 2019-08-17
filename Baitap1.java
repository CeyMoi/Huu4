
package baitap.pkg1;

import java.util.Scanner;


public class Baitap1 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         double a;
             double b;
             
             System.out.println("Nhap a: ");
       a = sc.nextDouble();
             System.out.println("Nhap b: ");
       b = sc.nextDouble();
    
    double T; T = (double) a+b; // T = tong
    System.out.println("T=" + T );
    
    double H; H = (double) a-b; // H = hieu
    System.out.println("H=" + H);
    
    double M; M = (double) a/b; // M = thuong
    System.out.println("M=" + M);
    
    double X; X = (double) a*b; // X = tich
    System.out.println("X=" + X);
   }
    
}
