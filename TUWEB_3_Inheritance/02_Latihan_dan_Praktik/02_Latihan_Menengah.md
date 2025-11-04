# Latihan Menengah - Inheritance dengan Abstract Class

**Tutorial Ke-3: Inheritance**
**Mata Kuliah**: Pemrograman Berbasis Desktop (STSI4201)
**Dosen**: Anton Prafanto, S.Kom, M.T.

---

## 🎯 Tujuan Latihan

Setelah menyelesaikan latihan menengah ini, Anda diharapkan mampu:
1. Memahami konsep **abstract class** dan **abstract method**
2. Membedakan abstract class dengan class biasa
3. Menggunakan keyword `abstract`
4. Membuat hierarki class yang lebih kompleks
5. Menerapkan polymorphism tingkat lanjut
6. Membuat aplikasi lengkap dengan OOP

---

## 📚 Pengantar Abstract Class

**Abstract Class** adalah class yang tidak bisa diinstansiasi (tidak bisa dibuat objectnya). Abstract class digunakan sebagai **blueprint** atau **template** untuk class-class turunannya.

**Karakteristik Abstract Class**:
- Dideklarasikan dengan keyword `abstract`
- Bisa memiliki **abstract method** (method tanpa implementasi)
- Bisa memiliki **concrete method** (method dengan implementasi)
- Tidak bisa dibuat objectnya langsung
- Harus di-extends oleh class lain

**Contoh Sederhana**:
```java
abstract class Hewan {
    abstract void bersuara(); // Abstract method - tidak ada body

    void bernafas() {          // Concrete method - ada body
        System.out.println("Hewan bernafas");
    }
}

class Kucing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Meow!");
    }
}
```

---

## 🟠 LEVEL 1: Abstract Class Dasar

### Latihan 1: Abstract Class Pertama

**Tujuan**: Memahami konsep dasar abstract class

**Kode**:
```java
// File: Latihan01.java

abstract class Kendaraan {
    protected String merk;
    protected int tahunProduksi;

    Kendaraan(String merk, int tahunProduksi) {
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
    }

    // Abstract method - harus di-implement oleh child class
    abstract void nyalakanMesin();
    abstract void matikanMesin();

    // Concrete method - sudah ada implementasinya
    void infoKendaraan() {
        System.out.println("Merk: " + merk);
        System.out.println("Tahun: " + tahunProduksi);
    }
}

class Mobil extends Kendaraan {
    private String jenisBBM;

    Mobil(String merk, int tahunProduksi, String jenisBBM) {
        super(merk, tahunProduksi);
        this.jenisBBM = jenisBBM;
    }

    @Override
    void nyalakanMesin() {
        System.out.println("Mesin mobil " + merk + " dinyalakan dengan " + jenisBBM);
        System.out.println("Vroom vroom...");
    }

    @Override
    void matikanMesin() {
        System.out.println("Mesin mobil " + merk + " dimatikan");
    }
}

class Motor extends Kendaraan {
    private int cc;

    Motor(String merk, int tahunProduksi, int cc) {
        super(merk, tahunProduksi);
        this.cc = cc;
    }

    @Override
    void nyalakanMesin() {
        System.out.println("Mesin motor " + merk + " " + cc + "cc dinyalakan");
        System.out.println("Ngeng ngeng...");
    }

    @Override
    void matikanMesin() {
        System.out.println("Mesin motor " + merk + " dimatikan");
    }
}

public class Latihan01 {
    public static void main(String[] args) {
        // Kendaraan k = new Kendaraan("Test", 2023); // ERROR! Tidak bisa instansiasi abstract class

        Mobil mobil = new Mobil("Toyota Avanza", 2023, "Bensin");
        Motor motor = new Motor("Honda Beat", 2022, 110);

        System.out.println("=== MOBIL ===");
        mobil.infoKendaraan();
        mobil.nyalakanMesin();
        mobil.matikanMesin();

        System.out.println("\n=== MOTOR ===");
        motor.infoKendaraan();
        motor.nyalakanMesin();
        motor.matikanMesin();

        // Polymorphism dengan abstract class
        System.out.println("\n=== POLYMORPHISM ===");
        Kendaraan[] kendaraan = {mobil, motor};
        for (Kendaraan k : kendaraan) {
            k.nyalakanMesin();
            System.out.println();
        }
    }
}
```

