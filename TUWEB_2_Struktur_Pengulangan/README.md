# TUWEB 2: Struktur Pengulangan (Looping)

## Tutorial Ke-2 - Pemrograman Berbasis Desktop
**STSI4201** | Universitas Terbuka

---

## 📚 Deskripsi

Materi Tutorial Web (TUWEB) ini membahas tentang **Struktur Pengulangan** dalam bahasa pemrograman Java dengan pendekatan **Learning by Doing**. Mahasiswa akan belajar melalui praktik langsung dengan berbagai contoh kasus nyata.

### Topik yang Dibahas:
- Loop `for` - untuk iterasi dengan jumlah yang pasti
- Loop `for-each` - untuk iterasi array/collection
- Loop `while` - untuk iterasi dengan kondisi dinamis
- Loop `do-while` - untuk iterasi yang minimal 1 kali
- Nested loop (loop bersarang)
- Break dan Continue statements

---

## 🎯 Capaian Pembelajaran

Setelah mempelajari materi ini, mahasiswa diharapkan mampu:
1. ✅ Memahami konsep dasar struktur pengulangan
2. ✅ Mengidentifikasi kapan menggunakan setiap jenis loop
3. ✅ Mengimplementasikan loop dalam berbagai kasus
4. ✅ Mengombinasikan loop dengan struktur keputusan
5. ✅ Membuat aplikasi berbasis loop yang fungsional

---

## 📁 Struktur Folder

```
TUWEB_2_Struktur_Pengulangan/
├── 01_Materi_Pembelajaran/
│   └── 01_konsep_struktur_pengulangan.md
├── 02_Latihan_dan_Praktik/
│   ├── 01_Latihan_Dasar.md
│   └── 02_Latihan_Menengah.md
├── 03_Aplikasi_Utama/
│   ├── SistemKalkulatorStatistik.java
│   └── README.md
├── 04_Panduan_Tambahan/
│   ├── 01_Panduan_NetBeans.md
│   ├── 02_FAQ.md
│   └── 03_Glossarium.md
└── README.md (file ini)
```

---

## 🚀 Cara Belajar

### Tahap 1: Pahami Konsep (1-2 jam)
1. Baca materi di folder `01_Materi_Pembelajaran`
2. Pahami perbedaan setiap jenis loop
3. Perhatikan contoh-contoh kode

### Tahap 2: Latihan Dasar (2-3 jam)
1. Buka `02_Latihan_dan_Praktik/01_Latihan_Dasar.md`
2. Kerjakan semua latihan secara berurutan
3. Ketik kode sendiri, jangan copy-paste
4. Jalankan dan amati hasilnya

### Tahap 3: Latihan Menengah (3-4 jam)
1. Buka `02_Latihan_dan_Praktik/02_Latihan_Menengah.md`
2. Kerjakan studi kasus yang lebih kompleks
3. Kombinasikan loop dengan array dan decision
4. Modifikasi kode untuk eksplorasi

### Tahap 4: Aplikasi Utama (3-4 jam)
1. Pelajari aplikasi Sistem Kalkulator Statistik
2. Pahami alur program dan setiap fungsi
3. Jalankan dan test berbagai fitur
4. Coba modifikasi atau tambahkan fitur baru

---

## 💻 Aplikasi Utama

### Sistem Kalkulator Statistik Sederhana

**Deskripsi**: Aplikasi untuk menganalisis data nilai mahasiswa dengan berbagai perhitungan statistik.

**Fitur**:
- ✅ Input data nilai mahasiswa
- ✅ Perhitungan statistik dasar (rata-rata, max, min)
- ✅ Perhitungan statistik lanjutan (median, modus, standar deviasi)
- ✅ Distribusi nilai dalam rentang tertentu
- ✅ Laporan lengkap dengan grafik sederhana
- ✅ Validasi input

**Konsep Loop yang Digunakan**:
- `for` loop untuk input dan iterasi data
- `for-each` loop untuk perhitungan statistik
- `while` loop untuk validasi input
- `do-while` loop untuk menu aplikasi
- Nested loop untuk sorting dan perhitungan modus

