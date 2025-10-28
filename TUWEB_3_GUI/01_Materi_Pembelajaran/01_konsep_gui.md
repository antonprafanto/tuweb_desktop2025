# KONSEP GUI PEMROGRAMAN DESKTOP

## 🖥️ PENGANTAR GUI

### Apa itu GUI?
GUI (Graphical User Interface) adalah antarmuka pengguna grafis yang memungkinkan user berinteraksi dengan komputer melalui elemen visual seperti:
- **Windows** - Jendela aplikasi
- **Buttons** - Tombol interaktif
- **Text Fields** - Input teks
- **Labels** - Teks informasi
- **Menus** - Menu pilihan
- **Dialogs** - Kotak dialog

### Jenis-Jenis GUI Library di Java:
1. **Swing** - Library GUI standar Java
2. **JavaFX** - Modern GUI framework
3. **AWT** - Abstract Window Toolkit (legacy)
4. **SWT** - Standard Widget Toolkit (Eclipse)

## 🎨 SWING FUNDAMENTALS

### Komponen Utama Swing:
```
JFrame      → Window utama aplikasi
JPanel      → Container untuk komponen
JButton     → Tombol aksi
JLabel      → Teks statis
JTextField  → Input satu baris
JTextArea   → Input multi-baris
JComboBox   → Dropdown selection
JCheckBox   → Checkbox selection
JRadioButton → Radio button
JTable      → Tabel data
JList       → List selection
```

### Hierarki Komponen Swing:
```
JFrame (Top-level Container)
├── JMenuBar
├── JPanel (Container)
│   ├── JButton
│   ├── JLabel
│   ├── JTextField
│   └── JComboBox
└── JStatusBar
```

## 🏗️ ARSITEKTUR SWING

### MVC Pattern (Model-View-Controller):
```
Model     → Data dan business logic
View      → Tampilan GUI (Swing components)
Controller → Event handling dan user interaction
```

### Event-Driven Programming:
```java
// Event Listener Pattern
button.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle button click
    }
});
```

## 📐 LAYOUT MANAGEMENT

### Jenis Layout Manager:
1. **FlowLayout** - Kiri ke kanan, atas ke bawah
2. **BorderLayout** - 5 region (North, South, East, West, Center)
3. **GridLayout** - Grid dengan ukuran sama
4. **BoxLayout** - Satu baris/kolom
5. **GridBagLayout** - Grid kompleks dengan constraints
6. **CardLayout** - Stack of components

### Contoh Layout:
```java
// BorderLayout
frame.setLayout(new BorderLayout());
frame.add(button, BorderLayout.NORTH);
frame.add(textField, BorderLayout.CENTER);
frame.add(statusLabel, BorderLayout.SOUTH);

// GridLayout
panel.setLayout(new GridLayout(3, 2)); // 3 baris, 2 kolom
panel.add(new JButton("1"));
panel.add(new JButton("2"));
panel.add(new JButton("3"));
```

## 🎯 EVENT HANDLING

### Jenis-Jenis Event:
- **ActionEvent** - Button click, Enter key
- **MouseEvent** - Click, drag, move
- **KeyEvent** - Key press, release
- **WindowEvent** - Open, close, minimize
- **FocusEvent** - Gain/lose focus

### Event Listener Interfaces:
```java
// Action Listener
ActionListener → actionPerformed(ActionEvent)

// Mouse Listener  
MouseListener → mouseClicked(MouseEvent)
               → mousePressed(MouseEvent)
               → mouseReleased(MouseEvent)
               → mouseEntered(MouseEvent)
               → mouseExited(MouseEvent)

// Key Listener
KeyListener → keyPressed(KeyEvent)
             → keyReleased(KeyEvent)
             → keyTyped(KeyEvent)
```

## 🎨 COMPONENTS DETAIL

### JButton:
```java
JButton button = new JButton("Click Me");
button.setToolTipText("Click this button");
button.setEnabled(true);
button.setVisible(true);
button.setBackground(Color.BLUE);
button.setForeground(Color.WHITE);
```

### JTextField:
```java
JTextField textField = new JTextField(20); // 20 columns
textField.setText("Default text");
textField.setEditable(true);
textField.setHorizontalAlignment(JTextField.RIGHT);
```

### JLabel:
```java
JLabel label = new JLabel("Hello World");
label.setFont(new Font("Arial", Font.BOLD, 16));
label.setForeground(Color.RED);
label.setIcon(new ImageIcon("icon.png"));
```

### JComboBox:
```java
String[] items = {"Option 1", "Option 2", "Option 3"};
JComboBox<String> comboBox = new JComboBox<>(items);
comboBox.setSelectedIndex(0);
comboBox.addActionListener(this);
```

