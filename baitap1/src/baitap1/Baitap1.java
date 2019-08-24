package baitap1;

import java.util.Scanner;

public class Baitap1 {

    public static void main(String[] args) {
        int dodai = 10;
        int[] a = new int[dodai];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < dodai; i++) {
            System.out.println("nhap vao phan tu thu " + i + ": ");
            a[i] = sc.nextInt();
        }

        for (int index = 0; index < dodai; index++) {

            System.out.print("phan tu mang A tai vi tri: ");
            System.out.print(index);
            System.out.print(" la: ");
            System.out.print(a[index]);
            System.out.println();

            System.out.println("nhap phan tu tim kiem: ");
            int key = sc.nextInt();
            System.out.println("tim thay " + key + " o vi tri ");

        }
    }
}
