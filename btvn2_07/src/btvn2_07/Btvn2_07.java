/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn2_07;

/**
 *
 * @author CasMoif
 */
public class Btvn2_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 3;
        boolean check = snt(a);
        System.out.println(check);
    }
    static boolean snt( int a) {
             if ( a % 2 == 0){
                return true;
                
            }else{
                return false;
            }
    }
}
