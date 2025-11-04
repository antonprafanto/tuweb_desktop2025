import java.util.Scanner;

/**
 * SistemKalkulatorStatistik.java
 * Aplikasi kalkulator statistik untuk menganalisis data nilai mahasiswa
 *
 * Fitur:
 * - Input data nilai mahasiswa
 * - Hitung rata-rata, median, modus
 * - Cari nilai tertinggi dan terendah
 * - Distribusi nilai (rentang nilai)
 * - Standar deviasi
 * - Tampilkan laporan lengkap
 *
 * @author Anton Prafanto, S.Kom, M.T.
 * @version 1.0
 * Tutorial Ke-2: Struktur Pengulangan
 */
public class SistemKalkulatorStatistik {

    // Variabel global untuk data
    static Scanner input = new Scanner(System.in);
    static double[] dataNilai;
    static int jumlahData = 0;
    static boolean dataAktif = false;

    public static void main(String[] args) {
        int pilihan;

        tampilkanHeader();

        do {
            tampilkanMenuUtama();
            pilihan = input.nextInt();

            System.out.println();

            switch (pilihan) {
                case 1:
                    inputData();
                    break;
                case 2:
                    tampilkanData();
                    break;
                case 3:
                    hitungStatistikDasar();
                    break;
                case 4:
                    hitungStatistikLanjutan();
                    break;
                case 5:
                    tampilkanDistribusiNilai();
                    break;
                case 6:
                    tampilkanLaporanLengkap();
                    break;
                case 0:
                    System.out.println("=======================================");
                    System.out.println("  Terima kasih telah menggunakan");
                    System.out.println("  Sistem Kalkulator Statistik!");
                    System.out.println("=======================================");
                    break;
                default:
                    System.out.println("❌ Pilihan tidak valid!");
            }

            // Jeda sebelum kembali ke menu
            if (pilihan != 0) {
                System.out.print("\nTekan ENTER untuk melanjutkan...");
                input.nextLine();
                input.nextLine();
                System.out.println();
            }

        } while (pilihan != 0);
    }

    /**
     * Menampilkan header aplikasi
     */
    static void tampilkanHeader() {
        System.out.println("=======================================");
        System.out.println("  SISTEM KALKULATOR STATISTIK");
        System.out.println("  Analisis Data Nilai Mahasiswa");
        System.out.println("=======================================");
        System.out.println("  Universitas Terbuka");
        System.out.println("  STSI4201 - Pemrograman Berbasis Desktop");
        System.out.println("=======================================\n");
    }

    /**
     * Menampilkan menu utama
     */
    static void tampilkanMenuUtama() {
        System.out.println("=======================================");
        System.out.println("            MENU UTAMA");
        System.out.println("=======================================");
        System.out.println("1. Input Data Nilai");
        System.out.println("2. Tampilkan Data");
        System.out.println("3. Statistik Dasar (Rata-rata, Max, Min)");
        System.out.println("4. Statistik Lanjutan (Median, Modus, SD)");
        System.out.println("5. Distribusi Nilai");
        System.out.println("6. Laporan Lengkap");
        System.out.println("0. Keluar");
        System.out.println("=======================================");
        System.out.print("Pilihan Anda: ");
    }

    /**
     * Input data nilai dari pengguna
     */
    static void inputData() {
        System.out.println("=======================================");
        System.out.println("         INPUT DATA NILAI");
        System.out.println("=======================================");

        System.out.print("Jumlah data yang akan diinput: ");
        jumlahData = input.nextInt();

        if (jumlahData <= 0) {
            System.out.println("❌ Jumlah data harus lebih dari 0!");
            return;
        }

        dataNilai = new double[jumlahData];

        System.out.println("\nMasukkan nilai (0-100):");
        System.out.println("---------------------------------------");

        for (int i = 0; i < jumlahData; i++) {
            boolean inputValid = false;

            while (!inputValid) {
                System.out.print("Data ke-" + (i + 1) + ": ");
                double nilai = input.nextDouble();

                if (nilai >= 0 && nilai <= 100) {
                    dataNilai[i] = nilai;
                    inputValid = true;
                } else {
                    System.out.println("   ❌ Nilai harus antara 0-100!");
                }
            }
        }

        dataAktif = true;
        System.out.println("\n✅ Data berhasil diinput!");
    }