**Output yang Diharapkan**:
```
=== MOBIL ===
Merk: Toyota Avanza
Tahun: 2023
Mesin mobil Toyota Avanza dinyalakan dengan Bensin
Vroom vroom...
Mesin mobil Toyota Avanza dimatikan

=== MOTOR ===
Merk: Honda Beat
Tahun: 2022
Mesin motor Honda Beat 110cc dinyalakan
Ngeng ngeng...
Mesin motor Honda Beat dimatikan

=== POLYMORPHISM ===
Mesin mobil Toyota Avanza dinyalakan dengan Bensin
Vroom vroom...

Mesin motor Honda Beat 110cc dinyalakan
Ngeng ngeng...
```

---

### Latihan 2: Abstract Class untuk Perhitungan

**Tujuan**: Menggunakan abstract class untuk operasi matematika

**Kode**:
```java
// File: Latihan02.java

abstract class BangunRuang {
    protected String nama;

    BangunRuang(String nama) {
        this.nama = nama;
    }

    // Abstract methods
    abstract double hitungVolume();
    abstract double hitungLuasPermukaan();

    // Concrete method
    void tampilkanInfo() {
        System.out.println("\n=== " + nama + " ===");
        System.out.println("Volume: " + hitungVolume());
        System.out.println("Luas Permukaan: " + hitungLuasPermukaan());
    }
}

class Balok extends BangunRuang {
    private double panjang, lebar, tinggi;

    Balok(double panjang, double lebar, double tinggi) {
        super("BALOK");
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    @Override
    double hitungLuasPermukaan() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
}

class Bola extends BangunRuang {
    private double jariJari;

    Bola(double jariJari) {
        super("BOLA");
        this.jariJari = jariJari;
    }

    @Override
    double hitungVolume() {
        return (4.0 / 3.0) * 3.14 * Math.pow(jariJari, 3);
    }

    @Override
    double hitungLuasPermukaan() {
        return 4 * 3.14 * Math.pow(jariJari, 2);
    }
}

class Tabung extends BangunRuang {
    private double jariJari, tinggi;

    Tabung(double jariJari, double tinggi) {
        super("TABUNG");
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    @Override
    double hitungVolume() {
        return 3.14 * Math.pow(jariJari, 2) * tinggi;
    }

    @Override
    double hitungLuasPermukaan() {
        return 2 * 3.14 * jariJari * (jariJari + tinggi);
    }
}

public class Latihan02 {
    public static void main(String[] args) {
        BangunRuang[] bangunRuang = new BangunRuang[3];
        bangunRuang[0] = new Balok(5, 3, 4);
        bangunRuang[1] = new Bola(7);
        bangunRuang[2] = new Tabung(5, 10);

        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║   KALKULATOR BANGUN RUANG         ║");
        System.out.println("╚════════════════════════════════════╝");

        for (BangunRuang br : bangunRuang) {
            br.tampilkanInfo();
        }

        // Hitung total volume
        double totalVolume = 0;
        for (BangunRuang br : bangunRuang) {
            totalVolume += br.hitungVolume();
        }
        System.out.println("\n════════════════════════════════════");
        System.out.println("Total Volume Semua Bangun: " + totalVolume);
        System.out.println("════════════════════════════════════");
    }
}
```

**Output yang Diharapkan**:
```
╔════════════════════════════════════╗
║   KALKULATOR BANGUN RUANG         ║
╚════════════════════════════════════╝

=== BALOK ===
Volume: 60.0
Luas Permukaan: 94.0

=== BOLA ===
Volume: 1436.0266666666669
Luas Permukaan: 615.44

=== TABUNG ===
Volume: 785.0
Luas Permukaan: 471.0

════════════════════════════════════
Total Volume Semua Bangun: 2281.0266666666666
════════════════════════════════════
```

---

## 🔴 LEVEL 2: Hierarki Kompleks

### Latihan 3: Sistem Manajemen Karyawan

