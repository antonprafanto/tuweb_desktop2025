# Latihan Dasar - GUI Desktop dengan Java Swing

**Tutorial Ke-4: GUI Desktop**
**Mata Kuliah**: Pemrograman Berbasis Desktop (STSI4201)
**Dosen**: Anton Prafanto, S.Kom, M.T.

---

## 🎯 Tujuan Latihan

Setelah menyelesaikan latihan ini, Anda diharapkan mampu:
1. Membuat JFrame dasar sebagai window utama
2. Menambahkan komponen GUI (JButton, JLabel, JTextField, JTextArea)
3. Menangani event (ActionListener, MouseListener)
4. Mengatur layout dengan Layout Manager
5. Membuat form input sederhana
6. Membuat aplikasi GUI interaktif

---

## 📋 Petunjuk Pengerjaan

1. **Buat Project Baru** di NetBeans untuk setiap latihan
2. **Ketik kode sendiri** - Jangan copy-paste!
3. **Jalankan dan test** - Pastikan GUI muncul dengan benar
4. **Eksperimen** - Ubah warna, ukuran, teks, dll
5. **Debug** - Perhatikan error message jika ada

---

## 🟢 LEVEL 1: JFrame Dasar

### Latihan 1: Window Pertama Anda

**Tujuan**: Membuat window GUI paling sederhana

**Kode**:
```java
// File: Latihan01.java
import javax.swing.JFrame;

public class Latihan01 {
    public static void main(String[] args) {
        // Membuat JFrame (window)
        JFrame frame = new JFrame("Window Pertama Saya");

        // Set ukuran window (lebar, tinggi)
        frame.setSize(400, 300);

        // Set agar program berhenti saat window ditutup
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Tampilkan window
        frame.setVisible(true);

        System.out.println("Window telah dibuat!");
    }
}
```

**Output**: Window kosong dengan judul "Window Pertama Saya" berukuran 400x300 pixel

**Tugas Eksplorasi**:
- Ubah judul window menjadi nama Anda
- Ubah ukuran window menjadi 600x400
- Tambahkan `frame.setLocationRelativeTo(null);` untuk center window

---

### Latihan 2: JFrame dengan OOP

**Tujuan**: Membuat GUI menggunakan class (lebih proper)

**Kode**:
```java
// File: Latihan02.java
import javax.swing.JFrame;

public class Latihan02 extends JFrame {

    public Latihan02() {
        // Set properties di constructor
        setTitle("Aplikasi GUI Saya");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);  // Center window
    }

    public static void main(String[] args) {
        // Membuat dan menampilkan frame
        Latihan02 frame = new Latihan02();
        frame.setVisible(true);
    }
}
```

**Output**: Window centered dengan judul "Aplikasi GUI Saya"

**Catatan Penting**: Ini adalah cara yang lebih proper - extends JFrame dan atur di constructor.

---

## 🟡 LEVEL 2: Menambahkan Komponen

### Latihan 3: JButton Pertama

**Tujuan**: Menambahkan tombol ke window

**Kode**:
```java
// File: Latihan03.java
import javax.swing.*;

public class Latihan03 extends JFrame {

    public Latihan03() {
        setTitle("Aplikasi dengan Button");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Membuat button
        JButton tombol = new JButton("Klik Saya!");

        // Menambahkan button ke frame
        add(tombol);
    }

    public static void main(String[] args) {
        Latihan03 frame = new Latihan03();
        frame.setVisible(true);
    }
}
```

**Output**: Window dengan satu tombol besar bertuliskan "Klik Saya!"

**Tugas Eksplorasi**:
- Ubah text button menjadi "Tekan Disini"
- Coba klik button (belum ada aksi)

---

### Latihan 4: JLabel dan JTextField

**Tujuan**: Membuat form input sederhana

