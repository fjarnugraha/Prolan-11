public class Manager extends Karyawan {
	// overiding
	String id; 
		
		public void Managerr(String id){
			this.id = id;

		//data Manager

		id      = "A010";
  		nama    = "Fajar Nugraha Sugiarto";
  		jabatan = "Manager Programmer";
  		alamat  = "JL.Dipatiukur,Bandung";

  		//data keluaran Manager.java

  		atasan.Managerr();
  		System.out.println("\tID                   = "+atasan.id);
  		System.out.println("\tNama Atasan          = "+atasan.nama);
  		System.out.println("\tJabatan              = "+atasan.jabatan);
  		System.out.println("\tAlamat               = "+atasan.alamat);
		super.Managerr();


	
		System.out.println("\t---------------------------------------------------------");
		System.out.println("\t|                    Data Manager                       |");
		System.out.println("\t---------------------------------------------------------");
	}
}