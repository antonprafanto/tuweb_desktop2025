# Latihan Dasar - Inheritance (Pewarisan)

**Tutorial Ke-3: Inheritance**
**Mata Kuliah**: Pemrograman Berbasis Desktop (STSI4201)
**Dosen**: Anton Prafanto, S.Kom, M.T.

---

## 🎯 Tujuan Latihan

Setelah menyelesaikan latihan ini, Anda diharapkan mampu:
1. Membuat class parent (superclass) dan class child (subclass)
2. Menggunakan keyword `extends` untuk inheritance
3. Menggunakan keyword `super` untuk memanggil constructor parent
4. Melakukan method overriding dengan `@Override`
5. Memahami access modifier (public, protected, private)
6. Menerapkan konsep polymorphism sederhana

---

## 📋 Petunjuk Pengerjaan

1. **Ketik kode sendiri** - Jangan copy-paste! Ini penting untuk memori otot
2. **Jalankan setiap latihan** - Pastikan tidak ada error
3. **Eksperimen** - Coba ubah-ubah nilai dan lihat hasilnya
4. **Baca error message** - Pesan error adalah guru terbaik
5. **Bertahap** - Kerjakan dari Latihan 1 sampai selesai secara berurutan

---

## 🟢 LEVEL 1: Inheritance Dasar

### Latihan 1: Class Parent dan Child Sederhana

**Tujuan**: Memahami konsep dasar inheritance

**Kode**:
```java
// File: Latihan01.java

class Manusia {
    String nama;
    int umur;

    void perkenalan() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
    }
}

class Mahasiswa extends Manusia {
    String nim;
    String jurusan;

    void tampilkanInfo() {
        perkenalan(); // Memanggil method dari parent
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
    }
}

public class Latihan01 {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.nama = "Budi Santoso";
        mhs.umur = 20;
        mhs.nim = "202301001";
        mhs.jurusan = "Informatika";

        System.out.println("=== Data Mahasiswa ===");
        mhs.tampilkanInfo();
    }
}
```

**Output yang Diharapkan**:
```
=== Data Mahasiswa ===
Nama: Budi Santoso
Umur: 20 tahun
NIM: 202301001
Jurusan: Informatika
```

**Tugas Eksplorasi**:
- Tambahkan atribut `alamat` di class Manusia
- Buat object Mahasiswa kedua dengan data berbeda

---

### Latihan 2: Constructor dengan Super

**Tujuan**: Memahami penggunaan `super()` untuk memanggil constructor parent

**Kode**:
```java
// File: Latihan02.java

class Kendaraan {
    String merk;
    int tahunProduksi;

    Kendaraan(String merk, int tahunProduksi) {
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
        System.out.println("Constructor Kendaraan dipanggil");
    }

    void infoKendaraan() {
        System.out.println("Merk: " + merk);
        System.out.println("Tahun: " + tahunProduksi);
    }
}

class Mobil extends Kendaraan {
    int jumlahPintu;
    String jenisBahanBakar;

    Mobil(String merk, int tahunProduksi, int jumlahPintu, String jenisBahanBakar) {
        super(merk, tahunProduksi); // Memanggil constructor parent
        this.jumlahPintu = jumlahPintu;
        this.jenisBahanBakar = jenisBahanBakar;
        System.out.println("Constructor Mobil dipanggil");
    }

    void infoLengkap() {
        infoKendaraan(); // Method dari parent
        System.out.println("Jumlah Pintu: " + jumlahPintu);
        System.out.println("Bahan Bakar: " + jenisBahanBakar);
    }
}

public class Latihan02 {
    public static void main(String[] args) {
        System.out.println("=== Membuat Object Mobil ===");
        Mobil mobil1 = new Mobil("Toyota Avanza", 2023, 5, "Bensin");

        System.out.println("\n=== Informasi Mobil ===");
        mobil1.infoLengkap();
    }
}
```

**Output yang Diharapkan**:
```
=== Membuat Object Mobil ===
Constructor Kendaraan dipanggil
Constructor Mobil dipanggil

=== Informasi Mobil ===
Merk: Toyota Avanza
Tahun: 2023
Jumlah Pintu: 5
Bahan Bakar: Bensin
```

