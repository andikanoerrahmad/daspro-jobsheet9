import java.util.Scanner;

public class Tugas_1_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        while (jumlah <= 0) {
            System.out.print("Jumlah harus lebih dari 0. Masukkan kembali: ");
            jumlah = sc.nextInt();
        }
        int[] nilai = new int[jumlah];
        int total = 0;
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
            total += nilai[i];
        }
        double rataRata = (double) total / jumlah;
        int tertinggi = nilai[0];
        int terendah = nilai[0];
        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }

            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }
        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata nilai: " + rataRata);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        for (int i = 0; i < nilai.length; i++) {
            String status;
            if (nilai[i] > 70) {
                status = "LULUS";
            } else {
                status = "TIDAK LULUS";
            }
            System.out.println("Mahasiswa ke-" + (i + 1)
                    + ": " + nilai[i] + " (" + status + ")");
        }
        sc.close();
    }
}