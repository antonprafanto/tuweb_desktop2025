# LATIHAN LENGKAP GUI PROGRAMMING

## 🎯 PROJECT 1: APLIKASI KONTAK MANAGER

### Deskripsi:
Aplikasi manajemen kontak dengan fitur CRUD (Create, Read, Update, Delete)

### Features:
- Tambah kontak baru
- Lihat daftar kontak
- Edit kontak existing
- Hapus kontak
- Search/filter kontak
- Export/import kontak

### Code Structure:
```java
// Model class
class Kontak {
    private String nama;
    private String telepon;
    private String email;
    private String alamat;
    
    // Constructor, getters, setters
}

// Main application
class KontakManager extends JFrame {
    private JTable table;
    private DefaultTableModel tableModel;
    private JTextField searchField;
    private JButton addButton, editButton, deleteButton;
    private JButton importButton, exportButton;
    
    public KontakManager() {
        // Initialize GUI
    }
    
    private void initComponents() {
        // Create components
    }
    
    private void setupLayout() {
        // Setup layout
    }
    
    private void setupEventHandlers() {
        // Setup event listeners
    }
    
    private void loadKontak() {
        // Load from file/database
    }
    
    private void saveKontak() {
        // Save to file/database
    }
}
```

### Tugas:
1. Lengkapi class Kontak dengan proper validation
2. Implementasikan KontakManager dengan semua fitur
3. Tambahkan photo contact functionality
4. Tambahkan groups/categories untuk kontak

---

## 🎯 PROJECT 2: APLIKASI TO-DO LIST

### Deskripsi:
Aplikasi task management dengan fitur lengkap

### Features:
- Tambah task baru
- Edit task (nama, deskripsi, priority, due date)
- Mark task as complete
- Filter tasks (all, active, completed)
- Sort tasks (date, priority, name)
- Export tasks to file

### Code Structure:
```java
// Task model
class Task {
    private int id;
    private String judul;
    private String deskripsi;
    private Priority priority;
    private LocalDate dueDate;
    private boolean completed;
    
    public enum Priority {
        LOW, MEDIUM, HIGH, URGENT
    }
}

// Main application
class TodoListApp extends JFrame {
    private JTable table;
    private DefaultTableModel tableModel;
    private JTextField judulField;
    private JTextArea deskripsiArea;
    private JComboBox<Priority> priorityCombo;
    private JDateChooser dueDatePicker;
    
    public TodoListApp() {
        // Initialize GUI
    }
    
    private void createMenuBar() {
        // Create menu bar
    }
    
    private void createToolbar() {
        // Create toolbar
    }
    
    private void createMainPanel() {
        // Create main content area
    }
    
    private void createStatusBar() {
        // Create status bar
    }
}
```

### Tugas:
1. Implementasikan Task class dengan proper validation
2. Buat TodoListApp dengan semua fitur
3. Tambahkan reminder/notification system
4. Tambahkan task templates

---

## 🎯 PROJECT 3: APLIKASI NOTEPAD

### Deskripsi:
Text editor sederhana dengan fitur lengkap

### Features:
- New, Open, Save, Save As
- Cut, Copy, Paste, Undo, Redo
- Find and Replace
- Font customization
- Theme (Light/Dark)
- Word count
- Print functionality

### Code Structure:
```java
// Main application
class NotepadApp extends JFrame {
    private JTextArea textArea;
    private JFileChooser fileChooser;
    private JMenuBar menuBar;
    private JToolBar toolBar;
    private JLabel statusBar;
    
    // Actions
    private Action newAction, openAction, saveAction;
    private Action cutAction, copyAction, pasteAction;
    private Action findAction, replaceAction;
    
    public NotepadApp() {
        // Initialize GUI
    }
    
    private void createActions() {
        // Create all actions
    }
    
    private void createMenuBar() {
        // Create menu bar
    }
    
    private void createToolBar() {
        // Create toolbar
    }
    
    private void createStatusBar() {
        // Create status bar
    }
    
    private void setupKeyboardShortcuts() {
        // Setup keyboard shortcuts
    }
    
    private void updateTitle() {
        // Update window title
    }
    
    private void updateStatusBar() {
        // Update status bar
    }
}
```

### Tugas:
1. Implementasikan semua actions dengan proper functionality
2. Tambahkan syntax highlighting untuk berbagai file types
3. Tambahkan tab functionality untuk multiple files
4. Tambahkan plugins system

---

## 🎯 PROJECT 4: APLIKASI KALKULATOR SCIENTIFIC

### Deskripsi:
Kalkulator scientific dengan advanced features

### Features:
- Basic operations (+, -, *, /)
- Scientific operations (sin, cos, tan, log, ln, sqrt, pow)
- Memory functions (M+, M-, MR, MC)
- History calculations
- Unit converter
- Graph plotting (optional)

### Code Structure:
```java
// Calculator engine
class CalculatorEngine {
    private double currentValue;
    private double memoryValue;
    private String currentOperation;
    private List<String> history;
    
    public double calculate(String operation, double operand) {
        // Perform calculation
    }
    
    public void memoryOperation(String operation, double value) {
        // Memory operations
    }
    
    public void addToHistory(String calculation) {
        // Add to history
    }
}

// Main application
class ScientificCalculator extends JFrame {
    private JTextField displayField;
    private JPanel buttonPanel;
    private JPanel scientificPanel;
    private JPanel memoryPanel;
    private JList<String> historyList;
    
    private CalculatorEngine engine;
    
    public ScientificCalculator() {
        // Initialize GUI
    }
    
    private void createDisplay() {
        // Create display area
    }
    
    private void createBasicButtons() {
        // Create basic operation buttons
    }
    
    private void createScientificButtons() {
        // Create scientific operation buttons
    }
    
    private void createMemoryButtons() {
        // Create memory buttons
    }
    
    private void createHistoryPanel() {
        // Create history panel
    }
    
    private void setupEventHandlers() {
        // Setup event handlers
    }
}
```

