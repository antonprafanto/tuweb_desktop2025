# TUWeb 2: Struktur Pengulangan dan UML Dasar

## Informasi Mata Kuliah
- **Mata Kuliah**: Pemrograman Berbasis Desktop (STSI4201)
- **TUWeb**: 2
- **Topik**: Struktur Pengulangan dan UML Dasar
- **Platform**: NetBeans IDE
- **Studi Kasus**: Restoran "SederhanaRasa"

---

## 🎯 Tujuan Pembelajaran

Setelah mengikuti pembelajaran ini, mahasiswa diharapkan mampu:

1. **Memahami konsep pengulangan** dengan analogi sederhana
2. **Menggunakan 3 jenis pengulangan utama**: for, while, do-while
3. **Memilih jenis pengulangan yang tepat** untuk setiap kasus
4. **Menerapkan pengulangan** dalam program restoran sederhana

---

## 📚 Konsep Teori: Apa itu Pengulangan?

### 🤔 Analogi Sederhana

**Bayangkan ini:** Kamu adalah kasir di restoran "SederhanaRasa". Ada 5 pelanggan yang antri, kamu harus melayani mereka satu per satu.

Daripada menulis:
```
layani pelanggan 1
layani pelanggan 2
layani pelanggan 3
layani pelanggan 4
layani pelanggan 5
```

Kamu bisa bilang: **"Layani semua pelanggan yang antri!"**

**Pengulangan (loop)** itu seperti itu! Kita memberi instruksi ke komputer: "Kerjakan ini berulang-ulang sampai kondisi tertentu terpenuhi."

---

## 🔄 Jenis #1: Pengulangan For - "Loop yang Terencana"

### 🤔 Kapan Menggunakan For?
Gunakan `for` ketika kamu **sudah tahu berapa kali** pengulangan akan dilakukan.

**🏪 Contoh Restoran:**
- Menampilkan 10 menu makanan
- Menghitung total 5 pesanan
- Mencetak struk untuk 3 meja

### 📖 Cara Membaca Kode For:
```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Melayani pelanggan ke-" + i);
}
```

**Baca seperti ini:** 
"Untuk setiap `i` mulai dari 1, selama `i` kurang dari atau sama dengan 5, tambahkan 1 ke `i` setiap kali, lakukan ini: ..."

### 🔍 Anatomi Pengulangan For:
```java
for (  int i = 1;    i <= 5;      i++  ) {
//     ^mulai dari   ^selama     ^tambah 1
//     angka 1      //kurang dari //setiap loop
//                  //atau sama dengan
//                  //5
    System.out.println("Melayani pelanggan ke-" + i);
    //^kode yang diulang
}
```

### 🎯 Contoh Praktis:
```java
// Menampilkan menu makanan
String[] menuMakanan = {"Nasi Goreng", "Mie Ayam", "Soto", "Nasi Padang"};

System.out.println("=== DAFTAR MENU MAKANAN ===");
for (int i = 0; i < menuMakanan.length; i++) {
    System.out.println((i+1) + ". " + menuMakanan[i]);
}
```

**Output:**
```
=== DAFTAR MENU MAKANAN ===
1. Nasi Goreng
2. Mie Ayam
3. Soto
4. Nasi Padang
```

---

## 🔄 Jenis #2: Pengulangan While - "Loop yang Menunggu"

### 🤔 Kapan Menggunakan While?
Gunakan `while` ketika kamu **tidak tahu berapa kali** pengulangan, tapi kamu tahu **kapan harus berhenti**.

**🏪 Contoh Restoran:**
- Melayani pelanggan sampai restoran tutup
- Menunggu pelanggan selesai makan
- Mengulang input sampai user input "selesai"

### 📖 Cara Membaca Kode While:
```java
Scanner input = new Scanner(System.in);
String jawaban = "";

while (!jawaban.equals("selesai")) {
    System.out.print("Masukkan pesanan (ketik 'selesai' untuk berhenti): ");
    jawaban = input.nextLine();
}
```

