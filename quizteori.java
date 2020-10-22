import java.util.Scanner;
public class quizteori {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in) ;
		
		String nama;
		int tipe,pilihan,pemakaian,bayar,beban,kembalian,total;
		
			System.out.println("Biaya beban setiap rumah :");
			System.out.println("Tipe 31 = Rp.100.000");
			System.out.println("Tipe 32 = Rp.125.000");
			System.out.println("Tipe 33 = Rp.450.000");
			System.out.println("Tipe 34 = Rp.480.000");
			System.out.println("Tipe 35 = Rp.500.000");
			System.out.println("Tipe 40 = Rp.550.000");	
			System.out.println();
			System.out.println("Nama anda = ");
			nama = input.nextLine();
			System.out.println("Tipe rumah = ");
			tipe = input.nextInt();
			System.out.println();
			
			if(tipe == 31) {
				beban = 100000;
					System.out.println("nama =" +nama);
					System.out.println("biaya beban = Rp.100.000");
					System.out.println("jumlah pemakaian = ");
					pemakaian = input.nextInt();
						total = pemakaian * beban;
						System.out.println("Total harga = " +total);
						System.out.println("Bayar =");
						bayar = input.nextInt();
						kembalian = bayar-total;
						System.out.println("kembalian = " +kembalian);
				}
				else 	if(tipe == 32) {
				beban = 125000;
					System.out.println("nama =" +nama);
					System.out.println("biaya beban = Rp.125.000");
					System.out.println("jumlah pemakaian = ");
					pemakaian = input.nextInt();
						total = pemakaian * beban;
						System.out.println("Total harga = " +total);
						System.out.println("Bayar =");
						bayar = input.nextInt();
						kembalian = bayar-total;
						System.out.println("kembalian = " +kembalian);
			} 	if(tipe == 33) {
				beban = 450000;
					System.out.println("nama =" +nama);
					System.out.println("biaya beban = Rp4500.000");
					System.out.println("jumlah pemakaian = ");
					pemakaian = input.nextInt();
						total = pemakaian * beban;
						System.out.println("Total harga = " +total);
						System.out.println("Bayar =");
						bayar = input.nextInt();
						kembalian = bayar-total;
						System.out.println("kembalian = " +kembalian);
			} 	if(tipe == 34) {
				beban = 480000;
					System.out.println("nama =" +nama);
					System.out.println("biaya beban = Rp.480.000");
					System.out.println("jumlah pemakaian = ");
					pemakaian = input.nextInt();
						total = pemakaian * beban;
						System.out.println("Total harga = " +total);
						System.out.println("Bayar =");
						bayar = input.nextInt();
						kembalian = bayar-total;
						System.out.println("kembalian = " +kembalian);
						
			} 	if(tipe == 35) {
				beban = 500000;
					System.out.println("nama =" +nama);
					System.out.println("biaya beban = Rp.500.000");
					System.out.println("jumlah pemakaian = ");
					pemakaian = input.nextInt();
						total = pemakaian * beban;
						System.out.println("Total harga = " +total);
						System.out.println("Bayar =");
						bayar = input.nextInt();
						kembalian = bayar-total;
						System.out.println("kembalian = " +kembalian);
			} 	if(tipe == 40) {
				beban = 550000;
					System.out.println("nama =" +nama);
					System.out.println("biaya beban = Rp.550.000");
					System.out.println("jumlah pemakaian = ");
					pemakaian = input.nextInt();
						total = pemakaian * beban;
						System.out.println("Total harga = " +total);
						System.out.println("Bayar =");
						bayar = input.nextInt();
						kembalian = bayar-total;
						System.out.println("kembalian = " +kembalian);
			}
			
	}
}