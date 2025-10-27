# TUWEB 1 - Aktivitas Belajar 1
# Hello World & Pengenalan Class

**Mata Kuliah**: STSI4201 - Pemrograman Berbasis Desktop  
**Tutor**: Anton Prafanto, S.Kom., M.T.  
**Metode**: Learning by Doing  
**Durasi**: 55-60 menit  
**Target**: Mahasiswa Pemula (belum pernah coding)

---

## 1. PEMBUKAAN (5 menit)

Assalamu'alaikum warahmatullahi wabarakatuh. Salam sejahtera untuk kita semua.

Halo teman-teman! Selamat datang di Tutorial Online (TUWEB) pertama mata kuliah Pemrograman Berbasis Desktop. Perkenalkan, saya **Anton Prafanto**, dan saya akan menjadi pendamping teman-teman dalam perjalanan belajar programming yang menyenangkan ini!

### Apa yang Akan Kita Pelajari Hari Ini?

Hari ini adalah hari yang istimewa, karena **teman-teman akan membuat program komputer pertama!** Kita akan:
- Membuat program "Hello World" yang legendaris
- Berkenalan dengan konsep **Class** dan **Object**
- Langsung praktik di NetBeans!

### Jangan Khawatir!

Saya tahu sebagian teman-teman mungkin berpikir, "Wah, saya belum pernah coding sama sekali, bisa nggak ya?" 

**Jawabannya: PASTI BISA!** 🎉

Setiap programmer hebat pernah jadi pemula. Steve Jobs, Bill Gates, Mark Zuckerberg... mereka semua pernah menulis program "Hello World" pertama mereka. Dan hari ini, **giliran teman-teman!**

### Yang Perlu Disiapkan

Pastikan teman-teman sudah:
- ✅ Install JDK (Java Development Kit)
- ✅ Install Apache NetBeans
- ✅ Komputer siap digunakan
- ✅ Semangat belajar! 💪

> **Catatan**: Jika ada yang belum install, jangan khawatir. Kita akan bahas langkah-langkahnya di bagian persiapan.

---

## 2. TUJUAN PEMBELAJARAN

Setelah mengikuti TUWEB ini, teman-teman akan **BISA**:

1. **Membuat dan menjalankan program Java pertama** di NetBeans
   - Dari yang tadinya tidak tahu apa-apa, sekarang bisa bikin program sendiri!

2. **Memahami apa itu Class dan Object** dengan analogi sederhana
   - Class = Cetakan kue
   - Object = Kue yang sudah jadi

3. **Membuat Class sederhana** dengan 2 attribute
   - Misalnya: Class Mahasiswa dengan nama dan NIM

Itu saja! Tidak perlu yang rumit-rumit dulu. Baby steps! 👶

---

## 3. PERSIAPAN NETBEANS (5 menit)

### A. Cara Membuka NetBeans

**Langkah 1**: Cari icon NetBeans di komputer teman-teman
- **Windows**: Cari di Start Menu → ketik "NetBeans"
- **Mac**: Buka Applications → cari NetBeans
- **Linux**: Cari di aplikasi launcher

**Langkah 2**: Klik icon NetBeans untuk membuka

**Langkah 3**: Tunggu beberapa saat sampai NetBeans terbuka penuh

> 📸 **[Screenshot: Tampilan awal NetBeans saat pertama kali dibuka]**

### B. Mengenal Interface NetBeans (Yang Penting Saja!)

Saat NetBeans terbuka, teman-teman akan melihat beberapa bagian:

1. **Menu Bar** (Paling atas)
   - File, Edit, View, dll. → untuk mengatur project

2. **Toolbar** (Baris icon di bawah menu)
   - Icon-icon untuk shortcut (yang penting: tombol Run ▶️)

3. **Projects** (Panel kiri)
   - Tempat melihat file-file project kita

4. **Editor** (Tengah - yang paling besar)
   - Tempat kita menulis kode program

5. **Output** (Bawah)
   - Tempat melihat hasil program kita

> 📸 **[Screenshot: Tampilan NetBeans dengan label untuk setiap bagian]**

**Tips**: Jangan bingung dengan banyaknya menu. Untuk pemula, kita cuma fokus ke:
- File → New Project (untuk bikin project baru)
- Tombol Run ▶️ (untuk menjalankan program)
- Editor (untuk nulis kode)
- Output (untuk lihat hasil)

### C. Tips Penting!

**💡 Simpan Project di Folder yang Mudah Diingat**

Saat membuat project nanti, simpan di folder seperti:
- `C:\Java\Project` (Windows)
- `~/Java/Project` (Mac/Linux)
- Atau di `Documents\Java`

Jangan sampai lupa di mana project kita disimpan ya! 😊

---

## 4. KONSEP SINGKAT: Apa itu Program? (5 menit)

### Program itu Seperti Resep Masakan

Bayangkan teman-teman mau masak nasi goreng. Apa yang teman-teman butuhkan?
- **Bahan-bahan** (telur, nasi, bumbu)
- **Langkah-langkah** (panaskan minyak, tumis bumbu, masukkan nasi)
- **Hasil** (nasi goreng yang enak!)

**Program komputer itu sama!**
- **Data/Variabel** = Bahan-bahan
- **Kode Program** = Langkah-langkah (resep)
- **Output** = Hasil yang ditampilkan di layar

### Java itu Bahasa (Pemrograman)

Komputer tidak bisa berbahasa Indonesia atau Inggris biasa. Dia butuh **bahasa khusus** yang dia mengerti. Salah satunya adalah **Java**.

