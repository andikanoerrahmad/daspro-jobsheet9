import java.util.Scanner;

public class SearchNilai05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int n = sc.nextInt();
        int[] nilai = new int[n];
        boolean ditemukan = false;
        
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }
        System.out.print("Masukkan nilai yang dicari: ");       
        int key = sc.nextInt();
            
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }
        sc.close();
    }
}