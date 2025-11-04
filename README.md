# 📚 Materi TUWEB - Pemrograman Berbasis Desktop

**STSI4201** | Universitas Terbuka
**Dosen Pengampu**: Anton Prafanto, S.Kom, M.T.
**Institusi**: Universitas Mulawarman

---

## 🎯 Tentang Repository Ini

Repository ini berisi **3 materi Tutorial Web (TUWEB)** lengkap untuk mata kuliah **Pemrograman Berbasis Desktop** dengan pendekatan **Learning by Doing**. Setiap TUWEB dirancang untuk membantu mahasiswa belajar melalui praktik langsung dengan contoh kasus nyata.

### 📖 Daftar TUWEB:

| No | TUWEB | Topik | Tutorial |
|----|-------|-------|----------|
| 1️⃣ | **TUWEB 2** | [Struktur Pengulangan (Looping)](TUWEB_2_Struktur_Pengulangan/) | Tutorial Ke-2 |
| 2️⃣ | **TUWEB 3** | [Inheritance (Pewarisan)](TUWEB_3_Inheritance/) | Tutorial Ke-3 |
| 3️⃣ | **TUWEB 4** | [GUI Desktop](TUWEB_4_GUI_Desktop/) | Tutorial Ke-4 |

---

## 🚀 Cara Menggunakan Materi Ini

### Langkah 1: Persiapan Environment
1. Install **JDK** (Java Development Kit) versi 8 atau lebih baru
2. Install **NetBeans IDE** versi 12 atau lebih baru
3. Pastikan JDK sudah terkonfigurasi dengan baik di NetBeans

### Langkah 2: Belajar Secara Berurutan
Disarankan untuk mempelajari TUWEB secara berurutan karena materi bersifat kumulatif:

```
TUWEB 2 (Looping) → TUWEB 3 (OOP/Inheritance) → TUWEB 4 (GUI)
```

### Langkah 3: Pola Belajar di Setiap TUWEB
Setiap TUWEB memiliki struktur yang konsisten:

1. **📖 Baca Materi** (`01_Materi_Pembelajaran/`)
   - Pahami konsep dasar
   - Pelajari syntax dan contoh

2. **✏️ Kerjakan Latihan** (`02_Latihan_dan_Praktik/`)
   - Mulai dari latihan dasar
   - Lanjut ke latihan menengah
   - **Penting**: Ketik kode sendiri, jangan copy-paste!

3. **💻 Pelajari Aplikasi Utama** (`03_Aplikasi_Utama/`)
   - Jalankan aplikasi lengkap
   - Pahami alur program
   - Coba modifikasi dan eksplorasi

4. **❓ Referensi Tambahan** (`04_Panduan_Tambahan/`)
   - FAQ untuk pertanyaan umum
   - Glossarium istilah teknis
   - Panduan troubleshooting

---

## 📁 Struktur Repository

```
tuweb_aplikasi_desktop/
├── 0_REQUIREMENTS/              # Dokumen requirements (RPS, RAT)
├── tasks/                       # Task management dan progress
├── TUWEB_2_Struktur_Pengulangan/
│   ├── 01_Materi_Pembelajaran/
│   │   └── 01_konsep_struktur_pengulangan.md
│   ├── 02_Latihan_dan_Praktik/
│   │   ├── 01_Latihan_Dasar.md
│   │   └── 02_Latihan_Menengah.md
│   ├── 03_Aplikasi_Utama/
│   │   ├── SistemKalkulatorStatistik.java
│   │   └── README.md
│   ├── 04_Panduan_Tambahan/
│   │   ├── 01_FAQ.md
│   │   └── 02_Glossarium.md
│   └── README.md
├── TUWEB_3_Inheritance/
│   ├── 01_Materi_Pembelajaran/
│   │   └── 01_konsep_inheritance.md
│   ├── 02_Latihan_dan_Praktik/
│   ├── 03_Aplikasi_Utama/
│   │   ├── SistemPerpustakaanDigital.java
│   │   └── README.md
│   ├── 04_Panduan_Tambahan/
│   │   ├── 01_FAQ.md
│   │   └── 02_Glossarium.md
│   └── README.md
├── TUWEB_4_GUI_Desktop/
│   ├── 01_Materi_Pembelajaran/
│   │   └── 01_konsep_gui.md
│   ├── 02_Latihan_dan_Praktik/
│   ├── 03_Aplikasi_Utama/
│   │   ├── AplikasiPengelolaTugasKuliah.java
│   │   └── README.md
│   ├── 04_Panduan_Tambahan/
│   │   ├── 01_FAQ.md
│   │   └── 02_Panduan_NetBeans_GUI_Builder.md
│   └── README.md
├── CLAUDE.md                    # Project instructions
├── LAPORAN_AKHIR.md            # Laporan lengkap project
├── LAPORAN_AUDIT_MENDALAM.md   # Hasil audit kualitas
├── LAPORAN_PERUBAHAN_NAMING.md # Log perubahan naming
└── README.md                    # File ini
```

