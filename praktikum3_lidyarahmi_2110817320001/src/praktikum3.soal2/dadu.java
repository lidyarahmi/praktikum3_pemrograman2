/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3.soal2;
import java.util.LinkedList;


/**
 *
 * @author LIDYA RAHMI
 */
public class dadu {
    public int inputAngka;
    public int minimal = 1;
    public int maximal =6;
    int totalKeseluruhan;
   
  
    public void setinputAngka(int inputAngka){
        this.inputAngka= inputAngka;
    }
    
    
    void acakNilai(){
        LinkedList<Integer> lempar_dadu = new LinkedList<>();
        lempar_dadu.add(1);lempar_dadu.add(2);lempar_dadu.add(3);lempar_dadu.add(4);lempar_dadu.add(5);
        lempar_dadu.add(6);
        for (int i = 0; i < inputAngka; i++){
            int random_dadu = (int)Math.floor(Math.random()*(maximal-minimal+1)+minimal);
            System.out.println("Dadu ke-" + (i + 1) + " bernilai "+ random_dadu);
            totalKeseluruhan += random_dadu;
        }
        System.out.println("Total Nilai Dadu Keseluruhan "+ totalKeseluruhan);
    }
    
}
