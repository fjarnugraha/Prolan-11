
import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
			String nama;
			char jenisKelamin, menikahInput;
			int tinggiBadan;
			boolean menikah;
		
		System.out.println("\n\t-------------------------------------------------");
		System.out.println("\t|              Program Input Output             |");
		System.out.println("\t-------------------------------------------------");
		
		System.out.print("\tMasukkan Nama \t\t\t: ");
		nama = input.nextLine();
		
		System.out.print("\tMasukkan Jenis Kelamin \t\t: ");
		jenisKelamin = input.next().charAt(0);
		for(;;){
                    if((jenisKelamin == 'P') || (jenisKelamin == 'L' )){
                        break;
                    }
                    System.out.println("\tanda salah Memasukan Kelamin!"); 
                    System.out.print("\tMasukkan Jenis Kelamin \t\t: ");
                    jenisKelamin = input.next().charAt(0);
                }
		
		System.out.print("\tMasukkan Tinggi Badan \t\t: ");
		tinggiBadan = input.nextInt();
		
		System.out.print("\tApakah anda sudah menikah? (Y/T) \t: ");
		menikahInput = input.next().charAt(0);
                for(;;){
                    if((menikahInput == 'Y') || (menikahInput == 'T' )){
                        menikah = false;
                        if(menikahInput == 'Y') {
                            menikah = true;
                        }
                        break;
                    }
                    System.out.println("\tanda salah Memasukan Input!");
                    System.out.print("\tApakah anda sudah menikah? (Y/T) \t: ");
                    menikahInput = input.next().charAt(0);
                }
                
                
		
		
		
		System.out.print("\t-------------------------------------------------");
		
    }
    
}
