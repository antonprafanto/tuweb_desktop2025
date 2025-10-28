/**
 * Contoh Kode Sederhana - Demonstrasi Looping Dasar
 * File pendukung untuk mahasiswa pemula
 */

public class ContohKodeSederhana {
    
    public static void main(String[] args) {
        
        System.out.println("=== CONTOH DASAR LOOPING ===\n");
        
        // 1. For Loop - Menampilkan angka 1-5
        System.out.println("1. FOR LOOP - Angka 1-5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("   Iterasi ke-" + i);
        }
        
        // 2. While Loop - Menghitung mundur
        System.out.println("\n2. WHILE LOOP - Hitung mundur dari 5:");
        int hitung = 5;
        while (hitung > 0) {
            System.out.println("   " + hitung);
            hitung--;
        }
        System.out.println("   Selesai!");
        
        // 3. Do-While Loop - Minimal sekali eksekusi
        System.out.println("\n3. DO-WHILE LOOP - Input validasi:");
        java.util.Scanner input = new java.util.Scanner(System.in);
        int angka;
        
        do {
            System.out.print("   Masukkan angka > 10: ");
            angka = input.nextInt();
            
            if (angka <= 10) {
                System.out.println("   Angka harus > 10! Coba lagi.");
            }
        } while (angka <= 10);
        
        System.out.println("   Benar! Angka " + angka + " > 10");
        
        // 4. Break Statement - Stop di tengah loop
        System.out.println("\n4. BREAK STATEMENT - Stop di angka 3:");
        for (int i = 1; i <= 10; i++) {
            if (i == 4) {
                break; // keluar dari loop
            }
            System.out.println("   Angka: " + i);
        }
        
        // 5. Continue Statement - Lewati angka genap
        System.out.println("\n5. CONTINUE STATEMENT - Hanya angka ganjil:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // lewati angka genap
            }
            System.out.println("   Angka ganjil: " + i);
        }
        
        // 6. Nested Loop - Tabel perkalian sederhana
        System.out.println("\n6. NESTED LOOP - Tabel perkalian 3x3:");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print("   " + i + "x" + j + "=" + (i*j) + "\t");
            }
            System.out.println();
        }
        
        // 7. Loop dengan Array
        System.out.println("\n7. LOOP DENGAN ARRAY - Daftar buah:");
        String[] buah = {"Apel", "Jeruk", "Mangga", "Pisang"};
        
        System.out.println("   Menggunakan for loop:");
        for (int i = 0; i < buah.length; i++) {
            System.out.println("   Buah ke-" + (i+1) + ": " + buah[i]);
        }
        
        System.out.println("\n   Menggunakan enhanced for loop:");
        for (String itemBuah : buah) {
            System.out.println("   - " + itemBuah);
        }
        
        System.out.println("\n=== SELESAI ===");
        input.close();
    }
}