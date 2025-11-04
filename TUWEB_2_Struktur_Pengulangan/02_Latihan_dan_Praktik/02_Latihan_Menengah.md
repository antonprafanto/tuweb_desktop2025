# Latihan Menengah: Struktur Pengulangan

## Tutorial Ke-2: Pemrograman Berbasis Desktop
**Kombinasi Loop, Array, dan Decision**

---

## 🎯 Tujuan Latihan

Setelah menyelesaikan latihan menengah ini, mahasiswa diharapkan dapat:
1. Mengombinasikan loop dengan struktur keputusan (if-else)
2. Menggunakan loop bersarang (nested loop)
3. Memproses array menggunakan berbagai jenis loop
4. Menerapkan break dan continue
5. Menyelesaikan problem solving yang lebih kompleks

---

## 📋 Latihan 1: Analisis Nilai Mahasiswa

**Studi Kasus**: Menghitung statistik nilai ujian dan menentukan grade.

```java
import java.util.Scanner;

/**
 * AnalisisNilaiMahasiswa.java
 * Menganalisis nilai mahasiswa dengan kategori grade
 */
public class AnalisisNilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("  ANALISIS NILAI MAHASISWA");
        System.out.println("===================================\n");

        // Input jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();

        // Deklarasi array
        double[] nilaiMahasiswa = new double[jumlahMahasiswa];
        String[] gradeMahasiswa = new String[jumlahMahasiswa];

        // Input nilai setiap mahasiswa
        System.out.println("\nInput Nilai Mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Mahasiswa " + (i + 1) + ": ");
            nilaiMahasiswa[i] = input.nextDouble();

            // Tentukan grade
            if (nilaiMahasiswa[i] >= 85) {
                gradeMahasiswa[i] = "A";
            } else if (nilaiMahasiswa[i] >= 70) {
                gradeMahasiswa[i] = "B";
            } else if (nilaiMahasiswa[i] >= 60) {
                gradeMahasiswa[i] = "C";
            } else if (nilaiMahasiswa[i] >= 50) {
                gradeMahasiswa[i] = "D";
            } else {
                gradeMahasiswa[i] = "E";
            }
        }

        // Hitung statistik
        double total = 0;
        double nilaiTertinggi = nilaiMahasiswa[0];
        double nilaiTerendah = nilaiMahasiswa[0];
        int jumlahLulus = 0;

        for (double nilai : nilaiMahasiswa) {
            total += nilai;

            if (nilai > nilaiTertinggi) {
                nilaiTertinggi = nilai;
            }
            if (nilai < nilaiTerendah) {
                nilaiTerendah = nilai;
            }
            if (nilai >= 60) {  // Lulus jika >= 60
                jumlahLulus++;
            }
        }

        double rataRata = total / jumlahMahasiswa;

        // Hitung distribusi grade
        int jumlahA = 0, jumlahB = 0, jumlahC = 0, jumlahD = 0, jumlahE = 0;

        for (String grade : gradeMahasiswa) {
            switch (grade) {
                case "A": jumlahA++; break;
                case "B": jumlahB++; break;
                case "C": jumlahC++; break;
                case "D": jumlahD++; break;
                case "E": jumlahE++; break;
            }
        }

        // Tampilkan hasil
        System.out.println("\n===================================");
        System.out.println("         HASIL ANALISIS");
        System.out.println("===================================");

        System.out.println("\nDaftar Nilai dan Grade:");
        System.out.println("-----------------------------------");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.printf("Mahasiswa %2d: %.2f  (Grade: %s)\n",
                            (i + 1), nilaiMahasiswa[i], gradeMahasiswa[i]);
        }

        System.out.println("\n------- STATISTIK NILAI -----------");
        System.out.printf("Nilai Tertinggi  : %.2f\n", nilaiTertinggi);
        System.out.printf("Nilai Terendah   : %.2f\n", nilaiTerendah);
        System.out.printf("Rata-rata        : %.2f\n", rataRata);
        System.out.println("Jumlah Lulus     : " + jumlahLulus + " mahasiswa");
        System.out.println("Jumlah Tidak Lulus: " + (jumlahMahasiswa - jumlahLulus) + " mahasiswa");

        System.out.println("\n------- DISTRIBUSI GRADE ----------");
        System.out.println("Grade A: " + jumlahA + " mahasiswa");
        System.out.println("Grade B: " + jumlahB + " mahasiswa");
        System.out.println("Grade C: " + jumlahC + " mahasiswa");
        System.out.println("Grade D: " + jumlahD + " mahasiswa");
        System.out.println("Grade E: " + jumlahE + " mahasiswa");
        System.out.println("===================================");
    }
}
```

