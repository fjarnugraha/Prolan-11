import java.util.Scanner ;

public class Latihanlab{
    Scanner input = new Scanner(System.in) ;
      int N, max, min, jumlah ;
      char pilih ;
   
        //deklarasi array, array di batas hingga 100 slot
      
	int[] array = new int[100] ; 
    
    public static void main(String args[]) {
        
	//buat objek untuk menampilkan isidata 
        
	Latihanlab tampilkan = new Latihanlab() ;
        tampilkan.isidata() ;      
    }        
    
    public void isidata() {
      System.out.println("\t---------------------------------------------------------");
      System.out.println("\t|                   Program Latihan                     |");
      System.out.println("\t---------------------------------------------------------");  
      System.out.println("\tpilihan A nilai Minimum             ");
      System.out.println("\tpilihan B nilai Maximum             ");      
      System.out.print("\tSilakan Masukkan banyak nilai       = ") ;   
              N = input.nextInt() ; 
      System.out.print("\tSilakan Masukkan pilihan Anda [A/B] = ") ; 
            pilih = input.next().charAt(0) ;
      //panggil void masukan data untuk memasukan nilai
      masukandata() ;      
      if (pilih == 'A'){
        pilihanA() ;
        System.out.println("\t---------------------------------------------------------");  
        System.out.println("\tNilai Minimum   = "+min);
      } else if (pilih == 'B') {
        pilihanB() ; 
        System.out.println("\t---------------------------------------------------------");          
	System.out.println("\tNilai Maksimum  = "+max) ;
      }else if ((pilih != 'B') || (pilih != 'A')){
           System.out.println("\t Salah memasukkan pilihan, ulangi ! pilihan hanya bisa huruf A dan B");
      } 
      //menampilkan jumal data sering muncul antara max dan min
      System.out.println("\tJumlah yang sering muncul = "+jumlah);
      System.out.println("\t---------------------------------------------------------");  

     }
    
    void masukandata()
    {
      int i ;
        for (i=0;i<N;i++) 
        { 
          System.out.printf("\tSilakan Masukkan Data ke = ") ;    
            array[i] = input.nextInt() ;
        }   
    }  //tutup masukan data      

    void pilihanA()
    {
      int i ;  
      min = array[0]; //insialisasi array bernilai 0
      //mecari nilai paling Minimum
      for (i=0;i<N;i++) 
        {  
           if (min > array[i])
             min = array[i] ;
        }
      //menghitung jumlah banyak data nilai sering keluar
       for (i=0;i<N;i++) 
        {  
           if (min == array[i] )
             jumlah++ ;
        }    
    } //tutup pilihanA      
    
    void pilihanB()
    {
      int i ;  
      max = array[0]; //insialisasi array bernilai 0
      //mencari milai Maximum
      for (i=0;i<N;i++) 
        {  
           if (max < array[i])
               max = array[i] ;
        }
      //menghitung jumlah banyak data nilai sering keluar
       for (i=0;i<N;i++) 
        {  
           if (max == array[i] )
               jumlah++ ;
        }
    }//tutup pilihanB        
} //tutup class latihanlab
