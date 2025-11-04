# Glossarium - Istilah Inheritance dan OOP

**Tutorial Ke-3: Inheritance**
**Mata Kuliah**: Pemrograman Berbasis Desktop (STSI4201)
**Dosen**: Anton Prafanto, S.Kom, M.T.

---

## 📖 Tentang Glossarium

Glossarium ini berisi **definisi istilah-istilah penting** yang digunakan dalam pembelajaran Inheritance dan OOP. Istilah diurutkan secara alfabetis untuk memudahkan pencarian.

**Cara Menggunakan**:
- Gunakan fitur Find (Ctrl+F) untuk mencari istilah cepat
- 🟢 = Istilah dasar (wajib dipahami)
- 🟡 = Istilah menengah
- 🔴 = Istilah lanjutan

---

## A

### 🟢 Abstract Class
**Definisi**: Class yang tidak dapat diinstansiasi (tidak bisa dibuat objectnya) dan berfungsi sebagai template untuk class turunan.

**Contoh**:
```java
abstract class Hewan {
    abstract void bersuara();
}
```

**Karakteristik**:
- Dideklarasikan dengan keyword `abstract`
- Bisa punya abstract method dan concrete method
- Harus di-extends oleh class lain

**Lihat juga**: Abstract Method, Concrete Class

---

### 🟡 Abstract Method
**Definisi**: Method yang dideklarasikan tanpa implementasi (tanpa body) dan harus di-implement oleh class turunan.

**Contoh**:
```java
abstract void hitungLuas();  // Tidak ada body { }
```

**Karakteristik**:
- Tidak punya body `{ }`
- Hanya ada di abstract class atau interface
- Harus di-override oleh subclass

**Lihat juga**: Abstract Class, Method Overriding

---

### 🟢 Access Modifier
**Definisi**: Keyword yang menentukan tingkat akses terhadap class, method, atau atribut.

**Jenis**:
- `public` - Bisa diakses dari mana saja
- `protected` - Bisa diakses oleh package sama dan subclass
- `default` (no modifier) - Hanya package sama
- `private` - Hanya di dalam class itu sendiri

**Contoh**:
```java
public class MyClass {
    public int publik;
    protected int proteksi;
    private int privat;
}
```

**Lihat juga**: Encapsulation, Protected, Private, Public

---

### 🟡 Annotation
**Definisi**: Metadata yang ditambahkan pada code untuk memberikan informasi tambahan ke compiler atau runtime.

**Contoh dalam Inheritance**:
```java
@Override  // Annotation untuk method overriding
void method() { }
```

**Manfaat**:
- Compile-time checking
- Runtime processing
- Code generation

**Lihat juga**: @Override

---

## B

### 🟢 Base Class
**Definisi**: Istilah lain untuk **Parent Class** atau **Superclass**. Class yang diwarisi oleh class lain.

**Contoh**:
```java
class Hewan { }  // ← Base class

class Kucing extends Hewan { }  // Kucing mewarisi Hewan
```

**Lihat juga**: Parent Class, Superclass

---

## C

### 🔴 Casting
**Definisi**: Proses mengubah tipe reference variable dari satu class ke class lain dalam hierarki inheritance.

**Jenis**:
- **Upcasting**: Child → Parent (otomatis)
- **Downcasting**: Parent → Child (manual, berbahaya)

**Contoh**:
```java
// Upcasting
Kucing kucing = new Kucing();
Hewan hewan = kucing;  // Otomatis

// Downcasting
Hewan h = new Kucing();
Kucing k = (Kucing) h;  // Manual, perlu cast
```

**Lihat juga**: Upcasting, Downcasting, instanceof

---

### 🟢 Child Class
**Definisi**: Class yang mewarisi (extends) class lain. Disebut juga **Subclass** atau **Derived Class**.

**Contoh**:
```java
class Kucing extends Hewan { }
//    ↑ Child      ↑ Parent
```

**Karakteristik**:
- Mewarisi semua atribut dan method parent (kecuali private)
- Bisa menambah atribut dan method baru
- Bisa override method parent

**Lihat juga**: Parent Class, Extends, Inheritance

---

### 🟡 Concrete Class
**Definisi**: Class biasa yang bisa diinstansiasi (dibuat objectnya), kebalikan dari abstract class.

