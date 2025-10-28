# Glossarium - Istilah Penting OOP & Inheritance

## 📚 Daftar Istilah

### A

**Abstraction (Abstraksi)** - Menyembunyikan detail implementasi kompleks dan hanya menampilkan fitur penting.

**Access Modifier** - Keyword yang mengontrol akses ke class, method, dan field (public, protected, private, default).

**Abstract Class** - Class yang tidak bisa diinstansiasi langsung dan biasanya memiliki abstract method.

**Aggregation** - Hubungan "has-a" antar objek dimana objek bisa exist independen.

**Association** - Hubungan antar class yang menunjukkan bagaimana class berinteraksi.

**Attribute** - Variabel dalam class yang menyimpan data (juga disebut field atau property).

### B

**Behavior** - Actions yang bisa dilakukan oleh objek (didefinisikan sebagai methods).

**Binding** - Proses menghubungkan method call dengan method implementation (static/dynamic).

**Blueprint** - Template untuk membuat objek (lihat Class).

**Body** - Bagian dalam method yang berisi kode yang dieksekusi.

**Boolean** - Tipe data yang hanya memiliki dua nilai: true atau false.

### C

**Class** - Blueprint/template untuk membuat objek dengan atribut dan perilaku yang sama.

**Constructor** - Method khusus yang dipanggil saat membuat objek baru untuk inisialisasi.

**Composition** - Hubungan "has-a" yang kuat dimana child tidak bisa exist tanpa parent.

**Concrete Class** - Class yang bisa diinstansiasi (bukan abstract).

**Coupling** - Tingkat ketergantungan antar class (loose coupling vs tight coupling).

**Cohesion** - Tingkat keterkaitan elemen dalam satu class (high cohesion lebih baik).

### D

**Data Hiding** - Prinsip menyembunyikan data internal dari akses eksternal (lihat Encapsulation).

**Declaration** - Pernyataan untuk membuat variabel, method, atau class.

**Default Constructor** - Constructor tanpa parameter yang otomatis dibuat Java jika tidak ada constructor lain.

**Dependency** - Ketika satu class membutuhkan class lain untuk berfungsi.

**Dynamic Binding** - Method resolution dilakukan saat runtime (polymorphism).

### E

**Encapsulation** - Membungkus data (atribut) dan method yang beroperasi pada data dalam satu unit.

**Entity** - Objek yang memiliki identitas unik dan bisa exist sendiri.

**Extensibility** - Kemampuan sistem untuk ditambah fitur baru tanpa mengubah kode yang ada.

**Extends** - Keyword Java untuk membuat inheritance relationship.

### F

**Field** - Variabel dalam class (lihat Attribute).

**Final** - Keyword yang membuat variabel, method, atau class tidak bisa diubah/ di-extend.

**Friend Class** - Konsep di beberapa bahasa (tidak ada di Java) untuk akses private.

### G

**Getter** - Method untuk mengambil nilai private field.

**Generic** - Fitur Java untuk membuat class/method yang bekerja dengan berbagai tipe data.

### H

**Has-A Relationship** - Hubungan komposisi/agregasi (lihat Composition).

**Hierarchy** - Struktur bertingkat dalam inheritance.

**Hiding** - Ketika subclass menyembunyikan method/field parent.

### I

**Implementation** - Kode konkret dari abstract method atau interface.

**Inheritance** - Mekanisme dimana class bisa mewarisi atribut dan method dari class lain.

**Instance** - Objek konkret dari sebuah class.

**Instance Variable** - Field yang dimiliki oleh setiap instance objek.

**Instanceof** - Operator Java untuk mengecek tipe objek.

**Interface** - Contract yang mendefinisikan method yang harus diimplementasikan class.

**Is-A Relationship** - Hubungan inheritance (Child is-a Parent).

### J

**Java Bean** - Class Java dengan properties, private fields, public getters/setters.

**JVM (Java Virtual Machine)** - Mesin virtual yang mengeksekusi bytecode Java.

### L

**Late Binding** - Lihat Dynamic Binding.

**Loose Coupling** - Desain dimana class memiliki ketergantungan minimal.

### M

**Member** - Field, method, atau nested class dalam class.

**Message Passing** - Komunikasi antar objek melalui method calls.

**Method** - Blok kode yang melakukan tugas tertentu dalam class.

**Method Overloading** - Multiple method dengan nama sama tapi parameter berbeda dalam satu class.

**Method Overriding** - Subclass mengimplementasikan ulang method dari superclass.

**Multiple Inheritance** - Class mewarisi dari multiple parent (tidak didukung Java, gunakan interface).

**Multilevel Inheritance** - Inheritance bertingkat (Grandparent → Parent → Child).

### N

**Namespace** - Area untuk menghindari naming conflicts (package di Java).

**New** - Keyword untuk membuat objek baru.

### O

**Object** - Instance dari class dengan state dan behavior.

**Object-Oriented Programming (OOP)** - Paradigma pemrograman berbasis objek.

**Overloading** - Lihat Method Overloading.

**Overriding** - Lihat Method Overriding.

### P

**Package** - Grup terkait class dan interface.

**Parameter** - Variabel dalam method signature.

**Parent Class** - Class yang diwarisi (lihat Superclass).

**Polymorphism** - Kemampuan objek memiliki banyak bentuk.

**Private** - Access modifier yang paling restrictif (hanya class yang sama).

**Property** - Lihat Attribute.

**Protected** - Access modifier untuk class, subclass, dan package yang sama.

**Public** - Access modifier yang paling terbuka (bisa diakses dari mana saja).

### R

**Reference** - Variabel yang menunjuk ke objek di memory.

**Refactoring** - Proses memperbaiki kode tanpa mengubah fungsionalitas.

