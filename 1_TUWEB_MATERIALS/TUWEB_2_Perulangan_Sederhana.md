# TUWEB 2 - Aktivitas Belajar 6
# Perulangan Sederhana (for & while)

**Mata Kuliah**: STSI4201 - Pemrograman Berbasis Desktop  
**Tutor**: Anton Prafanto, S.Kom., M.T.  
**Metode**: Learning by Doing  
**Durasi**: 50-55 menit  
**Target**: Mahasiswa yang sudah bisa membuat class dan if-else sederhana

---

## 1. PEMBUKAAN (3 menit)

Assalamu'alaikum warahmatullahi wabarakatuh. Salam sejahtera untuk kita semua.

Halo teman-teman! Selamat datang kembali di TUWEB ke-2! Pak Anton harap teman-teman semua dalam keadaan sehat dan semangat belajar! 💪

### Sudah Sampai Mana Kita?

Di TUWEB 1, kita sudah belajar:
- ✅ Membuat program "Hello World"
- ✅ Memahami Class dan Object
- ✅ Membuat class sederhana dengan attribute

**Keren, kan?!** Kalian sudah bisa coding! 🎉

### Apa yang Akan Kita Pelajari Hari Ini?

Hari ini kita akan belajar sesuatu yang **SANGAT PENTING** dan **SERING DIPAKAI**: **PERULANGAN**!

**Bayangkan kalau kita harus:**
- Menampilkan angka 1 sampai 100? ← Capek kalau nulis manual!
- Mengecek 1000 data mahasiswa? ← Mau berapa lama?
- Menghitung total nilai dari 50 siswa? ← Waduh!

**Solusinya?** Pakai **PERULANGAN**! Biarkan komputer yang kerja berulang-ulang, bukan kita! 😎

### Yang Akan Kita Praktikkan:

- **For Loop** (yang paling sering dipakai!)
- **While Loop** (alternatif for)
- Menghitung total dengan perulangan
- Menampilkan pola angka

**Langsung praktik ya, bukan teori doang!** 🚀

---

## 2. TUJUAN PEMBELAJARAN

Setelah mengikuti TUWEB ini, teman-teman akan **BISA**:

1. **Menggunakan for loop** untuk mengulang perintah dengan jumlah yang sudah ditentukan
   - Contoh: Tampilkan "Hello" sebanyak 10 kali

2. **Menggunakan while loop** untuk mengulang perintah sampai kondisi terpenuhi
   - Contoh: Input password sampai benar

3. **Menghitung total** dengan menggunakan perulangan
   - Contoh: Hitung total 1+2+3+...+100

**Fokus kita**: Paham konsep dan bisa pakai, bukan hafal rumus! 👍

---

## 3. PERSIAPAN NETBEANS (3 menit)

### Pastikan Siap:

- ✅ NetBeans sudah terbuka
- ✅ Sudah punya project (atau siap buat project baru)
- ✅ Sudah ingat cara run program (F6)

### Buat Project Baru untuk Praktik Hari Ini

**Langkah Cepat**:
1. File → New Project
2. Java with Ant → Java Application
3. **Project Name**: `PerulanganSederhana`
4. **Create Main Class**: ✅ Centang
5. Finish

Mudah, kan? 😊

---

## 4. KONSEP SINGKAT: Kenapa Perlu Perulangan? (5 menit)

### Masalah: Tugas Berulang itu Melelahkan!

**Cerita Pak Anton waktu SD:**

Dulu waktu SD, kalau telat, saya sering dihukum menulis:  
*"Saya tidak akan telat lagi"*  
**Sebanyak 100 kali di papan tulis!** 😭

Capek banget! Tangan pegal, bosan, dan membuang waktu!

**Seandainya waktu itu saya sudah bisa coding...**

```java
for(int i = 1; i <= 100; i++) {
    System.out.println(i + ". Saya tidak akan telat lagi");
}
```

**BOOM!** Selesai dalam 1 detik! 🎉

### Analogi Kehidupan Sehari-hari

**Perulangan itu seperti:**

1. **Mesin Fotokopi** 📄
   - Mau fotokopi 50 lembar?
   - Tidak perlu fotokopi satu-satu 50 kali!
   - Tinggal setting "50 copies", mesin yang kerja berulang!

2. **Alarm Bangun** ⏰
   - Alarm bunyi setiap hari jam 5 pagi
   - Kita tidak perlu setting manual setiap malam
   - Sudah otomatis berulang!

3. **Pabrik Roti** 🍞
   - Mesin membuat roti berulang-ulang
   - Ratusan roti dalam sehari
   - Mesin tidak lelah, tidak bosan!

**Komputer itu seperti mesin: bisa mengerjakan tugas berulang tanpa lelah!**

### Dalam Programming:

**Perulangan (Loop)** = Perintah untuk mengulang serangkaian instruksi.

**Keuntungan:**
- ⚡ Cepat (dalam hitungan detik/milidetik)
- 💪 Tidak lelah (komputer tidak butuh istirahat)
- ✅ Akurat (tidak ada typo karena bosan)
- 📝 Kode lebih ringkas dan rapi

---

## 5. PRAKTIK GUIDED - "AYO IKUTI SAYA!" (30 menit)

Mari kita praktik langsung! Ini bagian paling seru! 🎯

---

### 📝 PRAKTIK 1: For Loop - Menampilkan Angka 1-10

**"Kita mulai dari yang paling sederhana dulu ya!"**