**Cara Menjalankan**:
1. Buka NetBeans
2. Import file `SistemKalkulatorStatistik.java`
3. Compile dan Run
4. Ikuti petunjuk di layar

---

## 🛠️ Tools yang Dibutuhkan

- **JDK** (Java Development Kit) versi 8 atau lebih baru
- **NetBeans IDE** versi 12 atau lebih baru (atau IDE Java lainnya)
- **Windows/Mac/Linux** OS

### Instalasi NetBeans
Lihat panduan lengkap di `04_Panduan_Tambahan/01_Panduan_NetBeans.md`

---

## 📝 Checklist Pembelajaran

- [ ] Membaca dan memahami konsep struktur pengulangan
- [ ] Menyelesaikan semua latihan dasar (13 latihan)
- [ ] Menyelesaikan latihan menengah (4 studi kasus)
- [ ] Memahami dan menjalankan aplikasi utama
- [ ] Mencoba modifikasi kode
- [ ] Mengerjakan latihan mandiri

---

## ❓ FAQ

**Q: Kapan menggunakan for vs while?**
A: Gunakan `for` jika jumlah iterasi sudah diketahui, gunakan `while` jika bergantung pada kondisi dinamis.

**Q: Apa bedanya while dan do-while?**
A: `while` cek kondisi di awal (bisa 0x eksekusi), `do-while` cek di akhir (minimal 1x eksekusi).

**Q: Bagaimana menghindari infinite loop?**
A: Pastikan ada kondisi yang akan menjadi FALSE dan update variabel kondisi di dalam loop.

Lihat FAQ lengkap di `04_Panduan_Tambahan/02_FAQ.md`

---

## 📚 Referensi

1. Modul 5 UT: Struktur Pengulangan
2. Horstmann, C. (2015). Big Java Early Objects. Wiley.
3. Oracle Java Documentation: Control Flow Statements
4. https://docs.oracle.com/javase/tutorial/java/nutsandbolts/flow.html

---

## 👨‍🏫 Dosen Pengampu

**Anton Prafanto, S.Kom, M.T.**
- Dosen Program Studi Informatika
- Universitas Mulawarman
- Tutor Universitas Terbuka

---

## 📧 Kontak & Dukungan

Jika ada pertanyaan atau kesulitan:
1. Tanyakan saat sesi tutorial
2. Diskusikan di forum Tuton
3. Email ke tutor

---

## 📅 Timeline Belajar (Rekomendasi)

| Minggu | Aktivitas | Durasi |
|--------|-----------|--------|
| 1 | Baca materi konsep | 2 jam |
| 1 | Latihan dasar (1-7) | 3 jam |
| 2 | Latihan dasar (8-13) | 3 jam |
| 2 | Latihan menengah | 4 jam |
| 3 | Aplikasi utama | 4 jam |
| 3 | Review & latihan mandiri | 2 jam |
| **Total** | | **18 jam** |

---

## 💡 Tips Sukses

1. **Ketik kode sendiri** - jangan hanya membaca atau copy-paste
2. **Eksperimen** - ubah nilai, tambahkan fitur, lihat apa yang terjadi
3. **Debug** - jika error, baca pesan error dan cari solusinya
4. **Konsisten** - belajar sedikit tapi rutin lebih baik dari banyak sekali
5. **Bertanya** - jangan ragu bertanya jika ada yang kurang jelas

---

## 🏆 Evaluasi

Kriteria penilaian:
- ✅ Pemahaman konsep (30%)
- ✅ Penyelesaian latihan (30%)
- ✅ Implementasi aplikasi (40%)

---

## 📜 Lisensi

© 2025 Anton Prafanto, S.Kom, M.T.
Materi ini dibuat untuk keperluan pendidikan di Universitas Terbuka.

---

**Selamat Belajar! 🚀**

*"The only way to learn programming is by writing programs." - Dennis Ritchie*
