/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn07;

/**
 *
 * @author CasMoif
 */
public class Btvn07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] A = {4, 4, 4, 4, 4, 4};
        int sumA = sum(A);
        System.out.println(sumA);
        

    

    static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];

        }
        return sum;
    }

}
}