**Konsep yang Dipelajari:**
- Loop for dengan array
- Loop for-each untuk statistik
- Kombinasi if-else dan loop
- Switch-case untuk counting
- Format output dengan printf

---

## 📋 Latihan 2: Pola Bintang dengan Nested Loop

**Studi Kasus**: Membuat berbagai pola menggunakan loop bersarang.

```java
import java.util.Scanner;

/**
 * PolaBintang.java
 * Membuat berbagai pola bintang menggunakan nested loop
 */
public class PolaBintang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n===================================");
            System.out.println("       GENERATOR POLA BINTANG");
            System.out.println("===================================");
            System.out.println("1. Segitiga Siku-Siku");
            System.out.println("2. Segitiga Terbalik");
            System.out.println("3. Piramida");
            System.out.println("4. Piramida Terbalik");
            System.out.println("5. Belah Ketupat");
            System.out.println("0. Keluar");
            System.out.println("===================================");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();

            if (pilihan >= 1 && pilihan <= 5) {
                System.out.print("Masukkan tinggi: ");
                int tinggi = input.nextInt();
                System.out.println();

                switch (pilihan) {
                    case 1:
                        // Segitiga Siku-Siku
                        for (int i = 1; i <= tinggi; i++) {
                            for (int j = 1; j <= i; j++) {
                                System.out.print("* ");
                            }
                            System.out.println();
                        }
                        break;

                    case 2:
                        // Segitiga Terbalik
                        for (int i = tinggi; i >= 1; i--) {
                            for (int j = 1; j <= i; j++) {
                                System.out.print("* ");
                            }
                            System.out.println();
                        }
                        break;

                    case 3:
                        // Piramida
                        for (int i = 1; i <= tinggi; i++) {
                            // Cetak spasi
                            for (int j = 1; j <= tinggi - i; j++) {
                                System.out.print("  ");
                            }
                            // Cetak bintang
                            for (int j = 1; j <= 2 * i - 1; j++) {
                                System.out.print("* ");
                            }
                            System.out.println();
                        }
                        break;

                    case 4:
                        // Piramida Terbalik
                        for (int i = tinggi; i >= 1; i--) {
                            // Cetak spasi
                            for (int j = 1; j <= tinggi - i; j++) {
                                System.out.print("  ");
                            }
                            // Cetak bintang
                            for (int j = 1; j <= 2 * i - 1; j++) {
                                System.out.print("* ");
                            }
                            System.out.println();
                        }
                        break;

                    case 5:
                        // Belah Ketupat
                        // Bagian atas
                        for (int i = 1; i <= tinggi; i++) {
                            for (int j = 1; j <= tinggi - i; j++) {
                                System.out.print("  ");
                            }
                            for (int j = 1; j <= 2 * i - 1; j++) {
                                System.out.print("* ");
                            }
                            System.out.println();
                        }
                        // Bagian bawah
                        for (int i = tinggi - 1; i >= 1; i--) {
                            for (int j = 1; j <= tinggi - i; j++) {
                                System.out.print("  ");
                            }
                            for (int j = 1; j <= 2 * i - 1; j++) {
                                System.out.print("* ");
                            }
                            System.out.println();
                        }
                        break;
                }
            } else if (pilihan != 0) {
                System.out.println("\n❌ Pilihan tidak valid!");
            }

        } while (pilihan != 0);

        System.out.println("\nTerima kasih!");
    }
}
```

**Konsep yang Dipelajari:**
- Nested loop (loop bersarang)
- Do-while untuk menu
- Switch-case untuk pilihan
- Logika matematika untuk pola

---

## 📋 Latihan 3: Pencarian Data dalam Array

