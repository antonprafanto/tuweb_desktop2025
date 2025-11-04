# TUWEB 4: GUI Desktop

## Tutorial Ke-4 - Pemrograman Berbasis Desktop
**STSI4201** | Universitas Terbuka

---

## 📚 Deskripsi

Materi Tutorial Web (TUWEB) ini membahas tentang pembuatan **Graphical User Interface (GUI)** untuk aplikasi desktop menggunakan Java Swing. Mahasiswa akan belajar membuat aplikasi desktop yang user-friendly dengan antarmuka grafis lengkap.

### Topik yang Dibahas:
- Konsep GUI dan perbedaannya dengan CLI
- Komponen Swing (JFrame, JPanel, JButton, JTextField, dll)
- Event Handling (ActionListener, MouseListener)
- Layout Manager (FlowLayout, BorderLayout, GridLayout)
- JTable untuk menampilkan data
- Form input dan validasi
- Styling dan user experience

---

## 🎯 Capaian Pembelajaran

Setelah mempelajari materi ini, mahasiswa diharapkan mampu:
1. ✅ Memahami konsep GUI programming
2. ✅ Membuat window aplikasi dengan JFrame
3. ✅ Menggunakan berbagai komponen Swing
4. ✅ Menerapkan event handling untuk interaksi user
5. ✅ Mengatur layout dengan Layout Manager
6. ✅ Membuat aplikasi desktop yang fungsional dan menarik

---

## 📁 Struktur Folder

```
TUWEB_4_GUI_Desktop/
├── 01_Materi_Pembelajaran/
│   └── 01_konsep_gui.md
├── 02_Latihan_dan_Praktik/
│   ├── 01_Latihan_Dasar.md
│   └── 02_Latihan_Menengah.md
├── 03_Aplikasi_Utama/
│   ├── AplikasiPengelolaTugasKuliah.java
│   └── README.md
├── 04_Panduan_Tambahan/
│   ├── 01_Panduan_NetBeans_GUI_Builder.md
│   └── 02_FAQ.md
└── README.md (file ini)
```

---

## 🚀 Cara Belajar

### Tahap 1: Pahami Konsep (2-3 jam)
1. Baca materi GUI dasar
2. Pahami komponen Swing
3. Pelajari event handling
4. Memahami Layout Manager

### Tahap 2: Latihan Bertahap (5-6 jam)
1. Buat window sederhana
2. Tambahkan komponen (button, label, textfield)
3. Implementasi event handling
4. Buat form lengkap
5. Gunakan JTable

### Tahap 3: Aplikasi Utama (4-5 jam)
1. Pelajari Aplikasi Pengelola Tugas Kuliah
2. Pahami struktur kode
3. Jalankan dan test semua fitur
4. Modifikasi sesuai kebutuhan

---

## 💻 Aplikasi Utama

### 📚 Aplikasi Pengelola Tugas Kuliah

**Deskripsi**: Aplikasi GUI desktop untuk mengelola tugas-tugas kuliah mahasiswa dengan fitur lengkap.

**Screenshot Fitur**:
```
┌───────────────────────────────────────────────┐
│  📚 PENGELOLA TUGAS KULIAH                    │
├─────────────────┬─────────────────────────────┤
│  FORM TUGAS     │  DAFTAR TUGAS              │
│                 │  ┌─────────────────────┐    │
│  Judul: [____]  │  │ Filter │ Tabel    │    │
│  Matkul: [v]    │  └─────────────────────┘    │
│  Deskripsi:     │                             │
│  [_______]      │                             │
│  Deadline: [__] │                             │
│  Status: [v]    │                             │
│  Prioritas: [v] │                             │
│                 │                             │
│  [Tambah][Edit] │                             │
│  [Hapus][Clear] │                             │
└─────────────────┴─────────────────────────────┘
│  Total: 10 | Pending: 3 | Progress: 5 | Done: 2│
└───────────────────────────────────────────────┘
```

**Fitur Utama**:
- ✅ **CRUD Tugas**: Tambah, Edit, Hapus tugas
- ✅ **Kategorisasi**: Berdasarkan mata kuliah
- ✅ **Status Tracking**: Pending, In Progress, Completed
- ✅ **Prioritas**: Rendah, Sedang, Tinggi
- ✅ **Filter**: Berdasarkan status dan mata kuliah
- ✅ **Statistik**: Real-time dashboard
- ✅ **Validasi**: Form validation
- ✅ **User-friendly**: Interface intuitif dengan warna

**Komponen GUI yang Digunakan**:
- **JFrame**: Window utama
- **JPanel**: Container dan grouping
- **JTable**: Menampilkan daftar tugas
- **JTextField**: Input judul dan deadline
- **JTextArea**: Input deskripsi multi-line
- **JComboBox**: Dropdown untuk mata kuliah, status, prioritas, filter
- **JButton**: Tombol aksi (Tambah, Edit, Hapus, Clear)
- **JLabel**: Label dan statistik
- **JSplitPane**: Split panel form dan tabel
- **BorderLayout, BoxLayout, FlowLayout**: Layout management

**Event Handling**:
- **ActionListener**: Handle button click
- **MouseListener**: Double click pada tabel untuk edit
- **ComboBox selection**: Filter otomatis

