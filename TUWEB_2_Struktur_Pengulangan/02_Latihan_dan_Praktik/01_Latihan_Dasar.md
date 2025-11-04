# Latihan Dasar: Struktur Pengulangan

## Tutorial Ke-2: Pemrograman Berbasis Desktop
**Learning by Doing** - Praktik Langsung!

---

## 🎯 Tujuan Latihan

Setelah menyelesaikan latihan ini, mahasiswa diharapkan dapat:
1. Mengimplementasikan loop `for` untuk kasus sederhana
2. Menggunakan loop `for-each` untuk iterasi array
3. Menerapkan loop `while` untuk kondisi dinamis
4. Menggunakan loop `do-while` untuk menu sederhana
5. Memahami kapan menggunakan setiap jenis loop

---

## 📋 Petunjuk Pengerjaan

1. Buka **NetBeans IDE**
2. Buat **Java Project** baru dengan nama `LatihanLoop`
3. Untuk setiap latihan, buat **class Java** baru
4. Ketik kode dengan **mengetik sendiri** (jangan copy-paste) agar lebih paham
5. **Jalankan** program dan amati hasilnya
6. **Modifikasi** kode untuk eksplorasi lebih lanjut

---

## 🔰 LEVEL 1: Latihan Loop FOR

### Latihan 1.1: Menampilkan Angka 1-10

**Tujuan**: Memahami dasar loop `for` dengan counter sederhana.

```java
/**
 * Latihan1_LoopForSederhana.java
 * Menampilkan angka dari 1 sampai 10
 */
public class Latihan1_LoopForSederhana {
    public static void main(String[] args) {
        System.out.println("=== MENAMPILKAN ANGKA 1-10 ===");

        // Loop dari 1 sampai 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("Angka: " + i);
        }

        System.out.println("Selesai!");
    }
}
```

**Output yang Diharapkan:**
```
=== MENAMPILKAN ANGKA 1-10 ===
Angka: 1
Angka: 2
Angka: 3
Angka: 4
Angka: 5
Angka: 6
Angka: 7
Angka: 8
Angka: 9
Angka: 10
Selesai!
```

**Penjelasan Kode:**
- **Baris 7**: Deklarasi loop for dengan `i` dimulai dari 1
- **Kondisi**: `i <= 10` berarti loop berjalan selama i kurang dari atau sama dengan 10
- **Increment**: `i++` menambah nilai i sebesar 1 setiap iterasi
- **Baris 8**: Menampilkan nilai i pada setiap iterasi

**✏️ Tugas Modifikasi:**
1. Ubah loop untuk menampilkan angka 1-20
2. Ubah loop untuk menampilkan angka 5-15
3. Ubah loop untuk menampilkan angka mundur dari 10 ke 1

---

### Latihan 1.2: Menampilkan Angka Genap

**Tujuan**: Menggunakan loop dengan increment yang berbeda.

```java
/**
 * Latihan2_AngkaGenap.java
 * Menampilkan angka genap dari 0 sampai 20
 */
public class Latihan2_AngkaGenap {
    public static void main(String[] args) {
        System.out.println("=== ANGKA GENAP 0-20 ===");

        // Loop dengan increment 2
        for (int i = 0; i <= 20; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nSelesai!");
    }
}
```

**Output yang Diharapkan:**
```
=== ANGKA GENAP 0-20 ===
0 2 4 6 8 10 12 14 16 18 20

Selesai!
```

**Penjelasan Kode:**
- **i += 2**: Increment sebesar 2 (i = i + 2)
- **print()** vs **println()**:
  - `print()` tidak pindah baris
  - `println()` pindah ke baris baru
- **\\n**: Karakter untuk pindah baris

**✏️ Tugas Modifikasi:**
1. Tampilkan angka ganjil dari 1-19
2. Tampilkan angka kelipatan 5 dari 0-50
3. Tampilkan angka kelipatan 3 dari 3-30

---

### Latihan 1.3: Tabel Perkalian

**Tujuan**: Menggunakan loop untuk perhitungan matematika.

