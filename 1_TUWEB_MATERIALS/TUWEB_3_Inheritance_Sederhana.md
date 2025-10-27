# TUWEB 3 - Aktivitas Belajar 10
# Pewarisan/Inheritance Sederhana

**Mata Kuliah**: STSI4201 - Pemrograman Berbasis Desktop  
**Tutor**: Anton Prafanto, S.Kom., M.T.  
**Metode**: Learning by Doing  
**Durasi**: 55-60 menit  
**Target**: Mahasiswa yang sudah bisa membuat class dengan method sederhana

---

## 1. PEMBUKAAN (3 menit)

Assalamu'alaikum warahmatullahi wabarakatuh. Salam sejahtera untuk kita semua.

Halo teman-teman! Selamat datang di TUWEB ke-3! Kita sudah sampai di pertengahan pembelajaran. Hebat! 🎉

### Perjalanan Kita Sejauh Ini

Sudah banyak yang kita pelajari:
- ✅ **TUWEB 1**: Hello World, Class, Object
- ✅ **TUWEB 2**: For Loop, While Loop, Perulangan
- ✅ **AB 7**: Array dan String
- ✅ **AB 8-9**: UML, Abstraction, Interface

**Sekarang kita akan belajar salah satu konsep paling penting di OOP: INHERITANCE!** 🌟

### Apa yang Akan Kita Pelajari Hari Ini?

Hari ini kita akan belajar **INHERITANCE** (Pewarisan).

**Analogi sederhana:**
- Anak **mewarisi** sifat dari orangtua
- Mahasiswa **mewarisi** sifat dari Orang (punya nama, alamat)
- Dosen **mewarisi** sifat dari Orang (punya nama, alamat)

**Dalam programming:**
- Class anak bisa **mewarisi** attribute dan method dari class orangtua!
- Tidak perlu nulis ulang kode yang sama berkali-kali!
- Lebih efisien, lebih rapi! 🚀

### Yang Perlu Dipersiapkan:

- ✅ NetBeans sudah terbuka
- ✅ Sudah paham Class dan Object (TUWEB 1)
- ✅ Sudah paham Method sederhana
- ✅ Semangat belajar! 💪

**Mari kita mulai!**

---

## 2. TUJUAN PEMBELAJARAN

Setelah mengikuti TUWEB ini, teman-teman akan **BISA**:

1. **Memahami konsep Inheritance** dengan analogi sederhana
   - Parent Class = Class Orangtua (Superclass)
   - Child Class = Class Anak (Subclass)

2. **Membuat Parent Class dan Child Class** menggunakan keyword `extends`
   - Contoh: `class Mahasiswa extends Orang`

3. **Menggunakan attribute dan method dari Parent Class** di Child Class
   - Child bisa pakai apa yang dimiliki Parent

4. **Override method** untuk memberikan implementasi khusus di Child Class
   - Child bisa modifikasi method yang diwarisi

**Fokus**: Paham konsep dan bisa praktik, bukan hafal teori! 👍

---

## 3. PERSIAPAN NETBEANS (3 menit)

### Buat Project Baru

**Langkah Cepat**:
1. File → New Project
2. Java with Ant → Java Application
3. **Project Name**: `InheritanceSederhana`
4. **Create Main Class**: ✅ Centang
5. Finish

**Siap praktik!** 😊

---

## 4. KONSEP SINGKAT: Kenapa Perlu Inheritance? (7 menit)

### Masalah: Kode yang Berulang-ulang

Bayangkan kita mau buat program untuk:
- **Mahasiswa**: punya nama, alamat, nim, jurusan
- **Dosen**: punya nama, alamat, nip, matakuliah
- **Staff**: punya nama, alamat, nip, bagian

**Kalau kita buat 3 class terpisah:**

```java
class Mahasiswa {
    String nama;     // Sama!
    String alamat;   // Sama!
    String nim;
    String jurusan;
}

class Dosen {
    String nama;     // Sama lagi!
    String alamat;   // Sama lagi!
    String nip;
    String matakuliah;
}

class Staff {
    String nama;     // Sama lagi!
    String alamat;   // Sama lagi!
    String nip;
    String bagian;
}
```

**Lihat masalahnya?** `nama` dan `alamat` ditulis 3 kali! 😩

**Tidak efisien!** Kalau mau ubah sesuatu di `nama`, harus ubah di 3 tempat!

### Solusi: Inheritance!

**Idenya:**
1. Buat class `Orang` yang punya attribute umum: `nama`, `alamat`
2. Mahasiswa, Dosen, Staff **MEWARISI** dari class Orang
3. Mereka otomatis punya `nama` dan `alamat`!
4. Tinggal tambahkan attribute khusus masing-masing!

**Dengan Inheritance:**

```java
class Orang {
    String nama;
    String alamat;
}

class Mahasiswa extends Orang {
    // Otomatis punya nama dan alamat dari Orang!
    String nim;
    String jurusan;
}

class Dosen extends Orang {
    // Otomatis punya nama dan alamat dari Orang!
    String nip;
    String matakuliah;
}
```

**Lebih ringkas, kan?!** 🌟

### Analogi Kehidupan Sehari-hari

**1. Keluarga** 👨‍👩‍👧‍👦
- Anak mewarisi sifat dari orangtua
- Anak punya warna mata, bentuk hidung, golongan darah yang sama dengan orangtua
- Tapi anak juga punya ciri khas sendiri!

**2. Kendaraan** 🚗🏍️
- Semua kendaraan punya: roda, mesin, bahan bakar
- Mobil punya: 4 roda + pintu + AC
- Motor punya: 2 roda + jok + helm
- Mobil dan Motor **mewarisi** sifat dasar kendaraan!

**3. Makhluk Hidup** 🌳🐶😊
- Semua makhluk hidup: makan, bernafas, berkembang biak
- Manusia mewarisi sifat makhluk hidup + bisa berpikir, berbicara
- Hewan mewarisi sifat makhluk hidup + bisa bergerak cepat
- Tumbuhan mewarisi sifat makhluk hidup + bisa fotosintesis

### Istilah Penting:

| Istilah | Nama Lain | Penjelasan |
|---------|-----------|------------|
| **Parent Class** | Superclass, Base Class | Class orangtua (yang diwarisi) |
| **Child Class** | Subclass, Derived Class | Class anak (yang mewarisi) |
| **extends** | - | Keyword untuk melakukan pewarisan |
| **Override** | - | Menimpa/mengganti method dari parent |