**Contoh**:
```java
class Kucing {  // ← Concrete class
    void meow() {
        System.out.println("Meow!");
    }
}

Kucing k = new Kucing();  // ✅ Bisa diinstansiasi
```

**Lihat juga**: Abstract Class

---

### 🟡 Concrete Method
**Definisi**: Method yang punya implementasi lengkap (ada body), kebalikan dari abstract method.

**Contoh**:
```java
void tampilkan() {  // ← Concrete method
    System.out.println("Hello");  // Ada implementasi
}
```

**Lihat juga**: Abstract Method

---

### 🟢 Constructor
**Definisi**: Method khusus yang dipanggil saat object dibuat. Dalam inheritance, constructor parent dipanggil sebelum constructor child.

**Contoh**:
```java
class Parent {
    Parent() {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {
    Child() {
        super();  // Memanggil constructor parent
        System.out.println("Child constructor");
    }
}
```

**Lihat juga**: super()

---

### 🔴 Covariant Return Type
**Definisi**: Fitur Java yang membolehkan override method dengan return type yang lebih spesifik (subtype).

**Contoh**:
```java
class Parent {
    Hewan getHewan() {
        return new Hewan();
    }
}

class Child extends Parent {
    @Override
    Kucing getHewan() {  // Kucing is-a Hewan
        return new Kucing();  // ✅ Valid covariant return
    }
}
```

**Lihat juga**: Method Overriding

---

## D

### 🟢 Derived Class
**Definisi**: Istilah lain untuk **Child Class** atau **Subclass**. Class yang diturunkan dari class lain.

**Lihat juga**: Child Class, Subclass

---

### 🔴 Diamond Problem
**Definisi**: Masalah ambiguitas dalam multiple inheritance ketika satu class mewarisi dua class yang punya method sama.

**Ilustrasi**:
```
    ClassA
   /      \
ClassB   ClassC
   \      /
   ClassD  ← Method dari B atau C?
```

**Solusi Java**: Tidak support multiple inheritance untuk class, gunakan interface.

**Lihat juga**: Multiple Inheritance

---

### 🔴 Downcasting
**Definisi**: Casting dari parent class ke child class. Berbahaya dan bisa menyebabkan `ClassCastException`.

**Contoh**:
```java
Hewan h = new Kucing();
Kucing k = (Kucing) h;  // ← Downcasting

// Bahaya jika tipe salah
Hewan h2 = new Anjing();
Kucing k2 = (Kucing) h2;  // ❌ Runtime error!
```

**Best Practice**: Selalu cek dengan `instanceof` sebelum downcasting.

**Lihat juga**: Casting, Upcasting, instanceof

---

### 🟡 Dynamic Binding
**Definisi**: Proses menentukan method yang akan dipanggil pada **runtime** berdasarkan tipe object actual, bukan reference type.

**Contoh**:
```java
Hewan h = new Kucing();  // Reference: Hewan, Object: Kucing
h.bersuara();  // Method Kucing.bersuara() yang dipanggil (runtime)
```

**Lihat juga**: Polymorphism, Method Overriding

---

## E

### 🟢 Encapsulation
**Definisi**: Prinsip OOP untuk menyembunyikan detail internal class dan hanya expose interface public.

**Implementasi**:
- Atribut dibuat `private`
- Akses via getter dan setter public

**Contoh**:
```java
class BankAccount {
    private double saldo;  // Hidden

    public double getSaldo() {  // Public interface
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        }
    }
}
```

**Lihat juga**: Access Modifier, Private, Public

---

### 🟢 Extends
**Definisi**: Keyword Java untuk membuat inheritance relationship antara child class dan parent class.

**Syntax**:
```java
class ChildClass extends ParentClass {
    // ...
}
```

**Contoh**:
```java
class Kucing extends Hewan {
    // Kucing mewarisi semua dari Hewan
}
```

**Aturan**: Satu class hanya bisa extends **satu** class lain (single inheritance).

**Lihat juga**: Inheritance, Single Inheritance

---

## G

### 🟡 Generalization
**Definisi**: Proses mengidentifikasi karakteristik umum dari beberapa class dan membuat parent class yang merepresentasikannya.

**Contoh**:
```
Kucing, Anjing, Burung → Generalisasi → Hewan
```

**Kebalikan**: Specialization

