# GLOSSARIUM - GUI PROGRAMMING

## 📋 Deskripsi

Glossarium ini berisi istilah-istilah penting dalam GUI programming dengan Java Swing. Pemahaman terminology yang baik akan membantu Anda dalam belajar dan mengembangkan aplikasi GUI.

## 📚 Daftar Istilah

### **A**

#### **ActionEvent**
Event yang terjadi ketika user melakukan aksi seperti mengklik button atau menekan Enter pada text field.

#### **ActionListener**
Interface yang digunakan untuk menangani action events pada komponen Swing.

#### **AWT (Abstract Window Toolkit)**
Toolkit GUI asli Java yang menjadi dasar bagi Swing. AWT menggunakan komponen native dari sistem operasi.

#### **Adapter Class**
Class yang menyediakan implementasi kosong untuk interface listener, memudahkan programmer untuk mengimplementasikan hanya method yang dibutuhkan.

#### **Anonymous Class**
Class tanpa nama yang sering digunakan untuk implementasi event handler yang sederhana.

### **B**

#### **BorderLayout**
Layout manager yang membagi container menjadi 5 region: North, South, East, West, dan Center.

#### **BoxLayout**
Layout manager yang menyusun komponen dalam satu baris (horizontal) atau satu kolom (vertikal).

#### **Button**
Komponen GUI yang dapat diklik untuk memicu aksi. Jenis-jenis button: JButton, JToggleButton, JCheckBox, JRadioButton.

### **C**

#### **Canvas**
Area untuk custom drawing dan painting operations.

#### **CardLayout**
Layout manager yang menampilkan komponen seperti tumpukan kartu, di mana hanya satu kartu yang terlihat pada satu waktu.

#### **Checkbox**
Komponen yang memungkinkan user memilih satu atau lebih opsi.

#### **Component**
Class dasar untuk semua komponen GUI dalam Swing.

#### **Container**
Komponen yang dapat menampung komponen lain, seperti JPanel, JFrame, JDialog.

#### **Cursor**
Indikator visual posisi mouse pada layar.

### **D**

#### **Dialog**
Window yang digunakan untuk interaksi singkat dengan user, seperti input dialog atau confirmation dialog.

#### **DefaultListModel**
Model data default untuk JList yang menyimpan data dalam bentuk Vector.

#### **DefaultTableModel**
Model data default untuk JTable yang menyimpan data dalam bentuk Vector of Vectors.

#### **Double Buffering**
Teknik untuk mencegah flickering dengan melakukan drawing ke buffer off-screen sebelum ditampilkan ke layar.

### **E**

#### **Event**
Kejadian yang terjadi dalam aplikasi GUI, seperti mouse click, key press, atau window resize.

#### **Event Dispatch Thread (EDT)**
Thread khusus untuk menangani semua event handling dan painting operations dalam Swing.

#### **Event Handling**
Proses menangani dan merespon events yang terjadi dalam aplikasi.

#### **Exception**
Kondisi error yang terjadi saat runtime, seperti IOException atau NullPointerException.

### **F**

#### **FlowLayout**
Layout manager yang menyusun komponen dalam baris secara berurutan dari kiri ke kanan.

#### **Focus**
State yang menunjukkan komponen mana yang sedang aktif dan dapat menerima input dari keyboard.

#### **Frame**
Window utama dalam aplikasi Swing, biasanya memiliki title bar, border, dan menu bar.

#### **Font**
Style dan ukuran teks yang digunakan untuk menampilkan karakter pada komponen.

### **G**

#### **Graphics**
Class yang menyediakan methods untuk drawing operations, seperti menggambar garis, bentuk, dan teks.

#### **Graphics2D**
Extended Graphics class dengan kemampuan drawing yang lebih advanced.

#### **GridBagConstraints**
Class yang digunakan untuk mengatur constraints komponen dalam GridBagLayout.

#### **GridBagLayout**
Layout manager yang paling fleksibel, memungkinkan penempatan komponen dalam grid dengan ukuran dan posisi yang bervariasi.

#### **GridLayout**
Layout manager yang menyusun komponen dalam grid dengan ukuran sel yang sama.

### **H**

#### **Handler**
Method atau object yang menangani event tertentu.

#### **Heavyweight Component**
Komponen GUI yang menggunakan resource native sistem operasi, seperti komponen AWT.