**Kode**:
```java
// File: Latihan04.java
import javax.swing.*;
import java.awt.FlowLayout;

public class Latihan04 extends JFrame {

    public Latihan04() {
        setTitle("Form Input Nama");
        setSize(350, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Set layout
        setLayout(new FlowLayout());

        // Membuat komponen
        JLabel label = new JLabel("Nama: ");
        JTextField textField = new JTextField(20);  // 20 kolom
        JButton button = new JButton("Submit");

        // Menambahkan ke frame
        add(label);
        add(textField);
        add(button);
    }

    public static void main(String[] args) {
        Latihan04 frame = new Latihan04();
        frame.setVisible(true);
    }
}
```

**Output**: Form dengan label "Nama:", text field, dan button "Submit"

**Catatan**: `FlowLayout` membuat komponen berurutan dari kiri ke kanan.

---

## 🟠 LEVEL 3: Event Handling

### Latihan 5: Button dengan ActionListener

**Tujuan**: Membuat button yang merespons klik

**Kode**:
```java
// File: Latihan05.java
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Latihan05 extends JFrame {

    public Latihan05() {
        setTitle("Button dengan Event");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        JButton button = new JButton("Klik Saya!");

        // Menambahkan ActionListener
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Tombol diklik!");
            }
        });

        add(button);
    }

    public static void main(String[] args) {
        Latihan05 frame = new Latihan05();
        frame.setVisible(true);
    }
}
```

**Output**: Saat button diklik, muncul dialog box "Tombol diklik!"

**Penjelasan**: `ActionListener` menangani event klik button.

---

### Latihan 6: Menampilkan Input User

**Tujuan**: Membaca input dari text field dan menampilkannya

**Kode**:
```java
// File: Latihan06.java
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Latihan06 extends JFrame {
    private JTextField tfNama;
    private JButton btnTampilkan;

    public Latihan06() {
        setTitle("Form Sapaan");
        setSize(350, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        // Komponen
        JLabel label = new JLabel("Masukkan Nama:");
        tfNama = new JTextField(15);
        btnTampilkan = new JButton("Sapa");

        // Event handler
        btnTampilkan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = tfNama.getText();
                if (nama.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nama tidak boleh kosong!");
                } else {
                    JOptionPane.showMessageDialog(null, "Halo, " + nama + "!");
                }
            }
        });

        add(label);
        add(tfNama);
        add(btnTampilkan);
    }

    public static void main(String[] args) {
        Latihan06 frame = new Latihan06();
        frame.setVisible(true);
    }
}
```

**Output**: User input nama, klik "Sapa", muncul "Halo, [nama]!"

**Fitur Baru**: Validasi input kosong

---

### Latihan 7: Kalkulator Sederhana

**Tujuan**: Membuat kalkulator penjumlahan

**Kode**:
```java
// File: Latihan07.java
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Latihan07 extends JFrame {
    private JTextField tfAngka1, tfAngka2, tfHasil;

    public Latihan07() {
        setTitle("Kalkulator Sederhana");
        setSize(250, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        // Komponen
        JLabel lbl1 = new JLabel("Angka 1:");
        tfAngka1 = new JTextField(10);

        JLabel lbl2 = new JLabel("Angka 2:");
        tfAngka2 = new JTextField(10);

        JButton btnHitung = new JButton("Hitung");

        JLabel lblHasil = new JLabel("Hasil:");
        tfHasil = new JTextField(10);
        tfHasil.setEditable(false);  // Read-only

        // Event
        btnHitung.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(tfAngka1.getText());
                    double b = Double.parseDouble(tfAngka2.getText());
                    double hasil = a + b;
                    tfHasil.setText(String.valueOf(hasil));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Masukkan angka yang valid!");
                }
            }
        });

        add(lbl1);
        add(tfAngka1);
        add(lbl2);
        add(tfAngka2);
        add(btnHitung);
        add(lblHasil);
        add(tfHasil);
    }

    public static void main(String[] args) {
        Latihan07 frame = new Latihan07();
        frame.setVisible(true);
    }
}
```

