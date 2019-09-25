/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn.buoinghi;

/**
 *
 * @author CasMoif
 */
public class BtvnBuoinghi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 6, 7};
        boolean giamdan = true;
        boolean tangdan = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                tangdan = false;
            }
            if (array[i] < array[i + 1]) {
                giamdan = false;
            }
        }
            if ( tangdan ){ 
    }
}
}