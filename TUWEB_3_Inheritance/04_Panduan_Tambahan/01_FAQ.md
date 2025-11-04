# FAQ (Frequently Asked Questions) - Inheritance

**Tutorial Ke-3: Inheritance**
**Mata Kuliah**: Pemrograman Berbasis Desktop (STSI4201)
**Dosen**: Anton Prafanto, S.Kom, M.T.

---

## 📋 Daftar Pertanyaan

### 🔵 KONSEP DASAR
1. [Apa itu inheritance dan mengapa penting?](#1-apa-itu-inheritance-dan-mengapa-penting)
2. [Kapan sebaiknya menggunakan inheritance?](#2-kapan-sebaiknya-menggunakan-inheritance)
3. [Apa perbedaan class parent dan class child?](#3-apa-perbedaan-class-parent-dan-class-child)
4. [Apakah Java mendukung multiple inheritance?](#4-apakah-java-mendukung-multiple-inheritance)

### 🟢 PENGGUNAAN EXTENDS DAN SUPER
5. [Apa fungsi keyword extends?](#5-apa-fungsi-keyword-extends)
6. [Apa fungsi keyword super?](#6-apa-fungsi-keyword-super)
7. [Kapan harus menggunakan super()?](#7-kapan-harus-menggunakan-super)
8. [Bolehkah tidak memanggil super()?](#8-bolehkah-tidak-memanggil-super)

### 🟡 ACCESS MODIFIER
9. [Apa perbedaan public, protected, dan private?](#9-apa-perbedaan-public-protected-dan-private)
10. [Kapan menggunakan protected?](#10-kapan-menggunakan-protected)
11. [Apakah child class bisa mengakses atribut private parent?](#11-apakah-child-class-bisa-mengakses-atribut-private-parent)

### 🟠 METHOD OVERRIDING
12. [Apa itu method overriding?](#12-apa-itu-method-overriding)
13. [Apa fungsi annotation @Override?](#13-apa-fungsi-annotation-override)
14. [Apakah @Override wajib digunakan?](#14-apakah-override-wajib-digunakan)
15. [Bisakah mengubah return type saat override?](#15-bisakah-mengubah-return-type-saat-override)

### 🔴 ABSTRACT CLASS
16. [Apa itu abstract class?](#16-apa-itu-abstract-class)
17. [Apa perbedaan abstract class dengan class biasa?](#17-apa-perbedaan-abstract-class-dengan-class-biasa)
18. [Kapan harus menggunakan abstract class?](#18-kapan-harus-menggunakan-abstract-class)
19. [Bolehkah abstract class tidak punya abstract method?](#19-bolehkah-abstract-class-tidak-punya-abstract-method)

### 🟣 POLYMORPHISM
20. [Apa itu polymorphism?](#20-apa-itu-polymorphism)
21. [Apa fungsi instanceof?](#21-apa-fungsi-instanceof)
22. [Apa itu casting dan kapan digunakan?](#22-apa-itu-casting-dan-kapan-digunakan)

### ⚫ TROUBLESHOOTING
23. [Error: "class X is not abstract and does not override abstract method"](#23-error-class-x-is-not-abstract-and-does-not-override-abstract-method)
24. [Error: "constructor Y in class X cannot be applied"](#24-error-constructor-y-in-class-x-cannot-be-applied)
25. [Error: "X has private access in Y"](#25-error-x-has-private-access-in-y)

---

## 🔵 KONSEP DASAR

### 1. Apa itu inheritance dan mengapa penting?

**Jawaban**:

**Inheritance (Pewarisan)** adalah mekanisme di OOP dimana sebuah class (child/subclass) dapat mewarisi atribut dan method dari class lain (parent/superclass).

**Analogi Kehidupan Nyata**:
```
Manusia (Parent)
├── nama
├── umur
└── bernafas()

     ↓ (mewarisi)

Mahasiswa (Child)
├── nama          ← dari parent
├── umur          ← dari parent
├── bernafas()    ← dari parent
├── nim           ← tambahan sendiri
└── belajar()     ← tambahan sendiri
```

**Mengapa Penting?**

1. **Code Reusability** - Tidak perlu menulis ulang kode yang sama
2. **Maintainability** - Perubahan di parent otomatis berlaku ke semua child
3. **Extensibility** - Mudah menambah fitur baru tanpa mengubah kode lama
4. **Logical Hierarchy** - Mencerminkan hubungan "is-a" dalam dunia nyata

**Contoh**:
```java
class Hewan {
    void bernafas() {
        System.out.println("Bernafas");
    }
}

class Kucing extends Hewan {
    void bersuara() {
        System.out.println("Meow!");
    }
}

// Kucing punya method bernafas() tanpa harus menulis ulang!
```

---

### 2. Kapan sebaiknya menggunakan inheritance?

**Jawaban**:

Gunakan inheritance ketika ada **hubungan "IS-A"** (adalah):

✅ **GUNAKAN Inheritance**:
- Mahasiswa **IS-A** Manusia ✓
- Mobil **IS-A** Kendaraan ✓
- Kucing **IS-A** Hewan ✓
- Manager **IS-A** Pegawai ✓

❌ **JANGAN Gunakan Inheritance**:
- Mobil **HAS-A** Mesin (ini composition, bukan inheritance)
- Mahasiswa **HAS-A** Alamat (composition)
- Komputer **HAS-A** Processor (composition)

**Pedoman**:
1. Ada kesamaan atribut/method yang bisa di-reuse
2. Hubungan logis "is-a" jelas
3. Child class adalah **spesialisasi** dari parent class
4. Tidak memaksakan inheritance untuk code reuse (pertimbangkan composition)

---

### 3. Apa perbedaan class parent dan class child?

**Jawaban**:

| Aspek | Class Parent (Superclass) | Class Child (Subclass) |
|-------|---------------------------|------------------------|
| **Definisi** | Class yang diwarisi | Class yang mewarisi |
| **Keyword** | Tidak ada keyword khusus | Menggunakan `extends` |
| **Atribut/Method** | Bisa diakses child (kecuali private) | Punya semua dari parent + tambahan sendiri |
| **Jumlah** | Bisa punya banyak child | Hanya bisa punya 1 parent (single inheritance) |
| **Constructor** | Dipanggil pertama kali | Memanggil parent constructor dengan super() |

**Contoh**:
```java
// Parent class
class Kendaraan {
    String merk;

    void bergerak() {
        System.out.println("Kendaraan bergerak");
    }
}

// Child class
class Mobil extends Kendaraan {
    int jumlahPintu;

    void bukaKap() {
        System.out.println("Kap mobil dibuka");
    }
}

// Penggunaan
Mobil mobil = new Mobil();
mobil.bergerak();    // Method dari parent
mobil.bukaKap();     // Method sendiri
```

---

### 4. Apakah Java mendukung multiple inheritance?

**Jawaban**:

**TIDAK**. Java **tidak mendukung multiple inheritance untuk class**.

```java
// ❌ TIDAK BISA!
class Anak extends Ayah, Ibu {  // ERROR!
}
```

**Alasan**:
Menghindari **Diamond Problem** - ambiguitas ketika dua parent punya method dengan nama sama.

```
    Hewan
   /     \
Kucing  Anjing
   \     /
  KucingAnjing  ← Bersuara() yang mana dipanggil?
```

**Solusi**:
1. Gunakan **Interface** (akan dipelajari di materi selanjutnya)
2. Gunakan **Composition** (HAS-A relationship)

**Alternative dengan Interface**:
```java
interface Berjalan {
    void jalan();
}

interface Berenang {
    void renang();
}

// ✅ BISA! Implement multiple interfaces
class Bebek implements Berjalan, Berenang {
    public void jalan() { }
    public void renang() { }
}
```

---

## 🟢 PENGGUNAAN EXTENDS DAN SUPER

### 5. Apa fungsi keyword extends?

**Jawaban**:

Keyword `extends` digunakan untuk **membuat inheritance** - menyatakan bahwa sebuah class adalah turunan dari class lain.

**Syntax**:
```java
class ChildClass extends ParentClass {
    // ...
}
```

**Contoh**:
```java
class Hewan {
    String nama;

    void makan() {
        System.out.println(nama + " sedang makan");
    }
}

class Kucing extends Hewan {
    void bersuara() {
        System.out.println("Meow!");
    }
}

// Penggunaan
Kucing kucing = new Kucing();
kucing.nama = "Kitty";
kucing.makan();      // ✅ Bisa pakai method dari parent
kucing.bersuara();   // ✅ Bisa pakai method sendiri
```

**Aturan**:
- Satu class hanya bisa extends **satu** class lain (single inheritance)
- Tidak bisa extends multiple class
- Bisa extends class yang sudah extends class lain (multi-level inheritance)

---

### 6. Apa fungsi keyword super?

**Jawaban**:

Keyword `super` memiliki **3 fungsi utama**:

#### 1. Memanggil Constructor Parent
```java
class Parent {
    String nama;

    Parent(String nama) {
        this.nama = nama;
    }
}

class Child extends Parent {
    int umur;

    Child(String nama, int umur) {
        super(nama);  // ← Memanggil constructor parent
        this.umur = umur;
    }
}
```

#### 2. Memanggil Method Parent
```java
class Parent {
    void tampilkan() {
        System.out.println("Dari Parent");
    }
}

class Child extends Parent {
    @Override
    void tampilkan() {
        super.tampilkan();  // ← Memanggil method parent
        System.out.println("Dari Child");
    }
}
```

#### 3. Mengakses Atribut Parent (jika ter-override)
```java
class Parent {
    String nama = "Parent";
}

class Child extends Parent {
    String nama = "Child";

    void cetak() {
        System.out.println(super.nama);  // ← "Parent"
        System.out.println(this.nama);   // ← "Child"
    }
}
```

---

### 7. Kapan harus menggunakan super()?

**Jawaban**:

Anda **HARUS** menggunakan `super()` ketika:

1. **Parent class punya constructor dengan parameter**

```java
class Kendaraan {
    String merk;

    // Parent punya constructor dengan parameter
    Kendaraan(String merk) {
        this.merk = merk;
    }
}

class Mobil extends Kendaraan {
    int pintu;

    Mobil(String merk, int pintu) {
        super(merk);  // ← WAJIB! Memanggil constructor parent
        this.pintu = pintu;
    }
}
```

2. **Ingin memanggil constructor parent tertentu**

```java
class Parent {
    Parent() { }               // Constructor 1
    Parent(String nama) { }    // Constructor 2
}

class Child extends Parent {
    Child() {
        super("Nama");  // Memanggil constructor 2
    }
}
```

**Aturan Penting**:
- `super()` harus di **baris pertama** dalam constructor
- Jika tidak ada `super()`, Java otomatis panggil `super()` tanpa parameter

---

### 8. Bolehkah tidak memanggil super()?

**Jawaban**:

**Boleh**, JIKA parent class punya **constructor tanpa parameter** (default constructor).

```java
// ✅ BOLEH - Parent punya default constructor
class Parent {
    String nama;

    Parent() {  // Default constructor
        this.nama = "Default";
    }
}

class Child extends Parent {
    Child() {
        // Tidak perlu super() - otomatis dipanggil
    }
}
```

```java
// ❌ ERROR - Parent tidak punya default constructor
class Parent {
    String nama;

    Parent(String nama) {  // Constructor dengan parameter
        this.nama = nama;
    }
}

class Child extends Parent {
    Child() {
        // ERROR! Harus panggil super(nama)
    }
}
```

**Kesimpulan**:
- Jika parent punya default constructor → `super()` optional
- Jika parent hanya punya constructor dengan parameter → `super(...)` WAJIB

---

## 🟡 ACCESS MODIFIER

### 9. Apa perbedaan public, protected, dan private?

**Jawaban**:

| Modifier | Same Class | Same Package | Subclass (Child) | Other Package |
|----------|------------|--------------|------------------|---------------|
| **public** | ✅ | ✅ | ✅ | ✅ |
| **protected** | ✅ | ✅ | ✅ | ❌ |
| **default** (no modifier) | ✅ | ✅ | ❌ | ❌ |
| **private** | ✅ | ❌ | ❌ | ❌ |

**Contoh Lengkap**:
```java
class Parent {
    public String publik = "Semua bisa akses";
    protected String proteksi = "Child bisa akses";
    private String privat = "Hanya Parent yang bisa";

    public void methodPublik() { }
    protected void methodProtected() { }
    private void methodPrivate() { }
}

class Child extends Parent {
    void test() {
        System.out.println(publik);      // ✅ Bisa
        System.out.println(proteksi);    // ✅ Bisa
        System.out.println(privat);      // ❌ ERROR!

        methodPublik();     // ✅ Bisa
        methodProtected();  // ✅ Bisa
        methodPrivate();    // ❌ ERROR!
    }
}
```

**Rekomendasi**:
- `private` → untuk atribut internal class
- `protected` → untuk atribut yang perlu diakses child
- `public` → untuk method yang jadi interface ke luar

---

### 10. Kapan menggunakan protected?

**Jawaban**:

Gunakan `protected` ketika:

1. **Atribut perlu diakses oleh child class**
```java
class BankAccount {
    protected double saldo;  // Child perlu akses langsung

    protected void tambahSaldo(double jumlah) {
        saldo += jumlah;
    }
}

class SavingsAccount extends BankAccount {
    void hitungBunga() {
        double bunga = saldo * 0.05;  // ✅ Bisa akses saldo
        tambahSaldo(bunga);            // ✅ Bisa panggil method
    }
}
```

2. **Method helper untuk child class**
```java
abstract class Pegawai {
    protected double gajiPokok;

    // Method helper untuk child
    protected double hitungPajak() {
        return gajiPokok * 0.05;
    }

    abstract double hitungGaji();
}

class Manager extends Pegawai {
    double tunjangan;

    @Override
    double hitungGaji() {
        double gaji = gajiPokok + tunjangan;
        gaji -= hitungPajak();  // ✅ Bisa pakai method helper
        return gaji;
    }
}
```

**Hindari `protected` jika**:
- Tidak ada rencana inheritance
- Atribut benar-benar internal dan tidak perlu diakses child

---

### 11. Apakah child class bisa mengakses atribut private parent?

**Jawaban**:

**TIDAK BISA** akses langsung, tapi bisa akses **melalui getter/setter**.

```java
class Parent {
    private String rahasia = "Saya rahasia";

    // Getter - public, bisa diakses child
    public String getRahasia() {
        return rahasia;
    }

    // Setter
    public void setRahasia(String rahasia) {
        this.rahasia = rahasia;
    }
}

class Child extends Parent {
    void test() {
        // System.out.println(rahasia);  // ❌ ERROR! Private tidak bisa

        System.out.println(getRahasia());  // ✅ BISA lewat getter
        setRahasia("Nilai baru");          // ✅ BISA lewat setter
    }
}
```

**Kenapa private tidak bisa diakses child?**
- Untuk **enkapsulasi** - child tidak perlu tahu detail internal parent
- Mencegah child mengubah atribut secara langsung yang bisa rusak logika parent
- Memaksa child menggunakan interface (getter/setter) yang sudah disiapkan

---

## 🟠 METHOD OVERRIDING

### 12. Apa itu method overriding?

**Jawaban**:

**Method Overriding** adalah ketika child class **mengubah implementasi** method yang sudah ada di parent class.

**Karakteristik**:
- Nama method **sama persis**
- Parameter **sama persis** (jumlah, tipe, urutan)
- Return type **sama** atau covariant
- Access modifier **sama atau lebih luas** (tidak bisa lebih ketat)

**Contoh**:
```java
class Hewan {
    void bersuara() {
        System.out.println("Hewan mengeluarkan suara");
    }
}

class Kucing extends Hewan {
    @Override  // Annotation (opsional tapi disarankan)
    void bersuara() {
        System.out.println("Meow meow!");  // ← Implementasi berbeda
    }
}

// Penggunaan
Hewan hewan = new Kucing();
hewan.bersuara();  // Output: "Meow meow!" (dari child)
```

**Kapan Digunakan?**
- Ketika child butuh perilaku yang **berbeda** dari parent
- Untuk implementasi spesifik di child class

---

### 13. Apa fungsi annotation @Override?

**Jawaban**:

`@Override` adalah **annotation** yang memberi tahu compiler bahwa method ini adalah override dari parent.

**Fungsi**:
1. **Validasi** - Compiler cek apakah benar-benar override method parent
2. **Dokumentasi** - Programmer lain tahu ini adalah override
3. **Error Prevention** - Mencegah typo yang tidak terdeteksi

**Contoh Tanpa @Override**:
```java
class Parent {
    void tampilkan() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    // Typo: "tampilken" bukan "tampilkan"
    void tampilken() {  // ← Tidak error! Dianggap method baru
        System.out.println("Child");
    }
}

// Bug: Method parent tidak ter-override!
```

**Contoh Dengan @Override**:
```java
class Child extends Parent {
    @Override
    void tampilken() {  // ← ERROR! Compiler tahu ini salah
        System.out.println("Child");
    }
}
// Error: method does not override or implement a method from a supertype
```

**Kesimpulan**: Selalu gunakan `@Override` untuk keamanan!

---

### 14. Apakah @Override wajib digunakan?

**Jawaban**:

**Tidak wajib**, tapi **SANGAT DISARANKAN**.

**Tanpa @Override**:
```java
class Child extends Parent {
    void tampilkan() {  // ✅ Valid, tetap override
        System.out.println("Child");
    }
}
```

**Dengan @Override**:
```java
class Child extends Parent {
    @Override
    void tampilkan() {  // ✅ Valid + compiler validation
        System.out.println("Child");
    }
}
```

**Keuntungan Menggunakan @Override**:
1. ✅ Compiler validasi nama method benar
2. ✅ Compiler validasi signature benar
3. ✅ Code lebih readable
4. ✅ IDE bisa auto-complete dan refactoring lebih baik
5. ✅ Mencegah bug typo

**Best Practice**: **SELALU gunakan @Override**!

---

### 15. Bisakah mengubah return type saat override?

**Jawaban**:

**Bisa**, tapi hanya untuk **covariant return type** (return type yang lebih spesifik).

**✅ BOLEH - Covariant Return Type**:
```java
class Parent {
    Hewan getHewan() {
        return new Hewan();
    }
}

class Child extends Parent {
    @Override
    Kucing getHewan() {  // ✅ Kucing extends Hewan
        return new Kucing();
    }
}
```

**❌ TIDAK BOLEH - Return Type Berbeda Total**:
```java
class Parent {
    String getNama() {
        return "Nama";
    }
}

class Child extends Parent {
    @Override
    int getNama() {  // ❌ ERROR! int bukan covariant dari String
        return 123;
    }
}
```

**❌ TIDAK BOLEH - Return Type Lebih Umum**:
```java
class Parent {
    Kucing getKucing() {
        return new Kucing();
    }
}

class Child extends Parent {
    @Override
    Hewan getKucing() {  // ❌ ERROR! Hewan lebih umum dari Kucing
        return new Hewan();
    }
}
```

**Aturan**:
- Return type harus **sama** atau **subtypenya** (lebih spesifik)
- Tidak bisa lebih umum atau type yang berbeda total

---

## 🔴 ABSTRACT CLASS

### 16. Apa itu abstract class?

**Jawaban**:

**Abstract Class** adalah class yang:
- **Tidak bisa diinstansiasi** (tidak bisa dibuat objectnya)
- Digunakan sebagai **template/blueprint** untuk class lain
- Bisa punya **abstract method** (method tanpa implementasi)
- Bisa punya **concrete method** (method dengan implementasi)

**Deklarasi**:
```java
abstract class NamaClass {
    abstract void methodAbstrak();  // Tidak ada body

    void methodConcrete() {         // Ada body
        System.out.println("Concrete method");
    }
}
```

**Contoh Lengkap**:
```java
abstract class Hewan {
    String nama;

    // Abstract method - harus di-implement child
    abstract void bersuara();

    // Concrete method - sudah ada implementasi
    void bernafas() {
        System.out.println(nama + " bernafas");
    }
}

class Kucing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Meow!");
    }
}

// Penggunaan
// Hewan h = new Hewan();  // ❌ ERROR! Tidak bisa instansiasi
Kucing k = new Kucing();   // ✅ BISA
```

---

### 17. Apa perbedaan abstract class dengan class biasa?

**Jawaban**:

| Aspek | Abstract Class | Class Biasa |
|-------|---------------|-------------|
| **Instansiasi** | ❌ Tidak bisa `new` | ✅ Bisa `new` |
| **Abstract Method** | ✅ Bisa punya | ❌ Tidak bisa |
| **Concrete Method** | ✅ Bisa punya | ✅ Bisa punya |
| **Constructor** | ✅ Punya (dipanggil via super) | ✅ Punya |
| **Keyword** | `abstract class` | `class` |
| **Tujuan** | Template untuk child | Implementasi lengkap |
| **Inheritance** | ⚠️ Harus di-extends | ⚠️ Bisa di-extends (optional) |

**Contoh Abstract Class**:
```java
abstract class BangunDatar {
    abstract double hitungLuas();  // ← Abstract method

    void info() {  // ← Concrete method
        System.out.println("Ini bangun datar");
    }
}
```

**Contoh Class Biasa**:
```java
class Persegi {
    double sisi;

    double hitungLuas() {  // ← Harus ada implementasi
        return sisi * sisi;
    }
}
```

---

### 18. Kapan harus menggunakan abstract class?

**Jawaban**:

Gunakan abstract class ketika:

1. **Ada method yang HARUS di-implement berbeda di setiap child**
```java
abstract class Kendaraan {
    abstract void nyalakanMesin();  // Mobil dan Motor beda cara
}
```

2. **Ada common behavior yang bisa di-reuse**
```java
abstract class Pegawai {
    protected double gajiPokok;

    // Common behavior
    void cekKehadiran() {
        System.out.println("Cek kehadiran");
    }

    // Harus di-implement child
    abstract double hitungGaji();
}
```

3. **Ingin prevent direct instantiation**
```java
abstract class Database {
    abstract void connect();
    // Tidak ingin ada object Database langsung
    // Harus spesifik: MySQL, PostgreSQL, dll
}
```

4. **Partial implementation** - sebagian method sudah ada, sebagian belum
```java
abstract class Game {
    void start() {  // Sudah ada implementasi
        System.out.println("Game started");
    }

    abstract void render();  // Child yang implement
}
```

**Jangan gunakan abstract class jika**:
- Semua method sudah lengkap implementasinya → pakai class biasa
- Tidak ada common behavior → pakai interface

---

### 19. Bolehkah abstract class tidak punya abstract method?

**Jawaban**:

**BOLEH**! Abstract class tidak wajib punya abstract method.

**Contoh**:
```java
// ✅ VALID - Abstract class tanpa abstract method
abstract class Database {
    String connectionString;

    void connect() {
        System.out.println("Connecting to " + connectionString);
    }

    void disconnect() {
        System.out.println("Disconnected");
    }
}

class MySQL extends Database {
    // Tidak harus override apa-apa
}
```

**Kapan digunakan?**
- Ketika Anda ingin **prevent instantiation** tapi semua method sudah lengkap
- Sebagai base class yang tidak boleh diinstansiasi langsung

**Contoh Use Case**:
```java
abstract class HttpServlet {
    // Semua method concrete, tapi tidak boleh new HttpServlet()
    void service(Request req, Response res) {
        // implementasi lengkap
    }
}

class MyServlet extends HttpServlet {
    // Just extend, tidak harus override
}
```

---

## 🟣 POLYMORPHISM

### 20. Apa itu polymorphism?

**Jawaban**:

**Polymorphism** (banyak bentuk) adalah kemampuan object untuk memiliki **banyak bentuk**. Dalam Java, ini berarti:
- Reference type parent bisa **menunjuk ke object child**
- Method yang dipanggil adalah method **sesuai object aslinya** (bukan reference type)

**Contoh**:
```java
class Hewan {
    void bersuara() {
        System.out.println("Suara hewan");
    }
}

class Kucing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Meow!");
    }
}

class Anjing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Guk!");
    }
}

// POLYMORPHISM
Hewan h1 = new Kucing();  // Reference Hewan, object Kucing
Hewan h2 = new Anjing();  // Reference Hewan, object Anjing

h1.bersuara();  // Output: "Meow!" (dari Kucing)
h2.bersuara();  // Output: "Guk!" (dari Anjing)
```

**Manfaat**:
1. **Fleksibilitas** - Satu variable bisa hold berbagai tipe object
2. **Extensibility** - Mudah tambah child baru tanpa ubah code lama
3. **Code yang lebih clean** - Array/List polymorphic

**Contoh Array Polymorphic**:
```java
Hewan[] kebunBinatang = new Hewan[3];
kebunBinatang[0] = new Kucing();
kebunBinatang[1] = new Anjing();
kebunBinatang[2] = new Kucing();

for (Hewan h : kebunBinatang) {
    h.bersuara();  // Setiap hewan bersuara sesuai jenisnya
}
```

---

### 21. Apa fungsi instanceof?

**Jawaban**:

`instanceof` adalah operator untuk **mengecek tipe object** pada runtime.

**Syntax**:
```java
if (object instanceof ClassName) {
    // true jika object adalah instance dari ClassName
}
```

**Contoh Penggunaan**:
```java
class Hewan { }
class Kucing extends Hewan { }
class Anjing extends Hewan { }

Hewan h = new Kucing();

// Cek tipe
System.out.println(h instanceof Kucing);  // true
System.out.println(h instanceof Anjing);  // false
System.out.println(h instanceof Hewan);   // true (Kucing IS-A Hewan)
```

**Kapan Digunakan?**

1. **Sebelum casting** (untuk keamanan)
```java
void prosesHewan(Hewan h) {
    if (h instanceof Kucing) {
        Kucing k = (Kucing) h;  // Safe casting
        k.meow();
    } else if (h instanceof Anjing) {
        Anjing a = (Anjing) h;
        a.gonggong();
    }
}
```

2. **Conditional logic berdasarkan tipe**
```java
double hitungDiskon(Produk p) {
    if (p instanceof Elektronik) {
        return p.harga * 0.10;  // 10% diskon
    } else if (p instanceof Pakaian) {
        return p.harga * 0.15;  // 15% diskon
    }
    return 0;
}
```

**Best Practice**: Jangan overuse instanceof - pertimbangkan polymorphism atau visitor pattern.

---

### 22. Apa itu casting dan kapan digunakan?

**Jawaban**:

**Casting** adalah mengubah tipe reference variable.

#### Jenis Casting:

**1. Upcasting (Widening)** - Child ke Parent (otomatis)
```java
Kucing kucing = new Kucing();
Hewan hewan = kucing;  // ✅ Otomatis, tidak perlu cast
```

**2. Downcasting (Narrowing)** - Parent ke Child (manual, berbahaya!)
```java
Hewan hewan = new Kucing();
Kucing kucing = (Kucing) hewan;  // ⚠️ Manual cast, bisa error!
```

**Contoh Safe Downcasting**:
```java
void prosesHewan(Hewan h) {
    // Cek dulu dengan instanceof
    if (h instanceof Kucing) {
        Kucing k = (Kucing) h;  // Safe casting
        k.meong();  // Method spesifik Kucing
    }
}
```

**Contoh Unsafe Downcasting (ClassCastException)**:
```java
Hewan h = new Anjing();
Kucing k = (Kucing) h;  // ❌ RUNTIME ERROR! Anjing bukan Kucing
```

**Best Practice**:
```java
// ✅ BENAR
if (hewan instanceof Kucing) {
    Kucing k = (Kucing) hewan;
    k.meow();
}

// ❌ SALAH - Langsung cast tanpa cek
Kucing k = (Kucing) hewan;  // Bahaya!
```

---

## ⚫ TROUBLESHOOTING

### 23. Error: "class X is not abstract and does not override abstract method"

**Penyebab**:
Class child extends abstract class tapi tidak implement semua abstract method.

**Contoh Error**:
```java
abstract class Hewan {
    abstract void bersuara();
    abstract void bergerak();
}

class Kucing extends Hewan {  // ❌ ERROR!
    @Override
    void bersuara() {
        System.out.println("Meow");
    }
    // bergerak() tidak di-implement!
}
```

**Solusi 1**: Implement semua abstract method
```java
class Kucing extends Hewan {  // ✅ OK
    @Override
    void bersuara() {
        System.out.println("Meow");
    }

    @Override
    void bergerak() {  // ← Ditambahkan
        System.out.println("Kucing berjalan");
    }
}
```

**Solusi 2**: Buat class child juga abstract
```java
abstract class Kucing extends Hewan {  // ✅ OK
    @Override
    void bersuara() {
        System.out.println("Meow");
    }
    // bergerak() akan di-implement di subclass Kucing
}
```

---

### 24. Error: "constructor Y in class X cannot be applied"

**Penyebab**:
Parent class punya constructor dengan parameter, tapi child tidak memanggil super() dengan benar.

**Contoh Error**:
```java
class Parent {
    String nama;

    Parent(String nama) {  // Constructor dengan parameter
        this.nama = nama;
    }
}

class Child extends Parent {  // ❌ ERROR!
    Child() {
        // Tidak ada super(nama)
    }
}
```

**Error Message**:
```
constructor Parent in class Parent cannot be applied to given types
```

**Solusi**:
```java
class Child extends Parent {  // ✅ OK
    Child(String nama) {
        super(nama);  // ← Panggil constructor parent
    }
}
```

**Alternative - Parent punya default constructor**:
```java
class Parent {
    String nama;

    Parent() {  // Default constructor
        this.nama = "Default";
    }

    Parent(String nama) {
        this.nama = nama;
    }
}

class Child extends Parent {  // ✅ OK sekarang
    Child() {
        // super() otomatis dipanggil
    }
}
```

---

### 25. Error: "X has private access in Y"

**Penyebab**:
Mencoba akses atribut/method private dari child class.

**Contoh Error**:
```java
class Parent {
    private String rahasia = "Secret";
}

class Child extends Parent {
    void tampilkan() {
        System.out.println(rahasia);  // ❌ ERROR! Private tidak bisa diakses
    }
}
```

**Solusi 1**: Gunakan getter/setter
```java
class Parent {
    private String rahasia = "Secret";

    protected String getRahasia() {  // ← Getter
        return rahasia;
    }
}

class Child extends Parent {
    void tampilkan() {
        System.out.println(getRahasia());  // ✅ OK
    }
}
```

**Solusi 2**: Ubah ke protected (jika memang perlu diakses child)
```java
class Parent {
    protected String rahasia = "Secret";  // ← protected, bukan private
}

class Child extends Parent {
    void tampilkan() {
        System.out.println(rahasia);  // ✅ OK
    }
}
```

**Best Practice**:
- Tetap gunakan `private` untuk enkapsulasi
- Sediakan getter/setter jika child perlu akses
- Hanya gunakan `protected` jika benar-benar perlu direct access

---

## 📚 Kesimpulan

FAQ ini mencakup **25 pertanyaan paling umum** tentang Inheritance. Jika ada pertanyaan lain yang tidak tercantum di sini, silakan:

1. Cek kembali **01_Materi_Pembelajaran/01_konsep_inheritance.md**
2. Lihat **02_Glossarium.md** untuk definisi istilah
3. Tanyakan ke tutor atau forum diskusi
4. Praktik lebih banyak dengan latihan di **02_Latihan_dan_Praktik/**

---

**Selamat Belajar! Keep Asking Questions! 💬🚀**

*Tutorial Ke-3: Inheritance | STSI4201 Pemrograman Berbasis Desktop*
