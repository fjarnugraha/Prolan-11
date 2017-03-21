public class Manager extends Karyawan {
	String id,nama,alamat,jabatan; 

		//data Manager

		atasan.id      = "A010";
  		atasan.nama    = "Fajar Nugraha Sugiarto";
  		atasan.jabatan = "Manager Programmer";
  		atasan.alamat  = "JL.Dipatiukur,Bandung";

  		//data keluaran Manager.java

  		atasan.Managerr();
  		System.out.println("\tID                   = "+atasan.id);
  		System.out.println("\tNama Atasan          = "+atasan.nama);
  		System.out.println("\tJabatan              = "+atasan.jabatan);
  		System.out.println("\tAlamat               = "+atasan.alamat);


	public void Managerr(){
		System.out.println("\t---------------------------------------------------------");
		System.out.println("\t|                    Data Manager                       |");
		System.out.println("\t---------------------------------------------------------");
	}
}