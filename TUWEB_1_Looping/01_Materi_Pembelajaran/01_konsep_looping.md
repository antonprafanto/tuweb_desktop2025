# TUWEB 1 - Konsep Looping (Perulangan)

## 📚 Materi Pembelajaran

### 1. Pengertian Looping
Looping atau perulangan adalah konsep pemrograman yang memungkinkan kita untuk mengeksekusi blok kode secara berulang kali sampai kondisi tertentu terpenuhi.

### 2. Jenis-jenis Looping dalam Java

#### 2.1 For Loop
Digunakan ketika kita tahu berapa kali perulangan akan dilakukan.

**Sintaks:**
```java
for (inisialisasi; kondisi; increment/decrement) {
    // kode yang akan diulang
}
```

**Contoh:**
```java
// Menampilkan angka 1-10
for (int i = 1; i <= 10; i++) {
    System.out.println("Angka ke-" + i);
}
```

#### 2.2 While Loop
Digunakan ketika kita tidak tahu berapa kali perulangan akan dilakukan, tapi kita tahu kondisi berhentinya.

**Sintaks:**
```java
while (kondisi) {
    // kode yang akan diulang
}
```

**Contoh:**
```java
int angka = 1;
while (angka <= 10) {
    System.out.println("Angka ke-" + angka);
    angka++;
}
```

#### 2.3 Do-While Loop
Mirip dengan while loop, tapi minimal dieksekusi satu kali karena pengecekan kondisi dilakukan di akhir.

**Sintaks:**
```java
do {
    // kode yang akan diulang
} while (kondisi);
```

**Contoh:**
```java
int angka = 1;
do {
    System.out.println("Angka ke-" + angka);
    angka++;
} while (angka <= 10);
```

### 3. Perbandingan Jenis Looping

| Jenis Loop | Kapan Digunakan | Kelebihan | Kekurangan |
|------------|----------------|-----------|------------|
| For | Jumlah perulangan diketahui | Kontrol penuh atas iterasi | Kurang fleksibel |
| While | Kondisi berhenti diketahui | Fleksibel | Bisa infinite loop |
| Do-While | Minimal 1 kali eksekusi | Pasti jalan sekali | Kurang umum digunakan |

### 4. Kontrol Looping

#### 4.1 Break
Menghentikan perulangan secara paksa.

```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        break; // keluar dari loop
    }
    System.out.println("Angka ke-" + i);
}
```

#### 4.2 Continue
Melanjutkan ke iterasi berikutnya (melewati sisa kode).

```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        continue; // lewati iterasi ini
    }
    System.out.println("Angka ke-" + i);
}
```

### 5. Nested Loop (Looping Bersarang)
Looping di dalam looping.

```java
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        System.out.println("i=" + i + ", j=" + j);
    }
}
```

## 🎯 Tujuan Pembelajaran
Setelah mempelajari materi ini, mahasiswa diharapkan dapat:
1. Memahami konsep dasar looping
2. Menggunakan ketiga jenis looping dengan tepat
3. Menerapkan kontrol looping (break dan continue)
4. Membuat program dengan nested loop

## 💡 Tips Best Practices
1. Pilih jenis looping yang sesuai dengan kebutuhan
2. Hindari infinite loop
3. Gunakan nama variabel yang jelas
4. Berikan komentar jika perulangan kompleks