**Baca seperti ini:** 
"Selama `jawaban` TIDAK sama dengan 'selesai', lakukan ini: ..."

### ⚠️ PENTING: Jangan Lupa Update Kondisi!
```java
// ❌ SALAH: Infinite loop!
int counter = 1;
while (counter <= 5) {
    System.out.println("Hello");
    // counter tidak pernah bertambah!
}

// ✅ BENAR: Kondisi berubah
int counter = 1;
while (counter <= 5) {
    System.out.println("Hello ke-" + counter);
    counter++; // ini penting!
}
```

### 🎯 Contoh Praktis:
```java
// Program pemesanan sampai pelanggan selesai
Scanner input = new Scanner(System.in);
ArrayList<String> pesanan = new ArrayList<>();
String tambahPesanan = "ya";

while (tambahPesanan.equalsIgnoreCase("ya")) {
    System.out.print("Masukkan nama menu: ");
    String menu = input.nextLine();
    pesanan.add(menu);
    
    System.out.print("Tambah pesanan lagi? (ya/tidak): ");
    tambahPesanan = input.nextLine();
}

System.out.println("Pesanan Anda: " + pesanan);
```

---

## 🔄 Jenis #3: Pengulangan Do-While - "Loop yang Pasti Jalan Sekali"

### 🤔 Kapan Menggunakan Do-While?
Gunakan `do-while` ketika kode **harus dijalankan minimal satu kali**, baru kemudian cek kondisi.

**🏪 Contoh Restoran:**
- Menampilkan menu minimal sekali
- Meminta input minimal sekali
- Proses login minimal sekali

### 📖 Cara Membaca Kode Do-While:
```java
Scanner input = new Scanner(System.in);
int pilihan;

do {
    System.out.println("1. Makanan");
    System.out.println("2. Minuman");
    System.out.print("Pilih menu (1-2): ");
    pilihan = input.nextInt();
} while (pilihan < 1 || pilihan > 2);
```

**Baca seperti ini:** 
"Lakukan ini dulu, **selama** kondisi terpenuhi, ulangi lagi."

### 🎯 Contoh Praktis:
```java
// Validasi input menu
Scanner input = new Scanner(System.in);
int pilihanMenu;

do {
    System.out.println("\n=== RESTORAN SEDERHANARASA ===");
    System.out.println("1. Lihat Menu");
    System.out.println("2. Pesan Makanan");
    System.out.println("3. Bayar");
    System.out.println("4. Keluar");
    System.out.print("Pilih menu (1-4): ");
    pilihanMenu = input.nextInt();
    
    if (pilihanMenu < 1 || pilihanMenu > 4) {
        System.out.println("❌ Pilihan tidak valid! Silakan coba lagi.");
    }
} while (pilihanMenu < 1 || pilihanMenu > 4);

System.out.println("✅ Anda memilih menu: " + pilihanMenu);
```

---

## 📊 Tabel Perbandingan Jenis Pengulangan

| Jenis Loop | Kapan Digunakan | Contoh Restoran | Kelebihan | Kekurangan |
|-----------|------------------|------------------|-----------|------------|
| **For** | Tahu jumlah pasti | Tampilkan 10 menu | Kontrol penuh | Harus tahu jumlah |
| **While** | Tidak tahu jumlah | Layani sampai tutup | Fleksibel | Risk infinite loop |
| **Do-While** | Minimal sekali | Validasi input | Pasti jalan sekali | Kurang intuitif |

---

## 💻 Praktik 1: Program Menu Restoran Sederhana

### 🎯 Tujuan:
Membuat program menu restoran menggunakan pengulangan for.

### 📝 Langkah 1: Buat Project Baru
1. Buka NetBeans IDE
2. Klik **File → New Project**
3. Pilih **Java → Java Application**
4. Beri nama project: `MenuRestoran`
5. Klik **Finish**