#### LANGKAH DEMI LANGKAH:

**Langkah 1**: Buka file `PerulanganSederhana.java` (yang sudah dibuat tadi)

**Langkah 2**: Bersihkan komentar agar lebih rapi

**Langkah 3**: Ketik kode berikut di method main:

```java
package perulangansederhana;

public class PerulanganSederhana {

    public static void main(String[] args) {
        // Program Perulangan Pertama
        System.out.println("=== Menampilkan Angka 1-10 ===");
        
        // Perulangan for
        for(int i = 1; i <= 10; i++) {
            System.out.println("Angka ke-" + i);
        }
        
        System.out.println("Selesai!");
    }
    
}
```

**Langkah 4**: Jalankan program (F6)

**HASILNYA:**
```
=== Menampilkan Angka 1-10 ===
Angka ke-1
Angka ke-2
Angka ke-3
Angka ke-4
Angka ke-5
Angka ke-6
Angka ke-7
Angka ke-8
Angka ke-9
Angka ke-10
Selesai!
```

**SELAMAT! Teman-teman baru saja membuat perulangan pertama!** 🎊

#### PENJELASAN KODE (Baris per Baris):

```java
for(int i = 1; i <= 10; i++)
```

Mari kita bedah bagian-bagian for loop:

**1. `int i = 1`** → **Inisialisasi** (Titik Mulai)
- Buat variabel `i` dengan nilai awal 1
- `i` adalah singkatan dari "index" atau "iterator" (penghitung)
- **Analogi**: Kita mulai menghitung dari angka 1

**2. `i <= 10`** → **Kondisi** (Sampai Kapan?)
- Selama i kurang dari atau sama dengan 10, perulangan terus berjalan
- Kalau i sudah lebih dari 10, berhenti!
- **Analogi**: "Ulangi sampai hitungan ke-10"

**3. `i++`** → **Increment** (Naik Berapa?)
- Setelah satu kali putaran, i ditambah 1
- `i++` sama dengan `i = i + 1`
- **Analogi**: Setiap putaran, hitungan naik 1

**Visualisasi Proses:**

```
Putaran 1: i = 1  → Cek: 1 <= 10? YA → Tampilkan → i jadi 2
Putaran 2: i = 2  → Cek: 2 <= 10? YA → Tampilkan → i jadi 3
Putaran 3: i = 3  → Cek: 3 <= 10? YA → Tampilkan → i jadi 4
...
Putaran 10: i = 10 → Cek: 10 <= 10? YA → Tampilkan → i jadi 11
Putaran 11: i = 11 → Cek: 11 <= 10? TIDAK → BERHENTI!
```

**Mudah dipahami kan?** 😊

---

### 📝 PRAKTIK 2: Variasi For Loop

**"Sekarang kita coba variasi lain dari for loop!"**

#### A. Menampilkan Angka Mundur (10, 9, 8,... 1)

Tambahkan kode ini setelah praktik 1:

```java
// Perulangan mundur
System.out.println("\n=== Menampilkan Angka Mundur ===");

for(int i = 10; i >= 1; i--) {
    System.out.println("Angka: " + i);
}

System.out.println("Selesai!");
```

**Jalankan!** (F6)

**HASILNYA:**
```
=== Menampilkan Angka Mundur ===
Angka: 10
Angka: 9
Angka: 8
...
Angka: 1
Selesai!
```

**PENJELASAN**:
- `i = 10` → Mulai dari 10
- `i >= 1` → Sampai i masih lebih besar atau sama dengan 1
- `i--` → Setiap putaran, i dikurangi 1 (mundur!)

---

#### B. Menampilkan Angka Genap 2, 4, 6, 8, 10

```java
// Perulangan angka genap
System.out.println("\n=== Menampilkan Angka Genap ===");

for(int i = 2; i <= 10; i = i + 2) {
    System.out.println("Angka: " + i);
}
```

**Jalankan!**

**HASILNYA:**
```
=== Menampilkan Angka Genap ===
Angka: 2
Angka: 4
Angka: 6
Angka: 8
Angka: 10
```

**PENJELASAN**:
- `i = 2` → Mulai dari 2 (angka genap pertama)
- `i <= 10` → Sampai 10
- `i = i + 2` → Setiap putaran, i naik 2 (jadi 2, 4, 6, 8, 10)

**Keren, kan?!** Kita bisa atur perulangan sesuai kebutuhan! 🌟

---

### 📝 PRAKTIK 3: Menghitung Total dengan For Loop

**"Sekarang kita pakai for loop untuk menghitung!"**

Misalnya kita mau hitung: **1 + 2 + 3 + 4 + 5 = ?**

#### KODE:

```java
// Menghitung total 1+2+3+4+5
System.out.println("\n=== Menghitung Total 1+2+3+4+5 ===");

int total = 0;  // Variabel untuk menyimpan total

for(int i = 1; i <= 5; i++) {
    total = total + i;  // Tambahkan i ke total
    System.out.println("i = " + i + ", Total sekarang = " + total);
}

System.out.println("\nTotal akhir: " + total);
```

**Jalankan!**

**HASILNYA:**
```
=== Menghitung Total 1+2+3+4+5 ===
i = 1, Total sekarang = 1
i = 2, Total sekarang = 3
i = 3, Total sekarang = 6
i = 4, Total sekarang = 10
i = 5, Total sekarang = 15

Total akhir: 15
```

**PENJELASAN DETAIL:**

