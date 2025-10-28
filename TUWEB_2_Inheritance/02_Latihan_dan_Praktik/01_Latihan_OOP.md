# 📝 Latihan OOP & Inheritance

## 🎯 Tujuan
Melatih pemahaman konsep Object-Oriented Programming melalui latihan bertahap.

## 📚 Latihan 1: Class Dasar

### Soal 1: Class Mahasiswa
Buat class `Mahasiswa` dengan:
- Attributes: nim, nama, ipk, jurusan
- Constructor untuk inisialisasi
- Getter dan setter methods
- Method `tampilkanInfo()`

```java
// Contoh jawaban
class Mahasiswa {
    private String nim;
    private String nama;
    private double ipk;
    private String jurusan;
    
    public Mahasiswa(String nim, String nama, double ipk, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
        this.jurusan = jurusan;
    }
    
    // Getter dan setter methods...
    public void tampilkanInfo() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("IPK: " + ipk);
        System.out.println("Jurusan: " + jurusan);
    }
}
```

### Soal 2: Class Buku
Buat class `Buku` dengan encapsulation yang benar.

## 📚 Latihan 2: Inheritance

### Soal 3: Hierarchy Hewan
Buat class hierarchy:
- `Hewan` (parent) - nama, umur
- `Kucing` (child) - jenisBulu, suara()
- `Anjing` (child) - jenisRas, suara()

### Soal 4: Bangun Datar
Buat class hierarchy:
- `BangunDatar` (abstract) - warna, abstract luas()
- `Persegi` - sisi, implementasi luas()
- `Lingkaran` - jariJari, implementasi luas()

## 📚 Latihan 3: Polymorphism

### Soal 5: Method Overriding
Implementasi method overriding pada class hierarchy Hewan.

### Soal 6: Dynamic Binding
Buat array berbagai jenis hewan dan panggil method suara().

## 📚 Latihan 4: Abstraction

### Soal 7: Abstract Class
Buat abstract class `Kendaraan` dengan abstract method `jalankan()`.

### Soal 8: Interface
Buat interface `Serviceable` dengan method `service()`.

## 📚 Latihan 5: Aplikasi Kompleks

### Soal 9: Sistem Perpustakaan
Buat sistem perpustakaan dengan:
- Class `Buku`, `Anggota`, `Pinjaman`
- Relationship antar class
- Method untuk meminjam/mengembalikan

### Soal 10: Sistem Akademik
Buat sistem akademik dengan:
- Class `Mahasiswa`, `Dosen`, `MataKuliah`, `Nilai`
- Inheritance dan composition
- Method untuk menghitung IPK

## ✅ Jawaban dan Pembahasan

Lihat file `Pembahasan_Latihan.md` untuk jawaban lengkap.

---
**🚀 Level Selanjutnya:** `03_Aplikasi_Utama/`