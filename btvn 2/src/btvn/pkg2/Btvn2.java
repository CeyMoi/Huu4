/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn.pkg2;

/**
 *
 * @author CasMoif
 */
public class Btvn2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = {111, 335, 4235, 3787, 75655};
        for (int i = 0; i < array.length; i++) {
            int a = 123;
            String s = String.valueOf(array[i]);
            char firstChar = s.charAt(0);
            int value = firstChar - '0';
            if (value % 2 == 1) {
                System.out.println("phan tu dau tien co chu so bat dau la so le: " + array[i]);
            }
        }
        for (int i = 0; i < array.length; i++) { /// cach 2 
            int pthientai = array[i];
            while (pthientai >= 10) {
                pthientai = pthientai / 10;

            }
            System.out.println(pthientai);
            if (pthientai % 2 == 1) {
                System.out.println("phan tu dau tien co chu so bat dau la so le: " + array[i]);
            }
        }

    }
}
