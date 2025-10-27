# TUWEB 4 - Aktivitas Belajar 14
# GUI Pertama dengan NetBeans (SUPER FRIENDLY!)

**Mata Kuliah**: STSI4201 - Pemrograman Berbasis Desktop  
**Tutor**: Anton Prafanto, S.Kom., M.T.  
**Metode**: Learning by Doing  
**Durasi**: 60-65 menit  
**Note**: TUWEB ini sedikit lebih panjang karena materi GUI sangat exciting dan hands-on!  
**Target**: Mahasiswa yang sudah bisa coding Java dasar dan OOP sederhana

---

## 1. PEMBUKAAN (3 menit)

Assalamu'alaikum warahmatullahi wabarakatuh. Salam sejahtera untuk kita semua.

Halo teman-teman! Selamat datang di **TUWEB terakhir** kita! Ini adalah sesi paling exciting! 🎉

### Perjalanan Amazing Kita!

Dari TUWEB 1 sampai sekarang, luar biasa apa yang sudah teman-teman pelajari:
- ✅ **TUWEB 1**: Hello World, Class, Object
- ✅ **TUWEB 2**: For Loop, While Loop
- ✅ **TUWEB 3**: Inheritance (Pewarisan)
- ✅ **AB 11**: Encapsulation (Getter/Setter)
- ✅ **AB 12**: Polymorphism (sudah Tugas 3 juga!)

**Sekarang saatnya LEVEL UP: Membuat Aplikasi dengan WINDOW!** 🖥️✨

### Dari Console ke Window!

Selama ini program kita hanya **text** di console (layar hitam):
```
Hello World!
Nama: Budi
```

**Membosankan, kan?** 😅

**Hari ini kita akan membuat aplikasi PROFESIONAL dengan:**
- ✅ Window yang cantik
- ✅ Button yang bisa diklik
- ✅ Text field untuk input
- ✅ Seperti aplikasi-aplikasi yang teman-teman pakai sehari-hari!

**Exciting banget, kan?!** 🚀

### Yang Akan Kita Buat Hari Ini:

1. **Form Sapaan Sederhana**
   - Input nama
   - Klik tombol
   - Muncul sapaan!

2. **Kalkulator Sederhana**
   - Input 2 angka
   - Tombol +, -, ×, ÷
   - Hasil muncul!

**Dan yang terbaik:** Kita akan pakai **DRAG & DROP** di NetBeans! Tidak perlu ketik kode panjang! 😎

### Yang Perlu Disiapkan:

- ✅ NetBeans sudah terbuka
- ✅ Siap belajar hal baru
- ✅ Excited! 💪

**Let's go!** 🏃‍♂️💨

---

## 2. TUJUAN PEMBELAJARAN

Setelah mengikuti TUWEB ini, teman-teman akan **BISA**:

1. **Membuat JFrame Form** di NetBeans dengan drag & drop
   - Tidak perlu ketik kode panjang!

2. **Menambahkan komponen GUI** ke form:
   - JLabel (untuk label/tulisan)
   - JTextField (untuk input text)
   - JButton (untuk tombol yang bisa diklik)

3. **Membuat tombol "hidup"** dengan event handling
   - Tombol diklik → Ada aksi!
   - Tidak hanya tampilan saja

4. **Membuat aplikasi sederhana** yang fungsional
   - Form sapaan
   - Kalkulator basic

**Setelah ini, teman-teman bisa bilang: "Saya bisa bikin aplikasi desktop!"** 🏆

---

## 3. PERSIAPAN NETBEANS (3 menit)

### A. Buat Project Baru

**Langkah Cepat**:
1. File → New Project
2. Java with Ant → Java Application
3. **Project Name**: `AplikasiGUI`
4. **Create Main Class**: ✅ Centang (biarkan default)
5. Finish

### B. Mengenal Form Designer NetBeans

NetBeans punya fitur SUPER KEREN: **Form Designer (GUI Builder)**

Dengan Form Designer, kita bisa:
- **Drag & drop** komponen
- **Ubah properties** dengan klik-klik
- **Design visual** tanpa ketik kode banyak!

**Ini yang membuat NetBeans spesial untuk belajar GUI!** 🌟

---

## 4. KONSEP SINGKAT: Dari Console ke Window (5 menit)

### Program Console (Yang Selama Ini Kita Buat)

```java
public static void main(String[] args) {
    System.out.println("Hello World!");
}
```

**Outputnya:**
```
Hello World!
```

**Ciri-ciri:**
- Layar hitam/putih polos
- Hanya text
- Tidak ada tombol, tidak ada warna
- Kurang menarik 😐

### Program GUI (Graphical User Interface)

**Outputnya:**
```
┌─────────────────────────┐
│   Aplikasi Saya         │ ← Title Bar
├─────────────────────────┤
│                         │
│  [Button] [TextField]   │ ← Komponen
│                         │
└─────────────────────────┘
```

**Ciri-ciri:**
- Ada window/jendela
- Ada tombol, text box, dll
- Bisa diklik-klik
- Lebih menarik dan user-friendly! 😍