Jadi kalau kita mau ngomong ke komputer, kita harus pakai bahasa Java. Misalnya:
- Bahasa manusia: "Halo, tampilkan tulisan Hello World di layar"
- Bahasa Java: `System.out.println("Hello World");`

Tenang, nanti lama-lama teman-teman akan terbiasa dengan bahasa Java! 😊

### Kenapa Kita Belajar Java?

1. **Populer** - Banyak perusahaan pakai Java
2. **Bisa buat aplikasi desktop** - Seperti yang kita mau pelajari
3. **"Write once, run anywhere"** - Program Java bisa jalan di Windows, Mac, Linux
4. **Banyak lowongan kerja!** 💼

---

## 5. PRAKTIK GUIDED - "AYO IKUTI SAYA!" (25 menit)

Sekarang saatnya yang paling menyenangkan: **PRAKTIK!**

Ikuti langkah-langkah saya dengan seksama ya. Jangan skip! 👇

---

### 📝 PRAKTIK 1: Membuat Program "Hello World" Pertama Teman-Teman!

**"Sekarang kita akan membuat program pertama kita bersama-sama. Ikuti langkah-langkah berikut ya!"**

#### LANGKAH DEMI LANGKAH:

**Langkah 1: Buka NetBeans**
- Pastikan NetBeans sudah terbuka

**Langkah 2: Buat Project Baru**
- Klik menu **File** → **New Project**
- Atau tekan **Ctrl+Shift+N** (shortcut)

> 📸 **[Screenshot: Menu File → New Project]**

**Langkah 3: Pilih Jenis Project**
- Pada jendela "New Project", pilih:
  - **Categories**: Java with Ant
  - **Projects**: Java Application
- Klik **Next**

> 📸 **[Screenshot: Jendela New Project dengan pilihan yang di-highlight]**

**Langkah 4: Beri Nama Project**
- **Project Name**: Ketik `HelloWorld`
- **Project Location**: Biarkan default atau pilih folder yang teman-teman inginkan
- **Create Main Class**: Pastikan **checkbox ini tercentang** ✅
- **Main Class**: Biarkan `helloworld.HelloWorld`
- Klik **Finish**

> 📸 **[Screenshot: Jendela Name and Location dengan data yang sudah diisi]**

**Langkah 5: Tunggu Sebentar**
- NetBeans akan membuat project teman-teman
- Tunggu beberapa detik...
- **Voila!** Project teman-teman sudah siap!

> 📸 **[Screenshot: Tampilan project HelloWorld yang sudah dibuat di NetBeans]**

#### MARI KITA LIHAT KODE YANG SUDAH ADA

NetBeans sudah membuatkan kode dasar untuk kita! Lihat di Editor, ada kode seperti ini:

```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package helloworld;

/**
 *
 * @author anton
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
```

**Jangan panik!** Kodenya kelihatan banyak dan menakutkan, tapi sebenarnya yang penting cuma bagian tengahnya.

#### MARI KITA TULIS KODE PERTAMA KITA!

**Langkah 6: Hapus Komentar yang Tidak Perlu**

Untuk pemula, komentar panjang di atas malah membingungkan. Mari kita sederhanakan!

**HAPUS** bagian ini (dari baris paling atas sampai package):
```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
```

Dan **HAPUS** juga komentar di bagian class:
```java
/**
 *
 * @author anton
 */
```

Dan **HAPUS** komentar di method main:
```java
/**
 * @param args the command line arguments
 */
```

**Sehingga kode teman-teman menjadi lebih sederhana seperti ini:**

```java
package helloworld;

public class HelloWorld {

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
```

**Jauh lebih bersih dan mudah dibaca, kan?** 😊

**Langkah 7: Tulis Kode "Hello World"**

Sekarang, **HAPUS** baris `// TODO code application logic here`

Dan **KETIK** kode berikut:

```java
package helloworld;

public class HelloWorld {

    public static void main(String[] args) {
        // Program pertama saya!
        // Menampilkan tulisan di layar
        System.out.println("Hello World!");
        System.out.println("Ini program Java pertama saya!");
    }
    
}
```

**TIPS MENGETIK**:
- Ketik **persis** seperti di atas
- Perhatikan huruf besar dan kecil (Java itu case-sensitive!)
- Jangan lupa titik koma `;` di akhir perintah
- Jangan lupa tanda kutip `"` di awal dan akhir tulisan

#### PENJELASAN KODE (Baris per Baris)

Mari kita pahami apa arti setiap baris:

```java
package helloworld;
```
- **Penjelasan**: Ini seperti "alamat" project kita
- **Analogi**: Seperti alamat rumah (Jl. Melati No.5, Jakarta)
- Setiap project Java punya package name

```java
public class HelloWorld {
```
- **Penjelasan**: Ini adalah **Class** bernama `HelloWorld`
- **Analogi**: Class = Cetakan kue (nanti kita bahas lebih detail)
- `public` = siapa saja bisa akses class ini
- `{` = kurung kurawal pembuka (menandai mulai isi class)

```java
public static void main(String[] args) {
```
- **Penjelasan**: Ini adalah **method main** (pintu masuk program)
- **Analogi**: Seperti pintu depan rumah → program selalu mulai dari sini
- Setiap program Java HARUS punya method main
- `{` = kurung kurawal pembuka (menandai mulai isi method)

