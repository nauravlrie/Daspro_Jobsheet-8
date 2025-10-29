import java.util.Scanner;

public class NilaiKelompok11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;
        float totalNilai, rataNilai, nilai, rataRataTertinggi = 0;
        String kelompokTertinggi = "";

        while (i <= 3) {
            System.out.println("Kelompok " + i);
            totalNilai = 0;

            for (int j = 1; j<= 5; j++) {
                System.out.print("Nilai dari Kelompok Penilai " + j + ": ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }
            rataNilai = totalNilai / 5;
            System.out.println("Rata-rata nilai Kelompok " + i + " = " + rataNilai);
            
            if (rataNilai > rataRataTertinggi) {
                rataRataTertinggi = rataNilai;
                kelompokTertinggi = "Kelompok " + i; ;
            } else if (rataNilai == rataRataTertinggi) {
                kelompokTertinggi += ", Kelompok " + i;
            }
            i++;

         }

          System.out.println("Nilai kelompok tertinggi adalah: " + rataRataTertinggi);
          System.out.println("Kelompok yang mendapatkan nilai tertinggi adalah: " + kelompokTertinggi);
    }
    
}
