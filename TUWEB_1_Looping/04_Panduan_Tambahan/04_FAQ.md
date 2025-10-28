# Frequently Asked Questions (FAQ) - Looping Java

## ❓ Pertanyaan Umum Mahasiswa

### 🟢 Pertanyaan Dasar

#### Q1: Apa bedanya for, while, dan do-while loop?
**A:** 
- **For loop**: Gunakan ketika kamu tahu berapa kali akan mengulang
- **While loop**: Gunakan ketika kamu tidak tahu berapa kali, tapi tahu kondisi berhentinya
- **Do-while loop**: Sama seperti while, tapi pasti jalan minimal sekali

**Contoh:**
```java
// For - tahu mau 10 kali
for (int i = 1; i <= 10; i++) { ... }

// While - tidak tahu berapa kali input user
while (userInput != 'q') { ... }

// Do-while - minimal sekali untuk validasi
do { 
    input = getUserInput(); 
} while (input < 0);
```

#### Q2: Kapan harus menggunakan break dan continue?
**A:**
- **Break**: Keluar dari loop sebelum waktunya (emergency stop)
- **Continue**: Lewati iterasi ini, lanjut ke berikutnya

**Contoh:**
```java
// Break - stop ketemu target
for (int i = 0; i < 100; i++) {
    if (foundTarget) break; // stop searching
}

// Continue - lewati yang tidak perlu
for (int i = 0; i < 10; i++) {
    if (i % 2 == 0) continue; // lewati genap
    System.out.println(i); // hanya ganjil
}
```

#### Q3: Apa itu infinite loop dan bagaimana menghindarinya?
**A:** Infinite loop adalah loop yang tidak pernah berhenti.

**Cara menghindari:**
1. Pastikan kondisi berhenti akan terpenuhi
2. Update loop control variable
3. Gunakan break untuk emergency exit

**Contoh infinite loop:**
```java
// SALAH - tidak pernah berhenti
while (true) {
    System.out.println("Hello forever!");
}

// BENAR - ada kondisi berhenti
int count = 0;
while (count < 10) {
    System.out.println("Hello " + count);
    count++; // penting!
}
```

### 🟡 Pertanyaan Intermediate

#### Q4: Bagaimana cara loop melalui array?
**A:** Ada 3 cara:

```java
String[] fruits = {"Apple", "Orange", "Mango"};

// Cara 1: Traditional for loop
for (int i = 0; i < fruits.length; i++) {
    System.out.println(fruits[i]);
}

// Cara 2: Enhanced for loop (recommended)
for (String fruit : fruits) {
    System.out.println(fruit);
}

// Cara 3: While loop
int i = 0;
while (i < fruits.length) {
    System.out.println(fruits[i]);
    i++;
}
```

#### Q5: Apa bedanya nested loop dan sequential loop?
**A:**
- **Sequential loop**: Loop satu demi satu
- **Nested loop**: Loop di dalam loop (total iterasi = luar × dalam)

```java
// Sequential - total 10 + 5 = 15 iterasi
for (int i = 0; i < 10; i++) { ... }
for (int j = 0; j < 5; j++) { ... }

// Nested - total 10 × 5 = 50 iterasi
for (int i = 0; i < 10; i++) {
    for (int j = 0; j < 5; j++) { ... }
}
```

#### Q6: Bagaimana cara debug loop yang tidak berjalan sesuai harapan?
**A:** Gunakan debugging techniques:

1. **Print debugging**:
```java
for (int i = 0; i < 10; i++) {
    System.out.println("Loop iteration: " + i); // track nilai i
    System.out.println("Condition: " + (i < 5)); // track kondisi
    // kode lainnya
}
```

2. **Step-by-step debugging** (di NetBeans):
- Set breakpoint di dalam loop
- Run debug (Ctrl+F5)
- Step over (F8) untuk setiap iterasi

3. **Check boundary conditions**:
```java
// Cek nilai awal dan akhir
System.out.println("Start: " + startValue);
System.out.println("End: " + endValue);
System.out.println("Length: " + array.length);
```

### 🔴 Pertanyaan Advanced

