import java.util.Scanner;

public class KopiSenja11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahCabangKafe = 0, jumlahPelangganKafe = 0,  totalPelangganKafe = 0, totalItem = 0,  totalSeluruhItem = 0; 
        System.out.print("Jumlah Cabang Kafe = ");
        jumlahCabangKafe = sc.nextInt();

        for(int i = 1; i <= jumlahCabangKafe; i++) {
            System.out.println("=== Masukkan Penjualan Percabang ===");

            System.out.println("-- Cabang " + i + " --");
            System.out.print("Jumlah Pelanggan: ");
            jumlahPelangganKafe = sc.nextInt();
            totalItem = 0;

            for(int j = 1; j <= jumlahPelangganKafe; j++) {
                int jumlahItem;
               System.out.print("- Pelanggan " + j + " memesan berapa item? ");
                jumlahItem = sc.nextInt();
                totalItem += jumlahItem;
            }
            System.out.println("Cabang " + i + ":");
            System.out.println("Pelanggan: " + jumlahPelangganKafe + " orang");
            System.out.println("Item terjual: " + totalItem + " item");

            totalSeluruhItem += totalItem;
            totalPelangganKafe += jumlahPelangganKafe;
        }

        System.out.println("== Total Keseluruhan Cabang ==");
        System.out.println("Pelanggan: " + totalPelangganKafe + " orang");
        System.out.println("Item terjual: " + totalSeluruhItem + " item");
    }
}