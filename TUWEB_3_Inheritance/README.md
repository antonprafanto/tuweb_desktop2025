# TUWEB 3: Inheritance (Pewarisan)

## Tutorial Ke-3 - Pemrograman Berbasis Desktop
**STSI4201** | Universitas Terbuka

---

## 📚 Deskripsi

Materi Tutorial Web (TUWEB) ini membahas tentang **Inheritance** (Pewarisan), salah satu pilar utama dalam Pemrograman Berorientasi Objek (OOP). Mahasiswa akan belajar membuat hierarki class, method overriding, polymorphism, dan konsep OOP lainnya melalui pendekatan **Learning by Doing**.

### Topik yang Dibahas:
- Konsep Inheritance (parent-child class)
- Keyword `extends` dan `super`
- Method Overriding dengan `@Override`
- Access Modifier (public, protected, private)
- Polymorphism dasar
- Abstract class
- Hierarki class yang efektif

---

## 🎯 Capaian Pembelajaran

Setelah mempelajari materi ini, mahasiswa diharapkan mampu:
1. ✅ Memahami konsep inheritance dalam OOP
2. ✅ Membuat hierarki class dengan relasi parent-child
3. ✅ Mengimplementasikan method overriding
4. ✅ Menggunakan keyword super dan extends dengan tepat
5. ✅ Menerapkan polymorphism dalam program
6. ✅ Merancang struktur class yang efisien

---

## 📁 Struktur Folder

```
TUWEB_3_Inheritance/
├── 01_Materi_Pembelajaran/
│   └── 01_konsep_inheritance.md
├── 02_Latihan_dan_Praktik/
│   ├── 01_Latihan_Dasar.md
│   └── 02_Latihan_Menengah.md
├── 03_Aplikasi_Utama/
│   ├── SistemPerpustakaanDigital.java
│   └── README.md
├── 04_Panduan_Tambahan/
│   ├── 01_FAQ.md
│   └── 02_Glossarium.md
└── README.md (file ini)
```

---

## 🚀 Cara Belajar

### Tahap 1: Pahami Konsep (2-3 jam)
1. Baca materi di `01_Materi_Pembelajaran/01_konsep_inheritance.md`
2. Pahami perbedaan parent class dan child class
3. Pelajari kapan menggunakan inheritance
4. Perhatikan contoh hierarki class

### Tahap 2: Latihan Bertahap (4-5 jam)
1. Kerjakan latihan dasar untuk memahami sintaks
2. Praktik membuat class dengan inheritance
3. Latihan method overriding
4. Implementasi polymorphism

### Tahap 3: Aplikasi Utama (3-4 jam)
1. Pelajari Sistem Perpustakaan Digital
2. Pahami hierarki class yang digunakan
3. Amati penggunaan polymorphism
4. Jalankan dan test semua fitur

---

## 💻 Aplikasi Utama

### Sistem Perpustakaan Digital

**Deskripsi**: Aplikasi manajemen perpustakaan yang mengelola berbagai jenis koleksi menggunakan konsep inheritance.

**Hierarki Class**:
```
        ItemPerpustakaan (Abstract Parent)
        /       |       |        \
     Buku   Majalah  Jurnal     DVD
    (Child) (Child) (Child)   (Child)
```

**Fitur**:
- ✅ Lihat semua koleksi (polymorphism)
- ✅ Cari item berdasarkan kode/judul
- ✅ Tambah item baru (4 jenis)
- ✅ Pinjam dan kembalikan item
- ✅ Statistik koleksi berdasarkan jenis dan status
- ✅ Data awal untuk testing

**Konsep OOP yang Digunakan**:
- **Inheritance**: Semua item mewarisi dari `ItemPerpustakaan`
- **Abstract class**: `ItemPerpustakaan` sebagai template
- **Method Overriding**: Setiap child override `tampilkanInfo()`
- **Polymorphism**: Array `ArrayList<ItemPerpustakaan>` menampung semua jenis
- **Encapsulation**: Access modifier (protected, private)