```java
int total = 0;
```
- Kita buat variabel `total` dengan nilai awal 0
- Variabel ini akan menyimpan hasil penjumlahan

```java
total = total + i;
```
- Ambil nilai `total` yang sekarang, tambah dengan `i`, simpan kembali ke `total`
- **Visualisasi**:
  ```
  Putaran 1: total = 0 + 1 = 1
  Putaran 2: total = 1 + 2 = 3
  Putaran 3: total = 3 + 3 = 6
  Putaran 4: total = 6 + 4 = 10
  Putaran 5: total = 10 + 5 = 15
  ```

**Powerful, kan?!** Bayangkan kalau kita hitung 1+2+...+100, manual capek! Pakai for loop, cepat! ⚡

---

### 📝 PRAKTIK 4: While Loop - Alternatif For

**"Selain for, ada juga while loop. Kapan pakai while?"**

**Pakai while kalau**: Kita **tidak tahu pasti** berapa kali perulangan akan terjadi.

**Contoh kasus**: Input password sampai benar (tidak tahu user akan salah berapa kali).

#### CONTOH SEDERHANA: Menampilkan Angka 1-5 dengan While

```java
// Perulangan while
System.out.println("\n=== Perulangan While ===");

int hitungan = 1;  // Variabel penghitung

while(hitungan <= 5) {
    System.out.println("Hitungan ke-" + hitungan);
    hitungan++;  // Jangan lupa tambah 1!
}

System.out.println("Selesai!");
```

**Jalankan!**

**HASILNYA:**
```
=== Perulangan While ===
Hitungan ke-1
Hitungan ke-2
Hitungan ke-3
Hitungan ke-4
Hitungan ke-5
Selesai!
```

**PENJELASAN**:

```java
int hitungan = 1;
```
- Buat variabel `hitungan` dengan nilai 1
- **Penting**: Di while, kita buat variabel di LUAR loop

```java
while(hitungan <= 5)
```
- **Arti**: "Selama hitungan masih <= 5, terus ulangi"
- Kalau kondisi jadi FALSE (hitungan > 5), berhenti!

```java
hitungan++;
```
- **SANGAT PENTING**: Jangan lupa tambah nilai hitungan!
- Kalau lupa, loop akan jalan terus (infinite loop) 😱

**Perbedaan For vs While:**

| For Loop | While Loop |
|----------|------------|
| Tahu pasti berapa kali loop | Tidak tahu pasti berapa kali |
| Penghitung di dalam for | Penghitung di luar while |
| Contoh: Tampilkan 1-10 | Contoh: Input sampai benar |
| Lebih singkat | Lebih fleksibel |

**Kapan pakai mana?**
- **Pakai for** kalau sudah tahu berapa kali loop (90% kasus)
- **Pakai while** kalau tergantung kondisi yang berubah-ubah

---

### 📝 PRAKTIK 5: Aplikasi Real - Tabel Perkalian

**"Mari kita buat sesuatu yang berguna: Tabel Perkalian!"**

Misalnya, tabel perkalian 5:

```java
// Tabel Perkalian
System.out.println("\n=== Tabel Perkalian 5 ===");

int angka = 5;  // Angka yang akan dikalikan

for(int i = 1; i <= 10; i++) {
    int hasil = angka * i;
    System.out.println(angka + " x " + i + " = " + hasil);
}
```

**Jalankan!**

**HASILNYA:**
```
=== Tabel Perkalian 5 ===
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35
5 x 8 = 40
5 x 9 = 45
5 x 10 = 50
```

**Keren, kan?!** Dalam hitungan detik, kita punya tabel perkalian! 📊

**Coba ubah**:
- Ganti `int angka = 5` menjadi `int angka = 7`
- Run lagi, lihat hasilnya!

---

### 📝 PRAKTIK 6: Menghitung Rata-Rata Nilai

**"Contoh praktis: Menghitung rata-rata nilai mahasiswa"**

```java
// Menghitung Rata-rata
System.out.println("\n=== Menghitung Rata-Rata 5 Nilai ===");

// Data nilai mahasiswa
int nilai1 = 80;
int nilai2 = 75;
int nilai3 = 90;
int nilai4 = 85;
int nilai5 = 70;

// Hitung total
int totalNilai = 0;
totalNilai = nilai1 + nilai2 + nilai3 + nilai4 + nilai5;

// Hitung rata-rata
double rataRata = totalNilai / 5.0;

System.out.println("Nilai 1: " + nilai1);
System.out.println("Nilai 2: " + nilai2);
System.out.println("Nilai 3: " + nilai3);
System.out.println("Nilai 4: " + nilai4);
System.out.println("Nilai 5: " + nilai5);
System.out.println("Total Nilai: " + totalNilai);
System.out.println("Rata-rata: " + rataRata);
```

**Jalankan!**

**HASILNYA:**
```
=== Menghitung Rata-Rata 5 Nilai ===
Nilai 1: 80
Nilai 2: 75
Nilai 3: 90
Nilai 4: 85
Nilai 5: 70
Total Nilai: 400
Rata-rata: 80.0
```

**NOTE**: Ini versi sederhana tanpa array. Di praktik berikutnya, kita akan pakai array untuk lebih efisien! 👍

---

### 📝 PRAKTIK 7: Loop dengan Array (PENTING UNTUK TUGAS!)

**"Sekarang kita gabungkan perulangan dengan Array!"**

