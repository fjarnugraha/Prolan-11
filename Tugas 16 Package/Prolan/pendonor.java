package Prolan;

public abstract class pendonor extends Nohandphone {

    String goldar;

    String tgldaftar, alamat, nama;
    byte umur;
    String kondisi = "Normal";
    
    //enkasuplasi
    private final String kopy = "\t\t\t Copyright © 2017 PMI Kota Bandung"; 
    public String getkopy(){
        return kopy;
    }
    
    //Abstrak 
    protected String namarumahsakit = "\t\t PMI Kota Bandung";
    protected String alamatrumahsakit = " jl.Aceh No.79, Cihapit, Bandung Wetan, Kota Bandung, Jawa Barat 40114";
    protected String getNamaRS() {
        return namarumahsakit;
    }
    protected String getAlamatRS() {
        return alamatrumahsakit;
    }
    public abstract void printNamaRS();     //-> abstract method
    public abstract void printAlamatRS();   //-> abstract method

    protected void datapendonor() {
        nama        = "Fajar Nugraha Sugiarto";
        goldar    = "Golongan Darah O";
        tgldaftar    = "04 Maret 2017";
        alamat      = "JL. Dipatiukur,Bandung";
        umur        = 20;
           
        System.out.println("nama pendonor      = " + nama);
        System.out.println("umur pendonor      = " + umur);   
        System.out.println("goldar         = " + goldar);
        System.out.println("Alamat           = " + alamat);
        System.out.println("tanggal daftar    = " + tgldaftar);
    }
    
    public void judulpasien() {
       System.out.println("============================================================================");
       System.out.println("                              Data pendonor                                 ");
       System.out.println("============================================================================");
    }
   
    public void Riwayatsakit() {
        System.out.println("13 hari dirawat karna campak");
    }
}
