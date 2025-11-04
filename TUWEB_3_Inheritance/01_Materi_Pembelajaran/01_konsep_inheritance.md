# Konsep Inheritance (Pewarisan)

## Tutorial Ke-3: Pemrograman Berbasis Desktop
**Mata Kuliah**: STSI4201 - Pemrograman Berbasis Desktop
**Program Studi**: Sistem Informasi
**Universitas Terbuka**

---

## 🎯 Capaian Pembelajaran

Setelah mempelajari materi ini, mahasiswa diharapkan mampu:
1. Memahami konsep inheritance (pewarisan) dalam OOP
2. Membuat hierarki class dengan relasi parent-child
3. Mengimplementasikan method overriding
4. Memahami dan menggunakan keyword `super` dan `extends`
5. Menerapkan konsep polymorphism sederhana
6. Memahami access modifier dalam konteks inheritance

---

## 📚 Pendahuluan

### Apa itu Inheritance?

**Inheritance** (pewarisan) adalah salah satu pilar utama dalam **Pemrograman Berorientasi Objek (OOP)**. Inheritance memungkinkan sebuah class mewarisi atribut dan method dari class lain.

### Analogi Dunia Nyata

Bayangkan hubungan dalam keluarga:
- **Orang Tua** memiliki sifat: tinggi, warna mata, bakat musik
- **Anak** mewarisi sifat-sifat dari orang tua

Atau dalam dunia kendaraan:
- **Kendaraan** (umum) → memiliki roda, mesin, bahan bakar
- **Mobil** (spesifik) → mewarisi dari Kendaraan + punya 4 roda
- **Motor** (spesifik) → mewarisi dari Kendaraan + punya 2 roda

```
         Kendaraan
         /        \
      Mobil      Motor
```

---

## 🔑 Konsep Dasar Inheritance

### Terminologi Penting

| Istilah | Penjelasan | Alias |
|---------|------------|-------|
| **Parent Class** | Class yang mewariskan | Superclass, Base Class |
| **Child Class** | Class yang mewarisi | Subclass, Derived Class |
| **extends** | Keyword untuk inheritance | - |
| **super** | Mengakses member parent class | - |
| **Override** | Menimpa method parent | - |

### Sintaks Dasar

```java
// Parent Class
class ParentClass {
    // atribut dan method
}

// Child Class mewarisi dari Parent
class ChildClass extends ParentClass {
    // atribut dan method tambahan
}
```

---

## 🌳 Hierarki Inheritance

### Contoh Sederhana: Hewan

```
        Hewan (Parent)
        /           \
    Kucing         Anjing
    (Child)       (Child)
```

**Implementasi:**

```java
// Parent Class
class Hewan {
    String nama;
    int umur;

    void makan() {
        System.out.println(nama + " sedang makan");
    }

    void tidur() {
        System.out.println(nama + " sedang tidur");
    }
}

// Child Class 1
class Kucing extends Hewan {
    void meong() {
        System.out.println(nama + " bersuara: Meong!");
    }
}

// Child Class 2
class Anjing extends Hewan {
    void gongong() {
        System.out.println(nama + " bersuara: Guk guk!");
    }
}

// Penggunaan
public class Main {
    public static void main(String[] args) {
        Kucing kucingku = new Kucing();
        kucingku.nama = "Kitty";
        kucingku.umur = 2;
        kucingku.makan();    // Method dari parent
        kucingku.meong();    // Method dari child

        Anjing anjingku = new Anjing();
        anjingku.nama = "Bobby";
        anjingku.umur = 3;
        anjingku.makan();    // Method dari parent
        anjingku.gongong();  // Method dari child
    }
}
```

**Output:**
```
Kitty sedang makan
Kitty bersuara: Meong!
Bobby sedang makan
Bobby bersuara: Guk guk!
```

### Penjelasan:
1. ✅ `Kucing` dan `Anjing` mewarisi atribut `nama` dan `umur` dari `Hewan`
2. ✅ `Kucing` dan `Anjing` mewarisi method `makan()` dan `tidur()` dari `Hewan`
3. ✅ `Kucing` punya method tambahan `meong()`
4. ✅ `Anjing` punya method tambahan `gongong()`

---

## 🏗️ Membangun Class dengan Inheritance

### Contoh Lengkap: Pegawai Perusahaan

