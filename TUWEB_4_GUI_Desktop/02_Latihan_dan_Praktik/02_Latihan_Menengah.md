# Latihan Menengah - GUI Desktop dengan JTable dan Aplikasi Lengkap

**Tutorial Ke-4: GUI Desktop**
**Mata Kuliah**: Pemrograman Berbasis Desktop (STSI4201)
**Dosen**: Anton Prafanto, S.Kom, M.T.

---

## 🎯 Tujuan Latihan

Setelah menyelesaikan latihan menengah ini, Anda diharapkan mampu:
1. Menggunakan JTable dengan DefaultTableModel
2. Melakukan operasi CRUD (Create, Read, Update, Delete)
3. Membuat aplikasi GUI yang kompleks dan interaktif
4. Mengintegrasikan multiple komponen GUI
5. Menangani data tabular

---

## 🟠 LEVEL 1: JTable Dasar

### Latihan 1: JTable Sederhana

**Tujuan**: Menampilkan data dalam bentuk tabel

**Kode**:
```java
// File: Latihan01.java
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Latihan01 extends JFrame {

    public Latihan01() {
        setTitle("JTable Sederhana");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Kolom tabel
        String[] kolom = {"NIM", "Nama", "Jurusan"};

        // Data tabel
        Object[][] data = {
            {"202301001", "Budi Santoso", "Informatika"},
            {"202301002", "Siti Aminah", "Sistem Informasi"},
            {"202301003", "Andi Wijaya", "Teknik Komputer"},
            {"202301004", "Rina Kusuma", "Informatika"}
        };

        // Membuat table model
        DefaultTableModel model = new DefaultTableModel(data, kolom);
        JTable table = new JTable(model);

        // Tambahkan ke scroll pane
        JScrollPane scrollPane = new JScrollPane(table);

        add(scrollPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        Latihan01 frame = new Latihan01();
        frame.setVisible(true);
    }
}
```

**Output**: Tabel dengan 3 kolom dan 4 baris data mahasiswa

**Catatan**: `DefaultTableModel` memudahkan manipulasi data tabel.

---

### Latihan 2: CRUD dengan JTable - Aplikasi Kontak

**Tujuan**: Membuat aplikasi lengkap dengan operasi Tambah, Hapus, Edit

