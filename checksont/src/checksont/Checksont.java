/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checksont;

/**
 *
 * @author CasMoif
 */
public class Checksont {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int n = 9;
       if(n > 0){
           if (checksoNT(n)==1)
               System.out.println(n+"la so nguyen to");
           else 
               System.out.println(n+"khong phai so nguyen to");
       }
       
    }
    
}
