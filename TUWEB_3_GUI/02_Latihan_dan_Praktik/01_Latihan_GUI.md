# LATIHAN DASAR GUI PROGRAMMING

## 🎯 LATIHAN 1: HELLO WORLD GUI

### Tujuan:
Membuat jendela GUI sederhana dengan "Hello World"

### Code:
```java
import javax.swing.*;

public class HelloWorldGUI {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Hello World GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new java.awt.FlowLayout());
        
        // Create label
        JLabel label = new JLabel("Hello, World!");
        label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 24));
        
        // Add to frame
        frame.add(label);
        
        // Center and show
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
```

### Tugas:
1. Ubah warna teks menjadi biru
2. Tambahkan tombol "Close"
3. Tambahkan icon pada jendela

---

## 🎯 LATIHAN 2: KALKULATOR SEDERHANA

### Tujuan:
Membuat kalkulator dengan operasi dasar

### Code Template:
```java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KalkulatorSederhana extends JFrame implements ActionListener {
    private JTextField textField;
    private JButton[] buttons;
    private String[] labels = {
        "7", "8", "9", "/",
        "4", "5", "6", "*",
        "1", "2", "3", "-",
        "0", ".", "=", "+"
    };
    
    private double num1 = 0, num2 = 0, result = 0;
    private char operator;
    
    public KalkulatorSederhana() {
        // TODO: Implement constructor
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO: Handle button clicks
    }
    
    public static void main(String[] args) {
        new KalkulatorSederhana();
    }
}
```

### Tugas:
1. Lengkapi constructor untuk membuat GUI
2. Implementasikan actionPerformed untuk handle clicks
3. Tambahkan fungsi Clear (C)
4. Tambahkan fungsi backspace

---

## 🎯 LATIHAN 3: FORM INPUT DATA

### Tujuan:
Membuat form input data mahasiswa

### Code Template:
```java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormMahasiswa extends JFrame {
    private JTextField nimField, namaField, ipkField;
    private JComboBox<String> jurusanCombo;
    private JSpinner angkatanSpinner;
    private JButton saveButton, clearButton;
    
    public FormMahasiswa() {
        setTitle("Form Data Mahasiswa");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2, 10, 10));
        
        // TODO: Create and add components
        
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private void initComponents() {
        // TODO: Initialize all components
    }
    
    private void addComponents() {
        // TODO: Add components to frame
    }
    
    private void setupEventHandlers() {
        // TODO: Setup event listeners
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new FormMahasiswa());
    }
}
```

### Tugas:
1. Lengkapi initComponents() method
2. Implementasikan addComponents() dengan proper layout
3. Tambahkan validasi input (NIM harus angka, IPK 0-4)
4. Tambahkan fungsi untuk menyimpan data ke file

---

## 🎯 LATIHAN 4: TABLE VIEW DATA

### Tujuan:
Menampilkan data dalam bentuk tabel

### Code Template:
```java
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.util.*;

public class TabelMahasiswa extends JFrame {
    private JTable table;
    private DefaultTableModel tableModel;
    private JButton addButton, editButton, deleteButton;
    private JScrollPane scrollPane;
    
    public TabelMahasiswa() {
        setTitle("Tabel Data Mahasiswa");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        initComponents();
        addComponents();
        setupEventHandlers();
        
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private void initComponents() {
        // Create table model
        String[] columns = {"NIM", "Nama", "Jurusan", "IPK", "Angkatan"};
        tableModel = new DefaultTableModel(columns, 0);
        
        // Create table
        table = new JTable(tableModel);
        scrollPane = new JScrollPane(table);
        
        // Create buttons
        addButton = new JButton("Tambah");
        editButton = new JButton("Edit");
        deleteButton = new JButton("Hapus");
    }
    
    private void addComponents() {
        // TODO: Add components to frame
    }
    
    private void setupEventHandlers() {
        // TODO: Setup event listeners
    }
    
    private void loadSampleData() {
        // TODO: Add sample data to table
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TabelMahasiswa());
    }
}
```

### Tugas:
1. Lengkapi addComponents() method
2. Implementasikan setupEventHandlers()
3. Tambahkan fungsi tambah, edit, hapus data
4. Tambahkan search/filter functionality

---

## 🎯 LATIHAN 5: MENU BAR DAN DIALOG

### Tujuan:
Membuat aplikasi dengan menu bar dan dialog

### Code Template:
```java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuApp extends JFrame {
    private JTextArea textArea;
    private JMenuBar menuBar;
    private JMenu fileMenu, editMenu, helpMenu;
    private JMenuItem newItem, openItem, saveItem, exitItem;
    private JMenuItem cutItem, copyItem, pasteItem;
    private JMenuItem aboutItem;
    
    public MenuApp() {
        setTitle("Aplikasi dengan Menu");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        initComponents();
        createMenuBar();
        addComponents();
        setupEventHandlers();
        
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private void initComponents() {
        textArea = new JTextArea();
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
    }
    
    private void createMenuBar() {
        // TODO: Create menu bar structure
    }
    
    private void addComponents() {
        add(new JScrollPane(textArea), BorderLayout.CENTER);
        setJMenuBar(menuBar);
    }
    
    private void setupEventHandlers() {
        // TODO: Setup menu event handlers
    }
    
    private void showAboutDialog() {
        // TODO: Show about dialog
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MenuApp());
    }
}
```

