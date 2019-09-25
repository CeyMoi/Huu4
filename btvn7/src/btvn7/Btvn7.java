/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn7;

/**
 *
 * @author CasMoif
 */
public class Btvn7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] A = { 4, 4, 4, 4, 4 };
        int tongA = sum(A);
        System.out.println(tongA);
        
    }
    static int sum(int[] arr) {
         int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