**Output**: Kalkulator yang menjumlahkan dua angka

**Fitur**: Exception handling untuk input non-angka

---

## 🔴 LEVEL 4: Layout Manager

### Latihan 8: BorderLayout

**Tujuan**: Mengatur posisi komponen dengan BorderLayout

**Kode**:
```java
// File: Latihan08.java
import javax.swing.*;
import java.awt.BorderLayout;

public class Latihan08 extends JFrame {

    public Latihan08() {
        setTitle("BorderLayout Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // BorderLayout adalah default untuk JFrame
        setLayout(new BorderLayout());

        // Menambahkan button di berbagai posisi
        add(new JButton("NORTH"), BorderLayout.NORTH);
        add(new JButton("SOUTH"), BorderLayout.SOUTH);
        add(new JButton("EAST"), BorderLayout.EAST);
        add(new JButton("WEST"), BorderLayout.WEST);
        add(new JButton("CENTER"), BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        Latihan08 frame = new Latihan08();
        frame.setVisible(true);
    }
}
```

**Output**: 5 button di posisi: atas, bawah, kiri, kanan, tengah

**Catatan**: BorderLayout membagi area menjadi 5 region.

---

### Latihan 9: JTextArea dengan JScrollPane

**Tujuan**: Membuat area teks besar dengan scrollbar

**Kode**:
```java
// File: Latihan09.java
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Latihan09 extends JFrame {
    private JTextArea textArea;
    private JTextField tfInput;

    public Latihan09() {
        setTitle("Catatan Sederhana");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // TextArea dengan scroll
        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Panel bawah untuk input
        JPanel panelBawah = new JPanel();
        tfInput = new JTextField(20);
        JButton btnTambah = new JButton("Tambah");

        btnTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String teks = tfInput.getText();
                if (!teks.isEmpty()) {
                    textArea.append(teks + "\n");
                    tfInput.setText("");  // Clear input
                }
            }
        });

        panelBawah.add(tfInput);
        panelBawah.add(btnTambah);

        add(scrollPane, BorderLayout.CENTER);
        add(panelBawah, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        Latihan09 frame = new Latihan09();
        frame.setVisible(true);
    }
}
```

**Output**: Aplikasi catatan sederhana - input teks dan tambahkan ke area besar

**Fitur**: JScrollPane untuk scrollbar otomatis

---

### Latihan 10: Form Registrasi Lengkap

**Tujuan**: Membuat form dengan multiple komponen

