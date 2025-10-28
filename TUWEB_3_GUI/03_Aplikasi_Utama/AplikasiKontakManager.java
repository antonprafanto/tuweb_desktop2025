import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.util.List;

/**
 * APLIKASI KONTAK MANAGER LENGKAP
 * Demonstrasi GUI programming dengan Swing
 * Features: CRUD operations, search, import/export
 */
public class AplikasiKontakManager extends JFrame {
    
    // Components
    private JTable table;
    private DefaultTableModel tableModel;
    private JTextField searchField, namaField, teleponField, emailField;
    private JTextArea alamatArea;
    private JButton addButton, editButton, deleteButton;
    private JButton clearButton, importButton, exportButton;
    private JComboBox<String> groupCombo;
    
    // Data
    private List<Kontak> kontakList = new ArrayList<>();
    private int selectedRow = -1;
    
    // Constructor
    public AplikasiKontakManager() {
        initializeComponents();
        setupLayout();
        setupEventHandlers();
        loadSampleData();
        
        setTitle("Aplikasi Kontak Manager");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private void initializeComponents() {
        // Table
        String[] columns = {"Nama", "Telepon", "Email", "Group"};
        tableModel = new DefaultTableModel(columns, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Make table read-only
            }
        };
        table = new JTable(tableModel);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table.getTableHeader().setReorderingAllowed(false);
        
        // Search
        searchField = new JTextField(20);
        searchField.setToolTipText("Cari kontak berdasarkan nama atau telepon");
        
        // Form fields
        namaField = new JTextField(20);
        teleponField = new JTextField(15);
        emailField = new JTextField(25);
        alamatArea = new JTextArea(3, 25);
        alamatArea.setLineWrap(true);
        alamatArea.setWrapStyleWord(true);
        
        // Group combo
        String[] groups = {"Umum", "Keluarga", "Teman", "Kerja", "Lainnya"};
        groupCombo = new JComboBox<>(groups);
        
        // Buttons
        addButton = new JButton("Tambah");
        editButton = new JButton("Edit");
        deleteButton = new JButton("Hapus");
        clearButton = new JButton("Clear");
        importButton = new JButton("Import");
        exportButton = new JButton("Export");
        
        // Set button icons (using text for simplicity)
        addButton.setToolTipText("Tambah kontak baru");
        editButton.setToolTipText("Edit kontak yang dipilih");
        deleteButton.setToolTipText("Hapus kontak yang dipilih");
        clearButton.setToolTipText("Clear form");
        importButton.setToolTipText("Import dari file CSV");
        exportButton.setToolTipText("Export ke file CSV");
    }
    
