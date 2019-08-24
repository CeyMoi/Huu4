package lesson1;

import java.util.Scanner;

public class Lesson1 {

    public static void main(String[] args) {
        float a = 7;
        int A = 8;
        int b = 3;
        float x;
        x = -b/a;
        int sodu = 7 % 3;
        System.out.println(sodu);
        Scanner sc = new Scanner(System.in);

        int B;
        System.out.println("Nhap vao B: ");
        B = sc.nextInt();// chi nhap so nguyen
        System.out.println("Gia tri vua nhap la: " + B);

// \n xuong dong , %d decimal %s string ,% f float
        int q = 3;
        int p = 5;
        System.out.printf("p=%d \nq=%d\n", p,q);    // decimal = %d , %s string, %f  
        
        // my + n = 0
        double m;
        System.out.println("nhap vao m: ");
        m = sc.nextDouble();
        double n;
        System.out.println("nhap vao n: ");
        n= sc.nextDouble();
        double y;
        
        y=-n/m;
        System.out.println("y="+y);
       
        
    }

}