#### **Hierarchy**
Struktur pewarisan class dalam Swing, dimulai dari java.awt.Object.

### **I**

#### **Icon**
Gambar kecil yang digunakan untuk merepresentasikan objek atau aksi.

#### **Image**
Representasi digital dari gambar yang dapat ditampilkan pada komponen GUI.

#### **Insets**
Jarak antara tepi container dengan komponen di dalamnya.

#### **Internal Frame**
Frame yang berada di dalam desktop pane, berguna untuk aplikasi MDI (Multiple Document Interface).

### **J**

#### **JApplet**
Container untuk applet yang menggunakan komponen Swing.

#### **JButton**
Button standar dalam Swing yang dapat menampilkan teks dan/atau icon.

#### **JCheckBox**
Checkbox yang memungkinkan user memilih atau tidak memilih opsi.

#### **JComboBox**
Dropdown list yang memungkinkan user memilih satu item dari beberapa pilihan.

#### **JDialog**
Dialog window yang digunakan untuk interaksi dengan user.

#### **JFrame**
Window utama dalam aplikasi Swing.

#### **JLabel**
Komponen untuk menampilkan teks atau gambar yang tidak dapat diedit.

#### **JList**
Komponen untuk menampilkan daftar item yang dapat dipilih user.

#### **JMenu**
Menu yang dapat ditambahkan ke menu bar.

#### **JMenuBar**
Bar yang berisi menu-menu aplikasi.

#### **JOptionPane**
Dialog standar untuk menampilkan pesan, input, atau konfirmasi.

#### **JPanel**
Container generik untuk mengelompokkan komponen lain.

#### **JPasswordField**
Text field khusus untuk input password yang menampilkan karakter masking.

#### **JProgressBar**
Komponen untuk menampilkan progress dari suatu proses.

#### **JRadioButton**
Button yang biasanya digunakan dalam grup untuk memilih satu opsi dari beberapa pilihan.

#### **JScrollPane**
Container yang menyediakan scrollbars untuk komponen yang ukurannya melebihi area tampilan.

#### **JSeparator**
Komponen untuk menampilkan garis pemisah.

#### **JSlider**
Komponen yang memungkinkan user memilih nilai dengan menggeser slider.

#### **JSpinner**
Komponen untuk input nilai dengan tombol naik/turun.

#### **JSplitPane**
Container yang membagi area menjadi dua bagian yang dapat diresize.

#### **JTabbedPane**
Container yang menampilkan komponen dalam bentuk tab.

#### **JTable**
Komponen untuk menampilkan data dalam bentuk tabel.

#### **JTextArea**
Text area multi-line untuk input teks panjang.

#### **JTextField**
Text field single-line untuk input teks singkat.

#### **JToggleButton**
Button yang memiliki dua state: selected dan unselected.

#### **JToolBar**
Bar yang berisi tool buttons atau komponen lain.

#### **JTree**
Komponen untuk menampilkan data hierarkis dalam bentuk tree.

#### **JViewport**
Area yang menampilkan bagian dari komponen yang lebih besar.

### **K**

#### **KeyAdapter**
Adapter class untuk KeyListener interface.

#### **KeyEvent**
Event yang terjadi ketika user menekan atau melepaskan tombol keyboard.

#### **KeyListener**
Interface untuk menangani keyboard events.

#### **KeyStroke**
Representasi dari kombinasi tombol keyboard.

### **L**

#### **Label**
Komponen untuk menampilkan teks atau gambar statis.

#### **Layout Manager**
Object yang mengatur posisi dan ukuran komponen dalam container.

#### **Lightweight Component**
Komponen GUI yang tidak menggunakan resource native sistem operasi, seperti komponen Swing.

#### **List**
Komponen untuk menampilkan daftar item yang dapat dipilih.

#### **Listener**
Interface yang menunggu dan merespon events tertentu.

#### **LookAndFeel**
Style visual dari aplikasi Swing, mengatur tampilan komponen.

### **M**

#### **Menu**
Dropdown list yang berisi menu items.

#### **MenuBar**
Bar horizontal di bagian atas window yang berisi menu.

#### **MenuItem**
Item dalam menu yang dapat dipilih user.

#### **Model**
Data structure yang menyimpan dan mengelola data untuk komponen Swing.

#### **MouseAdapter**
Adapter class untuk MouseListener interface.