**Mudah dipahami kan?** Mari kita praktik! 🚀

---

## 5. PRAKTIK GUIDED - "AYO IKUTI SAYA!" (30 menit)

Sekarang saatnya hands-on! Ikuti dengan seksama ya! 👇

---

### 📝 PRAKTIK 1: Membuat Parent Class (Superclass)

**"Kita mulai dengan membuat class Orang sebagai parent class!"**

#### LANGKAH DEMI LANGKAH:

**Langkah 1**: Buka NetBeans dengan project `InheritanceSederhana`

**Langkah 2**: Buat Class Baru
- Klik kanan package `inheritancesederhana` di panel Projects
- **New** → **Java Class**
- **Class Name**: `Orang`
- **Finish**

**Langkah 3**: Bersihkan komentar dan ketik kode berikut:

```java
package inheritancesederhana;

public class Orang {
    // Attribute yang dimiliki semua orang
    public String nama;
    public String alamat;
    
    // Method untuk menampilkan data
    public void tampilData() {
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
    }
}
```

**PENJELASAN KODE:**

```java
public String nama;
public String alamat;
```
- **Penjelasan**: Attribute yang dimiliki semua orang
- `public` = bisa diakses dari class lain (termasuk child class)
- Ini adalah data yang **UMUM** dimiliki semua orang

```java
public void tampilData() {
    System.out.println("Nama: " + nama);
    System.out.println("Alamat: " + alamat);
}
```
- **Penjelasan**: Method untuk menampilkan data orang
- Method ini juga bisa diakses dan digunakan oleh child class!

**Parent Class sudah siap!** ✅

---

### 📝 PRAKTIK 2: Membuat Child Class dengan `extends`

**"Sekarang kita buat class Mahasiswa yang MEWARISI dari class Orang!"**

#### LANGKAH:

**Langkah 1**: Buat Class Baru
- Klik kanan package → New → Java Class
- **Class Name**: `Mahasiswa`
- Finish

**Langkah 2**: Ketik kode berikut:

```java
package inheritancesederhana;

public class Mahasiswa extends Orang {
    // Attribute khusus mahasiswa
    public String nim;
    public String jurusan;
}
```

**PERHATIKAN KATA KUNCI `extends`!** Ini yang membuat inheritance terjadi! ✨

**PENJELASAN KODE:**

```java
public class Mahasiswa extends Orang {
```
- **Penjelasan**: Class Mahasiswa **MEWARISI** dari class Orang
- `extends Orang` = "Mahasiswa adalah turunan dari Orang"
- Mahasiswa **OTOMATIS** punya attribute: `nama`, `alamat`
- Mahasiswa **OTOMATIS** punya method: `tampilData()`
- **Tanpa perlu nulis ulang!**

```java
public String nim;
public String jurusan;
```
- **Penjelasan**: Attribute **TAMBAHAN** khusus mahasiswa
- Total attribute Mahasiswa sekarang: `nama`, `alamat`, `nim`, `jurusan`

**Child Class sudah siap!** ✅

---

### 📝 PRAKTIK 3: Menggunakan Inheritance

**"Mari kita test apakah inheritance berfungsi!"**

#### LANGKAH:

**Langkah 1**: Buka file `InheritanceSederhana.java` (file main)

**Langkah 2**: Ubah method main menjadi:

```java
package inheritancesederhana;

public class InheritanceSederhana {

    public static void main(String[] args) {
        // Membuat object mahasiswa
        Mahasiswa mhs = new Mahasiswa();
        
        // Mengisi attribute dari PARENT class
        mhs.nama = "Budi Santoso";      // Dari class Orang
        mhs.alamat = "Jakarta";          // Dari class Orang
        
        // Mengisi attribute dari CHILD class
        mhs.nim = "123456";              // Dari class Mahasiswa
        mhs.jurusan = "Sistem Informasi"; // Dari class Mahasiswa
        
        // Menampilkan data
        System.out.println("=== Data Mahasiswa ===");
        System.out.println("Nama: " + mhs.nama);
        System.out.println("Alamat: " + mhs.alamat);
        System.out.println("NIM: " + mhs.nim);
        System.out.println("Jurusan: " + mhs.jurusan);
    }
    
}
```

**Langkah 3**: Jalankan! (F6)

**HASILNYA:**
```
=== Data Mahasiswa ===
Nama: Budi Santoso
Alamat: Jakarta
NIM: 123456
Jurusan: Sistem Informasi
```

**AMAZING! Mahasiswa bisa pakai `nama` dan `alamat` dari class Orang!** 🎉

**PENJELASAN:**

Meskipun di class `Mahasiswa` tidak ada attribute `nama` dan `alamat`, tapi karena **MEWARISI** dari `Orang`, mahasiswa otomatis punya attribute tersebut!

**Analogi:**
- Orang punya: nama, alamat
- Mahasiswa = Orang + nim + jurusan
- Jadi Mahasiswa punya: nama, alamat, nim, jurusan

**Keren, kan?!** 🌟

---

### 📝 PRAKTIK 4: Menggunakan Method dari Parent Class

**"Method dari parent class juga bisa dipakai lho!"**

#### UBAH CODE:

Ubah bagian menampilkan data menjadi:

```java
public static void main(String[] args) {
    // Membuat object mahasiswa
    Mahasiswa mhs = new Mahasiswa();
    
    // Mengisi data
    mhs.nama = "Budi Santoso";
    mhs.alamat = "Jakarta";
    mhs.nim = "123456";
    mhs.jurusan = "Sistem Informasi";
    
    // Menggunakan method dari PARENT class
    System.out.println("=== Data Mahasiswa ===");
    mhs.tampilData();  // Method dari class Orang!
    System.out.println("NIM: " + mhs.nim);
    System.out.println("Jurusan: " + mhs.jurusan);
}
```

**Jalankan!**

**HASILNYA:**
```
=== Data Mahasiswa ===
Nama: Budi Santoso
Alamat: Jakarta
NIM: 123456
Jurusan: Sistem Informasi
```

**Lihat?!** Method `tampilData()` dari class `Orang` bisa dipanggil di object `Mahasiswa`!

**Pewarisan itu mencakup:**
- ✅ Attribute dari parent
- ✅ Method dari parent
- ✅ Semuanya! (kecuali yang private)

---

### 📝 PRAKTIK 5: Override Method (Menimpa Method Parent)