```java
// Program pertama saya!
// Menampilkan tulisan di layar
```
- **Penjelasan**: Ini adalah **komentar** (catatan untuk programmer)
- Komentar dimulai dengan `//`
- Komputer akan mengabaikan komentar (tidak dijalankan)
- Berguna untuk menjelaskan kode kita

```java
System.out.println("Hello World!");
```
- **Penjelasan**: Perintah untuk **menampilkan tulisan di layar**
- `System.out.println` = perintah print (cetak) ke layar
- `"Hello World!"` = tulisan yang akan ditampilkan
- `;` = titik koma (menandai akhir perintah)

```java
System.out.println("Ini program Java pertama saya!");
```
- **Penjelasan**: Perintah print kedua
- Akan tampil di baris baru (karena pakai `println`)

```java
}
```
- **Penjelasan**: Kurung kurawal penutup untuk method main

```java
}
```
- **Penjelasan**: Kurung kurawal penutup untuk class HelloWorld

#### LANGKAH 8: JALANKAN PROGRAM!

Ini momen yang paling ditunggu! 🎉

**Cara 1: Pakai Tombol Run**
- Lihat toolbar di atas
- Cari tombol **hijau dengan segitiga ▶️** (tombol Run)
- **KLIK** tombol tersebut

**Cara 2: Pakai Keyboard**
- Tekan **F6** di keyboard

**Cara 3: Pakai Menu**
- Klik menu **Run** → **Run Project**

> 📸 **[Screenshot: Tombol Run di toolbar NetBeans]**

**Langkah 9: LIHAT HASILNYA!**

Setelah klik Run, lihat bagian **Output** di bawah editor!

Teman-teman akan melihat:

```
run:
Hello World!
Ini program Java pertama saya!
BUILD SUCCESSFUL (total time: 0 seconds)
```

**SELAMAT! TEMAN-TEMAN BARU SAJA MEMBUAT DAN MENJALANKAN PROGRAM PERTAMA!** 🎊🎉🥳

> 📸 **[Screenshot: Output window menampilkan Hello World]**

#### JIKA ADA ERROR?

**❗ "Eh, kok error ya?"**

Jangan panik! Ini sangat normal. Mari kita cek:

**ERROR 1: Error: Class HelloWorld is public, should be declared in a file named HelloWorld.java**

**Penyebab**: Nama file tidak sesuai dengan nama class

**Solusi**:
1. Pastikan nama class di kode adalah `HelloWorld`
2. File harus bernama `HelloWorld.java` (persis sama)
3. Cek huruf besar/kecilnya

**ERROR 2: ';' expected**

**Penyebab**: Lupa titik koma di akhir perintah

**Solusi**:
1. Cek setiap baris perintah, harus ada `;` di akhir
2. Contoh benar: `System.out.println("Hello");`
3. Contoh salah: `System.out.println("Hello")`  ← Lupa titik koma!

**ERROR 3: Cannot find symbol**

**Penyebab**: Salah ketik nama variabel/method/class

**Solusi**:
1. Cek ejaan, harus persis!
2. Java itu case-sensitive: `System` ≠ `system`
3. `println` bukan `printline` atau `print_ln`

**Masih error?**  
Tanyakan di forum diskusi ya! Pak Anton siap membantu! 💬

---

### 📝 PRAKTIK 2: Berkenalan dengan Class dan Object

**"Sekarang kita akan belajar konsep penting: Class dan Object. Kita pakai analogi sederhana dulu ya!"**

#### APA ITU CLASS?

**Class itu seperti CETAKAN KUE** 🍪

Bayangkan teman-teman punya cetakan kue berbentuk bintang. Dengan cetakan itu, teman-teman bisa membuat:
- Kue bintang coklat
- Kue bintang vanilla
- Kue bintang strawberry
- Dan banyak kue bintang lainnya!

**Class = Cetakan** (blueprint/rancangan)
**Object = Kue yang sudah jadi** (hasil dari cetakan)

Dalam programming:
- **Class** = Template/rancangan
- **Object** = Hasil nyata dari class

#### CONTOH KONKRET: Class Mahasiswa

Misalnya kita punya class `Mahasiswa`. Class ini adalah **cetakan** untuk membuat data mahasiswa.

Dari class `Mahasiswa`, kita bisa membuat banyak object:
- Mahasiswa 1: Nama = "Budi", NIM = "123456"
- Mahasiswa 2: Nama = "Ani", NIM = "123457"
- Mahasiswa 3: Nama = "Citra", NIM = "123458"

Semua object di atas punya "bentuk" yang sama (punya nama dan NIM), tapi **isinya berbeda**.

#### MARI KITA PRAKTIK!

**Langkah 1: Buat Class Baru**

Klik kanan pada package `helloworld` di panel **Projects** (kiri) → **New** → **Java Class**

> 📸 **[Screenshot: Klik kanan package → New → Java Class]**

**Langkah 2: Beri Nama Class**

- **Class Name**: Ketik `Mahasiswa`
- Klik **Finish**

> 📸 **[Screenshot: Jendela New Java Class dengan nama Mahasiswa]**

**Langkah 3: Lihat File Baru**

NetBeans akan membuat file `Mahasiswa.java` dan membukanya di editor.

Teman-teman akan melihat kode seperti ini:

```java
package helloworld;

/**
 *
 * @author anton
 */
public class Mahasiswa {
    
}
```

**Langkah 4: Bersihkan Komentar**

Hapus komentar seperti sebelumnya, sehingga menjadi:

```java
package helloworld;

public class Mahasiswa {
    
}
```

**Langkah 5: Tambahkan Attribute**