**Lihat juga**: Inheritance, Parent Class

---

## H

### 🟡 Has-A Relationship
**Definisi**: Hubungan komposisi dimana satu class "memiliki" object dari class lain. Bukan inheritance!

**Contoh**:
```java
class Mobil {
    private Mesin mesin;  // Mobil HAS-A Mesin (bukan IS-A)
}
```

**Perbedaan dengan IS-A**:
- HAS-A = Composition (punya)
- IS-A = Inheritance (adalah)

**Lihat juga**: IS-A Relationship, Composition

---

### 🟢 Hierarki (Class Hierarchy)
**Definisi**: Struktur pohon yang menunjukkan hubungan inheritance antar class.

**Contoh**:
```
MakhlukHidup
    ├── Hewan
    │   ├── Mamalia
    │   │   ├── Kucing
    │   │   └── Anjing
    │   └── Burung
    └── Tumbuhan
```

**Lihat juga**: Inheritance, Multi-level Inheritance

---

## I

### 🟢 Inheritance
**Definisi**: Mekanisme OOP dimana class baru (child) mewarisi atribut dan method dari class yang sudah ada (parent).

**Tujuan**:
- Code reusability
- Extensibility
- Polymorphism

**Contoh**:
```java
class Hewan {  // Parent
    void bernafas() { }
}

class Kucing extends Hewan {  // Child mewarisi bernafas()
    void meow() { }
}
```

**Lihat juga**: Extends, Parent Class, Child Class

---

### 🔴 instanceof
**Definisi**: Operator Java untuk mengecek apakah object adalah instance dari class tertentu.

**Syntax**:
```java
if (object instanceof ClassName) {
    // true jika object adalah ClassName
}
```

**Contoh**:
```java
Hewan h = new Kucing();
System.out.println(h instanceof Kucing);  // true
System.out.println(h instanceof Anjing);  // false
System.out.println(h instanceof Hewan);   // true
```

**Penggunaan**: Sebelum downcasting untuk menghindari `ClassCastException`.

**Lihat juga**: Casting, Polymorphism

---

### 🟢 IS-A Relationship
**Definisi**: Hubungan inheritance dimana child class "adalah" parent class. Kriteria utama menggunakan inheritance.

**Contoh**:
- Kucing IS-A Hewan ✅
- Mobil IS-A Kendaraan ✅
- Mahasiswa IS-A Manusia ✅

**Bukan IS-A**:
- Mobil HAS-A Mesin ❌ (ini composition)

**Lihat juga**: Inheritance, Has-A Relationship

---

## L

### 🟡 Liskov Substitution Principle (LSP)
**Definisi**: Prinsip SOLID yang menyatakan object parent class harus bisa diganti dengan object child class tanpa error.

**Contoh**:
```java
void prosesHewan(Hewan h) {
    h.bersuara();
}

// Harus bisa diganti dengan child
prosesHewan(new Kucing());  // ✅ OK
prosesHewan(new Anjing());  // ✅ OK
```

**Lihat juga**: Polymorphism, SOLID Principles

---

## M

### 🟢 Method Overriding
**Definisi**: Proses child class meng-override (mengganti implementasi) method dari parent class dengan implementasi berbeda.

**Syarat**:
- Nama method sama
- Parameter sama (jumlah, tipe, urutan)
- Return type sama atau covariant

**Contoh**:
```java
class Parent {
    void tampilkan() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    @Override
    void tampilkan() {  // Override
        System.out.println("Child");
    }
}
```

**Lihat juga**: @Override, Polymorphism

---

### 🔴 Multi-level Inheritance
**Definisi**: Inheritance bertingkat dimana child class menjadi parent untuk class lain.

**Contoh**:
```java
class MakhlukHidup { }           // Level 1
class Hewan extends MakhlukHidup { }  // Level 2
class Mamalia extends Hewan { }       // Level 3
class Kucing extends Mamalia { }      // Level 4
```

**Hierarki**:
```
MakhlukHidup → Hewan → Mamalia → Kucing
```

**Lihat juga**: Inheritance, Hierarki

---

### 🔴 Multiple Inheritance
**Definisi**: Kemampuan class mewarisi dari lebih dari satu parent class. **TIDAK DIDUKUNG** di Java untuk class.