> **🎯 KONEKSI KE TUGAS 1 & 2**: Di Tugas 1-2, teman-teman akan pakai Array untuk menyimpan menu restoran. Mari kita pelajari cara iterate (jalan melalui) Array dengan loop!

#### APA ITU ARRAY?

**Array** = Kumpulan data dengan tipe sama yang disimpan dalam satu variabel.

**Analogi:**
- **Variabel biasa** = Kotak untuk 1 benda
- **Array** = Rak dengan banyak kotak, setiap kotak punya nomor (index)

**Contoh**:
```java
// Tanpa Array - ribet!
String menu1 = "Nasi Goreng";
String menu2 = "Mie Ayam";
String menu3 = "Sate";
String menu4 = "Bakso";

// Dengan Array - efisien!
String[] menuMakanan = {"Nasi Goreng", "Mie Ayam", "Sate", "Bakso"};
```

---

#### PRAKTIK: Menampilkan Menu Restoran dengan For Loop

**Langkah 1**: Tambahkan kode berikut di method main:

```java
// Array untuk menyimpan menu makanan
String[] menuMakanan = {"Nasi Goreng", "Mie Ayam", "Sate", "Bakso", "Gado-gado"};
int[] hargaMakanan = {25000, 20000, 30000, 18000, 22000};

System.out.println("\n=== MENU MAKANAN ===");

// For loop untuk menampilkan menu
for(int i = 0; i < menuMakanan.length; i++) {
    System.out.println((i+1) + ". " + menuMakanan[i] + " - Rp " + hargaMakanan[i]);
}
```

**Jalankan!**

**HASILNYA:**
```
=== MENU MAKANAN ===
1. Nasi Goreng - Rp 25000
2. Mie Ayam - Rp 20000
3. Sate - Rp 30000
4. Bakso - Rp 18000
5. Gado-gado - Rp 22000
```

**PENJELASAN:**

```java
String[] menuMakanan = {...};
```
- **`String[]`** = Array of String (kumpulan String)
- **`{...}`** = Isi array, dipisah koma

```java
for(int i = 0; i < menuMakanan.length; i++)
```
- **`i = 0`** = Array dimulai dari index 0 (bukan 1!)
- **`menuMakanan.length`** = Jumlah element dalam array (otomatis!)
- **`i < menuMakanan.length`** = Loop sampai akhir array

```java
menuMakanan[i]
```
- **`[i]`** = Akses element array pada index i
- **`[0]`** = Element pertama, **`[1]`** = Element kedua, dst.

**KEY POINT**: Array dimulai dari index **0**, bukan 1! ⚠️

---

#### FOR-EACH LOOP (Enhanced For)

**Ada cara lebih mudah!** Pakai **For-Each Loop**:

```java
System.out.println("\n=== MENU MINUMAN (For-Each) ===");

String[] menuMinuman = {"Es Teh", "Jus Jeruk", "Es Campur", "Kopi"};

int nomor = 1;
for(String minuman : menuMinuman) {
    System.out.println(nomor + ". " + minuman);
    nomor++;
}
```

**HASILNYA:**
```
=== MENU MINUMAN (For-Each) ===
1. Es Teh
2. Jus Jeruk
3. Es Campur
4. Kopi
```

**PENJELASAN:**

```java
for(String minuman : menuMinuman) {
```
- **`String minuman`** = Variabel untuk menyimpan setiap element
- **`: menuMinuman`** = Dari array menuMinuman
- **Dibaca**: "Untuk setiap minuman dalam menuMinuman..."

**Kelebihan For-Each**:
- ✅ Lebih simple, tidak perlu index
- ✅ Tidak bisa salah batas (no index out of bounds)
- ✅ Lebih mudah dibaca

**Kapan pakai For-Each?**
- ✅ Kalau hanya perlu nilai element (tidak butuh index)
- ✅ Iterate dari awal sampai akhir
- ❌ Jangan pakai kalau perlu ubah element atau skip element

---

#### PRAKTIK: Hitung Total Harga dengan Loop + Array

```java
System.out.println("\n=== Menghitung Total Harga ===");

int[] hargaItems = {25000, 20000, 30000, 18000};
String[] namaItems = {"Nasi Goreng", "Mie Ayam", "Sate", "Bakso"};

int totalHarga = 0;

System.out.println("Item yang dipesan:");
for(int i = 0; i < namaItems.length; i++) {
    System.out.println("- " + namaItems[i] + ": Rp " + hargaItems[i]);
    totalHarga = totalHarga + hargaItems[i];  // Akumulasi
}

System.out.println("\nTotal yang harus dibayar: Rp " + totalHarga);
```

**HASILNYA:**
```
=== Menghitung Total Harga ===
Item yang dipesan:
- Nasi Goreng: Rp 25000
- Mie Ayam: Rp 20000
- Sate: Rp 30000
- Bakso: Rp 18000

Total yang harus dibayar: Rp 93000
```

**LUAR BIASA!** Ini mirip dengan yang akan teman-teman buat di Tugas 1-2! 🎯

---

#### KEY TAKEAWAYS - Loop dengan Array:

1. **Array** menyimpan banyak data dalam 1 variabel
2. **Index array** dimulai dari **0** (zero-based indexing)
3. **array.length** = jumlah element dalam array
4. **For loop** untuk iterate dengan index: `for(int i = 0; i < array.length; i++)`
5. **For-each loop** untuk iterate tanpa index: `for(TipeData item : array)`

---

