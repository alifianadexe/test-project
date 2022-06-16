/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testproject;

/**
 *
 * @author User
 */
public class Mahasiswa extends Manusia{
    String nim;
    double ipk;
    
    public Mahasiswa(String nim, double ipk){
        this.nim = nim;
        this.ipk = ipk;
    }
    
    public void dataDiri(){
        System.out.println("Nama : " + this.nama);
        System.out.println("NIK : " + this.nim);
        System.out.println("IPK : " + this.ipk);
    }
    
    public void buatTugas(){
       System.out.println("Buat Tugas Dong!");
    }
    
    public String lulus(){
        String lulus = "Kagak Lulus";
        if(ipk > 3){
            lulus = "Lulus Dong!";
        }
       return lulus;
    }
}