**Tujuan**: Membuat hierarki class yang kompleks untuk sistem HR

**Kode**:
```java
// File: Latihan03.java
import java.util.ArrayList;
import java.util.Scanner;

abstract class Pegawai {
    protected String id;
    protected String nama;
    protected String departemen;

    Pegawai(String id, String nama, String departemen) {
        this.id = id;
        this.nama = nama;
        this.departemen = departemen;
    }

    // Abstract methods
    abstract double hitungGaji();
    abstract String getJabatan();

    // Concrete method
    void tampilkanInfo() {
        System.out.println("ID         : " + id);
        System.out.println("Nama       : " + nama);
        System.out.println("Jabatan    : " + getJabatan());
        System.out.println("Departemen : " + departemen);
        System.out.println("Gaji       : Rp " + hitungGaji());
    }
}

class Direktur extends Pegawai {
    private double gajiPokok;
    private double tunjanganJabatan;
    private double tunjanganPerumahan;

    Direktur(String id, String nama, String departemen, double gajiPokok) {
        super(id, nama, departemen);
        this.gajiPokok = gajiPokok;
        this.tunjanganJabatan = gajiPokok * 0.5;  // 50% dari gaji pokok
        this.tunjanganPerumahan = gajiPokok * 0.3; // 30% dari gaji pokok
    }

    @Override
    double hitungGaji() {
        return gajiPokok + tunjanganJabatan + tunjanganPerumahan;
    }

    @Override
    String getJabatan() {
        return "Direktur";
    }
}

class Manager extends Pegawai {
    private double gajiPokok;
    private double tunjanganJabatan;
    private double bonusKinerja;

    Manager(String id, String nama, String departemen, double gajiPokok, double bonusKinerja) {
        super(id, nama, departemen);
        this.gajiPokok = gajiPokok;
        this.tunjanganJabatan = gajiPokok * 0.3; // 30% dari gaji pokok
        this.bonusKinerja = bonusKinerja;
    }

    @Override
    double hitungGaji() {
        return gajiPokok + tunjanganJabatan + bonusKinerja;
    }

    @Override
    String getJabatan() {
        return "Manager";
    }
}

class Staff extends Pegawai {
    private double gajiPokok;
    private double tunjanganTransport;
    private double tunjanganMakan;

    Staff(String id, String nama, String departemen, double gajiPokok) {
        super(id, nama, departemen);
        this.gajiPokok = gajiPokok;
        this.tunjanganTransport = 500000;
        this.tunjanganMakan = 300000;
    }

    @Override
    double hitungGaji() {
        return gajiPokok + tunjanganTransport + tunjanganMakan;
    }

    @Override
    String getJabatan() {
        return "Staff";
    }
}

public class Latihan03 {
    public static void main(String[] args) {
        ArrayList<Pegawai> daftarPegawai = new ArrayList<>();

        // Menambahkan pegawai
        daftarPegawai.add(new Direktur("D001", "Budi Santoso", "Manajemen", 20000000));
        daftarPegawai.add(new Manager("M001", "Siti Nurhaliza", "IT", 10000000, 2000000));
        daftarPegawai.add(new Manager("M002", "Andi Wijaya", "Marketing", 9000000, 1500000));
        daftarPegawai.add(new Staff("S001", "Rina Kusuma", "IT", 5000000));
        daftarPegawai.add(new Staff("S002", "Dedi Prasetyo", "Marketing", 4500000));
        daftarPegawai.add(new Staff("S003", "Lina Marlina", "Finance", 4800000));

        System.out.println("╔══════════════════════════════════════════════════╗");
        System.out.println("║      SISTEM MANAJEMEN GAJI KARYAWAN            ║");
        System.out.println("╚══════════════════════════════════════════════════╝\n");

        // Tampilkan semua pegawai
        int no = 1;
        for (Pegawai p : daftarPegawai) {
            System.out.println("─────── Pegawai #" + no + " ───────");
            p.tampilkanInfo();
            System.out.println();
            no++;
        }

        // Statistik
        double totalGaji = 0;
        int jumlahDirektur = 0, jumlahManager = 0, jumlahStaff = 0;

        for (Pegawai p : daftarPegawai) {
            totalGaji += p.hitungGaji();

            if (p instanceof Direktur) jumlahDirektur++;
            else if (p instanceof Manager) jumlahManager++;
            else if (p instanceof Staff) jumlahStaff++;
        }

        System.out.println("╔══════════════════════════════════════════════════╗");
        System.out.println("║               STATISTIK PERUSAHAAN              ║");
        System.out.println("╚══════════════════════════════════════════════════╝");
        System.out.println("Total Pegawai    : " + daftarPegawai.size());
        System.out.println("  - Direktur     : " + jumlahDirektur);
        System.out.println("  - Manager      : " + jumlahManager);
        System.out.println("  - Staff        : " + jumlahStaff);
        System.out.println("──────────────────────────────────────────────────");
        System.out.println("Total Gaji/Bulan : Rp " + totalGaji);
        System.out.println("Rata-rata Gaji   : Rp " + (totalGaji / daftarPegawai.size()));
        System.out.println("══════════════════════════════════════════════════");
    }
}
```