    /**
     * Menampilkan semua data yang telah diinput
     */
    static void tampilkanData() {
        if (!cekDataAktif()) return;

        System.out.println("=======================================");
        System.out.println("         TAMPILAN DATA NILAI");
        System.out.println("=======================================");

        System.out.println("\nDaftar Nilai:");
        System.out.println("---------------------------------------");

        int baris = 0;
        for (int i = 0; i < jumlahData; i++) {
            System.out.printf("%2d. %.2f   ", (i + 1), dataNilai[i]);
            baris++;

            if (baris % 3 == 0) {  // 3 data per baris
                System.out.println();
            }
        }

        if (baris % 3 != 0) {
            System.out.println();
        }

        System.out.println("---------------------------------------");
        System.out.println("Total data: " + jumlahData + " nilai");
    }

    /**
     * Menghitung dan menampilkan statistik dasar
     */
    static void hitungStatistikDasar() {
        if (!cekDataAktif()) return;

        System.out.println("=======================================");
        System.out.println("        STATISTIK DASAR");
        System.out.println("=======================================");

        // Hitung total dan rata-rata
        double total = 0;
        for (double nilai : dataNilai) {
            total += nilai;
        }
        double rataRata = total / jumlahData;

        // Cari nilai tertinggi dan terendah
        double nilaiTertinggi = dataNilai[0];
        double nilaiTerendah = dataNilai[0];

        for (double nilai : dataNilai) {
            if (nilai > nilaiTertinggi) {
                nilaiTertinggi = nilai;
            }
            if (nilai < nilaiTerendah) {
                nilaiTerendah = nilai;
            }
        }

        // Hitung range
        double range = nilaiTertinggi - nilaiTerendah;

        // Tampilkan hasil
        System.out.println("\n--- Hasil Perhitungan ---");
        System.out.printf("Total Nilai        : %.2f\n", total);
        System.out.printf("Rata-rata          : %.2f\n", rataRata);
        System.out.printf("Nilai Tertinggi    : %.2f\n", nilaiTertinggi);
        System.out.printf("Nilai Terendah     : %.2f\n", nilaiTerendah);
        System.out.printf("Range (Jangkauan)  : %.2f\n", range);
    }

    /**
     * Menghitung dan menampilkan statistik lanjutan
     */
    static void hitungStatistikLanjutan() {
        if (!cekDataAktif()) return;

        System.out.println("=======================================");
        System.out.println("       STATISTIK LANJUTAN");
        System.out.println("=======================================");

        // Hitung rata-rata (untuk standar deviasi)
        double total = 0;
        for (double nilai : dataNilai) {
            total += nilai;
        }
        double rataRata = total / jumlahData;

        // Hitung median (sort data terlebih dahulu)
        double[] dataTerurut = dataNilai.clone();
        urutkanData(dataTerurut);

        double median;
        if (jumlahData % 2 == 0) {
            // Jika genap, ambil rata-rata 2 nilai tengah
            int tengah1 = jumlahData / 2 - 1;
            int tengah2 = jumlahData / 2;
            median = (dataTerurut[tengah1] + dataTerurut[tengah2]) / 2;
        } else {
            // Jika ganjil, ambil nilai tengah
            int tengah = jumlahData / 2;
            median = dataTerurut[tengah];
        }

        // Hitung modus (nilai yang paling sering muncul)
        double modus = hitungModus();

        // Hitung standar deviasi
        double jumlahKuadratSelisih = 0;
        for (double nilai : dataNilai) {
            double selisih = nilai - rataRata;
            jumlahKuadratSelisih += selisih * selisih;
        }
        double variansi = jumlahKuadratSelisih / jumlahData;
        double standarDeviasi = Math.sqrt(variansi);

        // Tampilkan hasil
        System.out.println("\n--- Hasil Perhitungan ---");
        System.out.printf("Rata-rata          : %.2f\n", rataRata);
        System.out.printf("Median             : %.2f\n", median);
        System.out.printf("Modus              : %.2f\n", modus);
        System.out.printf("Variansi           : %.2f\n", variansi);
        System.out.printf("Standar Deviasi    : %.2f\n", standarDeviasi);

        // Interpretasi
        System.out.println("\n--- Interpretasi ---");
        if (standarDeviasi < 10) {
            System.out.println("Data cenderung homogen (tidak bervariasi)");
        } else if (standarDeviasi < 20) {
            System.out.println("Data cukup bervariasi");
        } else {
            System.out.println("Data sangat bervariasi (heterogen)");
        }
    }