**Tugas Eksplorasi**:
- Buat class `Motor` yang juga extends `Kendaraan`
- Tambahkan atribut `jenisMotor` (sport/matic/bebek)

---

### Latihan 3: Access Modifier (Public, Protected, Private)

**Tujuan**: Memahami perbedaan access modifier

**Kode**:
```java
// File: Latihan03.java

class BankAccount {
    public String nomorRekening;
    protected String namaPemilik;
    private double saldo;

    public BankAccount(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    // Getter untuk saldo (karena private)
    public double getSaldo() {
        return saldo;
    }

    // Method untuk menambah saldo
    protected void tambahSaldo(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Saldo berhasil ditambah: Rp " + jumlah);
        }
    }

    public void tampilkanInfo() {
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: Rp " + saldo);
    }
}

class SavingsAccount extends BankAccount {
    private double bungaTahunan;

    public SavingsAccount(String nomorRekening, String namaPemilik, double saldo, double bungaTahunan) {
        super(nomorRekening, namaPemilik, saldo);
        this.bungaTahunan = bungaTahunan;
    }

    public void hitungBunga() {
        double bunga = getSaldo() * bungaTahunan / 100;
        System.out.println("\nBunga yang didapat: Rp " + bunga);
        tambahSaldo(bunga); // Bisa akses karena protected
    }

    public void infoTabungan() {
        tampilkanInfo();
        System.out.println("Bunga Tahunan: " + bungaTahunan + "%");
    }
}

public class Latihan03 {
    public static void main(String[] args) {
        SavingsAccount tabungan = new SavingsAccount("1234567890", "Siti Aminah", 5000000, 5.0);

        System.out.println("=== Info Tabungan Awal ===");
        tabungan.infoTabungan();

        System.out.println("\n=== Hitung Bunga ===");
        tabungan.hitungBunga();

        System.out.println("\n=== Info Tabungan Setelah Bunga ===");
        tabungan.infoTabungan();
    }
}
```

**Output yang Diharapkan**:
```
=== Info Tabungan Awal ===
Nomor Rekening: 1234567890
Nama Pemilik: Siti Aminah
Saldo: Rp 5000000.0
Bunga Tahunan: 5.0%

=== Hitung Bunga ===
Bunga yang didapat: Rp 250000.0
Saldo berhasil ditambah: Rp 250000.0

=== Info Tabungan Setelah Bunga ===
Nomor Rekening: 1234567890
Nama Pemilik: Siti Aminah
Saldo: Rp 5250000.0
Bunga Tahunan: 5.0%
```

**Catatan Penting**:
- `public`: Bisa diakses dari mana saja
- `protected`: Bisa diakses oleh child class
- `private`: Hanya bisa diakses di class itu sendiri

---

## 🟡 LEVEL 2: Method Overriding

### Latihan 4: Override Method Sederhana

**Tujuan**: Memahami konsep method overriding

**Kode**:
```java
// File: Latihan04.java

class Hewan {
    String nama;

    Hewan(String nama) {
        this.nama = nama;
    }

    void bersuara() {
        System.out.println(nama + " mengeluarkan suara");
    }

    void info() {
        System.out.println("Ini adalah " + nama);
    }
}

class Kucing extends Hewan {
    Kucing(String nama) {
        super(nama);
    }

    @Override
    void bersuara() {
        System.out.println(nama + " bersuara: Meowww~");
    }
}

class Anjing extends Hewan {
    Anjing(String nama) {
        super(nama);
    }

    @Override
    void bersuara() {
        System.out.println(nama + " bersuara: Guk guk!");
    }
}

class Burung extends Hewan {
    Burung(String nama) {
        super(nama);
    }

    @Override
    void bersuara() {
        System.out.println(nama + " bersuara: Cuit cuit!");
    }
}

public class Latihan04 {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Kitty");
        Anjing anjing = new Anjing("Doggy");
        Burung burung = new Burung("Tweety");

        System.out.println("=== Suara Hewan ===");
        kucing.info();
        kucing.bersuara();

        System.out.println();
        anjing.info();
        anjing.bersuara();

        System.out.println();
        burung.info();
        burung.bersuara();
    }
}
```

**Output yang Diharapkan**:
```
=== Suara Hewan ===
Ini adalah Kitty
Kitty bersuara: Meowww~

Ini adalah Doggy
Doggy bersuara: Guk guk!

Ini adalah Tweety
Tweety bersuara: Cuit cuit!
```

