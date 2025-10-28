# 📚 RINGKASAN LENGKAP MATERI TUWEB
## Pemrograman Berbasis Desktop - STSI4201

**Dosen:** Anton Prafanto
**Institusi:** Universitas Terbuka - Prodi Informatika
**Tahun:** 2025

---

## 🎯 OVERVIEW

Dokumen ini berisi ringkasan lengkap dari **3 materi TUWEB** yang telah dibuat untuk mata kuliah Pemrograman Berbasis Desktop. Setiap TUWEB dirancang dengan pendekatan **Learning by Doing** agar mahasiswa dapat langsung mempraktikkan konsep yang dipelajari.

---

## 📂 STRUKTUR FOLDER

```
tuweb_aplikasi_desktop/
│
├── 0_REQUIREMENTS/               # RPS dan tugas praktik
│   ├── RPS STSI4201.pdf
│   ├── tugas1.md
│   ├── tugas2.md
│   └── tugas3.md
│
├── 3_MATERI_TUWEB/              # Materi lengkap 3 TUWEB
│   │
│   ├── TUWEB_1_Perulangan/      # Pertemuan 6
│   │   ├── 01_Materi_Lengkap.md
│   │   ├── 03_Contoh_Kode_Sederhana/
│   │   │   ├── ContohFor.java
│   │   │   ├── ContohWhile.java
│   │   │   ├── ContohDoWhile.java
│   │   │   └── ContohNestedLoop.java
│   │   ├── 04_Aplikasi_Kasir_Minimarket/
│   │   │   ├── Produk.java
│   │   │   ├── KasirMinimarket.java
│   │   │   └── README.md
│   │   └── 05_Latihan_Soal.md
│   │
│   ├── TUWEB_2_Inheritance/     # Pertemuan 10
│   │   ├── 01_Materi_Lengkap.md
│   │   ├── 03_Contoh_Kode_Sederhana/
│   │   │   ├── ContohInheritanceBasic.java
│   │   │   ├── ContohSuper.java
│   │   │   └── ContohOverriding.java
│   │   ├── 04_Aplikasi_Manajemen_Kendaraan/
│   │   │   ├── Kendaraan.java
│   │   │   ├── Motor.java
│   │   │   ├── Mobil.java
│   │   │   ├── ManajemenKendaraan.java
│   │   │   └── README.md
│   │   └── 05_Latihan_Soal.md
│   │
│   └── TUWEB_3_GUI/             # Pertemuan 14
│       ├── 01_Materi_Lengkap.md
│       ├── 04_Aplikasi_Kalkulator_BMI/
│       │   ├── KalkulatorBMI.java
│       │   └── README.md
│       └── 05_Latihan_Soal.md
│
├── tasks/
│   └── todo.md                  # Rencana pengerjaan
│
├── CLAUDE.md                    # Instruksi untuk AI
└── RINGKASAN_MATERI_TUWEB.md   # File ini
```

---

## 📘 TUWEB 1: STRUKTUR PERULANGAN
### Pertemuan 6

### 🎯 Tujuan Pembelajaran
Mahasiswa mampu memahami dan mengimplementasikan berbagai jenis perulangan (for, while, do-while, nested loop) dalam program Java.

### 📝 Materi yang Dibahas
1. **Perulangan FOR**
   - Sintaks dan penggunaan
   - For dengan step tertentu
   - For mundur (countdown)

2. **Perulangan FOR-EACH**
   - Iterasi array/collection
   - Kapan menggunakan for-each

3. **Perulangan WHILE**
   - Penggunaan dengan kondisi
   - Validasi input dengan while
   - Menghindari infinite loop

4. **Perulangan DO-WHILE**
   - Eksekusi minimal 1 kali
   - Menu aplikasi dengan do-while
   - Perbedaan while vs do-while

5. **NESTED LOOP**
   - Perulangan bersarang
   - Pola bintang dan angka
   - Array 2 dimensi

6. **BREAK dan CONTINUE**
   - Menghentikan loop
   - Melewati iterasi

