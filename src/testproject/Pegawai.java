/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testproject;

/**
 *
 * @author User
 */
public class Pegawai extends Manusia{
    String nik;
    String department;
    
    public Pegawai(String nik, String department){
        this.nik = nik;
        this.department = department;
    }
    
    public void buatLaporan(){
        System.out.println("Buat Laporan Untuk Nama : " + this.nama +" this nik " + this.nik +" For Department " + this.department);
    }
    
    public void berangkatKerja(){
        System.out.println("Berangkat Kerja");
    }
    
    public void pulangKerja(){
        System.out.println("Pulang Kerja");
    }
}