**Tugas Eksplorasi**:
- Tambahkan class `Sapi` dengan suara "Mooo~"
- Tambahkan method `bergerak()` dan override di setiap child class

---

### Latihan 5: Override dengan Super

**Tujuan**: Menggunakan `super` untuk memanggil method parent dalam override

**Kode**:
```java
// File: Latihan05.java

class Pegawai {
    String nama;
    double gajiPokok;

    Pegawai(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    double hitungGaji() {
        return gajiPokok;
    }

    void tampilkanGaji() {
        System.out.println("Nama: " + nama);
        System.out.println("Gaji: Rp " + hitungGaji());
    }
}

class Manager extends Pegawai {
    double tunjangan;

    Manager(String nama, double gajiPokok, double tunjangan) {
        super(nama, gajiPokok);
        this.tunjangan = tunjangan;
    }

    @Override
    double hitungGaji() {
        double gajiDasar = super.hitungGaji(); // Memanggil method parent
        return gajiDasar + tunjangan;
    }

    @Override
    void tampilkanGaji() {
        System.out.println("=== Data Manager ===");
        super.tampilkanGaji(); // Memanggil method parent
        System.out.println("Tunjangan: Rp " + tunjangan);
        System.out.println("Total Gaji: Rp " + hitungGaji());
    }
}

class Staff extends Pegawai {
    double bonus;

    Staff(String nama, double gajiPokok, double bonus) {
        super(nama, gajiPokok);
        this.bonus = bonus;
    }

    @Override
    double hitungGaji() {
        return super.hitungGaji() + bonus;
    }

    @Override
    void tampilkanGaji() {
        System.out.println("=== Data Staff ===");
        super.tampilkanGaji();
        System.out.println("Bonus: Rp " + bonus);
        System.out.println("Total Gaji: Rp " + hitungGaji());
    }
}

public class Latihan05 {
    public static void main(String[] args) {
        Manager manager = new Manager("Andi Wijaya", 10000000, 3000000);
        Staff staff = new Staff("Rina Susanti", 5000000, 1000000);

        manager.tampilkanGaji();
        System.out.println();
        staff.tampilkanGaji();
    }
}
```

**Output yang Diharapkan**:
```
=== Data Manager ===
Nama: Andi Wijaya
Gaji: Rp 1.0E7
Tunjangan: Rp 3000000.0
Total Gaji: Rp 1.3E7

=== Data Staff ===
Nama: Rina Susanti
Gaji: Rp 5000000.0
Bonus: Rp 1000000.0
Total Gaji: Rp 6000000.0
```

---

## 🟠 LEVEL 3: Polymorphism Dasar

### Latihan 6: Polymorphism dengan Array

**Tujuan**: Memahami polymorphism - satu interface, banyak implementasi

**Kode**:
```java
// File: Latihan06.java

class BangunDatar {
    String nama;

    BangunDatar(String nama) {
        this.nama = nama;
    }

    double hitungLuas() {
        return 0;
    }

    void tampilkanInfo() {
        System.out.println("Bangun: " + nama);
        System.out.println("Luas: " + hitungLuas());
    }
}

class PersegiPanjang extends BangunDatar {
    double panjang;
    double lebar;

    PersegiPanjang(double panjang, double lebar) {
        super("Persegi Panjang");
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    double hitungLuas() {
        return panjang * lebar;
    }
}

class Lingkaran extends BangunDatar {
    double jariJari;

    Lingkaran(double jariJari) {
        super("Lingkaran");
        this.jariJari = jariJari;
    }

    @Override
    double hitungLuas() {
        return 3.14 * jariJari * jariJari;
    }
}

class Segitiga extends BangunDatar {
    double alas;
    double tinggi;

    Segitiga(double alas, double tinggi) {
        super("Segitiga");
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    double hitungLuas() {
        return 0.5 * alas * tinggi;
    }
}

public class Latihan06 {
    public static void main(String[] args) {
        // Array polymorphic - semua bertipe BangunDatar
        BangunDatar[] bangunDatar = new BangunDatar[3];
        bangunDatar[0] = new PersegiPanjang(10, 5);
        bangunDatar[1] = new Lingkaran(7);
        bangunDatar[2] = new Segitiga(8, 6);

        System.out.println("=== Menghitung Luas Berbagai Bangun Datar ===\n");

        for (int i = 0; i < bangunDatar.length; i++) {
            System.out.println((i + 1) + ". ");
            bangunDatar[i].tampilkanInfo();
            System.out.println();
        }

        // Hitung total luas
        double totalLuas = 0;
        for (BangunDatar bd : bangunDatar) {
            totalLuas += bd.hitungLuas();
        }
        System.out.println("Total Luas Semua Bangun: " + totalLuas);
    }
}
```

