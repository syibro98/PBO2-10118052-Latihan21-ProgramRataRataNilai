/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118052.latihan21.programrataratanilai;

import java.util.Scanner;
/**
 * @author 
 * NAMA      : Bagus Syibro Malisi
 * KELAS     : PBO2
 * NIM       : 10118052
 * Deskripsi Program : Program ini bertujuan untuk mengethaui nilai rata rata 
 * dari mahasiswa menggunakan looping for.
 * 
 */
public class PBO210118052Latihan21ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukan Banyaknya Mahasiswa : ");
        Integer banyakMhs = scanner.nextInt();
        Double nilai = 0.0;
        
        for(Integer i = 1; i <= banyakMhs; i++) {
            System.out.print("Nilai Mahasiswa Ke-" + i + " : ");
            nilai += scanner.nextDouble();
        }
        
        System.out.println();
        System.out.println("Maka, rata-rata nilainya adalah : "
                + (nilai/banyakMhs));
        System.out.println("Developed by : Bagus Syibro Malisi");
        
    }
    
}