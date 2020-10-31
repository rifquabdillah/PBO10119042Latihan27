/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpbo;
import java.util.Locale;
import java.util.Scanner;

/**
 *@author Muhammad RIfqu Abdillah
 * Nama : Muhammad Rifqu Abdillah
 * Kelas: Pbo-IF1
 * Nim : 10119042 
 * 
 */
public class PBO10119042Latihan27 {
 public static void main(String[] args) {
        String besar, kecil;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Kalimat : ");
        String nama = scanner.nextLine();
        System.out.println();
        System.out.println("====Hasil Formatting====");
        System.out.println("Huruf Besar : "+nama.toUpperCase());
        System.out.println("Huruf Kecil : "+nama.toLowerCase());
    }
}   

