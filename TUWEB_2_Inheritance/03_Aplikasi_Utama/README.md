# 🚗 Aplikasi Utama - Sistem Manajemen Kendaraan

## 📋 Deskripsi
Aplikasi manajemen kendaraan yang mendemonstrasikan implementasi lengkap konsep Object-Oriented Programming (OOP) dalam Java.

## 🎯 Fitur Utama
- ✅ **Inheritance** - Class hierarchy Kendaraan → Mobil/Motor
- ✅ **Encapsulation** - Private attributes dengan public getter/setter
- ✅ **Polymorphism** - Method overriding dan dynamic binding
- ✅ **Abstraction** - Abstract class dengan abstract methods
- ✅ **CRUD Operations** - Create, Read, Update, Delete
- ✅ **ArrayList Management** - Dynamic data storage

## 📁 File-file
- `SistemManajemenKendaraan.java` - Source code utama
- `SistemManajemenKendaraan.class` - Compiled file
- `Penjelasan_Aplikasi.md` - Penjelasan detail kode

## 🚀 Cara Menjalankan

### 1. Dengan NetBeans
1. Buka NetBeans
2. File → Open Project → Pilih folder `TUWEB_2_Inheritance`
3. Klik kanan `SistemManajemenKendaraan.java` → Run File

### 2. Dengan Command Line
```bash
cd TUWEB_2_Inheritance/03_Aplikasi_Utama
javac SistemManajemenKendaraan.java
java SistemManajemenKendaraan
```

## 📖 Struktur Class

### 1. Abstract Parent Class: Kendaraan
```java
abstract class Kendaraan {
    protected String merk;
    protected int tahun;
    protected boolean status;
    
    // Abstract method - wajib diimplementasi subclass
    public abstract void info();
    
    // Concrete method - bisa digunakan subclass
    public void start() { /* ... */ }
    public void stop() { /* ... */ }
}
```

### 2. Concrete Child Classes

#### Mobil Class
```java
class Mobil extends Kendaraan {
    private String model;
    private int jumlahPintu;
    
    @Override
    public void info() {
        System.out.println("Mobil - Merk: " + merk + ", Model: " + model);
    }
    
    // Method khusus Mobil
    public void bukaPintu() { /* ... */ }
    public void bukaBagasi() { /* ... */ }
}
```

#### Motor Class
```java
class Motor extends Kendaraan {
    private String tipe;
    private String jenisMotor;
    
    @Override
    public void info() {
        System.out.println("Motor - Merk: " + merk + ", Tipe: " + tipe);
    }
    
    // Method khusus Motor
    public void standar() { /* ... */ }
    public void stang() { /* ... */ }
}
```

## 🎯 Konsep OOP yang Diterapkan

### 1. Inheritance
- `Mobil` dan `Motor` mewarisi dari `Kendaraan`
- Menggunakan `super()` untuk constructor parent
- Menggunakan `@Override` untuk method overriding

### 2. Encapsulation
- `private` attributes untuk data protection
- `public` getter/setter untuk controlled access
- `protected` attributes untuk subclass access

### 3. Polymorphism
- Method overriding pada `info()`
- Dynamic binding saat runtime
- Type casting untuk specific methods

### 4. Abstraction
- `abstract class Kendaraan`
- `abstract method info()` wajib diimplementasi
- Template method pattern

## 📋 Menu Aplikasi

1. **Tambah Kendaraan** - Create new Mobil/Motor
2. **Tampilkan Semua** - Read all vehicles
3. **Cari Kendaraan** - Search by merk
4. **Update Kendaraan** - Edit existing data
5. **Hapus Kendaraan** - Delete with confirmation
6. **Keluar** - Exit application

## 🎯 Pembelajaran

### Konsep yang Dipelajari:
1. **Class Design** - Proper class structure
2. **Inheritance Hierarchy** - Parent-child relationships
3. **Method Overriding** - Polymorphic behavior
4. **ArrayList Operations** - Dynamic collections
5. **Input Validation** - Error handling
6. **Menu System** - User interface design

### Design Patterns:
- **Template Method** - Abstract class dengan concrete methods
- **Strategy Pattern** - Different behaviors per subclass
- **Factory Pattern** - Object creation based on type

## 📝 Latihan Modifikasi

Coba modifikasi aplikasi dengan:
1. Tambah class `Truk` sebagai child class
2. Tambah interface `Serviceable` untuk maintenance
3. Tambah exception handling untuk invalid input
4. Tambah file I/O untuk save/load data
5. Tambah GUI dengan JavaFX

---
**📚 Kembali ke Materi:** `../01_Materi_Pembelajaran/`