**Cara Menjalankan**:
1. Buka NetBeans IDE
2. Import file `SistemPerpustakaanDigital.java`
3. Compile dan Run
4. Explore semua fitur menu

---

## 🔑 Konsep Utama

### 1. Inheritance
```java
class Parent {
    protected String nama;
}

class Child extends Parent {
    // Mewarisi atribut nama dari Parent
}
```

### 2. Method Overriding
```java
class Parent {
    void tampilkan() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    @Override
    void tampilkan() {
        System.out.println("Child");
    }
}
```

### 3. Polymorphism
```java
Parent obj1 = new Child();  // Objek child sebagai tipe parent
obj1.tampilkan();  // Memanggil method child
```

---

## 🛠️ Tools yang Dibutuhkan

- **JDK** (Java Development Kit) versi 8+
- **NetBeans IDE** versi 12+ (atau IDE Java lainnya)
- **OS**: Windows/Mac/Linux

---

## 📝 Checklist Pembelajaran

- [ ] Memahami konsep inheritance
- [ ] Memahami perbedaan extends vs implements
- [ ] Bisa membuat hierarki class sederhana
- [ ] Memahami keyword super
- [ ] Bisa melakukan method overriding
- [ ] Memahami polymorphism
- [ ] Menyelesaikan latihan dasar
- [ ] Menyelesaikan latihan menengah
- [ ] Memahami aplikasi Perpustakaan Digital
- [ ] Bisa memodifikasi dan menambah fitur

---

## ❓ FAQ Singkat

**Q: Kapan menggunakan inheritance?**
A: Ketika ada relasi "is-a" (adalah). Contoh: Mobil IS-A Kendaraan, Kucing IS-A Hewan.

**Q: Berapa parent class yang bisa di-extends?**
A: Di Java, hanya **1 parent class** (single inheritance).

**Q: Apa bedanya overriding vs overloading?**
A:
- **Overriding**: Method sama di parent dan child (inheritance)
- **Overloading**: Method sama dengan parameter berbeda (dalam 1 class)

Lihat FAQ lengkap di `04_Panduan_Tambahan/01_FAQ.md`

---

## 📚 Referensi

1. Modul 7 UT: Pemrograman Berorientasi Objek 1
2. Horstmann, C. (2015). Big Java Early Objects. Wiley.
3. Oracle Java Tutorial: Inheritance
4. https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html

---

## 👨‍🏫 Dosen Pengampu

**Anton Prafanto, S.Kom, M.T.**
- Dosen Program Studi Informatika
- Universitas Mulawarman
- Tutor Universitas Terbuka

---

## 📅 Timeline Belajar (Rekomendasi)

| Minggu | Aktivitas | Durasi |
|--------|-----------|--------|
| 1 | Baca materi konsep inheritance | 3 jam |
| 1 | Latihan dasar (class sederhana) | 3 jam |
| 2 | Latihan menengah (hierarki kompleks) | 4 jam |
| 2 | Pelajari aplikasi utama | 3 jam |
| 3 | Praktik modifikasi & eksplorasi | 3 jam |
| **Total** | | **16 jam** |

---

## 💡 Tips Sukses

1. **Pikirkan relasi antar class** - gunakan inheritance jika ada relasi "is-a"
2. **Jangan overuse inheritance** - tidak semua relasi butuh inheritance
3. **Protected untuk child** - gunakan protected untuk atribut yang perlu diakses child
4. **@Override selalu** - gunakan annotation untuk menghindari typo
5. **Test polymorphism** - coba buat array parent yang isi object child

---

## 🏆 Evaluasi

Kriteria penilaian:
- ✅ Pemahaman konsep inheritance (25%)
- ✅ Implementasi method overriding (25%)
- ✅ Penggunaan polymorphism (25%)
- ✅ Penyelesaian aplikasi utama (25%)

---

**Selamat Belajar! 🚀**

*"Inheritance is not about reusing code, it's about understanding relationships." - Robert C. Martin*

---

© 2025 Anton Prafanto, S.Kom, M.T. | Universitas Terbuka