### 📝 PRAKTIK 8: Input Validation dengan While Loop (PENTING!)

**"Untuk Tugas 2, teman-teman perlu validasi input sampai benar!"**

> **🎯 KONEKSI KE TUGAS 2**: Di Tugas 2, sistem harus terus meminta input sampai pelanggan memasukkan "selesai". Mari kita pelajari pattern ini!

#### IMPORT SCANNER

Pertama, tambahkan import di paling atas (setelah `package`):

```java
package perulanganshana;

import java.util.Scanner;  // ← Tambahkan ini!

public class PerulanganSederhana {
    public static void main(String[] args) {
        // Kode di sini...
    }
}
```

---

#### PATTERN 1: Loop Sampai Input Benar

```java
System.out.println("\n=== Input Validation ===");

Scanner input = new Scanner(System.in);
String jawaban = "";

// Loop sampai jawaban adalah "ya" atau "tidak"
while(!jawaban.equals("ya") && !jawaban.equals("tidak")) {
    System.out.print("Apakah teman-teman ingin melanjutkan? (ya/tidak): ");
    jawaban = input.nextLine().toLowerCase();
    
    if(!jawaban.equals("ya") && !jawaban.equals("tidak")) {
        System.out.println("❌ Input salah! Harus 'ya' atau 'tidak'.\n");
    }
}

System.out.println("✅ Jawaban teman-teman: " + jawaban);
```

**COBA JALANKAN** dan test dengan:
- Input salah: "iya", "yes", "abc" → akan terus minta input
- Input benar: "ya" atau "tidak" → loop berhenti

**PENJELASAN:**

```java
!jawaban.equals("ya") && !jawaban.equals("tidak")
```
- **`!`** = NOT (negasi)
- **`equals()`** = Cek apakah String sama
- **`&&`** = AND (kedua kondisi harus benar)
- **Dibaca**: "Selama jawaban BUKAN 'ya' DAN BUKAN 'tidak', terus ulang"

```java
toLowerCase()
```
- Ubah input jadi huruf kecil
- Jadi "YA", "Ya", "ya" semua jadi "ya" → user-friendly!

---

#### PATTERN 2: Loop Sampai "selesai" (Untuk Tugas 2!)

```java
System.out.println("\n=== Pemesanan Menu (ketik 'selesai' untuk stop) ===");

Scanner scanner = new Scanner(System.in);
String[] menuRestoran = {"Nasi Goreng", "Mie Ayam", "Sate", "Bakso"};

// Tampilkan menu
System.out.println("\nMenu yang tersedia:");
for(int i = 0; i < menuRestoran.length; i++) {
    System.out.println((i+1) + ". " + menuRestoran[i]);
}

// Pemesanan
String pesanan = "";
int jumlahPesanan = 0;

System.out.println("\nMasukkan nama menu yang dipesan (atau 'selesai' untuk berhenti):");

while(!pesanan.equals("selesai")) {
    System.out.print("Pesanan ke-" + (jumlahPesanan+1) + ": ");
    pesanan = input.nextLine();
    
    if(!pesanan.equals("selesai")) {
        // Validasi: apakah menu ada?
        boolean menuDitemukan = false;
        for(String menu : menuRestoran) {
            if(menu.equalsIgnoreCase(pesanan)) {
                menuDitemukan = true;
                break;
            }
        }
        
        if(menuDitemukan) {
            System.out.println("  ✅ " + pesanan + " ditambahkan!");
            jumlahPesanan++;
        } else {
            System.out.println("  ❌ Menu tidak tersedia! Pilih dari menu di atas.");
        }
    }
}

System.out.println("\nTotal pesanan: " + jumlahPesanan + " item");
System.out.println("Terima kasih!");
```

**COBA JALANKAN** dan test:
```
Menu yang tersedia:
1. Nasi Goreng
2. Mie Ayam
3. Sate
4. Bakso

Masukkan nama menu yang dipesan (atau 'selesai' untuk berhenti):
Pesanan ke-1: Nasi Goreng
  ✅ Nasi Goreng ditambahkan!
Pesanan ke-2: Pizza
  ❌ Menu tidak tersedia! Pilih dari menu di atas.
Pesanan ke-3: Sate
  ✅ Sate ditambahkan!
Pesanan ke-4: selesai

Total pesanan: 2 item
Terima kasih!
```

**AMAZING!** Ini **PERSIS** pattern yang dibutuhkan untuk Tugas 2! 🎯

---

**PENJELASAN VALIDASI MENU:**

```java
boolean menuDitemukan = false;
for(String menu : menuRestoran) {
    if(menu.equalsIgnoreCase(pesanan)) {
        menuDitemukan = true;
        break;
    }
}
```

- Loop through array `menuRestoran`
- `equalsIgnoreCase()` = cek String sama (case-insensitive)
- Kalau ketemu, set flag `menuDitemukan = true`
- `break` = keluar dari loop (karena sudah ketemu)

---

#### KEY TAKEAWAYS - Input Validation:

1. **While loop** perfect untuk validasi input
2. **Pattern**: `while(!input.equals("nilai_yang_benar")) { ... }`
3. **Scanner** untuk baca input: `input.nextLine()`
4. **equals()** untuk compare String (JANGAN pakai `==`)
5. **equalsIgnoreCase()** untuk compare tanpa peduli huruf besar/kecil
6. **Validasi** = cek apakah input sesuai kriteria sebelum process

**Ini skill ESSENTIAL untuk Tugas 2!** 💪

