/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;

/**
 *
 * @author ASUS
 */
public class Mahasiswa extends Manusia implements Kasir,Koki,Kurir  {

    /**
     * @return the Nama
     */
    protected String getNama() {
        return Nama;
    }

    /**
     * @param Nama the Nama to set
     */
    protected void setNama(String Nama) {
        this.Nama = Nama;
    }

    /**
     * @return the NIM
     */
    protected String getNIM() {
        return NIM;
    }

    /**
     * @param NIM the NIM to set
     */
    protected void setNIM(String NIM) {
        this.NIM = NIM;
    }
    
    private String Nama;
    private String NIM;

    
    public Mahasiswa(String Nama, String NIM, String Makan, String Belajar) {
        super(Makan, Belajar);
        this.Nama = Nama;
        this.NIM = NIM;
    }
    
    
    public void Menghitung() {
        System.out.println("Sedang menghitung uang.");
    }
    public void Menscan() {
        System.out.println("Sedang menscan barang.");
    }
    public void Memberikan() {
        System.out.println("Sedang memberikan struk.");
    }
    public void Memasak() {
        System.out.println("Sedang memasak lauk.");
    }
    public void Memotong() {
        System.out.println("Sedang memotong sayur.");
    }
    public void Mencuci() {
        System.out.println("Sedang mencuci kentang.");
    }
    public void Mencari() {
        System.out.println("Sedang mencari alamat.");
    }
    public void Mengantar() {
        System.out.println("Sedang mengantar paket.");
    }
    public void Mendokumentasi() {
        System.out.println("Sedang mendokumentasi penerima.");
    }
    
    
    public static void main(String[] args) {
        Mahasiswa budi = new Mahasiswa("Budi", "09010624111", "Nasi", "PBO");
        
        System.out.println("Nama Mahasiswa     : " + budi.getNama());
        System.out.println("NIM Mahasiswa      : " + budi.getNIM());
        System.out.println("Makanan pokok Budi : " + budi.getMakan());
        System.out.println("Budi mempelajari   : " + budi.getBelajar());
        
        System.out.println("");
        System.out.println("Aktivitas Budi di pagi hari yang bekerja sebagai Kasir");
        budi.Menghitung();
        budi.Menscan();
        budi.Memberikan();
        
        System.out.println("");
        System.out.println("Aktivitas Budi di siang hari yang bekerja sebagai Koki");
        budi.Memasak();
        budi.Memotong();
        budi.Mencuci();
        
        System.out.println("");
        System.out.println("Aktivitas Budi pada waktu weekend yang bekerja sebagai Kurir");
        budi.Mencari();
        budi.Mengantar();
        budi.Mendokumentasi();
          
    }
}

    
