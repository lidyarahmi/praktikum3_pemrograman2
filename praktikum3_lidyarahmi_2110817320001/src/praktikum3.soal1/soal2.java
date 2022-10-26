/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum3.soal1;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author LIDYA RAHMI
 */
public class soal2 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
       
            
            LinkedList<Negara> list = new LinkedList<>();
            int j;
            j = input.nextInt();
            input.nextLine();
            
            for(int i=0 ;i<j; i++){
                list.add(inputan());
            }
            while(!list.isEmpty()){
                list.poll().detailStatus();
            }
    }
            
            public static Negara inputan(){
            String nama;
            String j_pemimpin;
            String namaPemimpin;
            int tglKemerdekaan;
            int bulan_kemerdekaan;
            int tahun_kemerdekaan;   
             
             nama = input.nextLine();
             j_pemimpin = input.nextLine();
             namaPemimpin= input.nextLine();

            if(Negara.isMonarki(j_pemimpin)){ 
            return new Negara(nama, j_pemimpin, namaPemimpin);
            }
            
         tglKemerdekaan = input.nextInt();
         input.nextLine();
         bulan_kemerdekaan = input.nextInt();
         input.nextLine();
          tahun_kemerdekaan = input.nextInt();
          input.nextLine();
        return new Negara(nama, j_pemimpin, namaPemimpin, tglKemerdekaan, bulan_kemerdekaan, tahun_kemerdekaan);

            
        }
   
}
        
  