Sekarang kita akan memberi "isi" ke class Mahasiswa. Isinya adalah **attribute** (data/ciri-ciri).

Ketik kode berikut **DI DALAM** kurung kurawal class:

```java
package helloworld;

public class Mahasiswa {
    // Attribute = ciri-ciri/data yang dimiliki mahasiswa
    
    // Attribute 1: Nama mahasiswa
    String nama;
    
    // Attribute 2: NIM mahasiswa
    String nim;
}
```

**PENJELASAN**:
- `String nama;` = Mahasiswa punya data nama (tipe String/text)
- `String nim;` = Mahasiswa punya data NIM (tipe String/text)
- Titik koma `;` di akhir setiap attribute

**Selamat! Teman-teman sudah membuat Class pertama!** 👏

#### LANGKAH 6: Menggunakan Class (Membuat Object)

Sekarang kita akan **menggunakan** class `Mahasiswa` yang sudah kita buat.

Buka kembali file `HelloWorld.java` (klik tab di atas editor)

Ubah method main menjadi seperti ini:

```java
package helloworld;

public class HelloWorld {

    public static void main(String[] args) {
        // Membuat object mahasiswa pertama
        Mahasiswa mhs1 = new Mahasiswa();
        
        // Mengisi data mahasiswa
        mhs1.nama = "Budi Santoso";
        mhs1.nim = "123456";
        
        // Menampilkan data mahasiswa
        System.out.println("=== Data Mahasiswa ===");
        System.out.println("Nama: " + mhs1.nama);
        System.out.println("NIM: " + mhs1.nim);
    }
    
}
```

#### PENJELASAN KODE (Baris per Baris):

```java
Mahasiswa mhs1 = new Mahasiswa();
```
- **Penjelasan**: Membuat object baru dari class Mahasiswa
- `Mahasiswa` = tipe data (class yang kita buat)
- `mhs1` = nama object (bisa kita ganti dengan nama lain)
- `new Mahasiswa()` = perintah membuat object baru
- **Analogi**: Mencetak kue dari cetakan Mahasiswa, hasilnya kita beri nama `mhs1`

```java
mhs1.nama = "Budi Santoso";
```
- **Penjelasan**: Mengisi attribute nama dari object mhs1
- `mhs1.nama` = akses attribute nama dari object mhs1
- `=` = operator penugasan (memasukkan nilai)
- `"Budi Santoso"` = nilai yang dimasukkan ke attribute nama

```java
mhs1.nim = "123456";
```
- **Penjelasan**: Mengisi attribute nim dari object mhs1
- Sama seperti di atas, tapi untuk nim

```java
System.out.println("=== Data Mahasiswa ===");
```
- **Penjelasan**: Menampilkan judul/header

```java
System.out.println("Nama: " + mhs1.nama);
```
- **Penjelasan**: Menampilkan attribute nama
- `"Nama: "` = text biasa
- `+` = operator penggabungan (concatenation)
- `mhs1.nama` = mengambil nilai dari attribute nama

```java
System.out.println("NIM: " + mhs1.nim);
```
- **Penjelasan**: Menampilkan attribute nim
- Sama seperti di atas

#### LANGKAH 7: JALANKAN PROGRAM!

Tekan **F6** atau klik tombol **Run** ▶️

**LIHAT HASILNYA di Output:**

```
run:
=== Data Mahasiswa ===
Nama: Budi Santoso
NIM: 123456
BUILD SUCCESSFUL (total time: 0 seconds)
```

**SELAMAT! Teman-teman sudah berhasil:**
- ✅ Membuat Class
- ✅ Membuat Object dari Class
- ✅ Mengisi data Object
- ✅ Menampilkan data Object

**Keren kan?!** 🌟

---

### 📝 PRAKTIK 3: Membuat Banyak Object

**"Class itu kan cetakan. Dari satu cetakan, kita bisa bikin banyak kue. Sama dengan Class!"**

Mari kita buat **2 object mahasiswa** sekaligus:

Ubah method main menjadi:

```java
public static void main(String[] args) {
    // Membuat object mahasiswa pertama
    Mahasiswa mhs1 = new Mahasiswa();
    mhs1.nama = "Budi Santoso";
    mhs1.nim = "123456";
    
    // Membuat object mahasiswa kedua
    Mahasiswa mhs2 = new Mahasiswa();
    mhs2.nama = "Ani Lestari";
    mhs2.nim = "123457";
    
    // Menampilkan data mahasiswa pertama
    System.out.println("=== Data Mahasiswa 1 ===");
    System.out.println("Nama: " + mhs1.nama);
    System.out.println("NIM: " + mhs1.nim);
    
    System.out.println(""); // Baris kosong
    
    // Menampilkan data mahasiswa kedua
    System.out.println("=== Data Mahasiswa 2 ===");
    System.out.println("Nama: " + mhs2.nama);
    System.out.println("NIM: " + mhs2.nim);
}
```

**JALANKAN!** (F6)

**HASILNYA:**

```
run:
=== Data Mahasiswa 1 ===
Nama: Budi Santoso
NIM: 123456

=== Data Mahasiswa 2 ===
Nama: Ani Lestari
NIM: 123457
BUILD SUCCESSFUL (total time: 0 seconds)
```

**Lihat?!** Dari satu class `Mahasiswa`, kita bisa bikin banyak object dengan data berbeda!

Seperti cetakan kue → bisa bikin banyak kue! 🍪🍪🍪

---

## 6. PRAKTIK MANDIRI - "GILIRAN KAMU!" (10 menit)

