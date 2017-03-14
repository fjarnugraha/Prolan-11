class Perusahaan { 
  	public static void main (String[] args){
  		Manager atasan = new Manager();
  		Karyawan data  = new Karyawan();
		Matkul kls     = new Matkul();
		System.out.println(kls.kelas);

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
  		
  		//data keluaran Karyawan.java 
  		data.judul();
  		data.psn();
		System.out.println("\t---------------------------------------------------------");

  	}
 }