### 🖥️ Contoh Kode
- `ContohFor.java` - 10 contoh penggunaan for loop
- `ContohWhile.java` - 10 contoh while loop + validasi
- `ContohDoWhile.java` - Menu aplikasi dengan do-while
- `ContohNestedLoop.java` - 15 contoh nested loop

### 🏪 Aplikasi Praktis
**Kasir Minimarket**
- 10 produk dengan stok
- Input belanja berulang (while loop)
- Validasi input (do-while)
- Perhitungan total (for loop)
- Cetak struk (nested loop)
- Format rupiah Indonesia

**Konsep yang Diterapkan:**
✅ FOR - Iterasi array produk
✅ WHILE - Input belanja berulang
✅ DO-WHILE - Menu utama dan validasi
✅ NESTED - Cetak struk detail

### 📋 Latihan Soal
- 10 pilihan ganda
- 10 soal praktik coding (mudah → sulit)
- 1 project challenge (Perpustakaan Mini)

---

## 📗 TUWEB 2: INHERITANCE (PEWARISAN)
### Pertemuan 10

### 🎯 Tujuan Pembelajaran
Mahasiswa mampu memahami dan menerapkan konsep inheritance, method overriding, dan polymorphism dalam OOP.

### 📝 Materi yang Dibahas
1. **Konsep Dasar Inheritance**
   - Superclass dan subclass
   - Keyword extends
   - Relasi IS-A
   - Keuntungan inheritance

2. **Constructor dengan super()**
   - Memanggil constructor parent
   - Aturan penggunaan super()
   - Urutan eksekusi constructor

3. **Method Overriding**
   - Mengganti implementasi method parent
   - Annotation @Override
   - Aturan overriding
   - Override dengan super.method()

4. **Access Modifier**
   - private, default, protected, public
   - Akses dari subclass
   - Best practices

5. **Polymorphism**
   - Array polymorphic
   - Variabel tipe parent, objek child
   - instanceof dan casting

6. **Multi-level & Hierarchical Inheritance**
   - Inheritance bertingkat
   - Satu parent, banyak child

### 🖥️ Contoh Kode
- `ContohInheritanceBasic.java` - Hierarki Hewan → Kucing, Anjing
- `ContohSuper.java` - Penggunaan super() dalam constructor dan method
- `ContohOverriding.java` - Override method dengan @Override annotation

### 🚗 Aplikasi Praktis
**Sistem Manajemen Rental Kendaraan**
- **Kendaraan** (superclass)
  - Atribut: kode, merk, warna, tahun, harga sewa, status
  - Method: tampilInfo(), sewa(), kembalikan(), service()

- **Motor** (subclass)
  - Atribut tambahan: cc, jenisMotor
  - Override: tampilInfo(), service()
  - Method khusus: wheelie(), hitungKonsumsiB BBM()

- **Mobil** (subclass)
  - Atribut tambahan: jumlahPintu, kapasitas, transmisi
  - Override: tampilInfo(), service(), hitungTotalSewa()
  - Method khusus: klakson(), simulasiPerjalanan()

**Konsep yang Diterapkan:**
✅ Inheritance - Kendaraan → Motor & Mobil
✅ Constructor super() - Di Motor dan Mobil
✅ Method Overriding - tampilInfo(), service()
✅ Polymorphism - Array Kendaraan[] berisi Motor & Mobil
✅ Casting - Akses method khusus subclass

**Fitur Aplikasi:**
- Lihat semua kendaraan (polymorphism)
- Lihat detail (method overriding)
- Sewa & kembalikan
- Service kendaraan (override dengan super)
- Simulasi perjalanan (method khusus Mobil)
- Demo polymorphism

### 📋 Latihan Soal
- 10 pilihan ganda
- 6 soal praktik (mudah → sulit)
- 1 project challenge (Toko Online)

---

## 📙 TUWEB 3: GUI (GRAPHICAL USER INTERFACE)
### Pertemuan 14