**Output** (sebagian):
```
╔══════════════════════════════════════════════════╗
║      SISTEM MANAJEMEN GAJI KARYAWAN            ║
╚══════════════════════════════════════════════════╝

─────── Pegawai #1 ───────
ID         : D001
Nama       : Budi Santoso
Jabatan    : Direktur
Departemen : Manajemen
Gaji       : Rp 3.6E7

─────── Pegawai #2 ───────
ID         : M001
Nama       : Siti Nurhaliza
Jabatan    : Manager
Departemen : IT
Gaji       : Rp 1.5E7

[...]

╔══════════════════════════════════════════════════╗
║               STATISTIK PERUSAHAAN              ║
╚══════════════════════════════════════════════════╝
Total Pegawai    : 6
  - Direktur     : 1
  - Manager      : 2
  - Staff        : 3
──────────────────────────────────────────────────
Total Gaji/Bulan : Rp 8.17E7
Rata-rata Gaji   : Rp 1.3616666666666667E7
══════════════════════════════════════════════════
```

---

### Latihan 4: Sistem Inventori Toko

**Tujuan**: Aplikasi lengkap untuk manajemen produk dengan inheritance

**Kode**:
```java
// File: Latihan04.java
import java.util.ArrayList;
import java.util.Scanner;

abstract class Produk {
    protected String kode;
    protected String nama;
    protected double harga;
    protected int stok;

    Produk(String kode, String nama, double harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    abstract String getKategori();
    abstract double hitungDiskon();

    double getHargaSetelahDiskon() {
        return harga - hitungDiskon();
    }

    void tampilkanInfo() {
        System.out.println("Kode     : " + kode);
        System.out.println("Nama     : " + nama);
        System.out.println("Kategori : " + getKategori());
        System.out.println("Harga    : Rp " + harga);
        System.out.println("Diskon   : Rp " + hitungDiskon());
        System.out.println("Harga Nett: Rp " + getHargaSetelahDiskon());
        System.out.println("Stok     : " + stok + " unit");
    }

    boolean kurangiStok(int jumlah) {
        if (stok >= jumlah) {
            stok -= jumlah;
            return true;
        }
        return false;
    }
}

class Elektronik extends Produk {
    private int garansi; // dalam bulan

    Elektronik(String kode, String nama, double harga, int stok, int garansi) {
        super(kode, nama, harga, stok);
        this.garansi = garansi;
    }

    @Override
    String getKategori() {
        return "Elektronik";
    }

    @Override
    double hitungDiskon() {
        // Diskon 10% untuk elektronik
        return harga * 0.10;
    }

    @Override
    void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Garansi  : " + garansi + " bulan");
    }
}

class Pakaian extends Produk {
    private String ukuran;

    Pakaian(String kode, String nama, double harga, int stok, String ukuran) {
        super(kode, nama, harga, stok);
        this.ukuran = ukuran;
    }

    @Override
    String getKategori() {
        return "Pakaian";
    }

    @Override
    double hitungDiskon() {
        // Diskon 15% untuk pakaian
        return harga * 0.15;
    }

    @Override
    void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Ukuran   : " + ukuran);
    }
}

class Makanan extends Produk {
    private String tanggalKadaluarsa;

    Makanan(String kode, String nama, double harga, int stok, String tanggalKadaluarsa) {
        super(kode, nama, harga, stok);
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }

    @Override
    String getKategori() {
        return "Makanan";
    }

    @Override
    double hitungDiskon() {
        // Diskon 5% untuk makanan
        return harga * 0.05;
    }

    @Override
    void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Kadaluarsa: " + tanggalKadaluarsa);
    }
}

public class Latihan04 {
    static ArrayList<Produk> daftarProduk = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Data awal
        daftarProduk.add(new Elektronik("E001", "Laptop Asus", 7000000, 10, 24));
        daftarProduk.add(new Elektronik("E002", "HP Samsung", 3000000, 15, 12));
        daftarProduk.add(new Pakaian("P001", "Kaos Polos", 50000, 100, "L"));
        daftarProduk.add(new Pakaian("P002", "Celana Jeans", 150000, 50, "M"));
        daftarProduk.add(new Makanan("M001", "Biskuit", 15000, 200, "2025-12-31"));
        daftarProduk.add(new Makanan("M002", "Mie Instan", 3000, 500, "2025-11-30"));

        boolean running = true;
        while (running) {
            System.out.println("\n╔════════════════════════════════════════╗");
            System.out.println("║     SISTEM INVENTORI TOKO             ║");
            System.out.println("╚════════════════════════════════════════╝");
            System.out.println("1. Tampilkan Semua Produk");
            System.out.println("2. Cari Produk");
            System.out.println("3. Filter Berdasarkan Kategori");
            System.out.println("4. Laporan Stok");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");

            int pilihan = input.nextInt();
            input.nextLine(); // consume newline

            switch (pilihan) {
                case 1:
                    tampilkanSemuaProduk();
                    break;
                case 2:
                    cariProduk();
                    break;
                case 3:
                    filterKategori();
                    break;
                case 4:
                    laporanStok();
                    break;
                case 5:
                    running = false;
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    static void tampilkanSemuaProduk() {
        System.out.println("\n═══════════════════════════════════════");
        System.out.println("         DAFTAR SEMUA PRODUK");
        System.out.println("═══════════════════════════════════════");

        int no = 1;
        for (Produk p : daftarProduk) {
            System.out.println("\n─── Produk #" + no + " ───");
            p.tampilkanInfo();
            no++;
        }
    }

    static void cariProduk() {
        System.out.print("\nMasukkan kode produk: ");
        String kode = input.nextLine().toUpperCase();

        boolean ditemukan = false;
        for (Produk p : daftarProduk) {
            if (p.kode.equals(kode)) {
                System.out.println("\n═══ PRODUK DITEMUKAN ═══");
                p.tampilkanInfo();
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Produk dengan kode " + kode + " tidak ditemukan!");
        }
    }

    static void filterKategori() {
        System.out.println("\nPilih kategori:");
        System.out.println("1. Elektronik");
        System.out.println("2. Pakaian");
        System.out.println("3. Makanan");
        System.out.print("Pilihan: ");
        int pilihan = input.nextInt();
        input.nextLine();

        String kategori = "";
        switch (pilihan) {
            case 1: kategori = "Elektronik"; break;
            case 2: kategori = "Pakaian"; break;
            case 3: kategori = "Makanan"; break;
            default:
                System.out.println("Pilihan tidak valid!");
                return;
        }

        System.out.println("\n═══════════════════════════════════════");
        System.out.println("      PRODUK KATEGORI: " + kategori);
        System.out.println("═══════════════════════════════════════");

        int no = 1;
        boolean ada = false;
        for (Produk p : daftarProduk) {
            if (p.getKategori().equals(kategori)) {
                System.out.println("\n─── Produk #" + no + " ───");
                p.tampilkanInfo();
                no++;
                ada = true;
            }
        }

        if (!ada) {
            System.out.println("Tidak ada produk dalam kategori ini.");
        }
    }

    static void laporanStok() {
        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.println("║          LAPORAN STOK PRODUK          ║");
        System.out.println("╚════════════════════════════════════════╝");

        int totalProduk = daftarProduk.size();
        int totalStok = 0;
        double totalNilai = 0;

        int jumlahElektronik = 0, jumlahPakaian = 0, jumlahMakanan = 0;

        for (Produk p : daftarProduk) {
            totalStok += p.stok;
            totalNilai += (p.getHargaSetelahDiskon() * p.stok);

            if (p instanceof Elektronik) jumlahElektronik++;
            else if (p instanceof Pakaian) jumlahPakaian++;
            else if (p instanceof Makanan) jumlahMakanan++;
        }

        System.out.println("\nTotal Jenis Produk : " + totalProduk);
        System.out.println("  - Elektronik     : " + jumlahElektronik);
        System.out.println("  - Pakaian        : " + jumlahPakaian);
        System.out.println("  - Makanan        : " + jumlahMakanan);
        System.out.println("\nTotal Unit Stok    : " + totalStok + " unit");
        System.out.println("Total Nilai Stok   : Rp " + totalNilai);
        System.out.println("════════════════════════════════════════");
    }
}
```