**Output yang Diharapkan**:
```
=== Menghitung Luas Berbagai Bangun Datar ===

1.
Bangun: Persegi Panjang
Luas: 50.0

2.
Bangun: Lingkaran
Luas: 153.86

3.
Bangun: Segitiga
Luas: 24.0

Total Luas Semua Bangun: 227.86
```

**Catatan Penting**: Ini adalah **polymorphism** - array bertipe parent (BangunDatar) bisa menyimpan object child (PersegiPanjang, Lingkaran, Segitiga).

---

### Latihan 7: instanceof Operator

**Tujuan**: Mengecek tipe object dengan `instanceof`

**Kode**:
```java
// File: Latihan07.java

class Produk {
    String kode;
    String nama;
    double harga;

    Produk(String kode, String nama, double harga) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
    }

    void tampilkanInfo() {
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("Harga: Rp " + harga);
    }
}

class Elektronik extends Produk {
    int garansi; // dalam bulan

    Elektronik(String kode, String nama, double harga, int garansi) {
        super(kode, nama, harga);
        this.garansi = garansi;
    }

    void tampilkanGaransi() {
        System.out.println("Garansi: " + garansi + " bulan");
    }
}

class Makanan extends Produk {
    String tanggalKadaluarsa;

    Makanan(String kode, String nama, double harga, String tanggalKadaluarsa) {
        super(kode, nama, harga);
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }

    void cekKadaluarsa() {
        System.out.println("Kadaluarsa: " + tanggalKadaluarsa);
    }
}

public class Latihan07 {
    public static void main(String[] args) {
        Produk[] daftarProduk = new Produk[3];
        daftarProduk[0] = new Elektronik("E001", "Laptop", 7000000, 12);
        daftarProduk[1] = new Makanan("M001", "Susu", 15000, "2025-12-31");
        daftarProduk[2] = new Elektronik("E002", "HP", 3000000, 24);

        System.out.println("=== Daftar Produk ===\n");

        for (int i = 0; i < daftarProduk.length; i++) {
            System.out.println("Produk " + (i + 1) + ":");
            daftarProduk[i].tampilkanInfo();

            // Cek tipe produk dengan instanceof
            if (daftarProduk[i] instanceof Elektronik) {
                Elektronik e = (Elektronik) daftarProduk[i]; // Casting
                e.tampilkanGaransi();
            } else if (daftarProduk[i] instanceof Makanan) {
                Makanan m = (Makanan) daftarProduk[i]; // Casting
                m.cekKadaluarsa();
            }

            System.out.println();
        }
    }
}
```

**Output yang Diharapkan**:
```
=== Daftar Produk ===

Produk 1:
Kode: E001
Nama: Laptop
Harga: Rp 7000000.0
Garansi: 12 bulan

Produk 2:
Kode: M001
Nama: Susu
Harga: Rp 15000.0
Kadaluarsa: 2025-12-31

Produk 3:
Kode: E002
Nama: HP
Harga: Rp 3000000.0
Garansi: 24 bulan
```

---

## 🔴 LEVEL 4: Latihan Kompleks

### Latihan 8: Hierarki Multi-Level

**Tujuan**: Membuat inheritance bertingkat (multi-level)