**Contoh (tidak valid di Java)**:
```java
class Anak extends Ayah, Ibu { }  // ❌ ERROR!
```

**Solusi**: Gunakan interface untuk multiple inheritance.

**Lihat juga**: Diamond Problem, Interface, Single Inheritance

---

## O

### 🟢 Object
**Definisi**: Instance dari class. Hasil dari instansiasi class.

**Contoh**:
```java
Kucing kucing = new Kucing();
//     ↑ reference   ↑ object
```

**Lihat juga**: Class, Instantiation

---

### 🟢 @Override
**Definisi**: Annotation yang memberi tahu compiler bahwa method adalah override dari parent class.

**Contoh**:
```java
class Child extends Parent {
    @Override  // ← Annotation
    void method() {
        // implementasi
    }
}
```

**Manfaat**:
- Compiler validation
- Cegah typo
- Code lebih readable

**Lihat juga**: Annotation, Method Overriding

---

## P

### 🟢 Parent Class
**Definisi**: Class yang diwarisi oleh class lain. Disebut juga **Superclass** atau **Base Class**.

**Contoh**:
```java
class Hewan { }  // ← Parent class

class Kucing extends Hewan { }  // Kucing adalah child
```

**Lihat juga**: Child Class, Superclass, Base Class

---

### 🟡 Polymorphism
**Definisi**: Kemampuan object untuk memiliki banyak bentuk. Reference parent class bisa menunjuk ke object child class.

**Jenis**:
1. **Compile-time** polymorphism (method overloading)
2. **Runtime** polymorphism (method overriding)

**Contoh**:
```java
Hewan h1 = new Kucing();  // Polymorphic
Hewan h2 = new Anjing();  // Polymorphic

h1.bersuara();  // Method dari Kucing
h2.bersuara();  // Method dari Anjing
```

**Lihat juga**: Method Overriding, Dynamic Binding

---

### 🟢 Private
**Definisi**: Access modifier yang membatasi akses hanya di dalam class itu sendiri. Tidak bisa diakses oleh child class.

**Contoh**:
```java
class Parent {
    private int rahasia;  // Hanya Parent yang bisa akses
}

class Child extends Parent {
    void test() {
        // System.out.println(rahasia);  // ❌ ERROR!
    }
}
```

**Lihat juga**: Access Modifier, Protected, Public, Encapsulation

---

### 🟡 Protected
**Definisi**: Access modifier yang membolehkan akses dari:
- Class itu sendiri
- Subclass (child class)
- Package yang sama

**Contoh**:
```java
class Parent {
    protected int nilai;  // Child bisa akses
}

class Child extends Parent {
    void test() {
        System.out.println(nilai);  // ✅ Bisa akses
    }
}
```

**Lihat juga**: Access Modifier, Private, Public

---

### 🟢 Public
**Definisi**: Access modifier yang membolehkan akses dari mana saja tanpa batasan.

**Contoh**:
```java
public class MyClass {
    public int data;  // Bisa diakses dari mana saja

    public void method() { }
}
```

**Lihat juga**: Access Modifier, Private, Protected

---

## R

### 🟡 Reusability
**Definisi**: Kemampuan menggunakan kembali kode yang sudah ada tanpa menulis ulang. Salah satu tujuan utama inheritance.

**Contoh**:
```java
class Hewan {
    void bernafas() {  // Code ini bisa di-reuse
        System.out.println("Bernafas");
    }
}

class Kucing extends Hewan {
    // Langsung punya method bernafas() tanpa menulis ulang
}
```

**Lihat juga**: Inheritance, DRY Principle

---

### 🔴 Runtime Polymorphism
**Definisi**: Jenis polymorphism dimana method yang dipanggil ditentukan pada **runtime** berdasarkan tipe object actual.

**Contoh**:
```java
Hewan h = new Kucing();  // Compile-time: type Hewan, Runtime: object Kucing
h.bersuara();  // Runtime binding → panggil Kucing.bersuara()
```

**Lihat juga**: Polymorphism, Method Overriding, Dynamic Binding

---

## S

### 🟡 Single Inheritance
**Definisi**: Inheritance dimana satu class hanya bisa mewarisi dari **satu** parent class. Java menggunakan single inheritance.

**Contoh**:
```java
class Kucing extends Hewan { }  // ✅ Single inheritance

class Anak extends Ayah, Ibu { }  // ❌ Multiple inheritance - ERROR!
```