---

## 6. PRAKTIK MANDIRI - "GILIRAN KAMU!" (10 menit)

**"Nah sekarang giliran teman-teman praktik sendiri!"**

---

### ✏️ Latihan 1: Hitung Total 1+2+3+...+50 (BASIC)

**TUGAS**:
Buatlah program yang menghitung total dari 1 + 2 + 3 + ... + 50 menggunakan for loop.

**LANGKAH-LANGKAH**:
1. Buat variabel `total` dengan nilai awal 0
2. Buat for loop dari i = 1 sampai i = 50
3. Di dalam loop, tambahkan i ke total
4. Setelah loop selesai, tampilkan total

**OUTPUT YANG DIHARAPKAN**:
```
Total dari 1+2+3+...+50 = 1275
```

**TIPS**:
- Lihat lagi Praktik 3 (Menghitung Total)
- Ganti 5 menjadi 50
- Total yang benar adalah 1275

**KODE TEMPLATE** (isi bagian yang kosong):
```java
System.out.println("\n=== Latihan 1: Total 1-50 ===");

int total = 0;

for(int i = 1; i <= 50; i++) {
    // Lengkapi di sini!
}

System.out.println("Total dari 1+2+3+...+50 = " + total);
```

---

### ✏️ Latihan 2: Tampilkan Bilangan Ganjil 1-20 (MEDIUM)

**TUGAS**:
Buatlah program yang menampilkan bilangan ganjil dari 1 sampai 20.

**OUTPUT YANG DIHARAPKAN**:
```
Bilangan Ganjil 1-20:
1
3
5
7
9
11
13
15
17
19
```

**TIPS**:
- Mulai dari i = 1
- Setiap putaran, i naik 2 (i = i + 2)
- Atau bisa pakai if untuk cek ganjil (i % 2 == 1)

**KODE TEMPLATE**:
```java
System.out.println("\n=== Latihan 2: Bilangan Ganjil ===");

for(int i = 1; i <= 20; i = i + 2) {
    // Lengkapi di sini!
}
```

---

### ✏️ Latihan 3: Tabel Perkalian yang Dipilih (CHALLENGE)

**TUGAS**:
Buatlah program yang menampilkan tabel perkalian untuk angka yang berbeda-beda (misal: 3, 7, 9).

**OUTPUT YANG DIHARAPKAN**:
```
=== Tabel Perkalian 3 ===
3 x 1 = 3
3 x 2 = 6
...
3 x 10 = 30

=== Tabel Perkalian 7 ===
7 x 1 = 7
7 x 2 = 14
...
7 x 10 = 70
```

**TIPS**:
- Copy kode Praktik 5
- Buat 2-3 kali untuk angka berbeda
- Atau kalau sudah paham, bisa pakai nested loop (loop dalam loop)

**Kalau kesulitan, tidak apa-apa!**  
Fokus ke Latihan 1 dan 2 dulu. Latihan 3 adalah bonus! 😊

---

## 7. TROUBLESHOOTING UNTUK PEMULA (5 menit)

**"Masalah yang Sering Muncul & Solusinya"**

---

### ❗ ERROR 1: Infinite Loop (Program Tidak Berhenti)

**Gejala**: 
- Program terus jalan tidak berhenti
- Output terus keluar tanpa henti
- NetBeans hang/not responding

**Penyebab**: 
Lupa menambah/mengurangi penghitung di while loop

**Contoh SALAH**:
```java
int i = 1;
while(i <= 10) {
    System.out.println(i);
    // LUPA i++ ← FATAL ERROR!
}
```

**Solusi**:
```java
int i = 1;
while(i <= 10) {
    System.out.println(i);
    i++;  // ← JANGAN LUPA INI!
}
```

**Cara keluar dari infinite loop**:
- Klik tombol **Stop** (kotak merah) di toolbar NetBeans
- Atau tutup window Output

---

### ❗ ERROR 2: Cannot resolve symbol 'i'

**Pesan error:**
```
error: cannot find symbol
  symbol:   variable i
  location: class PerulanganSederhana
```

**Penyebab**: 
Menggunakan variabel `i` di luar for loop

**Contoh SALAH**:
```java
for(int i = 1; i <= 10; i++) {
    System.out.println(i);
}
System.out.println(i);  // ← ERROR! i sudah tidak ada
```

**Penjelasan**:
- Variabel `i` dalam for loop **hanya hidup di dalam loop**
- Di luar loop, `i` sudah tidak bisa diakses

**Solusi**:
Kalau butuh nilai i di luar, deklarasikan di luar:
```java
int i;  // Deklarasi di luar
for(i = 1; i <= 10; i++) {
    System.out.println(i);
}
System.out.println("Nilai akhir i: " + i);  // OK!
```

---

### ❗ ERROR 3: Hasil Tidak Sesuai yang Diharapkan

**Masalah**: Total salah, angka tidak muncul semua, dll.

**Penyebab**: Logika kondisi atau increment salah

**Contoh Kasus**:
Mau tampilkan 1-10, tapi cuma muncul 1-9?

```java
for(int i = 1; i < 10; i++) {  // ← Salah di sini!
    System.out.println(i);
}
```

**Solusi**:
```java
for(int i = 1; i <= 10; i++) {  // ← Harus <= bukan <
    System.out.println(i);
}
```

**Perhatikan**:
- `i < 10` → berhenti saat i = 10 (jadi cuma sampai 9)
- `i <= 10` → berhenti saat i = 11 (jadi sampai 10)

