package Prolan; 

import java.util.Scanner;

public class Rumahsakit extends Dokter {
    public void utama(){
        Scanner input = new Scanner(System.in);
        byte pil;
    
        Rumahsakit method = new Rumahsakit("Donor Darah");            //buat objek untuk isi overlaoding
        System.out.println("=============================================");         //isi overlaoding
        method.slogan     ("===== DATA RUMAH SAKIT PMI KOTA BANDUNG =====");         //isi overlaoding nama
        method.slogan     ("========== DarahMu Berharga BagiKU ==========");    //isi overlaoding nama1 + nama2
        System.out.println("=============================================");      
        System.out.println(" 1. Data Dokter");
        System.out.println(" 2. Data Suster");
        System.out.println(" 3. Data pendonor");
        System.out.println(" 4. Data penunggu pendonor");
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
                           methoddkt.NoHpdokter(); //interfaces
                           System.out.println("============================================================================");
                           methoddkt.printNamaRS();    //tampilkan abstrak
                           methoddkt.printAlamatRS();  //tampilkan abstrak
                           methoddkt.getkopy();                             //tampilkan enkasulapsi
                                System.out.println(methoddkt.getkopy());    //tampilkan enkasulapsi
                break;
            }
            case 2:{
                 //tampilkan data  this suster
                 Suster2 suster1 = new Suster2();
                         suster1.isiData("R111", "Intan", "jl. soekarno hatta", "perempuan", "anggrek");
                            suster1.judulsuster();       //pemanggilan override
                            System.out.println("Id              = " + suster1.id);
                            System.out.println("Nama            = " + suster1.nama);
                            System.out.println("Alamat          = " + suster1.alamat);
                            System.out.println("jenis kelamin   = " + suster1.kelamin);
                            System.out.println("pengurs ruangan = " + suster1.kamar);
                            suster1. NoHpSuster();    //interfaces
                            System.out.println("============================================================================");
                            suster1.printNamaRS();    //tampilkan abstrak
                            suster1.printAlamatRS();  //tampilkan abstrak
                            suster1.getkopy();                              //tampilkan enkasulapsi
                                System.out.println(suster1.getkopy());    //tampilkan enkasulapsi
                            
                 break;
            }
            case 3:{
                //data keluaran pendonor.java (extends Rumahsakit)
                Rumahsakit sakit = new Rumahsakit("Donor Darah");
                           sakit.judulpasien();    //pemanggilan super konstraktor
                           sakit.datapendonor();     //pemanggilan super konstraktor
                           sakit.NoHpwalipasien(); //interfaces
                           sakit.datasakit();      //pemanggilan super konstraktor
                           sakit.printNamaRS();    //tampilkan abstrak
                           sakit.printAlamatRS();  //tampilkan abstrak  
                           sakit.getkopy();                              //tampilkan enkasulapsi
                                System.out.println(sakit.getkopy());    //tampilkan enkasulapsi       
                break;
            }
            case 4:{
                //generik
                donorpengganti <String>  objekstr = new donorpengganti<>();
                donorpengganti <Integer> objekbyt = new donorpengganti<>();
                    objekstr.setnama("rozali");
                System.out.println("nama           = "+ objekstr.getnama());      
                    objekbyt.setumur(45);
                System.out.println("umur           = "+ objekbyt.getumur());  
                    objekstr.setalamat("jl. margahayu");
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
            //kembali ke mwnu utama
            System.out.println();
            System.out.println("============================================================================");
            System.out.print("kembali ke manu utama  tekan 1, jika tidak tekan Tidak 2 = ");
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
        int num = 1;
        riwayat();
        super.Riwayatsakit();
        System.out.println("\t\t    " + num + "bulan di rawat karna DBD ");
        System.out.println("============================================================================");
    }
     
public void tampilkanDOKTER() {
        //extends Rumahsakit
        Rumahsakit sakit = new Rumahsakit("Donor Darah");
        sakit.id     = "A012";                      //data dokter
        sakit.nama   = "rifaldi noviansyah";        //data dokter
        sakit.umur   = 19;                          //data dokter
        sakit.alamat = "JL.sukamulya,Bandung";      //data dokter      
        sakit.juduldokter();                                        //data keluaran dokter.java
        System.out.println("ID              = " + sakit.id);        //data keluaran dokter.java
        System.out.println("nama dokter     = " + sakit.nama);      //data keluaran dokter.java
        System.out.println("umur            = " + sakit.umur);      //data keluaran dokter.java
        System.out.println("alamat          = " + sakit.alamat);    //data keluaran dokter.java
        sakit.getspec(); //SUPER KONSTRAKTOR spesialis
        
    }    
}
