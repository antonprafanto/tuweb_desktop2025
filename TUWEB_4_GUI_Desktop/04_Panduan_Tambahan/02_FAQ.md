# FAQ (Frequently Asked Questions) - GUI Desktop dengan Java Swing

**Tutorial Ke-4: GUI Desktop**
**Mata Kuliah**: Pemrograman Berbasis Desktop (STSI4201)
**Dosen**: Anton Prafanto, S.Kom, M.T.

---

## 📋 Daftar Kategori

1. [Komponen Dasar](#komponen-dasar) (Q1-Q5)
2. [Event Handling](#event-handling) (Q6-Q10)
3. [Layout Manager](#layout-manager) (Q11-Q15)
4. [JTable](#jtable) (Q16-Q20)
5. [Troubleshooting](#troubleshooting) (Q21-Q25)

---

## 🔵 KOMPONEN DASAR

### Q1: Apa perbedaan JFrame, JPanel, dan JDialog?

**Jawaban**:

| Komponen | Fungsi | Kapan Digunakan |
|----------|--------|-----------------|
| **JFrame** | Window utama aplikasi | Main window, top-level container |
| **JPanel** | Container untuk komponen lain | Grouping komponen, area dalam JFrame |
| **JDialog** | Pop-up window | Dialog box, form input temporary |

**Contoh**:
```java
// JFrame - Window utama
JFrame frame = new JFrame("Aplikasi");

// JPanel - Container di dalam JFrame
JPanel panel = new JPanel();
frame.add(panel);

// JDialog - Pop-up
JDialog dialog = new JDialog(frame, "Dialog Title", true);
```

---

### Q2: Kenapa GUI saya tidak muncul / window kosong?

**Jawaban**:

**Penyebab Umum**:
1. Lupa `setVisible(true)`
2. Lupa `add()` komponen ke frame
3. Ukuran frame terlalu kecil

**Solusi**:
```java
// ❌ SALAH - GUI tidak muncul
JFrame frame = new JFrame();
frame.setSize(400, 300);
// Lupa setVisible!

// ✅ BENAR
JFrame frame = new JFrame();
frame.setSize(400, 300);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);  // ← PENTING!

// Jika komponen tidak muncul
JButton button = new JButton("Test");
frame.add(button);  // ← Jangan lupa add!
frame.setVisible(true);
```

---

### Q3: Bagaimana cara mengubah warna background dan foreground?

**Jawaban**:

```java
// Background (warna latar)
button.setBackground(Color.BLUE);
panel.setBackground(new Color(255, 200, 100));  // RGB

// Foreground (warna teks)
label.setForeground(Color.RED);
button.setForeground(new Color(0, 128, 0));

// Custom Color
Color myColor = new Color(123, 45, 67);
component.setBackground(myColor);
```

**Warna Umum**:
- `Color.RED`, `Color.BLUE`, `Color.GREEN`
- `Color.BLACK`, `Color.WHITE`, `Color.GRAY`
- `Color.YELLOW`, `Color.ORANGE`, `Color.PINK`

---

### Q4: Bagaimana cara mengubah font?

**Jawaban**:

```java
// Font(nama, style, size)
Font font = new Font("Arial", Font.BOLD, 16);
label.setFont(font);

// Style options
Font.PLAIN   // Regular
Font.BOLD    // Tebal
Font.ITALIC  // Miring
Font.BOLD | Font.ITALIC  // Tebal + Miring

// Contoh lengkap
JLabel judul = new JLabel("JUDUL BESAR");
judul.setFont(new Font("Verdana", Font.BOLD, 24));
judul.setForeground(Color.BLUE);
```

---

### Q5: Bagaimana cara disable/enable komponen?

**Jawaban**:

```java
// Disable (komponen tidak bisa diinteraksi)
button.setEnabled(false);
textField.setEnabled(false);

// Enable kembali
button.setEnabled(true);

// Contoh use case: disable button saat proses
btnSimpan.setEnabled(false);  // Disable dulu
// ... proses save ...
btnSimpan.setEnabled(true);   // Enable kembali

// Cek status
if (button.isEnabled()) {
    System.out.println("Button aktif");
}
```

---

## 🟢 EVENT HANDLING

### Q6: Apa itu Event dan EventListener?

**Jawaban**:

**Event** = Aksi yang dilakukan user (klik button, ketik text, dll)
**EventListener** = Object yang "mendengarkan" dan merespons event

**Jenis Event Umum**:
- `ActionEvent` - Button click, Enter di text field
- `MouseEvent` - Click, hover, drag mouse
- `KeyEvent` - Keyboard input
- `WindowEvent` - Open, close, minimize window

**Contoh**:
```java
// ActionListener untuk button click
button.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button diklik!");
    }
});
```

---

### Q7: Bagaimana cara menggunakan Lambda Expression untuk event?

**Jawaban**:

Lambda expression membuat kode lebih ringkas (Java 8+).

**Cara Lama (Anonymous Class)**:
```java
button.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Klik!");
    }
});
```

**Cara Baru (Lambda)**:
```java
button.addActionListener(e -> {
    System.out.println("Klik!");
});

// Atau lebih ringkas untuk satu baris
button.addActionListener(e -> System.out.println("Klik!"));
```

**Multi-line Lambda**:
```java
button.addActionListener(e -> {
    String nama = textField.getText();
    if (!nama.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Halo, " + nama);
    }
});
```

---

### Q8: Bagaimana cara mendapatkan text dari JTextField saat button diklik?

**Jawaban**:

```java
// Deklarasikan text field sebagai instance variable
private JTextField tfNama;

// Di constructor/init
tfNama = new JTextField(20);
JButton btnSubmit = new JButton("Submit");

btnSubmit.addActionListener(e -> {
    String nama = tfNama.getText();  // Ambil text
    System.out.println("Nama: " + nama);

    // Atau tampilkan di dialog
    JOptionPane.showMessageDialog(null, "Nama Anda: " + nama);
});
```

**Method Penting**:
- `getText()` - Ambil text dari field
- `setText(String)` - Set text ke field
- `setText("")` - Clear field

---

### Q9: Bagaimana cara mendeteksi mouse click pada komponen?

**Jawaban**:

```java
// MouseListener
panel.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        System.out.println("Klik di koordinat: " + x + ", " + y);

        // Cek button mana yang diklik
        if (e.getButton() == MouseEvent.BUTTON1) {
            System.out.println("Klik kiri");
        } else if (e.getButton() == MouseEvent.BUTTON3) {
            System.out.println("Klik kanan");
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse masuk area");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse keluar area");
    }
});
```

---

### Q10: Bagaimana cara menangani Enter key di JTextField?

**Jawaban**:

```java
textField.addActionListener(e -> {
    // Kode ini jalan saat user tekan Enter
    String input = textField.getText();
    System.out.println("User input: " + input);
});

// Atau dengan KeyListener untuk key apapun
textField.addKeyListener(new KeyAdapter() {
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            System.out.println("Enter ditekan!");
        }
    }
});
```

---

## 🟡 LAYOUT MANAGER

### Q11: Apa perbedaan FlowLayout, BorderLayout, dan GridLayout?

**Jawaban**:

| Layout | Cara Kerja | Kapan Digunakan |
|--------|------------|-----------------|
| **FlowLayout** | Komponen berurutan kiri→kanan, seperti text | Form sederhana, toolbar |
| **BorderLayout** | 5 region: North, South, East, West, Center | Layout utama window |
| **GridLayout** | Grid rows x columns yang sama besar | Form input, calculator |
| **BoxLayout** | Vertikal atau horizontal, flexible | Sidebar, menu |
| **GroupLayout** | Complex alignment (default NetBeans GUI Builder) | Form kompleks |

**Visualisasi**:
```
FlowLayout:          BorderLayout:          GridLayout (2x3):
[A][B][C][D]         ┌─────NORTH────┐       ┌───┬───┬───┐
[E][F][G]            │WEST│CENTER│EAST      │ A │ B │ C │
                     └─────SOUTH────┘       ├───┼───┼───┤
                                            │ D │ E │ F │
                                            └───┴───┴───┘
```

---

### Q12: Bagaimana cara menggunakan layout manager?

**Jawaban**:

```java
// FlowLayout
JPanel panel = new JPanel(new FlowLayout());
panel.add(new JButton("A"));
panel.add(new JButton("B"));

// BorderLayout
JFrame frame = new JFrame();
frame.setLayout(new BorderLayout());
frame.add(new JButton("Top"), BorderLayout.NORTH);
frame.add(new JButton("Center"), BorderLayout.CENTER);

// GridLayout (2 rows, 3 columns)
JPanel panel = new JPanel(new GridLayout(2, 3));
for (int i = 1; i <= 6; i++) {
    panel.add(new JButton("" + i));
}

// BoxLayout (vertical)
JPanel panel = new JPanel();
panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
```

---

### Q13: Kenapa komponen saya overlap atau tidak terlihat dengan baik?

**Jawaban**:

**Penyebab**:
1. Menggunakan `null` layout tanpa set bounds
2. Layout manager tidak sesuai
3. Lupa `pack()` atau `setSize()`

**Solusi**:

```java
// ❌ SALAH - null layout tanpa setBounds
JFrame frame = new JFrame();
frame.setLayout(null);  // null layout
JButton btn = new JButton("Test");
frame.add(btn);  // Tidak akan terlihat!

// ✅ BENAR 1 - null layout dengan setBounds
frame.setLayout(null);
JButton btn = new JButton("Test");
btn.setBounds(50, 50, 100, 30);  // x, y, width, height
frame.add(btn);

// ✅ BENAR 2 - Gunakan layout manager
frame.setLayout(new FlowLayout());
frame.add(new JButton("Test"));

// Call pack() atau setSize()
frame.pack();  // Auto-size berdasarkan komponen
// ATAU
frame.setSize(400, 300);  // Set manual
```

---

### Q14: Bagaimana cara membuat space/gap antar komponen?

**Jawaban**:

```java
// FlowLayout dengan gap
FlowLayout layout = new FlowLayout(FlowLayout.LEFT, 10, 10);  // hgap, vgap
panel.setLayout(layout);

// GridLayout dengan gap
GridLayout layout = new GridLayout(3, 2, 10, 10);  // rows, cols, hgap, vgap

// Border dengan gap
setLayout(new BorderLayout(10, 10));  // hgap, vgap

// Atau gunakan EmptyBorder
panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));  // top, left, bottom, right
```

---

### Q15: Bagaimana cara center window di layar?

**Jawaban**:

```java
// Method 1: setLocationRelativeTo(null)
frame.setLocationRelativeTo(null);  // ← Paling mudah!

// Method 2: Manual calculation
Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
int x = (screenSize.width - frame.getWidth()) / 2;
int y = (screenSize.height - frame.getHeight()) / 2;
frame.setLocation(x, y);

// Best practice: Set size dulu, baru center
frame.setSize(400, 300);
frame.setLocationRelativeTo(null);
frame.setVisible(true);
```

---

## 🟠 JTABLE

### Q16: Bagaimana cara membuat JTable dengan data?

**Jawaban**:

```java
// Cara 1: Array 2D
String[] kolom = {"Nama", "Umur", "Kota"};
Object[][] data = {
    {"Budi", 25, "Jakarta"},
    {"Siti", 23, "Bandung"},
    {"Andi", 27, "Surabaya"}
};
JTable table = new JTable(data, kolom);

// Cara 2: DefaultTableModel (lebih flexible)
String[] kolom = {"Nama", "Umur", "Kota"};
DefaultTableModel model = new DefaultTableModel(kolom, 0);
model.addRow(new Object[]{"Budi", 25, "Jakarta"});
model.addRow(new Object[]{"Siti", 23, "Bandung"});

JTable table = new JTable(model);

// Tambahkan scroll
JScrollPane scrollPane = new JScrollPane(table);
frame.add(scrollPane);
```

---

### Q17: Bagaimana cara menambah dan menghapus row di JTable?

**Jawaban**:

```java
// Ambil model
DefaultTableModel model = (DefaultTableModel) table.getModel();

// Tambah row
model.addRow(new Object[]{"Nama Baru", 30, "Semarang"});

// Tambah row di index tertentu
model.insertRow(0, new Object[]{"Di Atas", 20, "Jogja"});

// Hapus row
int selectedRow = table.getSelectedRow();
if (selectedRow != -1) {
    model.removeRow(selectedRow);
}

// Hapus semua row
model.setRowCount(0);

// Get jumlah row
int jumlah = model.getRowCount();
```

---

### Q18: Bagaimana cara membaca data dari row yang dipilih?

**Jawaban**:

```java
int selectedRow = table.getSelectedRow();

if (selectedRow == -1) {
    JOptionPane.showMessageDialog(null, "Pilih row terlebih dahulu!");
    return;
}

// Ambil data per column
DefaultTableModel model = (DefaultTableModel) table.getModel();
String nama = model.getValueAt(selectedRow, 0).toString();
int umur = Integer.parseInt(model.getValueAt(selectedRow, 1).toString());
String kota = model.getValueAt(selectedRow, 2).toString();

System.out.println("Nama: " + nama + ", Umur: " + umur + ", Kota: " + kota);
```

---

### Q19: Bagaimana cara edit cell di JTable?

**Jawaban**:

```java
// Set value di cell tertentu
model.setValueAt("Nilai Baru", rowIndex, columnIndex);

// Contoh: Update nama di row 0
model.setValueAt("Budi Santoso", 0, 0);

// Membuat table non-editable
DefaultTableModel model = new DefaultTableModel(kolom, 0) {
    @Override
    public boolean isCellEditable(int row, int column) {
        return false;  // Semua cell tidak bisa diedit
    }
};

// Atau hanya kolom tertentu yang editable
@Override
public boolean isCellEditable(int row, int column) {
    return column != 0;  // Kolom 0 tidak editable, lainnya editable
}
```

---

### Q20: Bagaimana cara menambahkan checkbox di JTable?

**Jawaban**:

```java
// Kolom pertama adalah Boolean untuk checkbox
String[] kolom = {"Select", "Nama", "Status"};
DefaultTableModel model = new DefaultTableModel(kolom, 0) {
    @Override
    public Class<?> getColumnClass(int column) {
        if (column == 0) {
            return Boolean.class;  // Kolom 0 = checkbox
        }
        return String.class;
    }
};

// Tambah data
model.addRow(new Object[]{false, "Budi", "Aktif"});
model.addRow(new Object[]{true, "Siti", "Nonaktif"});

JTable table = new JTable(model);

// Cek checkbox value
Boolean checked = (Boolean) model.getValueAt(row, 0);
if (checked) {
    System.out.println("Row checked!");
}
```

---

## 🔴 TROUBLESHOOTING

### Q21: Error: "Exception in thread 'main' java.lang.NullPointerException"

**Penyebab**:
- Komponen belum diinisialisasi
- Akses variable yang null

**Solusi**:
```java
// ❌ SALAH
private JTextField tfNama;

btnClick.addActionListener(e -> {
    String text = tfNama.getText();  // ERROR! tfNama masih null
});

// ✅ BENAR
private JTextField tfNama;

public MyFrame() {
    tfNama = new JTextField(20);  // Inisialisasi dulu!

    btnClick.addActionListener(e -> {
        String text = tfNama.getText();  // OK
    });
}
```

---

### Q22: GUI freeze saat proses lama (long-running task)

**Penyebab**:
Long-running task (misal: download, database query besar) di Event Dispatch Thread (EDT) membuat GUI freeze.

**Solusi - Gunakan SwingWorker**:
```java
btnProses.addActionListener(e -> {
    SwingWorker<Void, Void> worker = new SwingWorker<>() {
        @Override
        protected Void doInBackground() throws Exception {
            // Proses berat di sini (background thread)
            for (int i = 0; i < 1000000; i++) {
                // Simulasi proses berat
            }
            return null;
        }

        @Override
        protected void done() {
            // Setelah selesai, update GUI di sini
            JOptionPane.showMessageDialog(null, "Proses selesai!");
        }
    };

    worker.execute();  // Jalankan di background
});
```

---

### Q23: Tombol tidak bisa diklik / tidak ada respon

**Penyebab**:
1. Lupa add ActionListener
2. Button ter-disable
3. Button ter-cover komponen lain

**Solusi**:
```java
// Cek 1: Sudah ada ActionListener?
button.addActionListener(e -> {
    System.out.println("Diklik!");
});

// Cek 2: Button enabled?
System.out.println("Enabled: " + button.isEnabled());
button.setEnabled(true);

// Cek 3: Visible dan di layer paling atas?
System.out.println("Visible: " + button.isVisible());
button.setVisible(true);

// Debug: Print saat button dibuat
System.out.println("Button created: " + button);
```

---

### Q24: JOptionPane tidak muncul di depan window utama

**Solusi**:
```java
// ❌ SALAH - parent null
JOptionPane.showMessageDialog(null, "Pesan");

// ✅ BENAR - pass parent frame
JOptionPane.showMessageDialog(this, "Pesan");  // 'this' adalah JFrame

// Atau
JOptionPane.showMessageDialog(parentFrame, "Pesan");
```

---

### Q25: Aplikasi tidak berhenti saat window ditutup

**Penyebab**:
Tidak set `setDefaultCloseOperation`

**Solusi**:
```java
// ❌ SALAH - aplikasi tetap jalan di background
JFrame frame = new JFrame();
// Lupa set close operation

// ✅ BENAR
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

// Options:
// - EXIT_ON_CLOSE: Terminate aplikasi
// - HIDE_ON_CLOSE: Hide window tapi aplikasi jalan
// - DISPOSE_ON_CLOSE: Close window dan release resources
// - DO_NOTHING_ON_CLOSE: Tidak ada aksi (custom handling)
```

---

## 🎯 Tips Tambahan

### Debugging GUI:
```java
// Print info komponen
System.out.println("Button bounds: " + button.getBounds());
System.out.println("Button visible: " + button.isVisible());
System.out.println("Button enabled: " + button.isEnabled());

// Print semua komponen di frame
Component[] components = frame.getContentPane().getComponents();
for (Component c : components) {
    System.out.println("Component: " + c.getClass().getName());
}
```

### Best Practices:
1. ✅ Selalu gunakan `SwingUtilities.invokeLater()` untuk main
2. ✅ Pisahkan logic dari GUI code
3. ✅ Gunakan meaningful variable names
4. ✅ Validasi input sebelum proses
5. ✅ Handle exceptions dengan try-catch

---

**Selamat Troubleshooting! Semoga GUI Anda Lancar! 🐛→✅**

*Tutorial Ke-4: GUI Desktop | STSI4201 Pemrograman Berbasis Desktop*
