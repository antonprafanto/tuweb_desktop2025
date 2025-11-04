# Konsep Struktur Pengulangan (Looping)

## Tutorial Ke-2: Pemrograman Berbasis Desktop
**Mata Kuliah**: STSI4201 - Pemrograman Berbasis Desktop
**Program Studi**: Sistem Informasi
**Universitas Terbuka**

---

## 🎯 Capaian Pembelajaran

Setelah mempelajari materi ini, mahasiswa diharapkan mampu:
1. Memahami konsep dasar struktur pengulangan (looping)
2. Mengidentifikasi jenis-jenis struktur pengulangan dalam Java
3. Menerapkan struktur pengulangan `for`, `for-each`, `while`, dan `do-while`
4. Menentukan struktur pengulangan yang tepat sesuai kasus
5. Mengimplementasikan struktur pengulangan dalam program Java

---

## 📚 Pendahuluan

### Apa itu Struktur Pengulangan?

Pernahkah Anda menghadapi situasi di mana harus melakukan hal yang sama berulang kali? Misalnya:
- Menghitung jumlah mahasiswa dari 1 sampai 100
- Menampilkan daftar menu restoran
- Memproses nilai ujian 50 mahasiswa

Dalam pemrograman, kita tidak perlu menulis kode yang sama berulang kali. Java menyediakan **struktur pengulangan (loop)** untuk mengeksekusi blok kode secara berulang dengan kondisi tertentu.

### Mengapa Struktur Pengulangan Penting?

✅ **Efisiensi**: Mengurangi penulisan kode yang repetitif
✅ **Fleksibilitas**: Dapat memproses data dalam jumlah besar
✅ **Otomasi**: Menjalankan proses berulang secara otomatis
✅ **Skalabilitas**: Mudah disesuaikan dengan kebutuhan

### Ilustrasi Sederhana

**Tanpa Loop** (tidak efisien):
```java
System.out.println("Mahasiswa ke-1");
System.out.println("Mahasiswa ke-2");
System.out.println("Mahasiswa ke-3");
// ... sampai 100 kali!
```

**Dengan Loop** (efisien):
```java
for (int i = 1; i <= 100; i++) {
    System.out.println("Mahasiswa ke-" + i);
}
```

---

## 🔄 Jenis-Jenis Struktur Pengulangan di Java

Java memiliki **4 jenis struktur pengulangan utama**:

| No | Jenis Loop | Karakteristik | Kapan Digunakan |
|----|-----------|---------------|-----------------|
| 1 | **for** | Jumlah iterasi sudah diketahui | Ketika tahu berapa kali loop akan berjalan |
| 2 | **for-each** | Iterasi elemen array/collection | Untuk mengakses semua elemen array |
| 3 | **while** | Kondisi dicek di awal | Ketika loop bergantung pada kondisi |
| 4 | **do-while** | Kondisi dicek di akhir | Minimal harus dijalankan 1 kali |

Mari kita pelajari satu per satu dengan detail! 🚀

---

## 1️⃣ Struktur Pengulangan FOR

### Konsep Dasar

Loop `for` adalah struktur pengulangan yang paling umum digunakan ketika **jumlah iterasi sudah diketahui** sebelumnya.

### Sintaks

```java
for (inisialisasi; kondisi; iterasi) {
    // blok kode yang akan diulang
}
```

### Komponen Loop FOR

```
for (int i = 0; i < 10; i++) {
     ︳      ︳       ︳      ︳
     1      2       3      4
```

1. **Inisialisasi** (`int i = 0`): Mendeklarasikan dan menginisialisasi variabel counter (dijalankan 1 kali di awal)
2. **Kondisi** (`i < 10`): Syarat agar loop terus berjalan (dicek setiap iterasi)
3. **Iterasi** (`i++`): Perubahan nilai variabel counter setelah setiap iterasi
4. **Blok Kode**: Kode yang akan dieksekusi berulang

### Alur Eksekusi Loop FOR

