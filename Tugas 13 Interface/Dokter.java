package prolan11_Generic; 

public class Dokter<T> extends petugas {
    String spec;
    public void juduldokter() {
       System.out.println("============================================================================");
       System.out.println("                                Data Dokter                                 ");
       System.out.println("============================================================================");
    }

    //SUPER KONSTRAKTOR
    Dokter(String spec) {
        this.spec = spec;
    }
    public void getspec() {
        System.out.println("Spesialis       = " + spec);
    }

    //override dari petugas.java
    @Override
    public void klm() {
        super.klm();
        System.out.println("Laki - Laki");
    }  
    @Override
    public void asisten() {
        super.asisten();
        System.out.println("Asisten Petugas Hb Ryan");
    }
    
    //keyword super
    @Override
    public void judulpetugas() {
        super.judulpetugas();

    }
}