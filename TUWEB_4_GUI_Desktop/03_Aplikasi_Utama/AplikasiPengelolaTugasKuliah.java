import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * AplikasiPengelolaTugasKuliah.java
 * Aplikasi GUI Desktop untuk mengelola tugas kuliah mahasiswa
 *
 * Fitur:
 * - Tambah, edit, hapus tugas
 * - Kategori mata kuliah
 * - Status tugas (Pending, In Progress, Completed)
 * - Deadline reminder
 * - Filter berdasarkan status dan mata kuliah
 * - Statistik tugas
 *
 * @author Anton Prafanto, S.Kom, M.T.
 * @version 1.0
 * Tutorial Ke-4: GUI Desktop
 */

// ==================== CLASS TUGAS ====================
class Tugas {
    private String id;
    private String judul;
    private String mataKuliah;
    private String deskripsi;
    private String deadline;
    private String status; // Pending, In Progress, Completed
    private int prioritas; // 1=Rendah, 2=Sedang, 3=Tinggi

    public Tugas(String id, String judul, String mataKuliah, String deskripsi,
                 String deadline, String status, int prioritas) {
        this.id = id;
        this.judul = judul;
        this.mataKuliah = mataKuliah;
        this.deskripsi = deskripsi;
        this.deadline = deadline;
        this.status = status;
        this.prioritas = prioritas;
    }

    // Getters
    public String getId() { return id; }
    public String getJudul() { return judul; }
    public String getMataKuliah() { return mataKuliah; }
    public String getDeskripsi() { return deskripsi; }
    public String getDeadline() { return deadline; }
    public String getStatus() { return status; }
    public int getPrioritas() { return prioritas; }

    // Setters
    public void setJudul(String judul) { this.judul = judul; }
    public void setMataKuliah(String mataKuliah) { this.mataKuliah = mataKuliah; }
    public void setDeskripsi(String deskripsi) { this.deskripsi = deskripsi; }
    public void setDeadline(String deadline) { this.deadline = deadline; }
    public void setStatus(String status) { this.status = status; }
    public void setPrioritas(int prioritas) { this.prioritas = prioritas; }

    public String getPrioritasString() {
        switch (prioritas) {
            case 1: return "Rendah";
            case 2: return "Sedang";
            case 3: return "Tinggi";
            default: return "Unknown";
        }
    }
}

// ==================== MAIN APPLICATION ====================
public class AplikasiPengelolaTugasKuliah extends JFrame {
    // Data
    private ArrayList<Tugas> daftarTugas;
    private int nextId = 1;

    // GUI Components
    private JTable tableTugas;
    private DefaultTableModel tableModel;
    private JTextField tfJudul, tfDeadline;
    private JComboBox<String> cbMataKuliah, cbStatus, cbPrioritas, cbFilterStatus, cbFilterMatkul;
    private JTextArea taDeskripsi;
    private JButton btnTambah, btnEdit, btnHapus, btnClear, btnStatistik;
    private JLabel lblTotalTugas, lblPending, lblProgress, lblCompleted;

    public AplikasiPengelolaTugasKuliah() {
        // Inisialisasi data
        daftarTugas = new ArrayList<>();
        initDataAwal();

        // Setup frame
        setTitle("📚 Aplikasi Pengelola Tugas Kuliah");
        setSize(1000, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Setup UI
        setupUI();

        // Load data ke tabel
        refreshTable();
        updateStatistik();

        setVisible(true);
    }

    private void setupUI() {
        // Main panel dengan BorderLayout
        setLayout(new BorderLayout(10, 10));

        // Panel Header
        add(createHeaderPanel(), BorderLayout.NORTH);

        // Panel tengah (split: form + tabel)
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
                                              createFormPanel(),
                                              createTablePanel());
        splitPane.setDividerLocation(350);
        add(splitPane, BorderLayout.CENTER);

        // Panel bawah (statistik)
        add(createStatistikPanel(), BorderLayout.SOUTH);
    }