**Kode**:
```java
// File: Latihan08.java

class MakhlukHidup {
    boolean bernapas = true;

    void bernafas() {
        System.out.println("Makhluk hidup bernafas");
    }
}

class Hewan extends MakhlukHidup {
    void bergerak() {
        System.out.println("Hewan bergerak");
    }
}

class Mamalia extends Hewan {
    void menyusui() {
        System.out.println("Mamalia menyusui anaknya");
    }
}

class Manusia extends Mamalia {
    String nama;

    Manusia(String nama) {
        this.nama = nama;
    }

    void berpikir() {
        System.out.println(nama + " sedang berpikir");
    }

    void tampilkanKemampuan() {
        System.out.println("=== Kemampuan " + nama + " ===");
        bernafas();      // Dari MakhlukHidup
        bergerak();      // Dari Hewan
        menyusui();      // Dari Mamalia
        berpikir();      // Dari Manusia
    }
}

public class Latihan08 {
    public static void main(String[] args) {
        Manusia manusia = new Manusia("Budi");
        manusia.tampilkanKemampuan();

        System.out.println("\nCek hierarki dengan instanceof:");
        System.out.println("Manusia instanceof Mamalia: " + (manusia instanceof Mamalia));
        System.out.println("Manusia instanceof Hewan: " + (manusia instanceof Hewan));
        System.out.println("Manusia instanceof MakhlukHidup: " + (manusia instanceof MakhlukHidup));
    }
}
```

**Output yang Diharapkan**:
```
=== Kemampuan Budi ===
Makhluk hidup bernafas
Hewan bergerak
Mamalia menyusui anaknya
Budi sedang berpikir

Cek hierarki dengan instanceof:
Manusia instanceof Mamalia: true
Manusia instanceof Hewan: true
Manusia instanceof MakhlukHidup: true
```

---

### Latihan 9: Kalkulator Gaji Karyawan

**Tujuan**: Aplikasi lengkap menggunakan inheritance

**Kode**:
```java
// File: Latihan09.java
import java.util.Scanner;

class Karyawan {
    protected String nik;
    protected String nama;
    protected double gajiPokok;

    Karyawan(String nik, String nama, double gajiPokok) {
        this.nik = nik;
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    double hitungGajiTotal() {
        return gajiPokok;
    }

    void tampilkanDetail() {
        System.out.println("\n==================================");
        System.out.println("NIK            : " + nik);
        System.out.println("Nama           : " + nama);
        System.out.println("Gaji Pokok     : Rp " + gajiPokok);
    }
}

class KaryawanTetap extends Karyawan {
    private double tunjanganTransport;
    private double tunjanganMakan;

    KaryawanTetap(String nik, String nama, double gajiPokok, double tunjanganTransport, double tunjanganMakan) {
        super(nik, nama, gajiPokok);
        this.tunjanganTransport = tunjanganTransport;
        this.tunjanganMakan = tunjanganMakan;
    }

    @Override
    double hitungGajiTotal() {
        return gajiPokok + tunjanganTransport + tunjanganMakan;
    }

    @Override
    void tampilkanDetail() {
        super.tampilkanDetail();
        System.out.println("Tunjangan Transport: Rp " + tunjanganTransport);
        System.out.println("Tunjangan Makan: Rp " + tunjanganMakan);
        System.out.println("----------------------------------");
        System.out.println("TOTAL GAJI     : Rp " + hitungGajiTotal());
        System.out.println("==================================");
    }
}

class KaryawanKontrak extends Karyawan {
    private int lamaKontrak; // dalam bulan
    private double bonusProyek;

    KaryawanKontrak(String nik, String nama, double gajiPokok, int lamaKontrak, double bonusProyek) {
        super(nik, nama, gajiPokok);
        this.lamaKontrak = lamaKontrak;
        this.bonusProyek = bonusProyek;
    }

    @Override
    double hitungGajiTotal() {
        return gajiPokok + bonusProyek;
    }

    @Override
    void tampilkanDetail() {
        super.tampilkanDetail();
        System.out.println("Lama Kontrak   : " + lamaKontrak + " bulan");
        System.out.println("Bonus Proyek   : Rp " + bonusProyek);
        System.out.println("----------------------------------");
        System.out.println("TOTAL GAJI     : Rp " + hitungGajiTotal());
        System.out.println("==================================");
    }
}

public class Latihan09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║   SISTEM KALKULATOR GAJI KARYAWAN     ║");
        System.out.println("╚════════════════════════════════════════╝");

        System.out.print("\nPilih jenis karyawan (1=Tetap, 2=Kontrak): ");
        int pilihan = input.nextInt();
        input.nextLine(); // consume newline

        System.out.print("NIK: ");
        String nik = input.nextLine();

        System.out.print("Nama: ");
        String nama = input.nextLine();

        System.out.print("Gaji Pokok: Rp ");
        double gajiPokok = input.nextDouble();

        Karyawan karyawan;

        if (pilihan == 1) {
            System.out.print("Tunjangan Transport: Rp ");
            double transport = input.nextDouble();

            System.out.print("Tunjangan Makan: Rp ");
            double makan = input.nextDouble();

            karyawan = new KaryawanTetap(nik, nama, gajiPokok, transport, makan);
        } else {
            System.out.print("Lama Kontrak (bulan): ");
            int lamaKontrak = input.nextInt();

            System.out.print("Bonus Proyek: Rp ");
            double bonus = input.nextDouble();

            karyawan = new KaryawanKontrak(nik, nama, gajiPokok, lamaKontrak, bonus);
        }

        System.out.println("\n\n╔════════════════════════════════════════╗");
        System.out.println("║        SLIP GAJI KARYAWAN             ║");
        System.out.println("╚════════════════════════════════════════╝");
        karyawan.tampilkanDetail();

        input.close();
    }
}
```