**Studi Kasus**: Mencari data mahasiswa berdasarkan NIM.

```java
import java.util.Scanner;

/**
 * PencarianMahasiswa.java
 * Mencari data mahasiswa menggunakan linear search
 */
public class PencarianMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Data mahasiswa (simulasi database)
        String[] nimMahasiswa = {"2101", "2102", "2103", "2104", "2105"};
        String[] namaMahasiswa = {"Andi", "Budi", "Citra", "Doni", "Eka"};
        String[] prodiMahasiswa = {"Informatika", "SI", "Informatika", "SI", "Informatika"};

        String lanjut;

        do {
            System.out.println("\n===================================");
            System.out.println("    PENCARIAN DATA MAHASISWA");
            System.out.println("===================================");
            System.out.print("Masukkan NIM yang dicari: ");
            String nimCari = input.nextLine();

            // Linear search
            boolean ditemukan = false;
            int indexDitemukan = -1;

            for (int i = 0; i < nimMahasiswa.length; i++) {
                if (nimMahasiswa[i].equals(nimCari)) {
                    ditemukan = true;
                    indexDitemukan = i;
                    break;  // Keluar dari loop jika sudah ketemu
                }
            }

            // Tampilkan hasil
            System.out.println();
            if (ditemukan) {
                System.out.println("✅ DATA DITEMUKAN!");
                System.out.println("-----------------------------------");
                System.out.println("NIM    : " + nimMahasiswa[indexDitemukan]);
                System.out.println("Nama   : " + namaMahasiswa[indexDitemukan]);
                System.out.println("Prodi  : " + prodiMahasiswa[indexDitemukan]);
            } else {
                System.out.println("❌ DATA TIDAK DITEMUKAN!");
                System.out.println("NIM \"" + nimCari + "\" tidak ada dalam database.");
            }

            System.out.print("\nCari lagi? (ya/tidak): ");
            lanjut = input.nextLine();

        } while (lanjut.equalsIgnoreCase("ya"));

        System.out.println("\nTerima kasih!");
    }
}
```

**Konsep yang Dipelajari:**
- Loop for untuk searching
- Break statement
- Boolean flag
- Do-while untuk pengulangan menu
- Perbandingan string dengan equals()

---

## 📋 Latihan 4: Simulasi ATM Sederhana

**Studi Kasus**: Membuat simulasi transaksi ATM.

