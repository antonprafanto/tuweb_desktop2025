# PANDUAN NETBEANS UNTUK GUI PROGRAMMING

## 📋 Deskripsi

Panduan lengkap untuk menggunakan NetBeans IDE dalam pengembangan aplikasi GUI dengan Java Swing. NetBeans menyediakan tools yang powerful untuk mempercepat development GUI applications.

## 🚀 Instalasi NetBeans

### **System Requirements**
- **Java:** JDK 8 atau lebih tinggi
- **Memory:** Minimum 2GB RAM (4GB recommended)
- **Storage:** 1GB free space
- **OS:** Windows 10+, macOS 10.12+, Ubuntu 18.04+

### **Download & Install**

#### **Windows**
1. Download NetBeans dari [Apache NetBeans](https://netbeans.apache.org/download/)
2. Pilih versi dengan Java SE support
3. Run installer dan follow instructions
4. Choose installation directory
5. Select additional components (optional)

#### **macOS**
1. Download `.dmg` file dari website
2. Double-click untuk mount
3. Drag NetBeans ke Applications folder
4. Launch dari Applications atau Launchpad

#### **Linux**
```bash
# Ubuntu/Debian
sudo snap install netbeans --classic

# Atau download manual
wget https://downloads.apache.org/netbeans/netbeans/12/netbeans-12-bin.zip
unzip netbeans-12-bin.zip
sudo mv netbeans /opt/
sudo chmod +x /opt/netbeans/bin/netbeans
```

## 🎯 Setup Project

### **Membuat Project Baru**

1. **Buka NetBeans**
   - Launch NetBeans IDE
   - Tunggu loading selesai

2. **Create New Project**
   ```
   File → New Project → Java → Java Application
   ```

3. **Project Configuration**
   - **Project Name:** `AplikasiGUI`
   - **Project Location:** Pilih folder yang diinginkan
   - **Main Class:** `com.example.AplikasiGUI`
   - **Set as Main Project:** ✅ Check
   - **Create Main Class:** ✅ Check

4. **Project Structure**
   ```
   AplikasiGUI/
   ├── src/
   │   └── com/
   │       └── example/
   │           └── AplikasiGUI.java
   ├── nbproject/
   │   ├── build-impl.xml
   │   ├── genfiles.properties
   │   ├── project.properties
   │   └── project.xml
   └── build.xml
   ```

### **Menggunakan GUI Builder**

#### **Aktivasi GUI Builder**
1. Right-click pada package
2. **New → JFrame Form**
3. **Class Name:** `MainForm`
4. **Package:** `com.example`

#### **GUI Builder Interface**
```
┌─────────────────────────────────────────────────────────┐
│ Menu Bar                                                  │
├─────────────────────────────────────────────────────────┤
│ Toolbar                                                   │
├─────────────────────────────────────────────────────────┤
│ Projects │ Navigator │ Properties │ Palette │ Inspector  │
├─────────┼───────────┼─────────────┼─────────┼────────────┤
│         │           │             │         │            │
│ Source  │ Design    │ Properties  │ Palette │ Components │
│ Editor  │ View      │ Panel       │         │ Tree       │
│         │           │             │         │            │
│         │           │             │         │            │
└─────────┴───────────┴─────────────┴─────────┴────────────┘
```

## 🎨 GUI Builder Features

### **Palette Components**

#### **Swing Controls**
- **JButton** - Tombol aksi
- **JLabel** - Teks statis
- **JTextField** - Input teks single line
- **JTextArea** - Input teks multi line
- **JPasswordField** - Input password
- **JCheckBox** - Checkbox selection
- **JRadioButton** - Radio button selection
- **JComboBox** - Dropdown selection
- **JList** - List selection
- **JSlider** - Slider input

#### **Swing Containers**
- **JPanel** - Container untuk components
- **JScrollPane** - Scrollable container
- **JSplitPane** - Split panel
- **JTabbedPane** - Tabbed interface
- **JToolBar** - Toolbar
- **JMenuBar** - Menu bar

#### **Swing Windows**
- **JFrame** - Main window
- **JDialog** - Dialog window
- **JInternalFrame** - Internal frame

### **Layout Managers**

#### **Free Design**
- Drag and drop components
- Automatic positioning
- Visual alignment guides
- Smart resizing

#### **Layout Managers**
- **BorderLayout** - 5 regions (N, S, E, W, C)
- **FlowLayout** - Sequential layout
- **GridLayout** - Grid layout
- **GridBagLayout** - Complex grid layout
- **BoxLayout** - Box layout
- **CardLayout** - Card stack layout

## 🔧 Working with GUI Builder

### **Membuat Form Sederhana**

#### **Step 1: Create JFrame Form**
1. Right-click package → New → JFrame Form
2. Name: `LoginForm`
3. Package: `com.example.forms`

#### **Step 2: Add Components**
1. Drag **JLabel** untuk title
2. Drag **JLabel** dan **JTextField** untuk username
3. Drag **JLabel** dan **JPasswordField** untuk password
4. Drag **JButton** untuk login
5. Drag **JButton** untuk cancel

#### **Step 3: Arrange Components**
```
┌─────────────────────────────────┐
│           LOGIN FORM             │
├─────────────────────────────────┤
│ Username: [_______________]      │
│ Password: [_______________]      │
│                                 │
│ [Login]    [Cancel]             │
└─────────────────────────────────┘
```

#### **Step 4: Set Properties**
1. Select component
2. Go to Properties panel
3. Set properties:
   - **text:** Display text
   - **font:** Text font
   - **foreground:** Text color
   - **background:** Background color
   - **toolTipText:** Hover text
   - **enabled:** Enable/disable state

### **Event Handling**

#### **Adding Event Handlers**
1. Right-click component
2. **Events → Action → actionPerformed**
3. NetBeans akan generate method:
```java
private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {
    // Event handling code here
}
```

#### **Common Event Types**
- **actionPerformed** - Button click, Enter key
- **keyPressed** - Key press
- **keyReleased** - Key release
- **mouseClicked** - Mouse click
- **mouseEntered** - Mouse enter
- **mouseExited** - Mouse exit
- **focusGained** - Component focus
- **focusLost** - Component lost focus

### **Code Generation**

#### **Generated Code Structure**
```java
public class LoginForm extends javax.swing.JFrame {
    // Component declarations
    private javax.swing.JTextField usernameField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton loginButton;
    
    // Constructor
    public LoginForm() {
        initComponents(); // Generated by NetBeans
    }
    
    // Generated initialization code
    @SuppressWarnings("unchecked")
    private void initComponents() {
        // Component creation and configuration
        // Layout setup
        // Event handler registration
    }
    
    // Event handlers
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // User code here
    }
}
```

#### **Custom Code Integration**
```java
private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {
    String username = usernameField.getText();
    String password = new String(passwordField.getPassword());
    
    if (validateLogin(username, password)) {
        JOptionPane.showMessageDialog(this, "Login successful!");
        dispose(); // Close login form
        openMainForm(); // Open main form
    } else {
        JOptionPane.showMessageDialog(this, 
            "Invalid username or password", 
            "Login Error", 
            JOptionPane.ERROR_MESSAGE);
    }
}

private boolean validateLogin(String username, String password) {
    // Validation logic
    return "admin".equals(username) && "password".equals(password);
}

private void openMainForm() {
    MainForm mainForm = new MainForm();
    mainForm.setVisible(true);
}
```

## 🎯 Best Practices

### **Component Naming**
```java
// Good naming conventions
private javax.swing.JButton loginButton;
private javax.swing.JButton cancelButton;
private javax.swing.JTextField usernameField;
private javax.swing.JPasswordField passwordField;
private javax.swing.JLabel titleLabel;
private javax.swing.JLabel usernameLabel;
private javax.swing.JLabel passwordLabel;

// Avoid generic names
private javax.swing.JButton button1;  // Bad
private javax.swing.JTextField jTextField1;  // Bad
```

### **Layout Management**
```java
// Use appropriate layout managers
javax.swing.JPanel panel = new javax.swing.JPanel(new java.awt.GridBagLayout());
java.awt.GridBagConstraints gbc = new java.awt.GridBagConstraints();

// Configure constraints
gbc.gridx = 0;
gbc.gridy = 0;
gbc.anchor = java.awt.GridBagConstraints.WEST;
gbc.insets = new java.awt.Insets(5, 5, 5, 5);
```

### **Error Handling**
```java
private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {
    try {
        saveData();
        JOptionPane.showMessageDialog(this, "Data saved successfully!");
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(this, 
            "Error saving data: " + ex.getMessage(),
            "Save Error",
            JOptionPane.ERROR_MESSAGE);
        Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
    }
}
```

## 🛠️ Advanced Features

### **Custom Components**
```java
// Create custom component
public class CustomButton extends javax.swing.JButton {
    public CustomButton(String text) {
        super(text);
        setStyle();
    }
    
    private void setStyle() {
        setBackground(new java.awt.Color(70, 130, 180));
        setForeground(java.awt.Color.WHITE);
        setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 12));
        setBorderPainted(false);
        setFocusPainted(false);
    }
}
```

### **MVC Pattern**
```java
// Model
public class UserModel {
    private String username;
    private String email;
    // Getters and setters
}

// View (GUI Form)
public class UserForm extends javax.swing.JFrame {
    private UserModel model;
    
    public void setModel(UserModel model) {
        this.model = model;
        updateView();
    }
    
    private void updateView() {
        usernameField.setText(model.getUsername());
        emailField.setText(model.getEmail());
    }
}

// Controller
public class UserController {
    private UserForm view;
    private UserModel model;
    
    public void saveUser() {
        model.setUsername(view.getUsernameField().getText());
        model.setEmail(view.getEmailField().getText());
        // Save to database
    }
}
```

### **Database Integration**
```java
private void loadUsers() {
    try {
        Connection conn = DatabaseConnection.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM users");
        
        DefaultTableModel model = (DefaultTableModel) userTable.getModel();
        model.setRowCount(0);
        
        while (rs.next()) {
            Object[] row = {
                rs.getInt("id"),
                rs.getString("username"),
                rs.getString("email"),
                rs.getString("role")
            };
            model.addRow(row);
        }
        
        rs.close();
        stmt.close();
        conn.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, 
            "Database error: " + ex.getMessage(),
            "Error",
            JOptionPane.ERROR_MESSAGE);
    }
}
```

## 🐛 Troubleshooting

### **Common Issues**

#### **GUI Builder Not Working**
```bash
# Solution: Check NetBeans version and Java compatibility
# Ensure JDK version matches NetBeans requirements
```

#### **Components Not Visible**
```java
// Check layout manager
panel.setLayout(new FlowLayout()); // Ensure proper layout
panel.add(button); // Add component to panel
panel.revalidate(); // Refresh layout
panel.repaint(); // Repaint component
```

#### **Event Handlers Not Working**
```java
// Ensure event handler is properly registered
button.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        buttonActionPerformed(evt);
    }
});
```

#### **Compilation Errors**
```bash
# Clean and rebuild project
# Build → Clean and Build Project
# Atau gunakan shortcut: Shift+F11
```

### **Debugging Tips**

#### **Using Debugger**
1. Set breakpoints by clicking on line numbers
2. Run in debug mode: **Debug → Debug Project**
3. Use **Step Over (F8)** and **Step Into (F7)**
4. Watch variables in Variables window

#### **Console Output**
```java
// Add debug statements
System.out.println("Button clicked: " + evt.getActionCommand());
System.err.println("Error occurred: " + ex.getMessage());
```

#### **Component Inspector**
1. Use **Inspector** window to view component hierarchy
2. Check component properties at runtime
3. Verify event handler registration

## 📈 Performance Tips

### **Optimization Techniques**
```java
// Use proper layout managers
// Avoid null layout (absolute positioning)
// Minimize custom painting
// Use SwingWorker for long operations

SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
    @Override
    protected Void doInBackground() throws Exception {
        // Long running operation
        return null;
    }
    
    @Override
    protected void done() {
        // Update UI after completion
    }
};
worker.execute();
```

### **Memory Management**
```java
// Dispose frames properly
frame.dispose();

// Remove listeners when no longer needed
button.removeActionListener(listener);

// Use weak references for large data structures
WeakReference<List<Data>> dataRef = new WeakReference<>(largeList);
```

## 📚 Learning Resources

### **Official Documentation**
- [NetBeans IDE Documentation](https://netbeans.apache.org/kb/docs/)
- [Java GUI Builder Tutorial](https://netbeans.apache.org/kb/docs/java/quickstart-gui.html)

### **Video Tutorials**
- [NetBeans GUI Builder Tutorial](https://www.youtube.com/watch?v=example)
- [Java Swing with NetBeans](https://www.youtube.com/playlist?list=example)

### **Books**
- "NetBeans IDE 8 Cookbook" by Heiko Böck
- "Java Programming with NetBeans" by David J. Barnes

---

*Panduan ini akan membantu Anda menguasai NetBeans IDE untuk pengembangan aplikasi GUI yang efisien dan profesional.* 🚀