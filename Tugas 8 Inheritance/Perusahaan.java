class Perusahaan extends Manager { 
  	public static void main (String[] args){
  		Manager atasan = new Manager();
  		Karyawan data  = new Karyawan();
		Matkul kls     = new Matkul();
		System.out.println(kls.kelas);
  		
  		//data keluaran Karyawan.java 

  		data.judul();
  		data.psn();
		System.out.println("\t---------------------------------------------------------");

  	}
 }