    private JPanel createHeaderPanel() {
        JPanel panel = new JPanel();
        panel.setBackground(new Color(52, 152, 219));
        panel.setPreferredSize(new Dimension(0, 60));

        JLabel lblTitle = new JLabel("📚 PENGELOLA TUGAS KULIAH");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 24));
        lblTitle.setForeground(Color.WHITE);

        panel.add(lblTitle);
        return panel;
    }

    private JPanel createFormPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createTitledBorder("Form Tugas"));
        panel.setBackground(new Color(236, 240, 241));

        // Judul
        panel.add(createLabel("Judul Tugas:"));
        tfJudul = new JTextField();
        panel.add(createFieldPanel(tfJudul));

        // Mata Kuliah
        panel.add(createLabel("Mata Kuliah:"));
        String[] mataKuliah = {"Pemrograman Berbasis Desktop", "Basis Data",
                               "Sistem Informasi Manajemen", "Jaringan Komputer",
                               "Algoritma dan Struktur Data"};
        cbMataKuliah = new JComboBox<>(mataKuliah);
        panel.add(createFieldPanel(cbMataKuliah));

        // Deskripsi
        panel.add(createLabel("Deskripsi:"));
        taDeskripsi = new JTextArea(4, 20);
        JScrollPane scrollDesc = new JScrollPane(taDeskripsi);
        panel.add(createFieldPanel(scrollDesc));

        // Deadline
        panel.add(createLabel("Deadline (dd/MM/yyyy):"));
        tfDeadline = new JTextField();
        panel.add(createFieldPanel(tfDeadline));

        // Status
        panel.add(createLabel("Status:"));
        String[] status = {"Pending", "In Progress", "Completed"};
        cbStatus = new JComboBox<>(status);
        panel.add(createFieldPanel(cbStatus));

        // Prioritas
        panel.add(createLabel("Prioritas:"));
        String[] prioritas = {"1 - Rendah", "2 - Sedang", "3 - Tinggi"};
        cbPrioritas = new JComboBox<>(prioritas);
        panel.add(createFieldPanel(cbPrioritas));

        // Button panel
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.setBackground(new Color(236, 240, 241));

        btnTambah = createButton("Tambah", new Color(46, 204, 113));
        btnEdit = createButton("Edit", new Color(52, 152, 219));
        btnHapus = createButton("Hapus", new Color(231, 76, 60));
        btnClear = createButton("Clear", new Color(149, 165, 166));

        btnTambah.addActionListener(e -> tambahTugas());
        btnEdit.addActionListener(e -> editTugas());
        btnHapus.addActionListener(e -> hapusTugas());
        btnClear.addActionListener(e -> clearForm());

        buttonPanel.add(btnTambah);
        buttonPanel.add(btnEdit);
        buttonPanel.add(btnHapus);
        buttonPanel.add(btnClear);

        panel.add(Box.createVerticalStrut(10));
        panel.add(buttonPanel);

        return panel;
    }

    private JPanel createTablePanel() {
        JPanel panel = new JPanel(new BorderLayout(5, 5));
        panel.setBorder(BorderFactory.createTitledBorder("Daftar Tugas"));

        // Filter panel
        JPanel filterPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        filterPanel.add(new JLabel("Filter Status:"));
        String[] filterStatusOptions = {"Semua", "Pending", "In Progress", "Completed"};
        cbFilterStatus = new JComboBox<>(filterStatusOptions);
        cbFilterStatus.addActionListener(e -> filterTabel());
        filterPanel.add(cbFilterStatus);

        filterPanel.add(Box.createHorizontalStrut(20));
        filterPanel.add(new JLabel("Filter Matkul:"));
        String[] filterMatkulOptions = {"Semua", "Pemrograman Berbasis Desktop",
                                        "Basis Data", "Sistem Informasi Manajemen",
                                        "Jaringan Komputer", "Algoritma dan Struktur Data"};
        cbFilterMatkul = new JComboBox<>(filterMatkulOptions);
        cbFilterMatkul.addActionListener(e -> filterTabel());
        filterPanel.add(cbFilterMatkul);

        panel.add(filterPanel, BorderLayout.NORTH);

        // Tabel
        String[] kolom = {"ID", "Judul", "Mata Kuliah", "Deadline", "Status", "Prioritas"};
        tableModel = new DefaultTableModel(kolom, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Non-editable
            }
        };

        tableTugas = new JTable(tableModel);
        tableTugas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tableTugas.setRowHeight(25);
        tableTugas.getTableHeader().setFont(new Font("Arial", Font.BOLD, 12));

        // Double click untuk edit
        tableTugas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    loadSelectedToForm();
                }
            }
        });

        JScrollPane scrollPane = new JScrollPane(tableTugas);
        panel.add(scrollPane, BorderLayout.CENTER);

        return panel;
    }

    private JPanel createStatistikPanel() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 20, 10));
        panel.setBackground(new Color(52, 73, 94));
        panel.setPreferredSize(new Dimension(0, 60));

        lblTotalTugas = createStatLabel("Total: 0");
        lblPending = createStatLabel("Pending: 0");
        lblProgress = createStatLabel("In Progress: 0");
        lblCompleted = createStatLabel("Completed: 0");

        panel.add(lblTotalTugas);
        panel.add(createSeparator());
        panel.add(lblPending);
        panel.add(createSeparator());
        panel.add(lblProgress);
        panel.add(createSeparator());
        panel.add(lblCompleted);

        btnStatistik = new JButton("📊 Statistik Detail");
        btnStatistik.setBackground(new Color(241, 196, 15));
        btnStatistik.setForeground(Color.BLACK);
        btnStatistik.addActionListener(e -> tampilkanStatistikDetail());
        panel.add(btnStatistik);

        return panel;
    }

    // Helper methods untuk UI
    private JLabel createLabel(String text) {
        JLabel label = new JLabel(text);
        label.setAlignmentX(Component.LEFT_ALIGNMENT);
        label.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 10));
        return label;
    }

    private JPanel createFieldPanel(Component field) {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));
        panel.setBorder(BorderFactory.createEmptyBorder(0, 10, 5, 10));
        panel.setBackground(new Color(236, 240, 241));
        panel.add(field, BorderLayout.CENTER);
        return panel;
    }

    private JButton createButton(String text, Color color) {
        JButton button = new JButton(text);
        button.setBackground(color);
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setPreferredSize(new Dimension(80, 30));
        return button;
    }

    private JLabel createStatLabel(String text) {
        JLabel label = new JLabel(text);
        label.setFont(new Font("Arial", Font.BOLD, 14));
        label.setForeground(Color.WHITE);
        return label;
    }

    private JLabel createSeparator() {
        JLabel sep = new JLabel("|");
        sep.setForeground(Color.GRAY);
        return sep;
    }

    // CRUD Operations
    private void tambahTugas() {
        if (!validateForm()) return;

        String id = "T" + String.format("%03d", nextId++);
        String judul = tfJudul.getText();
        String matkul = (String) cbMataKuliah.getSelectedItem();
        String deskripsi = taDeskripsi.getText();
        String deadline = tfDeadline.getText();
        String status = (String) cbStatus.getSelectedItem();
        int prioritas = cbPrioritas.getSelectedIndex() + 1;

        Tugas tugas = new Tugas(id, judul, matkul, deskripsi, deadline, status, prioritas);
        daftarTugas.add(tugas);

        refreshTable();
        updateStatistik();
        clearForm();

        JOptionPane.showMessageDialog(this, "Tugas berhasil ditambahkan!",
                                     "Sukses", JOptionPane.INFORMATION_MESSAGE);
    }

    private void editTugas() {
        int selectedRow = tableTugas.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih tugas yang akan diedit!",
                                         "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!validateForm()) return;

        String id = (String) tableModel.getValueAt(selectedRow, 0);
        Tugas tugas = findTugasById(id);

        if (tugas != null) {
            tugas.setJudul(tfJudul.getText());
            tugas.setMataKuliah((String) cbMataKuliah.getSelectedItem());
            tugas.setDeskripsi(taDeskripsi.getText());
            tugas.setDeadline(tfDeadline.getText());
            tugas.setStatus((String) cbStatus.getSelectedItem());
            tugas.setPrioritas(cbPrioritas.getSelectedIndex() + 1);

            refreshTable();
            updateStatistik();
            clearForm();

            JOptionPane.showMessageDialog(this, "Tugas berhasil diupdate!",
                                         "Sukses", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void hapusTugas() {
        int selectedRow = tableTugas.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih tugas yang akan dihapus!",
                                         "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this,
                     "Yakin ingin menghapus tugas ini?",
                     "Konfirmasi", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            String id = (String) tableModel.getValueAt(selectedRow, 0);
            daftarTugas.removeIf(t -> t.getId().equals(id));

            refreshTable();
            updateStatistik();
            clearForm();

            JOptionPane.showMessageDialog(this, "Tugas berhasil dihapus!",
                                         "Sukses", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void clearForm() {
        tfJudul.setText("");
        cbMataKuliah.setSelectedIndex(0);
        taDeskripsi.setText("");
        tfDeadline.setText("");
        cbStatus.setSelectedIndex(0);
        cbPrioritas.setSelectedIndex(0);
        tableTugas.clearSelection();
    }

    private void loadSelectedToForm() {
        int selectedRow = tableTugas.getSelectedRow();
        if (selectedRow == -1) return;

        String id = (String) tableModel.getValueAt(selectedRow, 0);
        Tugas tugas = findTugasById(id);

        if (tugas != null) {
            tfJudul.setText(tugas.getJudul());
            cbMataKuliah.setSelectedItem(tugas.getMataKuliah());
            taDeskripsi.setText(tugas.getDeskripsi());
            tfDeadline.setText(tugas.getDeadline());
            cbStatus.setSelectedItem(tugas.getStatus());
            cbPrioritas.setSelectedIndex(tugas.getPrioritas() - 1);
        }
    }

    private void refreshTable() {
        tableModel.setRowCount(0);
        for (Tugas tugas : daftarTugas) {
            Object[] row = {
                tugas.getId(),
                tugas.getJudul(),
                tugas.getMataKuliah(),
                tugas.getDeadline(),
                tugas.getStatus(),
                tugas.getPrioritasString()
            };
            tableModel.addRow(row);
        }
    }

    private void filterTabel() {
        String filterStatus = (String) cbFilterStatus.getSelectedItem();
        String filterMatkul = (String) cbFilterMatkul.getSelectedItem();

        tableModel.setRowCount(0);
        for (Tugas tugas : daftarTugas) {
            boolean statusMatch = filterStatus.equals("Semua") || tugas.getStatus().equals(filterStatus);
            boolean matkulMatch = filterMatkul.equals("Semua") || tugas.getMataKuliah().equals(filterMatkul);

            if (statusMatch && matkulMatch) {
                Object[] row = {
                    tugas.getId(),
                    tugas.getJudul(),
                    tugas.getMataKuliah(),
                    tugas.getDeadline(),
                    tugas.getStatus(),
                    tugas.getPrioritasString()
                };
                tableModel.addRow(row);
            }
        }
    }

    private void updateStatistik() {
        int total = daftarTugas.size();
        int pending = 0, progress = 0, completed = 0;

        for (Tugas tugas : daftarTugas) {
            switch (tugas.getStatus()) {
                case "Pending": pending++; break;
                case "In Progress": progress++; break;
                case "Completed": completed++; break;
            }
        }

        lblTotalTugas.setText("Total: " + total);
        lblPending.setText("Pending: " + pending);
        lblProgress.setText("In Progress: " + progress);
        lblCompleted.setText("Completed: " + completed);
    }

    private void tampilkanStatistikDetail() {
        int total = daftarTugas.size();
        int pending = 0, progress = 0, completed = 0;
        int rendah = 0, sedang = 0, tinggi = 0;

        for (Tugas tugas : daftarTugas) {
            switch (tugas.getStatus()) {
                case "Pending": pending++; break;
                case "In Progress": progress++; break;
                case "Completed": completed++; break;
            }
            switch (tugas.getPrioritas()) {
                case 1: rendah++; break;
                case 2: sedang++; break;
                case 3: tinggi++; break;
            }
        }

        String pesan = "═══ STATISTIK DETAIL TUGAS ═══\n\n" +
                       "Total Tugas: " + total + "\n\n" +
                       "--- Berdasarkan Status ---\n" +
                       "Pending: " + pending + " (" + hitungPersentase(pending, total) + "%)\n" +
                       "In Progress: " + progress + " (" + hitungPersentase(progress, total) + "%)\n" +
                       "Completed: " + completed + " (" + hitungPersentase(completed, total) + "%)\n\n" +
                       "--- Berdasarkan Prioritas ---\n" +
                       "Rendah: " + rendah + "\n" +
                       "Sedang: " + sedang + "\n" +
                       "Tinggi: " + tinggi + "\n\n" +
                       "Progress: " + hitungPersentase(completed, total) + "% selesai";

        JOptionPane.showMessageDialog(this, pesan, "Statistik Detail",
                                     JOptionPane.INFORMATION_MESSAGE);
    }

    private double hitungPersentase(int bagian, int total) {
        if (total == 0) return 0;
        return Math.round((double) bagian / total * 100 * 10.0) / 10.0;
    }

    private boolean validateForm() {
        if (tfJudul.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Judul tugas harus diisi!",
                                         "Validasi", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (tfDeadline.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Deadline harus diisi!",
                                         "Validasi", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    private Tugas findTugasById(String id) {
        for (Tugas tugas : daftarTugas) {
            if (tugas.getId().equals(id)) {
                return tugas;
            }
        }
        return null;
    }

    private void initDataAwal() {
        daftarTugas.add(new Tugas("T001", "UAS Pemrograman Desktop",
                                  "Pemrograman Berbasis Desktop",
                                  "Buat aplikasi CRUD dengan GUI", "15/12/2024",
                                  "In Progress", 3));
        daftarTugas.add(new Tugas("T002", "Tugas Normalisasi Database",
                                  "Basis Data",
                                  "Normalisasi database perpustakaan", "10/12/2024",
                                  "Pending", 2));
        daftarTugas.add(new Tugas("T003", "Analisis Sistem Informasi",
                                  "Sistem Informasi Manajemen",
                                  "Analisis SI Rumah Sakit", "20/12/2024",
                                  "Completed", 1));
        nextId = 4;
    }

    public static void main(String[] args) {
        // Set Look and Feel
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Run application
        SwingUtilities.invokeLater(() -> new AplikasiPengelolaTugasKuliah());
    }
}
