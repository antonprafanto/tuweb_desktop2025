# Latihan Soal Looping - Aplikasi Kasir Minimarket

## 📚 Soal-Soal Latihan

### 🟢 Level 1: Pemahaman Dasar

#### Soal 1: Menampilkan Angka
Buat program untuk menampilkan angka 1-50 menggunakan:
- For loop
- While loop  
- Do-while loop

**Expected Output:**
```
1 2 3 4 5 ... 50
```

#### Soal 2: Tabel Perkalian
Buat program untuk menampilkan tabel perkalian 1-10.

**Expected Output:**
```
1 x 1 = 1   1 x 2 = 2   ... 1 x 10 = 10
2 x 1 = 2   2 x 2 = 4   ... 2 x 10 = 20
...
10 x 1 = 10 10 x 2 = 20 ... 10 x 10 = 100
```

#### Soal 3: Deret Fibonacci
Buat program untuk menampilkan 10 suku pertama deret Fibonacci.

**Expected Output:**
```
0 1 1 2 3 5 8 13 21 34
```

### 🟡 Level 2: Aplikasi Kasir

#### Soal 4: Menu Produk
Modifikasi program kasir untuk menampilkan menu menggunakan looping:

```java
String[] menu = {"Makanan", "Minuman", "Snack", "Pakaian"};
```

**Expected Output:**
```
=== MENU KATEGORI ===
1. Makanan
2. Minuman  
3. Snack
4. Pakaian
===================
```

#### Soal 5: Validasi Input
Buat method untuk validasi input angka 1-100 menggunakan do-while.

**Requirements:**
- User harus input angka 1-100
- Jika invalid, tampilkan pesan error dan ulangi
- Return angka yang valid

#### Soal 6: Hitung Total Belanja
Buat program untuk menghitung total belanja dengan ketentuan:
- Input jumlah item (n)
- Loop n kali untuk input harga setiap item
- Hitung total semua harga
- Tampilkan total

**Contoh Input:**
```
Jumlah item: 3
Harga item 1: 5000
Harga item 2: 10000
Harga item 3: 7500
```

**Expected Output:**
```
Total belanja: Rp 22500
```

### 🔴 Level 3: Fitur Tambahan Kasir

#### Soal 7: Sistem Diskon
Buat program sistem diskon dengan ketentuan:
- Total > 100000: diskon 10%
- Total > 500000: diskon 20%
- Total > 1000000: diskon 30%

Gunakan while loop untuk multiple transactions.

#### Soal 8: Manajemen Stok
Buat program manajemen stok dengan fitur:
- Tampilkan stok awal
- Proses penjualan (kurangi stok)
- Proses restock (tambah stok)
- Stop jika stok = 0

#### Soal 9: Laporan Harian
Buat program laporan penjualan harian:
- Input jumlah transaksi
- Loop untuk setiap transaksi
- Hitung total penjualan hari ini
- Tampilkan laporan

### 🟣 Level 4: Tantangan

#### Soal 10: Multi-User Kasir
Buat program kasir untuk multiple user:
- Login dengan username/password
- Setiap user memiliki transaksi terpisah
- Menu: Login, Register, Exit
- Gunakan nested loop untuk menu utama

#### Soal 11: Search Produk
Buat fitur search produk:
- Input keyword pencarian
- Cari dalam array produk
- Tampilkan hasil pencarian
- Gunakan continue untuk skip non-matching items

#### Soal 12: Export Transaksi
Buat program untuk export transaksi ke file:
- Simpan semua transaksi dalam array
- Export ke file teks dengan format tertentu
- Gunakan FileWriter dan looping

## 💡 Petunjuk Pengerjaan

### 1. Setup Project
```java
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
```

### 2. Template Dasar
```java
public class LatihanLooping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Kode latihan di sini
        
        input.close();
    }
}
```

### 3. Tips Mengerjakan
- Baca soal dengan teliti
- Pahami requirement output
- Test dengan berbagai input
- Gunakan komentar untuk penjelasan
- Handle error cases

## 🎯 Kriteria Penilaian

### ✅ Benar (100%)
- Program berjalan tanpa error
- Output sesuai expected
- Logic benar
- Code clean dan readable

### ⚠️ Hampir Benar (75%)
- Program berjalan dengan minor bugs
- Output hampir sesuai
- Logic ada sedikit kesalahan

### ❌ Perlu Perbaikan (50%)
- Program error atau tidak berjalan
- Output tidak sesuai
- Logic salah

## 🔑 Kunci Jawaban (Select Soal)

### Soal 1 - For Loop
```java
for (int i = 1; i <= 50; i++) {
    System.out.print(i + " ");
}
```

### Soal 4 - Menu Produk
```java
String[] menu = {"Makanan", "Minuman", "Snack", "Pakaian"};
System.out.println("=== MENU KATEGORI ===");
for (int i = 0; i < menu.length; i++) {
    System.out.println((i + 1) + ". " + menu[i]);
}
System.out.println("===================");
```

### Soal 5 - Validasi Input
```java
int angka;
do {
    System.out.print("Masukkan angka (1-100): ");
    angka = input.nextInt();
    if (angka < 1 || angka > 100) {
        System.out.println("Input tidak valid! Masukkan 1-100");
    }
} while (angka < 1 || angka > 100);
System.out.println("Angka valid: " + angka);
```

## 🚀 Challenge Tambahan

### Challenge 1: Performance Optimization
Optimasi program kasir untuk handle 1000+ transaksi.

### Challenge 2: GUI Integration
Integrasikan dengan Swing untuk tampilan GUI.

### Challenge 3: Database Integration
Simpan data ke database (SQLite/MySQL).

### Challenge 4: Network Application
Buat client-server kasir application.

## 📞 Bantuan

Jika kesulitan:
1. Review materi konsep looping
2. Lihat contoh kode aplikasi kasir
3. Tanya teman atau dosen
4. Search di Stack Overflow
5. Debug step by step

## ⏰ Waktu Pengerjaan

- Level 1: 30 menit
- Level 2: 45 menit  
- Level 3: 60 menit
- Level 4: 90 menit
- Challenge: 120+ menit

Selamat mengerjakan! 💪