### Tugas:
1. Implementasikan CalculatorEngine dengan proper precision
2. Buat ScientificCalculator dengan semua fitur
3. Tambahkan unit converter functionality
4. Tambahkan graph plotting untuk mathematical functions

---

## 🎯 PROJECT 5: APLIKASI FILE EXPLORER

### Deskripsi:
File browser dengan fitur lengkap

### Features:
- Navigate directories
- File/folder operations (copy, move, delete, rename)
- File preview (text, images)
- Search files
- Bookmarks
- File properties
- Zip/unzip functionality

### Code Structure:
```java
// File model
class FileItem {
    private File file;
    private String name;
    private long size;
    private Date modified;
    private boolean isDirectory;
    
    // Constructor, getters, setters
}

// File table model
class FileTableModel extends AbstractTableModel {
    private List<FileItem> files;
    private String[] columns = {"Name", "Size", "Modified", "Type"};
    
    // Table model implementation
}

// Main application
class FileExplorer extends JFrame {
    private JTable fileTable;
    private FileTableModel tableModel;
    private JTextField pathField;
    private JTree directoryTree;
    private JSplitPane splitPane;
    
    public FileExplorer() {
        // Initialize GUI
    }
    
    private void createDirectoryTree() {
        // Create directory tree
    }
    
    private void createFileTable() {
        // Create file table
    }
    
    private void createToolbar() {
        // Create toolbar
    }
    
    private void createMenuBar() {
        // Create menu bar
    }
    
    private void setupEventHandlers() {
        // Setup event handlers
    }
    
    private void refreshDirectory(File directory) {
        // Refresh directory contents
    }
    
    private void showFilePreview(File file) {
        // Show file preview
    }
}
```

### Tugas:
1. Implementasikan FileTableModel dengan proper sorting
2. Buat FileExplorer dengan semua fitur
3. Tambahkan file preview untuk berbagai types
4. Tambahkan network drive support

---

## 🎯 PROJECT 6: APLIKASI MEDIA PLAYER

### Deskripsi:
Simple media player untuk audio/video

### Features:
- Play/pause/stop
- Volume control
- Seek bar
- Playlist management
- Shuffle/repeat
- File browser integration
- Visualizations

### Code Structure:
```java
// Media player engine
class MediaPlayerEngine {
    private Clip audioClip;
    private boolean isPlaying;
    private float volume;
    private long position;
    
    public void loadFile(File file) {
        // Load media file
    }
    
    public void play() {
        // Play media
    }
    
    public void pause() {
        // Pause media
    }
    
    public void stop() {
        // Stop media
    }
    
    public void setVolume(float volume) {
        // Set volume
    }
    
    public void setPosition(long position) {
        // Set position
    }
}

// Playlist model
class Playlist {
    private List<File> tracks;
    private int currentTrackIndex;
    private boolean shuffle;
    private boolean repeat;
    
    // Playlist operations
}

// Main application
class MediaPlayerApp extends JFrame {
    private MediaPlayerEngine player;
    private Playlist playlist;
    
    private JButton playButton, pauseButton, stopButton;
    private JButton previousButton, nextButton;
    private JSlider volumeSlider, seekSlider;
    private JTable playlistTable;
    private JLabel currentTrackLabel;
    private JLabel timeLabel;
    
    public MediaPlayerApp() {
        // Initialize GUI
    }
    
    private void createControlPanel() {
        // Create playback controls
    }
    
    private void createPlaylistPanel() {
        // Create playlist panel
    }
    
    private void createVisualizationPanel() {
        // Create visualization panel
    }
    
    private void setupEventHandlers() {
        // Setup event handlers
    }
    
    private void updateUI() {
        // Update UI based on player state
    }
}
```

### Tugas:
1. Implementasikan MediaPlayerEngine dengan proper audio handling
2. Buat MediaPlayerApp dengan semua controls
3. Tambahkan audio visualizations
4. Tambahkan support untuk video playback

---

## 📝 SUBMISSION GUIDELINES

### Format Submission:
1. **Source Code** - Semua .java files
2. **Documentation** - README.md untuk setiap project
3. **Screenshots** - Screenshots dari running application
4. **Demo Video** - Video singkat (2-3 menit) demo aplikasi
5. **Reflection** - Penjelasan challenges dan learning outcomes

### Evaluation Criteria:
- **Functionality (40%)** - Semua fitur bekerja dengan benar
- **Code Quality (30%)** - Clean code, proper OOP, documentation
- **UI/UX (20%)** - User interface yang intuitif dan menarik
- **Innovation (10%)** - Fitur tambahan yang kreatif

### Best Practices:
- Use proper naming conventions
- Follow MVC pattern
- Implement proper error handling
- Add keyboard shortcuts
- Include tooltips and help
- Test thoroughly

---

**🎯 Learning Outcomes:**
Setelah menyelesaikan semua projects, mahasiswa diharapkan dapat:
1. Membuat complex GUI applications
2. Mengimplementasikan MVC pattern
3. Menggunakan berbagai Swing components
4. Mengimplementasikan event handling yang robust
5. Membuat user-friendly applications
6. Mengimplementasikan file operations
7. Membuat custom components dan visualizations