**"Bagaimana kalau kita mau ubah method tampilData() khusus untuk Mahasiswa?"**

**Solusinya: OVERRIDE!**

#### LANGKAH:

**Langkah 1**: Buka file `Mahasiswa.java`

**Langkah 2**: Tambahkan method `tampilData()` di class Mahasiswa:

```java
package inheritancesederhana;

public class Mahasiswa extends Orang {
    // Attribute khusus mahasiswa
    public String nim;
    public String jurusan;
    
    // Override method dari parent
    @Override
    public void tampilData() {
        System.out.println("=== Data Mahasiswa ===");
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
    }
}
```

**PENJELASAN:**

```java
@Override
```
- **Penjelasan**: Annotation (penanda) bahwa method ini **MENIMPA** method dari parent
- Tidak wajib, tapi **best practice**!
- Membantu NetBeans mendeteksi error

```java
public void tampilData() {
    // Implementasi khusus untuk Mahasiswa
}
```
- **Penjelasan**: Method dengan nama dan signature yang SAMA seperti di parent
- Tapi isinya **BERBEDA** (ditimpa/override)
- Sekarang kalau `mhs.tampilData()` dipanggil, yang jalan versi Mahasiswa, bukan versi Orang!

#### TEST:

**Langkah 3**: Ubah method main menjadi:

```java
public static void main(String[] args) {
    // Membuat object mahasiswa
    Mahasiswa mhs = new Mahasiswa();
    
    // Mengisi data
    mhs.nama = "Budi Santoso";
    mhs.alamat = "Jakarta";
    mhs.nim = "123456";
    mhs.jurusan = "Sistem Informasi";
    
    // Panggil method tampilData()
    // Versi mana yang dipanggil? VERSI MAHASISWA!
    mhs.tampilData();
}
```

**Jalankan!**

**HASILNYA:**
```
=== Data Mahasiswa ===
Nama: Budi Santoso
Alamat: Jakarta
NIM: 123456
Jurusan: Sistem Informasi
```

**Perfect!** Sekarang `tampilData()` versi Mahasiswa yang dipanggil, bukan versi Orang!

**Analogi Override:**
- Parent punya resep masakan
- Child **mewarisi** resep tersebut
- Tapi child bisa **modifikasi** resepnya sesuai selera!

---

> **📝 CATATAN PENTING: Override vs Overload**
>
> Beberapa mahasiswa sering bingung antara Override dan Overload. Mari kita jelaskan perbedaannya:
>
> **OVERRIDE** (yang kita pelajari hari ini):
> - Method di **child class menimpa** method di parent class
> - Nama method **SAMA**
> - Parameter **SAMA**
> - Return type **SAMA**
> - Pakai annotation `@Override`
> - **Contoh**: Method `tampilData()` di class Mahasiswa menimpa `tampilData()` di class Orang
>
> **OVERLOAD** (akan dipelajari di materi advanced):
> - Method dengan nama **SAMA** tapi parameter **BERBEDA**
> - Dalam **satu class yang sama** (bukan parent-child)
> - Return type boleh berbeda
> - **Contoh**: 
>   ```java
>   public int hitungLuas(int sisi) { ... }              // untuk persegi
>   public int hitungLuas(int panjang, int lebar) { ... } // untuk persegi panjang
>   ```
>
> **Fokus dulu ke Override ya!** Override adalah konsep inheritance yang fundamental. Overload akan kita bahas nanti di materi advanced! 👍

---

### 📝 PRAKTIK 6: Membuat Child Class Kedua (Dosen)

**"Dari satu parent class, kita bisa buat banyak child class!"**

#### LANGKAH:

**Langkah 1**: Buat class `Dosen`
- Klik kanan package → New → Java Class
- **Class Name**: `Dosen`
- Finish

**Langkah 2**: Ketik kode:

```java
package inheritancesederhana;

public class Dosen extends Orang {
    // Attribute khusus dosen
    public String nip;
    public String matakuliah;
    
    // Override method tampilData
    @Override
    public void tampilData() {
        System.out.println("=== Data Dosen ===");
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("NIP: " + nip);
        System.out.println("Mata Kuliah: " + matakuliah);
    }
}
```

**Langkah 3**: Test di method main:

```java
public static void main(String[] args) {
    // Membuat object mahasiswa
    Mahasiswa mhs = new Mahasiswa();
    mhs.nama = "Budi Santoso";
    mhs.alamat = "Jakarta";
    mhs.nim = "123456";
    mhs.jurusan = "Sistem Informasi";
    
    // Membuat object dosen
    Dosen dosen = new Dosen();
    dosen.nama = "Dr. Anton Prafanto";
    dosen.alamat = "Bandung";
    dosen.nip = "198501012010";
    dosen.matakuliah = "Pemrograman Berbasis Desktop";
    
    // Tampilkan data keduanya
    mhs.tampilData();
    System.out.println();  // Baris kosong
    dosen.tampilData();
}
```

**Jalankan!**

**HASILNYA:**
```
=== Data Mahasiswa ===
Nama: Budi Santoso
Alamat: Jakarta
NIM: 123456
Jurusan: Sistem Informasi

=== Data Dosen ===
Nama: Dr. Anton Prafanto
Alamat: Bandung
NIP: 198501012010
Mata Kuliah: Pemrograman Berbasis Desktop
```

**LUAR BIASA!** 🎊

Dari **satu class Orang**, kita bisa buat:
- ✅ Class Mahasiswa
- ✅ Class Dosen
- ✅ Bisa buat class Staff, Karyawan, dll (unlimited!)

**Semua mewarisi** `nama` dan `alamat` dari Orang, tapi **masing-masing punya ciri khas**!

**Ini kekuatan Inheritance!** 💪

---

### 📝 PRAKTIK 7: Visualisasi Inheritance

**"Mari kita visualisasikan hubungan inheritance!"**

**Diagram:**

```
         ┌──────────┐
         │  Orang   │  ← Parent/Superclass
         │----------|
         │  nama    │
         │  alamat  │
         └────┬─────┘
              │
      ┌───────┴───────┐
      │               │
┌─────▼─────┐   ┌────▼──────┐
│ Mahasiswa │   │   Dosen   │  ← Child/Subclass
│-----------|   │-----------|
│  nim      │   │   nip     │
│  jurusan  │   │ matakuliah│
└───────────┘   └───────────┘
```

