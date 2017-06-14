package Prolan;

public class Dokter<T> extends Suster2 {
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

    //override dari suster2.java
    @Override
    public void klm() {
        super.klm();
        System.out.println("Laki - Laki");
    }  
    @Override
    public void asisten() {
        super.asisten();
        System.out.println("Suster intan");
    }
    
    //keyword super
    @Override
    public void judulsuster() {
        super.judulsuster();

    }
}
