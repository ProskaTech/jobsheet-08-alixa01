// Created by 21343040_alixa arivya tofer
package com.mycompany.js8;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class tugas2 {
    public static void main(String args[]){
        Scanner dataIn = new Scanner (System.in);
        
        int [] a = new int [10];
        int bnykData = 10, angkaBsr, i;
        
        System.out.println("Masukkan 10 angka : ");
        for(i = 0; i < bnykData; i++){
            a[i] = dataIn.nextInt();
        }
        System.out.println();
        
        angkaBsr = a[0];
        
        for(i = 0; i < bnykData; i++){
            if(a[i] > angkaBsr){
                angkaBsr = a[i];
            }
        }
        System.out.println("Angka Terbesar : "+angkaBsr);
        
    }
}