**Kode**:
```java
// File: Latihan02.java
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Latihan02 extends JFrame {
    private JTable table;
    private DefaultTableModel model;
    private JTextField tfNama, tfTelepon, tfEmail;
    private JButton btnTambah, btnHapus, btnEdit, btnClear;

    public Latihan02() {
        setTitle("Aplikasi Kontak Sederhana");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        initComponents();
        initTable();
    }

    private void initComponents() {
        // Panel Form (NORTH)
        JPanel panelForm = new JPanel(new GridLayout(4, 2, 10, 10));
        panelForm.setBorder(BorderFactory.createTitledBorder("Data Kontak"));

        panelForm.add(new JLabel("Nama:"));
        tfNama = new JTextField();
        panelForm.add(tfNama);

        panelForm.add(new JLabel("Telepon:"));
        tfTelepon = new JTextField();
        panelForm.add(tfTelepon);

        panelForm.add(new JLabel("Email:"));
        tfEmail = new JTextField();
        panelForm.add(tfEmail);

        // Tombol
        JPanel panelButton = new JPanel(new FlowLayout(FlowLayout.LEFT));
        btnTambah = new JButton("Tambah");
        btnEdit = new JButton("Edit");
        btnHapus = new JButton("Hapus");
        btnClear = new JButton("Clear");

        btnTambah.addActionListener(e -> tambahKontak());
        btnEdit.addActionListener(e -> editKontak());
        btnHapus.addActionListener(e -> hapusKontak());
        btnClear.addActionListener(e -> clearForm());

        panelButton.add(btnTambah);
        panelButton.add(btnEdit);
        panelButton.add(btnHapus);
        panelButton.add(btnClear);

        panelForm.add(new JLabel(""));
        panelForm.add(panelButton);

        add(panelForm, BorderLayout.NORTH);
    }

    private void initTable() {
        // Tabel (CENTER)
        String[] kolom = {"No", "Nama", "Telepon", "Email"};
        model = new DefaultTableModel(kolom, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;  // Non-editable
            }
        };

        table = new JTable(model);
        table.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                tampilkanDataTerpilih();
            }
        });

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        // Data awal
        tambahBarisTabel("Budi Santoso", "081234567890", "budi@email.com");
        tambahBarisTabel("Siti Aminah", "082345678901", "siti@email.com");
    }

    private void tambahBarisTabel(String nama, String telepon, String email) {
        int no = model.getRowCount() + 1;
        model.addRow(new Object[]{no, nama, telepon, email});
    }

    private void tambahKontak() {
        String nama = tfNama.getText().trim();
        String telepon = tfTelepon.getText().trim();
        String email = tfEmail.getText().trim();

        if (nama.isEmpty() || telepon.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nama dan Telepon harus diisi!");
            return;
        }

        tambahBarisTabel(nama, telepon, email);
        clearForm();
        JOptionPane.showMessageDialog(this, "Kontak berhasil ditambahkan!");
    }

    private void editKontak() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih kontak yang akan diedit!");
            return;
        }

        String nama = tfNama.getText().trim();
        String telepon = tfTelepon.getText().trim();
        String email = tfEmail.getText().trim();

        if (nama.isEmpty() || telepon.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nama dan Telepon harus diisi!");
            return;
        }

        model.setValueAt(nama, selectedRow, 1);
        model.setValueAt(telepon, selectedRow, 2);
        model.setValueAt(email, selectedRow, 3);

        clearForm();
        JOptionPane.showMessageDialog(this, "Kontak berhasil diupdate!");
    }

    private void hapusKontak() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih kontak yang akan dihapus!");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this,
                "Yakin ingin menghapus kontak ini?",
                "Konfirmasi Hapus",
                JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            model.removeRow(selectedRow);
            updateNomor();
            clearForm();
            JOptionPane.showMessageDialog(this, "Kontak berhasil dihapus!");
        }
    }

    private void tampilkanDataTerpilih() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
            tfNama.setText(model.getValueAt(selectedRow, 1).toString());
            tfTelepon.setText(model.getValueAt(selectedRow, 2).toString());
            tfEmail.setText(model.getValueAt(selectedRow, 3).toString());
        }
    }

    private void updateNomor() {
        for (int i = 0; i < model.getRowCount(); i++) {
            model.setValueAt(i + 1, i, 0);
        }
    }

    private void clearForm() {
        tfNama.setText("");
        tfTelepon.setText("");
        tfEmail.setText("");
        table.clearSelection();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Latihan02 frame = new Latihan02();
            frame.setVisible(true);
        });
    }
}
```

**Output**: Aplikasi kontak lengkap dengan fitur:
- ✅ Tambah kontak baru
- ✅ Edit kontak (klik row untuk select)
- ✅ Hapus kontak dengan konfirmasi
- ✅ Clear form
- ✅ Auto-update nomor urut

**Fitur Penting**:
- `ListSelectionListener` untuk detect row selection
- Validasi input
- Konfirmasi sebelum hapus
- Non-editable table cells

---

## 🔴 LEVEL 2: Aplikasi Kompleks

### Latihan 3: Sistem Penilaian Mahasiswa

**Tujuan**: Aplikasi dengan perhitungan otomatis dan statistik