**Fitur Aplikasi**:
- Menampilkan semua produk
- Mencari produk berdasarkan kode
- Filter produk berdasarkan kategori
- Laporan stok dan nilai inventori
- Diskon otomatis per kategori

---

## ✅ Checklist Penyelesaian

Centang setiap latihan yang sudah Anda selesaikan:

- [ ] Latihan 1: Abstract Class Pertama
- [ ] Latihan 2: Abstract Class untuk Perhitungan
- [ ] Latihan 3: Sistem Manajemen Karyawan
- [ ] Latihan 4: Sistem Inventori Toko

---

## 🎯 Rangkuman Konsep Menengah

Setelah menyelesaikan latihan menengah ini, Anda sudah memahami:

1. ✅ **Abstract Class** - Class yang tidak bisa diinstansiasi langsung
2. ✅ **Abstract Method** - Method tanpa implementasi yang harus di-override
3. ✅ **Concrete Method** - Method dengan implementasi di abstract class
4. ✅ **Keyword abstract** - Untuk mendeklarasikan abstract class dan method
5. ✅ **Polymorphism Tingkat Lanjut** - Array/ArrayList dengan tipe abstract class
6. ✅ **instanceof Checking** - Mengecek tipe object untuk casting
7. ✅ **Hierarki Kompleks** - Multi-level inheritance dengan abstract class
8. ✅ **Real-world Application** - Aplikasi lengkap dengan OOP design