### 📝 Langkah 2: Tulis Kode Program
```java
package menurestoran;

import java.util.Scanner;

public class MenuRestoran {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("🍽️ RESTORAN SEDERHANARASA 🍽️");
        System.out.println("=".repeat(30));
        
        // === MENAMPILKAN MENU DENGAN FOR ===
        System.out.println("\n📋 DAFTAR MENU MAKANAN");
        String[] menuMakanan = {"Nasi Goreng", "Mie Ayam", "Soto", "Nasi Padang"};
        double[] hargaMakanan = {25000, 22000, 20000, 30000};
        
        // Menggunakan for untuk menampilkan menu
        for (int i = 0; i < menuMakanan.length; i++) {
            System.out.println((i+1) + ". " + menuMakanan[i] + " - Rp " + hargaMakanan[i]);
        }
        
        // === MENU MINUMAN DENGAN FOR ===
        System.out.println("\n🥤 DAFTAR MENU MINUMAN");
        String[] menuMinuman = {"Es Teh", "Es Jeruk", "Jus Alpukat", "Kopi"};
        double[] hargaMinuman = {5000, 6000, 15000, 8000};
        
        // Menggunakan for untuk menampilkan menu minuman
        for (int i = 0; i < menuMinuman.length; i++) {
            System.out.println((i+1) + ". " + menuMinuman[i] + " - Rp " + hargaMinuman[i]);
        }
        
        // === MENGHITUNG TOTAL DENGAN FOR ===
        System.out.println("\n💰 MENGHITUNG TOTAL PEMBELIAN");
        double total = 0;
        
        System.out.println("Pesanan Anda:");
        for (int i = 0; i < menuMakanan.length; i++) {
            System.out.println("- " + menuMakanan[i] + ": Rp " + hargaMakanan[i]);
            total += hargaMakanan[i];
        }
        
        System.out.println("Total pembelian: Rp " + total);
        
        input.close();
    }
}
```

### 🏃 Cara Menjalankan:
1. Klik kanan file `MenuRestoran.java`
2. Pilih **Run File**
3. Lihat output di bagian bawah

### 📸 Output yang Harus Muncul:
```
🍽️ RESTORAN SEDERHANARASA 🍽️
==============================

📋 DAFTAR MENU MAKANAN
1. Nasi Goreng - Rp 25000.0
2. Mie Ayam - Rp 22000.0
3. Soto - Rp 20000.0
4. Nasi Padang - Rp 30000.0

🥤 DAFTAR MENU MINUMAN
1. Es Teh - Rp 5000.0
2. Es Jeruk - Rp 6000.0
3. Jus Alpukat - Rp 15000.0
4. Kopi - Rp 8000.0

💰 MENGHITUNG TOTAL PEMBELIAN
Pesanan Anda:
- Nasi Goreng: Rp 25000.0
- Mie Ayam: Rp 22000.0
- Soto: Rp 20000.0
- Nasi Padang: Rp 30000.0
Total pembelian: Rp 97000.0
```

---

## 💻 Praktik 2: Program Pemesanan Interaktif

### 🎯 Tujuan:
Membuat program pemesanan menggunakan pengulangan while.

### 📝 Langkah 1: Buat Project Baru
1. Klik **File → New Project**
2. Pilih **Java → Java Application**
3. Beri nama project: `PemesananRestoran`
4. Klik **Finish**

