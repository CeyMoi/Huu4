package pkg1;

import java.util.Scanner;

/////Viết một chương trình input là 2 số thực a và b. Output là tổng, hiệu, tích, lũy thừa, thương của 2 số a và b.
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        System.out.println("nhập a: ");
        a = sc.nextDouble();
        System.out.println("nhập b: ");
        b = sc.nextDouble();

        double T;
        T = (double) a + b;
        System.out.println("Tổng= " + T);

        double H;
        H = (double) a - b;
        System.out.println("Hiệu= " + H);

        double D;
        D = (double) a / b;
        System.out.println("Thương= " + D);

        double TH;
        TH = (double) a * b;
        System.out.println("Tích" + TH);

    }

}
