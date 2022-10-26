/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum3.soal2;

import java.util.Scanner;


/**
 *
 * @author LIDYA RAHMI
 */
public class Soal1MainDadu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input = new Scanner(System.in);
       System.out.print("Lempar Nilai Dadu: ");
       
       dadu daduAcak = new dadu();
       int masuk = input.nextInt();
       
       daduAcak.setinputAngka(masuk);
       daduAcak.acakNilai();
      
               
    }
    
}
