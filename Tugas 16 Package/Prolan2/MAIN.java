package Prolan2;

import Prolan.Rumahsakit;
public class MAIN extends Rumahsakit {
    public static void main(String[] args) {
            MAIN objekutama = new MAIN("Spesialis Anak");
               objekutama.utama(); 
    }
    public MAIN(String spes) {
        super(spes);
    }
}