#### **MouseEvent**
Event yang terjadi ketika user menggunakan mouse.

#### **MouseListener**
Interface untuk menangani mouse events seperti click, press, release.

#### **MouseMotionListener**
Interface untuk menangani mouse motion events seperti drag dan move.

### **N**

#### **Null Layout**
Layout manager yang tidak melakukan pengaturan posisi komponen (absolute positioning).

### **O**

#### **Observer Pattern**
Design pattern di mana object (observer) mendaftar untuk menerima notifikasi dari object lain (subject).

### **P**

#### **Panel**
Container generik untuk mengelompokkan komponen.

#### **Password Field**
Text field khusus untuk input password.

#### **Pixel**
Unit terkecil dalam gambar digital.

#### **Point**
Representasi koordinat (x, y) dalam 2D space.

#### **ProgressBar**
Komponen untuk menampilkan progress.

#### **Property**
Atribut dari komponen yang dapat diatur, seperti warna, font, atau ukuran.

### **Q**

#### **Queue**
Struktur data FIFO (First In, First Out).

### **R**

#### **RadioButton**
Button yang digunakan dalam grup untuk memilih satu opsi.

#### **Rectangle**
Bentuk persegi panjang dengan posisi dan ukuran tertentu.

#### **Repaint**
Proses menggambar ulang komponen pada layar.

#### **Resolution**
Jumlah piksel per inch pada layar.

#### **Runnable**
Interface untuk object yang dapat dieksekusi dalam thread.

### **S**

#### **ScrollPane**
Container yang menyediakan scrollbars.

#### **Separator**
Garis pemisah visual.

#### **Slider**
Komponen untuk memilih nilai dengan menggeser.

#### **Spinner**
Komponen untuk input nilai dengan tombol naik/turun.

#### **SplitPane**
Container yang membagi area menjadi dua bagian.

#### **Swing**
Toolkit GUI Java yang lebih advanced dari AWT, fully platform-independent.

#### **SwingUtilities**
Class yang menyediakan utility methods untuk Swing programming.

### **T**

#### **TabbedPane**
Container dengan tab untuk mengelompokkan komponen.

#### **Table**
Komponen untuk menampilkan data tabular.

#### **TextArea**
Text area multi-line.

#### **TextField**
Text field single-line.

#### **Thread**
Unit eksekusi dalam program.

#### **Timer**
Komponen untuk menjalankan task secara periodik.

#### **ToggleButton**
Button dengan dua state.

#### **ToolBar**
Bar yang berisi tool buttons.

#### **ToolTip**
Text help yang muncul saat mouse hover.

#### **Tree**
Komponen untuk menampilkan data hierarkis.

### **U**

#### **UI (User Interface)**
Antarmuka yang memungkinkan interaksi antara user dan aplikasi.

#### **UIManager**
Class untuk mengatur Look and Feel aplikasi.

#### **Update**
Proses memperbarui tampilan komponen.

### **V**

#### **Viewport**
Area yang menampilkan bagian dari komponen besar.

#### **Visible**
Property yang menentukan apakah komponen terlihat atau tidak.

### **W**

#### **Window**
Container top-level untuk aplikasi GUI.

#### **Wrapper Class**
Class yang membungkus primitive type, seperti Integer untuk int.

### **X**

#### **XML (eXtensible Markup Language)**
Format data yang digunakan untuk konfigurasi dan pertukaran data.

## 🎯 Tips Menggunakan Glossarium

### **Cara Belajar Efektif**
1. **Baca Definisi** - Pahami arti setiap istilah
2. **Lihat Contoh** - Cari contoh penggunaan dalam kode
3. **Praktikkan** - Gunakan istilah dalam coding
4. **Review** - Ulangi istilah yang sulit dipahami

### **Kategori Pembelajaran**
- **Pemula:** Focus pada A, B, C, J, L, P, S, W
- **Menengah:** Tambahkan D, E, F, G, H, I, K, M, N, O, Q, R, T, U, V
- **Lanjutan:** Pelajari semua istilah dan konsep advanced

### **Hubungan Antar Istilah**
- **Component → Container → Layout Manager**
- **Event → Listener → Handler**
- **Model → View → Controller (MVC Pattern)**

---

*Glossarium ini akan terus diperbarui seiring dengan perkembangan materi pembelajaran.* 📚