---

### 💡 Tips For Loop untuk Pemula:

**1. Ingat Pola Dasar For:**
```java
for(mulai; sampai; naik_berapa) {
    // Perintah yang diulang
}
```

**2. Cek 3 Bagian For:**
- ✅ Inisialisasi benar? (mulai dari berapa?)
- ✅ Kondisi benar? (sampai kapan?)
- ✅ Increment benar? (naik/turun berapa?)

**3. Print i untuk Debugging:**
```java
for(int i = 1; i <= 10; i++) {
    System.out.println("DEBUG: i sekarang = " + i);
    // Kode lain...
}
```

**4. Jangan Lupa Kurung Kurawal:**
```java
// SALAH - tanpa kurung kurawal
for(int i = 1; i <= 10; i++)
    System.out.println(i);
    System.out.println("Selesai");  // Ini di luar loop!

// BENAR - pakai kurung kurawal
for(int i = 1; i <= 10; i++) {
    System.out.println(i);
    System.out.println("Selesai");  // Ini di dalam loop
}
```

---

**Masih error?**  
📧 Tanya di forum diskusi  
💬 Share screenshot errornya  
Pak Anton siap membantu! 💪

---

## 8. KETERKAITAN DENGAN TUGAS & REMINDER

**"Hubungannya dengan Tugas Kalian"**

### Review Tugas 1 📝

Teman-teman sudah selesai **Tugas 1** kan? (Deadline: AB 7)

**Yang sudah dikerjakan di Tugas 1:**
- ✅ Membuat class
- ✅ Membuat object
- ✅ Menggunakan if-else (struktur keputusan)

**Nah, materi perulangan hari ini melengkapi kemampuan teman-teman!**

### Integrasi Perulangan + If-Else

**Contoh penggunaan gabungan**:

```java
// Menampilkan angka 1-10, tapi khusus angka genap diberi tanda
for(int i = 1; i <= 10; i++) {
    if(i % 2 == 0) {
        System.out.println(i + " adalah angka GENAP");
    } else {
        System.out.println(i + " adalah angka GANJIL");
    }
}
```

**Powerful, kan?!** Perulangan + If-Else bisa membuat program yang lebih canggih! 🚀

### Persiapan Tugas 2 📅

**Tugas 2** (AB 8) akan meminta teman-teman membuat:
- Diagram UML
- Program dengan class dan method
- **Mungkin ada perulangan juga!**

**Tips**:
- Pahami for dan while dengan baik
- Latihan membuat variasi perulangan
- Coba gabungkan dengan if-else
- Buat contoh program sendiri

### Timeline Penting:

- ✅ **Tugas 1**: Deadline AB 7 (semoga sudah selesai!)
- 🔜 **Tugas 2**: Akan diberikan di AB 8, deadline AB 11
- 📺 **TUWEB 3**: AB 10 (Inheritance)

**Jangan sampai ketinggalan ya!** ⏰

---

## 9. AJAKAN DISKUSI (3-5 pertanyaan sederhana)

**"Yuk Diskusi di Forum!"**

Silakan diskusikan pertanyaan-pertanyaan berikut di **Forum Diskusi AB 4**:

### 1. Share Program Perulangan Pertama! 🎉
**"Sudah berhasil membuat for loop? Share screenshot output program teman-teman!"**

Ceritakan:
- Perulangan untuk apa yang teman-teman buat?
- Berapa kali loop-nya?
- Ada kendala atau langsung jalan?

### 2. Kasus Infinite Loop 😅
**"Ada yang pernah ngalamin infinite loop? Ceritakan pengalamannya dan bagaimana solusinya!"**

Berbagi pengalaman:
- Program hang/tidak berhenti?
- Kesalahan apa yang bikin infinite loop?
- Bagaimana cara fix-nya?

### 3. Aplikasi Perulangan di Kehidupan Nyata 💡
**"Selain contoh di materi, menurut teman-teman perulangan bisa dipakai untuk apa lagi?"**

Berpikir kreatif:
- Menghitung total belanja?
- Mengecek stok barang?
- Validasi input data?
- Atau ide kreatif lainnya?

### 4. For vs While 🤔
**"Menurut pengalaman praktik hari ini, lebih suka pakai for atau while? Kenapa?"**

Diskusi preferensi:
- For lebih mudah atau while?
- Kapan situasi pakai for?
- Kapan situasi pakai while?

### 5. Challenge untuk yang Sudah Jago! 🏆
**"Buat program tabel perkalian 1-10 (semua angka). Bisa gak? Share hasilnya!"**

Untuk yang sudah paham:
- Coba buat 10 tabel perkalian sekaligus
- Hint: Pakai nested loop (loop dalam loop)
- Atau buat 10 kali for loop (cara simple)

---

**Partisipasi aktif = Nilai tambahan!** 📊

---

## 10. PENUTUP & MOTIVASI (3 menit)

**"Rangkuman & Semangat!"**

### 📌 Rangkuman Singkat:

Hari ini kita sudah belajar konsep **SUPER PENTING**: **PERULANGAN!** 🔁

✅ **Apa yang sudah kita pelajari:**
1. **For Loop** - perulangan dengan jumlah pasti
   - Syntax: `for(int i = 1; i <= 10; i++)`
2. **While Loop** - perulangan dengan kondisi
   - Syntax: `while(kondisi) { ... }`