### Tugas:
1. Lengkapi createMenuBar() method
2. Implementasikan setupEventHandlers() untuk menu items
3. Tambahkan fungsi file operations (new, open, save)
4. Implementasikan showAboutDialog() dengan informasi aplikasi

---

## 🎯 LATIHAN 6: DRAG AND DROP

### Tujuan:
Mengimplementasikan drag and drop functionality

### Code Template:
```java
import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.*;
import java.awt.dnd.*;
import java.awt.event.*;

public class DragDropDemo extends JFrame {
    private JPanel sourcePanel, targetPanel;
    private JLabel dragLabel;
    
    public DragDropDemo() {
        setTitle("Drag and Drop Demo");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(1, 2, 10, 10));
        
        initComponents();
        setupDragAndDrop();
        addComponents();
        
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private void initComponents() {
        // Source panel
        sourcePanel = new JPanel();
        sourcePanel.setBackground(Color.LIGHT_GRAY);
        sourcePanel.setBorder(BorderFactory.createTitledBorder("Drag From Here"));
        
        // Target panel
        targetPanel = new JPanel();
        targetPanel.setBackground(Color.WHITE);
        targetPanel.setBorder(BorderFactory.createTitledBorder("Drop Here"));
        
        // Draggable label
        dragLabel = new JLabel("Drag Me!");
        dragLabel.setOpaque(true);
        dragLabel.setBackground(Color.YELLOW);
        dragLabel.setPreferredSize(new Dimension(100, 30));
    }
    
    private void setupDragAndDrop() {
        // TODO: Setup drag source
        // TODO: Setup drop target
    }
    
    private void addComponents() {
        sourcePanel.add(dragLabel);
        add(sourcePanel);
        add(targetPanel);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DragDropDemo());
    }
}
```

### Tugas:
1. Implementasikan drag source functionality
2. Implementasikan drop target functionality
3. Tambahkan visual feedback saat drag/drop
4. Tambahkan multiple draggable items

---

## 🎯 LATIHAN 7: CUSTOM COMPONENTS

### Tujuan:
Membuat custom GUI components

### Code Template:
```java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Custom button class
class CustomButton extends JButton {
    private Color hoverColor = new Color(100, 149, 237);
    private Color normalColor = new Color(70, 130, 180);
    private boolean isHovered = false;
    
    public CustomButton(String text) {
        super(text);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
        
        // TODO: Add mouse listeners
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        // TODO: Custom painting logic
    }
    
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(120, 40);
    }
}

// Custom progress bar
class CustomProgressBar extends JComponent {
    private int value = 0;
    private int maximum = 100;
    private Color foreground = new Color(76, 175, 80);
    private Color background = new Color(200, 200, 200);
    
    public CustomProgressBar() {
        setPreferredSize(new Dimension(200, 20));
    }
    
    public void setValue(int value) {
        this.value = Math.max(0, Math.min(value, maximum));
        repaint();
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        // TODO: Custom progress bar painting
    }
}

public class CustomComponentsDemo extends JFrame {
    private CustomButton customButton;
    private CustomProgressBar progressBar;
    private JSlider slider;
    
    public CustomComponentsDemo() {
        setTitle("Custom Components Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        initComponents();
        addComponents();
        setupEventHandlers();
        
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private void initComponents() {
        customButton = new CustomButton("Custom Button");
        progressBar = new CustomProgressBar();
        slider = new JSlider(0, 100, 0);
    }
    
    private void addComponents() {
        add(customButton);
        add(progressBar);
        add(new JLabel("Progress:"));
        add(slider);
    }
    
    private void setupEventHandlers() {
        // TODO: Setup event handlers
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CustomComponentsDemo());
    }
}
```

### Tugas:
1. Lengkapi CustomButton painting logic
2. Implementasikan CustomProgressBar painting
3. Tambahkan hover effects pada CustomButton
4. Hubungkan slider dengan progress bar

---

## 📝 EVALUASI

### Kriteria Penilaian:
1. **Functionality (40%)** - Semua fitur bekerja dengan benar
2. **Code Quality (30%)** - Clean code, proper naming, documentation
3. **UI/UX Design (20%)** - Layout yang baik dan user-friendly
4. **Creativity (10%)** - Inovasi dan improvement tambahan

### Submission Requirements:
- Source code untuk setiap latihan
- Screenshot hasil running
- Penjelasan singkat implementasi
- Challenge/kesulitan yang dihadapi

---

**🎯 Learning Outcomes:**
Setelah menyelesaikan semua latihan, mahasiswa diharapkan dapat:
1. Membuat GUI application dengan Swing
2. Menggunakan berbagai Swing components
3. Mengimplementasikan event handling
4. Menerapkan layout management yang efektif
5. Membuat custom components
6. Mengimplementasikan advanced features (drag/drop, dialogs)