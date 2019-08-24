/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai.pkg1.kho.vc;

import java.util.Scanner;

/**
 *
 * @author Huucock
 */
public class Bai1KhoVc {

    public static void main(String[] args) {
        System.out.println("nhap vao so tu nhien: ");
        int a = new Scanner(System.in).nextInt();
        
        System.out.println("nhap vao so tu nhien: ");
        int b = new Scanner(System.in).nextInt();
        
        System.out.println("nhap vao so tu nhien: ");
        int c = new Scanner(System.in).nextInt();
        
        System.out.println("nhap vao so tu nhien: ");
        int d = new Scanner(System.in).nextInt();
        
        System.out.println("nhap vao so tu nhien: ");
        int e = new Scanner(System.in).nextInt();
        
        System.out.println("sap xep lai: ");
        if(a<b) { int x; 
         x = a;
         a = b;
         b = x;
            System.out.println(x);  
            
        }

}
}