    /**
     * Menampilkan distribusi nilai dalam rentang tertentu
     */
    static void tampilkanDistribusiNilai() {
        if (!cekDataAktif()) return;

        System.out.println("=======================================");
        System.out.println("        DISTRIBUSI NILAI");
        System.out.println("=======================================");

        // Rentang nilai
        int[] distribusi = new int[5];
        // [0]: 0-20, [1]: 21-40, [2]: 41-60, [3]: 61-80, [4]: 81-100

        for (double nilai : dataNilai) {
            if (nilai >= 0 && nilai <= 20) {
                distribusi[0]++;
            } else if (nilai <= 40) {
                distribusi[1]++;
            } else if (nilai <= 60) {
                distribusi[2]++;
            } else if (nilai <= 80) {
                distribusi[3]++;
            } else {
                distribusi[4]++;
            }
        }

        System.out.println("\n--- Distribusi Rentang Nilai ---");
        System.out.println("Rentang   Jumlah   Persentase  Grafik");
        System.out.println("---------------------------------------");

        String[] rentang = {"0-20  ", "21-40 ", "41-60 ", "61-80 ", "81-100"};

        for (int i = 0; i < 5; i++) {
            double persentase = (double) distribusi[i] / jumlahData * 100;

            System.out.printf("%-9s %-8d %-11.1f%% ",
                            rentang[i], distribusi[i], persentase);

            // Tampilkan grafik batang
            int jumlahBintang = (int) Math.round(persentase / 5);
            for (int j = 0; j < jumlahBintang; j++) {
                System.out.print("█");
            }
            System.out.println();
        }

        System.out.println("---------------------------------------");
        System.out.println("Total: " + jumlahData + " data");
    }