### 📝 Langkah 2: Tulis Kode Program
```java
package pemesananrestoran;

import java.util.Scanner;
import java.util.ArrayList;

public class PemesananRestoran {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> pesanan = new ArrayList<>();
        ArrayList<Integer> jumlah = new ArrayList<>();
        
        System.out.println("🛒 SISTEM PEMESANAN RESTORAN");
        System.out.println("=".repeat(35));
        
        // === MENU RESTORAN ===
        String[] menu = {"Nasi Goreng", "Mie Ayam", "Soto", "Es Teh", "Es Jeruk"};
        double[] harga = {25000, 22000, 20000, 5000, 6000};
        
        // Tampilkan menu
        System.out.println("\n📋 DAFTAR MENU:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i+1) + ". " + menu[i] + " - Rp " + harga[i]);
        }
        
        // === PROSES PEMESANAN DENGAN WHILE ===
        String lanjut = "ya";
        int nomorPesanan = 1;
        
        while (lanjut.equalsIgnoreCase("ya")) {
            System.out.println("\n📝 Pesanan ke-" + nomorPesanan);
            
            // Input menu
            System.out.print("Pilih menu (1-" + menu.length + "): ");
            int pilihan = input.nextInt();
            
            // Validasi pilihan
            while (pilihan < 1 || pilihan > menu.length) {
                System.out.println("❌ Pilihan tidak valid! Silakan pilih 1-" + menu.length);
                System.out.print("Pilih menu (1-" + menu.length + "): ");
                pilihan = input.nextInt();
            }
            
            // Input jumlah
            System.out.print("Jumlah: ");
            int jml = input.nextInt();
            
            // Validasi jumlah
            while (jml < 1) {
                System.out.println("❌ Jumlah minimal 1!");
                System.out.print("Jumlah: ");
                jml = input.nextInt();
            }
            
            // Tambahkan ke pesanan
            pesanan.add(menu[pilihan-1]);
            jumlah.add(jml);
            
            System.out.println("✅ " + menu[pilihan-1] + " x" + jml + " ditambahkan!");
            
            input.nextLine(); // Membersihkan buffer
            
            // Tanya apakah mau tambah pesanan
            System.out.print("\n➕ Tambah pesanan lagi? (ya/tidak): ");
            lanjut = input.nextLine();
            
            nomorPesanan++;
        }
        
        // === TAMPILKAN STRUK ===
        System.out.println("\n" + "=".repeat(35));
        System.out.println("🧾 STRUK PEMBELIAN");
        System.out.println("=".repeat(35));
        
        double total = 0;
        
        // Tampilkan detail pesanan
        for (int i = 0; i < pesanan.size(); i++) {
            double subtotal = 0;
            
            // Cari harga menu
            for (int j = 0; j < menu.length; j++) {
                if (pesanan.get(i).equals(menu[j])) {
                    subtotal = harga[j] * jumlah.get(i);
                    break;
                }
            }
            
            System.out.printf("%-15s x%d %10s%n", 
                pesanan.get(i), jumlah.get(i), "Rp " + subtotal);
            total += subtotal;
        }
        
        System.out.println("-".repeat(35));
        double pajak = total * 0.1;
        double grandTotal = total + pajak;
        
        System.out.printf("%-15s %10s%n", "Subtotal:", "Rp " + total);
        System.out.printf("%-15s %10s%n", "Pajak (10%):", "Rp " + pajak);
        System.out.println("=".repeat(35));
        System.out.printf("%-15s %10s%n", "TOTAL:", "Rp " + grandTotal);
        System.out.println("=".repeat(35));
        System.out.println("Terima kasih atas kunjungan Anda! 🙏");
        
        input.close();
    }
}
```

### 📸 Contoh Interaksi:
```
🛒 SISTEM PEMESANAN RESTORAN
===================================

📋 DAFTAR MENU:
1. Nasi Goreng - Rp 25000.0
2. Mie Ayam - Rp 22000.0
3. Soto - Rp 20000.0
4. Es Teh - Rp 5000.0
5. Es Jeruk - Rp 6000.0

📝 Pesanan ke-1
Pilih menu (1-5): 1
Jumlah: 2
✅ Nasi Goreng x2 ditambahkan!

➕ Tambah pesanan lagi? (ya/tidak): ya

📝 Pesanan ke-2
Pilih menu (1-5): 4
Jumlah: 3
✅ Es Teh x3 ditambahkan!

➕ Tambah pesanan lagi? (ya/tidak): tidak

===================================
🧾 STRUK PEMBELIAN
===================================
Nasi Goreng     x2     Rp 50000.0
Es Teh          x3     Rp 15000.0
-----------------------------------
Subtotal:              Rp 65000.0
Pajak (10%):           Rp 6500.0
===================================
TOTAL:                 Rp 71500.0
===================================
Terima kasih atas kunjungan Anda! 🙏
```