**"Nah sekarang giliran teman-teman praktik sendiri!"**

### ✏️ Latihan 1: Membuat Class Buku (BASIC)

**TUGAS**:
Buatlah program yang:
1. Membuat class `Buku` dengan 2 attribute:
   - `judul` (String)
   - `penulis` (String)
2. Membuat 1 object buku
3. Mengisi data buku:
   - Judul: "Pemrograman Java"
   - Penulis: "Anton Prafanto"
4. Menampilkan data buku tersebut

**LANGKAH-LANGKAH**:

**Step 1**: Buat class baru bernama `Buku`
- Klik kanan package → New → Java Class
- Nama: `Buku`

**Step 2**: Tambahkan attribute di class `Buku`:
```java
package helloworld;

public class Buku {
    // Lengkapi di sini!
    // Tambahkan attribute judul dan penulis
}
```

**Step 3**: Buat file baru `TestBuku.java` (dengan main method)
- Klik kanan package → New → Java Class
- Nama: `TestBuku`
- Tambahkan method main di dalamnya

**Step 4**: Di method main, buat object buku dan isi datanya

**Step 5**: Tampilkan data buku

**TIPS**:
- Kalau bingung, lihat lagi contoh class `Mahasiswa`
- Ganti `Mahasiswa` dengan `Buku`
- Ganti `nama` dengan `judul`
- Ganti `nim` dengan `penulis`

**OUTPUT YANG DIHARAPKAN**:
```
=== Data Buku ===
Judul: Pemrograman Java
Penulis: Anton Prafanto
```

---

### ✏️ Latihan 2: Membuat Banyak Buku (MEDIUM)

**TUGAS**:
Buatlah program yang menampilkan data **2 buku** sekaligus!

Buku 1:
- Judul: "Pemrograman Java"
- Penulis: "Anton Prafanto"

Buku 2:
- Judul: "Algoritma Pemrograman"
- Penulis: "Budi Raharjo"

**TIPS**:
- Buat 2 object: `buku1` dan `buku2`
- Isi data masing-masing
- Tampilkan keduanya

**OUTPUT YANG DIHARAPKAN**:
```
=== Data Buku 1 ===
Judul: Pemrograman Java
Penulis: Anton Prafanto

=== Data Buku 2 ===
Judul: Algoritma Pemrograman
Penulis: Budi Raharjo
```

**Kalau kesulitan, tidak apa-apa!**  
Fokus ke Latihan 1 dulu sampai benar-benar paham. Latihan 2 adalah bonus untuk yang sudah lancar! 😊

---

## 7. TROUBLESHOOTING UNTUK PEMULA (5 menit)

**"Masalah yang Sering Muncul & Solusinya"**

### ❗ ERROR 1: Cannot find symbol

**Pesan error:**
```
error: cannot find symbol
  symbol:   class Mahasiswa
  location: class HelloWorld
```

**Penyebab**: 
- Salah ketik nama class
- Class belum dibuat
- Huruf besar/kecil salah

**Solusi**:
1. Pastikan class `Mahasiswa` sudah dibuat (ada file `Mahasiswa.java`)
2. Cek ejaan: `Mahasiswa` bukan `mahasiswa` atau `Mahasiswaa`
3. Refresh project: klik kanan project → Clean and Build

---

### ❗ ERROR 2: ; expected

**Pesan error:**
```
error: ';' expected
    System.out.println("Hello")
                               ^
```

**Penyebab**: Lupa titik koma di akhir perintah

**Solusi**:
1. Tambahkan `;` di akhir baris
2. Setiap perintah di Java harus diakhiri titik koma
3. Contoh benar: `System.out.println("Hello");`

---

### ❗ ERROR 3: Class HelloWorld is public, should be declared in a file named HelloWorld.java

**Pesan error:**
```
error: class HelloWorld is public, should be declared in a file named HelloWorld.java
```

**Penyebab**: Nama file tidak sesuai dengan nama class

**Solusi**:
1. Nama class: `public class HelloWorld` → Nama file harus: `HelloWorld.java`
2. Harus persis sama (huruf besar/kecil juga)
3. Di NetBeans, ini biasanya sudah otomatis benar

---

### ❗ ERROR 4: Exception in thread "main" java.lang.NullPointerException

**Pesan error:**
```
Exception in thread "main" java.lang.NullPointerException
    at helloworld.HelloWorld.main(HelloWorld.java:12)
```

**Penyebab**: Mencoba mengakses object yang belum dibuat (null)

**Solusi**:
1. Pastikan sudah membuat object: `Mahasiswa mhs1 = new Mahasiswa();`
2. Jangan lupa kata `new`!
3. Contoh SALAH: `Mahasiswa mhs1;` (belum dibuat objectnya)
4. Contoh BENAR: `Mahasiswa mhs1 = new Mahasiswa();`

---

### 💡 Tips NetBeans untuk Pemula:

**1. Auto Complete (Ctrl+Space)**
- Saat mengetik, tekan Ctrl+Space
- NetBeans akan memberikan saran kode
- Pilih dengan arrow keys, Enter untuk pilih

**2. Format Code Otomatis (Alt+Shift+F)**
- Kode teman-teman berantakan?
- Tekan Alt+Shift+F
- NetBeans akan merapikan indentasi otomatis!

**3. Fix Imports (Ctrl+Shift+I)**
- Kalau ada garis merah di import
- Tekan Ctrl+Shift+I
- NetBeans akan memperbaiki import otomatis