**Cara Menjalankan**:
1. Buka NetBeans IDE
2. Import file `AplikasiPengelolaTugasKuliah.java`
3. Compile dan Run
4. Explore semua fitur:
   - Tambah tugas baru
   - Edit tugas existing (double click di tabel)
   - Hapus tugas
   - Filter berdasarkan status dan mata kuliah
   - Lihat statistik detail

---

## 🎨 Fitur Visual

### Color Scheme
- **Header**: Blue (#3498db)
- **Background**: Light gray (#ecf0f1)
- **Success**: Green (#2ecc71)
- **Warning**: Orange (#f39c12)
- **Danger**: Red (#e74c3c)
- **Info**: Dark blue (#34495e)

### Layout
- **Split Panel**: Form di kiri, tabel di kanan
- **Responsive**: Bisa resize window
- **Clean**: Interface bersih dan terorganisir

---

## 🛠️ Tools yang Dibutuhkan

- **JDK** (Java Development Kit) versi 8+
- **NetBeans IDE** versi 12+ dengan GUI Builder
- **OS**: Windows/Mac/Linux

### Instalasi NetBeans GUI Builder
Lihat panduan di `04_Panduan_Tambahan/01_Panduan_NetBeans_GUI_Builder.md`

---

## 📝 Checklist Pembelajaran

- [ ] Memahami konsep GUI vs CLI
- [ ] Mengenal komponen Swing dasar
- [ ] Bisa membuat JFrame
- [ ] Memahami event handling
- [ ] Menguasai Layout Manager
- [ ] Bisa menggunakan JTable
- [ ] Memahami form validation
- [ ] Menyelesaikan latihan dasar
- [ ] Menyelesaikan latihan menengah
- [ ] Memahami aplikasi Pengelola Tugas
- [ ] Bisa modifikasi dan customize

---

## ❓ FAQ Singkat

**Q: Swing vs JavaFX, mana yang lebih baik?**
A: Swing lebih mature dan stable, JavaFX lebih modern tapi kompleks. Untuk pembelajaran, Swing lebih mudah.

**Q: Bagaimana cara membuat GUI responsive?**
A: Gunakan Layout Manager (jangan null layout), set component size relative, handle window resize event.

**Q: Kenapa GUI saya tidak muncul?**
A: Pastikan `setVisible(true)` dipanggil di akhir, setelah semua komponen ditambahkan.

**Q: Bagaimana cara styling komponen?**
A: Gunakan `setBackground()`, `setForeground()`, `setFont()`, dan `setBorder()`.

Lihat FAQ lengkap di `04_Panduan_Tambahan/02_FAQ.md`

---

## 💡 Tips Sukses

1. **Rancang UI di kertas dulu** - sketch layout sebelum coding
2. **Gunakan Layout Manager** - hindari absolute positioning
3. **Modular design** - pisahkan UI creation per panel
4. **Konsisten dalam styling** - gunakan color scheme yang sama
5. **Test di berbagai ukuran window** - pastikan responsive
6. **User-friendly** - tambahkan validasi dan feedback

---

## 🎓 Best Practices

### 1. Separation of Concerns
```java
// Pisahkan UI creation dan business logic
private void setupUI() { ... }    // UI only
private void tambahTugas() { ... } // Logic only
```

### 2. Event Handling
```java
// Gunakan lambda atau method reference
button.addActionListener(e -> handleClick());
```

### 3. Resource Management
```java
// Dispose frame dengan benar
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
```

### 4. Thread Safety
```java
// Update GUI di EDT (Event Dispatch Thread)
SwingUtilities.invokeLater(() -> {
    // Update GUI here
});
```

---

## 📚 Referensi

1. Modul 9 UT: Membuat Aplikasi
2. Oracle Swing Tutorial: https://docs.oracle.com/javase/tutorial/uiswing/
3. NetBeans GUI Builder Guide
4. Java Swing Documentation

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
| 1 | Baca materi konsep GUI | 3 jam |
| 1 | Latihan dasar (window, komponen) | 3 jam |
| 2 | Latihan menengah (form, event) | 4 jam |
| 2 | JTable dan layout advanced | 3 jam |
| 3 | Pelajari aplikasi utama | 4 jam |
| 3 | Modifikasi & eksplorasi | 3 jam |
| **Total** | | **20 jam** |

---

## 🏆 Evaluasi

Kriteria penilaian:
- ✅ Pemahaman komponen GUI (20%)
- ✅ Implementasi event handling (20%)
- ✅ Layout yang baik (20%)
- ✅ Fungsionalitas lengkap (20%)
- ✅ User experience (20%)

---

## 🎯 Challenge

Setelah menguasai aplikasi ini, coba tambahkan fitur:
1. **Export to CSV**: Export daftar tugas ke file CSV
2. **Search**: Fitur pencarian tugas
3. **Sort**: Sort tabel berdasarkan kolom
4. **Reminder**: Notifikasi untuk tugas yang mendekati deadline
5. **Database**: Simpan data ke SQLite database
6. **Charts**: Grafik statistik dengan JFreeChart

---

**Selamat Belajar GUI Programming! 🎨**

*"Good design is obvious. Great design is transparent." - Joe Sparano*

---

© 2025 Anton Prafanto, S.Kom, M.T. | Universitas Terbuka