```
    ┌─────────────────┐
    │  1. Inisialisasi │
    └────────┬─────────┘
             ↓
    ┌────────▼─────────┐
    │  2. Cek Kondisi   │
    └────┬─────────┬────┘
      FALSE      TRUE
         ↓         ↓
      KELUAR   ┌───▼────────┐
      LOOP     │ 3. Eksekusi│
               │    Blok    │
               └──────┬─────┘
                      ↓
               ┌──────▼─────┐
               │ 4. Iterasi │
               └──────┬─────┘
                      │
                      └─────┐
                            ↓
                    (Kembali ke langkah 2)
```

### Contoh 1: Loop Sederhana

```java
// Menampilkan angka 1 sampai 5
for (int i = 1; i <= 5; i++) {
    System.out.println("Angka ke-" + i);
}
```

**Output:**
```
Angka ke-1
Angka ke-2
Angka ke-3
Angka ke-4
Angka ke-5
```

**Penjelasan Eksekusi:**

| Iterasi | Nilai i | Kondisi (i <= 5) | Output | i++ |
|---------|---------|------------------|--------|-----|
| 1 | 1 | TRUE ✅ | Angka ke-1 | 2 |
| 2 | 2 | TRUE ✅ | Angka ke-2 | 3 |
| 3 | 3 | TRUE ✅ | Angka ke-3 | 4 |
| 4 | 4 | TRUE ✅ | Angka ke-4 | 5 |
| 5 | 5 | TRUE ✅ | Angka ke-5 | 6 |
| 6 | 6 | FALSE ❌ | - | STOP |

### Contoh 2: Loop dengan Perhitungan

```java
// Menghitung jumlah angka 1 sampai 10
int jumlah = 0;

for (int i = 1; i <= 10; i++) {
    jumlah = jumlah + i;  // atau: jumlah += i;
    System.out.println("i=" + i + ", Jumlah sementara=" + jumlah);
}

System.out.println("Total akhir: " + jumlah);
```

**Output:**
```
i=1, Jumlah sementara=1
i=2, Jumlah sementara=3
i=3, Jumlah sementara=6
i=4, Jumlah sementara=10
i=5, Jumlah sementara=15
i=6, Jumlah sementara=21
i=7, Jumlah sementara=28
i=8, Jumlah sementara=36
i=9, Jumlah sementara=45
i=10, Jumlah sementara=55
Total akhir: 55
```

### Variasi Loop FOR

#### a) Loop Mundur (Decrement)
```java
// Menghitung mundur dari 5 ke 1
for (int i = 5; i >= 1; i--) {
    System.out.println(i);
}
// Output: 5, 4, 3, 2, 1
```

#### b) Loop dengan Step Tertentu
```java
// Menampilkan angka genap dari 0 sampai 10
for (int i = 0; i <= 10; i += 2) {
    System.out.println(i);
}
// Output: 0, 2, 4, 6, 8, 10
```

#### c) Loop Bersarang (Nested Loop)
```java
// Membuat pola bintang
for (int i = 1; i <= 5; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
```

**Output:**
```
*
* *
* * *
* * * *
* * * * *
```

### 💡 Tips Penggunaan Loop FOR

✅ Gunakan variabel `i`, `j`, `k` untuk counter sederhana
✅ Gunakan nama yang deskriptif untuk loop kompleks (`indexMahasiswa`, `nomorBaris`)
✅ Pastikan kondisi terminasi akan tercapai (hindari infinite loop)
✅ Perhatikan operator increment/decrement (`i++`, `i--`, `i+=2`)

---

## 2️⃣ Struktur Pengulangan FOR-EACH

### Konsep Dasar

Loop `for-each` (juga disebut **enhanced for loop**) adalah cara yang lebih sederhana untuk **iterasi melalui elemen-elemen array atau collection**.

### Sintaks

```java
for (TipeData namaVariabel : namaArray) {
    // blok kode untuk setiap elemen
}
```

### Perbandingan FOR vs FOR-EACH

**Loop FOR Tradisional:**
```java
int[] nilaiMahasiswa = {85, 90, 78, 92, 88};

for (int i = 0; i < nilaiMahasiswa.length; i++) {
    System.out.println("Nilai: " + nilaiMahasiswa[i]);
}
```

**Loop FOR-EACH (Lebih Sederhana):**
```java
int[] nilaiMahasiswa = {85, 90, 78, 92, 88};

for (int nilai : nilaiMahasiswa) {
    System.out.println("Nilai: " + nilai);
}
```

