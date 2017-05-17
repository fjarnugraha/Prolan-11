public abstract class Manager extends Karyawan {
	String id,nama,alamat,jabatan; 
	
	protected String nama = "Coding Indonesia";
	protected Stirng alamt = "jl. Emo Kurniaatmaja No. 1";
	
	protected String getNama() {
	return nama;
	}
	
	public abstract void printNama();

	public void Managerr(){
		System.out.println("\t---------------------------------------------------------");
		System.out.println("\t|                    Data Manager                       |");
		System.out.println("\t---------------------------------------------------------");
	}
}