---

## 🎓 Detail Setiap TUWEB

### 1️⃣ TUWEB 2: Struktur Pengulangan (Looping)

**📍 Lokasi**: [`TUWEB_2_Struktur_Pengulangan/`](TUWEB_2_Struktur_Pengulangan/)

**Topik yang Dipelajari:**
- Loop `for` dan `for-each`
- Loop `while` dan `do-while`
- Nested loop (loop bersarang)
- Break dan Continue statements

**Aplikasi Utama:**
- **Sistem Kalkulator Statistik Sederhana**
- Input data nilai mahasiswa
- Perhitungan statistik (rata-rata, median, modus, standar deviasi)
- Distribusi nilai dan laporan grafis

**Durasi Belajar**: ~18 jam

---

### 2️⃣ TUWEB 3: Inheritance (Pewarisan)

**📍 Lokasi**: [`TUWEB_3_Inheritance/`](TUWEB_3_Inheritance/)

**Topik yang Dipelajari:**
- Konsep Inheritance (parent-child class)
- Keyword `extends` dan `super`
- Method Overriding dengan `@Override`
- Access Modifier (public, protected, private)
- Polymorphism dasar
- Abstract class

**Aplikasi Utama:**
- **Sistem Perpustakaan Digital**
- Hierarki class: ItemPerpustakaan → Buku, Majalah, Jurnal, DVD
- CRUD operations dengan polymorphism
- Pencarian dan peminjaman item
- Statistik koleksi berdasarkan jenis

**Durasi Belajar**: ~16 jam

---

### 3️⃣ TUWEB 4: GUI Desktop

**📍 Lokasi**: [`TUWEB_4_GUI_Desktop/`](TUWEB_4_GUI_Desktop/)

**Topik yang Dipelajari:**
- Perbandingan CLI vs GUI
- Java Swing components (JFrame, JPanel, JButton, JTable, dll)
- Event Handling (ActionListener, MouseListener)
- Layout Managers (BorderLayout, FlowLayout, BoxLayout)
- JTable dengan DefaultTableModel
- Form input dan validasi

**Aplikasi Utama:**
- **Aplikasi Pengelola Tugas Kuliah**
- CRUD tugas mahasiswa (Tambah, Edit, Hapus, Lihat)
- Filter berdasarkan status dan mata kuliah
- Statistik real-time (total, selesai, progress)
- GUI modern dengan JSplitPane responsive

**Durasi Belajar**: ~20 jam

---

## 📊 Statistik Materi

| Aspek | Jumlah |
|-------|--------|
| **Total Lines of Code** | 1,650+ baris |
| **Total Dokumentasi** | 200+ KB |
| **Jumlah Latihan** | 30+ latihan |
| **Aplikasi Lengkap** | 3 aplikasi |
| **Rating Kualitas** | 9.33/10 ⭐⭐⭐⭐⭐ |

---

## 💡 Tips Belajar Efektif

1. **Ketik Kode Sendiri**
   - Jangan hanya membaca atau copy-paste
   - Menulis kode membantu memori otot dan pemahaman

2. **Eksperimen**
   - Ubah nilai variabel
   - Modifikasi alur program
   - Tambahkan fitur baru

3. **Debug dengan Sabar**
   - Baca pesan error dengan teliti
   - Gunakan System.out.println() untuk debugging
   - Tanya ke forum atau tutor jika stuck