### Komponen Dasar GUI

| Komponen | Fungsi | Analogi |
|----------|--------|---------|
| **JFrame** | Window/jendela utama | Rumah |
| **JPanel** | Container untuk komponen | Ruangan dalam rumah |
| **JLabel** | Menampilkan text/label | Tulisan di dinding |
| **JTextField** | Input text (1 baris) | Kotak isian formulir |
| **JButton** | Tombol yang bisa diklik | Tombol lampu/bell |

**Hari ini kita fokus ke 3 komponen:** JLabel, JTextField, JButton

**Simpel, kan?** 😊

### Kenapa Belajar GUI Penting?

1. **Aplikasi Desktop** = GUI (Word, Excel, Photoshop, dll)
2. **User Experience** lebih baik daripada console
3. **Portofolio** - bisa pamer ke teman/keluarga!
4. **Lowongan Kerja** sering minta skill GUI
5. **Fondasi** untuk belajar Mobile App (Android/iOS)

**Mari kita mulai praktik!** 🚀

---

## 5. PRAKTIK GUIDED - "AYO IKUTI SAYA!" (30 menit)

Inilah bagian paling exciting! Kita akan membuat aplikasi GUI pertama kita! 🎉

---

### 📝 PRAKTIK 1: Membuat JFrame Form (Window Pertama)

**"Kita akan membuat window kosong dulu!"**

#### LANGKAH DEMI LANGKAH:

**Langkah 1**: Di panel Projects (kiri), cari package `aplikasigui`

**Langkah 2**: Klik kanan pada package `aplikasigui` → **New** → **JFrame Form...**

> 📸 **[Screenshot: Menu New → JFrame Form]**

**Langkah 3**: Isi data JFrame:
- **Class Name**: `FormSapaan`
- **Package**: biarkan `aplikasigui`
- Klik **Finish**

> 📸 **[Screenshot: Dialog New JFrame Form]**

**Langkah 4**: NetBeans akan membuka **Design View**

**Selamat! Ini adalah Form Designer!** 🎨

**Yang teman-teman lihat:**
- **Kiri**: Palette (kumpulan komponen yang bisa di-drag)
- **Tengah**: Design Area (canvas untuk design form)
- **Kanan**: Properties (untuk ubah properties komponen)
- **Bawah**: Ada 2 tab: **Design** dan **Source**

> 📸 **[Screenshot: Form Designer dengan label untuk setiap bagian]**

**Langkah 5**: Lihat bagian **Design Area** - ada form kosong!

Ini adalah JFrame kita! Window kosong yang siap diisi komponen! 🪟

---

### 📝 PRAKTIK 2: Menambahkan Komponen dengan Drag & Drop

**"Sekarang kita isi form dengan komponen!"**

#### A. Menambahkan JLabel (Label/Tulisan)

**Langkah 1**: Lihat panel **Palette** di kiri

**Langkah 2**: Cari kategori **Swing Controls** (biasanya sudah terbuka)

**Langkah 3**: Cari komponen **Label** (icon: A)

**Langkah 4**: **DRAG** Label dari Palette, **DROP** ke Design Area (form kita)

> 📸 **[Screenshot: Drag label dari palette]**

**Langkah 5**: Lihat! Ada label dengan text "jLabel1" muncul di form!

**Langkah 6**: **Ubah text label**:
- Klik label yang baru di-drop
- Lihat panel **Properties** di kanan
- Cari property **text**
- Ubah dari "jLabel1" menjadi **"Masukkan Nama:"**
- Enter

> 📸 **[Screenshot: Properties panel dengan text property]**

**Sekarang label menampilkan "Masukkan Nama:"** ✅

#### B. Menambahkan JTextField (Kotak Input)

**Langkah 1**: Di **Palette**, cari komponen **Text Field**

**Langkah 2**: **DRAG** Text Field, **DROP** di sebelah kanan label

> 📸 **[Screenshot: Form dengan label dan text field]**

**Langkah 3**: **Ubah Variable Name** (penting!):
- Klik text field yang baru
- Di panel Properties, cari **Variable Name**  
  (Atau klik kanan → Change Variable Name)
- Ubah dari "jTextField1" menjadi **"txtNama"**
- Enter

**Kenapa penting?** Karena kita akan pakai nama ini di kode! 📝

#### C. Menambahkan JButton (Tombol)

**Langkah 1**: Di Palette, cari **Button**

**Langkah 2**: Drag & Drop button di bawah text field

**Langkah 3**: Ubah **text** button:
- Klik button
- Properties → **text**
- Ubah menjadi **"Sapa!"**

**Langkah 4**: Ubah **Variable Name**:
- Klik button
- Change Variable Name
- Ubah menjadi **"btnSapa"**

#### D. Menambahkan JLabel untuk Hasil

**Langkah 1**: Drag & Drop **Label** lagi di bawah button

**Langkah 2**: Ubah **text** menjadi **kosong** (hapus "jLabel2")

**Langkah 3**: Ubah **Variable Name** menjadi **"lblHasil"**

