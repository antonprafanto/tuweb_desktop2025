# Konsep GUI (Graphical User Interface)

## Tutorial Ke-4: Pemrograman Berbasis Desktop
**Mata Kuliah**: STSI4201 - Pemrograman Berbasis Desktop
**Program Studi**: Sistem Informasi
**Universitas Terbuka**

---

## 🎯 Capaian Pembelajaran

Setelah mempelajari materi ini, mahasiswa diharapkan mampu:
1. Memahami konsep GUI (Graphical User Interface)
2. Mengenal komponen Swing di Java
3. Membuat window dan form dengan JFrame
4. Menggunakan berbagai komponen GUI (button, textfield, label, dll)
5. Menerapkan event handling untuk interaksi user
6. Menggunakan layout manager untuk tata letak
7. Mengintegrasikan GUI dengan database

---

## 📚 Pendahuluan

### Apa itu GUI?

**GUI (Graphical User Interface)** adalah antarmuka grafis yang memungkinkan user berinteraksi dengan program melalui elemen visual seperti window, button, textbox, menu, dll.

### CLI vs GUI

| Aspek | CLI (Console) | GUI (Graphical) |
|-------|---------------|-----------------|
| **Interaksi** | Ketik perintah | Klik, drag, drop |
| **User-friendly** | Kurang | ✅ Sangat |
| **Visualisasi** | Teks saja | Grafis, warna, ikon |
| **Learning curve** | Tinggi | Rendah |
| **Contoh** | CMD, Terminal | Windows, macOS |

```
CLI:                          GUI:
> masukkan nama: John         ┌─────────────────┐
> masukkan umur: 25           │ Nama: [John   ] │
> data disimpan               │ Umur: [25     ] │
                              │ [Simpan] [Batal]│
                              └─────────────────┘
```

---

## 🎨 Swing vs AWT

Java menyediakan 2 library utama untuk GUI:

### 1. AWT (Abstract Window Toolkit)
- ❌ Library lama (sejak JDK 1.0)
- ❌ Bergantung pada OS (platform-dependent)
- ❌ Komponen lebih terbatas

### 2. Swing (Recommended) ✅
- ✅ Library modern (sejak JDK 1.2)
- ✅ Platform-independent
- ✅ Lebih banyak komponen
- ✅ Look and feel yang customizable
- ✅ Lightweight components

**Kita akan menggunakan Swing!**

---

## 🧱 Komponen Dasar Swing

### Hierarki Class Swing

```
java.awt.Component
    └── java.awt.Container
            └── javax.swing.JComponent
                    ├── JButton
                    ├── JLabel
                    ├── JTextField
                    ├── JTextArea
                    ├── JCheckBox
                    ├── JRadioButton
                    ├── JComboBox
                    ├── JList
                    ├── JTable
                    └── dll.

javax.swing.JFrame (untuk window)
```

### Komponen Utama

| Komponen | Fungsi | Contoh Penggunaan |
|----------|--------|-------------------|
| **JFrame** | Window utama | Main window aplikasi |
| **JPanel** | Container untuk komponen lain | Grouping komponen |
| **JLabel** | Menampilkan teks/gambar | Label "Nama:", "Umur:" |
| **JTextField** | Input teks 1 baris | Input nama, email |
| **JTextArea** | Input teks multi-baris | Alamat, deskripsi |
| **JButton** | Tombol yang bisa diklik | Simpan, Batal, OK |
| **JCheckBox** | Pilihan yes/no (bisa multiple) | Hobi, Minat |
| **JRadioButton** | Pilihan (hanya 1 dari grup) | Gender: Pria/Wanita |
| **JComboBox** | Dropdown list | Pilih kota, negara |
| **JTable** | Tabel data | Daftar mahasiswa |
| **JMenuBar** | Menu bar | File, Edit, Help |

---

## 🪟 Membuat Window Pertama

### Program Hello World GUI

```java
import javax.swing.*;

public class HelloGUI {
    public static void main(String[] args) {
        // Buat JFrame (window)
        JFrame frame = new JFrame("Hello GUI");

        // Set ukuran window (width x height)
        frame.setSize(400, 300);

        // Set operasi saat close window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Tampilkan window
        frame.setVisible(true);
    }
}
```

**Penjelasan:**
1. **JFrame**: Class untuk membuat window
2. **setSize()**: Ukuran window dalam pixel
3. **setDefaultCloseOperation()**: Apa yang terjadi saat window ditutup
   - `EXIT_ON_CLOSE`: Program berhenti
   - `DISPOSE_ON_CLOSE`: Tutup window tapi program jalan
   - `HIDE_ON_CLOSE`: Sembunyikan window
4. **setVisible(true)**: Tampilkan window (default: tidak tampil)

---

## 🏗️ Menambahkan Komponen

### Contoh: Label dan Button

```java
import javax.swing.*;
import java.awt.*;

public class SimpleForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Form Sederhana");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Buat panel sebagai container
        JPanel panel = new JPanel();

        // Buat komponen
        JLabel label = new JLabel("Selamat Datang!");
        JButton button = new JButton("Klik Saya");

        // Tambahkan komponen ke panel
        panel.add(label);
        panel.add(button);

        // Tambahkan panel ke frame
        frame.add(panel);

        frame.setVisible(true);
    }
}
```

