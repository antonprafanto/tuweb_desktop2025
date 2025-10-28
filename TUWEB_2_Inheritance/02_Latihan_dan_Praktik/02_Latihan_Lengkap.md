# Latihan Soal Inheritance - Sistem Manajemen Kendaraan

## 📚 Soal-Soal Latihan

### 🟢 Level 1: Pemahaman Dasar

#### Soal 1: Membuat Class Sederhana
Buat class `Mahasiswa` dengan atribut dan method:

**Requirements:**
- Atribut: `nama` (String), `nim` (String), `ipk` (double)
- Constructor: parameter nama, nim, ipk
- Method: `info()` untuk menampilkan data mahasiswa
- Getter dan setter untuk semua atribut

**Expected Output:**
```java
Mahasiswa m1 = new Mahasiswa("Budi", "2021001", 3.75);
m1.info(); // Output: Nama: Budi, NIM: 2021001, IPK: 3.75
```

#### Soal 2: Inheritance Sederhana
Buat inheritance hierarchy untuk `Hewan` → `Kucing` dan `Anjing`:

**Requirements:**
- Parent class `Hewan` dengan atribut `nama` dan method `bersuara()`
- Child class `Kucing` override method `bersuara()` output "Meow!"
- Child class `Anjing` override method `bersuara()` output "Guk guk!"

#### Soal 3: Abstract Class
Buat abstract class `BangunDatar` dengan child classes:

**Requirements:**
- Abstract class `BangunDatar` dengan abstract method `hitungLuas()`
- Child class `Persegi` dengan method `hitungLuas()` = sisi × sisi
- Child class `Lingkaran` dengan method `hitungLuas()` = π × r²

### 🟡 Level 2: Aplikasi Kendaraan

#### Soal 4: Tambah Tipe Kendaraan
Tambahkan class `Truck` ke sistem kendaraan:

**Requirements:**
- Class `Truck` extends `Kendaraan`
- Atribut tambahan: `kapasitasMuatan` (int), `jumlahRoda` (int)
- Override method `info()` dengan informasi truck
- Method khusus: `muatBarang()` dan `bongkarMuatan()`

#### Soal 5: Interface Implementation
Buat interface `Maintenance` dan implement di class kendaraan:

**Requirements:**
- Interface `Maintenance` dengan methods: `service()`, `gantiOli()`, `cekMesin()`
- Implement interface di class `Mobil` dan `Motor`
- Setiap class implementasi method sesuai karakteristik

#### Soal 6: Polymorphism Collection
Buat program untuk mengelola berbagai jenis kendaraan:

**Requirements:**
- ArrayList untuk menyimpan berbagai jenis kendaraan
- Method untuk menambah kendaraan (Mobil, Motor, Truck)
- Method untuk menampilkan semua kendaraan dengan polymorphism
- Method untuk menghitung total kendaraan per jenis

### 🔴 Level 3: Fitur Tambahan

#### Soal 7: Multilevel Inheritance
Buat multilevel inheritance: `Kendaraan` → `Mobil` → `MobilSport`:

**Requirements:**
- Class `MobilSport` extends `Mobil`
- Atribut tambahan: `kecepatanMax`, `modeTurbo` (boolean)
- Override method `info()` dengan info sport
- Method `aktifkanTurbo()` dan `deaktifkanTurbo()`

#### Soal 8: Protected Access Modifier
Demonstrasikan penggunaan protected access modifier:

**Requirements:**
- Buat class dengan protected members
- Child class yang mengakses protected members
- External class yang mencoba mengakses protected members (harus error)
- Jelaskan perbedaan protected vs private vs public

#### Soal 9: Super Keyword Implementation
Buat class yang mendemonstrasikan penggunaan super keyword:

**Requirements:**
- Constructor chaining dengan `super()`
- Method overriding dengan `super.methodName()`
- Access parent fields dengan `super.fieldName`
- Buat contoh untuk setiap penggunaan

### 🟣 Level 4: Tantangan

#### Soal 10: Factory Pattern
Implementasi Factory Pattern untuk membuat kendaraan:

**Requirements:**
- Class `KendaraanFactory` dengan static method `buatKendaraan()`
- Method menerima parameter jenis kendaraan dan data
- Return object sesuai jenis (Mobil, Motor, Truck)
- Handle invalid jenis dengan exception

#### Soal 11: Object Serialization
Buat sistem untuk save/load data kendaraan:

**Requirements:**
- Implement `Serializable` interface
- Method untuk save ArrayList<Kendaraan> ke file
- Method untuk load data dari file
- Handle IOException dan ClassNotFoundException

#### Soal 12: Advanced Polymorphism
Buat sistem dengan complex inheritance dan polymorphism:

**Requirements:**
- Multiple level inheritance
- Interface implementation
- Abstract methods
- Dynamic method dispatch
- Type checking dan casting yang aman

## 💡 Petunjuk Pengerjaan

### 1. Setup Project
```java
import java.util.ArrayList;
import java.io.*;
```

### 2. Template Dasar
```java
// Parent class
public abstract class NamaParent {
    protected String atribut1;
    
    public NamaParent(String atribut1) {
        this.atribut1 = atribut1;
    }
    
    public abstract void methodAbstract();
    
    public void methodConcrete() {
        // implementation
    }
}

// Child class
public class NamaChild extends NamaParent {
    private String atribut2;
    
    public NamaChild(String atribut1, String atribut2) {
        super(atribut1);
        this.atribut2 = atribut2;
    }
    
    @Override
    public void methodAbstract() {
        // implementation
    }
}
```

