package prolan11_Generic; 

public class Main extends Rumahsakit {
    public static void main(String[] args) {
            Main objekutama = new Main("Donor Darah");
               objekutama.utama(); 
    }
    public Main(String spes) {
        super(spes);
    }
}