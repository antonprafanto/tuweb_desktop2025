# Frequently Asked Questions (FAQ) - Inheritance & OOP

## ❓ Pertanyaan Umum Mahasiswa

### 🟢 Pertanyaan Dasar

#### Q1: Apa bedanya Class dan Object?
**A:** 
- **Class**: Blueprint/template untuk membuat objek. Mendefinisikan atribut dan method.
- **Object**: Instance dari class. Memiliki state (nilai atribut) dan behavior (method).

**Contoh:**
```java
// Class (Blueprint)
class Mobil {
    String merk;
    int tahun;
    
    void info() {
        System.out.println("Mobil " + merk + " tahun " + tahun);
    }
}

// Object (Instance)
Mobil mobil1 = new Mobil(); // Object pertama
Mobil mobil2 = new Mobil(); // Object kedua

mobil1.merk = "Toyota"; // State berbeda
mobil2.merk = "Honda";  // State berbeda
```

#### Q2: Kapan harus menggunakan inheritance?
**A:** Gunakan inheritance ketika:
- Ada "is-a" relationship (Child is-a Parent)
- Ingin code reuse (menggunakan kembali kode)
- Ingin membuat logical hierarchy
- Ingin menerapkan polymorphism

**Contoh yang BENAR:**
```java
// Mobil is-a Kendaraan ✓
class Mobil extends Kendaraan { ... }

// Kucing is-a Hewan ✓
class Kucing extends Hewan { ... }
```

**Contoh yang SALAH:**
```java
// Mobil is-a Mesin? ✗ (seharusnya has-a)
class Mobil extends Mesin { ... }

// Programmer is-a Komputer? ✗ (seharusnya uses-a)
class Programmer extends Komputer { ... }
```

#### Q3: Apa itu abstract class dan kapan menggunakannya?
**A:** Abstract class adalah class yang:
- Tidak bisa diinstansiasi langsung
- Bisa memiliki abstract method (tanpa implementasi)
- Bisa memiliki concrete method (dengan implementasi)

**Gunakan abstract class ketika:**
- Ingin mendefinisikan kontrak untuk subclass
- Ada common behavior yang ingin dibagikan
- Ingin mencegah instantiasi langsung

**Contoh:**
```java
// Abstract class
abstract class Hewan {
    protected String nama;
    
    // Concrete method (bisa digunakan subclass)
    public void makan() {
        System.out.println(nama + " sedang makan");
    }
    
    // Abstract method (wajib diimplementasikan subclass)
    public abstract void bersuara();
}

// Concrete subclass
class Kucing extends Hewan {
    public Kucing(String nama) {
        this.nama = nama;
    }
    
    @Override // Wajib implementasi
    public void bersuara() {
        System.out.println("Meow!");
    }
}

// Tidak bisa instantiate abstract class
// Hewan hewan = new Hewan("Generic"); // ERROR!

// Bisa instantiate concrete class
Hewan kucing = new Kucing("Tom"); // OK!
```

### 🟡 Pertanyaan Intermediate

#### Q4: Apa bedanya method overloading dan overriding?
**A:**

**Method Overloading:**
- Same class
- Nama method sama
- Parameter berbeda (jumlah atau tipe)
- Return type bisa sama atau berbeda

```java
class Calculator {
    // Overloading - nama sama, parameter beda
    public int tambah(int a, int b) {
        return a + b;
    }
    
    public double tambah(double a, double b) {
        return a + b;
    }
    
    public int tambah(int a, int b, int c) {
        return a + b + c;
    }
}
```

**Method Overriding:**
- Subclass dan superclass
- Nama method sama
- Parameter sama
- Return type sama atau covariant
- Menggunakan @Override annotation

```java
class Kendaraan {
    public void info() {
        System.out.println("Ini adalah kendaraan");
    }
}

class Mobil extends Kendaraan {
    @Override // Overriding - implementasi ulang
    public void info() {
        System.out.println("Ini adalah mobil");
    }
}
```

#### Q5: Bagaimana cara menggunakan super keyword?
**A:** `super` digunakan untuk:

**1. Memanggil constructor parent:**
```java
class Kendaraan {
    protected String merk;
    
    public Kendaraan(String merk) {
        this.merk = merk;
    }
}

class Mobil extends Kendaraan {
    private String model;
    
    public Mobil(String merk, String model) {
        super(merk); // Panggil constructor parent
        this.model = model;
    }
}
```