**Penjelasan Diagram:**
- Panah ke atas = `extends` (mewarisi dari)
- Mahasiswa dan Dosen **mewarisi** semua yang ada di Orang
- Mahasiswa dan Dosen **menambahkan** attribute sendiri

**Dalam kode:**
```java
Orang
  ├── Mahasiswa (Orang + nim + jurusan)
  └── Dosen (Orang + nip + matakuliah)
```

---

### 📝 PRAKTIK 8: Abstract Class & Method (PENTING UNTUK TUGAS 3!)

**"Sekarang kita belajar konsep yang SANGAT PENTING untuk Tugas 3: Abstract Class!"**

> **🎯 KONEKSI KE TUGAS 3**: Di Tugas 3 nanti, teman-teman akan diminta membuat `abstract class MenuItem` dengan method `abstract void tampilMenu()`. Mari kita pelajari konsepnya sekarang!

#### APA ITU ABSTRACT CLASS?

**Abstract Class** adalah class yang **tidak bisa dibuat objectnya langsung**, tapi hanya bisa diwarisi oleh class lain.

**Analogi:**
- **Regular class** = Rumah yang sudah jadi → bisa langsung ditempati
- **Abstract class** = Blueprint rumah → tidak bisa ditempati, tapi bisa dijadikan dasar untuk bangun rumah

**Kapan pakai Abstract Class?**
- Ketika kita punya **konsep umum** yang harus diimplementasikan dengan cara **berbeda-beda** oleh child class
- Contoh: MenuItem (makanan dan minuman tampil menu dengan cara berbeda)

---

#### PRAKTIK: Membuat Abstract Class MenuItem

**Langkah 1**: Buat package baru untuk praktik ini
- Klik kanan src → New → Java Package
- **Package Name**: `restoran`
- Finish

**Langkah 2**: Buat abstract class `MenuItem`
- Klik kanan package `restoran` → New → Java Class
- **Class Name**: `MenuItem`
- Finish

**Langkah 3**: Ketik kode berikut:

```java
package restoran;

public abstract class MenuItem {
    // Attribute
    protected String nama;
    protected double harga;
    protected String kategori;
    
    // Constructor
    public MenuItem(String nama, double harga, String kategori) {
        this.nama = nama;
        this.harga = harga;
        this.kategori = kategori;
    }
    
    // Abstract method - HARUS diimplementasikan oleh child class!
    public abstract void tampilMenu();
    
    // Regular method - bisa langsung dipakai child
    public void tampilInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Harga: Rp " + harga);
    }
}
```

**PENJELASAN:**

```java
public abstract class MenuItem {
```
- **Keyword `abstract`** = class ini adalah abstract class
- **Tidak bisa** buat object: `MenuItem item = new MenuItem();` ❌ ERROR!
- **Hanya bisa** diwarisi: `class Makanan extends MenuItem` ✅

```java
protected String nama;
```
- **`protected`** = bisa diakses oleh child class
- Lebih aman dari `public` (nanti kita bahas encapsulation)

```java
public abstract void tampilMenu();
```
- **Abstract method** = method tanpa implementasi (tidak ada body `{}`)
- **HARUS** diimplementasikan (override) oleh semua child class
- Kalau child tidak implement, akan error!

---

#### LANGKAH 4: Membuat Child Class - Makanan

Buat class `Makanan` yang extends `MenuItem`:

```java
package restoran;

public class Makanan extends MenuItem {
    // Attribute tambahan khusus Makanan
    private String jenisMakanan;
    
    // Constructor
    public Makanan(String nama, double harga, String jenisMakanan) {
        super(nama, harga, "Makanan");  // Panggil constructor parent
        this.jenisMakanan = jenisMakanan;
    }
    
    // WAJIB implement abstract method dari parent!
    @Override
    public void tampilMenu() {
        System.out.println("========== MAKANAN ==========");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenisMakanan);
        System.out.println("Harga: Rp " + String.format("%,.0f", harga));
        System.out.println("============================");
    }
}
```

**PENJELASAN:**

```java
super(nama, harga, "Makanan");
```
- **`super()`** = memanggil constructor parent class
- Wajib dipanggil kalau parent punya constructor dengan parameter

```java
@Override
public void tampilMenu() {
    // Implementasi konkret di sini
}
```
- **WAJIB implement** abstract method dari parent
- Kalau tidak implement, akan error!

---

#### LANGKAH 5: Membuat Child Class - Minuman

```java
package restoran;

public class Minuman extends MenuItem {
    // Attribute tambahan khusus Minuman
    private String jenisMinuman;
    private String ukuran;
    
    // Constructor
    public Minuman(String nama, double harga, String jenisMinuman, String ukuran) {
        super(nama, harga, "Minuman");
        this.jenisMinuman = jenisMinuman;
        this.ukuran = ukuran;
    }
    
    // WAJIB implement abstract method dari parent!
    @Override
    public void tampilMenu() {
        System.out.println("========== MINUMAN ==========");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenisMinuman);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Harga: Rp " + String.format("%,.0f", harga));
        System.out.println("============================");
    }
}
```

---

#### LANGKAH 6: Test Program

Buat class `TestRestoran` dengan main method:

```java
package restoran;

public class TestRestoran {
    public static void main(String[] args) {
        // Buat object Makanan
        Makanan makanan1 = new Makanan("Nasi Goreng", 25000, "Nasi");
        Makanan makanan2 = new Makanan("Mie Ayam", 20000, "Mie");
        
        // Buat object Minuman
        Minuman minuman1 = new Minuman("Es Teh", 5000, "Teh", "Sedang");
        Minuman minuman2 = new Minuman("Jus Jeruk", 12000, "Jus", "Besar");
        
        // Tampilkan menu
        System.out.println("===== MENU RESTORAN =====\n");
        
        makanan1.tampilMenu();
        System.out.println();
        
        makanan2.tampilMenu();
        System.out.println();
        
        minuman1.tampilMenu();
        System.out.println();
        
        minuman2.tampilMenu();
        
        // POLYMORPHISM! - nanti di AB 12
        // MenuItem[] daftarMenu = {makanan1, makanan2, minuman1, minuman2};
    }
}
```

**JALANKAN!** (Shift+F6 atau klik kanan → Run File)

