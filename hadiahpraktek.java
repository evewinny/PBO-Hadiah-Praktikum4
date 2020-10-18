import java.util.Scanner;
public class hadiahpraktek{
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String nama, alamat;
		int bayar, kembalian, harga, pilih;
		
		harga = (0);
		
		System.out.print("Nama kamu siapa?: ");
		nama=input.next();
		System.out.print("Alamat kamu dimana?: ");
		alamat=input.next();
		System.out.println();
		
		System.out.println("Pilihan Pesawat:");
		System.out.println("1. A harga Rp.5.000.000:");
		System.out.println("2. B harga Rp.2.000.000:");
		System.out.println("3. C harga Rp.1.000.000:");
		System.out.print("Pilihan kamu: ");
		pilih=input.nextInt();
		
		if (pilih == 1) {
			harga = 5000000;
			System.out.println("Kamu memilih pesawat A, silahkan lanjut ke pembayaran");
		} else if (pilih == 2) {
			harga = 3000000;
			System.out.println("Kamu memilih pesawat B, silahkan lanjut ke pembayaran");
		}	else if (pilih == 3) {
			harga = 1000000;
			System.out.println("Kamu memilih pesawat C, silahkan lanjut ke pembayaran");
		}
			
			System.out.println();
			System.out.print("Masukkan nominal uang anda: ");
			bayar=input.nextInt();
			kembalian = bayar - harga;
			
			
			System.out.println("Nama: "+nama);
			System.out.println("Alamat: "+alamat);
			System.out.println("Kembalian: "+kembalian);
			
			}
		}