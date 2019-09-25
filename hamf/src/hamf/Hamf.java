/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hamf;

import java.util.Scanner;

/**
 *
 * @author CasMoif
 */
public class Hamf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap so a: ");

        int a = sc.nextInt();

        boolean lasoNT = soNT(a);///khai bao ham

        if (lasoNT == true) {
            System.out.println(a + " La so nt");
        }
        if (lasoNT == false){
            System.out.println(a+ "khong phai so nt");
        }

    }

    static boolean soNT(int a) {// day la ham
        if (a < 2) {
            return false;
        }
        int k = (int) Math.sqrt(a);
        for (int i = 2; i <= k; i++) {
            if (a % i == 0) {
                return false;
            }
        }

        return true;
    }
}