**Konsep:**
- **JPanel**: Container untuk mengelompokkan komponen
- **add()**: Menambahkan komponen ke container
- Default layout: FlowLayout (komponen tersusun horizontal)

---

## 🎭 Event Handling

**Event** adalah aksi yang dilakukan user (klik, ketik, dll). **Event Handling** adalah cara program merespon event.

### Konsep Event Handling

```
User Action → Event → Event Listener → Handler Code
   (klik)     (event)  (mendengarkan)  (eksekusi)
```

### Contoh: Button Click Event

```java
import javax.swing.*;
import java.awt.event.*;

public class ButtonEvent {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Event Handling");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JButton button = new JButton("Klik Saya!");

        // Tambahkan ActionListener
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Tombol diklik!");
            }
        });

        panel.add(button);
        frame.add(panel);
        frame.setVisible(true);
    }
}
```

**Penjelasan:**
- **ActionListener**: Interface untuk handle event
- **actionPerformed()**: Method yang dijalankan saat event terjadi
- **Anonymous class**: Class tanpa nama untuk implementasi cepat
- **JOptionPane**: Dialog box untuk menampilkan pesan

---

## 📐 Layout Manager

Layout Manager mengatur tata letak komponen di container.

### 1. FlowLayout (Default)

Komponen tersusun horizontal dari kiri ke kanan.

```java
panel.setLayout(new FlowLayout());
panel.add(button1);
panel.add(button2);
panel.add(button3);

// Hasil: [Button1] [Button2] [Button3]
```

### 2. BorderLayout

Membagi container menjadi 5 wilayah: NORTH, SOUTH, EAST, WEST, CENTER.

```java
frame.setLayout(new BorderLayout());
frame.add(topPanel, BorderLayout.NORTH);
frame.add(leftPanel, BorderLayout.WEST);
frame.add(centerPanel, BorderLayout.CENTER);
frame.add(rightPanel, BorderLayout.EAST);
frame.add(bottomPanel, BorderLayout.SOUTH);
```

```
┌─────────────────────────┐
│        NORTH            │
├─────┬───────────┬───────┤
│WEST │  CENTER   │ EAST  │
│     │           │       │
├─────┴───────────┴───────┤
│        SOUTH            │
└─────────────────────────┘
```

### 3. GridLayout

Tata letak grid (baris x kolom) dengan ukuran sama.

```java
panel.setLayout(new GridLayout(3, 2)); // 3 baris, 2 kolom
panel.add(component1);
panel.add(component2);
panel.add(component3);
panel.add(component4);
panel.add(component5);
panel.add(component6);
```

```
┌──────────┬──────────┐
│  Comp1   │  Comp2   │
├──────────┼──────────┤
│  Comp3   │  Comp4   │
├──────────┼──────────┤
│  Comp5   │  Comp6   │
└──────────┴──────────┘
```

### 4. GridBagLayout (Advanced)

Layout paling fleksibel tapi kompleks. Setiap komponen bisa punya ukuran berbeda.

### 5. Null Layout (Absolute Positioning)

Tanpa layout manager, atur posisi manual dengan `setBounds()`.

```java
panel.setLayout(null);
button.setBounds(50, 50, 100, 30); // x, y, width, height
panel.add(button);
```

⚠️ **Tidak recommended** - tidak responsive terhadap resize window.

---

## 📝 Form Input Lengkap

### Contoh: Form Registrasi Mahasiswa