**SEKARANG FORM KITA PUNYA:**
- ✅ Label "Masukkan Nama:"
- ✅ Text Field (txtNama)
- ✅ Button "Sapa!" (btnSapa)
- ✅ Label kosong untuk hasil (lblHasil)

**Tampilan form kita:**
```
┌─────────────────────────────┐
│ FormSapaan                  │
├─────────────────────────────┤
│                             │
│ Masukkan Nama: [________]   │ ← Label + TextField
│                             │
│        [  Sapa!  ]          │ ← Button
│                             │
│                             │ ← Label hasil (kosong dulu)
│                             │
└─────────────────────────────┘
```

**Bagus!** Design selesai! Sekarang kita beri "kehidupan" pada tombol! ⚡

---

### 📝 PRAKTIK 3: Event Handling - Membuat Tombol "Hidup"

**"Tombol sudah ada, tapi belum bisa apa-apa. Mari kita beri aksi!"**

#### LANGKAH:

**Langkah 1**: Pastikan masih di tab **Design**

**Langkah 2**: **DOUBLE-CLICK** pada button "Sapa!"

**BOOM!** NetBeans otomatis:
- Pindah ke tab **Source** (kode)
- Membuat method `btnSapaActionPerformed`
- Cursor sudah siap di dalam method!

> 📸 **[Screenshot: Method btnSapaActionPerformed yang ter-generate]**

**Teman-teman akan melihat kode seperti ini:**

```java
private void btnSapaActionPerformed(java.awt.event.ActionEvent evt) {
    // TODO add your handling code here:
    
}
```

**Langkah 3**: **HAPUS** komentar TODO

**Langkah 4**: **KETIK** kode berikut **DI DALAM** method:

```java
private void btnSapaActionPerformed(java.awt.event.ActionEvent evt) {
    // Ambil nama dari text field
    String nama = txtNama.getText();
    
    // Tampilkan sapaan di label hasil
    lblHasil.setText("Halo, " + nama + "! Selamat datang!");
}
```

**PENJELASAN KODE:**

```java
String nama = txtNama.getText();
```
- **Penjelasan**: Mengambil text yang diketik user di text field
- `txtNama` = variable name text field kita
- `.getText()` = method untuk mengambil isi text field
- Hasilnya disimpan di variabel `nama`

```java
lblHasil.setText("Halo, " + nama + "! Selamat datang!");
```
- **Penjelasan**: Menampilkan text di label hasil
- `lblHasil` = variable name label hasil kita
- `.setText()` = method untuk mengisi text di label
- `"Halo, " + nama + "!"` = gabungan text dengan nama user

**Simpel, kan?** 😊

**Langkah 5**: **SAVE** (Ctrl+S)

---

### 📝 PRAKTIK 4: JALANKAN APLIKASI PERTAMA!

**"Moment of truth! Mari kita jalankan aplikasi GUI pertama kita!"**

#### LANGKAH:

**Langkah 1**: Klik kanan pada file **FormSapaan.java** di panel Projects

**Langkah 2**: Pilih **Run File** (atau Shift+F6)

**Langkah 3**: **TUNGGU SEBENTAR...**

**DAN... TADAAA!** 🎉

**Window aplikasi muncul!**

```
┌─────────────────────────────┐
│ FormSapaan                  │
├─────────────────────────────┤
│                             │
│ Masukkan Nama: [________]   │
│                             │
│        [  Sapa!  ]          │
│                             │
│                             │
└─────────────────────────────┘
```

> 📸 **[Screenshot: Window FormSapaan yang muncul]**

**Langkah 4**: **TEST APLIKASI**:
- Ketik nama teman-teman di text field (misal: "Budi")
- Klik tombol "Sapa!"

**HASILNYA:**

```
┌─────────────────────────────┐
│ FormSapaan                  │
├─────────────────────────────┤
│                             │
│ Masukkan Nama: [Budi]       │
│                             │
│        [  Sapa!  ]          │
│                             │
│ Halo, Budi! Selamat datang! │ ← MUNCUL!
└─────────────────────────────┘
```

> 📸 **[Screenshot: Hasil setelah klik tombol]**

**SELAMAT! ANDA BARU SAJA MEMBUAT APLIKASI GUI PERTAMA YANG FUNGSIONAL!** 🎊🎉🥳

**Coba lagi dengan nama berbeda!** Tombol bisa diklik berkali-kali!

**AMAZING, KAN?!** 🌟

---

### 📝 PRAKTIK 5: Membuat Kalkulator Sederhana

**"Sekarang kita buat yang lebih menantang: Kalkulator!"**

#### LANGKAH MEMBUAT FORM BARU:

**Langkah 1**: Klik kanan package → New → JFrame Form

**Langkah 2**: Class Name: **FormKalkulator**

**Langkah 3**: Finish

#### DESIGN FORM KALKULATOR:

**Yang akan kita tambahkan:**

1. **Label**: "Angka 1:"
2. **TextField**: `txtAngka1`
3. **Label**: "Angka 2:"
4. **TextField**: `txtAngka2`
5. **Button**: "+" (`btnTambah`)
6. **Button**: "-" (`btnKurang`)
7. **Button**: "×" (`btnKali`)
8. **Button**: "÷" (`btnBagi`)
9. **Label**: "Hasil:" 
10. **Label**: `` (`lblHasil`)