**4. Run Program (F6)**
- Cara tercepat: tekan F6
- Tidak perlu klik-klik menu!

---

**Masih error?**  
📧 Tanya di forum diskusi TUWEB  
💬 Pak Anton siap membantu!

---

## 8. KETERKAITAN DENGAN TUGAS & REMINDER

**"Hubungannya dengan Tugas Teman-Teman"**

### Tugas 1 (Aktivitas Belajar 4)

Materi hari ini adalah **fondasi** untuk tugas-tugas teman-teman ke depan!

**Yang akan teman-teman butuhkan dari materi hari ini:**
- ✅ Cara membuat class
- ✅ Cara membuat object
- ✅ Cara mengisi dan menampilkan data

Di Tugas 1 nanti, teman-teman akan diminta membuat program dengan **class dan object** seperti yang baru kita pelajari, ditambah dengan **if-else** (struktur keputusan).

### Timeline Penting 📅

- **Tugas 1**: Deadline Aktivitas Belajar 7
- **Format**: Rekaman video pelaksanaan praktik
- **Tips**: Mulai kerjakan dari sekarang, jangan tunggu deadline!

### Tips Mengerjakan Tugas:

1. **Pahami konsep dulu** sebelum ngoding
2. **Coba contoh** yang diberikan sampai jalan
3. **Modifikasi** contoh sesuai soal tugas
4. **Test berkali-kali** sampai yakin benar
5. **Rekam** saat program sudah jalan dengan baik

**Jangan malu bertanya di forum!** Tidak ada pertanyaan yang bodoh. Setiap pertanyaan adalah langkah belajar! 💪

---

## 9. AJAKAN DISKUSI (3-5 pertanyaan sederhana)

**"Yuk Diskusi di Forum!"**

Mari berbagi pengalaman dan saling belajar! Silakan diskusikan pertanyaan-pertanyaan berikut di **Forum Diskusi AB 2**:

### 1. Share Pengalaman Pertama! 🎉
**"Apakah teman-teman berhasil menjalankan program Hello World? Share screenshot-nya dong di forum!"**

Ceritakan pengalaman teman-teman:
- Apakah langsung berhasil?
- Atau ada error dulu?
- Bagaimana perasaan saat program pertama berhasil dijalankan?

### 2. Analogi yang Pas 🍪
**"Menurutmu, selain 'cetakan kue', analogi apa lagi yang cocok untuk menjelaskan Class dan Object?"**

Berpikir kreatif:
- Class = Resep masakan, Object = Makanan yang sudah jadi?
- Class = Blueprint rumah, Object = Rumah yang sudah dibangun?
- Atau analogi lain dari pengalaman teman-teman?

### 3. Troubleshooting Sharing 🛠️
**"Ada yang ketemu error lain selain yang dijelaskan? Share di sini ya! Kita cari solusinya bersama!"**

Jangan malu share error:
- Screenshot error-nya
- Ceritakan apa yang sedang dilakukan
- Mungkin teman lain pernah mengalami hal yang sama!

### 4. Ide Kreatif 💡
**"Kalau teman-teman mau bikin class sendiri, mau bikin class apa? (contoh: class Mobil, class HP, class Makanan, dll)"**

Berpikir aplikatif:
- Class apa yang relate dengan kehidupan teman-teman?
- Attribute apa yang akan teman-teman buat?
- Share ide kreatif teman-teman!

### 5. Motivation Share 💪
**"Setelah belajar hari ini, apa yang paling membuat kamu excited tentang programming?"**

Berbagi semangat:
- Apa yang membuat kamu tertarik?
- Goal apa yang ingin dicapai setelah belajar Java?
- Motivasi apa yang membuat kamu semangat belajar?

---

**PENTING**: Partisipasi aktif di forum akan membantu pemahaman teman-teman dan juga berkontribusi untuk nilai akhir! 📊

---

## 10. PENUTUP & MOTIVASI (5 menit)

**"Rangkuman & Semangat!"**

### 📌 Rangkuman Singkat:

Hari ini kita sudah belajar hal-hal luar biasa! 🌟

✅ **Apa yang sudah kita pelajari:**
1. Membuat program "Hello World" pertama di NetBeans
2. Memahami konsep Class (cetakan) dan Object (hasil cetakan)
3. Membuat class `Mahasiswa` dengan attribute nama dan nim
4. Membuat object dari class dan mengisi datanya
5. Menampilkan data object ke layar

✅ **Apa yang sudah kita praktikkan:**
- Membuka dan menggunakan NetBeans
- Menulis kode Java dengan benar
- Menjalankan program dan melihat outputnya
- Membuat class dan object sendiri

**Jangan lupa selesaikan latihan mandiri ya!** Praktik adalah kunci penguasaan programming! 🔑

---

### 🎯 Preview Minggu Depan:

**"Minggu depan kita akan belajar apa? Exciting!"**

Di **Aktivitas Belajar 2**, kita akan belajar:
- **Tipe Data** (int, double, boolean, String)
- **Variabel** dan cara menggunakannya
- **Identifier** dan **Keyword**

Konsep hari ini (Class dan Object) akan kita gunakan terus! Jadi pastikan materi hari ini sudah dipahami dengan baik ya! 

**Tips persiapan**:
- Latih terus membuat class dan object
- Coba buat class lain (misalnya: Mobil, Buku, Produk)
- Eksplorasi NetBeans lebih dalam

---

### 💪 Motivasi:

**"Selamat! Teman-teman sudah melewati tahap tersulit: MEMULAI!"** 🎊