**Lihat juga**: Multiple Inheritance, Extends

---

### 🟡 Specialization
**Definisi**: Proses membuat child class yang lebih spesifik dari parent class.

**Contoh**:
```
Hewan (umum) → Kucing (spesifik)
```

**Kebalikan**: Generalization

**Lihat juga**: Inheritance, Child Class

---

### 🟢 Subclass
**Definisi**: Istilah lain untuk **Child Class** atau **Derived Class**. Class yang mewarisi class lain.

**Lihat juga**: Child Class, Derived Class

---

### 🟢 Super
**Definisi**: Keyword Java untuk merujuk ke parent class.

**Penggunaan**:
1. `super()` - Memanggil constructor parent
2. `super.method()` - Memanggil method parent
3. `super.attribute` - Mengakses atribut parent

**Contoh**:
```java
class Child extends Parent {
    Child() {
        super();  // Panggil constructor parent
    }

    void method() {
        super.method();  // Panggil method parent
    }
}
```

**Lihat juga**: Constructor, Method Overriding

---

### 🟢 Superclass
**Definisi**: Istilah lain untuk **Parent Class** atau **Base Class**. Class yang diwarisi.

**Lihat juga**: Parent Class, Base Class

---

## T

### 🟡 this
**Definisi**: Keyword Java untuk merujuk ke object instance saat ini.

**Penggunaan**:
1. Membedakan atribut dan parameter dengan nama sama
2. Memanggil constructor lain di class yang sama

**Contoh**:
```java
class MyClass {
    int nilai;

    MyClass(int nilai) {
        this.nilai = nilai;  // this.nilai = atribut, nilai = parameter
    }

    void setNilai(int nilai) {
        this.nilai = nilai;
    }
}
```

**Perbedaan dengan super**: `this` = class sendiri, `super` = parent class.

**Lihat juga**: Super, Constructor

---

## U

### 🔴 Upcasting
**Definisi**: Casting dari child class ke parent class. Dilakukan **otomatis** dan selalu aman.

**Contoh**:
```java
Kucing kucing = new Kucing();
Hewan hewan = kucing;  // ← Upcasting (otomatis, tidak perlu cast)
```

**Karakteristik**:
- Otomatis (implicit)
- Selalu berhasil
- Tidak perlu operator cast `()`

**Lihat juga**: Downcasting, Casting, Polymorphism

---

## V

### 🔴 Virtual Method Invocation
**Definisi**: Mekanisme Java dimana method yang dipanggil ditentukan berdasarkan **object type** pada runtime, bukan reference type.

**Contoh**:
```java
Hewan h = new Kucing();  // Reference: Hewan, Object: Kucing
h.bersuara();  // Virtual method invocation → panggil Kucing.bersuara()
```

**Lihat juga**: Polymorphism, Dynamic Binding, Method Overriding

---

## 📊 Ringkasan Istilah Berdasarkan Kategori

### Konsep Utama
- Inheritance
- Parent Class / Superclass / Base Class
- Child Class / Subclass / Derived Class
- Extends

### Access Control
- Access Modifier
- Public
- Protected
- Private
- Encapsulation

### Method
- Method Overriding
- @Override
- Abstract Method
- Concrete Method
- Virtual Method Invocation

### Class
- Abstract Class
- Concrete Class
- Single Inheritance
- Multi-level Inheritance
- Multiple Inheritance

### Polymorphism
- Polymorphism
- Upcasting
- Downcasting
- Casting
- instanceof
- Dynamic Binding
- Runtime Polymorphism

### Relationship
- IS-A Relationship
- Has-A Relationship
- Generalization
- Specialization
- Hierarki

### Keywords
- extends
- super
- this
- abstract
- @Override

---

## 📚 Cara Belajar Istilah

1. **Fokus pada istilah 🟢 (dasar) terlebih dahulu**
2. **Praktik** - Gunakan istilah dalam kode
3. **Hubungkan** - Lihat relasi antar istilah
4. **Ulangi** - Review berkala
5. **Terapkan** - Gunakan dalam latihan

---

**Selamat Belajar! Master the Vocabulary! 📚✨**

*Tutorial Ke-3: Inheritance | STSI4201 Pemrograman Berbasis Desktop*