**HASILNYA:**
```
===== MENU RESTORAN =====

========== MAKANAN ==========
Nama: Nasi Goreng
Jenis: Nasi
Harga: Rp 25,000
============================

========== MAKANAN ==========
Nama: Mie Ayam
Jenis: Mie
Harga: Rp 20,000
============================

========== MINUMAN ==========
Nama: Es Teh
Jenis: Teh
Ukuran: Sedang
Harga: Rp 5,000
============================

========== MINUMAN ==========
Nama: Jus Jeruk
Jenis: Jus
Ukuran: Besar
Harga: Rp 12,000
============================
```

**AMAZING!** 🎉

---

#### KEY TAKEAWAYS - Abstract Class:

1. **Abstract class** pakai keyword `abstract`
2. **Tidak bisa buat object** dari abstract class langsung
3. **Abstract method** hanya deklarasi, tidak ada implementasi
4. **Child class WAJIB implement** semua abstract method
5. **Use case**: Ketika punya konsep umum yang harus diimplementasikan berbeda-beda

**Ini PERSIS yang dibutuhkan untuk Tugas 3!** 🎯

---

### 📝 PRAKTIK 9: Encapsulation - Private & Getter/Setter (PENTING!)

**"Konsep penting berikutnya: ENCAPSULATION!"**

> **🎯 KONEKSI KE TUGAS 3**: Tugas 3 require "encapsulation dengan membatasi akses ke atribut-atribut kelas". Mari kita pelajari!

#### APA ITU ENCAPSULATION?

**Encapsulation** = "Pembungkusan" data untuk **melindungi** data dari akses langsung yang tidak dikehendaki.

**Analogi:**
- **Tanpa Encapsulation** = Uang cash ditaruh di meja → siapa saja bisa ambil/ubah
- **Dengan Encapsulation** = Uang ditaruh di brankas → hanya yang punya kunci yang bisa akses

**Keuntungan:**
- ✅ Data lebih aman (tidak bisa diubah sembarangan)
- ✅ Kontrol penuh atas data (bisa validasi sebelum set)
- ✅ Flexibility (bisa ubah internal tanpa affect code lain)

---

#### ACCESS MODIFIER: Public vs Private

| Modifier | Akses dari Class Sendiri | Akses dari Class Lain | Akses dari Child |
|----------|-------------------------|------------------------|------------------|
| **public** | ✅ | ✅ | ✅ |
| **private** | ✅ | ❌ | ❌ |
| **protected** | ✅ | ❌ | ✅ |

**Best Practice:**
- **Attribute** = `private` (aman!)
- **Method** = `public` (bisa diakses)
- **Akses attribute** = via **Getter & Setter**

---

#### REFACTOR: MenuItem dengan Encapsulation

**BEFORE (tanpa encapsulation)**:
```java
public abstract class MenuItem {
    protected String nama;  // ← Bisa diakses langsung
    protected double harga;
    protected String kategori;
}

// Penggunaan:
Makanan makanan = new Makanan(...);
makanan.nama = "Bakso";  // ← Akses langsung, tidak aman!
makanan.harga = -5000;   // ← Bisa set nilai negatif! Bug!
```

**AFTER (dengan encapsulation)**:
```java
public abstract class MenuItem {
    private String nama;  // ← PRIVATE! Tidak bisa akses langsung
    private double harga;
    private String kategori;
    
    // Constructor
    public MenuItem(String nama, double harga, String kategori) {
        this.nama = nama;
        this.harga = harga;
        this.kategori = kategori;
    }
    
    // GETTER - untuk MENGAMBIL nilai
    public String getNama() {
        return nama;
    }
    
    public double getHarga() {
        return harga;
    }
    
    public String getKategori() {
        return kategori;
    }
    
    // SETTER - untuk MENGUBAH nilai (dengan validasi!)
    public void setNama(String nama) {
        if(nama != null && !nama.isEmpty()) {
            this.nama = nama;
        } else {
            System.out.println("Error: Nama tidak boleh kosong!");
        }
    }
    
    public void setHarga(double harga) {
        if(harga > 0) {  // ← Validasi! Harga harus positif
            this.harga = harga;
        } else {
            System.out.println("Error: Harga harus lebih dari 0!");
        }
    }
    
    // Abstract method
    public abstract void tampilMenu();
}
```

**PENJELASAN:**

```java
private String nama;
```
- **`private`** = hanya bisa diakses di dalam class ini
- Tidak bisa: `makanan.nama = "X"` ❌
- Harus via method getter/setter

```java
public String getNama() {
    return nama;
}
```
- **Getter** = method untuk MENGAMBIL nilai private attribute
- Naming convention: `get` + `NamaAttribute` (PascalCase)
- Return type sesuai tipe attribute

```java
public void setNama(String nama) {
    if(nama != null && !nama.isEmpty()) {
        this.nama = nama;
    }
}
```
- **Setter** = method untuk MENGUBAH nilai private attribute
- Naming convention: `set` + `NamaAttribute`
- **Bisa tambahkan validasi!** ← Ini kekuatannya!

---

#### UPDATE Class Makanan & Minuman

```java
package restoran;

public class Makanan extends MenuItem {
    private String jenisMakanan;  // ← PRIVATE now!
    
    public Makanan(String nama, double harga, String jenisMakanan) {
        super(nama, harga, "Makanan");
        this.jenisMakanan = jenisMakanan;
    }
    
    // Getter & Setter
    public String getJenisMakanan() {
        return jenisMakanan;
    }
    
    public void setJenisMakanan(String jenisMakanan) {
        this.jenisMakanan = jenisMakanan;
    }
    
    @Override
    public void tampilMenu() {
        System.out.println("========== MAKANAN ==========");
        System.out.println("Nama: " + getNama());  // ← Pakai getter!
        System.out.println("Jenis: " + jenisMakanan);
        System.out.println("Harga: Rp " + String.format("%,.0f", getHarga()));
        System.out.println("============================");
    }
}
```

**Update `Minuman` dengan cara yang sama!**

---

#### TEST Encapsulation

```java
public class TestEncapsulation {
    public static void main(String[] args) {
        Makanan makanan = new Makanan("Nasi Goreng", 25000, "Nasi");
        
        // Akses dengan Getter
        System.out.println("Nama: " + makanan.getNama());
        System.out.println("Harga: " + makanan.getHarga());
        
        // Ubah dengan Setter (dengan validasi)
        makanan.setHarga(30000);  // ✅ Valid
        System.out.println("Harga baru: " + makanan.getHarga());
        
        makanan.setHarga(-5000);  // ❌ Invalid - ada error message!
        System.out.println("Harga tetap: " + makanan.getHarga());  // Tidak berubah!
    }
}
```

