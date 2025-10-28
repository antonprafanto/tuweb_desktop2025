# Panduan Praktik NetBeans - Aplikasi Kasir Minimarket

## 📋 Persiapan Awal

### 1. Install NetBeans
1. Download NetBeans IDE dari [https://netbeans.apache.org/](https://netbeans.apache.org/)
2. Pilih versi dengan Java SE
3. Install sesuai instruksi
4. Pastikan Java JDK sudah terinstall

### 2. Buka NetBeans
- Double-click icon NetBeans di desktop
- Tunggu hingga IDE terbuka sempurna

## 🚀 Membuat Project Baru

### Step 1: Create New Project
1. Klik **File** → **New Project**
2. Pilih **Java** → **Java Application**
3. Klik **Next**

### Step 2: Project Configuration
1. **Project Name:** `KasirMinimarket`
2. **Project Location:** Pilih folder penyimpanan
3. **Create Main Class:** Centang dan isi `kasirminimarket.AplikasiKasirMinimarket`
4. Klik **Finish**

### Step 3: Project Structure
```
KasirMinimarket
├── Source Packages
│   └── kasirminimarket
│       └── AplikasiKasirMinimarket.java
└── Libraries
```

## 📝 Menulis Kode

### Step 1: Buka File Main
1. Expand **Source Packages**
2. Expand **kasirminimarket**
3. Double-click **AplikasiKasirMinimarket.java**

### Step 2: Copy Paste Kode
1. Hapus kode default yang ada
2. Copy semua kode dari file `02_aplikasi_kasir_minimarket.java`
3. Paste di editor NetBeans

### Step 3: Save File
- Tekan **Ctrl + S** atau klik icon Save

## 🔍 Memahami Interface NetBeans

### 1. Menu Bar
- **File:** New, Open, Save, Print
- **Edit:** Copy, Paste, Undo, Redo
- **View:** Windows, Tools
- **Run:** Run Project, Debug Project
- **Navigate:** Go to Class, Go to Line

### 2. Toolbar
- **New Project:** Create new project
- **Open Project:** Open existing project
- **Save:** Save current file
- **Run:** Run main program (F6)
- **Debug:** Debug program (Ctrl+F5)

### 3. Project Explorer
- Tampilkan struktur project
- Navigate antar file
- Manage package dan class

### 4. Code Editor
- Syntax highlighting
- Auto completion
- Error detection
- Code folding

### 5. Output Window
- Hasil running program
- Error messages
- Build output

## ▶️ Menjalankan Program

### Method 1: Keyboard Shortcut
- Tekan **F6** untuk Run Project
- Tekan **Shift + F6** untuk Run File

### Method 2: Menu
1. Klik **Run** → **Run Project**
2. Atau klik icon hijau ▶️ di toolbar

### Method 3: Right Click
1. Right click pada file `AplikasiKasirMinimarket.java`
2. Pilih **Run File**

## 🐛 Debugging Program

### 1. Compile Error
- Error ditandai dengan garis merah
- Hover mouse untuk melihat pesan error
- Check line number di output window

### 2. Runtime Error
- Program berhenti tiba-tiba
- Check stack trace di output
- Identifikasi baris penyebab error

### 3. Logic Error
- Program jalan tapi hasil salah
- Gunakan System.out.println() untuk debugging
- Check flow control dan variabel

## 💡 Tips NetBeans

### 1. Auto Completion
- Tekan **Ctrl + Space** untuk suggestion
- NetBeans akan suggest method dan variable

### 2. Code Templates
- Ketik `sout` lalu **Tab** → `System.out.println()`
- Ketik `fori` lalu **Tab** → for loop template
- Ketik `while` lalu **Tab** → while loop template

### 3. Format Code
- Tekan **Alt + Shift + F** untuk format otomatis
- Atur indentation di Tools → Options

### 4. Code Navigation
- **Ctrl + G:** Go to line number
- **Ctrl + Click:** Go to definition
- **Alt + Left/Right:** Back/Forward navigation

## 🔧 Common Issues & Solutions

### Issue 1: Cannot Find Symbol
**Problem:** Variable atau method tidak ditemukan
**Solution:**
- Check spelling variable
- Import class yang dibutuhkan
- Check scope variable

### Issue 2: Main Method Not Found
**Problem:** Tidak ada main method
**Solution:**
```java
public static void main(String[] args) {
    // kode program
}
```

### Issue 3: Scanner Not Closed
**Problem:** Warning resource leak
**Solution:**
```java
input.close(); // tambahkan di akhir main method
```

### Issue 4: Package Does Not Exist
**Problem:** Import error
**Solution:**
- Check package name
- Add library jika external package
- Clean and build project

## 📱 Testing Program

### Test Case 1: Normal Flow
1. Pilih produk 1 (Indomie)
2. Jumlah 2
3. Lanjut belanja: n
4. Bayar: 10000
5. Expected: Kembalian 4000

### Test Case 2: Invalid Input
1. Pilih produk 99 (invalid)
2. Expected: "Pilihan tidak valid!"

### Test Case 3: Insufficient Stock
1. Pilih produk dengan stok 0
2. Expected: "Maaf, produk habis!"

### Test Case 4: Insufficient Payment
1. Total belanja 15000
2. Bayar 10000
3. Expected: "Uang kurang! Kekurangan: 5000"

## 🎯 Best Practices

### 1. Code Organization
- Gunakan package yang sesuai
- Kelompokkan related functionality
- Comment untuk kode kompleks

### 2. Variable Naming
- Gunakan camelCase
- Nama yang deskriptif
- Hindari abbreviation

### 3. Error Handling
- Validate user input
- Handle edge cases
- Berikan feedback yang jelas

### 4. Code Style
- Consistent indentation
- Proper spacing
- Follow Java conventions

## 🚀 Next Steps

Setelah berhasil menjalankan aplikasi kasir:
1. Coba modifikasi tambah produk baru
2. Implementasi fitur diskon
3. Tambahkan laporan penjualan
4. Export data ke file

## 📞 Help & Resources

### NetBeans Documentation
- [https://netbeans.apache.org/kb/](https://netbeans.apache.org/kb/)

### Java Documentation
- [https://docs.oracle.com/javase/](https://docs.oracle.com/javase/)

### Forum Diskusi
- Stack Overflow
- Java Forums
- NetBeans Community