#### Q7: Bagaimana handle user input yang invalid dalam loop?
**A:** Gunakan validation loop:

```java
Scanner input = new Scanner(System.in);
int number;

do {
    System.out.print("Masukkan angka 1-100: ");
    
    // Cek apakah input adalah angka
    if (!input.hasNextInt()) {
        System.out.println("Input harus angka!");
        input.next(); // clear invalid input
        continue;
    }
    
    number = input.nextInt();
    
    if (number < 1 || number > 100) {
        System.out.println("Angka harus 1-100!");
    }
} while (number < 1 || number > 100);

System.out.println("Valid: " + number);
```

#### Q8: Apa performance considerations untuk loop?
**A:** Tips untuk performa:

1. **Minimize work inside loop**:
```java
// SALAH - method call di setiap iterasi
for (int i = 0; i < list.size(); i++) { ... }

// BENAR - cache size
int size = list.size();
for (int i = 0; i < size; i++) { ... }
```

2. **Use appropriate loop type**:
```java
// For array access - for loop lebih cepat
for (int i = 0; i < array.length; i++) { ... }

// For collection iteration - enhanced for loop lebih clean
for (Item item : collection) { ... }
```

3. **Avoid unnecessary object creation**:
```java
// SALAH - buat object baru setiap iterasi
for (int i = 0; i < 1000; i++) {
    StringBuilder sb = new StringBuilder();
    // ...
}

// BENAR - reuse object
StringBuilder sb = new StringBuilder();
for (int i = 0; i < 1000; i++) {
    sb.setLength(0); // reset
    // ...
}
```

#### Q9: Bagaimana implementasi loop untuk large datasets?
**A:** Untuk data besar:

1. **Use streaming** (Java 8+):
```java
list.stream()
    .filter(item -> item.isActive())
    .forEach(item -> process(item));
```

2. **Batch processing**:
```java
int batchSize = 1000;
for (int i = 0; i < largeList.size(); i += batchSize) {
    List<Item> batch = largeList.subList(i, Math.min(i + batchSize, largeList.size()));
    processBatch(batch);
}
```

3. **Parallel processing**:
```java
list.parallelStream().forEach(item -> process(item));
```

---

## 🛠️ Troubleshooting Common Issues

### Issue 1: Off-by-one Error
**Problem:** Loop kelebihan/kekurangan 1 iterasi
**Solution:** Periksa boundary conditions

```java
// SALAH - kelebihan 1
for (int i = 0; i <= array.length; i++) { ... }

// BENAR
for (int i = 0; i < array.length; i++) { ... }
```

### Issue 2: Concurrent Modification
**Problem:** Modifikasi collection saat iterasi
**Solution:** Gunakan iterator atau temporary collection

```java
// SALAH - ConcurrentModificationException
for (Item item : list) {
    if (item.shouldRemove()) {
        list.remove(item); // ERROR!
    }
}

// BENAR - gunakan iterator
Iterator<Item> iterator = list.iterator();
while (iterator.hasNext()) {
    Item item = iterator.next();
    if (item.shouldRemove()) {
        iterator.remove();
    }
}
```

### Issue 3: Memory Leak in Loop
**Problem:** Object accumulation dalam loop
**Solution:** Clean up resources

```java
// SALAH - memory leak
while (running) {
    LargeObject obj = new LargeObject();
    // obj tidak pernah di-clean up
}

// BENAR - clean up
while (running) {
    LargeObject obj = new LargeObject();
    try {
        // use obj
    } finally {
        obj.cleanup(); // release resources
    }
}
```

---

## 📞 Bantuan Tambahan

### Resources:
- [Oracle Java Tutorial - Control Flow](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/flow.html)
- [W3Schools Java For Loop](https://www.w3schools.com/java/java_for_loop.asp)
- [Baeldung Java Loops](https://www.baeldung.com/java-loops)

### Jika masih bingung:
1. Tanya dosen pengampu
2. Diskusi dengan teman
3. Search di Stack Overflow
4. Coba contoh kode sederhana dulu
5. Gunakan debugger step-by-step

**Ingat:** Practice makes perfect! Semakin sering coding, semakin paham. 💪