**OUTPUT:**
```
Nama: Nasi Goreng
Harga: 25000.0
Harga baru: 30000.0
Error: Harga harus lebih dari 0!
Harga tetap: 30000.0
```

**See?!** Setter melindungi data dari nilai invalid! 🛡️

---

#### KEY TAKEAWAYS - Encapsulation:

1. **Attribute = private** (data hiding)
2. **Akses via Getter/Setter** (controlled access)
3. **Getter**: `getTipeData getNamaAttribute()` - untuk mengambil nilai
4. **Setter**: `void setNamaAttribute(TipeData value)` - untuk set nilai
5. **Validasi di Setter** = kekuatan encapsulation!

**Ini WAJIB untuk Tugas 3!** 🎯

---

> **📝 CATATAN UNTUK TUGAS 3**:
>
> Di Tugas 3, teman-teman akan diminta:
> - ✅ Buat abstract class `MenuItem` (sudah dipelajari di Praktik 8!)
> - ✅ Implement encapsulation dengan private + getter/setter (sudah dipelajari di Praktik 9!)
> - ✅ Child classes: Makanan, Minuman, Diskon extends MenuItem
> - ✅ Override method `tampilMenu()` di masing-masing child
> - ✅ ArrayList untuk manage data
>
> **Semua konsep sudah kita pelajari hari ini!** Tinggal develop lebih lanjut sesuai requirement Tugas 3! 💪

---

## 6. PRAKTIK MANDIRI - "GILIRAN KAMU!" (10 menit)

**"Nah sekarang giliran teman-teman praktik sendiri!"**

---

### ✏️ Latihan 1: Membuat Class Staff (BASIC)

**TUGAS**:
Buatlah class `Staff` yang mewarisi dari class `Orang` dengan attribute tambahan:
- `nip` (String)
- `bagian` (String) - misalnya: "Administrasi", "IT", "Keuangan"

Dan override method `tampilData()` untuk menampilkan semua data staff.

**LANGKAH-LANGKAH**:
1. Buat class baru: `Staff.java`
2. Ketik: `public class Staff extends Orang {`
3. Tambahkan attribute `nip` dan `bagian`
4. Override method `tampilData()`

**OUTPUT YANG DIHARAPKAN**:
```
=== Data Staff ===
Nama: Siti Rahayu
Alamat: Surabaya
NIP: 199001012015
Bagian: Administrasi
```

**KODE TEMPLATE**:
```java
package inheritancesederhana;

public class Staff extends Orang {
    // Lengkapi attribute di sini!
    
    // Override tampilData()
    @Override
    public void tampilData() {
        // Lengkapi implementasi di sini!
    }
}
```

**Test di main:**
```java
Staff staff = new Staff();
staff.nama = "Siti Rahayu";
staff.alamat = "Surabaya";
staff.nip = "199001012015";
staff.bagian = "Administrasi";
staff.tampilData();
```

---

### ✏️ Latihan 2: Hirarki Kendaraan (MEDIUM)

**TUGAS**:
Buatlah program dengan hirarki:
- **Parent**: `Kendaraan` (attribute: `merk`, `tahun`)
- **Child 1**: `Mobil` (tambahan: `jumlahPintu`, `tipeTransmisi`)
- **Child 2**: `Motor` (tambahan: `jenisMotor`, `kapasitasMesin`)

Masing-masing punya method `tampilInfo()`.

**OUTPUT YANG DIHARAPKAN**:
```
=== Info Mobil ===
Merk: Toyota Avanza
Tahun: 2023
Jumlah Pintu: 4
Tipe Transmisi: Automatic

=== Info Motor ===
Merk: Honda Beat
Tahun: 2022
Jenis Motor: Matic
Kapasitas Mesin: 110cc
```

**TIPS**:
- Buat 3 class: Kendaraan.java, Mobil.java, Motor.java
- Mobil dan Motor extends Kendaraan
- Override method tampilInfo() di masing-masing child

---

### ✏️ Latihan 3: Eksplorasi Bebas (CHALLENGE)

**TUGAS**:
Buat hirarki inheritance sendiri dengan tema yang teman-teman suka!

**Contoh tema**:
- Makhluk Hidup → Manusia, Hewan, Tumbuhan
- Produk → Elektronik, Makanan, Pakaian
- Buku → BukuFiksi, BukuNonFiksi, Komik

**Yang harus ada**:
- 1 Parent class
- Minimal 2 Child class
- Override method di child class
- Test dengan membuat object

**Kalau kesulitan, tidak apa-apa!**  
Fokus ke Latihan 1 dulu. Latihan 2 dan 3 adalah bonus! 😊

---

## 7. TROUBLESHOOTING UNTUK PEMULA (5 menit)

**"Masalah yang Sering Muncul & Solusinya"**

---

### ❗ ERROR 1: Cannot find symbol (attribute dari parent)

**Pesan error:**
```
error: cannot find symbol
  symbol:   variable nama
  location: class Mahasiswa
```

**Penyebab**: 
Attribute di parent class bersifat `private`, tidak bisa diakses child

**Contoh SALAH**:
```java
class Orang {
    private String nama;  // ← Private, tidak bisa diakses child!
}
```

**Solusi**:
Ubah jadi `public` atau `protected`:
```java
class Orang {
    public String nama;  // ← Public, bisa diakses child
}
```

**Atau:**
```java
class Orang {
    protected String nama;  // ← Protected, hanya child yang bisa akses
}
```

---

### ❗ ERROR 2: Method does not override or implement a method from a supertype

**Pesan error:**
```
error: method does not override or implement a method from a supertype
    @Override
    ^
```

**Penyebab**: 
Nama method atau signature tidak sama dengan method di parent

**Contoh SALAH**:
```java
// Di parent
public void tampilData() { }

// Di child
@Override
public void tampildata() { }  // ← Huruf 'd' kecil, SALAH!
```

**Solusi**:
Pastikan nama method PERSIS SAMA (case-sensitive):
```java
@Override
public void tampilData() { }  // ← Huruf 'D' besar, BENAR!
```

---

### ❗ ERROR 3: Cannot inherit from final class

**Pesan error:**
```
error: cannot inherit from final class Orang
```

**Penyebab**: 
Parent class dideklarasikan sebagai `final`