**Langkah demi langkah:**

**A. Tambahkan Label & TextField untuk Angka 1:**
- Drag Label → text: "Angka 1:"
- Drag Text Field → variable name: `txtAngka1`

**B. Tambahkan Label & TextField untuk Angka 2:**
- Drag Label → text: "Angka 2:"
- Drag Text Field → variable name: `txtAngka2`

**C. Tambahkan 4 Button (sejajar):**
- Drag 4 Button ke form
- Button 1: text "+" → variable name: `btnTambah`
- Button 2: text "-" → variable name: `btnKurang`
- Button 3: text "×" → variable name: `btnKali`
- Button 4: text "÷" → variable name: `btnBagi`

**D. Tambahkan Label untuk Hasil:**
- Drag Label → text: "Hasil:"
- Drag Label → text: kosong → variable name: `lblHasil`

**Layout Kira-kira:**
```
┌─────────────────────────────┐
│ FormKalkulator              │
├─────────────────────────────┤
│ Angka 1: [________]         │
│                             │
│ Angka 2: [________]         │
│                             │
│  [+] [-] [×] [÷]            │
│                             │
│ Hasil:                      │
│                             │
└─────────────────────────────┘
```

> 📸 **[Screenshot: Design FormKalkulator]**

**Design selesai!** Sekarang kita coding! 💻

---

### 📝 PRAKTIK 6: Event Handling untuk Kalkulator

**"Kita beri fungsi ke setiap tombol!"**

#### A. TOMBOL TAMBAH (+)

**Langkah 1**: **Double-click** tombol "+"

**Langkah 2**: Ketik kode:

```java
private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {
    // Ambil angka dari text field
    int angka1 = Integer.parseInt(txtAngka1.getText());
    int angka2 = Integer.parseInt(txtAngka2.getText());
    
    // Hitung
    int hasil = angka1 + angka2;
    
    // Tampilkan hasil
    lblHasil.setText("Hasil: " + hasil);
}
```

**PENJELASAN:**

```java
int angka1 = Integer.parseInt(txtAngka1.getText());
```
- **Penjelasan**: Mengambil text dari text field, **UBAH** jadi angka integer
- `txtAngka1.getText()` = dapat text (String)
- `Integer.parseInt()` = ubah String jadi int
- **Penting!** User harus ketik angka, kalau ketik huruf akan error

```java
int hasil = angka1 + angka2;
```
- **Penjelasan**: Hitung penjumlahan biasa

```java
lblHasil.setText("Hasil: " + hasil);
```
- **Penjelasan**: Tampilkan hasil di label
- `hasil` (int) otomatis diubah jadi String

#### B. TOMBOL KURANG (-)

**Double-click** tombol "-", ketik:

```java
private void btnKurangActionPerformed(java.awt.event.ActionEvent evt) {
    int angka1 = Integer.parseInt(txtAngka1.getText());
    int angka2 = Integer.parseInt(txtAngka2.getText());
    
    int hasil = angka1 - angka2;  // ← Ini bedanya!
    
    lblHasil.setText("Hasil: " + hasil);
}
```

**Hanya beda di operasi: `-` instead of `+`**

#### C. TOMBOL KALI (×)

**Double-click** tombol "×", ketik:

```java
private void btnKaliActionPerformed(java.awt.event.ActionEvent evt) {
    int angka1 = Integer.parseInt(txtAngka1.getText());
    int angka2 = Integer.parseInt(txtAngka2.getText());
    
    int hasil = angka1 * angka2;  // ← Kali
    
    lblHasil.setText("Hasil: " + hasil);
}
```

#### D. TOMBOL BAGI (÷)

**Double-click** tombol "÷", ketik:

```java
private void btnBagiActionPerformed(java.awt.event.ActionEvent evt) {
    int angka1 = Integer.parseInt(txtAngka1.getText());
    int angka2 = Integer.parseInt(txtAngka2.getText());
    
    // Gunakan double untuk hasil desimal
    double hasil = (double) angka1 / angka2;
    
    lblHasil.setText("Hasil: " + hasil);
}
```

**Note**: Untuk bagi, kita pakai `double` agar bisa dapat hasil desimal (misal: 7/2 = 3.5)

**SAVE (Ctrl+S)**

---

### 📝 PRAKTIK 7: TEST KALKULATOR!

**"Saatnya test kalkulator kita!"**

#### LANGKAH:

**Langkah 1**: Klik kanan **FormKalkulator.java** → Run File

**Langkah 2**: Window kalkulator muncul!

**Langkah 3**: **TEST SEMUA OPERASI:**

**Test 1: Tambah**
- Angka 1: `10`
- Angka 2: `5`
- Klik tombol `+`
- Hasil: `Hasil: 15` ✅

**Test 2: Kurang**
- Angka 1: `10`
- Angka 2: `5`
- Klik tombol `-`
- Hasil: `Hasil: 5` ✅

