# FAQ (Frequently Asked Questions)
## Struktur Pengulangan - Tutorial Ke-2

---

## 💬 Pertanyaan Umum

### 1. Kapan menggunakan FOR vs WHILE?

**Jawaban**:
- Gunakan **FOR** jika jumlah iterasi **sudah diketahui** sebelumnya
  ```java
  // Contoh: menampilkan angka 1-10
  for (int i = 1; i <= 10; i++) {
      System.out.println(i);
  }
  ```

- Gunakan **WHILE** jika jumlah iterasi **bergantung pada kondisi** yang dinamis
  ```java
  // Contoh: input sampai user memasukkan "selesai"
  String input = "";
  while (!input.equals("selesai")) {
      input = scanner.nextLine();
  }
  ```

---

### 2. Apa perbedaan WHILE dan DO-WHILE?

**Jawaban**:
- **WHILE**: Kondisi dicek **di awal**, bisa **0 kali** eksekusi
- **DO-WHILE**: Kondisi dicek **di akhir**, **minimal 1 kali** eksekusi

```java
// WHILE - bisa tidak dieksekusi sama sekali
int x = 10;
while (x < 5) {
    System.out.println("Tidak muncul");
}

// DO-WHILE - pasti dieksekusi minimal 1x
int y = 10;
do {
    System.out.println("Muncul 1x");
} while (y < 5);
```

---

### 3. Bagaimana menghindari INFINITE LOOP?

**Jawaban**:
Pastikan 3 hal ini:
1. ✅ Ada kondisi yang bisa menjadi FALSE
2. ✅ Variabel kondisi di-update dalam loop
3. ✅ Logika kondisi benar

```java
// ❌ SALAH - Infinite Loop
int i = 1;
while (i <= 10) {
    System.out.println(i);
    // LUPA i++
}

// ✅ BENAR
int i = 1;
while (i <= 10) {
    System.out.println(i);
    i++;  // Update variabel
}
```

---

### 4. Kapan menggunakan FOR-EACH?

**Jawaban**:
Gunakan FOR-EACH ketika:
- ✅ Hanya perlu **membaca** elemen array
- ✅ Tidak perlu **index**
- ✅ Iterasi **semua elemen**

```java
int[] nilai = {85, 90, 78, 92};

// FOR-EACH - lebih sederhana
for (int n : nilai) {
    System.out.println(n);
}

// FOR biasa - jika perlu index
for (int i = 0; i < nilai.length; i++) {
    System.out.println("Index " + i + ": " + nilai[i]);
}
```

---

### 5. Apa itu NESTED LOOP dan kapan digunakan?

**Jawaban**:
Nested loop adalah **loop di dalam loop**. Digunakan untuk:
- Pola 2D (bintang, tabel)
- Matrix/array 2 dimensi
- Kombinasi data

```java
// Membuat pola bintang segitiga
for (int i = 1; i <= 5; i++) {       // Loop luar (baris)
    for (int j = 1; j <= i; j++) {   // Loop dalam (kolom)
        System.out.print("* ");
    }
    System.out.println();
}
```

---

### 6. Apa fungsi BREAK dan CONTINUE?

**Jawaban**:
- **BREAK**: Menghentikan loop **sepenuhnya**
- **CONTINUE**: Melewati iterasi saat ini, lanjut ke iterasi berikutnya

```java
// BREAK - keluar dari loop
for (int i = 1; i <= 10; i++) {
    if (i == 5) break;  // Berhenti di 5
    System.out.println(i);  // Output: 1,2,3,4
}

// CONTINUE - skip iterasi
for (int i = 1; i <= 10; i++) {
    if (i % 2 == 0) continue;  // Skip angka genap
    System.out.println(i);  // Output: 1,3,5,7,9
}
```

---

### 7. Kenapa loop saya tidak berjalan?

**Kemungkinan Penyebab**:
1. **Kondisi awal sudah FALSE**
   ```java
   int i = 10;
   while (i < 5) {  // Kondisi sudah FALSE dari awal
       System.out.println(i);
   }
   ```

2. **Salah operator perbandingan**
   ```java
   for (int i = 1; i <= 10; i--) {  // i-- membuat i semakin kecil!
       System.out.println(i);
   }
   ```

3. **Off-by-one error**
   ```java
   int[] arr = {1, 2, 3};
   for (int i = 0; i <= arr.length; i++) {  // <= harusnya <
       System.out.println(arr[i]);
   }
   ```

---

### 8. Bagaimana cara debug loop?

**Tips Debugging**:
1. ✅ Print nilai variabel di setiap iterasi
   ```java
   for (int i = 0; i < 10; i++) {
       System.out.println("DEBUG: i = " + i);
       // kode lainnya
   }
   ```

2. ✅ Gunakan breakpoint di IDE
3. ✅ Batasi iterasi untuk testing
   ```java
   // Test dengan data kecil dulu
   for (int i = 0; i < 3; i++) {  // Bukan 1000
       // ...
   }
   ```

---

### 9. Bagaimana loop dengan array 2 dimensi?

**Jawaban**:
```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

// Nested loop untuk 2D array
for (int i = 0; i < matrix.length; i++) {          // Baris
    for (int j = 0; j < matrix[i].length; j++) {   // Kolom
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
```

---

### 10. Kenapa program saya hang/freeze?

**Penyebab**: Infinite loop!

**Solusi**:
1. Cek apakah variabel kondisi di-update
2. Tekan **Ctrl+C** untuk stop program
3. Tambahkan debug print
4. Beri batas maksimal iterasi saat testing

```java
// Tambahkan safety limit saat testing
int counter = 0;
while (kondisi) {
    counter++;
    if (counter > 1000) {  // Safety limit
        System.out.println("WARNING: Terlalu banyak iterasi!");
        break;
    }
    // kode loop
}
```

---

## 🛠️ Masalah Teknis

### Error: ArrayIndexOutOfBoundsException

**Penyebab**: Akses index array yang tidak valid

**Solusi**:
```java
// ❌ SALAH
int[] arr = {1, 2, 3};
for (int i = 0; i <= arr.length; i++) {  // <= menyebabkan error
    System.out.println(arr[i]);
}

// ✅ BENAR
for (int i = 0; i < arr.length; i++) {  // Gunakan <
    System.out.println(arr[i]);
}
```

---

### Error: StackOverflowError (dengan rekursi)

**Catatan**: Ini untuk referensi advanced
- Terjadi jika rekursi terlalu dalam
- Gunakan loop iteratif sebagai alternatif

---

## 💡 Tips & Trik

### 1. Loop Mundur
```java
for (int i = 10; i >= 1; i--) {
    System.out.println(i);
}
```

### 2. Loop dengan Step Berbeda
```java
// Increment 2
for (int i = 0; i < 20; i += 2) {
    System.out.println(i);  // 0,2,4,6,...
}

// Increment 5
for (int i = 0; i <= 100; i += 5) {
    System.out.println(i);  // 0,5,10,15,...
}
```

### 3. Loop Tanpa Batas (Hati-hati!)
```java
// Infinite loop dengan break
while (true) {
    // ... kode
    if (kondisiKeluar) {
        break;
    }
}
```

---

## 📚 Referensi Tambahan

- Modul 5 UT: Struktur Pengulangan
- Oracle Java Tutorial: Control Flow
- Stack Overflow: java-loops tag

---

**Masih ada pertanyaan? Tanyakan saat sesi tutorial! 🙋‍♂️**

---

© 2025 Anton Prafanto, S.Kom, M.T. | Universitas Terbuka
