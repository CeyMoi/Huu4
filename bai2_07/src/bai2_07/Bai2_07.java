/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2_07;

import java.util.Scanner;

/**
 *
 * @author CasMoif
 */
public class Bai2_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        a = sc.nextInt();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên vào đây: ");
        boolean check = snt(a);
        if ( check == true ){
            System.out.println(check+" là số chẵn");
        }else{
            System.out.println(check+" là số lẻ");
        }
        

    }
static boolean snt( int a){
    if(a%2==0){
            
            return true;
        }else{
                return false;
            }
}
}
