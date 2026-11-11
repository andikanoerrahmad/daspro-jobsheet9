import java.util.Scanner;

public class Tugas_2_05 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar","Kentang Goreng", "Teh Tarik", "Cappucino","Chocolate Ice"};
        int[] harga = {
            15000, 13000, 10000, 12000, 8000, 18000, 20000};
        System.out.println(" MENU ");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]
                    + " - Rp" + harga[i]);
        }
        System.out.print("\nMasukkan nama menu yang ingin dicari: ");
        String cari = input.nextLine();
        int indeks = -1;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                indeks = i;
                break;
            }
        }
        if (indeks != -1) {
            System.out.println("Menu ditemukan: " + menu[indeks]);
            System.out.println("Harga: Rp" + harga[indeks]);
        } else {
            System.out.println("Menu " + cari + " tidak tersedia.");
        }
        System.out.print("\nMasukkan jumlah pesanan: ");
        int jumlah = input.nextInt();
        input.nextLine();

        while (jumlah <= 0) {
            System.out.print("Jumlah harus lebih dari 0. Masukkan kembali: ");
            jumlah = input.nextInt();
            input.nextLine();
        }
        String[] pesanan = new String[jumlah];
        int[] hargaPesanan = new int[jumlah];
        int total = 0;
        for (int i = 0; i < jumlah; i++) {
            int posisi = -1;
            while (posisi == -1) {
                System.out.print("Masukkan nama menu pesanan ke-" + (i + 1) + ": ");
                String namaPesanan = input.nextLine();
                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(namaPesanan)) {
                        posisi = j;
                        break;
                    }
                }
                if (posisi == -1) {
                    System.out.println("Menu tidak tersedia, silakan masukkan menu yang benar!");
                }
            }
            pesanan[i] = menu[posisi];
            hargaPesanan[i] = harga[posisi];
            total += hargaPesanan[i];
        }
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i + 1) + ". " + pesanan[i]
                    + " - Rp" + hargaPesanan[i]);
        }
        System.out.println("Total biaya: Rp" + total);
        System.out.println("Terima kasih!");
        input.close();
    }
}