import java.util.Scanner;
public class Mahasiswa
{

	public static void main(String[] args)
	{
		Mahasiswa ipmhs = new Mahasiswa();
		Scanner input = new Scanner(System.in);
		float ip,totalip = 0,rata = 0;
		int jmlMhs = 0,jmlMhLls = 0,jmlipsalah = 0,jmlMhtdk = 0;
		System.out.print("Masukkan IP Mahasiswa : ");
			ip = input.nextFloat();
			//ketentuan
			while(ip != -999)
			{
				if(ipmhs.iswithinRange(ip, 0, 4) == 1 )
				{
					jmlMhs++;
					totalip = totalip +ip;	
				// syarat mmahasiswa lulus
				if (ip >= 2.75)
				{ if (ip <= 4.00){
					jmlMhLls++;
				   }
				}else if (ip >= 0.00) //syarat mahasiswa tidak lulus
				{ if (ip <= 2.74){
					jmlMhtdk++;
				   }
				}
				//hitung rata rata 
				rata = totalip / jmlMhs;
			}
				// syarat ip salah
				if (ip >= 4.01) 
				{
					jmlipsalah++;
				}else if (ip <= -0.01){
					jmlipsalah++;
				}
				System.out.print("Masukkan IP Mahasiswa : ");
				    ip = input.nextFloat();			
			} 
		System.out.println("=============================================");
		System.out.println("                 KETERANGAN                  ");
		System.out.println("=============================================");
		System.out.println("Banyak Mahasiswa                   = " + jmlMhs);
		System.out.println("( "+jmlipsalah+" Data IP salah di abaikan  )");
		System.out.println("Banyaknya Yang lulus               = " + jmlMhLls);
		System.out.println("Banyaknya Yang tidak lulus         = " + jmlMhtdk);
	    System.out.println("rata rata                          = " + rata);
		System.out.println("=============================================");
	}

	int iswithinRange (float x, float min, float max)
	{
		if(x >= min && x <= max)
		{
			return 1;
		}else
		{
			return 0;
		}
	}
}