```java
import java.util.Scanner;

/**
 * Latihan3_TabelPerkalian.java
 * Membuat tabel perkalian untuk angka yang diinput user
 */
public class Latihan3_TabelPerkalian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== TABEL PERKALIAN ===");
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        System.out.println("\nTabel Perkalian " + angka + ":");
        System.out.println("------------------------");

        for (int i = 1; i <= 10; i++) {
            int hasil = angka * i;
            System.out.println(angka + " x " + i + " = " + hasil);
        }
    }
}
```

**Contoh Interaksi:**
```
=== TABEL PERKALIAN ===
Masukkan angka: 7

Tabel Perkalian 7:
------------------------
7 x 1 = 7
7 x 2 = 14
7 x 3 = 21
7 x 4 = 28
7 x 5 = 35
7 x 6 = 42
7 x 7 = 49
7 x 8 = 56
7 x 9 = 63
7 x 10 = 70
```

**Penjelasan Kode:**
- **Scanner**: Untuk menerima input dari user
- **angka * i**: Perhitungan perkalian pada setiap iterasi
- **hasil**: Variabel untuk menyimpan hasil perkalian

**✏️ Tugas Modifikasi:**
1. Buat tabel perkalian sampai 15 (bukan hanya 10)
2. Tampilkan dalam format tabel yang lebih rapi
3. Buat program yang menampilkan tabel pembagian

---

### Latihan 1.4: Menghitung Jumlah

**Tujuan**: Akumulasi nilai menggunakan loop.

```java
/**
 * Latihan4_MenghitungJumlah.java
 * Menghitung jumlah angka dari 1 sampai N
 */
public class Latihan4_MenghitungJumlah {
    public static void main(String[] args) {
        int n = 100;  // Hitung dari 1 sampai 100
        int jumlah = 0;

        System.out.println("=== MENGHITUNG JUMLAH 1 + 2 + ... + " + n + " ===");

        for (int i = 1; i <= n; i++) {
            jumlah = jumlah + i;  // atau: jumlah += i;
        }

        System.out.println("Hasil: " + jumlah);

        // Verifikasi dengan rumus matematika: n(n+1)/2
        int rumusMatematika = n * (n + 1) / 2;
        System.out.println("Verifikasi (rumus): " + rumusMatematika);
    }
}
```

**Output yang Diharapkan:**
```
=== MENGHITUNG JUMLAH 1 + 2 + ... + 100 ===
Hasil: 5050
Verifikasi (rumus): 5050
```

**Penjelasan Kode:**
- **jumlah += i**: Akumulasi (penambahan bertahap)
- Dimulai dari `jumlah = 0`
- Setiap iterasi: jumlah = jumlah + i
- **Rumus matematika**: n(n+1)/2 untuk verifikasi

**Cara Kerja Akumulasi:**
```
Iterasi 1: jumlah = 0 + 1 = 1
Iterasi 2: jumlah = 1 + 2 = 3
Iterasi 3: jumlah = 3 + 3 = 6
Iterasi 4: jumlah = 6 + 4 = 10
... dan seterusnya
```

**✏️ Tugas Modifikasi:**
1. Hitung jumlah angka genap dari 2-100
2. Hitung jumlah angka ganjil dari 1-99
3. Hitung jumlah angka kelipatan 5 dari 5-100

---

## 🔰 LEVEL 2: Latihan Loop FOR-EACH

### Latihan 2.1: Iterasi Array Sederhana

**Tujuan**: Memahami sintaks dasar for-each.

```java
/**
 * Latihan5_ForEachSederhana.java
 * Menggunakan for-each untuk iterasi array
 */
public class Latihan5_ForEachSederhana {
    public static void main(String[] args) {
        // Deklarasi dan inisialisasi array
        int[] nilaiMahasiswa = {85, 90, 78, 92, 88};

        System.out.println("=== DAFTAR NILAI MAHASISWA ===");

        int nomor = 1;
        for (int nilai : nilaiMahasiswa) {
            System.out.println("Mahasiswa " + nomor + ": " + nilai);
            nomor++;
        }
    }
}
```

**Output yang Diharapkan:**
```
=== DAFTAR NILAI MAHASISWA ===
Mahasiswa 1: 85
Mahasiswa 2: 90
Mahasiswa 3: 78
Mahasiswa 4: 92
Mahasiswa 5: 88
```