Banyak orang bermimpi jadi programmer, tapi tidak semua berani memulai. **Tapi teman-teman sudah melakukannya!**

> "Every expert was once a beginner. Every master was once a disaster."  
> *— T. Harv Eker*

Artinya: Setiap ahli pernah jadi pemula. Setiap master pernah gagal.

**Pesan Pak Anton untuk teman-teman**:

1. **Jangan takut error!**  
   Error adalah teman belajar. Setiap error mengajarkan sesuatu. Programmer expert pun masih ketemu error setiap hari!

2. **Practice, practice, practice!**  
   Programming itu seperti belajar naik sepeda. Tidak cukup hanya baca teori. Harus PRAKTIK!

3. **Jangan menyerah!**  
   Kalau stuck, istirahat sebentar, lalu coba lagi. Atau tanya di forum. Kita belajar bersama-sama!

4. **Enjoy the process!**  
   Programming itu fun! Nikmati prosesnya. Setiap program yang berhasil dijalankan adalah pencapaian!

5. **You CAN do this!**  
   Kalau programmer lain bisa, TEMAN-TEMAN PASTI BISA! 💪

---

### 📢 Pengumuman Penting:

1. **Tugas 1** akan diberikan di **Aktivitas Belajar 4**
   - Deadline: Aktivitas Belajar 7
   - Format: Video rekaman praktik
   - Mulai siapkan dari sekarang!

2. **Forum Diskusi AB 2** sudah dibuka
   - Silakan diskusikan materi hari ini
   - Tanya jawab dengan tutor dan teman
   - Berbagi pengalaman dan tips

3. **TUWEB 2** akan diadakan di **Aktivitas Belajar 6**
   - Topik: Struktur Perulangan
   - Siapkan materi AB 1-5 dengan baik

---

### 🌟 Quotes Penutup:

> "Coding is not about typing, it's about thinking."

> "The best way to learn programming is by doing programming."

> "Don't watch the clock; do what it does. Keep going!" - Sam Levenson

---

### ✨ Pesan Terakhir:

Teman-teman baru saja menulis baris kode pertama. Ini adalah awal dari perjalanan yang amazing!

Mungkin hari ini hanya "Hello World", besok mungkin aplikasi mobile, website, atau software yang berguna untuk banyak orang!

**Semuanya dimulai dari langkah kecil hari ini!**

**Tetap semangat belajar!**  
**Jangan lupa sholat dan berdoa!**  
**See you di TUWEB berikutnya!** 👋

---

**Wassalamu'alaikum warahmatullahi wabarakatuh.**

---

### Salam Penutup:

**"Sampai jumpa di materi selanjutnya! Tetap semangat belajar! 💻🚀"**

---

## LAMPIRAN

### A. Panduan Instalasi JDK & NetBeans

**⚠️ PENTING**: Pastikan teman-teman install JDK dan NetBeans SEBELUM mengikuti praktik!

---

#### A.1 Install JDK (Java Development Kit)

JDK adalah toolkit yang diperlukan untuk membuat program Java. Ini wajib diinstall terlebih dahulu!

**🪟 Untuk Windows:**

1. **Download JDK**
   - Buka browser, ketik: `oracle jdk download`
   - Atau langsung ke: https://www.oracle.com/java/technologies/downloads/
   - Pilih **JDK 17 LTS** atau **JDK 21 LTS** (Long Term Support - lebih stabil)
   - Klik tab **Windows**
   - Download file **x64 Installer** (ukuran ~160 MB)

