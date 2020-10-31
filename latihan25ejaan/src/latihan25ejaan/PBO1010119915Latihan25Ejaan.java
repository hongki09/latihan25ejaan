/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan25ejaan;

import java.util.Scanner;

/**
 *
 * @author M Hongki Alfikram
 * Kelas : IF10-K
 * NIM :10119915
 */
public class PBO1010119915Latihan25Ejaan {
    static String nama;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input_value = new Scanner(System.in);
        
        System.out.print("Masukkan Nama depan anda untuk di eja : ");
        nama = input_value.nextLine();
        
        System.out.println("Ejaan untuk \""+nama+"\" adalah : ");
       for (int i = 0; i < nama.length(); i++) {
            System.out.println("Huruf ke-"+(i+1)+" : "+nama.charAt(i));
        }
        // TODO code application logic here
    }
    
}