### Keuntungan FOR-EACH

✅ **Sintaks lebih sederhana** - tidak perlu menggunakan index
✅ **Lebih aman** - tidak ada risiko ArrayIndexOutOfBoundsException
✅ **Lebih mudah dibaca** - fokus pada elemen, bukan index
✅ **Otomatis** - tidak perlu khawatir tentang panjang array

### Keterbatasan FOR-EACH

❌ **Tidak dapat memodifikasi elemen array** (hanya read-only)
❌ **Tidak dapat mengakses index** saat iterasi
❌ **Hanya iterasi maju** (tidak bisa mundur)
❌ **Tidak bisa skip elemen** dengan mudah

### Contoh 1: Iterasi Array String

```java
String[] namaMataKuliah = {
    "Pemrograman Berbasis Desktop",
    "Basis Data",
    "Sistem Informasi Manajemen",
    "Jaringan Komputer"
};

System.out.println("Daftar Mata Kuliah:");
for (String mataKuliah : namaMataKuliah) {
    System.out.println("- " + mataKuliah);
}
```

**Output:**
```
Daftar Mata Kuliah:
- Pemrograman Berbasis Desktop
- Basis Data
- Sistem Informasi Manajemen
- Jaringan Komputer
```

### Contoh 2: Menghitung Rata-rata dengan FOR-EACH

```java
double[] nilaiUjian = {85.5, 90.0, 78.5, 92.0, 88.5};

double total = 0;
int jumlahMahasiswa = 0;

for (double nilai : nilaiUjian) {
    total += nilai;
    jumlahMahasiswa++;
}

double rataRata = total / jumlahMahasiswa;

System.out.println("Total Nilai: " + total);
System.out.println("Jumlah Mahasiswa: " + jumlahMahasiswa);
System.out.println("Rata-rata: " + rataRata);
```

**Output:**
```
Total Nilai: 434.5
Jumlah Mahasiswa: 5
Rata-rata: 86.9
```

### Kapan Menggunakan FOR vs FOR-EACH?

| Situasi | Gunakan |
|---------|---------|
| Perlu akses index | **FOR** |
| Perlu modifikasi elemen array | **FOR** |
| Hanya membaca elemen | **FOR-EACH** ✨ |
| Iterasi sederhana | **FOR-EACH** ✨ |
| Loop dengan kondisi kompleks | **FOR** |

---

## 3️⃣ Struktur Pengulangan WHILE

### Konsep Dasar

Loop `while` mengulang blok kode **selama kondisi bernilai TRUE**. Kondisi dicek **sebelum** eksekusi blok kode.

### Sintaks

```java
while (kondisi) {
    // blok kode yang akan diulang
    // jangan lupa update variabel kondisi!
}
```

### Alur Eksekusi Loop WHILE

```
    ┌──────────────────┐
    │  Cek Kondisi     │
    └────┬────────┬────┘
      FALSE    TRUE
         ↓       ↓
      KELUAR  ┌──▼─────────┐
      LOOP    │  Eksekusi  │
              │  Blok Kode │
              └──────┬─────┘
                     │
                     └────┐
                          ↓
                  (Kembali ke Cek Kondisi)
```

### Perbedaan FOR vs WHILE

**Loop FOR:**
- Jumlah iterasi **sudah diketahui**
- Cocok untuk iterasi dengan counter

**Loop WHILE:**
- Jumlah iterasi **belum tentu diketahui**
- Bergantung pada **kondisi dinamis**
- Cocok untuk validasi input, menu berulang, dll

### Contoh 1: Countdown Sederhana

```java
int hitungan = 5;

System.out.println("Mulai countdown:");
while (hitungan > 0) {
    System.out.println(hitungan);
    hitungan--;  // PENTING! Jangan lupa update variabel
}
System.out.println("Selesai!");
```

**Output:**
```
Mulai countdown:
5
4
3
2
1
Selesai!
```

### Contoh 2: Validasi Input dengan Scanner

