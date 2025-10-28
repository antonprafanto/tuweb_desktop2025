# Penjelasan Sistem Manajemen Kendaraan

## 🎯 Tujuan Aplikasi
Aplikasi ini mendemonstrasikan konsep Object-Oriented Programming (OOP) dan inheritance dalam sistem manajemen kendaraan yang lengkap dan interaktif.

## 🏗️ Arsitektur Class Diagram

```
                    ┌─────────────────┐
                    │   Kendaraan     │
                    │  (Abstract)     │
                    ├─────────────────┤
                    │ - merk: String  │
                    │ - tahun: int    │
                    │ - status: boolean│
                    ├─────────────────┤
                    │ + info()        │
                    │ + start()       │
                    │ + stop()        │
                    └─────────────────┘
                           ▲
                           │ extends
            ┌──────────────┴──────────────┐
            │                             │
    ┌─────────────────┐         ┌─────────────────┐
    │      Mobil      │         │      Motor      │
    ├─────────────────┤         ├─────────────────┤
    │ - model: String │         │ - tipe: String  │
    │ - jumlahPintu: int│      │ - jenisMotor: String│
    ├─────────────────┤         ├─────────────────┤
    │ + info()        │         │ + info()        │
    │ + bukaPintu()   │         │ + standar()     │
    │ + bukaBagasi()  │         │ + stang()       │
    └─────────────────┘         └─────────────────┘
```

## 🔍 Analisis Konsep OOP yang Digunakan

### 1. Abstraction (Abstraksi)
**Lokasi:** Abstract class `Kendaraan`

**Implementasi:**
```java
abstract class Kendaraan {
    protected String merk;
    protected int tahun;
    protected boolean status;
    
    // Abstract method - wajib diimplementasikan subclass
    public abstract void info();
    
    // Concrete method - bisa digunakan subclass
    public void start() {
        System.out.println(merk + " dinyalakan...");
    }
}
```

**Mengapa Abstraction?**
- Menyembunyikan detail implementasi
- Mendefinisikan kontrak untuk semua kendaraan
- Memaksa subclass untuk implementasi method penting

### 2. Inheritance (Pewarisan)
**Lokasi:** `Mobil extends Kendaraan` dan `Motor extends Kendaraan`

**Implementasi:**
```java
class Mobil extends Kendaraan {
    private String model;
    private int jumlahPintu;
    
    public Mobil(String merk, int tahun, String model, int jumlahPintu) {
        super(merk, tahun); // Panggil constructor parent
        this.model = model;
        this.jumlahPintu = jumlahPintu;
    }
}
```

**Mengapa Inheritance?**
- Code reusability (menggunakan kembali kode parent)
- Logical hierarchy (Mobil dan Motor adalah Kendaraan)
- Extensibility (menambah fitur tanpa mengubah parent)

### 3. Encapsulation (Enkapsulasi)
**Lokasi:** Private fields dengan public getters/setters

**Implementasi:**
```java
class Mobil extends Kendaraan {
    private String model; // Private access
    private int jumlahPintu;
    
    // Public getters
    public String getModel() { return model; }
    public int getJumlahPintu() { return jumlahPintu; }
    
    // Public setters
    public void setModel(String model) { this.model = model; }
    public void setJumlahPintu(int jumlahPintu) { this.jumlahPintu = jumlahPintu; }
}
```

**Mengapa Encapsulation?**
- Data hiding (menyembunyikan internal state)
- Control access (kontrol akses ke data)
- Validation (validasi data saat setter)

### 4. Polymorphism (Polimorfisme)
**Lokasi:** ArrayList<Kendaraan> dan method overriding

**Implementasi:**
```java
// Polymorphic collection
ArrayList<Kendaraan> daftarKendaraan = new ArrayList<>();
daftarKendaraan.add(new Mobil(...)); // Mobil object
daftarKendaraan.add(new Motor(...));  // Motor object

// Polymorphic method call
for (Kendaraan k : daftarKendaraan) {
    k.info(); // Dynamic binding - call method sesuai tipe objek
}

// Type checking dan casting
if (k instanceof Mobil) {
    Mobil mobil = (Mobil) k; // Downcasting
    mobil.bukaPintu(); // Method khusus Mobil
}
```

**Mengapa Polymorphism?**
- Flexibility (satu interface, multiple implementations)
- Dynamic binding (method resolution at runtime)
- Code maintainability (mudah menambah tipe baru)

### 5. Method Overriding
**Lokasi:** Method `info()` di setiap subclass

**Implementasi:**
```java
// Parent class
public abstract void info();

// Child class 1
@Override
public void info() {
    System.out.println("Mobil - Merk: " + merk + ", Model: " + model + 
                     ", Tahun: " + tahun + ", Pintu: " + jumlahPintu);
}

// Child class 2
@Override
public void info() {
    System.out.println("Motor - Merk: " + merk + ", Tipe: " + tipe + 
                     ", Tahun: " + tahun + ", Jenis: " + jenisMotor);
}
```

**Mengapa Overriding?**
- Customized behavior (perilaku khusus setiap subclass)
- Specialization (implementasi spesifik untuk setiap tipe)
- Runtime polymorphism

### 6. Super Keyword
**Lokasi:** Constructor dan method calls

**Implementasi:**
```java
// Constructor chaining
public Mobil(String merk, int tahun, String model, int jumlahPintu) {
    super(merk, tahun); // Panggil constructor parent
    this.model = model;
    this.jumlahPintu = jumlahPintu;
}

// Method chaining
@Override
public void start() {
    System.out.println("Motor " + merk + " dinyalakan dengan starter elektrik...");
    super.start(); // Panggil method parent
}
```