## 🎭 DIALOG BOXES

### JOptionPane:
```java
// Message Dialog
JOptionPane.showMessageDialog(frame, "Hello World!");

// Confirm Dialog
int result = JOptionPane.showConfirmDialog(frame, 
    "Are you sure?", "Confirm", JOptionPane.YES_NO_OPTION);

// Input Dialog
String input = JOptionPane.showInputDialog(frame, "Enter name:");

// Option Dialog
Object[] options = {"OK", "Cancel", "Help"};
int choice = JOptionPane.showOptionDialog(frame, 
    "Choose an option", "Options", 
    JOptionPane.DEFAULT_OPTION, 
    JOptionPane.INFORMATION_MESSAGE, 
    null, options, options[0]);
```

### Custom Dialog:
```java
JDialog dialog = new JDialog(frame, "Custom Dialog", true);
dialog.setSize(300, 200);
dialog.setLayout(new FlowLayout());
dialog.add(new JLabel("Custom content"));
dialog.add(new JButton("OK"));
dialog.setVisible(true);
```

## 🎨 LOOK AND FEEL

### Mengubah Look and Feel:
```java
try {
    // System Look and Feel
    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeel());
    
    // Nimbus Look and Feel
    UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
    
    // Metal Look and Feel (default)
    UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeel());
    
} catch (Exception e) {
    e.printStackTrace();
}
```

### Available Look and Feels:
- **Metal** - Default Java look
- **Nimbus** - Modern look (Java 6+)
- **Windows** - Native Windows look
- **Mac** - Native macOS look
- **GTK** - Linux GTK look

## 🎯 BEST PRACTICES

### 1. Thread Safety:
```java
// Use SwingUtilities for GUI updates
SwingUtilities.invokeLater(new Runnable() {
    @Override
    public void run() {
        // GUI update code here
        label.setText("Updated");
    }
});
```

### 2. Resource Management:
```java
// Use try-with-resources for images
try (InputStream is = getClass().getResourceAsStream("/image.png")) {
    ImageIcon icon = new ImageIcon(ImageIO.read(is));
    label.setIcon(icon);
} catch (IOException e) {
    e.printStackTrace();
}
```

### 3. Layout Best Practices:
```java
// Use nested panels for complex layouts
JPanel mainPanel = new JPanel(new BorderLayout());
JPanel buttonPanel = new JPanel(new FlowLayout());
JPanel inputPanel = new JPanel(new GridLayout(2, 2));

mainPanel.add(inputPanel, BorderLayout.CENTER);
mainPanel.add(buttonPanel, BorderLayout.SOUTH);
```

### 4. Event Handling Best Practices:
```java
// Use lambda expressions (Java 8+)
button.addActionListener(e -> handleButtonClick());

// Separate event handling logic
private void handleButtonClick() {
    // Business logic here
}
```

## 🚀 PERFORMANCE TIPS

### 1. Lazy Loading:
```java
// Create components only when needed
private JPanel getDetailPanel() {
    if (detailPanel == null) {
        detailPanel = new JPanel();
        // Initialize components
    }
    return detailPanel;
}
```

### 2. Efficient Repainting:
```java
// Use repaint() instead of re-creating components
panel.repaint(); // Better than panel = new JPanel();

// Use revalidate() for layout changes
panel.add(newComponent);
panel.revalidate();
```

### 3. Memory Management:
```java
// Dispose frames properly
frame.addWindowListener(new WindowAdapter() {
    @Override
    public void windowClosing(WindowEvent e) {
        frame.dispose(); // Clean up resources
    }
});
```

## 📚 RESOURCES LEBIH LANJUT

### Dokumentasi:
- [Oracle Swing Tutorial](https://docs.oracle.com/javase/tutorial/uiswing/)
- [JavaFX Documentation](https://openjfx.io/)
- [Swing Visual Guide](https://docs.oracle.com/javase/tutorial/uiswing/components/components.html)

### Tools:
- **WindowBuilder** - GUI designer untuk Eclipse
- **NetBeans GUI Builder** - Visual GUI designer
- **IntelliJ IDEA GUI Designer** - Form designer

### Examples:
- **Notepad Clone** - Text editor sederhana
- **Calculator App** - Kalkulator scientific
- **Contact Manager** - Manajemen kontak
- **File Explorer** - File browser sederhana

---

**🎯 Learning Outcomes:**
Setelah mempelajari materi ini, mahasiswa diharapkan dapat:
1. Memahami konsep dasar GUI programming
2. Menggunakan Swing components dengan benar
3. Menerapkan layout management yang efektif
4. Mengimplementasikan event handling yang robust
5. Membuat aplikasi desktop yang user-friendly