### 🎯 Tujuan Pembelajaran
Mahasiswa mampu membuat aplikasi desktop dengan GUI menggunakan Java Swing yang profesional dan user-friendly.

### 📝 Materi yang Dibahas
1. **Pengenalan Java Swing**
   - Apa itu Swing dan keunggulannya
   - Komponen-komponen utama Swing
   - Package dan class hierarchy
   - Swing vs AWT

2. **JFrame - Window Utama**
   - Membuat dan mengkonfigurasi JFrame
   - Properties: size, location, resizable, icon
   - Close operations dan window events
   - Multiple window management

3. **Komponen Dasar & Advanced**
   - JLabel, JTextField, JButton, JTextArea
   - JPasswordField, JCheckBox, JRadioButton
   - JComboBox, JList, JTable
   - JProgressBar, JSlider, JSpinner

4. **Layout Managers**
   - FlowLayout, BorderLayout, GridLayout
   - GridBagLayout untuk form kompleks
   - BoxLayout dan CardLayout
   - Best practices layout management

5. **Event Handling**
   - ActionListener, MouseListener, KeyListener
   - Lambda expressions untuk event handlers
   - Event dispatch thread (EDT)
   - Custom event creation

6. **Container & Panel**
   - JPanel untuk grouping components
   - JScrollPane untuk scrollable content
   - JSplitPane untuk resizable panels
   - JTabbedPane untuk tabbed interface

7. **Dialog & JOptionPane**
   - Message, Input, Confirm dialogs
   - Custom dialog creation
   - Modal vs modeless dialogs
   - File chooser dan color chooser

8. **Menu System**
   - JMenuBar, JMenu, JMenuItem
   - Keyboard shortcuts dan mnemonics
   - Popup menus dan toolbars
   - System tray integration

9. **Data Management**
   - Table models (DefaultTableModel)
   - List models dan combo box models
   - File I/O operations
   - CSV import/export functionality

10. **Professional UI Design**
    - Look and Feel customization
    - Color schemes dan typography
    - Icons dan images
    - Responsive design principles

### 💪 Aplikasi Praktis
**Aplikasi Kontak Manager (Professional GUI Application)**
- **CRUD Operations:** Create, Read, Update, Delete kontak
- **Real-time Search:** Pencarian berdasarkan nama atau telepon
- **Data Import/Export:** CSV file support dengan proper escaping
- **Form Validation:** Input validation dengan user-friendly messages
- **Professional UI:** JSplitPane layout dengan resizable panels
- **Table Management:** JTable dengan sorting dan filtering
- **Status Bar:** Informasi jumlah kontak dan status operasi
- **ToolTips:** Guidance untuk pengguna
- **Error Handling:** Comprehensive exception handling
- **Data Persistence:** In-memory storage dengan file operations

**Konsep Lanjutan yang Diterapkan:**
✅ **Advanced Components:** JTable, JSplitPane, JFileChooser
✅ **Complex Layouts:** GridBagLayout untuk form, BorderLayout untuk main
✅ **Event Handling:** Multiple listeners, key events, table selection
✅ **Data Models:** Custom data structures, table models
✅ **File Operations:** CSV import/export dengan proper validation
✅ **Professional UI:** Consistent styling, proper spacing, tooltips
✅ **MVC Pattern:** Separation of data, view, and controller logic
✅ **Error Handling:** User-friendly error messages dan validation
✅ **Performance:** Efficient data structures dan smooth UI updates
✅ **User Experience:** Intuitive interface dengan keyboard shortcuts

**Fitur Advanced:**
- Real-time search dengan key listener
- Form validation dengan regex patterns
- CSV import/export dengan error handling
- Table sorting dan filtering
- Professional color scheme dan fonts
- Responsive layout yang dapat diresize
- Status bar dengan real-time updates
- ToolTips untuk user guidance
- Keyboard shortcuts untuk power users
- Data validation dengan proper error messages