**Mengapa Super?**
- Constructor initialization (inisialisasi parent)
- Method reuse (menggunakan method parent)
- Access parent members (akses member parent)

## 📋 Fitur-Fitur Aplikasi

### 1. CRUD Operations
- **Create:** Tambah kendaraan baru (Mobil/Motor)
- **Read:** Tampilkan semua kendaraan atau cari spesifik
- **Update:** Modifikasi data kendaraan
- **Delete:** Hapus kendaraan dari sistem

### 2. Dynamic Object Creation
```java
if (jenis == 1) {
    Mobil mobil = new Mobil(merk, tahun, model, jumlahPintu);
    daftar.add(mobil);
} else if (jenis == 2) {
    Motor motor = new Motor(merk, tahun, tipe, jenisMotor);
    daftar.add(motor);
}
```

### 3. Type Safety dengan instanceof
```java
if (k instanceof Mobil) {
    Mobil mobil = (Mobil) k;
    mobil.bukaPintu();
} else if (k instanceof Motor) {
    Motor motor = (Motor) k;
    motor.standar();
}
```

### 4. Collection Management
```java
ArrayList<Kendaraan> daftarKendaraan = new ArrayList<>();
daftar.add(new Mobil(...));
daftar.remove(index);
daftar.get(index);
```

## 🎓 Konsep Pemrograman yang Dipelajari

### 1. Abstract Class vs Concrete Class
- **Abstract Class:** Tidak bisa diinstansiasi, punya abstract method
- **Concrete Class:** Bisa diinstansiasi, implementasi lengkap

### 2. Access Modifiers in Action
- **protected:** Bisa diakses subclass
- **private:** Hanya class itu sendiri
- **public:** Bisa diakses dimana saja

### 3. Constructor Chaining
- `super()` untuk memanggil constructor parent
- `this()` untuk memanggil constructor di class yang sama

### 4. Dynamic Method Dispatch
- Method call resolved at runtime
- Polymorphic behavior

### 5. Type Casting
- **Upcasting:** `Kendaraan k = new Mobil();` (implicit)
- **Downcasting:** `Mobil m = (Mobil) k;` (explicit, perlu instanceof check)

## 💡 Design Patterns yang Digunakan

### 1. Template Method Pattern
```java
// Template method di parent
public void start() {
    System.out.println(merk + " dinyalakan...");
}

// Customized di child
@Override
public void start() {
    System.out.println("Motor " + merk + " dinyalakan dengan starter elektrik...");
    super.start();
}
```

### 2. Factory Pattern (Simple)
```java
// Simple factory untuk membuat objek
if (jenis == 1) {
    return new Mobil(...);
} else {
    return new Motor(...);
}
```

## 🚀 Best Practices Demonstrated

### 1. Single Responsibility Principle
- Setiap class punya satu tanggung jawab
- `Kendaraan` untuk data umum
- `Mobil` untuk fitur spesifik mobil
- `Motor` untuk fitur spesifik motor

### 2. Open/Closed Principle
- Open for extension (bisa tambah subclass baru)
- Closed for modification (tidak perlu ubah parent)

### 3. Liskov Substitution Principle
- Subclass bisa menggantikan parent
- `Mobil` dan `Motor` bisa digunakan sebagai `Kendaraan`

### 4. Dependency Inversion
- Program to interface, not implementation
- Menggunakan `ArrayList<Kendaraan>` bukan tipe spesifik

## 🔧 Error Handling & Validation

### 1. Input Validation
```java
if (nomor < 1 || nomor > daftar.size()) {
    System.out.println("Nomor tidak valid!");
    return;
}
```

### 2. Type Safety
```java
if (k instanceof Mobil) {
    Mobil mobil = (Mobil) k; // Safe casting
}
```

### 3. Null Prevention
```java
if (daftar.isEmpty()) {
    System.out.println("Belum ada data kendaraan!");
    return;
}
```

## 🎯 Use Cases & Scenarios

### 1. Rental Management System
- Tambah kendaraan ke fleet
- Track availability
- Manage maintenance

### 2. Dealership Management
- Inventory management
- Sales tracking
- Customer management

### 3. Vehicle Registration
- Registration database
- Document management
- Compliance tracking

## 📈 Extensibility Examples

### 1. Tambah Tipe Kendaraan Baru
```java
class Truck extends Kendaraan {
    private int kapasitasMuatan;
    
    @Override
    public void info() {
        System.out.println("Truck - " + merk + ", Kapasitas: " + kapasitasMuatan + " ton");
    }
    
    public void muatBarang() {
        System.out.println("Memuat barang ke truck " + merk);
    }
}
```

### 2. Tambah Interface
```java
interface Maintenance {
    void service();
    void gantiOli();
}

class Mobil extends Kendaraan implements Maintenance {
    @Override
    public void service() {
        System.out.println("Service mobil " + merk);
    }
}
```

## 🎉 Kesimpulan

Aplikasi Sistem Manajemen Kendaraan ini adalah contoh komprehensif yang mendemonstrasikan:
- **Core OOP concepts** (inheritance, polymorphism, encapsulation, abstraction)
- **Real-world application** dengan fitur lengkap
- **Best practices** dalam software design
- **Extensible architecture** untuk pengembangan lanjutan

Mahasiswa akan belajar bagaimana menerapkan teori OOP dalam aplikasi nyata yang kompleks namun tetap mudah dipahami.