# 🏪 Aplikasi Utama - Kasir Minimarket

## 📋 Deskripsi
Aplikasi kasir minimarket sederhana yang mendemonstrasikan implementasi konsep looping dalam aplikasi nyata.

## 🎯 Fitur Utama
- ✅ Display produk dengan for loop
- ✅ Proses transaksi dengan while loop  
- ✅ Validasi pembayaran dengan do-while loop
- ✅ Struk pembelian lengkap
- ✅ Manajemen stok otomatis

## 📁 File-file
- `AplikasiKasirMinimarket.java` - Source code utama
- `AplikasiKasirMinimarket.class` - Compiled file
- `Penjelasan_Aplikasi.md` - Penjelasan detail kode

## 🚀 Cara Menjalankan

### 1. Dengan NetBeans
1. Buka NetBeans
2. File → Open Project → Pilih folder `TUWEB_1_Looping`
3. Klik kanan `AplikasiKasirMinimarket.java` → Run File

### 2. Dengan Command Line
```bash
cd TUWEB_1_Looping/03_Aplikasi_Utama
javac AplikasiKasirMinimarket.java
java AplikasiKasirMinimarket
```

## 📖 Cara Kerja Aplikasi

### 1. Tampilan Produk
Menggunakan **for loop** untuk menampilkan semua produk:
```java
for (int i = 0; i < namaProduk.length; i++) {
    System.out.println((i + 1) + ". " + namaProduk[i] + 
                     " - Rp " + hargaProduk[i] + 
                     " (Stok: " + stokProduk[i] + ")");
}
```

### 2. Proses Belanja
Menggunakan **while loop** untuk transaksi berulang:
```java
while (lanjut == 'y' || lanjut == 'Y') {
    // Proses pilihan produk
    // Validasi stok
    // Hitung subtotal
    // Tanya lanjut belanja
}
```

### 3. Validasi Pembayaran
Menggunakan **do-while loop** untuk validasi uang:
```java
do {
    System.out.print("Masukkan uang pembayaran: Rp ");
    uangBayar = input.nextInt();
    
    if (uangBayar < totalHarga) {
        System.out.println("Uang kurang!");
    }
} while (uangBayar < totalHarga);
```

## 🎯 Pembelajaran

### Konsep Looping yang Dipelajari:
1. **For Loop** - Iterasi data array produk
2. **While Loop** - Proses transaksi berulang
3. **Do-While Loop** - Validasi input pembayaran
4. **Nested Loop** - Menampilkan struk detail

### Konsep Tambahan:
- Array management
- Input validation
- String formatting
- Basic arithmetic operations

## 📝 Latihan Modifikasi

Coba modifikasi aplikasi dengan:
1. Tambah diskon untuk pembelian tertentu
2. Tambah member system
3. Tambah laporan penjualan harian
4. Tambah multiple payment methods

---
**📚 Kembali ke Materi:** `../01_Materi_Pembelajaran/`