---

## 💻 Praktik 3: Program Menu Validasi

### 🎯 Tujuan:
Membuat program menu dengan validasi menggunakan do-while.

### 📝 Langkah 1: Buat Project Baru
1. Klik **File → New Project**
2. Pilih **Java → Java Application**
3. Beri nama project: `MenuValidasi`
4. Klik **Finish**

### 📝 Langkah 2: Tulis Kode Program
```java
package menuvalidasi;

import java.util.Scanner;

public class MenuValidasi {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("🍽️ RESTORAN SEDERHANARASA");
        System.out.println("=".repeat(30));
        
        // === MENU UTAMA DENGAN DO-WHILE ===
        int pilihan;
        
        do {
            System.out.println("\n📋 MENU UTAMA");
            System.out.println("1. 🍛 Lihat Menu Makanan");
            System.out.println("2. 🥤 Lihat Menu Minuman");
            System.out.println("3. 💰 Info Harga");
            System.out.println("4. 🚪 Keluar");
            System.out.print("Pilih menu (1-4): ");
            
            // Validasi input harus angka
            while (!input.hasNextInt()) {
                System.out.println("❌ Masukkan angka!");
                input.next(); // Buang input yang bukan angka
                System.out.print("Pilih menu (1-4): ");
            }
            
            pilihan = input.nextInt();
            
            // Validasi range 1-4
            if (pilihan < 1 || pilihan > 4) {
                System.out.println("❌ Pilihan tidak valid! Silakan pilih 1-4.");
                continue; // Langsung ke iterasi berikutnya
            }
            
            // Proses pilihan
            switch (pilihan) {
                case 1:
                    tampilkanMenuMakanan();
                    break;
                case 2:
                    tampilkanMenuMinuman();
                    break;
                case 3:
                    tampilkanInfoHarga();
                    break;
                case 4:
                    System.out.println("👋 Terima kasih telah berkunjung!");
                    break;
            }
            
        } while (pilihan != 4);
        
        input.close();
    }
    
    // Method untuk menampilkan menu makanan
    private static void tampilkanMenuMakanan() {
        System.out.println("\n🍛 MENU MAKANAN");
        System.out.println("-".repeat(20));
        
        String[] makanan = {"Nasi Goreng", "Mie Ayam", "Soto", "Nasi Padang", "Rendang"};
        double[] harga = {25000, 22000, 20000, 30000, 35000};
        
        for (int i = 0; i < makanan.length; i++) {
            System.out.println((i+1) + ". " + makanan[i] + " - Rp " + harga[i]);
        }
    }
    
    // Method untuk menampilkan menu minuman
    private static void tampilkanMenuMinuman() {
        System.out.println("\n🥤 MENU MINUMAN");
        System.out.println("-".repeat(20));
        
        String[] minuman = {"Es Teh", "Es Jeruk", "Jus Alpukat", "Kopi", "Teh Manis"};
        double[] harga = {5000, 6000, 15000, 8000, 4000};
        
        for (int i = 0; i < minuman.length; i++) {
            System.out.println((i+1) + ". " + minuman[i] + " - Rp " + harga[i]);
        }
    }
    
    // Method untuk menampilkan info harga
    private static void tampilkanInfoHarga() {
        System.out.println("\n💰 INFO HARGA");
        System.out.println("-".repeat(20));
        System.out.println("🍛 Makanan: Rp 20.000 - Rp 35.000");
        System.out.println("🥤 Minuman: Rp 4.000 - Rp 15.000");
        System.out.println("💳 Pembayaran: Tunai, Debit, E-Wallet");
        System.out.println("🚀 Delivery: Gratis untuk pembelian > Rp 50.000");
    }
}
```