**Penjelasan Kode:**
- **for (int nilai : nilaiMahasiswa)**: Sintaks for-each
  - `int nilai`: Variabel untuk setiap elemen
  - `nilaiMahasiswa`: Array yang diiterasi
- Otomatis mengambil setiap elemen dari array
- Tidak perlu index manual

**✏️ Tugas Modifikasi:**
1. Tambahkan lebih banyak nilai ke dalam array
2. Ganti dengan array tipe String (nama mahasiswa)
3. Tampilkan dengan format yang berbeda

---

### Latihan 2.2: Menghitung Rata-Rata

**Tujuan**: Menggunakan for-each untuk perhitungan statistik.

```java
/**
 * Latihan6_HitungRataRata.java
 * Menghitung rata-rata nilai menggunakan for-each
 */
public class Latihan6_HitungRataRata {
    public static void main(String[] args) {
        double[] nilaiUjian = {85.5, 90.0, 78.5, 92.0, 88.5, 76.0, 95.5};

        System.out.println("=== PERHITUNGAN RATA-RATA NILAI ===");

        double totalNilai = 0;
        int jumlahMahasiswa = 0;

        // Tampilkan setiap nilai
        System.out.println("\nDaftar Nilai:");
        for (double nilai : nilaiUjian) {
            jumlahMahasiswa++;
            System.out.println(jumlahMahasiswa + ". " + nilai);
            totalNilai += nilai;
        }

        // Hitung rata-rata
        double rataRata = totalNilai / jumlahMahasiswa;

        // Tampilkan hasil
        System.out.println("\n--- HASIL PERHITUNGAN ---");
        System.out.println("Jumlah Mahasiswa: " + jumlahMahasiswa);
        System.out.println("Total Nilai: " + totalNilai);
        System.out.printf("Rata-rata: %.2f\n", rataRata);
    }
}
```

**Output yang Diharapkan:**
```
=== PERHITUNGAN RATA-RATA NILAI ===

Daftar Nilai:
1. 85.5
2. 90.0
3. 78.5
4. 92.0
5. 88.5
6. 76.0
7. 95.5

--- HASIL PERHITUNGAN ---
Jumlah Mahasiswa: 7
Total Nilai: 606.0
Rata-rata: 86.57
```

**Penjelasan Kode:**
- **totalNilai += nilai**: Akumulasi total nilai
- **jumlahMahasiswa++**: Hitung jumlah elemen
- **printf("%.2f")**: Format output 2 desimal
- For-each cocok untuk membaca semua elemen

**✏️ Tugas Modifikasi:**
1. Tambahkan perhitungan nilai tertinggi
2. Tambahkan perhitungan nilai terendah
3. Hitung berapa mahasiswa yang lulus (>= 75)

---

### Latihan 2.3: Mencari Nilai Maksimum dan Minimum

**Tujuan**: Menggunakan for-each untuk mencari nilai ekstrem.

```java
/**
 * Latihan7_CariNilaiEkstrem.java
 * Mencari nilai tertinggi dan terendah dari array
 */
public class Latihan7_CariNilaiEkstrem {
    public static void main(String[] args) {
        int[] nilaiUjian = {85, 92, 78, 95, 88, 76, 90, 82, 94, 87};

        System.out.println("=== PENCARIAN NILAI EKSTREM ===");

        // Inisialisasi dengan elemen pertama
        int nilaiTertinggi = nilaiUjian[0];
        int nilaiTerendah = nilaiUjian[0];

        System.out.println("\nDaftar Nilai:");
        for (int nilai : nilaiUjian) {
            System.out.print(nilai + " ");

            // Cek nilai tertinggi
            if (nilai > nilaiTertinggi) {
                nilaiTertinggi = nilai;
            }

            // Cek nilai terendah
            if (nilai < nilaiTerendah) {
                nilaiTerendah = nilai;
            }
        }

        System.out.println("\n\n--- HASIL ANALISIS ---");
        System.out.println("Nilai Tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai Terendah: " + nilaiTerendah);
        System.out.println("Selisih: " + (nilaiTertinggi - nilaiTerendah));
    }
}
```