**Contoh SALAH**:
```java
public final class Orang { }  // ← Final, tidak bisa diwarisi!
```

**Solusi**:
Hapus keyword `final`:
```java
public class Orang { }  // ← Bisa diwarisi
```

---

### 💡 Tips Inheritance untuk Pemula:

**1. Pikirkan "IS-A" Relationship:**
- Mahasiswa **IS-A** (adalah) Orang ✅
- Mobil **IS-A** (adalah) Kendaraan ✅
- Kucing **IS-A** (adalah) Hewan ✅

Kalau hubungannya "IS-A", pakai inheritance!

**2. Jangan Overuse Inheritance:**
- Jangan semua class di-extends!
- Pakai kalau memang ada hubungan yang jelas
- Kadang composition lebih baik (nanti dibahas di level advanced)

**3. Parent Class = Yang Umum, Child = Yang Spesifik:**
- Parent berisi attribute/method yang **UMUM**
- Child berisi attribute/method yang **SPESIFIK**

**4. Test Inheritance:**
```java
// Buat object child
Mahasiswa mhs = new Mahasiswa();

// Coba akses attribute parent
mhs.nama = "Test";  // Bisa? Inheritance berhasil!
```

---

**Masih bingung?**  
📧 Tanya di forum diskusi  
💬 Share kode dan error-nya  
Pak Anton siap membantu! 💪

---

## 8. KETERKAITAN DENGAN TUGAS & REMINDER

**"Hubungannya dengan Tugas Kalian"**

### Review Tugas 1 & 2 📝

**Tugas 1** (AB 4): ✅ Sudah selesai
- Class, Object, If-Else

**Tugas 2** (AB 8): ✅ Sudah dikerjakan
- UML Diagram
- Perancangan Class

**Nah, di Tugas 2 kan teman-teman sudah buat diagram UML!**

### Hubungan UML dengan Inheritance

Di diagram UML, inheritance ditandai dengan **PANAH SEGITIGA KOSONG** yang menunjuk ke parent class.

**Contoh Diagram UML:**

```
    Orang
      △
      |
   ---|---
   |     |
Mahasiswa Dosen
```

**Dalam kode Java:**
```java
class Mahasiswa extends Orang { }
class Dosen extends Orang { }
```

**Lihat?!** Apa yang teman-teman gambar di UML, sekarang bisa diterjemahkan ke kode Java!

**Tips Review Tugas 2**:
- Lihat lagi diagram UML teman-teman
- Ada inheritance?
- Coba implementasikan dalam kode!
- Bandingkan dengan materi hari ini

### Persiapan Tugas 3 📅

**Tugas 3** (AB 12) akan tentang:
- **Polymorphism** (polimorfisme)
- **Exception Handling**
- Konsep OOP lanjutan

**Inheritance adalah FONDASI untuk Polymorphism!**

Jadi pastikan materi hari ini sudah paham ya! 👍

### Timeline Penting:

- ✅ **Tugas 1** (AB 4): Sudah selesai
- ✅ **Tugas 2** (AB 8): Sudah selesai
- 🔜 **Tugas 3** (AB 12): Akan diberikan, deadline AB 15
- 📺 **TUWEB 4** (AB 14): GUI dengan NetBeans

**Tetap semangat!** 💪

---

## 9. AJAKAN DISKUSI (3-5 pertanyaan sederhana)

**"Yuk Diskusi di Forum!"**

Silakan diskusikan di **Forum Diskusi AB 8**:

### 1. Share Hirarki Inheritance Pertama! 🎉
**"Sudah berhasil membuat parent dan child class? Share screenshot class diagram atau kode teman-teman!"**

Ceritakan:
- Parent class apa yang teman-teman buat?
- Child class apa saja?
- Ada kendala atau langsung berhasil?

### 2. Analogi Inheritance Favorit 🍪
**"Selain cetakan kue, analogi apa yang menurutmu paling cocok untuk menjelaskan inheritance?"**

Berpikir kreatif:
- Keluarga (orangtua-anak)?
- Kategori barang?
- Atau analogi lain dari pengalaman teman-teman?

### 3. Override vs Overload 🤔
**"Ada yang bingung bedanya Override vs Overload? Yuk diskusi di sini!"**

Sharing pemahaman:
- Override = menimpa method parent
- Overload = method dengan nama sama tapi parameter beda
- Share contoh masing-masing!

### 4. Kasus Real Inheritance 💡
**"Di kehidupan nyata atau pekerjaan teman-teman, kira-kira inheritance bisa diterapkan untuk kasus apa?"**

Berpikir aplikatif:
- Sistem kepegawaian?
- Inventory produk?
- Data pelanggan?
- Share ide teman-teman!

### 5. Tantangan Diagram UML ke Kode! 🏆
**"Buat diagram UML inheritance (pakai draw.io atau kertas), lalu implementasikan ke kode Java. Share hasilnya!"**

Untuk yang sudah paham:
- Buat diagram UML dengan minimal 1 parent, 2 child
- Implementasikan dalam kode
- Test dengan membuat object
- Share screenshot diagram DAN output program!

---

**Partisipasi aktif = Pemahaman lebih dalam!** 📚

---

## 10. PENUTUP & MOTIVASI (3 menit)

**"Rangkuman & Semangat!"**

### 📌 Rangkuman Singkat:

Hari ini kita sudah mempelajari konsep **FUNDAMENTAL OOP: INHERITANCE!** 🌟

✅ **Apa yang sudah kita pelajari:**
1. **Konsep Inheritance** - pewarisan dari parent ke child
2. **Keyword extends** - untuk melakukan pewarisan
3. **Attribute dan Method Inheritance** - child mewarisi semua dari parent
4. **Override Method** - menimpa method parent dengan implementasi khusus
5. **Multiple Child dari 1 Parent** - Orang → Mahasiswa, Dosen, Staff

✅ **Apa yang sudah kita praktikkan:**
- Membuat parent class `Orang`
- Membuat child class `Mahasiswa` dan `Dosen`
- Menggunakan attribute parent di child
- Override method `tampilData()`
- Membuat beberapa object dari child class

**Jangan lupa selesaikan latihan mandiri!** Semakin banyak praktik, semakin kuat fondasi OOP teman-teman! 💪

---

### 🎯 Preview Minggu Depan:

**Di Aktivitas Belajar 11**, kita akan belajar:
- **Encapsulation** (enkapsulasi)
- Getter dan Setter
- Access Modifier (public, private, protected)

