import java.util.Scanner;

/**
 * Aplikasi Kasir Minimarket Sederhana
 * Demonstrasi penggunaan looping untuk transaksi pembelian
 */
public class AplikasiKasirMinimarket {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Data produk minimarket
        String[] namaProduk = {"Indomie", "Coca-Cola", "Susu", "Roti", "Sabun Mandi"};
        int[] hargaProduk = {3000, 8000, 15000, 10000, 5000};
        int[] stokProduk = {50, 30, 20, 25, 40};
        
        System.out.println("=================================");
        System.out.println("   KASIR MINIMARKET SEDERHANA   ");
        System.out.println("=================================");
        
        // Tampilkan daftar produk menggunakan for loop
        System.out.println("\nDAFTAR PRODUK:");
        System.out.println("---------------------------------");
        for (int i = 0; i < namaProduk.length; i++) {
            System.out.println((i + 1) + ". " + namaProduk[i] + 
                             " - Rp " + hargaProduk[i] + 
                             " (Stok: " + stokProduk[i] + ")");
        }
        
        // Proses transaksi menggunakan while loop
        char lanjut = 'y';
        int totalHarga = 0;
        
        while (lanjut == 'y' || lanjut == 'Y') {
            System.out.println("\n---------------------------------");
            System.out.print("Pilih nomor produk (1-" + namaProduk.length + "): ");
            int pilihan = input.nextInt();
            
            // Validasi pilihan
            if (pilihan < 1 || pilihan > namaProduk.length) {
                System.out.println("Pilihan tidak valid!");
                continue;
            }
            
            int index = pilihan - 1;
            
            // Cek stok
            if (stokProduk[index] <= 0) {
                System.out.println("Maaf, " + namaProduk[index] + " habis!");
                continue;
            }
            
            System.out.print("Jumlah beli: ");
            int jumlah = input.nextInt();
            
            // Validasi jumlah
            if (jumlah <= 0) {
                System.out.println("Jumlah harus lebih dari 0!");
                continue;
            }
            
            if (jumlah > stokProduk[index]) {
                System.out.println("Stok tidak mencukupi! Stok tersisa: " + stokProduk[index]);
                continue;
            }
            
            // Hitung subtotal
            int subtotal = hargaProduk[index] * jumlah;
            totalHarga += subtotal;
            
            // Update stok
            stokProduk[index] -= jumlah;
            
            // Tampilkan detail pembelian
            System.out.println("\nDetail Pembelian:");
            System.out.println("Produk: " + namaProduk[index]);
            System.out.println("Harga: Rp " + hargaProduk[index]);
            System.out.println("Jumlah: " + jumlah);
            System.out.println("Subtotal: Rp " + subtotal);
            System.out.println("Total sementara: Rp " + totalHarga);
            
            // Tanya apakah ingin lanjut belanja
            System.out.print("\nTambah belanjaan? (y/n): ");
            lanjut = input.next().charAt(0);
        }
        
        // Proses pembayaran menggunakan do-while loop
        if (totalHarga > 0) {
            System.out.println("\n=================================");
            System.out.println("TOTAL BELANJA: Rp " + totalHarga);
            System.out.println("=================================");
            
            int uangBayar;
            do {
                System.out.print("Masukkan uang pembayaran: Rp ");
                uangBayar = input.nextInt();
                
                if (uangBayar < totalHarga) {
                    System.out.println("Uang kurang! Kekurangan: Rp " + (totalHarga - uangBayar));
                }
            } while (uangBayar < totalHarga);
            
            int kembalian = uangBayar - totalHarga;
            System.out.println("\n=================================");
            System.out.println("PEMBAYARAN BERHASIL!");
            System.out.println("Uang Bayar: Rp " + uangBayar);
            System.out.println("Kembalian: Rp " + kembalian);
            System.out.println("=================================");
            
            // Tampilkan struk menggunakan nested loop
            System.out.println("\nSTRUK PEMBELIAN:");
            System.out.println("=================================");
            System.out.println("No.  Produk        Harga    Jumlah   Subtotal");
            System.out.println("------------------------------------------");
            
            // Reset array untuk menampilkan struk
            // (Dalam aplikasi nyata, sebaiknya simpan data pembelian)
            for (int i = 0; i < 5; i++) { // Loop untuk garis pemisah
                System.out.print("-");
            }
            System.out.println();
            
        } else {
            System.out.println("\nTidak ada pembelian yang dilakukan.");
        }
        
        System.out.println("\nTerima kasih telah berbelanja!");
        input.close();
    }
}