**Output yang Diharapkan:**
```
=== PENCARIAN NILAI EKSTREM ===

Daftar Nilai:
85 92 78 95 88 76 90 82 94 87

--- HASIL ANALISIS ---
Nilai Tertinggi: 95
Nilai Terendah: 76
Selisih: 19
```

**Penjelasan Kode:**
- **Inisialisasi**: Gunakan elemen pertama array
- **if (nilai > nilaiTertinggi)**: Update jika ditemukan lebih besar
- **if (nilai < nilaiTerendah)**: Update jika ditemukan lebih kecil
- For-each membandingkan setiap elemen

**✏️ Tugas Modifikasi:**
1. Hitung berapa kali nilai tertinggi muncul
2. Hitung berapa kali nilai terendah muncul
3. Cari nilai tengah (median) - tantangan!

---

## 🔰 LEVEL 3: Latihan Loop WHILE

### Latihan 3.1: Countdown Sederhana

**Tujuan**: Memahami loop while dengan kondisi sederhana.

```java
/**
 * Latihan8_Countdown.java
 * Membuat countdown menggunakan while
 */
public class Latihan8_Countdown {
    public static void main(String[] args) {
        int hitungan = 10;

        System.out.println("=== COUNTDOWN DIMULAI ===\n");

        while (hitungan > 0) {
            System.out.println(hitungan + "...");
            hitungan--;  // PENTING! Jangan lupa decrement

            // Simulasi delay (opsional)
            try {
                Thread.sleep(500);  // 500ms = 0.5 detik
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\n🚀 SELESAI!");
    }
}
```

**Output yang Diharapkan:**
```
=== COUNTDOWN DIMULAI ===

10...
9...
8...
7...
6...
5...
4...
3...
2...
1...

🚀 SELESAI!
```

**Penjelasan Kode:**
- **while (hitungan > 0)**: Loop selama hitungan lebih dari 0
- **hitungan--**: Decrement (kurangi 1)
- **Thread.sleep(500)**: Delay 500 milidetik (opsional)
- Loop berhenti ketika hitungan = 0

**✏️ Tugas Modifikasi:**
1. Ubah countdown mulai dari 20
2. Buat countdown dengan step 2 (20, 18, 16, ...)
3. Tambahkan pesan khusus di angka 5, 4, 3, 2, 1

---

### Latihan 3.2: Validasi Input Angka

**Tujuan**: Menggunakan while untuk validasi input.

```java
import java.util.Scanner;

/**
 * Latihan9_ValidasiInput.java
 * Validasi input menggunakan while loop
 */
public class Latihan9_ValidasiInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== VALIDASI INPUT ANGKA ===");
        System.out.println("Masukkan angka antara 1-10\n");

        int angka = 0;
        boolean inputValid = false;

        while (!inputValid) {
            System.out.print("Input angka: ");
            angka = input.nextInt();

            if (angka >= 1 && angka <= 10) {
                inputValid = true;
                System.out.println("✅ Input valid!");
            } else {
                System.out.println("❌ Input tidak valid! Harus antara 1-10.\n");
            }
        }

        System.out.println("\nAnda memasukkan: " + angka);
        System.out.println("Terima kasih!");
    }
}
```

**Contoh Interaksi:**
```
=== VALIDASI INPUT ANGKA ===
Masukkan angka antara 1-10

Input angka: 15
❌ Input tidak valid! Harus antara 1-10.

Input angka: 0
❌ Input tidak valid! Harus antara 1-10.

Input angka: 7
✅ Input valid!

Anda memasukkan: 7
Terima kasih!
```

**Penjelasan Kode:**
- **while (!inputValid)**: Loop selama input belum valid
- **if (angka >= 1 && angka <= 10)**: Validasi range
- **inputValid = true**: Flag untuk menghentikan loop
- Loop otomatis berhenti setelah input valid

**✏️ Tugas Modifikasi:**
1. Ubah range validasi (misalnya 10-50)
2. Hitung berapa kali user salah input
3. Beri batas maksimal percobaan (misalnya 3 kali)

---

### Latihan 3.3: Menghitung Faktorial

**Tujuan**: Menggunakan while untuk perhitungan matematis.