**Relationship** - Hubungan antar class (association, aggregation, composition).

**Reuse** - Menggunakan kembali kode yang sudah ada.

### S

**Scope** - Area dimana variabel/method bisa diakses.

**Setter** - Method untuk mengubah nilai private field.

**Single Inheritance** - Class hanya mewarisi dari satu parent (default Java).

**State** - Data atau nilai yang disimpan dalam objek.

**Static** - Keyword untuk member yang milik class, bukan instance.

**Subclass** - Class yang mewarisi dari parent class (lihat Child Class).

**Super** - Keyword untuk mengakses member dari superclass.

**Superclass** - Class yang diwarisi oleh subclass (lihat Parent Class).

### T

**This** - Keyword untuk mengacu ke objek saat ini.

**Tight Coupling** - Desain dimana class sangat bergantung pada class lain.

**Type** - Kategori data (int, String, custom class).

**Type Casting** - Mengubah tipe data dari satu ke lain.

### V

**Variable** - Lokasi penyimpanan data dengan nama dan tipe tertentu.

**Visibility** - Seberapa jauh member bisa diakses (lihat Access Modifier).

### W

**Wrapper Class** - Class yang membungkus tipe data primitif (Integer untuk int, dll).

---

## 🔤 Singkatan Umum

| Singkatan | Kepanjangan | Penjelasan |
|-----------|-------------|------------|
| OOP | Object-Oriented Programming | Pemrograman berorientasi objek |
| SOLID | Single Responsibility, Open/Closed, Liskov Substitution, Interface Segregation, Dependency Inversion | Prinsip desain OOP |
| DRY | Don't Repeat Yourself | Jangan ulangi kode |
| KISS | Keep It Simple, Stupid | Pertahankan kesederhanaan |
| YAGNI | You Aren't Gonna Need It | Kamu tidak akan butuh itu |
| API | Application Programming Interface | Antarmuka pemrograman aplikasi |
| UML | Unified Modeling Language | Bahasa pemodelan standar |
| IDE | Integrated Development Environment | Lingkungan pengembangan terintegrasi |
| JVM | Java Virtual Machine | Mesin virtual Java |
| JDK | Java Development Kit | Kit pengembangan Java |
| JRE | Java Runtime Environment | Lingkungan runtime Java |

---

## 🏗️ Design Patterns (Singkat)

### Creational Patterns
- **Singleton** - Hanya satu instance class
- **Factory** - Membuat objek tanpa menentukan class exact
- **Builder** - Membangun objek kompleks step-by-step

### Structural Patterns
- **Adapter** - Mengubah interface class ke interface lain
- **Decorator** - Menambah fungsi ke objek secara dinamis
- **Facade** - Menyederhanakan interface kompleks

### Behavioral Patterns
- **Observer** - Memberitahu objek lain saat ada perubahan
- **Strategy** - Memilih algoritma saat runtime
- **Template Method** - Mendefinisikan skeleton algorithm

---

## 📊 UML Notation Dasar

### Class Diagram
```
+-------------------+
|    ClassName      |
+-------------------+
| - field1: type    |
| - field2: type    |
+-------------------+
| + method1()       |
| + method2()       |
+-------------------+
```

### Inheritance
```
      Parent
          ▲
          |
      Child
```

### Interface Implementation
```
      Interface
          ▲
          |
      Class
```

### Association
```
Class A ◆──────◆ Class B
```

### Composition
```
Class A ◆──────● Class B
```

---

## 💡 Tips Mengingat Istilah

### 1. Core OOP Concepts
- **A PIE**: Abstraction, Polymorphism, Inheritance, Encapsulation

### 2. Access Levels (Java)
- **Public**: Siapa saja
- **Protected**: Class + Package + Subclass
- **Default**: Class + Package saja
- **Private**: Class ini saja

### 3. Inheritance Terms
- **Super/Parent**: Yang mewarisi
- **Sub/Child**: Yang diwarisi
- **Extends**: Keyword inheritance
- **Override**: Implementasi ulang method

### 4. Method Types
- **Overload**: Nama sama, parameter beda
- **Override**: Nama sama, parameter sama, implementasi beda

---

## 📖 Referensi Tambahan

- [Oracle OOP Concepts](https://docs.oracle.com/javase/tutorial/java/concepts/)
- [W3Schools Java OOP](https://www.w3schools.com/java/java_oop.asp)
- [Baeldung Java OOP](https://www.baeldung.com/java-oop)
- [Refactoring.guru Design Patterns](https://refactoring.guru/design-patterns)

---

## 🔗 Hubungan Antar Istilah

### Hierarki Konsep
```
Paradigma
├── OOP
│   ├── Class
│   │   ├── Field
│   │   ├── Method
│   │   └── Constructor
│   ├── Object
│   ├── Inheritance
│   │   ├── Superclass
│   │   ├── Subclass
│   │   └── Method Overriding
│   ├── Polymorphism
│   ├── Encapsulation
│   └── Abstraction
└── Procedural
```

### Relationship Types
```
Association
├── Aggregation (has-a, weak)
├── Composition (has-a, strong)
└── Inheritance (is-a)
```

### Access Control
```
Public > Protected > Default > Private
```

---

## ⚠️ Common Confusions

### Class vs Object
- **Class**: Blueprint/template
- **Object**: Instance dari class

### Abstract Class vs Interface
- **Abstract**: Bisa punya concrete method, single inheritance
- **Interface**: Hanya abstract method, multiple inheritance

### Overloading vs Overriding
- **Overloading**: Same class, same name, different parameters
- **Overriding**: Subclass, same name, same parameters

### Composition vs Aggregation
- **Composition**: Strong relationship, child can't exist without parent
- **Aggregation**: Weak relationship, child can exist independently