**2. Memanggil method parent:**
```java
class Kendaraan {
    public void start() {
        System.out.println("Kendaraan dinyalakan");
    }
}

class Mobil extends Kendaraan {
    @Override
    public void start() {
        System.out.println("Mobil dinyalakan dengan kunci");
        super.start(); // Panggil method parent
    }
}
```

**3. Mengakses field parent:**
```java
class Kendaraan {
    protected String merk;
}

class Mobil extends Kendaraan {
    private String merkLengkap;
    
    public void setMerkLengkap(String merkLengkap) {
        this.merkLengkap = merkLengkap;
        super.merk = merkLengkap.split(" ")[0]; // Access parent field
    }
}
```

#### Q6: Apa itu polymorphism dan bagaimana cara kerjanya?
**A:** Polymorphism adalah kemampuan objek memiliki banyak bentuk.

**Cara kerja:**
1. Reference variable bisa menunjuk ke objek dari subclass
2. Method call resolved at runtime (dynamic binding)
3. Overridden method dari subclass yang dipanggil

**Contoh:**
```java
class Kendaraan {
    public void info() {
        System.out.println("Ini kendaraan");
    }
}

class Mobil extends Kendaraan {
    @Override
    public void info() {
        System.out.println("Ini mobil");
    }
}

class Motor extends Kendaraan {
    @Override
    public void info() {
        System.out.println("Ini motor");
    }
}

// Polymorphism
Kendaraan k1 = new Mobil();   // OK - Mobil is-a Kendaraan
Kendaraan k2 = new Motor();   // OK - Motor is-a Kendaraan

k1.info(); // Output: "Ini mobil" (method Mobil yang dipanggil)
k2.info(); // Output: "Ini motor" (method Motor yang dipanggil)

// Polymorphic collection
ArrayList<Kendaraan> daftar = new ArrayList<>();
daftar.add(new Mobil());
daftar.add(new Motor());

for (Kendaraan k : daftar) {
    k.info(); // Dynamic method dispatch
}
```

### 🔴 Pertanyaan Advanced

#### Q7: Bagaimana cara melakukan type casting yang aman?
**A:** Gunakan `instanceof` check sebelum casting:

**Cara Aman:**
```java
ArrayList<Kendaraan> daftar = new ArrayList<>();
daftar.add(new Mobil("Toyota", 2020));
daftar.add(new Motor("Honda", 2021));

for (Kendaraan k : daftar) {
    // Safe casting dengan instanceof
    if (k instanceof Mobil) {
        Mobil mobil = (Mobil) k; // Safe casting
        mobil.bukaPintu(); // Method khusus Mobil
    } else if (k instanceof Motor) {
        Motor motor = (Motor) k; // Safe casting
        motor.standar(); // Method khusus Motor
    }
}
```

**Cara Berbahaya (Hindari):**
```java
// Berbahaya - bisa menyebabkan ClassCastException
Kendaraan k = new Motor("Honda", 2021);
Mobil mobil = (Mobil) k; // ERROR - ClassCastException!
```

#### Q8: Apa bedanya composition dan inheritance?
**A:**

**Inheritance (is-a relationship):**
- Child mewarisi behavior dari parent
- Strong coupling
- Compile-time relationship
- Gunakan untuk logical hierarchy

```java
class Mobil extends Kendaraan {
    // Mobil is-a Kendaraan
}
```

**Composition (has-a relationship):**
- Class memiliki objek dari class lain
- Loose coupling
- Runtime relationship
- Gunakan untuk complex objects

```java
class Mobil {
    private Mesin mesin; // Mobil has-a Mesin
    private Roda[] roda; // Mobil has-a Roda
    
    public Mobil() {
        this.mesin = new Mesin();
        this.roda = new Roda[4];
    }
}
```

**When to use what:**
- Gunakan **inheritance** untuk "is-a" relationship
- Gunakan **composition** untuk "has-a" relationship
- Prefer composition over inheritance (prinsip design)

#### Q9: Bagaimana handle multiple inheritance di Java?
**A:** Java tidak mendukung multiple inheritance langsung, tapi ada solusi:

**1. Gunakan Interface:**
```java
interface BisaTerbang {
    void terbang();
}

interface BisaMenyelam {
    void menyelam();
}

class Kapal implements BisaMenyelam {
    @Override
    public void menyelam() {
        System.out.println("Kapal menyelam");
    }
}

class Pesawat implements BisaTerbang {
    @Override
    public void terbang() {
        System.out.println("Pesawat terbang");
    }
}

// Class bisa implements multiple interface
class KapalTerbang implements BisaTerbang, BisaMenyelam {
    @Override
    public void terbang() {
        System.out.println("Kapal terbang terbang");
    }
    
    @Override
    public void menyelam() {
        System.out.println("Kapal terbang menyelam");
    }
}
```

**2. Gunakan Composition:**
```java
class Mesin {
    public void hidupkan() {
        System.out.println("Mesin hidup");
    }
}

class AC {
    public void dinginkan() {
        System.out.println("AC mendinginkan");
    }
}

class Mobil {
    private Mesin mesin = new Mesin(); // Composition
    private AC ac = new AC();           // Composition
    
    public void start() {
        mesin.hidupkan();
        ac.dinginkan();
    }
}
```

#### Q10: Bagaimana cara membuat immutable class?
**A:** Immutable class adalah class yang objeknya tidak bisa diubah setelah dibuat:

**Prinsip Immutable Class:**
1. Make class final
2. Make all fields private and final
3. No setter methods
4. Initialize all fields in constructor
5. Return defensive copies for mutable fields

**Contoh:**
```java
public final class Mahasiswa {
    private final String nama;
    private final String nim;
    private final List<String> mataKuliah; // Mutable field
    
    public Mahasiswa(String nama, String nim, List<String> mataKuliah) {
        this.nama = nama;
        this.nim = nim;
        // Defensive copy untuk mutable field
        this.mataKuliah = new ArrayList<>(mataKuliah);
    }
    
    // Hanya getters, tidak ada setters
    public String getNama() {
        return nama;
    }
    
    public String getNim() {
        return nim;
    }
    
    // Defensive copy untuk mutable field
    public List<String> getMataKuliah() {
        return new ArrayList<>(mataKuliah);
    }
    
    // Tidak ada methods yang mengubah state
}
```

---

## 🛠️ Troubleshooting Common Issues

### Issue 1: "Cannot Find Symbol"
**Problem:** Class atau method tidak ditemukan
**Solution:**
- Check package declaration
- Check import statement
- Check spelling (case sensitive)
- Check classpath

```java
// SALAH - package tidak sesuai
package kendaraan;

// BENAR - package sesuai folder
package sistemmanajemenkendaraan;
```

### Issue 2: "Abstract Method Cannot Be Instantiated"
**Problem:** Mencoba membuat object dari abstract class
**Solution:**
```java
// SALAH - tidak bisa instantiate abstract class
Kendaraan k = new Kendaraan("Toyota", 2020);

// BENAR - instantiate concrete class
Kendaraan mobil = new Mobil("Toyota", 2020, "Avanza", 4);
```

### Issue 3: "Method Does Not Override or Implement"
**Problem:** Override method signature tidak cocok
**Solution:**
- Gunakan @Override annotation
- Check method signature (nama, parameter, return type)
- Gunakan IDE auto-complete

```java
// SALAH - signature tidak cocok
@Override
public void info(String tambahan) { ... }

// BENAR - signature sama
@Override
public void info() { ... }
```

### Issue 4: ClassCastException
**Problem:** Type casting tidak valid
**Solution:**
- Gunakan instanceof check sebelum casting
- Pastikan casting valid

```java
// SALAH - langsung cast tanpa check
Mobil mobil = (Mobil) kendaraan;

// BENAR - check dulu
if (kendaraan instanceof Mobil) {
    Mobil mobil = (Mobil) kendaraan;
}
```

---

## 📞 Bantuan Tambahan

### Resources:
- [Oracle Java OOP Tutorial](https://docs.oracle.com/javase/tutorial/java/concepts/)
- [W3Schools Java Inheritance](https://www.w3schools.com/java/java_inheritance.asp)
- [Baeldung Java Inheritance](https://www.baeldung.com/java-inheritance)

### Jika masih bingung:
1. Review materi konsep OOP
2. Lihat contoh kode aplikasi kendaraan
3. Gunakan NetBeans debugger
4. Tanya dosen pengampu
5. Search di Stack Overflow

### Tips Debugging OOP:
1. Use breakpoints di constructor
2. Monitor object creation
3. Check inheritance chain
4. Verify method overriding
5. Test polymorphism behavior

**Ingat:** Practice makes perfect! Semakin sering coding OOP, semakin paham. 💪