```java
import java.util.Scanner;

/**
 * Latihan10_HitungFaktorial.java
 * Menghitung faktorial menggunakan while loop
 */
public class Latihan10_HitungFaktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== KALKULATOR FAKTORIAL ===");
        System.out.print("Masukkan bilangan: ");
        int n = input.nextInt();

        int faktorial = 1;
        int i = 1;

        System.out.print("\n" + n + "! = ");

        while (i <= n) {
            faktorial *= i;  // faktorial = faktorial * i

            System.out.print(i);
            if (i < n) {
                System.out.print(" x ");
            }

            i++;
        }

        System.out.println(" = " + faktorial);
    }
}
```

**Contoh Interaksi:**
```
=== KALKULATOR FAKTORIAL ===
Masukkan bilangan: 5

5! = 1 x 2 x 3 x 4 x 5 = 120
```

**Penjelasan Kode:**
- **faktorial *= i**: Perkalian bertahap
- **i++**: Increment counter
- Loop berjalan dari 1 sampai n
- Menampilkan proses perhitungan

**Cara Kerja:**
```
n = 5
i=1: faktorial = 1 * 1 = 1
i=2: faktorial = 1 * 2 = 2
i=3: faktorial = 2 * 3 = 6
i=4: faktorial = 6 * 4 = 24
i=5: faktorial = 24 * 5 = 120
```

**✏️ Tugas Modifikasi:**
1. Tampilkan hasil setiap tahap perhitungan
2. Validasi input (harus positif)
3. Buat versi menggunakan loop for

---

## 🔰 LEVEL 4: Latihan Loop DO-WHILE

### Latihan 4.1: Menu Sederhana

**Tujuan**: Memahami do-while untuk menu interaktif.

```java
import java.util.Scanner;

/**
 * Latihan11_MenuSederhana.java
 * Membuat menu aplikasi menggunakan do-while
 */
public class Latihan11_MenuSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            // Tampilkan menu
            System.out.println("\n=============================");
            System.out.println("    MENU APLIKASI SISWA");
            System.out.println("=============================");
            System.out.println("1. Lihat Data Siswa");
            System.out.println("2. Tambah Data Siswa");
            System.out.println("3. Edit Data Siswa");
            System.out.println("4. Hapus Data Siswa");
            System.out.println("0. Keluar");
            System.out.println("=============================");
            System.out.print("Pilihan Anda: ");
            pilihan = input.nextInt();

            // Proses pilihan
            System.out.println();
            switch (pilihan) {
                case 1:
                    System.out.println("📋 Menampilkan data siswa...");
                    break;
                case 2:
                    System.out.println("➕ Menambah data siswa...");
                    break;
                case 3:
                    System.out.println("✏️ Mengedit data siswa...");
                    break;
                case 4:
                    System.out.println("🗑️ Menghapus data siswa...");
                    break;
                case 0:
                    System.out.println("👋 Terima kasih! Sampai jumpa.");
                    break;
                default:
                    System.out.println("❌ Pilihan tidak valid!");
            }

        } while (pilihan != 0);
    }
}
```

**Contoh Interaksi:**
```
=============================
    MENU APLIKASI SISWA
=============================
1. Lihat Data Siswa
2. Tambah Data Siswa
3. Edit Data Siswa
4. Hapus Data Siswa
0. Keluar
=============================
Pilihan Anda: 1

📋 Menampilkan data siswa...

=============================
    MENU APLIKASI SISWA
=============================
...
Pilihan Anda: 0

👋 Terima kasih! Sampai jumpa.
```

**Penjelasan Kode:**
- **do { ... } while (pilihan != 0)**: Menu pasti tampil minimal 1x
- **switch-case**: Memproses pilihan menu
- Loop berhenti ketika pilihan = 0
- Menu akan terus muncul sampai user pilih keluar

**✏️ Tugas Modifikasi:**
1. Tambahkan menu "5. Cari Data Siswa"
2. Buat submenu untuk setiap pilihan
3. Tambahkan konfirmasi sebelum keluar

---

### Latihan 4.2: Kalkulator Sederhana

**Tujuan**: Menggunakan do-while untuk aplikasi berulang.

