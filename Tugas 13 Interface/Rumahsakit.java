package prolan11_Generic; 

import java.util.Scanner;
public class Rumahsakit extends Dokter {
    public void utama(){
        Scanner input = new Scanner(System.in);
        byte pil;
    
        Rumahsakit method = new Rumahsakit("Donor Darah");            //buat objek untuk isi overlaoding
        System.out.println("=================================");         //isi overlaoding
        method.slogan     ("===== DATA PMI KOTA BANDUNG =====");         //isi overlaoding nama
        method.slogan     ("=======  Donorkan Darahmu   ========");    //isi overlaoding nama1 + nama2
        System.out.println("=================================");      
        System.out.println(" 1. Data Dokter");
        System.out.println(" 2. Data Petugas");
        System.out.println(" 3. Data Pendonor");
        System.out.println(" 4. Data Donor Pengganti");
        System.out.println(" 5. exit");
        System.out.println("=================================");
        System.out.print("Masukan pilihan anda : ");
                 pil = Byte.parseByte(input.next());
         System.out.println("\n");
        switch(pil){
            case 1:{
                //membuat objek  untuk menampilkan class dokter
                Rumahsakit methoddkt = new Rumahsakit("Donor Darah");
                           methoddkt.tampilkanDOKTER();
                           methoddkt.klm();        //pemanggilan override
                           methoddkt.asisten();    //pemanggilan override
                           methoddkt.NoHpdokter(); //interface
                           System.out.println("============================================================================");
                           methoddkt.printNamaRS();    //tampilkan abstrak
                           methoddkt.printAlamatRS();  //tampilkan abstrak
                           methoddkt.getkopy();                             //tampilkan enkasulapsi
                                System.out.println(methoddkt.getkopy());    //tampilkan enkasulapsi
                break;
            }
            case 2:{
                 //tampilkan data  this petugas
                 petugas petugas1 = new petugas();
                         petugas1.isiData("A101", "Ryan", "Ciparay", "laki - laki", "anggrek");
                            spetugas1.judulpetugas();       //pemanggilan override
                            System.out.println("Id              = " + petugas1.id);
                            System.out.println("Nama            = " + petugas1.nama);
                            System.out.println("Alamat          = " + petugas1.alamat);
                            System.out.println("jenis kelamin   = " + petugas1.kelamin);
                            System.out.println("no antrian pendonor = " + petugas1.nopendonor);
                            petugas1. NoHppetugas();    //interfaces
                            System.out.println("============================================================================");
                            petugas1.printNamaRS();    //tampilkan abstrak
                            petugas1.printAlamatRS();  //tampilkan abstrak
                            petugas1.getkopy();                              //tampilkan enkasulapsi
                                System.out.println(petugas1.getkopy());    //tampilkan enkasulapsi
                            
                 break;
            }
            case 3:{
                //data keluaran pendonor.java (extends Rumahsakit)
                Rumahsakit dnr = new Rumahsakit("Donor Darah");
                           dnr.judulpendonor();    //pemanggilan super konstraktor
                           dnr.datapendonor();     //pemanggilan super konstraktor
                           dnr.NoHpkeluargapendonor(); //interfaces
                           dnr.datasakit();      //pemanggilan super konstraktor
                           dnr.printNamaRS();    //tampilkan abstrak
                           dnr.printAlamatRS();  //tampilkan abstrak  
                           dnr.getkopy();                              //tampilkan enkasulapsi
                                System.out.println(dnr.getkopy());    //tampilkan enkasulapsi       
                break;
            }
            case 4:{
                //generic
                donorpengganti <String>  objekstr = new donorpengganti<>();
                donorpengganti <Integer> objekbyt = new donorpengganti<>();
                objekstr.juduldonorpengganti();
                    objekstr.setnama("Endang Maulana");
                System.out.println("nama           = "+ objekstr.getnama());      
                    objekbyt.setumur(20);
                System.out.println("umur           = "+ objekbyt.getumur());  
                    objekstr.setalamat("Majalengka");
                System.out.println("alamat         = "+ objekstr.getalamat());    
                    objekstr.setkelamin("Laki - Laki");
                System.out.println("jenis kelamain = "+ objekstr.getkelamin());   
                System.out.println("status         = "+ objekbyt.status());
             break;
            }
            case 5:{
             System.exit(0);
             break;
            }
        }//tutup switch
            //kembali ke menu utama
            System.out.println();
            System.out.println("============================================================================");
            System.out.print("Tekan 1 untuk kembali ke menu utama, Tekan 2 jika Tidak  = ");
                int yn = input.nextInt();
            System.out.println("============================================================================");    
            if(yn == 1){
                utama();
            } else{
                System.exit(0);
            }
    }//tutup public static void main

    //overloading dan parameter 
    private void slogan(String nama) { 
        System.out.println(nama); 
    }
    private void slogan(String nama1, String nama2) {
        System.out.println(nama1 + nama2);
    }
        
    //SUPER KONTRAKTOR
    Rumahsakit(String spes) {
        super(spes);
    }
    //pendeklarasian super pada atribut dan method
    public void riwayat() {
        System.out.print("Riwayat goldar =  ");
    }  
    public void datasakit() {
        int num = 0;
        System.out.println("Tidak ada = " + super.kondisi);
        riwayat();
        super.Riwayatdonor();
        System.out.println("\t\t    " + num + "kali karena donor pertama ");
        System.out.println("============================================================================");
    }
     
public void tampilkanDOKTER() {
        //extends Rumahsakit
        Rumahsakit dnr = new Rumahsakit("Donor Darah");
        dnr.id     = "A012";                      //data dokter
        dnr.nama   = "Edy Kustriyadi";        //data dokter
        dnr.umur   = 32;                          //data dokter
        dnr.alamat = "JL.Aceh,Bandung";      //data dokter      
        dnr.juduldokter();                                        //data keluaran dokter.java
        System.out.println("ID              = " + dnr.id);        //data keluaran dokter.java
        System.out.println("nama dokter     = " + dnr.nama);      //data keluaran dokter.java
        System.out.println("umur            = " + dnr.umur);      //data keluaran dokter.java
        System.out.println("alamat          = " + dnr.alamat);    //data keluaran dokter.java
        dnr.getspec(); //SUPER KONSTRAKTOR spesialis
        
    }    
}