3. **Menghitung Total** - akumulasi dengan loop
4. **Aplikasi Real** - tabel perkalian, rata-rata nilai

✅ **Apa yang sudah kita praktikkan:**
- Membuat perulangan maju (1, 2, 3, ...)
- Membuat perulangan mundur (10, 9, 8, ...)
- Menghitung total dengan perulangan
- Membuat tabel perkalian
- Memahami perbedaan for vs while

**Jangan lupa selesaikan latihan mandiri ya!** Semakin banyak praktik, semakin paham! 💪

---

### 🎯 Preview Minggu Depan:

**Di Aktivitas Belajar 7**, kita akan belajar:
- **Array** (kumpulan data)
- **String** (manipulasi text)

**Di Aktivitas Belajar 8** (ada Tugas 2!), kita akan belajar:
- **UML** (Unified Modeling Language)
- Cara merancang program dengan diagram

**Di TUWEB 3 (AB 10)**, kita akan belajar:
- **Inheritance** (pewarisan class)
- Konsep OOP yang lebih dalam

**Konsep perulangan hari ini akan dipakai terus!**  
Array + For Loop = Kombinasi powerful! 🔥

---

### 💪 Motivasi:

**"Kalian Makin Jago!"** 🌟

Dari TUWEB 1 sampai sekarang, teman-teman sudah bisa:
- ✅ Class dan Object
- ✅ Variable dan Tipe Data
- ✅ If-Else (keputusan)
- ✅ For dan While (perulangan)

**Ini sudah 4 fondasi penting programming!**

> "The only way to learn programming is by doing programming."  
> *— Dennis Ritchie (Creator of C Language)*

**Pesan Pak Anton**:

**1. Perulangan = Kekuatan!**  
Dengan perulangan, teman-teman bisa proses ratusan, ribuan, bahkan jutaan data! Ini yang membuat programming powerful!

**2. Error itu Guru Terbaik!**  
Setiap infinite loop, setiap error, mengajarkan sesuatu. Jangan frustasi, itu bagian dari proses belajar!

**3. Praktik, Praktik, Praktik!**  
Baca teori 1 jam < Praktik 15 menit. Hands-on is the key!

**4. Kombinasikan!**  
Coba gabungkan perulangan dengan if-else, dengan class, dengan method. Eksperimen!

**5. Enjoy the Process!**  
Programming itu fun! Nikmati setiap kode yang teman-teman tulis! 🎉

---

### 📢 Pengumuman Penting:

1. **Tugas 1** deadline di AB 7
   - Jangan lupa submit!
   - Format: Video rekaman praktik
   
2. **Tugas 2** akan diberikan di AB 8
   - Tentang UML dan perancangan
   - Mulai belajar dari sekarang!

3. **TUWEB 3** di AB 10
   - Topik: Inheritance (Pewarisan)
   - Siapkan materi AB 1-9 dengan baik

4. **Forum Diskusi AB 4** sudah dibuka
   - Diskusikan materi perulangan
   - Share pengalaman dan bertanya

---

### 🌟 Quotes Penutup:

> "Loops are not just for code; they're for life. Keep iterating until you succeed!"

> "A program is never complete; it just stops getting better... until the next loop."

> "In programming, as in life, repetition is the mother of skill."

---

### ✨ Pesan Terakhir:

Kalian baru saja menguasai salah satu konsep paling powerful dalam programming: **Perulangan!**

Bayangkan:
- Hari ini teman-teman bisa loop 10x
- Besok bisa 100x
- Lusa bisa 1000x
- Suatu hari nanti, program teman-teman mungkin process jutaan data!

**Semuanya dimulai dari for loop sederhana hari ini!**

**Tetap semangat!**  
**Keep coding!**  
**Jangan lupa istirahat dan sholat!** 🙏

**See you di TUWEB berikutnya!** 👋

---

**Wassalamu'alaikum warahmatullahi wabarakatuh.**

---

### Salam Penutup:

**"Sampai jumpa di materi selanjutnya! Tetap semangat belajar! 💻🚀"**

---

## LAMPIRAN

### A. Referensi Tambahan

**Link ke BMP**: Modul 2 - KB 3 (Struktur Perulangan)

**Referensi Online**:
1. Java Loops Tutorial: https://www.w3schools.com/java/java_while_loop.asp
2. Java For Loop: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html

### B. Kode Lengkap Semua Praktik

File lengkap bisa didownload di LMS atau copy dari materi ini.

### C. Checklist Keberhasilan

Pastikan teman-teman sudah bisa:
- [ ] Membuat for loop sederhana
- [ ] Membuat perulangan maju dan mundur
- [ ] Menghitung total dengan loop
- [ ] Membuat while loop
- [ ] Memahami perbedaan for vs while
- [ ] Membuat tabel perkalian
- [ ] Debug infinite loop
- [ ] Menggabungkan loop dengan if-else

Kalau ada yang belum bisa, **DISKUSI DI FORUM!** 💬

### D. Kontak

**Tutor**: Anton Prafanto, S.Kom., M.T.  
**Forum Diskusi**: Forum AB 4 di LMS UT  
**Mata Kuliah**: STSI4201 - Pemrograman Berbasis Desktop

---

**#LearningByDoing #ForLoop #WhileLoop #JavaProgramming #UniversitasTerbuka #STSI4201**

---

**END OF TUWEB 2**

Dibuat dengan ❤️ untuk mahasiswa Universitas Terbuka  
*Keep looping, keep learning!* 🔁🚀