```java
import java.util.Scanner;

Scanner input = new Scanner(System.in);
String jawaban = "";

// Loop akan terus berjalan sampai user input "ya"
while (!jawaban.equalsIgnoreCase("ya")) {
    System.out.print("Apakah Anda sudah paham? (ya/tidak): ");
    jawaban = input.nextLine();

    if (!jawaban.equalsIgnoreCase("ya")) {
        System.out.println("Mari kita pelajari lagi!\n");
    }
}

System.out.println("Bagus! Kita lanjut ke materi berikutnya.");
```

**Contoh Interaksi:**
```
Apakah Anda sudah paham? (ya/tidak): tidak
Mari kita pelajari lagi!

Apakah Anda sudah paham? (ya/tidak): belum
Mari kita pelajari lagi!

Apakah Anda sudah paham? (ya/tidak): ya
Bagus! Kita lanjut ke materi berikutnya.
```

### Contoh 3: Menghitung Digit Angka

```java
int angka = 12345;
int jumlahDigit = 0;

while (angka > 0) {
    angka = angka / 10;  // Hilangkan digit terakhir
    jumlahDigit++;
}

System.out.println("Jumlah digit: " + jumlahDigit);
// Output: Jumlah digit: 5
```

### ⚠️ Peringatan: Infinite Loop

**BAHAYA! Loop ini tidak akan berhenti:**
```java
int i = 1;
while (i <= 10) {
    System.out.println(i);
    // LUPA UPDATE i++  ← BAHAYA!
}
// Program akan hang/freeze!
```

**BENAR:**
```java
int i = 1;
while (i <= 10) {
    System.out.println(i);
    i++;  // ✅ Jangan lupa update!
}
```

### 💡 Tips Penggunaan WHILE

✅ Pastikan kondisi akan menjadi FALSE di suatu titik
✅ Selalu update variabel yang mempengaruhi kondisi
✅ Gunakan untuk situasi dengan kondisi yang tidak pasti
✅ Cocok untuk validasi input user

---

## 4️⃣ Struktur Pengulangan DO-WHILE

### Konsep Dasar

Loop `do-while` mirip dengan `while`, tetapi **kondisi dicek di akhir**. Artinya, blok kode **dijamin dieksekusi minimal 1 kali**.

### Sintaks

```java
do {
    // blok kode yang akan diulang
    // PASTI dijalankan minimal 1 kali
} while (kondisi);
```

### Perbedaan WHILE vs DO-WHILE

**WHILE:**
```java
int angka = 10;

while (angka < 5) {
    System.out.println("Ini tidak akan muncul");
    angka++;
}
// Output: (tidak ada output)
```

**DO-WHILE:**
```java
int angka = 10;

do {
    System.out.println("Ini akan muncul 1 kali");
    angka++;
} while (angka < 5);
// Output: Ini akan muncul 1 kali
```

### Alur Eksekusi DO-WHILE

```
    ┌──────────────┐
    │  Eksekusi    │
    │  Blok Kode   │
    └──────┬───────┘
           ↓
    ┌──────▼──────┐
    │ Cek Kondisi │
    └──┬──────┬───┘
    FALSE   TRUE
      ↓       ↓
   KELUAR    └────┐
    LOOP          ↓
          (Kembali ke Blok Kode)
```

### Kapan Menggunakan DO-WHILE?

✅ **Menu interaktif** yang harus tampil minimal 1 kali
✅ **Validasi input** yang membutuhkan input pertama
✅ **Permainan** yang harus dimainkan minimal 1 ronde
✅ Situasi yang **wajib dieksekusi** setidaknya sekali

### Contoh 1: Menu Aplikasi

```java
import java.util.Scanner;

Scanner input = new Scanner(System.in);
int pilihan;

do {
    // Menu akan tampil minimal 1 kali
    System.out.println("\n===== MENU APLIKASI =====");
    System.out.println("1. Lihat Data");
    System.out.println("2. Tambah Data");
    System.out.println("3. Hapus Data");
    System.out.println("0. Keluar");
    System.out.print("Pilihan Anda: ");
    pilihan = input.nextInt();

    switch (pilihan) {
        case 1:
            System.out.println("Menampilkan data...");
            break;
        case 2:
            System.out.println("Menambah data...");
            break;
        case 3:
            System.out.println("Menghapus data...");
            break;
        case 0:
            System.out.println("Terima kasih!");
            break;
        default:
            System.out.println("Pilihan tidak valid!");
    }

} while (pilihan != 0);
```