---

## 💡 Perbedaan Abstract Class vs Class Biasa

| Aspek | Abstract Class | Class Biasa |
|-------|---------------|-------------|
| **Instansiasi** | ❌ Tidak bisa dibuat object | ✅ Bisa dibuat object |
| **Abstract Method** | ✅ Bisa punya | ❌ Tidak bisa punya |
| **Concrete Method** | ✅ Bisa punya | ✅ Bisa punya |
| **Keyword** | `abstract class` | `class` |
| **Tujuan** | Blueprint/Template | Implementasi lengkap |
| **Inheritance** | Harus di-extends | Bisa di-extends (optional) |

---

## 📚 Langkah Selanjutnya

Setelah menguasai latihan menengah ini, lanjutkan ke:
- **03_Aplikasi_Utama/SistemPerpustakaanDigital.java** - Aplikasi lengkap perpustakaan
- **TUWEB_4_GUI_Desktop** - Belajar membuat GUI untuk aplikasi OOP

Jika ada kesulitan, lihat:
- **04_Panduan_Tambahan/01_FAQ.md** - Pertanyaan yang sering ditanyakan
- **04_Panduan_Tambahan/02_Glossarium.md** - Istilah-istilah OOP

---

## 🎓 Challenge Bonus

Coba modifikasi Latihan 4 (Sistem Inventori Toko) dengan menambahkan:
1. Fitur transaksi penjualan
2. Fitur tambah produk baru
3. Fitur update stok
4. Export laporan ke file text

---

**Selamat Belajar! Anda sudah semakin mahir dalam OOP! 💻🚀**

*Tutorial Ke-3: Inheritance | STSI4201 Pemrograman Berbasis Desktop*
