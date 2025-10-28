# TUWEB 2 - Konsep Inheritance (Pewarisan)

## 📚 Materi Pembelajaran

### 1. Pengertian Object-Oriented Programming (OOP)
OOP adalah paradigma pemrograman yang berorientasi pada objek. Dalam OOP, kita memodelkan dunia nyata ke dalam objek-objek yang memiliki atribut dan perilaku.

**Konsep Dasar OOP:**
- **Class** - Blueprint/template untuk membuat objek
- **Object** - Instance dari class
- **Encapsulation** - Membungkus data dan method
- **Inheritance** - Pewarisan sifat dari parent ke child
- **Polymorphism** - Kemampuan objek memiliki banyak bentuk
- **Abstraction** - Menyembunyikan detail kompleksitas

### 2. Class dan Object

#### 2.1 Class
Class adalah template atau blueprint untuk membuat objek. Class mendefinisikan atribut (properties) dan perilaku (methods).

**Sintaks Class:**
```java
public class NamaClass {
    // Atribut/Properties
    private tipeData atribut1;
    private tipeData atribut2;
    
    // Constructor
    public NamaClass(tipeData param1, tipeData param2) {
        this.atribut1 = param1;
        this.atribut2 = param2;
    }
    
    // Methods
    public tipeReturn namaMethod() {
        // kode method
    }
}
```

**Contoh Class:**
```java
public class Mobil {
    // Atribut
    private String merk;
    private String warna;
    private int tahun;
    
    // Constructor
    public Mobil(String merk, String warna, int tahun) {
        this.merk = merk;
        this.warna = warna;
        this.tahun = tahun;
    }
    
    // Method
    public void info() {
        System.out.println("Mobil " + merk + " warna " + warna + " tahun " + tahun);
    }
    
    // Getter dan Setter
    public String getMerk() { return merk; }
    public void setMerk(String merk) { this.merk = merk; }
}
```

#### 2.2 Object
Object adalah instance dari class. Object memiliki state (nilai atribut) dan behavior (method).

**Membuat Object:**
```java
// Membuat object dari class Mobil
Mobil mobil1 = new Mobil("Toyota", "Merah", 2020);
Mobil mobil2 = new Mobil("Honda", "Biru", 2021);

// Menggunakan object
mobil1.info(); // Output: Mobil Toyota warna Merah tahun 2020
mobil2.info(); // Output: Mobil Honda warna Biru tahun 2021

// Mengakses atribut via getter
String merkMobil1 = mobil1.getMerk(); // "Toyota"
```

### 3. Inheritance (Pewarisan)

#### 3.1 Pengertian Inheritance
Inheritance adalah mekanisme dimana sebuah class (child/subclass) dapat mewarisi atribut dan method dari class lain (parent/superclass).

**Manfaat Inheritance:**
- **Code Reusability** - Menggunakan kembali kode
- **Extensibility** - Menambah fitur tanpa mengubah class asli
- **Maintainability** - Mudah maintenance
- **Logical Hierarchy** - Struktur yang logis

#### 3.2 Sintaks Inheritance
```java
// Parent Class (Superclass)
public class ParentClass {
    // Atribut dan method parent
}

// Child Class (Subclass)
public class ChildClass extends ParentClass {
    // Atribut dan method tambahan child
    // Bisa mengakses parent yang public/protected
}
```

#### 3.3 Contoh Inheritance
```java
// Parent Class
public class Kendaraan {
    protected String merk;
    protected int tahun;
    
    public Kendaraan(String merk, int tahun) {
        this.merk = merk;
        this.tahun = tahun;
    }
    
    public void info() {
        System.out.println("Kendaraan merk: " + merk + ", tahun: " + tahun);
    }
    
    public void bergerak() {
        System.out.println("Kendaraan bergerak...");
    }
}

// Child Class 1
public class Mobil extends Kendaraan {
    private int jumlahPintu;
    
    public Mobil(String merk, int tahun, int jumlahPintu) {
        super(merk, tahun); // Memanggil constructor parent
        this.jumlahPintu = jumlahPintu;
    }
    
    public void bukaPintu() {
        System.out.println("Membuka " + jumlahPintu + " pintu mobil");
    }
    
    @Override // Override method parent
    public void info() {
        System.out.println("Mobil " + merk + " (" + tahun + ") - " + jumlahPintu + " pintu");
    }
}

// Child Class 2
public class Motor extends Kendaraan {
    private String jenisMotor;
    
    public Motor(String merk, int tahun, String jenisMotor) {
        super(merk, tahun);
        this.jenisMotor = jenisMotor;
    }
    
    public void stang() {
        System.out.println("Motor menggunakan stang");
    }
    
    @Override
    public void info() {
        System.out.println("Motor " + merk + " (" + tahun + ") - jenis: " + jenisMotor);
    }
}
```