### 📸 Contoh Interaksi:
```
🍽️ RESTORAN SEDERHANARASA
==============================

📋 MENU UTAMA
1. 🍛 Lihat Menu Makanan
2. 🥤 Lihat Menu Minuman
3. 💰 Info Harga
4. 🚪 Keluar
Pilih menu (1-4): 1

🍛 MENU MAKANAN
--------------------
1. Nasi Goreng - Rp 25000.0
2. Mie Ayam - Rp 22000.0
3. Soto - Rp 20000.0
4. Nasi Padang - Rp 30000.0
5. Rendang - Rp 35000.0

📋 MENU UTAMA
1. 🍛 Lihat Menu Makanan
2. 🥤 Lihat Menu Minuman
3. 💰 Info Harga
4. 🚪 Keluar
Pilih menu (1-4): abc
❌ Masukkan angka!
Pilih menu (1-4): 5
❌ Pilihan tidak valid! Silakan pilih 1-4.

📋 MENU UTAMA
1. 🍛 Lihat Menu Makanan
2. 🥤 Lihat Menu Minuman
3. 💰 Info Harga
4. 🚪 Keluar
Pilih menu (1-4): 4
👋 Terima kasih telah berkunjung!
```

---

## 🚨 Error yang Sering Terjadi & Solusinya

### ❌ Error #1: "ArrayIndexOutOfBoundsException"
**Contoh:**
```
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
```

**🔍 Penyebab:** Mengakses array index di luar batas.

**✅ Solusi:** Periksa batas array
```java
// ❌ SALAH
for (int i = 0; i <= array.length; i++) { // <= seharusnya <

// ✅ BENAR
for (int i = 0; i < array.length; i++) {
```

### ❌ Error #2: Infinite Loop
**Gejala:** Program berjalan terus tanpa berhenti.

**🔍 Penyebab:** Kondisi while tidak pernah berubah.

**✅ Solusi:** Pastikan kondisi berubah
```java
// ❌ SALAH
int counter = 0;
while (counter < 5) {
    System.out.println("Hello");
    // counter tidak pernah bertambah!
}

// ✅ BENAR
int counter = 0;
while (counter < 5) {
    System.out.println("Hello ke-" + counter);
    counter++; // penting!
}
```

### ❌ Error #3: Scanner Problem
**Gejala:** Input terlewat atau tidak berfungsi.

**🔍 Penyebab:** Campuran `nextInt()` dan `nextLine()`.

**✅ Solusi:** Tambah `nextLine()` setelah `nextInt()`
```java
int angka = input.nextInt();
input.nextLine(); // tambahkan ini!
String teks = input.nextLine();
```

---

## 🎯 Latihan Praktik

### 🏆 Latihan 1: Modifikasi Program
Tambahkan fitur berikut ke program Praktik 2:

1. **💰 Diskon 10%** jika total pembelian > Rp 100.000
2. **🎁 Beli 1 gratis 1** untuk minuman jika total > Rp 50.000
3. **📊 Tampilkan subtotal** sebelum pajak
4. **🏷️ Tambah kategori "Dessert"** dengan 2 menu tambahan

### 🤔 Latihan 2: Analisis Pengulangan
Jawab pertanyaan berikut:

1. **🤷‍♂️ Mengapa kita menggunakan `for` untuk menampilkan menu?**
2. **🤷‍♀️ Mengapa kita menggunakan `while` untuk pemesanan?**
3. **🤷‍♂️ Kapan sebaiknya menggunakan `do-while`?**