### 📋 Latihan Soal
- 10 pilihan ganda (konsep GUI hingga advanced)
- 7 soal praktik (Hello World → Contact Manager)
- 6 project lengkap (Calculator → Image Viewer)
- 1 final challenge (Restaurant Management GUI)

### 📚 Materi Tambahan
- **NetBeans GUI Builder Guide:** Panduan lengkap menggunakan GUI builder
- **Contoh Kode Sederhana:** 8 aplikasi demo dari basic hingga advanced
- **Glossarium:** 100+ istilah GUI programming
- **FAQ:** 28 pertanyaan dan jawaban komprehensif
- **Best Practices:** Tips dan tricks untuk professional GUI development

---

## 📊 STATISTIK MATERI

| TUWEB | Materi | Contoh Kode | Aplikasi | Latihan | Total File |
|-------|--------|-------------|----------|---------|------------|
| **1** | 1 file (23 hal) | 4 file Java | 2 file Java + README | PG + Praktik + Project | 9 file |
| **2** | 1 file (26 hal) | 3 file Java | 4 file Java + README | PG + Praktik + Project | 10 file |
| **3** | 1 file (25 hal) | 1 file Java | 1 file Java + README | PG + Praktik + Project | 15+ file |
| **TOTAL** | **3 file** | **8 file Java** | **8 file Java + 4 README** | **30 PG + 28 Praktik + 3 Project** | **34+ file** |

---

## 🎓 METODE PEMBELAJARAN

### Learning by Doing
Setiap TUWEB dirancang dengan pendekatan hands-on:
1. **Materi Teoritis** - Penjelasan konsep dengan analogi sederhana
2. **Contoh Kode** - Step-by-step dengan komentar lengkap
3. **Aplikasi Praktis** - Project nyata yang bisa langsung dijalankan
4. **Latihan Soal** - Uji pemahaman dengan tingkat kesulitan bertahap

### Karakteristik Materi
✅ **Bahasa Indonesia** yang baik dan benar
✅ **Gaya ramah** dan mudah dipahami mahasiswa awam
✅ **Terstruktur** dengan hierarki yang jelas
✅ **Detail** dengan penjelasan setiap baris kode
✅ **Menarik** dengan emoji, diagram, dan format rapi
✅ **Praktis** dengan panduan NetBeans step-by-step

---

## 💻 TOOLS & TEKNOLOGI

- **IDE:** NetBeans (versi terbaru)
- **Java:** JDK 8 atau lebih baru
- **Library:** Java Swing untuk GUI
- **OS:** Windows, Mac, atau Linux

---

## 🎯 HUBUNGAN DENGAN TUGAS PRAKTIK

### TUWEB 1 → Tugas Praktik 2
Perulangan digunakan untuk:
- Input menu berulang (while)
- Validasi input (do-while)
- Menampilkan daftar menu (for)
- Menghitung total (for)

### TUWEB 2 → Tugas Praktik 3
Inheritance digunakan untuk:
- Hierarki MenuItem → Makanan, Minuman, Diskon
- Method overriding (tampilMenu)
- Polymorphism (ArrayList<MenuItem>)

### TUWEB 3 → Pengembangan Tugas
GUI untuk:
- Form input yang user-friendly
- Tombol-tombol interaktif
- Tampilan hasil yang menarik
- Aplikasi desktop profesional

---

## 📝 CARA MENGGUNAKAN MATERI

### Untuk Dosen (Pak Anton):
1. **Persiapan Tuweb:**
   - Baca materi lengkap di file `01_Materi_Lengkap.md`
   - Siapkan demo aplikasi di NetBeans
   - Test semua contoh kode sebelum sesi

2. **Saat Tuweb:**
   - Jelaskan konsep dengan materi lengkap
   - Demo aplikasi praktis
   - Live coding dengan mahasiswa
   - Berikan latihan soal untuk dikerjakan

3. **Follow-up:**
   - Mahasiswa mengerjakan latihan soal
   - Review dan diskusi kesulitan
   - Persiapan untuk tugas praktik