**Contoh Output**:
```
╔════════════════════════════════════════╗
║   SISTEM KALKULATOR GAJI KARYAWAN     ║
╚════════════════════════════════════════╝

Pilih jenis karyawan (1=Tetap, 2=Kontrak): 1
NIK: K001
Nama: Andi Prasetyo
Gaji Pokok: Rp 5000000
Tunjangan Transport: Rp 500000
Tunjangan Makan: Rp 300000


╔════════════════════════════════════════╗
║        SLIP GAJI KARYAWAN             ║
╚════════════════════════════════════════╝

==================================
NIK            : K001
Nama           : Andi Prasetyo
Gaji Pokok     : Rp 5000000.0
Tunjangan Transport: Rp 500000.0
Tunjangan Makan: Rp 300000.0
----------------------------------
TOTAL GAJI     : Rp 5800000.0
==================================
```

---

### Latihan 10: Mini Project - Sistem Nilai Mahasiswa

**Tujuan**: Membuat aplikasi lengkap dengan inheritance

**Kode**:
```java
// File: Latihan10.java
import java.util.Scanner;

class Mahasiswa {
    protected String nim;
    protected String nama;
    protected String jurusan;

    Mahasiswa(String nim, String nama, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
    }

    void tampilkanInfo() {
        System.out.println("NIM     : " + nim);
        System.out.println("Nama    : " + nama);
        System.out.println("Jurusan : " + jurusan);
    }
}

class MahasiswaAktif extends Mahasiswa {
    private double nilaiUTS;
    private double nilaiUAS;
    private double nilaiTugas;

    MahasiswaAktif(String nim, String nama, String jurusan) {
        super(nim, nama, jurusan);
    }

    void inputNilai(double uts, double uas, double tugas) {
        this.nilaiUTS = uts;
        this.nilaiUAS = uas;
        this.nilaiTugas = tugas;
    }

    double hitungNilaiAkhir() {
        return (nilaiUTS * 0.35) + (nilaiUAS * 0.40) + (nilaiTugas * 0.25);
    }

    String tentukanGrade() {
        double nilaiAkhir = hitungNilaiAkhir();
        if (nilaiAkhir >= 85) return "A";
        else if (nilaiAkhir >= 70) return "B";
        else if (nilaiAkhir >= 60) return "C";
        else if (nilaiAkhir >= 50) return "D";
        else return "E";
    }

    String statusKelulusan() {
        String grade = tentukanGrade();
        if (grade.equals("E") || grade.equals("D")) {
            return "TIDAK LULUS";
        } else {
            return "LULUS";
        }
    }

    void tampilkanLaporan() {
        System.out.println("\n╔═════════════════════════════════════════════╗");
        System.out.println("║          LAPORAN NILAI MAHASISWA           ║");
        System.out.println("╚═════════════════════════════════════════════╝");
        tampilkanInfo();
        System.out.println("─────────────────────────────────────────────");
        System.out.println("Nilai UTS   : " + nilaiUTS);
        System.out.println("Nilai UAS   : " + nilaiUAS);
        System.out.println("Nilai Tugas : " + nilaiTugas);
        System.out.println("─────────────────────────────────────────────");
        System.out.println("Nilai Akhir : " + String.format("%.2f", hitungNilaiAkhir()));
        System.out.println("Grade       : " + tentukanGrade());
        System.out.println("Status      : " + statusKelulusan());
        System.out.println("═════════════════════════════════════════════");
    }
}

public class Latihan10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("╔═════════════════════════════════════════════╗");
        System.out.println("║      SISTEM PENILAIAN MAHASISWA            ║");
        System.out.println("╚═════════════════════════════════════════════╝\n");

        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Jurusan: ");
        String jurusan = input.nextLine();

        MahasiswaAktif mhs = new MahasiswaAktif(nim, nama, jurusan);

        System.out.println("\n--- Input Nilai ---");
        System.out.print("Nilai UTS (0-100): ");
        double uts = input.nextDouble();

        System.out.print("Nilai UAS (0-100): ");
        double uas = input.nextDouble();

        System.out.print("Nilai Tugas (0-100): ");
        double tugas = input.nextDouble();

        mhs.inputNilai(uts, uas, tugas);
        mhs.tampilkanLaporan();

        input.close();
    }
}
```