4. **Konsisten**
   - Belajar 2-3 jam per hari lebih baik dari 10 jam sekaligus
   - Istirahat setiap 1-2 jam

5. **Praktik, Praktik, Praktik!**
   - Buat variasi dari contoh yang ada
   - Challenge diri sendiri dengan fitur tambahan

---

## 🛠️ Tools yang Dibutuhkan

### Minimum Requirements:
- **JDK**: Java Development Kit 8+
- **IDE**: NetBeans 12+ (atau Eclipse, IntelliJ IDEA)
- **OS**: Windows 7+, macOS 10.10+, atau Linux
- **RAM**: 2GB minimum (4GB recommended)
- **Storage**: 1GB free space

### Download Links:
- **JDK**: [https://www.oracle.com/java/technologies/downloads/](https://www.oracle.com/java/technologies/downloads/)
- **NetBeans**: [https://netbeans.apache.org/download/](https://netbeans.apache.org/download/)

---

## ❓ FAQ Umum

**Q: Apakah saya harus belajar secara berurutan?**
A: Sangat disarankan! TUWEB 3 dan 4 menggunakan konsep dari TUWEB sebelumnya.

**Q: Berapa lama waktu yang dibutuhkan untuk menyelesaikan semua materi?**
A: Total estimasi ~54 jam (18+16+20). Bisa diselesaikan dalam 3-4 minggu jika belajar 3-4 jam per hari.

**Q: Apakah aplikasi bisa dijalankan di Mac/Linux?**
A: Ya! Java bersifat cross-platform. Semua aplikasi bisa berjalan di Windows, Mac, dan Linux.

**Q: Bagaimana cara menjalankan file .java?**
A:
1. Buka NetBeans
2. File → Open File → Pilih file .java
3. Klik tombol Run (F6) atau klik kanan → Run File

**Q: Kode error, apa yang harus dilakukan?**
A:
1. Baca pesan error di console
2. Cek syntax (titik koma, kurung, dll)
3. Cek FAQ di folder `04_Panduan_Tambahan`
4. Tanya ke tutor atau forum

---

## 📞 Kontak & Dukungan

**Dosen Pengampu:**
Anton Prafanto, S.Kom, M.T.
- **Institusi**: Universitas Mulawarman
- **Role**: Tutor Universitas Terbuka

**Untuk Mahasiswa UT:**
- Gunakan forum Tuton untuk diskusi
- Ajukan pertanyaan saat sesi tutorial
- Email ke tutor untuk konsultasi

---

## 📜 Lisensi & Hak Cipta

© 2025 Anton Prafanto, S.Kom, M.T.

Materi ini dibuat untuk keperluan pendidikan di **Universitas Terbuka** dan dapat digunakan untuk tujuan pembelajaran non-komersial.

---

## 🎉 Selamat Belajar!

Semoga materi ini membantu Anda memahami **Pemrograman Berbasis Desktop** dengan baik. Ingat:

> *"The only way to learn programming is by writing programs."*
> — Dennis Ritchie

**Happy Coding!** 💻🚀

---

## 📋 Checklist Pembelajaran

Gunakan checklist ini untuk tracking progress Anda:

### TUWEB 2: Struktur Pengulangan
- [ ] Membaca konsep struktur pengulangan
- [ ] Menyelesaikan 13 latihan dasar
- [ ] Menyelesaikan 4 latihan menengah
- [ ] Memahami aplikasi Kalkulator Statistik
- [ ] Mencoba modifikasi kode

### TUWEB 3: Inheritance
- [ ] Memahami konsep inheritance
- [ ] Membuat class dengan extends
- [ ] Praktik method overriding
- [ ] Memahami polymorphism
- [ ] Menjalankan aplikasi Perpustakaan Digital

### TUWEB 4: GUI Desktop
- [ ] Memahami konsep GUI
- [ ] Praktik membuat JFrame sederhana
- [ ] Belajar event handling
- [ ] Praktik JTable dan form
- [ ] Menjalankan aplikasi Pengelola Tugas

---

**Status Materi**: ✅ **LENGKAP & SIAP DIGUNAKAN**

Terakhir diupdate: 4 November 2025