**Test 3: Kali**
- Angka 1: `10`
- Angka 2: `5`
- Klik tombol `×`
- Hasil: `Hasil: 50` ✅

**Test 4: Bagi**
- Angka 1: `10`
- Angka 2: `3`
- Klik tombol `÷`
- Hasil: `Hasil: 3.3333333333333335` ✅

> 📸 **[Screenshot: Kalkulator berfungsi]**

**PERFECT! KALKULATOR BEKERJA!** 🎉

**Teman-teman baru saja membuat KALKULATOR sendiri!** 🧮

**Coba operasi lain!** Coba angka berbeda! Explore!

---

## 6. PRAKTIK MANDIRI - "GILIRAN KAMU!" (10 menit)

**"Nah sekarang giliran teman-teman berkreasi!"**

---

### ✏️ Latihan 1: Form Input Data Diri (BASIC)

**TUGAS**:
Buatlah form untuk input data diri dengan komponen:
- Label & TextField untuk **Nama**
- Label & TextField untuk **Alamat**
- Button **"Simpan"**
- Label kosong untuk menampilkan **hasil**

Saat button Simpan diklik, tampilkan:
```
Nama: [isi nama]
Alamat: [isi alamat]
```

**LANGKAH-LANGKAH**:
1. New → JFrame Form → Class Name: `FormDataDiri`
2. Design form (drag & drop komponen)
3. Double-click button Simpan
4. Tulis kode untuk ambil data dan tampilkan

**TIPS**:
- Mirip dengan FormSapaan
- Hanya ada 2 text field (nama dan alamat)
- Gabungkan text dengan `\n` untuk baris baru:
  ```java
  lblHasil.setText("<html>Nama: " + nama + "<br>Alamat: " + alamat + "</html>");
  ```

---

### ✏️ Latihan 2: Konversi Suhu (MEDIUM)

**TUGAS**:
Buat form konversi Celsius ke Fahrenheit:
- Input: Suhu dalam Celsius
- Button: "Konversi"
- Output: Suhu dalam Fahrenheit

**Rumus**: `F = (C × 9/5) + 32`

**CONTOH**:
- Input: 100
- Output: Hasil: 212.0 °F

**TIPS**:
- TextField untuk input Celsius
- Button "Konversi"
- Label untuk hasil
- Pakai rumus di atas

**KODE TEMPLATE**:
```java
double celsius = Double.parseDouble(txtCelsius.getText());
double fahrenheit = (celsius * 9/5) + 32;
lblHasil.setText("Hasil: " + fahrenheit + " °F");
```

---

### ✏️ Latihan 3: Kalkulator dengan Fitur Clear (CHALLENGE)

**TUGAS**:
Tambahkan button **"Clear"** di kalkulator yang fungsinya:
- Kosongkan isi text field 1 dan 2
- Kosongkan label hasil

**TIPS**:
- Buka FormKalkulator lagi
- Tambah 1 button "Clear"
- Double-click, tulis kode:
  ```java
  txtAngka1.setText("");
  txtAngka2.setText("");
  lblHasil.setText("");
  ```

**Kalau kesulitan, tidak apa-apa!**  
Fokus ke Latihan 1. Yang penting paham konsep! 😊

---

## 7. TROUBLESHOOTING UNTUK PEMULA (5 menit)

**"Masalah yang Sering Muncul & Solusinya"**

---

### ❗ ERROR 1: Form tidak muncul saat Run File

**Gejala**: Klik Run File, tapi window tidak muncul

**Penyebab**: Tidak ada method `main` di JFrame

**Solusi**:
1. Klik kanan di **Design Area** form
2. Pilih **Set Layout** → (pilih layout apapun) → Ini bukan solusi utama
3. **ATAU** pastikan ada method main:
   - Klik tab **Source**
   - Cari method `main`
   - Kalau tidak ada, klik kanan di editor → Insert Code → Main Method

---

### ❗ ERROR 2: NumberFormatException

**Pesan error:**
```
Exception in thread "AWT-EventQueue-0" java.lang.NumberFormatException: For input string: "abc"
```

**Penyebab**: User mengetik huruf/text di text field yang harusnya angka

**Solusi 1** (Validasi):
```java
try {
    int angka = Integer.parseInt(txtAngka1.getText());
    // Kode lanjutan...
} catch (NumberFormatException e) {
    lblHasil.setText("Error: Masukkan angka, bukan huruf!");
}
```

**Solusi 2** (Lebih sederhana):
- Beri instruksi jelas di label: "Masukkan ANGKA:"
- Atau buat validation di button handler

---

### ❗ ERROR 3: Tombol tidak respon saat diklik

**Gejala**: Tombol diklik, tidak terjadi apa-apa

**Penyebab**: Lupa double-click tombol untuk buat event handler

**Solusi**:
1. Kembali ke tab **Design**
2. **Double-click** tombol
3. NetBeans akan generate method event handler
4. Tulis kode di dalam method

---

### 💡 Tips NetBeans GUI Designer:

**1. Pakai Palette (Ctrl+Shift+8):**
- Kalau Palette hilang: Window → Palette