    private void setupLayout() {
        setLayout(new BorderLayout());
        
        // Top panel - Search
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        topPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 10));
        topPanel.add(new JLabel("Cari:"));
        topPanel.add(searchField);
        
        // Center panel - Split pane
        JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
        
        // Table panel
        JPanel tablePanel = new JPanel(new BorderLayout());
        tablePanel.setBorder(BorderFactory.createTitledBorder("Daftar Kontak"));
        tablePanel.add(new JScrollPane(table), BorderLayout.CENTER);
        
        // Form panel
        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBorder(BorderFactory.createTitledBorder("Detail Kontak"));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;
        
        // Form components
        gbc.gridx = 0; gbc.gridy = 0;
        formPanel.add(new JLabel("Nama:"), gbc);
        gbc.gridx = 1; gbc.fill = GridBagConstraints.HORIZONTAL;
        formPanel.add(namaField, gbc);
        
        gbc.gridx = 0; gbc.gridy = 1; gbc.fill = GridBagConstraints.NONE;
        formPanel.add(new JLabel("Telepon:"), gbc);
        gbc.gridx = 1; gbc.fill = GridBagConstraints.HORIZONTAL;
        formPanel.add(teleponField, gbc);
        
        gbc.gridx = 0; gbc.gridy = 2; gbc.fill = GridBagConstraints.NONE;
        formPanel.add(new JLabel("Email:"), gbc);
        gbc.gridx = 1; gbc.fill = GridBagConstraints.HORIZONTAL;
        formPanel.add(emailField, gbc);
        
        gbc.gridx = 0; gbc.gridy = 3; gbc.fill = GridBagConstraints.NONE;
        formPanel.add(new JLabel("Group:"), gbc);
        gbc.gridx = 1; gbc.fill = GridBagConstraints.HORIZONTAL;
        formPanel.add(groupCombo, gbc);
        
        gbc.gridx = 0; gbc.gridy = 4; gbc.fill = GridBagConstraints.NONE;
        formPanel.add(new JLabel("Alamat:"), gbc);
        gbc.gridx = 1; gbc.gridwidth = 2; gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0; gbc.weighty = 1.0;
        formPanel.add(new JScrollPane(alamatArea), gbc);
        
        // Button panel
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(addButton);
        buttonPanel.add(editButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(clearButton);
        buttonPanel.add(new JSeparator(SwingConstants.VERTICAL));
        buttonPanel.add(importButton);
        buttonPanel.add(exportButton);
        
        gbc.gridx = 0; gbc.gridy = 5; gbc.gridwidth = 2; gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0; gbc.weighty = 0;
        formPanel.add(buttonPanel, gbc);
        
        // Setup split pane
        splitPane.setTopComponent(tablePanel);
        splitPane.setBottomComponent(formPanel);
        splitPane.setDividerLocation(300);
        splitPane.setResizeWeight(0.6);
        
        // Add to main frame
        add(topPanel, BorderLayout.NORTH);
        add(splitPane, BorderLayout.CENTER);
        
        // Status bar
        JLabel statusLabel = new JLabel("Total Kontak: 0");
        statusLabel.setBorder(BorderFactory.createEtchedBorder());
        add(statusLabel, BorderLayout.SOUTH);
        
        // Update status bar
        updateStatusBar();
    }
    
    private void setupEventHandlers() {
        // Table selection
        table.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    loadKontakToForm(selectedRow);
                }
            }
        });
        
        // Search
        searchField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                searchKontak();
            }
        });
        
        // Buttons
        addButton.addActionListener(e -> tambahKontak());
        editButton.addActionListener(e -> editKontak());
        deleteButton.addActionListener(e -> hapusKontak());
        clearButton.addActionListener(e -> clearForm());
        importButton.addActionListener(e -> importKontak());
        exportButton.addActionListener(e -> exportKontak());
        
        // Table double-click for edit
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2 && selectedRow != -1) {
                    editKontak();
                }
            }
        });
        
        // Enter key on search field
        searchField.addActionListener(e -> searchKontak());
    }
    
    private void loadSampleData() {
        kontakList.add(new Kontak("Budi Santoso", "08123456789", "budi@email.com", "Teman", "Jakarta"));
        kontakList.add(new Kontak("Siti Nurhaliza", "08234567890", "siti@email.com", "Keluarga", "Bandung"));
        kontakList.add(new Kontak("Ahmad Fauzi", "08345678901", "ahmad@email.com", "Kerja", "Surabaya"));
        kontakList.add(new Kontak("Dewi Lestari", "08456789012", "dewi@email.com", "Teman", "Yogyakarta"));
        kontakList.add(new Kontak("Eko Prasetyo", "08567890123", "eko@email.com", "Umum", "Semarang"));
        
        refreshTable();
    }
    
    private void refreshTable() {
        tableModel.setRowCount(0);
        for (Kontak kontak : kontakList) {
            Object[] row = {
                kontak.getNama(),
                kontak.getTelepon(),
                kontak.getEmail(),
                kontak.getGroup()
            };
            tableModel.addRow(row);
        }
        updateStatusBar();
    }
    
    private void loadKontakToForm(int row) {
        if (row >= 0 && row < kontakList.size()) {
            Kontak kontak = kontakList.get(row);
            namaField.setText(kontak.getNama());
            teleponField.setText(kontak.getTelepon());
            emailField.setText(kontak.getEmail());
            alamatArea.setText(kontak.getAlamat());
            groupCombo.setSelectedItem(kontak.getGroup());
        }
    }
    
    private void tambahKontak() {
        if (validateForm()) {
            Kontak kontak = new Kontak(
                namaField.getText().trim(),
                teleponField.getText().trim(),
                emailField.getText().trim(),
                (String) groupCombo.getSelectedItem(),
                alamatArea.getText().trim()
            );
            
            kontakList.add(kontak);
            refreshTable();
            clearForm();
            
            JOptionPane.showMessageDialog(this, 
                "Kontak berhasil ditambahkan!", 
                "Sukses", 
                JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private void editKontak() {
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, 
                "Pilih kontak yang akan diedit!", 
                "Peringatan", 
                JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (validateForm()) {
            Kontak kontak = kontakList.get(selectedRow);
            kontak.setNama(namaField.getText().trim());
            kontak.setTelepon(teleponField.getText().trim());
            kontak.setEmail(emailField.getText().trim());
            kontak.setGroup((String) groupCombo.getSelectedItem());
            kontak.setAlamat(alamatArea.getText().trim());
            
            refreshTable();
            clearForm();
            
            JOptionPane.showMessageDialog(this, 
                "Kontak berhasil diperbarui!", 
                "Sukses", 
                JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private void hapusKontak() {
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, 
                "Pilih kontak yang akan dihapus!", 
                "Peringatan", 
                JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        int result = JOptionPane.showConfirmDialog(this, 
            "Apakah Anda yakin ingin menghapus kontak ini?", 
            "Konfirmasi Hapus", 
            JOptionPane.YES_NO_OPTION);
        
        if (result == JOptionPane.YES_OPTION) {
            kontakList.remove(selectedRow);
            refreshTable();
            clearForm();
            
            JOptionPane.showMessageDialog(this, 
                "Kontak berhasil dihapus!", 
                "Sukses", 
                JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private void clearForm() {
        namaField.setText("");
        teleponField.setText("");
        emailField.setText("");
        alamatArea.setText("");
        groupCombo.setSelectedIndex(0);
        selectedRow = -1;
        table.clearSelection();
        namaField.requestFocus();
    }
    
    private boolean validateForm() {
        if (namaField.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, 
                "Nama tidak boleh kosong!", 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
            namaField.requestFocus();
            return false;
        }
        
        if (teleponField.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, 
                "Telepon tidak boleh kosong!", 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
            teleponField.requestFocus();
            return false;
        }
        
        if (!emailField.getText().trim().isEmpty() && 
            !emailField.getText().trim().matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
            JOptionPane.showMessageDialog(this, 
                "Format email tidak valid!", 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
            emailField.requestFocus();
            return false;
        }
        
        return true;
    }
    
    private void searchKontak() {
        String searchText = searchField.getText().trim().toLowerCase();
        
        if (searchText.isEmpty()) {
            refreshTable();
            return;
        }
        
        tableModel.setRowCount(0);
        for (Kontak kontak : kontakList) {
            if (kontak.getNama().toLowerCase().contains(searchText) ||
                kontak.getTelepon().toLowerCase().contains(searchText)) {
                Object[] row = {
                    kontak.getNama(),
                    kontak.getTelepon(),
                    kontak.getEmail(),
                    kontak.getGroup()
                };
                tableModel.addRow(row);
            }
        }
        
        updateStatusBar();
    }
    
    private void importKontak() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter(
            "CSV Files (*.csv)", "csv"));
        
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            try (BufferedReader reader = new BufferedReader(new FileReader(fileChooser.getSelectedFile()))) {
                String line;
                int count = 0;
                
                // Skip header if exists
                reader.readLine();
                
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(",");
                    if (parts.length >= 4) {
                        Kontak kontak = new Kontak(
                            parts[0].trim(),
                            parts[1].trim(),
                            parts[2].trim(),
                            parts[3].trim(),
                            parts.length > 4 ? parts[4].trim() : ""
                        );
                        kontakList.add(kontak);
                        count++;
                    }
                }
                
                refreshTable();
                JOptionPane.showMessageDialog(this, 
                    String.format("Berhasil mengimport %d kontak!", count), 
                    "Import Sukses", 
                    JOptionPane.INFORMATION_MESSAGE);
                
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, 
                    "Gagal mengimport file: " + e.getMessage(), 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private void exportKontak() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter(
            "CSV Files (*.csv)", "csv"));
        
        int result = fileChooser.showSaveDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            if (!file.getName().endsWith(".csv")) {
                file = new File(file.getParent(), file.getName() + ".csv");
            }
            
            try (PrintWriter writer = new PrintWriter(file)) {
                // Write header
                writer.println("Nama,Telepon,Email,Group,Alamat");
                
                // Write data
                for (Kontak kontak : kontakList) {
                    writer.printf("%s,%s,%s,%s,%s%n",
                        escapeCSV(kontak.getNama()),
                        escapeCSV(kontak.getTelepon()),
                        escapeCSV(kontak.getEmail()),
                        escapeCSV(kontak.getGroup()),
                        escapeCSV(kontak.getAlamat())
                    );
                }
                
                JOptionPane.showMessageDialog(this, 
                    "Berhasil mengekspor " + kontakList.size() + " kontak!", 
                    "Export Sukses", 
                    JOptionPane.INFORMATION_MESSAGE);
                
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, 
                    "Gagal mengekspor file: " + e.getMessage(), 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private String escapeCSV(String value) {
        if (value.contains(",") || value.contains("\"") || value.contains("\n")) {
            return "\"" + value.replace("\"", "\"\"") + "\"";
        }
        return value;
    }
    
    private void updateStatusBar() {
        // Find status bar (last component added to BorderLayout.SOUTH)
        Component[] components = getContentPane().getComponents();
        for (Component comp : components) {
            if (comp instanceof JLabel && comp.getBorder() != null) {
                ((JLabel) comp).setText("Total Kontak: " + kontakList.size());
                break;
            }
        }
    }
    
    // Inner class for Kontak model
    static class Kontak {
        private String nama;
        private String telepon;
        private String email;
        private String group;
        private String alamat;
        
        public Kontak(String nama, String telepon, String email, String group, String alamat) {
            this.nama = nama;
            this.telepon = telepon;
            this.email = email;
            this.group = group;
            this.alamat = alamat;
        }
        
        // Getters and setters
        public String getNama() { return nama; }
        public void setNama(String nama) { this.nama = nama; }
        
        public String getTelepon() { return telepon; }
        public void setTelepon(String telepon) { this.telepon = telepon; }
        
        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }
        
        public String getGroup() { return group; }
        public void setGroup(String group) { this.group = group; }
        
        public String getAlamat() { return alamat; }
        public void setAlamat(String alamat) { this.alamat = alamat; }
    }
    
    // Main method
    public static void main(String[] args) {
        // Set look and feel
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeel());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // Run on EDT
        SwingUtilities.invokeLater(() -> new AplikasiKontakManager());
    }
}