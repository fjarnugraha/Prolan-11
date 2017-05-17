class Karyawan {
	String jabatan, bidang,nama,alamat,lulusan;

	//data Karyawan

	protected void isi(String jabatan, bidang, alamat, lulusan){
		this.jabatan = jabatan;
		this.bidang = bidang;
		this.bidang = nama;
		this.bidang = alamat;
		this.bidang = jurusan;

	nama 	 = "Endang Maulana";
	jabatan = "Karyawan";
	lulusan 	 = "Sarjana";
	bidang = "Web Programmer";
	alamat 	 = "JL. cipaganti, Bandung";

	System.out.println("\tNama Karyawan        = "+nama);
  	System.out.println("\tlulusan Karyawan     = "+lulusan);
  	System.out.println("\tJabatan              = "+bidang);
  	System.out.println("\tBidang Keahlian      = "+bidang);
  	System.out.println("\tAlamat               = "+alamat);
	super.Karyawan();
  }
  	public void judul(){
  		System.out.println("\t---------------------------------------------------------");
		System.out.println("\t|                   Data Karyawan                       |");
		System.out.println("\t---------------------------------------------------------");  	}
}