**2. Pakai Properties (Ctrl+Shift+7):**
- Kalau Properties hilang: Window → Properties

**3. Align Komponen:**
- Pilih beberapa komponen (Ctrl+Click)
- Klik kanan → Align → (pilih alignment)

**4. Resize Form:**
- Drag ujung form untuk perbesar/perkecil

**5. Preview Form (F6 di Design):**
- Lihat preview tanpa run

**6. Delete Komponen:**
- Klik komponen → tekan Delete

---

**Masih error atau bingung?**  
📧 Tanya di forum diskusi  
💬 Share screenshot form dan error-nya  
Pak Anton siap membantu! 💪

---

## 8. KETERKAITAN DENGAN TUGAS & REMINDER

**"Hubungannya dengan Tugas Teman-Teman"**

### Review Perjalanan Tugas

**Tugas 1** (AB 4): ✅ Class, Object, If-Else
**Tugas 2** (AB 8): ✅ UML, Perancangan
**Tugas 3** (AB 12): ✅ Polymorphism, Exception - **DEADLINE DEKAT!**

### Tugas 3 - Reminder Penting! ⏰

**Deadline: Aktivitas Belajar 15 (SEGERA!)**

**Tips Menyelesaikan Tugas 3:**
1. Pahami konsep Polymorphism dari materi AB 12
2. Gunakan inheritance (TUWEB 3)
3. Override method di child class
4. Gunakan try-catch untuk exception handling
5. **Rekam video praktik teman-teman!**
6. **SUBMIT SEBELUM DEADLINE!**

**Jangan sampai telat!** Nilai akan langsung E kalau salah satu tugas tidak dikerjakan! 😱

### Materi GUI untuk Project Akhir

**Materi GUI hari ini bisa teman-teman pakai untuk:**
- **Project akhir** (jika ada)
- **Portofolio** (tunjukkan ke calon employer!)
- **Aplikasi pribadi** (buat tools yang teman-teman butuhkan)

**Contoh aplikasi yang bisa dikembangkan:**
- Sistem Informasi Mahasiswa (dengan database - AB 15)
- Kasir Toko Sederhana
- Kalkulator Scientific
- Konverter Mata Uang
- To-Do List App

### Preview Aktivitas Belajar 15

**Minggu depan (AB 15):**
- **Topik**: Database (Koneksi Java dengan MySQL/SQLite)
- **Kita akan gabungkan:**
  - GUI (hari ini)
  - Database (minggu depan)
  - OOP (yang sudah dipelajari)
- **Hasilnya**: Aplikasi CRUD lengkap! (Create, Read, Update, Delete)

**Exciting!** Aplikasi profesional sedang menunggu! 🚀

---

## 9. AJAKAN DISKUSI (3-5 pertanyaan sederhana)

**"Yuk Diskusi di Forum!"**

Silakan diskusikan di **Forum Diskusi AB 12**:

### 1. Share Aplikasi GUI Pertama! 🎉
**"Sudah berhasil bikin form sapaan atau kalkulator? Share screenshot aplikasi teman-teman yang sedang running!"**

Yang bisa di-share:
- Screenshot window aplikasi
- Screenshot design di NetBeans
- Screenshot saat tombol diklik dan hasil muncul

### 2. Dari Console ke GUI - Perasaan Teman-Teman? 😍
**"Bagaimana perasaan teman-teman saat pertama kali lihat aplikasi GUI sendiri berjalan?"**

Share pengalaman:
- Excited? Proud? Surprised?
- Lebih suka GUI atau console?
- Apa yang paling wow?

### 3. Ide Aplikasi Kreatif 💡
**"Kalau teman-teman mau bikin aplikasi GUI sendiri, mau bikin apa? Share ide teman-teman!"**

Berpikir kreatif:
- Kalkulator scientific?
- Konverter mata uang?
- Game sederhana?
- Sistem informasi?
- To-do list?

### 4. Troubleshooting Sharing 🛠️
**"Ada yang ketemu error selain yang dijelaskan di materi? Share di sini, kita cari solusi bareng!"**

Berbagi masalah:
- Screenshot error
- Jelaskan apa yang sedang dilakukan
- Mungkin teman lain punya solusi!

### 5. Challenge: GUI + Inheritance! 🏆
**"Buat form untuk input data Mahasiswa dan Dosen (pakai inheritance dari Tugas 2/3). Bisa gak?"**

Untuk yang advanced:
- Buat 2 form: FormMahasiswa dan FormDosen
- Pakai class Mahasiswa dan Dosen yang sudah dibuat
- Input data via GUI
- Tampilkan hasil di GUI
- Share hasilnya!

---

**Partisipasi = Ilmu bertambah!** 📚💡

---

## 10. PENUTUP & MOTIVASI (5 menit)

**"Rangkuman & Semangat Terakhir!"**

### 📌 Rangkuman Singkat:

Hari ini kita sudah belajar **LEVEL UP**: **GUI PROGRAMMING!** 🖥️✨