    /**
     * Menampilkan laporan lengkap semua statistik
     */
    static void tampilkanLaporanLengkap() {
        if (!cekDataAktif()) return;

        System.out.println("=======================================");
        System.out.println("        LAPORAN STATISTIK LENGKAP");
        System.out.println("=======================================");

        // Data dasar
        double total = 0;
        double nilaiTertinggi = dataNilai[0];
        double nilaiTerendah = dataNilai[0];

        for (double nilai : dataNilai) {
            total += nilai;
            if (nilai > nilaiTertinggi) nilaiTertinggi = nilai;
            if (nilai < nilaiTerendah) nilaiTerendah = nilai;
        }

        double rataRata = total / jumlahData;

        // Median
        double[] dataTerurut = dataNilai.clone();
        urutkanData(dataTerurut);
        double median;
        if (jumlahData % 2 == 0) {
            median = (dataTerurut[jumlahData/2-1] + dataTerurut[jumlahData/2]) / 2;
        } else {
            median = dataTerurut[jumlahData/2];
        }

        // Standar deviasi
        double jumlahKuadratSelisih = 0;
        for (double nilai : dataNilai) {
            jumlahKuadratSelisih += Math.pow(nilai - rataRata, 2);
        }
        double standarDeviasi = Math.sqrt(jumlahKuadratSelisih / jumlahData);

        // Grade distribution
        int gradeA = 0, gradeB = 0, gradeC = 0, gradeD = 0, gradeE = 0;
        for (double nilai : dataNilai) {
            if (nilai >= 85) gradeA++;
            else if (nilai >= 70) gradeB++;
            else if (nilai >= 60) gradeC++;
            else if (nilai >= 50) gradeD++;
            else gradeE++;
        }

        // Tampilkan laporan
        System.out.println("\n╔═══════════════════════════════════════╗");
        System.out.println("║        RINGKASAN STATISTIK            ║");
        System.out.println("╠═══════════════════════════════════════╣");
        System.out.printf("║ Jumlah Data       : %-18d║\n", jumlahData);
        System.out.printf("║ Total Nilai       : %-18.2f║\n", total);
        System.out.printf("║ Rata-rata         : %-18.2f║\n", rataRata);
        System.out.printf("║ Median            : %-18.2f║\n", median);
        System.out.printf("║ Modus             : %-18.2f║\n", hitungModus());
        System.out.printf("║ Nilai Tertinggi   : %-18.2f║\n", nilaiTertinggi);
        System.out.printf("║ Nilai Terendah    : %-18.2f║\n", nilaiTerendah);
        System.out.printf("║ Range             : %-18.2f║\n",
                         nilaiTertinggi - nilaiTerendah);
        System.out.printf("║ Standar Deviasi   : %-18.2f║\n", standarDeviasi);
        System.out.println("╠═══════════════════════════════════════╣");
        System.out.println("║        DISTRIBUSI GRADE               ║");
        System.out.println("╠═══════════════════════════════════════╣");
        System.out.printf("║ Grade A (≥85)     : %-4d (%-5.1f%%)     ║\n",
                         gradeA, (double)gradeA/jumlahData*100);
        System.out.printf("║ Grade B (70-84)   : %-4d (%-5.1f%%)     ║\n",
                         gradeB, (double)gradeB/jumlahData*100);
        System.out.printf("║ Grade C (60-69)   : %-4d (%-5.1f%%)     ║\n",
                         gradeC, (double)gradeC/jumlahData*100);
        System.out.printf("║ Grade D (50-59)   : %-4d (%-5.1f%%)     ║\n",
                         gradeD, (double)gradeD/jumlahData*100);
        System.out.printf("║ Grade E (<50)     : %-4d (%-5.1f%%)     ║\n",
                         gradeE, (double)gradeE/jumlahData*100);
        System.out.println("╚═══════════════════════════════════════╝");

        System.out.println("\n--- Kesimpulan ---");
        if (rataRata >= 75) {
            System.out.println("✅ Kelas memiliki performa BAIK (rata-rata ≥ 75)");
        } else if (rataRata >= 60) {
            System.out.println("⚠️ Kelas memiliki performa CUKUP (rata-rata 60-74)");
        } else {
            System.out.println("❌ Kelas memiliki performa KURANG (rata-rata < 60)");
        }
    }

    /**
     * Cek apakah ada data yang aktif
     */
    static boolean cekDataAktif() {
        if (!dataAktif) {
            System.out.println("=======================================");
            System.out.println("❌ Belum ada data!");
            System.out.println("   Silakan input data terlebih dahulu (Menu 1)");
            System.out.println("=======================================");
            return false;
        }
        return true;
    }

    /**
     * Mengurutkan array menggunakan bubble sort
     */
    static void urutkanData(double[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Tukar posisi
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Menghitung modus (nilai yang paling sering muncul)
     */
    static double hitungModus() {
        double modus = dataNilai[0];
        int frekuensiMaksimal = 0;

        for (int i = 0; i < jumlahData; i++) {
            int frekuensi = 0;

            for (int j = 0; j < jumlahData; j++) {
                if (dataNilai[j] == dataNilai[i]) {
                    frekuensi++;
                }
            }

            if (frekuensi > frekuensiMaksimal) {
                frekuensiMaksimal = frekuensi;
                modus = dataNilai[i];
            }
        }

        // Jika semua nilai muncul sama, maka tidak ada modus
        if (frekuensiMaksimal == 1) {
            return -1;  // Tidak ada modus
        }

        return modus;
    }
}