### Contoh 2: Validasi Input Password

```java
import java.util.Scanner;

Scanner input = new Scanner(System.in);
String password;
String passwordBenar = "java123";
boolean loginBerhasil = false;

do {
    System.out.print("Masukkan password: ");
    password = input.nextLine();

    if (password.equals(passwordBenar)) {
        System.out.println("Login berhasil! ✅");
        loginBerhasil = true;
    } else {
        System.out.println("Password salah! Coba lagi. ❌\n");
    }

} while (!loginBerhasil);

System.out.println("Selamat datang di sistem!");
```

**Contoh Interaksi:**
```
Masukkan password: abc
Password salah! Coba lagi. ❌

Masukkan password: 123
Password salah! Coba lagi. ❌

Masukkan password: java123
Login berhasil! ✅
Selamat datang di sistem!
```

### Contoh 3: Permainan Tebak Angka

```java
import java.util.Scanner;
import java.util.Random;

Scanner input = new Scanner(System.in);
Random random = new Random();

int angkaRahasia = random.nextInt(10) + 1;  // 1-10
int tebakan;
int percobaan = 0;

System.out.println("=== TEBAK ANGKA (1-10) ===");

do {
    System.out.print("Tebakan Anda: ");
    tebakan = input.nextInt();
    percobaan++;

    if (tebakan < angkaRahasia) {
        System.out.println("Terlalu kecil! Coba lagi.");
    } else if (tebakan > angkaRahasia) {
        System.out.println("Terlalu besar! Coba lagi.");
    } else {
        System.out.println("BENAR! 🎉");
        System.out.println("Anda berhasil dalam " + percobaan + " percobaan!");
    }

} while (tebakan != angkaRahasia);
```

---

## 🔄 Kontrol Alur Loop: BREAK dan CONTINUE

### BREAK Statement

`break` digunakan untuk **menghentikan loop secara paksa**.

```java
// Mencari angka pertama yang habis dibagi 7
for (int i = 1; i <= 100; i++) {
    if (i % 7 == 0) {
        System.out.println("Angka pertama: " + i);
        break;  // Keluar dari loop
    }
}
// Output: Angka pertama: 7
```

### CONTINUE Statement

`continue` digunakan untuk **melewati iterasi saat ini** dan lanjut ke iterasi berikutnya.

```java
// Menampilkan angka ganjil dari 1-10
for (int i = 1; i <= 10; i++) {
    if (i % 2 == 0) {
        continue;  // Skip angka genap
    }
    System.out.println(i);
}
// Output: 1, 3, 5, 7, 9
```

### Ilustrasi BREAK vs CONTINUE

```
Loop Tanpa Break/Continue:
[1] → [2] → [3] → [4] → [5] → [6] → [7] → [8]

Loop dengan BREAK di iterasi 5:
[1] → [2] → [3] → [4] → [5] STOP ❌

Loop dengan CONTINUE di iterasi genap:
[1] → [2]⤵ → [3] → [4]⤵ → [5] → [6]⤵ → [7] → [8]⤵
       skip        skip        skip        skip
```

---

## 📊 Perbandingan Semua Jenis Loop

| Aspek | FOR | FOR-EACH | WHILE | DO-WHILE |
|-------|-----|----------|-------|----------|
| **Jumlah Iterasi** | Diketahui | Diketahui (panjang array) | Tidak tentu | Tidak tentu |
| **Kondisi Dicek** | Di awal | Otomatis | Di awal | Di akhir |
| **Min. Eksekusi** | 0 kali | 0 kali | 0 kali | **1 kali** |
| **Akses Index** | ✅ Ya | ❌ Tidak | ✅ Ya | ✅ Ya |
| **Kompleksitas** | Sedang | **Rendah** | Sedang | Sedang |
| **Use Case** | Counter, range | **Iterasi array** | Kondisi dinamis | **Menu, validasi** |

---

## 🎓 Panduan Memilih Loop yang Tepat

### Flowchart Pemilihan Loop

