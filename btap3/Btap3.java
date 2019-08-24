/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btap3;

import java.util.Scanner;

public class Btap3 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        ///// bài số 1 dễ
        int dodai = 10, sum = 10;

        Scanner sc = new Scanner(System.in);

        System.out.println("mảng gồm 10 phần tử: ");

        int[] array = new int[dodai];

        for (int i = 0; i < dodai; i++) {
            System.out.println("phẩn tử thứ " + i + ": ");
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < dodai; i++) {
            sum += array[i];
        }
        System.out.println("tổng các phần tử mảng: " + sum);

        //// bài số 2 dễ , bài này lỗi quá em làm mãi mà không đc @@!
        int c = 0, l = 0;

        int[] ch = new int[dodai];
        int[] le = new int[dodai];

        for (int i = 0; i < dodai; i++) {
            if (array[i] % 2 == 0) {
                ch[c] = array[i];
                c++;

            } else {
                le[l] = array[i];
                l++;
            }
        }
        System.out.println("các số chẵn trong mảng là: ");
        for (int i = 0; i < dodai; i++) {
            System.out.println(ch[i]);
        }
        System.out.println("các số lẻ trong mảng lả: ");
        for (int i = 0; i < dodai; i++) {
            System.out.println(le[i]);
        }
        /// in ra các phần tử chia hết cho 2
        System.out.println("các phần tử chia hết cho 2: ");

        for (int i = 0; i < dodai; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }

        }
        /// các phần tử chia hết cho 5 dư 1 

        System.out.println("các phần tử chia hết cho 5 dư 1 là: ");
        for (int i = 0; i < dodai; i++) {
            if (array[i] % 5 == 1) {
                System.out.println(array[i]);

            }
        }

        /// tổng chẵn
    }
}