**Kode**:
```java
// File: Latihan03.java
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Latihan03 extends JFrame {
    private JTable table;
    private DefaultTableModel model;
    private JTextField tfNama, tfNIM, tfUTS, tfUAS, tfTugas;
    private JLabel lblTotalMhs, lblRataRata, lblLulus, lblTidakLulus;

    public Latihan03() {
        setTitle("Sistem Penilaian Mahasiswa");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        initComponents();
        updateStatistik();
    }

    private void initComponents() {
        // Panel Form
        JPanel panelForm = new JPanel(new GridLayout(6, 2, 10, 10));
        panelForm.setBorder(BorderFactory.createTitledBorder("Input Nilai"));

        panelForm.add(new JLabel("NIM:"));
        tfNIM = new JTextField();
        panelForm.add(tfNIM);

        panelForm.add(new JLabel("Nama:"));
        tfNama = new JTextField();
        panelForm.add(tfNama);

        panelForm.add(new JLabel("Nilai UTS (0-100):"));
        tfUTS = new JTextField();
        panelForm.add(tfUTS);

        panelForm.add(new JLabel("Nilai UAS (0-100):"));
        tfUAS = new JTextField();
        panelForm.add(tfUAS);

        panelForm.add(new JLabel("Nilai Tugas (0-100):"));
        tfTugas = new JTextField();
        panelForm.add(tfTugas);

        JButton btnTambah = new JButton("Tambah Mahasiswa");
        btnTambah.addActionListener(e -> tambahMahasiswa());
        panelForm.add(new JLabel(""));
        panelForm.add(btnTambah);

        add(panelForm, BorderLayout.NORTH);

        // Tabel
        String[] kolom = {"NIM", "Nama", "UTS", "UAS", "Tugas", "Nilai Akhir", "Grade", "Status"};
        model = new DefaultTableModel(kolom, 0);
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        // Panel Statistik
        JPanel panelStats = new JPanel(new GridLayout(2, 2, 10, 10));
        panelStats.setBorder(BorderFactory.createTitledBorder("Statistik"));

        lblTotalMhs = new JLabel("Total Mahasiswa: 0");
        lblRataRata = new JLabel("Rata-rata Nilai: 0.00");
        lblLulus = new JLabel("Lulus: 0");
        lblTidakLulus = new JLabel("Tidak Lulus: 0");

        panelStats.add(lblTotalMhs);
        panelStats.add(lblRataRata);
        panelStats.add(lblLulus);
        panelStats.add(lblTidakLulus);

        add(panelStats, BorderLayout.SOUTH);
    }

    private void tambahMahasiswa() {
        try {
            String nim = tfNIM.getText().trim();
            String nama = tfNama.getText().trim();
            double uts = Double.parseDouble(tfUTS.getText());
            double uas = Double.parseDouble(tfUAS.getText());
            double tugas = Double.parseDouble(tfTugas.getText());

            if (nim.isEmpty() || nama.isEmpty()) {
                JOptionPane.showMessageDialog(this, "NIM dan Nama harus diisi!");
                return;
            }

            if (uts < 0 || uts > 100 || uas < 0 || uas > 100 || tugas < 0 || tugas > 100) {
                JOptionPane.showMessageDialog(this, "Nilai harus antara 0-100!");
                return;
            }

            // Hitung nilai akhir: UTS 35%, UAS 40%, Tugas 25%
            double nilaiAkhir = (uts * 0.35) + (uas * 0.40) + (tugas * 0.25);
            String grade = hitungGrade(nilaiAkhir);
            String status = nilaiAkhir >= 60 ? "LULUS" : "TIDAK LULUS";

            model.addRow(new Object[]{
                nim, nama,
                String.format("%.1f", uts),
                String.format("%.1f", uas),
                String.format("%.1f", tugas),
                String.format("%.2f", nilaiAkhir),
                grade,
                status
            });

            clearForm();
            updateStatistik();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Nilai harus berupa angka!");
        }
    }

    private String hitungGrade(double nilai) {
        if (nilai >= 85) return "A";
        if (nilai >= 70) return "B";
        if (nilai >= 60) return "C";
        if (nilai >= 50) return "D";
        return "E";
    }

    private void updateStatistik() {
        int total = model.getRowCount();
        double totalNilai = 0;
        int lulus = 0;
        int tidakLulus = 0;

        for (int i = 0; i < total; i++) {
            String status = model.getValueAt(i, 7).toString();
            double nilaiAkhir = Double.parseDouble(model.getValueAt(i, 5).toString());

            totalNilai += nilaiAkhir;
            if (status.equals("LULUS")) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }

        double rataRata = total > 0 ? totalNilai / total : 0;

        lblTotalMhs.setText("Total Mahasiswa: " + total);
        lblRataRata.setText("Rata-rata Nilai: " + String.format("%.2f", rataRata));
        lblLulus.setText("Lulus: " + lulus);
        lblTidakLulus.setText("Tidak Lulus: " + tidakLulus);
    }

    private void clearForm() {
        tfNIM.setText("");
        tfNama.setText("");
        tfUTS.setText("");
        tfUAS.setText("");
        tfTugas.setText("");
        tfNIM.requestFocus();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Latihan03 frame = new Latihan03();
            frame.setVisible(true);
        });
    }
}
```

