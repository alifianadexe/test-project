/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testproject;

/**
 *
 * @author User
 */
public class TestProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("A11.2020.12481", 3.5);
        mahasiswa.nama = "Adexe";
        Pegawai pegawai = new Pegawai("K1120AUG", "AnbiDev");
        pegawai.nama = "Alifian Aqshol";
        
        mahasiswa.dataDiri();
        mahasiswa.buatTugas();
        
        pegawai.buatLaporan();
        
    }
    
}