```java
import java.util.Scanner;

/**
 * SimulasiATM.java
 * Simulasi mesin ATM sederhana dengan transaksi
 */
public class SimulasiATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Data akun
        String pin = "1234";
        double saldo = 1000000;  // Saldo awal 1 juta
        boolean loginBerhasil = false;
        int percobaan = 0;
        int maksPercobaan = 3;

        System.out.println("===================================");
        System.out.println("         SELAMAT DATANG");
        System.out.println("          DI ATM BANK");
        System.out.println("===================================\n");

        // Login (maksimal 3 percobaan)
        while (percobaan < maksPercobaan && !loginBerhasil) {
            System.out.print("Masukkan PIN: ");
            String inputPin = input.nextLine();
            percobaan++;

            if (inputPin.equals(pin)) {
                loginBerhasil = true;
                System.out.println("✅ Login berhasil!\n");
            } else {
                System.out.println("❌ PIN salah!");
                if (percobaan < maksPercobaan) {
                    System.out.println("Sisa percobaan: " + (maksPercobaan - percobaan) + "\n");
                } else {
                    System.out.println("Kartu terblokir! Hubungi customer service.\n");
                }
            }
        }

        // Menu transaksi (jika login berhasil)
        if (loginBerhasil) {
            int pilihan;

            do {
                System.out.println("===================================");
                System.out.println("          MENU TRANSAKSI");
                System.out.println("===================================");
                System.out.println("1. Cek Saldo");
                System.out.println("2. Tarik Tunai");
                System.out.println("3. Setor Tunai");
                System.out.println("4. Transfer");
                System.out.println("0. Keluar");
                System.out.println("===================================");
                System.out.print("Pilihan: ");
                pilihan = input.nextInt();

                System.out.println();

                switch (pilihan) {
                    case 1:
                        // Cek Saldo
                        System.out.println("--- CEK SALDO ---");
                        System.out.printf("Saldo Anda: Rp %.2f\n", saldo);
                        break;

                    case 2:
                        // Tarik Tunai
                        System.out.println("--- TARIK TUNAI ---");
                        System.out.print("Jumlah penarikan: Rp ");
                        double jumlahTarik = input.nextDouble();

                        if (jumlahTarik > saldo) {
                            System.out.println("❌ Saldo tidak mencukupi!");
                        } else if (jumlahTarik <= 0) {
                            System.out.println("❌ Jumlah tidak valid!");
                        } else {
                            saldo -= jumlahTarik;
                            System.out.println("✅ Penarikan berhasil!");
                            System.out.printf("Saldo tersisa: Rp %.2f\n", saldo);
                        }
                        break;

                    case 3:
                        // Setor Tunai
                        System.out.println("--- SETOR TUNAI ---");
                        System.out.print("Jumlah setoran: Rp ");
                        double jumlahSetor = input.nextDouble();

                        if (jumlahSetor <= 0) {
                            System.out.println("❌ Jumlah tidak valid!");
                        } else {
                            saldo += jumlahSetor;
                            System.out.println("✅ Setoran berhasil!");
                            System.out.printf("Saldo sekarang: Rp %.2f\n", saldo);
                        }
                        break;

                    case 4:
                        // Transfer
                        System.out.println("--- TRANSFER ---");
                        System.out.print("Nomor rekening tujuan: ");
                        String noRekening = input.next();
                        System.out.print("Jumlah transfer: Rp ");
                        double jumlahTransfer = input.nextDouble();

                        if (jumlahTransfer > saldo) {
                            System.out.println("❌ Saldo tidak mencukupi!");
                        } else if (jumlahTransfer <= 0) {
                            System.out.println("❌ Jumlah tidak valid!");
                        } else {
                            saldo -= jumlahTransfer;
                            System.out.println("✅ Transfer berhasil!");
                            System.out.println("Ke rekening: " + noRekening);
                            System.out.printf("Saldo tersisa: Rp %.2f\n", saldo);
                        }
                        break;

                    case 0:
                        System.out.println("Terima kasih telah menggunakan ATM kami!");
                        break;

                    default:
                        System.out.println("❌ Pilihan tidak valid!");
                }

                System.out.println();

            } while (pilihan != 0);
        }
    }
}
```

**Konsep yang Dipelajari:**
- While loop dengan kondisi majemuk
- Do-while untuk menu
- Switch-case untuk pilihan menu
- Validasi input
- Flag boolean untuk kontrol flow

---

## 🎯 Latihan Mandiri

Kerjakan latihan berikut untuk memperdalam pemahaman:

### 1. Kalkulator Diskon Belanja
Buat program yang:
- Input harga barang dan jumlah barang
- Hitung total belanja
- Berikan diskon bertingkat:
  - Belanja < 100.000: tidak ada diskon
  - Belanja 100.000-500.000: diskon 10%
  - Belanja > 500.000: diskon 20%

### 2. Konversi Suhu Multi Format
Buat program yang:
- Input suhu dalam Celsius
- Tampilkan konversi ke Fahrenheit, Kelvin, dan Reamur
- Gunakan menu dengan do-while
- Validasi input (suhu tidak boleh < -273.15°C)

### 3. Deret Bilangan
Buat program yang menampilkan:
- Deret Fibonacci (10 angka pertama)
- Deret bilangan prima (20 angka pertama)
- Deret bilangan genap (50 angka pertama)

---

## 📝 Checklist

- [ ] Latihan 1: Analisis Nilai Mahasiswa
- [ ] Latihan 2: Pola Bintang
- [ ] Latihan 3: Pencarian Mahasiswa
- [ ] Latihan 4: Simulasi ATM
- [ ] Latihan Mandiri 1: Kalkulator Diskon
- [ ] Latihan Mandiri 2: Konversi Suhu
- [ ] Latihan Mandiri 3: Deret Bilangan

---

**Selamat Berlatih! 🚀**

---

© 2025 Anton Prafanto, S.Kom, M.T. | Universitas Terbuka
