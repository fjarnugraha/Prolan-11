package Prolan;

class Suster2 extends pendonor {

    public static String klm        = "Jenis kelamin   = ";
    protected static String asisten = "asisten         = ";
    String id;
    String kelamin;
    String kamar;

    void isiData(String id, String nama, String alamat, String kelamin, String kamar) {
        this.nama       = nama;
        this.id         = id;
        this.alamat     = alamat;
        this.kelamin    = kelamin;
        this.kamar      = kamar;
    }
    
    //override ke class dokter
    public void judulsuster() {
       System.out.println("============================================================================");
       System.out.println("                                Data suster                                 ");
       System.out.println("============================================================================");
    }
    public void klm() {
        System.out.print(klm);
    }
    public void asisten() {
        System.out.print(asisten);
    }
    
    
    //Abstrak class pendonor
    @Override
    protected String getNamaRS() {
        return super.getNamaRS();
    }

    @Override
    public void printNamaRS() {
        System.out.print(getNamaRS());
    }

    @Override
    protected String getAlamatRS() {
        return super.getAlamatRS();
    }

    @Override
    public void printAlamatRS() {
        System.out.println(getAlamatRS());
    }
    
    //interfaces
    public void NoHpdokter() {
        System.out.println("No HandPhone    = 0838123499");
    }

        public void NoHpSuster() {
        System.out.println("No HandPhone    = 0898171722");
    }

        public void NoHpwalipasien() {
        System.out.println("No HandPhone     = 089817212342");
    }
}