**Di Aktivitas Belajar 12** (ada Tugas 3!), kita akan belajar:
- **Polymorphism** (polimorfisme)
- **Exception Handling**
- Try-catch block

**Di TUWEB 4 (AB 14)**, kita akan belajar:
- **GUI** (Graphical User Interface)
- Membuat aplikasi dengan window, button, text field
- **Drag & drop di NetBeans!** (exciting!)

**Konsep inheritance hari ini adalah FONDASI untuk polymorphism!**  
Jadi pastikan sudah paham ya! 🚀

---

### 💪 Motivasi:

**"Kalian Semakin Menguasai OOP!"** 🏆

Dari TUWEB 1 sampai sekarang, teman-teman sudah menguasai:
- ✅ Class dan Object (TUWEB 1)
- ✅ For dan While Loop (TUWEB 2)
- ✅ **Inheritance (TUWEB 3)** ← Hari ini!

**Ini adalah 3 Pilar Penting Programming!**

> "Inheritance is not just about code reuse;  
> it's about thinking in hierarchies and relationships."

**Pesan Pak Anton**:

**1. Inheritance = Efisiensi!**  
Daripada nulis kode yang sama berkali-kali, mending pakai inheritance. DRY: Don't Repeat Yourself!

**2. Think in Hierarchies!**  
Mulai berpikir dalam hirarki: apa yang umum, apa yang spesifik. Skill ini berguna di dunia kerja!

**3. UML to Code!**  
Kalian sudah bisa menerjemahkan diagram UML ke kode Java. Ini skill yang dicari perusahaan!

**4. Override dengan Bijak!**  
Override itu powerful, tapi gunakan kalau memang perlu. Jangan override semua method!

**5. Enjoy the Journey!**  
OOP itu indah. Semakin dalam teman-teman belajar, semakin teman-teman menghargai desain yang baik!

---

### 📢 Pengumuman Penting:

1. **Tugas 3** akan diberikan di **AB 12**
   - Deadline: AB 15
   - Topik: Polymorphism, Exception Handling
   - Format: Video rekaman praktik

2. **TUWEB 4** di **AB 14**
   - Topik: GUI dengan NetBeans
   - Praktik membuat aplikasi window
   - Super exciting!

3. **Forum Diskusi AB 8** sudah dibuka
   - Diskusikan materi inheritance
   - Share diagram UML dan kode
   - Tanya jawab dengan tutor

4. **Webinar (jika ada)**
   - Cek pengumuman di LMS
   - Review progress tugas
   - Tanya jawab langsung

---

### 🌟 Quotes Penutup:

> "Inheritance is not just a programming concept;  
> it's a way of thinking about the world in terms of relationships."

> "Good design is about knowing when to inherit and when not to."

> "The best inheritance is the knowledge and skills you pass on."

---

### ✨ Pesan Terakhir:

Kalian baru saja mempelajari salah satu konsep paling penting di OOP: **Inheritance!**

Ini bukan sekadar teknik coding. Ini adalah cara berpikir:
- Bagaimana mengorganisir data
- Bagaimana melihat hubungan antar entitas
- Bagaimana membuat kode yang efisien dan mudah di-maintain

**Di dunia kerja:**
- Framework menggunakan inheritance
- Library besar pakai inheritance
- Design pattern pakai inheritance

**Kalian sudah mempelajari fondasi yang dipakai programmer profesional!**

**Tetap semangat!**  
**Keep coding!**  
**Jangan lupa istirahat dan sholat!** 🙏

**See you di TUWEB 4!** 👋

---

**Wassalamu'alaikum warahmatullahi wabarakatuh.**

---

### Salam Penutup:

**"Sampai jumpa di TUWEB selanjutnya! Tetap semangat belajar OOP! 💻🚀"**

---

## LAMPIRAN

### A. Referensi Tambahan

**Link ke BMP**: Modul 4 - KB 2 (Inheritance)

**Referensi Online**:
1. Java Inheritance Tutorial: https://www.w3schools.com/java/java_inheritance.asp
2. Java OOP Concepts: https://docs.oracle.com/javase/tutorial/java/concepts/
3. Inheritance Best Practices: https://www.baeldung.com/java-inheritance

### B. Kode Lengkap Semua Praktik

**File Orang.java:**
```java
package inheritancesederhana;

public class Orang {
    public String nama;
    public String alamat;
    
    public void tampilData() {
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
    }
}
```

**File Mahasiswa.java:**
```java
package inheritancesederhana;

public class Mahasiswa extends Orang {
    public String nim;
    public String jurusan;
    
    @Override
    public void tampilData() {
        System.out.println("=== Data Mahasiswa ===");
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
    }
}
```

**File Dosen.java:**
```java
package inheritancesederhana;

public class Dosen extends Orang {
    public String nip;
    public String matakuliah;
    
    @Override
    public void tampilData() {
        System.out.println("=== Data Dosen ===");
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("NIP: " + nip);
        System.out.println("Mata Kuliah: " + matakuliah);
    }
}
```

### C. Diagram Inheritance

```
Hirarki Inheritance:

         Orang
           |
     ----------------
     |      |       |
 Mahasiswa Dosen Staff
```

**IS-A Relationship:**
- Mahasiswa IS-A Orang ✅
- Dosen IS-A Orang ✅
- Staff IS-A Orang ✅

### D. Checklist Keberhasilan

Pastikan teman-teman sudah bisa:
- [ ] Memahami konsep inheritance
- [ ] Membuat parent class
- [ ] Membuat child class dengan `extends`
- [ ] Menggunakan attribute parent di child
- [ ] Menggunakan method parent di child
- [ ] Override method di child class
- [ ] Membuat beberapa child dari 1 parent
- [ ] Menerjemahkan UML diagram ke kode Java

Kalau ada yang belum bisa, **DISKUSI DI FORUM!** 💬

### E. Kontak

**Tutor**: Anton Prafanto, S.Kom., M.T.  
**Forum Diskusi**: Forum AB 8 di LMS UT  
**Mata Kuliah**: STSI4201 - Pemrograman Berbasis Desktop

---

**#LearningByDoing #Inheritance #OOP #JavaProgramming #UniversitasTerbuka #STSI4201**

---

**END OF TUWEB 3**

Dibuat dengan ❤️ untuk mahasiswa Universitas Terbuka  
*Keep inheriting, keep learning!* 🔗🚀