```
        Mulai
           ↓
    ┌──────▼──────┐
    │ Apakah iterasi│
    │ melalui array?│
    └──┬────────┬──┘
      YA       TIDAK
       ↓         ↓
  ┌───▼───┐  ┌──▼──────┐
  │FOR-   │  │ Apakah    │
  │EACH   │  │ jumlah     │
  └───────┘  │ iterasi    │
             │ diketahui? │
             └──┬────┬───┘
              YA   TIDAK
               ↓     ↓
          ┌────▼──┐ ┌──▼────────┐
          │ FOR   │ │ Apakah     │
          └───────┘ │ harus      │
                    │ dieksekusi │
                    │ min. 1x?   │
                    └──┬────┬───┘
                     YA   TIDAK
                      ↓     ↓
                  ┌───▼──┐ ┌──▼───┐
                  │DO-   │ │WHILE │
                  │WHILE │ └──────┘
                  └──────┘
```

### Contoh Kasus Nyata

1. **Menampilkan daftar produk**: `for-each` ✨
2. **Menghitung 1-100**: `for` ✨
3. **Menu aplikasi**: `do-while` ✨
4. **Validasi input**: `while` atau `do-while` ✨
5. **Mencari nilai dalam array**: `for` atau `for-each` ✨
6. **Loop sampai kondisi terpenuhi**: `while` ✨

---

## 💻 Latihan Praktik

Sebelum melanjutkan ke latihan lengkap, coba pahami contoh-contoh berikut:

### Latihan 1: Tabel Perkalian
```java
int angka = 5;

System.out.println("Tabel Perkalian " + angka);
for (int i = 1; i <= 10; i++) {
    System.out.println(angka + " x " + i + " = " + (angka * i));
}
```

### Latihan 2: Menghitung Faktorial
```java
int n = 5;
int faktorial = 1;

for (int i = 1; i <= n; i++) {
    faktorial *= i;
}

System.out.println(n + "! = " + faktorial);
// Output: 5! = 120
```

### Latihan 3: Mencari Nilai Maksimum
```java
int[] nilaiUjian = {85, 92, 78, 95, 88};
int nilaiTertinggi = nilaiUjian[0];

for (int nilai : nilaiUjian) {
    if (nilai > nilaiTertinggi) {
        nilaiTertinggi = nilai;
    }
}

System.out.println("Nilai tertinggi: " + nilaiTertinggi);
// Output: Nilai tertinggi: 95
```

---

## 📝 Ringkasan

### Poin-Poin Penting

1. **Struktur pengulangan** menghemat penulisan kode yang repetitif
2. **FOR** → gunakan ketika jumlah iterasi diketahui
3. **FOR-EACH** → cara termudah untuk iterasi array
4. **WHILE** → gunakan ketika kondisi dinamis (dicek di awal)
5. **DO-WHILE** → dijamin dieksekusi minimal 1 kali (dicek di akhir)
6. **BREAK** → keluar dari loop
7. **CONTINUE** → skip iterasi saat ini
8. Pastikan kondisi loop akan FALSE untuk menghindari infinite loop

### Formula Sukses Menggunakan Loop

✅ Pahami kapan menggunakan setiap jenis loop
✅ Pastikan ada kondisi terminasi yang jelas
✅ Gunakan nama variabel yang deskriptif
✅ Test dengan data sederhana terlebih dahulu
✅ Tambahkan komentar untuk loop yang kompleks

---

## 🚀 Langkah Selanjutnya

Setelah memahami konsep dasar struktur pengulangan, mari kita lanjut ke:

1. **Latihan Dasar** → Praktik sederhana untuk setiap jenis loop
2. **Latihan Menengah** → Kombinasi loop dengan array dan decision
3. **Latihan Lengkap** → Implementasi dalam aplikasi nyata
4. **Aplikasi Utama** → Sistem Kalkulator Statistik Sederhana

---

## 📚 Referensi Tambahan

Untuk memperdalam pemahaman, silakan pelajari:
- Modul 5 UT: Struktur Pengulangan
- Oracle Java Documentation: Control Flow Statements
- Video tutorial di channel YouTube resmi UT

---

**Selamat Belajar! 🎉**

Ingat: *"Practice makes perfect"* - Semakin banyak latihan, semakin mahir Anda dalam menggunakan struktur pengulangan!

---

© 2025 Anton Prafanto, S.Kom, M.T. | Universitas Terbuka
