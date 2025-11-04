# Panduan NetBeans GUI Builder (Drag-and-Drop)

**Tutorial Ke-4: GUI Desktop**
**Mata Kuliah**: Pemrograman Berbasis Desktop (STSI4201)
**Dosen**: Anton Prafanto, S.Kom, M.T.

---

## 🎯 Tentang NetBeans GUI Builder

NetBeans GUI Builder (sebelumnya dikenal sebagai "Matisse") adalah **visual designer** yang memungkinkan Anda membuat GUI dengan cara **drag-and-drop** komponen, tanpa menulis kode layout secara manual.

**Keuntungan**:
- ✅ Lebih cepat - tidak perlu menulis kode layout
- ✅ Visual - langsung lihat hasilnya
- ✅ WYSIWYG (What You See Is What You Get)
- ✅ Auto-generate code

**Kapan Menggunakan**:
- Form yang kompleks dengan banyak komponen
- Layout yang rumit
- Prototyping cepat

**Kapan Coding Manual**:
- Aplikasi sederhana
- Dynamic UI (komponen dibuat runtime)
- Belajar fundamental (disarankan untuk pemula)

---

## 🚀 Langkah 1: Membuat JFrame Form Baru

### Step-by-step:

1. **Buka NetBeans IDE**

2. **Klik File → New File** (atau tekan Ctrl+N)

3. **Pilih Categories**: "Java GUI Forms"
   **Pilih File Types**: "JFrame Form"
   **Klik Next**

4. **Isi informasi**:
   - **Class Name**: Contoh: `FormMahasiswa`
   - **Package**: Contoh: `com.myapp`
   - **Klik Finish**

5. **NetBeans akan membuka**:
   - **Design View** (visual editor) - tampilan default
   - **Source View** (kode Java) - bisa switch dengan tombol di atas

---

## 🎨 Langkah 2: Mengenal Interface GUI Builder

### Area Kerja GUI Builder:

```
┌─────────────────────────────────────────────────────┐
│ [Design] [Source]                                   │ ← Tab View
├──────────┬────────────────────────┬─────────────────┤
│          │                        │                 │
│ Palette  │     Design Canvas      │   Properties    │
│          │                        │                 │
│ - Swing  │    [Your JFrame]       │   - Properties  │
│ - Layouts│                        │   - Events      │
│ - AWT    │                        │                 │
│          │                        │                 │
└──────────┴────────────────────────┴─────────────────┘
              │
              └─ Navigator (Structure Tree)
```

**Komponen Utama**:
1. **Palette** (kiri) - Daftar komponen yang bisa didrag
2. **Design Canvas** (tengah) - Area kerja visual
3. **Properties** (kanan) - Properties komponen terpilih
4. **Navigator** (bawah kiri) - Struktur hierarki komponen
5. **Inspector** (bawah) - Detail komponen

---

## 🖱️ Langkah 3: Menambahkan Komponen

### Cara 1: Drag-and-Drop
1. Klik komponen di **Palette** (misal: JButton)
2. Drag ke **Design Canvas**
3. Lepas di posisi yang diinginkan

### Cara 2: Double-Click
1. Double-click komponen di **Palette**
2. Komponen otomatis ditambahkan ke canvas

### Komponen yang Sering Digunakan:

**Dari Palette > Swing Controls**:
- **JLabel** - Teks / label
- **JTextField** - Input text satu baris
- **JButton** - Tombol
- **JTextArea** - Input text multi-baris
- **JComboBox** - Dropdown list
- **JCheckBox** - Checkbox
- **JRadioButton** - Radio button
- **JTable** - Tabel
- **JScrollPane** - Scroll container

---

## ⚙️ Langkah 4: Mengatur Properties

Setelah komponen ditambahkan, atur properties di **Properties Window** (kanan):

### Properties Penting:

**Untuk JLabel**:
- `text` - Teks yang ditampilkan
- `font` - Jenis dan ukuran font

**Untuk JTextField**:
- `text` - Teks default
- `columns` - Lebar text field
- `editable` - Bisa diedit atau tidak

