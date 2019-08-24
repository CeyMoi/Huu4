
package lesson3;

import java.util.Scanner;

public class Lesson3 {

   
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("so thu 1: ");
        int x = sc.nextInt();
        System.out.println("so thu 2: ");
        int y = sc.nextInt();
        
        int y1, y2, y3, result;
        ///y=123
        y1 = y%10; ///y1 = 123%10 = 3 
        y2 = (y%100)/10; ///y2 = 123%100 = 23, 23/10 = 2
        y3 = y/100; /// y3 = 123/100 = 1
            
        System.out.println("---------");
        System.out.println("  " + x);
        System.out.println("x");
        System.out.println("  " + y);
        System.out.println("----");
        System.out.println("   " + (x * y1));
        System.out.println("   " + (x * y2));
        System.out.println("   " + (x * y3));
        System.out.println("----");
        System.out.println(" " + x * y);
           
        
        
    }
    
}