**Kode**:
```java
// File: Latihan10.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Latihan10 extends JFrame {
    private JTextField tfNama, tfEmail;
    private JComboBox<String> cbJurusan;
    private JRadioButton rbPria, rbWanita;
    private JCheckBox chkSetuju;

    public Latihan10() {
        setTitle("Form Registrasi Mahasiswa");
        setSize(350, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(7, 2, 10, 10));

        // Nama
        add(new JLabel("Nama:"));
        tfNama = new JTextField();
        add(tfNama);

        // Email
        add(new JLabel("Email:"));
        tfEmail = new JTextField();
        add(tfEmail);

        // Jurusan
        add(new JLabel("Jurusan:"));
        String[] jurusan = {"Informatika", "Sistem Informasi", "Teknik Komputer"};
        cbJurusan = new JComboBox<>(jurusan);
        add(cbJurusan);

        // Jenis Kelamin
        add(new JLabel("Jenis Kelamin:"));
        JPanel panelGender = new JPanel(new FlowLayout(FlowLayout.LEFT));
        rbPria = new JRadioButton("Pria");
        rbWanita = new JRadioButton("Wanita");
        ButtonGroup bgGender = new ButtonGroup();
        bgGender.add(rbPria);
        bgGender.add(rbWanita);
        panelGender.add(rbPria);
        panelGender.add(rbWanita);
        add(panelGender);

        // Checkbox
        add(new JLabel(""));
        chkSetuju = new JCheckBox("Saya setuju dengan syarat dan ketentuan");
        add(chkSetuju);

        // Button
        add(new JLabel(""));
        JButton btnDaftar = new JButton("Daftar");
        btnDaftar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prosesRegistrasi();
            }
        });
        add(btnDaftar);
    }

    private void prosesRegistrasi() {
        // Validasi
        if (tfNama.getText().isEmpty() || tfEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nama dan Email harus diisi!");
            return;
        }

        if (!rbPria.isSelected() && !rbWanita.isSelected()) {
            JOptionPane.showMessageDialog(this, "Pilih jenis kelamin!");
            return;
        }

        if (!chkSetuju.isSelected()) {
            JOptionPane.showMessageDialog(this, "Anda harus menyetujui syarat dan ketentuan!");
            return;
        }

        // Tampilkan data
        String gender = rbPria.isSelected() ? "Pria" : "Wanita";
        String pesan = "=== DATA REGISTRASI ===\n" +
                       "Nama: " + tfNama.getText() + "\n" +
                       "Email: " + tfEmail.getText() + "\n" +
                       "Jurusan: " + cbJurusan.getSelectedItem() + "\n" +
                       "Jenis Kelamin: " + gender;

        JOptionPane.showMessageDialog(this, pesan, "Registrasi Berhasil", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        Latihan10 frame = new Latihan10();
        frame.setVisible(true);
    }
}
```

**Output**: Form registrasi lengkap dengan:
- TextField (Nama, Email)
- JComboBox (Jurusan)
- JRadioButton (Jenis Kelamin)
- JCheckBox (Persetujuan)
- Validasi lengkap

**Fitur**:
- GridLayout untuk form rapi
- ButtonGroup untuk radio button
- Validasi input lengkap

---

## ✅ Checklist Penyelesaian

- [ ] Latihan 1: Window Pertama
- [ ] Latihan 2: JFrame dengan OOP
- [ ] Latihan 3: JButton Pertama
- [ ] Latihan 4: JLabel dan JTextField
- [ ] Latihan 5: Button dengan ActionListener
- [ ] Latihan 6: Menampilkan Input User
- [ ] Latihan 7: Kalkulator Sederhana
- [ ] Latihan 8: BorderLayout
- [ ] Latihan 9: JTextArea dengan JScrollPane
- [ ] Latihan 10: Form Registrasi Lengkap

---

## 🎯 Rangkuman Konsep

Setelah menyelesaikan latihan dasar ini, Anda sudah memahami:

1. ✅ **JFrame** - Window utama aplikasi
2. ✅ **Komponen Dasar** - JButton, JLabel, JTextField, JTextArea
3. ✅ **Event Handling** - ActionListener untuk respons user
4. ✅ **Layout Manager** - FlowLayout, BorderLayout, GridLayout
5. ✅ **Input/Output** - Membaca input user dan menampilkan output
6. ✅ **Validasi** - Cek input sebelum diproses
7. ✅ **Advanced Components** - JComboBox, JRadioButton, JCheckBox

---

## 📚 Langkah Selanjutnya

Lanjutkan ke:
- **02_Latihan_Menengah.md** - JTable, CRUD, aplikasi lebih kompleks
- **03_Aplikasi_Utama** - Aplikasi Pengelola Tugas Kuliah lengkap

Jika ada kesulitan:
- **04_Panduan_Tambahan/01_Panduan_NetBeans_GUI_Builder.md** - Drag-and-drop GUI
- **04_Panduan_Tambahan/02_FAQ.md** - Troubleshooting

---

**Selamat Belajar GUI! Let's Create Beautiful Desktop Apps! 🖥️🚀**

*Tutorial Ke-4: GUI Desktop | STSI4201 Pemrograman Berbasis Desktop*