**Contoh Output**:
```
╔═════════════════════════════════════════════╗
║      SISTEM PENILAIAN MAHASISWA            ║
╚═════════════════════════════════════════════╝

Masukkan NIM: 202301001
Masukkan Nama: Siti Nurhaliza
Masukkan Jurusan: Informatika

--- Input Nilai ---
Nilai UTS (0-100): 85
Nilai UAS (0-100): 90
Nilai Tugas (0-100): 88

╔═════════════════════════════════════════════╗
║          LAPORAN NILAI MAHASISWA           ║
╚═════════════════════════════════════════════╝
NIM     : 202301001
Nama    : Siti Nurhaliza
Jurusan : Informatika
─────────────────────────────────────────────
Nilai UTS   : 85.0
Nilai UAS   : 90.0
Nilai Tugas : 88.0
─────────────────────────────────────────────
Nilai Akhir : 87.75
Grade       : A
Status      : LULUS
═════════════════════════════════════════════
```

---

## ✅ Checklist Penyelesaian

Centang setiap latihan yang sudah Anda selesaikan:

- [ ] Latihan 1: Class Parent dan Child Sederhana
- [ ] Latihan 2: Constructor dengan Super
- [ ] Latihan 3: Access Modifier
- [ ] Latihan 4: Override Method Sederhana
- [ ] Latihan 5: Override dengan Super
- [ ] Latihan 6: Polymorphism dengan Array
- [ ] Latihan 7: instanceof Operator
- [ ] Latihan 8: Hierarki Multi-Level
- [ ] Latihan 9: Kalkulator Gaji Karyawan
- [ ] Latihan 10: Mini Project - Sistem Nilai Mahasiswa

---

## 🎯 Rangkuman Konsep

Setelah menyelesaikan latihan dasar ini, Anda sudah memahami:

1. ✅ **Inheritance** - Class child mewarisi atribut dan method dari class parent
2. ✅ **extends** - Keyword untuk membuat inheritance
3. ✅ **super()** - Memanggil constructor parent
4. ✅ **Access Modifier** - public, protected, private
5. ✅ **Method Overriding** - Child class mengubah implementasi method parent
6. ✅ **@Override** - Annotation untuk method yang di-override
7. ✅ **Polymorphism** - Satu interface, banyak implementasi
8. ✅ **instanceof** - Mengecek tipe object
9. ✅ **Casting** - Mengubah tipe object (downcasting)

---

## 📚 Langkah Selanjutnya

Setelah menguasai latihan dasar ini, lanjutkan ke:
- **02_Latihan_Menengah.md** - Latihan yang lebih kompleks dengan abstract class
- **03_Aplikasi_Utama** - Sistem Perpustakaan Digital lengkap

Jika ada kesulitan, lihat:
- **04_Panduan_Tambahan/01_FAQ.md** - Pertanyaan yang sering ditanyakan
- **04_Panduan_Tambahan/02_Glossarium.md** - Istilah-istilah OOP

---

**Selamat Belajar! Keep Coding! 💻🚀**

*Tutorial Ke-3: Inheritance | STSI4201 Pemrograman Berbasis Desktop*