**Untuk JButton**:
- `text` - Teks tombol
- `font` - Font tombol
- `foreground` - Warna teks
- `background` - Warna background

**Untuk JTable**:
- `model` - Table model (atur kolom dan data)

**Variable Name** (penting!):
- Klik kanan komponen → "Change Variable Name"
- Beri nama yang deskriptif (misal: `btnSimpan`, `tfNama`, `tblMahasiswa`)

---

## 📐 Langkah 5: Layout Manager

NetBeans GUI Builder menggunakan **GroupLayout** secara default (layout yang powerful dan fleksibel).

### Mengatur Layout:

1. **Free Design Mode** (default)
   - Drag komponen ke posisi manapun
   - NetBeans auto-generate GroupLayout code
   - Anchor lines muncul untuk alignment

2. **Grid Layout**
   - Right-click JFrame → Set Layout → Grid Layout
   - Atur rows dan columns

3. **Border Layout**
   - Right-click JFrame → Set Layout → Border Layout
   - Drag komponen ke: North, South, East, West, Center

### Tips Alignment:
- **Guideline hijau/biru** muncul saat drag - ikuti untuk alignment otomatis
- **Snap to grid** - komponen otomatis align
- **Resize handle** - drag untuk resize komponen

---

## 🔧 Langkah 6: Menambahkan Event Handler

### Cara Menambahkan ActionListener untuk JButton:

**Metode 1: Via Properties Window**
1. Klik komponen (misal: JButton)
2. Di **Properties Window**, klik tab **Events** (ikon petir ⚡)
3. Double-click pada **actionPerformed**
4. NetBeans auto-generate method, tulis kode Anda di sana

**Metode 2: Double-Click Komponen**
1. Double-click JButton di Design Canvas
2. Otomatis masuk Source View dengan method handler ready
3. Tulis kode Anda

**Contoh Generated Code**:
```java
private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {
    // TODO: Tulis kode Anda di sini
    String nama = tfNama.getText();
    JOptionPane.showMessageDialog(this, "Nama: " + nama);
}
```

---

## 📝 Langkah 7: Contoh Lengkap - Form Input Mahasiswa

### Design Steps:

1. **Buat JFrame Form** (ikuti Langkah 1)
   - Class Name: `FormMahasiswaGUI`

2. **Tambahkan Komponen** (dari Palette):
   - 3x JLabel: "NIM:", "Nama:", "Jurusan:"
   - 2x JTextField (untuk NIM dan Nama)
   - 1x JComboBox (untuk Jurusan)
   - 1x JButton: "Simpan"

3. **Atur Variable Names**:
   - JTextField NIM → `tfNIM`
   - JTextField Nama → `tfNama`
   - JComboBox → `cbJurusan`
   - JButton → `btnSimpan`

4. **Atur Properties**:
   - Ubah teks JLabel sesuai kebutuhan
   - JComboBox → Properties → model → klik [...] → tambahkan: "Informatika", "Sistem Informasi", "Teknik Komputer"

5. **Tambahkan Event**:
   - Double-click `btnSimpan`
   - Tulis kode:

```java
private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {
    String nim = tfNIM.getText();
    String nama = tfNama.getText();
    String jurusan = cbJurusan.getSelectedItem().toString();

    if (nim.isEmpty() || nama.isEmpty()) {
        JOptionPane.showMessageDialog(this, "NIM dan Nama harus diisi!");
        return;
    }

    String pesan = "Data Mahasiswa:\n" +
                   "NIM: " + nim + "\n" +
                   "Nama: " + nama + "\n" +
                   "Jurusan: " + jurusan;

    JOptionPane.showMessageDialog(this, pesan, "Sukses", JOptionPane.INFORMATION_MESSAGE);

    // Clear form
    tfNIM.setText("");
    tfNama.setText("");
    cbJurusan.setSelectedIndex(0);
}
```

6. **Run**:
   - Klik kanan di Design/Source → Run File (Shift+F6)

---

## 🛠️ Langkah 8: Bekerja dengan JTable