### 🚀 Latihan 3: Tantangan Ekstra
Buat program baru dengan fitur:
- **📈 Hitung total penjualan harian**
- **🔍 Cari menu termahal dan termurah**
- **📊 Tampilkan statistik pesanan**

---

## 📊 Evaluasi

### 🎯 Indikator Keberhasilan:
1. ✅ **Program dapat dijalankan** tanpa error
2. ✅ **3 jenis pengulangan digunakan** dengan benar
3. ✅ **Input dan output sesuai** dengan spesifikasi
4. ✅ **Mahasiswa dapat menjelaskan** perbedaan setiap jenis pengulangan

### 📝 Rubrik Penilaian:

| Kriteria | Sangat Baik (90-100) | Baik (75-89) | Cukup (60-74) | Kurang (<60) |
|-----------|---------------------|---------------|----------------|--------------|
| **Kehadiran & Partisipasi** | Aktif, tanya jawab | Ikuti diskusi | Pasif | Tidak hadir |
| **Praktik di Lab** | Mandiri, no error | Bantu sedikit | Bantu banyak | Tidak bisa |
| **Hasil Program** | Lengkap, fitur tambahan | Sesuai soal | Kurang fitur | Tidak jalan |
| **Pemahaman Konsep** | Jelaskan dengan analogi | Jelaskan dasar | Sebagian paham | Tidak paham |

---

## 🎉 Tips dan Trik

### 🧠 1. Memilih Jenis Pengulangan yang Tepat

**📋 Decision Tree:**
```
Apakah kamu tahu jumlah pasti pengulangan?
├── Ya → Gunakan FOR
└── Tidak → Gunakan WHILE
    ├── Harus jalan sekali? → Do-while
    └── Tidak harus jalan? → While biasa
```

### 🐛 2. Debugging di NetBeans

**🔍 Cara Set Breakpoint:**
1. Klik di margin kiri nomor baris
2. Akan muncul titik merah 🔴
3. Klik kanan → **Debug File**

### 📝 3. Best Practices

**✅ DO's:**
- Gunakan nama variabel yang jelas
- Comment kode yang rumit
- Test dengan berbagai input
- Handle error dengan baik

**❌ DON'Ts:**
- Jangan buat infinite loop
- Jangan lupa update kondisi while
- Jangan campur `nextInt()` dan `nextLine()` sembarangan

---

## 🔗 Referensi Tambahan

### 📚 Tutorial:
1. **Oracle Java Tutorial**: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html
2. **NetBeans Documentation**: https://netbeans.apache.org/kb/docs/java/

### 🎥 Video:
1. **Java For Beginners** (YouTube: Programming with Mosh)
2. **NetBeans Tutorial** (YouTube: NetBeans Official)

---

## 👨‍🏫 Catatan untuk Dosen

### 📋 Persiapan:
1. ✅ Pastikan **NetBeans terinstall** di lab
2. ✅ **Test semua kode** sebelum demo
3. ✅ Sediakan **contoh project** yang sudah jadi

### 🎯 Selama Kuliah:
1. **Demo dulu**, baru penjelasan teori
2. **Gunakan analogi restoran** untuk setiap konsep
3. **Monitor progress** mahasiswa satu per satu

### ⏰ Time Management:
- **15 menit**: Teori pengulangan
- **20 menit**: Demo praktik 1
- **25 menit**: Praktik mandiri
- **15 menit**: Debugging dan Q&A
- **5 menit**: Wrap-up

---

## 🎉 Selamat Belajar!

**💡 Remember:** Programming is like cooking. First you follow the recipe exactly, then you can add your own spices!

**🚀 Keep practicing:** Setiap error adalah pelajaran. Setiap bug adalah tantangan!

**📞 Need help?** Jangan ragu bertanya ke dosen atau teman!

---

# 🍽️ SELAMAT MENCOBA DAN SEMOGA SUKSES! 🎉