2. **Install JDK**
   - Double-click file installer yang sudah didownload (contoh: `jdk-17_windows-x64_bin.exe`)
   - Klik **Next** pada welcome screen
   - Pilih lokasi instalasi (biarkan default: `C:\Program Files\Java\jdk-17\`)
   - Klik **Next** → tunggu proses instalasi selesai
   - Klik **Close** setelah selesai

3. **Verifikasi Instalasi**
   - Buka **Command Prompt** (tekan Windows + R, ketik `cmd`, Enter)
   - Ketik: `java -version`
   - Tekan Enter
   - Jika berhasil, akan muncul versi Java yang terinstall:
     ```
     java version "17.0.x" ...
     Java(TM) SE Runtime Environment ...
     ```
   - Jika muncul "java is not recognized", lanjut ke bagian troubleshooting di bawah

**🍎 Untuk Mac:**

1. **Download JDK**
   - Buka: https://www.oracle.com/java/technologies/downloads/
   - Pilih **JDK 17 LTS** atau **JDK 21 LTS**
   - Klik tab **macOS**
   - Download **macOS Installer** (file `.dmg`)

2. **Install JDK**
   - Double-click file `.dmg` yang sudah didownload
   - Double-click icon installer
   - Ikuti wizard instalasi (Next, Next, Install)
   - Masukkan password Mac jika diminta
   - Klik **Close** setelah selesai

3. **Verifikasi Instalasi**
   - Buka **Terminal** (Applications → Utilities → Terminal)
   - Ketik: `java -version`
   - Tekan Enter
   - Jika berhasil, akan muncul versi Java

**🐧 Untuk Linux (Ubuntu/Debian):**

1. **Install via Terminal**
   ```bash
   sudo apt update
   sudo apt install openjdk-17-jdk
   ```

2. **Verifikasi**
   ```bash
   java -version
   ```

---

#### A.2 Install NetBeans IDE

NetBeans adalah software untuk menulis kode Java dengan mudah (IDE = Integrated Development Environment).

**📥 Download NetBeans:**

1. Buka: https://netbeans.apache.org/download/
2. Download **Apache NetBeans versi terbaru** (contoh: NetBeans 20)
   - Pilih versi **Binary** (bukan Source)
   - Ukuran sekitar 400-500 MB

**🪟 Install di Windows:**

1. **Extract File**
   - File download berbentuk `.zip`
   - Klik kanan → **Extract All**
   - Pilih lokasi (misalnya: `C:\Program Files\NetBeans\`)

2. **Jalankan NetBeans**
   - Masuk ke folder NetBeans → folder `bin`
   - Double-click file `netbeans64.exe`
   - Tunggu beberapa saat (loading pertama agak lama)

3. **Konfigurasi Awal**
   - Saat pertama kali buka, NetBeans akan detect JDK otomatis
   - Jika diminta pilih JDK, pilih yang tadi sudah diinstall (JDK 17 atau 21)
   - Klik **OK**

**🍎 Install di Mac:**

1. Extract file `.zip` yang didownload
2. Copy folder NetBeans ke **Applications**
3. Double-click icon NetBeans di Applications
4. Jika muncul warning "can't be opened because it is from an unidentified developer":
   - Klik kanan icon NetBeans → **Open**
   - Klik **Open** lagi untuk confirm

**🐧 Install di Linux:**

1. Extract file `.zip`
2. Jalankan:
   ```bash
   cd netbeans/bin
   ./netbeans
   ```

---

#### A.3 Troubleshooting Instalasi

**❗ Problem 1: "java is not recognized" di Command Prompt**

**Penyebab**: PATH environment variable belum diset

**Solusi Windows:**
1. Cari lokasi instalasi JDK (biasanya `C:\Program Files\Java\jdk-17\bin`)
2. Copy path tersebut
3. Klik kanan **This PC** → **Properties**
4. Klik **Advanced system settings** (kiri)
5. Klik tombol **Environment Variables**
6. Di bagian **System variables**, cari variable **Path**, klik **Edit**
7. Klik **New**
8. Paste path JDK yang tadi dicopy (contoh: `C:\Program Files\Java\jdk-17\bin`)
9. Klik **OK** semua dialog
10. **Tutup dan buka ulang Command Prompt**
11. Test lagi: `java -version`

**❗ Problem 2: NetBeans tidak bisa detect JDK**

**Solusi:**
1. Buka file `netbeans.conf` di folder `NetBeans\etc\`
2. Cari baris: `#netbeans_jdkhome="/path/to/jdk"`
3. Hapus tanda `#` dan ubah path ke lokasi JDK teman-teman
4. Contoh: `netbeans_jdkhome="C:\Program Files\Java\jdk-17"`
5. Save file
6. Buka ulang NetBeans

**❗ Problem 3: NetBeans sangat lambat**

**Solusi:**
1. Tutup NetBeans
2. Edit file `netbeans.conf` (sama seperti di atas)
3. Cari baris `netbeans_default_options`
4. Tambahkan di akhir baris: `-J-Xms512m -J-Xmx2048m`
   - Ini menambah memory untuk NetBeans
5. Save dan buka ulang NetBeans

**❗ Problem 4: Download sangat lambat**

**Alternatif Download:**
- **JDK**: Coba download dari Adoptium: https://adoptium.net/ (OpenJDK, gratis)
- **NetBeans**: Coba download dari mirror lokal atau via Sourceforge

---

#### A.4 Verifikasi Instalasi Berhasil

**✅ Checklist:**
- [ ] Command `java -version` berhasil menampilkan versi Java
- [ ] NetBeans bisa dibuka tanpa error
- [ ] Bisa membuat New Project di NetBeans (File → New Project)
- [ ] Bisa run program sederhana (coba Hello World dari materi)

**Jika semua checklist ✅, maka instalasi BERHASIL!** 🎉

Jika masih ada masalah, **jangan ragu tanya di Forum Diskusi AB 2**. Pak Anton dan teman-teman siap membantu! 💪

---

### B. Referensi Tambahan

**Link ke BMP**: Modul 1 - KB 1 (Konsep Pemrograman Berorientasi Objek)

**Referensi Online**:
1. NetBeans Official Documentation: https://netbeans.apache.org/kb/
2. Java Documentation: https://docs.oracle.com/javase/tutorial/
3. W3Schools Java Tutorial: https://www.w3schools.com/java/
4. Adoptium (OpenJDK Download): https://adoptium.net/

### B. Checklist Keberhasilan

Pastikan teman-teman sudah bisa:
- [ ] Membuka NetBeans
- [ ] Membuat project baru
- [ ] Menulis kode "Hello World"
- [ ] Menjalankan program (F6)
- [ ] Melihat output di window Output
- [ ] Membuat class baru
- [ ] Menambahkan attribute ke class
- [ ] Membuat object dari class
- [ ] Mengisi data object
- [ ] Menampilkan data object

Kalau ada yang belum bisa, **JANGAN MALU BERTANYA!** 💬

### C. Kontak

**Tutor**: Anton Prafanto, S.Kom., M.T.  
**Forum Diskusi**: Forum AB 2 di LMS UT  
**Mata Kuliah**: STSI4201 - Pemrograman Berbasis Desktop

---

**#LearningByDoing #NetBeans #JavaForBeginners #UniversitasTerbuka #STSI4201 #HelloWorld**

---

**END OF TUWEB 1**

Dibuat dengan ❤️ untuk mahasiswa Universitas Terbuka  
*Keep coding, keep learning!* 🚀