✅ **Apa yang sudah kita pelajari:**
1. **JFrame Form** - window aplikasi
2. **Drag & Drop** di NetBeans Form Designer
3. **Komponen GUI** - JLabel, JTextField, JButton
4. **Event Handling** - tombol jadi "hidup"
5. **Aplikasi Fungsional** - Form Sapaan dan Kalkulator

✅ **Apa yang sudah kita praktikkan:**
- Membuat JFrame Form di NetBeans
- Drag & drop komponen dari Palette
- Mengubah properties komponen
- Double-click tombol untuk buat event handler
- Menulis kode event handling
- Menjalankan aplikasi GUI

**Dari yang awalnya cuma console hitam-putih, sekarang sudah bisa bikin aplikasi dengan window!** 🎉

---

### 🎯 Apa Selanjutnya?

**Aktivitas Belajar 15 (Terakhir!):**
- **Topik**: Database - Koneksi Java dengan Database
- **Kita akan gabungkan**:
  - GUI (hari ini) ✅
  - Database (minggu depan)
  - OOP (semua yang sudah dipelajari)
- **Hasil**: Aplikasi CRUD lengkap dengan GUI dan Database!

**Bayangkan:**
- Form input mahasiswa → Data tersimpan di database
- Button "Lihat Data" → Data muncul dari database
- Button "Edit" → Update data di database
- Button "Hapus" → Delete data dari database

**INI ADALAH APLIKASI PROFESIONAL!** 🏆

---

### 💪 Motivasi Terakhir:

**"Teman-Teman Sudah Sampai di Sini! LUAR BIASA!"** 🌟

Dari TUWEB 1 sampai TUWEB 4, perjalanan yang amazing:
- ✅ **TUWEB 1**: Hello World (mulai dari NOL)
- ✅ **TUWEB 2**: Perulangan (mulai paham logic)
- ✅ **TUWEB 3**: Inheritance (mulai paham OOP)
- ✅ **TUWEB 4**: GUI (mulai bikin aplikasi real!)

**Teman-teman sudah belajar:**
- Class, Object, Attribute, Method
- If-Else, For, While
- Array, String
- Inheritance, Polymorphism, Encapsulation
- UML, Exception Handling
- **DAN SEKARANG: GUI!**

**INI ADALAH FONDASI SEORANG PROGRAMMER PROFESIONAL!** 💼

> "The journey of a thousand miles begins with a single step."  
> *— Lao Tzu*

**Dan teman-teman sudah menempuh banyak langkah! Tinggal sedikit lagi!** 🚶‍♂️🚶‍♀️

**Pesan Terakhir Pak Anton**:

**1. From Zero to Hero!**  
Teman-teman yang awalnya tidak tahu apa-apa tentang programming, sekarang sudah bisa bikin aplikasi GUI! Itu **PENCAPAIAN LUAR BIASA!**

**2. Tugas 3 - Jangan Sampai Telat!**  
Deadline sudah dekat! Selesaikan Tugas 3 dengan baik. Jangan sampai nilai E karena tidak mengumpulkan!

**3. AB 15 adalah Puncak!**  
GUI + Database = Aplikasi Lengkap. Jangan lewatkan! Ini materi terakhir dan paling powerful!

**4. Portfolio!**  
Aplikasi yang teman-teman buat hari ini (dan nanti di AB 15) bisa jadi portfolio. Screenshot, rekam video, share di LinkedIn!

**5. Keep Learning!**  
Setelah mata kuliah ini selesai, jangan berhenti belajar. Explore framework, library, teknologi baru. Dunia programming sangat luas!

**6. You CAN Do This!**  
Teman-teman sudah membuktikan bahwa teman-teman BISA. Dari tidak tahu apa-apa sampai bikin aplikasi GUI. **TEMAN-TEMAN HEBAT!** 💪

---

### 📢 Pengumuman SUPER PENTING:

1. **TUGAS 3 DEADLINE AB 15** ⏰
   - **JANGAN TELAT!**
   - Format: Video rekaman praktik
   - Topic: Polymorphism, Exception Handling
   - **Submit SEKARANG jika sudah selesai!**

2. **Aktivitas Belajar 15** (Terakhir!)
   - Topik: Database
   - Integrasi GUI + Database
   - Aplikasi CRUD lengkap

3. **UAS**
   - Persiapkan dari sekarang
   - Review semua materi TUWEB 1-4
   - Practice, practice, practice!

4. **Forum Diskusi**
   - Tetap aktif
   - Bantu teman-teman yang kesulitan
   - Sharing is caring!

---

### 🌟 Quotes Penutup:

> "Don't compare your beginning to someone else's middle."  
> *(Jangan bandingkan awal teman-teman dengan pertengahan orang lain)*

> "The expert in anything was once a beginner."  
> *(Ahli di bidang apapun dulunya adalah pemula)*

> "Code is like humor. When you have to explain it, it's bad."  
> *(Kode seperti humor. Kalau harus dijelaskan, berarti kurang bagus)*  
> — Tapi untuk belajar, **HARUS DIJELASKAN!** 😄

---

### ✨ Pesan Penutup Terakhir:

**Ini adalah TUWEB terakhir kita.** 😢