```java
// Parent Class
class Pegawai {
    // Atribut
    protected String nama;
    protected String nip;
    protected double gajiPokok;

    // Constructor
    public Pegawai(String nama, String nip, double gajiPokok) {
        this.nama = nama;
        this.nip = nip;
        this.gajiPokok = gajiPokok;
    }

    // Method
    public void tampilkanInfo() {
        System.out.println("=== INFO PEGAWAI ===");
        System.out.println("Nama       : " + nama);
        System.out.println("NIP        : " + nip);
        System.out.println("Gaji Pokok : Rp " + gajiPokok);
    }

    public double hitungGaji() {
        return gajiPokok;
    }
}

// Child Class 1
class PegawaiTetap extends Pegawai {
    private double tunjangan;

    public PegawaiTetap(String nama, String nip, double gajiPokok, double tunjangan) {
        super(nama, nip, gajiPokok);  // Panggil constructor parent
        this.tunjangan = tunjangan;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + tunjangan;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();  // Panggil method parent
        System.out.println("Tunjangan  : Rp " + tunjangan);
        System.out.println("Total Gaji : Rp " + hitungGaji());
    }
}

// Child Class 2
class PegawaiKontrak extends Pegawai {
    private int jumlahProyek;
    private double bonusPerProyek;

    public PegawaiKontrak(String nama, String nip, double gajiPokok,
                          int jumlahProyek, double bonusPerProyek) {
        super(nama, nip, gajiPokok);
        this.jumlahProyek = jumlahProyek;
        this.bonusPerProyek = bonusPerProyek;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + (jumlahProyek * bonusPerProyek);
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Proyek : " + jumlahProyek);
        System.out.println("Bonus/Proyek  : Rp " + bonusPerProyek);
        System.out.println("Total Gaji    : Rp " + hitungGaji());
    }
}

// Main
public class Main {
    public static void main(String[] args) {
        PegawaiTetap pegawai1 = new PegawaiTetap("Andi", "P001", 5000000, 1500000);
        PegawaiKontrak pegawai2 = new PegawaiKontrak("Budi", "P002", 3000000, 5, 500000);

        pegawai1.tampilkanInfo();
        System.out.println();
        pegawai2.tampilkanInfo();
    }
}
```

**Output:**
```
=== INFO PEGAWAI ===
Nama       : Andi
NIP        : P001
Gaji Pokok : Rp 5000000.0
Tunjangan  : Rp 1500000.0
Total Gaji : Rp 6500000.0

=== INFO PEGAWAI ===
Nama       : Budi
NIP        : P002
Gaji Pokok : Rp 3000000.0
Jumlah Proyek : 5
Bonus/Proyek  : Rp 500000.0
Total Gaji    : Rp 5500000.0
```

---

## 🔧 Keyword SUPER

Keyword `super` digunakan untuk:
1. Memanggil **constructor parent class**
2. Mengakses **method parent class**
3. Mengakses **atribut parent class** (jika tidak private)

### 1. Super untuk Constructor

```java
class Parent {
    int nilai;

    public Parent(int nilai) {
        this.nilai = nilai;
    }
}

class Child extends Parent {
    String nama;

    public Child(int nilai, String nama) {
        super(nilai);  // Panggil constructor parent
        this.nama = nama;
    }
}
```

**Aturan Penting**:
- `super()` harus di baris **pertama** dalam constructor child
- Jika tidak explicit call `super()`, Java otomatis panggil `super()` tanpa parameter

### 2. Super untuk Method

```java
class Parent {
    void tampilkan() {
        System.out.println("Ini dari Parent");
    }
}

class Child extends Parent {
    @Override
    void tampilkan() {
        super.tampilkan();  // Panggil method parent
        System.out.println("Ini dari Child");
    }
}
```

---

## 🎭 Method Overriding

**Method Overriding** adalah mendefinisikan ulang method parent di child class dengan **signature yang sama**.

### Aturan Overriding:
1. ✅ Nama method harus **sama persis**
2. ✅ Parameter harus **sama persis** (tipe, jumlah, urutan)
3. ✅ Return type harus **sama** (atau covariant)
4. ✅ Access modifier **tidak boleh lebih restrictive**
5. ✅ Gunakan annotation `@Override` (recommended)

### Contoh:

```java
class Kendaraan {
    void berjalan() {
        System.out.println("Kendaraan berjalan");
    }

    int getMaksimalPenumpang() {
        return 0;
    }
}

class Mobil extends Kendaraan {
    @Override
    void berjalan() {
        System.out.println("Mobil berjalan di jalan raya");
    }

    @Override
    int getMaksimalPenumpang() {
        return 7;  // Mobil muat 7 penumpang
    }
}

class Motor extends Kendaraan {
    @Override
    void berjalan() {
        System.out.println("Motor berjalan lincah");
    }

    @Override
    int getMaksimalPenumpang() {
        return 2;  // Motor muat 2 penumpang
    }
}
```

---

## 🔐 Access Modifier dalam Inheritance

| Modifier | Class | Package | Subclass | World |
|----------|-------|---------|----------|-------|
| **public** | ✅ | ✅ | ✅ | ✅ |
| **protected** | ✅ | ✅ | ✅ | ❌ |
| **default** | ✅ | ✅ | ❌ | ❌ |
| **private** | ✅ | ❌ | ❌ | ❌ |

### Rekomendasi untuk Inheritance:
- Gunakan **protected** untuk atribut yang perlu diakses subclass
- Gunakan **private** + getter/setter untuk encapsulation
- Gunakan **public** untuk method yang bisa diakses semua

```java
class Parent {
    public String nama;        // Bisa diakses dimana saja
    protected int umur;        // Bisa diakses subclass
    private double gaji;       // Hanya di class ini

    // Getter untuk atribut private
    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
}

class Child extends Parent {
    void test() {
        System.out.println(nama);   // ✅ OK
        System.out.println(umur);   // ✅ OK
        // System.out.println(gaji); // ❌ ERROR - private
        System.out.println(getGaji()); // ✅ OK - via getter
    }
}
```

---

## 🎨 Polymorphism Dasar

**Polymorphism** = "banyak bentuk". Objek child bisa diperlakukan sebagai objek parent.

### Contoh:

```java
class Hewan {
    void bersuara() {
        System.out.println("Hewan bersuara");
    }
}

class Kucing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Meong!");
    }
}

class Anjing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Guk guk!");
    }
}

// Polymorphism in action
public class Main {
    public static void main(String[] args) {
        // Tipe parent, objek child
        Hewan hewan1 = new Kucing();
        Hewan hewan2 = new Anjing();

        hewan1.bersuara();  // Output: Meong!
        hewan2.bersuara();  // Output: Guk guk!

        // Array polymorphism
        Hewan[] kebunBinatang = {
            new Kucing(),
            new Anjing(),
            new Kucing()
        };

        for (Hewan h : kebunBinatang) {
            h.bersuara();
        }
    }
}
```

**Output:**
```
Meong!
Guk guk!
Meong!
Guk guk!
Meong!
```

---

## ✅ Keuntungan Inheritance

1. **Code Reusability** - Tidak perlu menulis ulang kode yang sama
2. **Hierarki yang Jelas** - Organisasi kode lebih baik
3. **Extensibility** - Mudah menambah fitur baru
4. **Polymorphism** - Fleksibilitas dalam pemrograman
5. **Maintenance** - Perubahan di parent otomatis berlaku ke semua child

## ⚠️ Hal yang Perlu Diperhatikan

1. **Java hanya support single inheritance** - 1 child hanya bisa extends 1 parent
2. **Constructor tidak diwariskan** - Harus explicit call dengan super()
3. **Private member tidak diwariskan** - Gunakan protected atau getter/setter
4. **Method overriding vs Overloading** - Jangan tertukar!

---

## 📝 Ringkasan

| Konsep | Penjelasan |
|--------|------------|
| **Inheritance** | Class child mewarisi atribut & method dari parent |
| **extends** | Keyword untuk inheritance |
| **super** | Mengakses member parent class |
| **@Override** | Annotation untuk override method |
| **Polymorphism** | Objek child bisa sebagai tipe parent |
| **protected** | Access modifier untuk inheritance |

---

## 🚀 Langkah Selanjutnya

1. **Latihan Dasar** - Praktik membuat hierarki class sederhana
2. **Latihan Menengah** - Studi kasus dengan inheritance
3. **Aplikasi Utama** - Sistem Perpustakaan Digital

---

**Selamat Belajar! 📚**

---

© 2025 Anton Prafanto, S.Kom, M.T. | Universitas Terbuka
