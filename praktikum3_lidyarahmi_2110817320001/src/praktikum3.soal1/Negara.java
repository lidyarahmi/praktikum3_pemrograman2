/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3.soal1;


import java.util.HashMap;


/**
 *
 * @author LIDYA RAHMI
 */
public final class Negara {

         HashMap<Integer, String> bulan = new HashMap<>();
 private String nama;
 private  String j_pemimpin;
 private String namaPemimpin;
 private  int tglKemerdekaan;
 private Integer bulan_kemerdekaan;
 private  int tahun_kemerdekaan;   

//constructor//
public Negara(String nama, String j_pemimpin, String namaPemimpitahun_kemerdekaan){
this.nama=nama;
this.j_pemimpin=j_pemimpin;
this.namaPemimpin=namaPemimpin;
tampilBulan();
}

public Negara(String nama, String j_pemimpin, String namaPemimpin, int tglKemerdekaan, int bulan_kemerdekaan, int tahun_kemerdekaan){
this.nama=nama;
this.j_pemimpin=j_pemimpin;
this.namaPemimpin = namaPemimpin;
this.tglKemerdekaan=tglKemerdekaan;
this.bulan_kemerdekaan=bulan_kemerdekaan;
this.tahun_kemerdekaan=tahun_kemerdekaan;

tampilBulan();
}

void tampilBulan(){

        bulan.put(1, "Januari");
        bulan.put(2, "Februari");
        bulan.put(3, "Maret");
        bulan.put(4, "April");
        bulan.put(5, "Mei");
        bulan.put(6, "Juni");
        bulan.put(7, "Juli");
        bulan.put(8, "Agustus");
        bulan.put(9, "September");
        bulan.put(10, "Oktober");
        bulan.put(11, "November");
        bulan.put(12, "Desember");
        }


    public String getNama(){
return this.nama;
}

    public void setNama(String nama){
this.nama=nama;
}

public String getJpemimpin(){
return j_pemimpin;
}

public String setJpemimpin(){
  return  this.j_pemimpin = j_pemimpin;
}



public String getNamapemimpin(){
    return namaPemimpin;
}

public void setNamapemimpin(){
    this.namaPemimpin = namaPemimpin;
}

public int getTanggalKemerdekaan() {
        return tglKemerdekaan;
    }

    public void setTanggalKemerdekaan(int tglKemerdekaan) {
        this.tglKemerdekaan = tglKemerdekaan;
    }

    public int getBulanKemerdekaan() {
        return this.bulan_kemerdekaan;
    }
    
    public void setBulanKemerdekaan(int bulan_kemerdekaan){
        this.bulan_kemerdekaan=bulan_kemerdekaan;
    }
    
    public void setTahun_kemerdekaan(int tahun_kemerdekaan){
    this.tahun_kemerdekaan = tahun_kemerdekaan;
}
    
    public int AngkaBulan(){
        return this.bulan_kemerdekaan();
    }
    
    public String getNamaBulan(){
        return this.bulan.get(this.bulan_kemerdekaan);
    }
    
    public static boolean isMonarki(String j_pemimpin){
        return j_pemimpin.equalsIgnoreCase(" Monarki ");
    }
        
    /**
     *
     */
    public void detailStatus(){
    System.out.print("Negara ");
    System.out.print(this.nama);
    System.out.print(" mempunyai ");
    
    if(isMonarki(this.j_pemimpin)){
    System.out.print(" Raja ");
}else{ 
    System.out.print(this.j_pemimpin);
}
    System.out.print(" bernama ");
    System.out.print(namaPemimpin+"\n");
if(isMonarki(this.j_pemimpin)){
    return;
}
    System.out.print("Deklarasi Kemerdekaan pada Tanggal  ");
    System.out.println(this.tglKemerdekaan);
    System.out.println(this.getNamaBulan());
    System.out.println(this.tahun_kemerdekaan);
    System.out.println("\n\n");

    
    
    }  

    private int bulan_kemerdekaan() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private class bulan {

        public bulan() {
        }
    }


    }




    

   
    
  

    




  