### Untuk Mahasiswa:
1. **Baca materi lengkap** - Pahami konsep
2. **Jalankan contoh kode** - Praktik langsung
3. **Pelajari aplikasi** - Analisis kode aplikasi
4. **Kerjakan latihan** - Uji pemahaman
5. **Kembangkan project** - Modifikasi dan improvisasi

---

## ✨ KEUNGGULAN MATERI

1. **Komprehensif**
   - Teori + Praktik seimbang
   - Dari basic hingga advanced

2. **Mudah Dipahami**
   - Bahasa sederhana
   - Analogi kehidupan sehari-hari
   - Komentar lengkap di setiap kode

3. **Praktis**
   - Aplikasi nyata yang bermanfaat
   - Panduan NetBeans detail
   - Troubleshooting tips

4. **Terstruktur**
   - Hierarki materi jelas
   - Progresif (mudah → sulit)
   - Konsisten di 3 TUWEB

5. **Engaging**
   - Format menarik
   - Visual descriptions
   - Challenge project

---

## 🚀 NEXT STEPS

### Untuk Pengembangan Lebih Lanjut:
1. **Video Tutorial** - Rekam penjelasan materi
2. **Slide Presentasi** - Buat PPT untuk Tuweb
3. **Quiz Online** - Platform assessment
4. **Database Integration** - Tambahkan materi database
5. **Web Version** - Konversi ke web app

---

## 📞 SUPPORT

Jika ada pertanyaan atau masalah teknis:
- **GitHub Issues:** [Link repository]
- **Email:** [Email dosen]
- **Forum Diskusi:** [Link forum UT]

---

## 🎉 PENUTUP

Materi TUWEB ini dirancang khusus untuk mahasiswa Universitas Terbuka agar dapat belajar pemrograman berbasis desktop dengan mudah dan menyenangkan. Semua materi dibuat dengan pendekatan **Learning by Doing** sehingga mahasiswa tidak hanya memahami teori, tetapi juga dapat langsung mempraktikkannya.

**Selamat mengajar dan selamat belajar!** 🚀

---

**Dibuat dengan ❤️ untuk mahasiswa Universitas Terbuka**
**© 2025 - Anton Prafanto - Universitas Mulawarman**

---

## 📄 FILE CHECKLIST

### TUWEB 1 ✅
- [x] Materi Lengkap
- [x] ContohFor.java
- [x] ContohWhile.java
- [x] ContohDoWhile.java
- [x] ContohNestedLoop.java
- [x] Produk.java
- [x] KasirMinimarket.java
- [x] README (Panduan NetBeans)
- [x] Latihan Soal

### TUWEB 2 ✅
- [x] Materi Lengkap
- [x] ContohInheritanceBasic.java
- [x] ContohSuper.java
- [x] ContohOverriding.java
- [x] Kendaraan.java
- [x] Motor.java
- [x] Mobil.java
- [x] ManajemenKendaraan.java
- [x] README (Panduan NetBeans)
- [x] Latihan Soal

### TUWEB 3 ✅
- [x] Materi Lengkap (01_konsep_gui.md)
- [x] Latihan GUI (01_Latihan_GUI.md)
- [x] Latihan Lengkap (02_Latihan_Lengkap.md)
- [x] Aplikasi Kontak Manager (AplikasiKontakManager.java)
- [x] Penjelasan Aplikasi (02_Penjelasan_Aplikasi.md)
- [x] README (Panduan Penggunaan)
- [x] Panduan NetBeans (01_Panduan_NetBeans.md)
- [x] Contoh Kode Sederhana (02_Contoh_Kode_Sederhana.java)
- [x] Glossarium (03_Glossarium.md)
- [x] FAQ (04_FAQ.md)
- [x] README Panduan Tambahan

### DOKUMENTASI ✅
- [x] RINGKASAN_MATERI_TUWEB.md
- [x] todo.md (Perencanaan)
- [x] CLAUDE.md (Instruksi)

**STATUS: SEMUA MATERI LENGKAP 100% - DENGAN TUWEB 3 GUI YANG LENGKAP** ✅✅✅