```java
import java.util.Scanner;

/**
 * Latihan12_KalkulatorSederhana.java
 * Kalkulator yang dapat digunakan berulang kali
 */
public class Latihan12_KalkulatorSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String lanjut;

        System.out.println("=== KALKULATOR SEDERHANA ===\n");

        do {
            // Input angka
            System.out.print("Masukkan angka pertama: ");
            double angka1 = input.nextDouble();

            System.out.print("Masukkan operator (+, -, *, /): ");
            char operator = input.next().charAt(0);

            System.out.print("Masukkan angka kedua: ");
            double angka2 = input.nextDouble();

            // Hitung hasil
            double hasil = 0;
            boolean operatorValid = true;

            switch (operator) {
                case '+':
                    hasil = angka1 + angka2;
                    break;
                case '-':
                    hasil = angka1 - angka2;
                    break;
                case '*':
                    hasil = angka1 * angka2;
                    break;
                case '/':
                    if (angka2 != 0) {
                        hasil = angka1 / angka2;
                    } else {
                        System.out.println("Error: Tidak bisa dibagi 0!");
                        operatorValid = false;
                    }
                    break;
                default:
                    System.out.println("Operator tidak valid!");
                    operatorValid = false;
            }

            // Tampilkan hasil
            if (operatorValid) {
                System.out.printf("\nHasil: %.2f %c %.2f = %.2f\n",
                                  angka1, operator, angka2, hasil);
            }

            // Tanya apakah mau lanjut
            System.out.print("\nHitung lagi? (ya/tidak): ");
            lanjut = input.next();
            System.out.println();

        } while (lanjut.equalsIgnoreCase("ya"));

        System.out.println("Terima kasih telah menggunakan kalkulator!");
    }
}
```

**Contoh Interaksi:**
```
=== KALKULATOR SEDERHANA ===

Masukkan angka pertama: 10
Masukkan operator (+, -, *, /): *
Masukkan angka kedua: 5

Hasil: 10.00 * 5.00 = 50.00

Hitung lagi? (ya/tidak): ya

Masukkan angka pertama: 100
Masukkan operator (+, -, *, /): /
Masukkan angka kedua: 4

Hasil: 100.00 / 4.00 = 25.00

Hitung lagi? (ya/tidak): tidak

Terima kasih telah menggunakan kalkulator!
```

**Penjelasan Kode:**
- **do-while**: Kalkulator pasti jalan minimal 1x
- **switch (operator)**: Memproses operasi matematika
- **equalsIgnoreCase("ya")**: Perbandingan string (case-insensitive)
- **printf("%.2f")**: Format 2 desimal
- Validasi pembagian dengan 0

**✏️ Tugas Modifikasi:**
1. Tambahkan operator modulus (%)
2. Tambahkan operasi pangkat
3. Tambahkan history perhitungan

---

### Latihan 4.3: Permainan Tebak Angka

**Tujuan**: Kombinasi do-while dengan logika permainan.

```java
import java.util.Scanner;
import java.util.Random;

/**
 * Latihan13_TebakAngka.java
 * Permainan tebak angka menggunakan do-while
 */
public class Latihan13_TebakAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("=============================");
        System.out.println("  PERMAINAN TEBAK ANGKA");
        System.out.println("=============================");
        System.out.println("Saya menyimpan angka 1-100");
        System.out.println("Coba tebak angkanya!\n");

        // Generate angka rahasia
        int angkaRahasia = random.nextInt(100) + 1;  // 1-100
        int tebakan;
        int percobaan = 0;

        do {
            percobaan++;
            System.out.print("Percobaan ke-" + percobaan + ": ");
            tebakan = input.nextInt();

            if (tebakan < angkaRahasia) {
                System.out.println("⬆️ Terlalu kecil! Coba lagi.\n");
            } else if (tebakan > angkaRahasia) {
                System.out.println("⬇️ Terlalu besar! Coba lagi.\n");
            } else {
                System.out.println("\n🎉 SELAMAT! Anda benar!");
                System.out.println("Angka rahasia: " + angkaRahasia);
                System.out.println("Jumlah percobaan: " + percobaan);

                // Penilaian
                if (percobaan <= 5) {
                    System.out.println("Rating: ⭐⭐⭐ LUAR BIASA!");
                } else if (percobaan <= 10) {
                    System.out.println("Rating: ⭐⭐ BAGUS!");
                } else {
                    System.out.println("Rating: ⭐ CUKUP BAIK!");
                }
            }

        } while (tebakan != angkaRahasia);
    }
}
```

