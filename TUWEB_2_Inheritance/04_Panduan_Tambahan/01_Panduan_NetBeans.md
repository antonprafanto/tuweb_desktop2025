# Panduan Praktik NetBeans - OOP & Inheritance

## 📋 Persiapan Awal

### 1. Install NetBeans
1. Download NetBeans IDE dari [https://netbeans.apache.org/](https://netbeans.apache.org/)
2. Pilih versi dengan Java SE
3. Install sesuai instruksi
4. Pastikan Java JDK sudah terinstall (versi 8+)

### 2. Buka NetBeans
- Double-click icon NetBeans di desktop
- Tunggu hingga IDE terbuka sempurna

## 🚀 Membuat Project OOP

### Step 1: Create New Project
1. Klik **File** → **New Project**
2. Pilih **Java** → **Java Application**
3. Klik **Next**

### Step 2: Project Configuration
1. **Project Name:** `SistemManajemenKendaraan`
2. **Project Location:** Pilih folder penyimpanan
3. **Create Main Class:** Centang dan isi `sistemmanajemenkendaraan.SistemManajemenKendaraan`
4. Klik **Finish**

### Step 3: Project Structure
```
SistemManajemenKendaraan
├── Source Packages
│   └── sistemmanajemenkendaraan
│       └── SistemManajemenKendaraan.java
└── Libraries
```

## 📝 Membuat Multiple Classes

### Step 1: Buat Parent Class (Kendaraan)
1. Right-click pada package `sistemmanajemenkendaraan`
2. Pilih **New** → **Java Class**
3. **Class Name:** `Kendaraan`
4. Klik **Finish**

### Step 2: Buat Child Classes
Ulangi proses di atas untuk membuat:
- `Mobil.java`
- `Motor.java`

### Step 3: Project Structure Akhir
```
SistemManajemenKendaraan
├── Source Packages
│   └── sistemmanajemenkendaraan
│       ├── SistemManajemenKendaraan.java (Main)
│       ├── Kendaraan.java (Parent)
│       ├── Mobil.java (Child 1)
│       └── Motor.java (Child 2)
└── Libraries
```

## 🔍 NetBeans Features untuk OOP

### 1. Class Navigator
- **Location:** Panel kiri bawah (Navigator)
- **Fungsi:** Menampilkan struktur class (fields, methods, constructors)
- **Cara pakai:** Klik pada class untuk melihat struktur

### 2. Code Generation
NetBeans bisa generate otomatis:
- **Constructor:** Alt + Insert → Constructor
- **Getters/Setters:** Alt + Insert → Getter and Setter
- **Override Methods:** Alt + Insert → Override Methods

### 3. IntelliSense & Auto Completion
- **Trigger:** Ctrl + Space
- **Fungsi:** Suggest method, variable, class
- **Contoh:** Ketik `super.` lalu Ctrl + Space

### 4. Error Detection
- **Syntax Error:** Garis merah di kode
- **Compile Error:** Mark di panel Problems
- **Warning:** Garis kuning untuk best practices

## 📝 Menulis Kode OOP

### Step 1: Parent Class (Kendaraan.java)
```java
package sistemmanajemenkendaraan;

public abstract class Kendaraan {
    protected String merk;
    protected int tahun;
    protected boolean status;
    
    public Kendaraan(String merk, int tahun) {
        this.merk = merk;
        this.tahun = tahun;
        this.status = true;
    }
    
    public abstract void info();
    
    public void start() {
        System.out.println(merk + " dinyalakan...");
    }
    
    // Generate getters/setters dengan Alt + Insert
    public String getMerk() { return merk; }
    public void setMerk(String merk) { this.merk = merk; }
    
    public int getTahun() { return tahun; }
    public void setTahun(int tahun) { this.tahun = tahun; }
    
    public boolean isStatus() { return status; }
    public void setStatus(boolean status) { this.status = status; }
}
```

### Step 2: Child Class (Mobil.java)
```java
package sistemmanajemenkendaraan;

public class Mobil extends Kendaraan {
    private String model;
    private int jumlahPintu;
    
    // Generate constructor: Alt + Insert → Constructor
    public Mobil(String merk, int tahun, String model, int jumlahPintu) {
        super(merk, tahun); // Panggil constructor parent
        this.model = model;
        this.jumlahPintu = jumlahPintu;
    }
    
    // Override method: Alt + Insert → Override Methods
    @Override
    public void info() {
        System.out.println("Mobil - Merk: " + merk + ", Model: " + model + 
                         ", Tahun: " + tahun + ", Pintu: " + jumlahPintu);
    }
    
    public void bukaPintu() {
        System.out.println("Membuka " + jumlahPintu + " pintu mobil " + merk);
    }
    
    // Generate getters/setters
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
    
    public int getJumlahPintu() { return jumlahPintu; }
    public void setJumlahPintu(int jumlahPintu) { this.jumlahPintu = jumlahPintu; }
}
```

### Step 3: Child Class (Motor.java)
```java
package sistemmanajemenkendaraan;

public class Motor extends Kendaraan {
    private String tipe;
    private String jenisMotor;
    
    public Motor(String merk, int tahun, String tipe, String jenisMotor) {
        super(merk, tahun);
        this.tipe = tipe;
        this.jenisMotor = jenisMotor;
    }
    
    @Override
    public void info() {
        System.out.println("Motor - Merk: " + merk + ", Tipe: " + tipe + 
                         ", Tahun: " + tahun + ", Jenis: " + jenisMotor);
    }
    
    public void standar() {
        System.out.println("Motor " + merk + " diletakkan di standar");
    }
    
    @Override
    public void start() {
        System.out.println("Motor " + merk + " dinyalakan dengan starter elektrik...");
        super.start();
    }
    
    // Generate getters/setters
    public String getTipe() { return tipe; }
    public void setTipe(String tipe) { this.tipe = tipe; }
    
    public String getJenisMotor() { return jenisMotor; }
    public void setJenisMotor(String jenisMotor) { this.jenisMotor = jenisMotor; }
}
```

### Step 4: Main Class (SistemManajemenKendaraan.java)
Copy paste kode dari file `02_SistemManajemenKendaraan.java`

## 🛠️ NetBeans OOP Tools

### 1. UML Class Diagram
NetBeans tidak punya built-in UML, tapi bisa:
- Install plugin **Visual Library**
- Gunakan **NetBeans UML Plugin**
- Export ke external tools seperti **PlantUML**

### 2. Hierarchy View
- **Cara:** Right-click class → **Navigate** → **Type Hierarchy**
- **Fungsi:** Lihat inheritance tree
- **Shortcut:** Ctrl + T

### 3. Find Usages
- **Cara:** Right-click method/field → **Find Usages**
- **Fungsi:** Cari dimana method/field digunakan
- **Shortcut:** Alt + F7

### 4. Refactoring Tools
- **Rename:** Right-click class → **Refactor** → **Rename**
- **Extract Method:** Select code → **Refactor** → **Extract Method**
- **Extract Superclass:** Right-click class → **Refactor** → **Extract Superclass**

## ▶️ Menjalankan Program

### Method 1: Run Main Class
1. Right-click `SistemManajemenKendaraan.java`
2. Pilih **Run File**
3. Atau tekan **Shift + F6**

### Method 2: Run Project
1. Klik **Run** → **Run Project**
2. Atau tekan **F6**
3. NetBeans akan otomatis cari main method

### Method 3: Debug Mode
1. Set breakpoint dengan klik di margin
2. Right-click → **Debug File**
3. Atau tekan **Ctrl + Shift + F5**

## 🐛 Debugging OOP

### 1. Step Into vs Step Over
- **Step Over (F8):** Eksekusi baris saat ini tanpa masuk method
- **Step Into (F7):** Masuk ke dalam method yang dipanggil
- **Step Out (Ctrl + F7):** Keluar dari method saat ini

### 2. Watch Variables
- **Cara:** Window → **Debugging** → **Variables**
- **Fungsi:** Monitor nilai variable saat runtime
- **Tips:** Add custom watch expression

### 3. Call Stack
- **Location:** Window → **Debugging** → **Call Stack**
- **Fungsi:** Lihat hierarchy method call
- **Gunakan:** Navigasi antar method dalam stack

## 🔧 Common OOP Issues & Solutions

### Issue 1: "Cannot Find Symbol"
**Problem:** Class atau method tidak ditemukan
**Solution:**
- Check package declaration
- Check import statement
- Check spelling (case sensitive)

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
- Gunakan `@Override` annotation
- Check method signature (nama, parameter, return type)
- Gunakan Alt + Insert → Override Methods

```java
// SALAH - signature tidak cocok
@Override
public void info(String tambahan) { ... }

// BENAR - signature sama
@Override
public void info() { ... }
```

### Issue 4: "Incompatible Types"
**Problem:** Type casting error
**Solution:**
- Gunakan `instanceof` check sebelum casting
- Pastikan casting valid

```java
// SALAH - langsung cast tanpa check
Mobil mobil = (Mobil) kendaraan;

// BENAR - check dulu
if (kendaraan instanceof Mobil) {
    Mobil mobil = (Mobil) kendaraan;
}
```

## 💡 Tips NetBeans untuk OOP

### 1. Code Templates
- `class` + Tab → Template class
- `pubc` + Tab → Public class
- `ctor` + Tab → Constructor template
- `get` + Tab → Getter template
- `set` + Tab → Setter template

### 2. Keyboard Shortcuts
- **Alt + Insert:** Generate code
- **Ctrl + Shift + Up/Down:** Move method up/down
- **Ctrl + O:** Override methods
- **Ctrl + I:** Implement methods
- **F11:** Add bookmark
- **Ctrl + G:** Go to line

### 3. Navigation
- **Ctrl + Click:** Go to definition
- **Ctrl + B:** Go to declaration
- **Alt + Left/Right:** Back/Forward navigation
- **Ctrl + Shift + 1:** Navigate to class

### 4. Code Formatting
- **Alt + Shift + F:** Format entire file
- **Ctrl + Shift + F:** Format all files
- **Tools → Options → Editor:** Configure formatting rules

## 📱 Testing OOP Code

### 1. Unit Testing dengan JUnit
1. Right-click class → **Tools** → **Create/Update Tests**
2. Pilih **JUnit**
3. NetBeans akan generate test class

### 2. Manual Testing
```java
// Test di main method
public static void main(String[] args) {
    // Test inheritance
    Kendaraan mobil = new Mobil("Toyota", 2020, "Avanza", 4);
    Kendaraan motor = new Motor("Honda", 2021, "CBR", "Sport");
    
    // Test polymorphism
    ArrayList<Kendaraan> daftar = new ArrayList<>();
    daftar.add(mobil);
    daftar.add(motor);
    
    // Test method overriding
    for (Kendaraan k : daftar) {
        k.info(); // Dynamic binding
    }
}
```

### 3. Debug Testing
- Set breakpoint di constructor
- Monitor object creation
- Check inheritance chain
- Verify method overriding

## 🚀 Advanced Features

### 1. Code Completion for Inheritance
- NetBeans akan suggest inherited methods
- Auto-complete untuk `super.` calls
- Smart completion untuk `@Override`

### 2. Refactoring Support
- **Extract Interface:** Extract common interface
- **Pull Up:** Move method to superclass
- **Push Down:** Move method to subclass
- **Use Supertype Where Possible:** Refactor to use parent type

### 3. Code Analysis
- **Inspect:** Code quality analysis
- **Hints:** Improvement suggestions
- **Warnings:** Potential issues

## 📞 Help & Resources

### NetBeans Documentation
- [NetBeans Java OOP Tutorial](https://netbeans.apache.org/kb/docs/java/oop.html)
- [NetBeans IDE Java Quick Start](https://netbeans.apache.org/kb/docs/java/quickstart.html)

### Java OOP Resources
- [Oracle Java OOP Tutorial](https://docs.oracle.com/javase/tutorial/java/concepts/)
- [W3Schools Java OOP](https://www.w3schools.com/java/java_oop.asp)

### Keyboard Shortcuts Reference
- **Help** → **Keyboard Shortcuts Card**
- Atau download dari NetBeans website

## ✅ Best Practices Summary

1. **Package Structure:** Organize classes in logical packages
2. **Naming Convention:** Follow Java naming standards
3. **Access Modifiers:** Use most restrictive access possible
4. **Code Generation:** Use Alt + Insert for boilerplate code
5. **Testing:** Test inheritance and polymorphism thoroughly
6. **Debugging:** Use debugger for complex inheritance scenarios
7. **Refactoring:** Use built-in refactoring tools for code improvement

Selamat praktikum OOP dengan NetBeans! 💻✨