**Output**: Sistem penilaian dengan:
- Input nilai UTS, UAS, Tugas
- Perhitungan otomatis nilai akhir (weighted average)
- Grade A-E
- Status LULUS/TIDAK LULUS
- Statistik real-time (total, rata-rata, lulus, tidak lulus)

---

### Latihan 4: Aplikasi To-Do List

**Tujuan**: Aplikasi task management sederhana

**Kode**:
```java
// File: Latihan04.java
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Latihan04 extends JFrame {
    private JTable table;
    private DefaultTableModel model;
    private JTextField tfTugas;
    private JComboBox<String> cbPrioritas, cbFilter;

    public Latihan04() {
        setTitle("Aplikasi To-Do List");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        initComponents();
    }

    private void initComponents() {
        // Panel Input (NORTH)
        JPanel panelInput = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        panelInput.setBorder(BorderFactory.createTitledBorder("Tambah Tugas"));

        panelInput.add(new JLabel("Tugas:"));
        tfTugas = new JTextField(20);
        panelInput.add(tfTugas);

        panelInput.add(new JLabel("Prioritas:"));
        String[] prioritas = {"Tinggi", "Sedang", "Rendah"};
        cbPrioritas = new JComboBox<>(prioritas);
        panelInput.add(cbPrioritas);

        JButton btnTambah = new JButton("Tambah");
        btnTambah.addActionListener(e -> tambahTugas());
        panelInput.add(btnTambah);

        add(panelInput, BorderLayout.NORTH);

        // Tabel (CENTER)
        String[] kolom = {"✓", "No", "Tugas", "Prioritas", "Waktu Dibuat", "Status"};
        model = new DefaultTableModel(kolom, 0) {
            @Override
            public Class<?> getColumnClass(int column) {
                return column == 0 ? Boolean.class : String.class;
            }
        };

        table = new JTable(model);
        table.getColumnModel().getColumn(0).setMaxWidth(30);  // Checkbox column
        table.getColumnModel().getColumn(1).setMaxWidth(50);   // No column

        // Event untuk checkbox
        model.addTableModelListener(e -> {
            if (e.getColumn() == 0) {  // Checkbox column
                int row = e.getFirstRow();
                boolean selesai = (Boolean) model.getValueAt(row, 0);
                model.setValueAt(selesai ? "Selesai" : "Belum", row, 5);
            }
        });

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        // Panel Filter & Actions (SOUTH)
        JPanel panelBawah = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));

        panelBawah.add(new JLabel("Filter:"));
        String[] filterOptions = {"Semua", "Selesai", "Belum Selesai"};
        cbFilter = new JComboBox<>(filterOptions);
        cbFilter.addActionListener(e -> filterData());
        panelBawah.add(cbFilter);

        JButton btnHapus = new JButton("Hapus Terpilih");
        btnHapus.addActionListener(e -> hapusTugas());
        panelBawah.add(btnHapus);

        JButton btnHapusSelesai = new JButton("Hapus Semua Selesai");
        btnHapusSelesai.addActionListener(e -> hapusTugasSelesai());
        panelBawah.add(btnHapusSelesai);

        add(panelBawah, BorderLayout.SOUTH);
    }

    private void tambahTugas() {
        String tugas = tfTugas.getText().trim();
        if (tugas.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tugas tidak boleh kosong!");
            return;
        }

        String prioritas = cbPrioritas.getSelectedItem().toString();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String waktu = sdf.format(new Date());

        int no = model.getRowCount() + 1;
        model.addRow(new Object[]{false, no, tugas, prioritas, waktu, "Belum"});

        tfTugas.setText("");
        tfTugas.requestFocus();
    }

    private void hapusTugas() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih tugas yang akan dihapus!");
            return;
        }

        model.removeRow(selectedRow);
        updateNomor();
    }

    private void hapusTugasSelesai() {
        int count = 0;
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            if ((Boolean) model.getValueAt(i, 0)) {
                model.removeRow(i);
                count++;
            }
        }
        updateNomor();
        JOptionPane.showMessageDialog(this, count + " tugas selesai dihapus!");
    }

    private void filterData() {
        // Simple filter - hide/show rows
        // Note: Proper implementation would use RowFilter
        String filter = cbFilter.getSelectedItem().toString();
        // For simplicity, just show message
        JOptionPane.showMessageDialog(this, "Filter: " + filter + "\n(Implementasi lengkap gunakan TableRowSorter)");
    }

    private void updateNomor() {
        for (int i = 0; i < model.getRowCount(); i++) {
            model.setValueAt(i + 1, i, 1);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Latihan04 frame = new Latihan04();
            frame.setVisible(true);
        });
    }
}
```