Tapi ini **BUKAN AKHIR dari perjalanan teman-teman!**

Ini adalah **AWAL** dari karir teman-teman sebagai programmer! 🚀

**Yang sudah teman-teman pelajari:**
- Fondasi programming (variables, loops, conditions)
- Object-Oriented Programming (Class, Object, Inheritance, Polymorphism)
- GUI Development (membuat aplikasi user-friendly)

**Ini adalah skill yang dicari oleh perusahaan!**  
**Ini adalah skill yang akan membuka pintu peluang!**

**Dari Pak Anton:**

Terima kasih sudah mengikuti semua TUWEB dengan antusias! 🙏

Saya bangga melihat perkembangan teman-teman dari TUWEB 1 sampai TUWEB 4.

**Teman-teman sudah bukan pemula lagi. Teman-teman adalah PROGRAMMER!** 💻

**Tetap semangat!**  
**Selesaikan Tugas 3!**  
**Siapkan AB 15!**  
**Dan raih nilai terbaik!** 🏆

**Jangan lupa:**
- Sholat
- Istirahat yang cukup
- Jaga kesehatan
- Dan keep coding! 💪

---

**Sampai jumpa di Aktivitas Belajar 15! Semangat untuk final sprint!** 🏃‍♂️💨

**Wassalamu'alaikum warahmatullahi wabarakatuh.**

---

### Salam Penutup:

**"From console to GUI, from zero to hero! You did it! 💻🚀🎉"**

---

## LAMPIRAN

### A. Referensi Tambahan

**Link ke BMP**: Modul 6 - KB 1 (GUI dengan Java Swing)

**Referensi Online**:
1. Java Swing Tutorial: https://www.javatpoint.com/java-swing
2. NetBeans GUI Builder: https://netbeans.apache.org/kb/docs/java/quickstart-gui.html
3. Java Swing Components: https://docs.oracle.com/javase/tutorial/uiswing/components/

### B. Komponen Swing yang Bisa Dieksplorasi

**Komponen Dasar:**
- JLabel - menampilkan text/gambar
- JTextField - input text 1 baris
- JTextArea - input text multi-baris
- JButton - tombol
- JCheckBox - checkbox (bisa pilih banyak)
- JRadioButton - radio button (pilih satu)
- JComboBox - dropdown list
- JList - list
- JTable - tabel
- JPanel - container

**Untuk Eksplorasi Lanjutan!**

### C. Event Handling yang Bisa Dipelajari

Selain ActionListener (untuk button), ada:
- KeyListener - deteksi keyboard
- MouseListener - deteksi mouse click
- FocusListener - deteksi focus textfield
- dll

**Tapi untuk pemula, fokus ke ActionListener dulu!** 👍

### D. Checklist Keberhasilan

Pastikan teman-teman sudah bisa:
- [ ] Membuat JFrame Form di NetBeans
- [ ] Drag & drop komponen dari Palette
- [ ] Mengubah properties komponen (text, variable name)
- [ ] Double-click button untuk generate event handler
- [ ] Menulis kode di event handler
- [ ] Menggunakan getText() dan setText()
- [ ] Menjalankan aplikasi GUI (Run File)
- [ ] Membuat form dengan beberapa komponen
- [ ] Membuat aplikasi fungsional sederhana

Kalau ada yang belum bisa, **PRAKTIK LAGI!** 💪

### E. Kontak & Support

**Tutor**: Anton Prafanto, S.Kom., M.T.  
**Forum Diskusi**: Forum AB 12 di LMS UT  
**Mata Kuliah**: STSI4201 - Pemrograman Berbasis Desktop

**Emergency Contact** (untuk masalah teknis):
- Forum Diskusi di LMS
- Email tutor (cek di LMS)

---

### F. Next Steps - Apa yang Bisa Dipelajari Selanjutnya?

**Setelah AB 15 (Database) selesai:**

1. **Java Framework**:
   - Spring Boot (untuk web)
   - JavaFX (GUI lebih modern dari Swing)
   - Hibernate (ORM untuk database)

2. **Mobile Development**:
   - Android (pakai Java/Kotlin)
   - React Native
   - Flutter

3. **Web Development**:
   - HTML, CSS, JavaScript
   - Backend: Spring, Node.js
   - Frontend: React, Vue, Angular

4. **Database Advanced**:
   - MySQL/PostgreSQL (relational)
   - MongoDB (NoSQL)
   - Redis (caching)

5. **Design Patterns**:
   - MVC, MVP, MVVM
   - Singleton, Factory, Observer
   - dll

**Dunia programming sangat luas! Terus eksplorasi!** 🌍

---

**#LearningByDoing #GUIProgramming #JavaSwing #NetBeans #UniversitasTerbuka #STSI4201 #FromZeroToHero**

---

**END OF TUWEB 4**  
**END OF ALL TUWEB SERIES**

**🎊 CONGRATULATIONS! 🎊**

Dibuat dengan ❤️ untuk mahasiswa Universitas Terbuka  
*You started from zero, now you're a programmer! Keep coding!* 💻🚀🏆
