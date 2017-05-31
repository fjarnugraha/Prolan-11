package prolan11_Generic; 

class petugas extends pendonor {

    public static String klm        = "Jenis kelamin   = ";
    protected static String asisten = "Asisten         = ";
    String id;
    String kelamin;
    String nopendonor;

    void isiData(String id, String nama, String alamat, String kelamin, String nopendonor) {
        this.nama       = nama;
        this.id         = id;
        this.alamat     = alamat;
        this.kelamin    = kelamin;
        this.nopendonor      = nopendonor;
    }
    //override ke class dokter
    public void judulpetugas() {
       System.out.println("============================================================================");
       System.out.println("                                Data petugas                                 ");
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
    @Override
    public void NoHpdokter() {
        System.out.println("No HandPhone    = 0838123499");
    }

    @Override
    public void NoHppetugas() {
        System.out.println("No HandPhone    = 0898171722");
    }

    @Override
    public void NoHpkeluargapendonor() {
        System.out.println("No HandPhone     = 089817212342");
    }
}