**Contoh Interaksi:**
```
=============================
  PERMAINAN TEBAK ANGKA
=============================
Saya menyimpan angka 1-100
Coba tebak angkanya!

Percobaan ke-1: 50
⬇️ Terlalu besar! Coba lagi.

Percobaan ke-2: 25
⬆️ Terlalu kecil! Coba lagi.

Percobaan ke-3: 35
⬆️ Terlalu kecil! Coba lagi.

Percobaan ke-4: 40
⬆️ Terlalu kecil! Coba lagi.

Percobaan ke-5: 45

🎉 SELAMAT! Anda benar!
Angka rahasia: 45
Jumlah percobaan: 5
Rating: ⭐⭐⭐ LUAR BIASA!
```

**Penjelasan Kode:**
- **Random**: Generate angka acak
- **nextInt(100) + 1**: Angka acak 1-100
- **do-while**: Loop sampai tebakan benar
- **percobaan++**: Hitung jumlah percobaan
- Memberikan hint (terlalu besar/kecil)

**✏️ Tugas Modifikasi:**
1. Beri batas maksimal percobaan (misal 10x)
2. Tambahkan pilihan "Main lagi?"
3. Simpan skor tertinggi (percobaan paling sedikit)

---

## 🎯 Latihan Tantangan

### Tantangan 1: Pola Bintang
Buat program yang menampilkan pola bintang segitiga:
```
*
**
***
****
*****
```

**Hint**: Gunakan nested loop (loop bersarang)

---

### Tantangan 2: Bilangan Prima
Buat program yang menampilkan bilangan prima dari 1-100.

**Hint**: Gunakan loop untuk cek apakah angka habis dibagi angka lain

---

### Tantangan 3: Fibonacci
Buat program yang menampilkan deret Fibonacci:
```
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
```

**Hint**: Setiap angka adalah jumlah 2 angka sebelumnya

---

## 📝 Checklist Latihan

Centang setelah Anda selesai mengerjakan:

**Loop FOR:**
- [ ] Latihan 1.1: Menampilkan Angka 1-10
- [ ] Latihan 1.2: Menampilkan Angka Genap
- [ ] Latihan 1.3: Tabel Perkalian
- [ ] Latihan 1.4: Menghitung Jumlah

**Loop FOR-EACH:**
- [ ] Latihan 2.1: Iterasi Array Sederhana
- [ ] Latihan 2.2: Menghitung Rata-Rata
- [ ] Latihan 2.3: Mencari Nilai Maksimum dan Minimum

**Loop WHILE:**
- [ ] Latihan 3.1: Countdown Sederhana
- [ ] Latihan 3.2: Validasi Input Angka
- [ ] Latihan 3.3: Menghitung Faktorial

**Loop DO-WHILE:**
- [ ] Latihan 4.1: Menu Sederhana
- [ ] Latihan 4.2: Kalkulator Sederhana
- [ ] Latihan 4.3: Permainan Tebak Angka

**Tantangan:**
- [ ] Tantangan 1: Pola Bintang
- [ ] Tantangan 2: Bilangan Prima
- [ ] Tantangan 3: Fibonacci

---

## 💡 Tips Sukses

1. **Ketik kode sendiri** - jangan copy-paste
2. **Pahami setiap baris** - baca komentar dengan teliti
3. **Jalankan dan test** - lihat outputnya
4. **Modifikasi kode** - eksplorasi dengan perubahan
5. **Debug jika error** - pelajari pesan error
6. **Catat yang sulit** - tanyakan ke tutor jika bingung

---

## 🚀 Langkah Selanjutnya

Setelah menguasai latihan dasar ini, lanjutkan ke:
- **Latihan Menengah** - kombinasi loop dengan array dan decision
- **Latihan Lengkap** - studi kasus yang lebih kompleks
- **Aplikasi Utama** - Sistem Kalkulator Statistik

---

**Selamat Berlatih! 💪**

*"The only way to learn programming is by writing programs."*

---

© 2025 Anton Prafanto, S.Kom, M.T. | Universitas Terbuka