```java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormMahasiswa extends JFrame {
    // Deklarasi komponen
    private JTextField tfNama, tfNIM;
    private JComboBox<String> cbProdi;
    private JRadioButton rbPria, rbWanita;
    private JCheckBox chkAktif;
    private JTextArea taAlamat;
    private JButton btnSimpan, btnBatal;

    public FormMahasiswa() {
        // Setup frame
        setTitle("Form Mahasiswa");
        setSize(400, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center di layar

        // Main panel
        JPanel panel = new JPanel();
        panel.setLayout(null); // Absolute positioning

        // Label dan TextField Nama
        JLabel lblNama = new JLabel("Nama:");
        lblNama.setBounds(30, 30, 100, 25);
        panel.add(lblNama);

        tfNama = new JTextField();
        tfNama.setBounds(150, 30, 200, 25);
        panel.add(tfNama);

        // Label dan TextField NIM
        JLabel lblNIM = new JLabel("NIM:");
        lblNIM.setBounds(30, 70, 100, 25);
        panel.add(lblNIM);

        tfNIM = new JTextField();
        tfNIM.setBounds(150, 70, 200, 25);
        panel.add(tfNIM);

        // Label dan ComboBox Prodi
        JLabel lblProdi = new JLabel("Program Studi:");
        lblProdi.setBounds(30, 110, 100, 25);
        panel.add(lblProdi);

        String[] prodiList = {"Informatika", "Sistem Informasi", "Teknik Komputer"};
        cbProdi = new JComboBox<>(prodiList);
        cbProdi.setBounds(150, 110, 200, 25);
        panel.add(cbProdi);

        // Label dan RadioButton Jenis Kelamin
        JLabel lblGender = new JLabel("Jenis Kelamin:");
        lblGender.setBounds(30, 150, 100, 25);
        panel.add(lblGender);

        rbPria = new JRadioButton("Pria");
        rbPria.setBounds(150, 150, 80, 25);
        panel.add(rbPria);

        rbWanita = new JRadioButton("Wanita");
        rbWanita.setBounds(240, 150, 80, 25);
        panel.add(rbWanita);

        // Group radio button (hanya 1 yang bisa dipilih)
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(rbPria);
        genderGroup.add(rbWanita);

        // CheckBox Status Aktif
        chkAktif = new JCheckBox("Mahasiswa Aktif");
        chkAktif.setBounds(150, 190, 150, 25);
        panel.add(chkAktif);

        // Label dan TextArea Alamat
        JLabel lblAlamat = new JLabel("Alamat:");
        lblAlamat.setBounds(30, 230, 100, 25);
        panel.add(lblAlamat);

        taAlamat = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(taAlamat);
        scrollPane.setBounds(150, 230, 200, 80);
        panel.add(scrollPane);

        // Button Simpan
        btnSimpan = new JButton("Simpan");
        btnSimpan.setBounds(150, 330, 90, 30);
        btnSimpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                simpanData();
            }
        });
        panel.add(btnSimpan);

        // Button Batal
        btnBatal = new JButton("Batal");
        btnBatal.setBounds(260, 330, 90, 30);
        btnBatal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearForm();
            }
        });
        panel.add(btnBatal);

        // Add panel to frame
        add(panel);
        setVisible(true);
    }

    private void simpanData() {
        // Ambil data dari form
        String nama = tfNama.getText();
        String nim = tfNIM.getText();
        String prodi = (String) cbProdi.getSelectedItem();
        String gender = rbPria.isSelected() ? "Pria" : "Wanita";
        String statusAktif = chkAktif.isSelected() ? "Aktif" : "Tidak Aktif";
        String alamat = taAlamat.getText();

        // Validasi
        if (nama.isEmpty() || nim.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                "Nama dan NIM harus diisi!",
                "Validasi Error",
                JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Tampilkan data
        String pesan = "Data Mahasiswa:\n\n" +
                       "Nama: " + nama + "\n" +
                       "NIM: " + nim + "\n" +
                       "Prodi: " + prodi + "\n" +
                       "Jenis Kelamin: " + gender + "\n" +
                       "Status: " + statusAktif + "\n" +
                       "Alamat: " + alamat;

        JOptionPane.showMessageDialog(this, pesan, "Data Tersimpan", JOptionPane.INFORMATION_MESSAGE);
    }

    private void clearForm() {
        tfNama.setText("");
        tfNIM.setText("");
        cbProdi.setSelectedIndex(0);
        rbPria.setSelected(false);
        rbWanita.setSelected(false);
        chkAktif.setSelected(false);
        taAlamat.setText("");
    }

    public static void main(String[] args) {
        new FormMahasiswa();
    }
}
```

---

## 🗃️ JTable untuk Menampilkan Data

```java
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ContohJTable extends JFrame {
    private JTable table;
    private DefaultTableModel model;

    public ContohJTable() {
        setTitle("Contoh JTable");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Kolom tabel
        String[] kolom = {"NIM", "Nama", "Prodi", "IPK"};

        // Data tabel
        Object[][] data = {
            {"2101", "Andi", "Informatika", 3.75},
            {"2102", "Budi", "SI", 3.50},
            {"2103", "Citra", "Informatika", 3.90}
        };

        // Buat model tabel
        model = new DefaultTableModel(data, kolom);

        // Buat JTable
        table = new JTable(model);

        // Buat ScrollPane untuk table
        JScrollPane scrollPane = new JScrollPane(table);

        // Tambahkan ke frame
        add(scrollPane);

        setVisible(true);
    }

    public static void main(String[] args) {
        new ContohJTable();
    }
}
```

---

## 📝 Ringkasan

| Konsep | Penjelasan |
|--------|------------|
| **GUI** | Antarmuka grafis untuk interaksi user |
| **Swing** | Library Java untuk membuat GUI |
| **JFrame** | Window utama aplikasi |
| **JPanel** | Container untuk komponen |
| **Event Handling** | Merespon aksi user |
| **Layout Manager** | Mengatur tata letak komponen |
| **JTable** | Menampilkan data dalam bentuk tabel |

---

## 🚀 Langkah Selanjutnya

1. **Latihan Dasar** - Buat window dan komponen sederhana
2. **Latihan Menengah** - Form dengan event handling
3. **Aplikasi Utama** - Aplikasi Pengelola Tugas Kuliah lengkap dengan database

---

**Selamat Belajar GUI! 🎨**

---

© 2025 Anton Prafanto, S.Kom, M.T. | Universitas Terbuka