### 3. Tips Mengerjakan
- Mulai dari class yang paling sederhana
- Test setiap class secara terpisah
- Gunakan `@Override` annotation
- Gunakan `super` keyword dengan benar
- Implementasi getter/setter untuk encapsulation
- Test polymorphism dengan ArrayList

## 🎯 Kriteria Penilaian

### ✅ Benar (100%)
- Program berjalan tanpa error
- Inheritance structure benar
- Method overriding tepat
- Encapsulation terimplementasi
- Code clean dan readable

### ⚠️ Hampir Benar (75%)
- Program berjalan dengan minor bugs
- Inheritance ada sedikit kesalahan
- Method overriding kurang tepat
- Encapsulation tidak sempurna

### ❌ Perlu Perbaikan (50%)
- Program error atau tidak berjalan
- Inheritance structure salah
- Tidak ada overriding
- Tidak ada encapsulation

## 🔑 Kunci Jawaban (Select Soal)

### Soal 1 - Class Mahasiswa
```java
public class Mahasiswa {
    private String nama;
    private String nim;
    private double ipk;
    
    public Mahasiswa(String nama, String nim, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
    }
    
    public void info() {
        System.out.println("Nama: " + nama + ", NIM: " + nim + ", IPK: " + ipk);
    }
    
    // Getters and Setters
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
    
    public String getNim() { return nim; }
    public void setNim(String nim) { this.nim = nim; }
    
    public double getIpk() { return ipk; }
    public void setIpk(double ipk) { this.ipk = ipk; }
}
```

### Soal 2 - Inheritance Hewan
```java
// Parent class
public abstract class Hewan {
    protected String nama;
    
    public Hewan(String nama) {
        this.nama = nama;
    }
    
    public abstract void bersuara();
}

// Child class 1
public class Kucing extends Hewan {
    public Kucing(String nama) {
        super(nama);
    }
    
    @Override
    public void bersuara() {
        System.out.println(nama + " mengatakan: Meow!");
    }
}

// Child class 2
public class Anjing extends Hewan {
    public Anjing(String nama) {
        super(nama);
    }
    
    @Override
    public void bersuara() {
        System.out.println(nama + " mengatakan: Guk guk!");
    }
}
```

### Soal 4 - Class Truck
```java
public class Truck extends Kendaraan {
    private int kapasitasMuatan;
    private int jumlahRoda;
    
    public Truck(String merk, int tahun, int kapasitasMuatan, int jumlahRoda) {
        super(merk, tahun);
        this.kapasitasMuatan = kapasitasMuatan;
        this.jumlahRoda = jumlahRoda;
    }
    
    @Override
    public void info() {
        System.out.println("Truck - Merk: " + merk + ", Tahun: " + tahun + 
                         ", Kapasitas: " + kapasitasMuatan + " ton, Roda: " + jumlahRoda);
    }
    
    public void muatBarang() {
        System.out.println("Memuat barang ke truck " + merk + 
                         " (kapasitas: " + kapasitasMuatan + " ton)");
    }
    
    public void bongkarMuatan() {
        System.out.println("Membongkar muatan dari truck " + merk);
    }
    
    // Getters and Setters
    public int getKapasitasMuatan() { return kapasitasMuatan; }
    public void setKapasitasMuatan(int kapasitasMuatan) { this.kapasitasMuatan = kapasitasMuatan; }
    
    public int getJumlahRoda() { return jumlahRoda; }
    public void setJumlahRoda(int jumlahRoda) { this.jumlahRoda = jumlahRoda; }
}
```

### Soal 10 - Factory Pattern
```java
public class KendaraanFactory {
    public static Kendaraan buatKendaraan(String jenis, String merk, int tahun, Object... params) {
        switch (jenis.toLowerCase()) {
            case "mobil":
                String model = (String) params[0];
                int jumlahPintu = (int) params[1];
                return new Mobil(merk, tahun, model, jumlahPintu);
                
            case "motor":
                String tipe = (String) params[0];
                String jenisMotor = (String) params[1];
                return new Motor(merk, tahun, tipe, jenisMotor);
                
            case "truck":
                int kapasitas = (int) params[0];
                int roda = (int) params[1];
                return new Truck(merk, tahun, kapasitas, roda);
                
            default:
                throw new IllegalArgumentException("Jenis kendaraan tidak valid: " + jenis);
        }
    }
}

// Penggunaan
public class TestFactory {
    public static void main(String[] args) {
        Kendaraan mobil = KendaraanFactory.buatKendaraan("mobil", "Toyota", 2020, "Avanza", 4);
        Kendaraan motor = KendaraanFactory.buatKendaraan("motor", "Honda", 2021, "CBR", "Sport");
        
        mobil.info();
        motor.info();
    }
}
```

## 🚀 Challenge Tambahan

### Challenge 1: Generic Class
Buat generic class `Container<T>` untuk menyimpan berbagai jenis kendaraan.

### Challenge 2: Observer Pattern
Implementasi Observer Pattern untuk notifikasi perubahan status kendaraan.

### Challenge 3: Database Integration
Simpan data kendaraan ke database (SQLite/MySQL) dengan JDBC.

### Challenge 4: GUI Application
Buat GUI untuk sistem manajemen kendaraan menggunakan JavaFX/Swing.

## 📞 Bantuan

Jika kesulitan:
1. Review materi konsep inheritance
2. Lihat contoh kode aplikasi kendaraan
3. Gunakan NetBeans code generation (Alt + Insert)
4. Debug step by step
5. Tanya teman atau dosen
6. Search di Stack Overflow

## ⏰ Waktu Pengerjaan

- Level 1: 45 menit
- Level 2: 60 menit  
- Level 3: 75 menit
- Level 4: 90 menit
- Challenge: 120+ menit

Selamat mengerjakan! 💪