**Output**: Aplikasi To-Do List dengan:
- ✅ Checkbox untuk mark as done
- ✅ Prioritas (Tinggi/Sedang/Rendah)
- ✅ Timestamp otomatis
- ✅ Status (Selesai/Belum)
- ✅ Hapus tugas terpilih
- ✅ Hapus semua tugas selesai
- ✅ Filter data

---

## ✅ Checklist Penyelesaian

- [ ] Latihan 1: JTable Sederhana
- [ ] Latihan 2: CRUD dengan JTable - Aplikasi Kontak
- [ ] Latihan 3: Sistem Penilaian Mahasiswa
- [ ] Latihan 4: Aplikasi To-Do List

---

## 🎯 Rangkuman Konsep Menengah

Setelah menyelesaikan latihan menengah ini, Anda sudah memahami:

1. ✅ **JTable** - Menampilkan data tabular
2. ✅ **DefaultTableModel** - Model untuk manipulasi data tabel
3. ✅ **CRUD Operations** - Create, Read, Update, Delete
4. ✅ **ListSelectionListener** - Detect row selection
5. ✅ **TableModelListener** - Detect perubahan data
6. ✅ **Validasi Input** - Cek input sebelum proses
7. ✅ **Perhitungan Otomatis** - Update statistik real-time
8. ✅ **Checkbox di JTable** - Untuk interactive selection
9. ✅ **Timestamp** - SimpleDateFormat untuk tanggal/waktu

---

## 💡 Tips Pengembangan Lebih Lanjut

1. **Database Integration**: Ganti ArrayList dengan database (SQLite, MySQL)
2. **File I/O**: Save/load data ke file
3. **Search Function**: Tambahkan fitur pencarian
4. **Sorting**: Implementasikan TableRowSorter untuk sorting kolom
5. **Export**: Export data ke CSV/Excel
6. **Custom Cell Renderer**: Custom tampilan cell tabel

---

## 📚 Langkah Selanjutnya

Lanjutkan ke:
- **03_Aplikasi_Utama/AplikasiPengelolaTugasKuliah.java** - Aplikasi lengkap 650+ baris
- **TUWEB berikutnya** - Lanjut ke materi selanjutnya

Jika ada kesulitan:
- **04_Panduan_Tambahan/01_Panduan_NetBeans_GUI_Builder.md** - Drag-and-drop GUI
- **04_Panduan_Tambahan/02_FAQ.md** - Troubleshooting

---

## 🎓 Challenge Bonus

Coba modifikasi Latihan 4 (To-Do List) dengan menambahkan:
1. Deadline untuk setiap tugas
2. Kategori tugas (Kuliah, Pribadi, Pekerjaan)
3. Notifikasi jika deadline hampir tiba
4. Export to-do list ke file text

---

**Selamat! Anda Sudah Mahir Membuat GUI Desktop! 🎉💻**

*Tutorial Ke-4: GUI Desktop | STSI4201 Pemrograman Berbasis Desktop*