### Menambahkan JTable:

1. **Drag JTable** dari Palette ke Canvas
2. **Wrap dengan JScrollPane**:
   - NetBeans akan otomatis tanya: "Do you want to wrap in JScrollPane?"
   - Klik **Yes**

3. **Edit Table Model**:
   - Right-click JTable → Table Contents
   - **Columns Tab**: Tambah/edit nama kolom
   - **Rows Tab**: Tambah data sample (optional)
   - Klik OK

4. **Change Variable Name**:
   - Right-click JTable → Change Variable Name → `tblMahasiswa`

### Menambah Data ke JTable via Code:

```java
// Di method constructor atau init
DefaultTableModel model = (DefaultTableModel) tblMahasiswa.getModel();
model.addRow(new Object[]{"202301001", "Budi", "Informatika"});
```

---

## 💡 Tips dan Trik

### 1. Shortcut Keyboard
- **Ctrl + Space** - Auto-complete
- **Ctrl + S** - Save
- **Shift + F6** - Run file
- **Alt + Insert** - Generate code (getter/setter)

### 2. Alignment Tools
- Gunakan **toolbar alignment** di atas canvas:
  - Align Left/Right/Top/Bottom
  - Same Size
  - Distribute Horizontally/Vertically

### 3. Preview Form
- **Right-click design canvas → Preview Design** (Ctrl+F12)
- Lihat tampilan tanpa run

### 4. Generated Code
- Code di method `initComponents()` **JANGAN DIEDIT MANUAL!**
- Ditandai dengan:
```java
// <editor-fold defaultstate="collapsed" desc="Generated Code">
// ... generated code ...
// </editor-fold>
```
- Edit hanya via GUI Builder!

### 5. Custom Code di Generated Code
- Right-click komponen → Customize Code
- Bisa insert custom code di specific points

---

## ⚠️ Hal yang Perlu Diperhatikan

### ❌ JANGAN:
1. **Edit `initComponents()` manual** - akan hilang saat regenerate
2. **Hapus file `.form`** - file metadata GUI Builder
3. **Commit tanpa `.form`** - rekan kerja tidak bisa edit GUI

### ✅ LAKUKAN:
1. **Tulis logic di method terpisah** (di luar `initComponents()`)
2. **Commit file `.form` dan `.java` together**
3. **Test frequent** - preview dan run berkala

---

## 📚 Latihan Mandiri

### Latihan 1: Form Kalkulator
Buat form kalkulator dengan GUI Builder:
- 2 JTextField untuk input angka
- 4 JButton untuk operasi (+, -, ×, ÷)
- 1 JLabel untuk hasil

### Latihan 2: Form CRUD
Buat form CRUD mahasiswa:
- Form input (NIM, Nama, Jurusan)
- JTable untuk tampilkan data
- Button: Tambah, Edit, Hapus, Clear

### Latihan 3: Form dengan Tab
Gunakan JTabbedPane untuk multiple tabs:
- Tab 1: Input Data
- Tab 2: Lihat Data (JTable)
- Tab 3: Statistik

---

## 🎯 Kesimpulan

**GUI Builder** sangat membantu untuk:
- ✅ Prototyping cepat
- ✅ Form kompleks
- ✅ Alignment yang presisi

**Coding Manual** lebih baik untuk:
- ✅ Pemahaman fundamental
- ✅ Dynamic UI
- ✅ Kontrol penuh atas layout

**Best Practice**: Kombinasikan keduanya!
- Gunakan GUI Builder untuk layout dasar
- Tulis logic dan dynamic behavior manual

---

## 📖 Resource Tambahan

- **NetBeans Docs**: https://netbeans.apache.org/tutorial/
- **Java Swing Tutorial**: https://docs.oracle.com/javase/tutorial/uiswing/
- **YouTube**: Cari "NetBeans GUI Builder Tutorial"

---

**Selamat Berkreasi dengan GUI Builder! 🎨💻**

*Tutorial Ke-4: GUI Desktop | STSI4201 Pemrograman Berbasis Desktop*