### 4. Access Modifiers

| Modifier | Class | Package | Subclass | World |
|----------|-------|---------|----------|-------|
| `public` | ✅ | ✅ | ✅ | ✅ |
| `protected` | ✅ | ✅ | ✅ | ❌ |
| `default` | ✅ | ✅ | ❌ | ❌ |
| `private` | ✅ | ❌ | ❌ | ❌ |

**Contoh Penggunaan:**
```java
public class ContohAccess {
    public String publicVar = "Public - bisa diakses dimana saja";
    protected String protectedVar = "Protected - class + package + subclass";
    String defaultVar = "Default - class + package saja";
    private String privateVar = "Private - class ini saja";
    
    public void showAccess() {
        System.out.println(publicVar);     // ✅ Bisa
        System.out.println(protectedVar);  // ✅ Bisa
        System.out.println(defaultVar);    // ✅ Bisa
        System.out.println(privateVar);    // ✅ Bisa
    }
}
```

### 5. Method Overriding

Method overriding adalah kemampuan subclass untuk mengimplementasikan ulang method dari superclass.

**Syarat Overriding:**
- Nama method sama
- Parameter sama
- Return type sama atau covariant
- Access modifier tidak lebih restrictif

**Contoh Overriding:**
```java
public class Hewan {
    public void suara() {
        System.out.println("Hewan mengeluarkan suara");
    }
}

public class Kucing extends Hewan {
    @Override // Annotation untuk menandai override
    public void suara() {
        System.out.println("Kucing mengeong: Meow!");
    }
    
    // Method baru khusus kucing
    public void garuk() {
        System.out.println("Kucing sedang menggaruk");
    }
}
```

### 6. Super Keyword

Keyword `super` digunakan untuk:
- Mengakses constructor parent: `super()`
- Mengakses method parent: `super.namaMethod()`
- Mengakses atribut parent: `super.namaAtribut`

**Contoh Super:**
```java
public class Kendaraan {
    protected String merk;
    
    public Kendaraan(String merk) {
        this.merk = merk;
    }
    
    public void info() {
        System.out.println("Kendaraan: " + merk);
    }
}

public class Mobil extends Kendaraan {
    private String model;
    
    public Mobil(String merk, String model) {
        super(merk); // Panggil constructor parent
        this.model = model;
    }
    
    @Override
    public void info() {
        super.info(); // Panggil method parent
        System.out.println("Model: " + model);
    }
}
```

### 7. Hierarchical Inheritance

Java mendukung berbagai jenis inheritance:

#### 7.1 Single Inheritance
```
Parent → Child
```

#### 7.2 Multilevel Inheritance
```
Grandparent → Parent → Child
```

#### 7.3 Hierarchical Inheritance
```
    Parent
   /      \
Child1   Child2
```

#### 7.4 Multiple Inheritance (TIDAK DIDUKUNG di Java)
Java tidak mendukung multiple inheritance langsung, tapi bisa menggunakan interface.

**Contoh Multilevel:**
```java
public class Kendaraan {
    public void start() {
        System.out.println("Kendaraan dinyalakan");
    }
}

public class Mobil extends Kendaraan {
    public void bukaBagasi() {
        System.out.println("Bagasi dibuka");
    }
}

public class MobilSport extends Mobil {
    public void turbo() {
        System.out.println("Turbo diaktifkan!");
    }
    
    @Override
    public void start() {
        System.out.println("Mobil sport dinyalakan dengan suara keren!");
        super.start(); // Panggil method grandparent
    }
}
```

## 🎯 Tujuan Pembelajaran
Setelah mempelajari materi ini, mahasiswa diharapkan dapat:
1. Memahami konsep dasar OOP dan inheritance
2. Membuat class dan object dengan benar
3. Mengimplementasikan inheritance dalam Java
4. Menggunakan access modifiers dengan tepat
5. Melakukan method overriding
6. Menerapkan super keyword
7. Membuat hierarchical inheritance

## 💡 Tips Best Practices
1. Gunakan inheritance untuk "is-a" relationship
2. Prefer composition over inheritance
3. Gunakan @Override annotation
4. Ikuti prinsip Single Responsibility Principle
5. Design class yang cohesive dan loosely coupled
6. Gunakan access modifiers yang paling restrictif mungkin