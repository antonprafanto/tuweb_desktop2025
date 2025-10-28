import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Contoh Kode Sederhana Java Swing
 * 
 * File ini berisi contoh-contoh kode dasar untuk memulai GUI programming
 * dengan Java Swing. Setiap contoh mendemonstrasikan konsep fundamental
 * yang dapat dikembangkan lebih lanjut.
 * 
 * @author TUWEB GUI Programming
 * @version 1.0
 */
public class ContohKodeSederhana {

    public static void main(String[] args) {
        // Jalankan semua contoh
        SwingUtilities.invokeLater(() -> {
            showMenu();
        });
    }

    /**
     * Menu utama untuk memilih contoh yang ingin dijalankan
     */
    private static void showMenu() {
        String[] options = {
            "1. Hello World Window",
            "2. Basic Form",
            "3. Calculator",
            "4. Color Chooser",
            "5. Simple Notepad",
            "6. Image Viewer",
            "7. Timer Application",
            "8. Exit"
        };

        String choice = (String) JOptionPane.showInputDialog(
            null,
            "Pilih contoh yang ingin dijalankan:",
            "Contoh GUI Programming",
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[0]
        );

        if (choice != null && !choice.equals("8. Exit")) {
            runExample(choice);
            showMenu(); // Tampilkan menu lagi
        }
    }

    /**
     * Menjalankan contoh yang dipilih
     */
    private static void runExample(String choice) {
        switch (choice) {
            case "1. Hello World Window":
                helloWorldExample();
                break;
            case "2. Basic Form":
                basicFormExample();
                break;
            case "3. Calculator":
                calculatorExample();
                break;
            case "4. Color Chooser":
                colorChooserExample();
                break;
            case "5. Simple Notepad":
                notepadExample();
                break;
            case "6. Image Viewer":
                imageViewerExample();
                break;
            case "7. Timer Application":
                timerExample();
                break;
        }
    }

    /**
     * Contoh 1: Hello World Window
     * Mendemonstrasikan window dasar dengan label
     */
    private static void helloWorldExample() {
        JFrame frame = new JFrame("Hello World");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);

        // Label dengan teks
        JLabel label = new JLabel("Hello, World!", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 24));
        label.setForeground(Color.BLUE);

        // Button untuk menutup
        JButton closeButton = new JButton("Tutup");
        closeButton.addActionListener(e -> frame.dispose());

        // Layout
        frame.setLayout(new BorderLayout());
        frame.add(label, BorderLayout.CENTER);
        frame.add(closeButton, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    /**
     * Contoh 2: Basic Form
     * Mendemonstrasikan form dengan input validation
     */
    private static void basicFormExample() {
        JFrame frame = new JFrame("Basic Form");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);

        // Panel untuk form
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;

        // Components
        JLabel nameLabel = new JLabel("Nama:");
        JTextField nameField = new JTextField(20);

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField(20);

        JLabel ageLabel = new JLabel("Umur:");
        JSpinner ageSpinner = new JSpinner(new SpinnerNumberModel(18, 0, 120, 1));

        JLabel genderLabel = new JLabel("Gender:");
        JRadioButton maleRadio = new JRadioButton("Laki-laki");
        JRadioButton femaleRadio = new JRadioButton("Perempuan");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);

        JLabel hobbyLabel = new JLabel("Hobi:");
        JCheckBox readingCheck = new JCheckBox("Membaca");
        JCheckBox musicCheck = new JCheckBox("Musik");
        JCheckBox sportCheck = new JCheckBox("Olahraga");

        // Buttons
        JButton saveButton = new JButton("Simpan");
        JButton clearButton = new JButton("Hapus");

        // Add components to panel
        gbc.gridx = 0; gbc.gridy = 0; panel.add(nameLabel, gbc);
        gbc.gridx = 1; panel.add(nameField, gbc);

        gbc.gridx = 0; gbc.gridy = 1; panel.add(emailLabel, gbc);
        gbc.gridx = 1; panel.add(emailField, gbc);

        gbc.gridx = 0; gbc.gridy = 2; panel.add(ageLabel, gbc);
        gbc.gridx = 1; panel.add(ageSpinner, gbc);

        gbc.gridx = 0; gbc.gridy = 3; panel.add(genderLabel, gbc);
        gbc.gridx = 1;
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderPanel.add(maleRadio);
        genderPanel.add(femaleRadio);
        panel.add(genderPanel, gbc);

        gbc.gridx = 0; gbc.gridy = 4; panel.add(hobbyLabel, gbc);
        gbc.gridx = 1;
        JPanel hobbyPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        hobbyPanel.add(readingCheck);
        hobbyPanel.add(musicCheck);
        hobbyPanel.add(sportCheck);
        panel.add(hobbyPanel, gbc);

        gbc.gridx = 0; gbc.gridy = 5; gbc.gridwidth = 2;
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(saveButton);
        buttonPanel.add(clearButton);
        panel.add(buttonPanel, gbc);

        // Event handlers
        saveButton.addActionListener(e -> {
            StringBuilder hobbies = new StringBuilder();
            if (readingCheck.isSelected()) hobbies.append("Membaca, ");
            if (musicCheck.isSelected()) hobbies.append("Musik, ");
            if (sportCheck.isSelected()) hobbies.append("Olahraga, ");

            String gender = maleRadio.isSelected() ? "Laki-laki" : 
                           femaleRadio.isSelected() ? "Perempuan" : "Tidak dipilih";

            String message = String.format(
                "Data berhasil disimpan!\n\n" +
                "Nama: %s\n" +
                "Email: %s\n" +
                "Umur: %d\n" +
                "Gender: %s\n" +
                "Hobi: %s",
                nameField.getText(),
                emailField.getText(),
                (Integer) ageSpinner.getValue(),
                gender,
                hobbies.length() > 0 ? hobbies.substring(0, hobbies.length() - 2) : "Tidak ada"
            );

            JOptionPane.showMessageDialog(frame, message, "Informasi", JOptionPane.INFORMATION_MESSAGE);
        });

        clearButton.addActionListener(e -> {
            nameField.setText("");
            emailField.setText("");
            ageSpinner.setValue(18);
            genderGroup.clearSelection();
            readingCheck.setSelected(false);
            musicCheck.setSelected(false);
            sportCheck.setSelected(false);
        });

        frame.add(panel);
        frame.setVisible(true);
    }

    /**
     * Contoh 3: Calculator
     * Mendemonstrasikan event handling dan layout yang kompleks
     */
    private static void calculatorExample() {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setLocationRelativeTo(null);

        // Display
        JTextField display = new JTextField();
        display.setFont(new Font("Arial", Font.BOLD, 24));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        display.setBackground(Color.WHITE);

        // Button panel
        JPanel buttonPanel = new JPanel(new GridLayout(4, 4, 5, 5));

        // Calculator buttons
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        JButton[] calcButtons = new JButton[buttons.length];
        for (int i = 0; i < buttons.length; i++) {
            calcButtons[i] = new JButton(buttons[i]);
            calcButtons[i].setFont(new Font("Arial", Font.BOLD, 18));
            buttonPanel.add(calcButtons[i]);
        }

        // Calculator logic
        String currentInput = "";
        String operator = "";
        double firstOperand = 0;
        boolean newInput = true;

        // Button event handlers
        for (int i = 0; i < buttons.length; i++) {
            final String buttonText = buttons[i];
            calcButtons[i].addActionListener(e -> {
                if (Character.isDigit(buttonText.charAt(0))) {
                    if (newInput) {
                        currentInput = buttonText;
                        newInput = false;
                    } else {
                        currentInput += buttonText;
                    }
                    display.setText(currentInput);
                } else if (buttonText.equals("C")) {
                    currentInput = "";
                    operator = "";
                    firstOperand = 0;
                    display.setText("");
                    newInput = true;
                } else if (buttonText.equals("=")) {
                    if (!currentInput.isEmpty() && !operator.isEmpty()) {
                        double secondOperand = Double.parseDouble(currentInput);
                        double result = 0;

                        switch (operator) {
                            case "+": result = firstOperand + secondOperand; break;
                            case "-": result = firstOperand - secondOperand; break;
                            case "*": result = firstOperand * secondOperand; break;
                            case "/": 
                                if (secondOperand != 0) {
                                    result = firstOperand / secondOperand;
                                } else {
                                    display.setText("Error");
                                    return;
                                }
                                break;
                        }

                        display.setText(String.valueOf(result));
                        currentInput = String.valueOf(result);
                        operator = "";
                        newInput = true;
                    }
                } else {
                    if (!currentInput.isEmpty()) {
                        firstOperand = Double.parseDouble(currentInput);
                        operator = buttonText;
                        currentInput = "";
                        newInput = true;
                    }
                }
            });
        }

        // Layout
        frame.setLayout(new BorderLayout(10, 10));
        frame.add(display, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.CENTER);

        // Padding
        JPanel paddingPanel = new JPanel(new BorderLayout());
        paddingPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        paddingPanel.add(display, BorderLayout.NORTH);
        paddingPanel.add(buttonPanel, BorderLayout.CENTER);
        frame.add(paddingPanel);

        frame.setVisible(true);
    }

    /**
     * Contoh 4: Color Chooser
     * Mendemonstrasikan JColorChooser dan custom painting
     */
    private static void colorChooserExample() {
        JFrame frame = new JFrame("Color Chooser");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);

        // Panel untuk menampilkan warna
        JPanel colorPanel = new JPanel() {
            private Color backgroundColor = Color.WHITE;

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(backgroundColor);
                g.fillRect(0, 0, getWidth(), getHeight());
            }

            public void setColor(Color color) {
                this.backgroundColor = color;
                repaint();
            }
        };

        // Control panel
        JPanel controlPanel = new JPanel(new FlowLayout());

        JButton chooseColorButton = new JButton("Pilih Warna");
        JButton redButton = new JButton("Merah");
        JButton greenButton = new JButton("Hijau");
        JButton blueButton = new JButton("Biru");
        JButton randomButton = new JButton("Acak");

        // Color info label
        JLabel colorInfoLabel = new JLabel("RGB: (255, 255, 255)");
        colorInfoLabel.setFont(new Font("Monospaced", Font.BOLD, 14));

        // Event handlers
        chooseColorButton.addActionListener(e -> {
            Color chosenColor = JColorChooser.showDialog(
                frame, 
                "Pilih Warna", 
                colorPanel.getBackground()
            );
            if (chosenColor != null) {
                colorPanel.setBackground(chosenColor);
                colorInfoLabel.setText(String.format("RGB: (%d, %d, %d)", 
                    chosenColor.getRed(), 
                    chosenColor.getGreen(), 
                    chosenColor.getBlue()));
            }
        });

        redButton.addActionListener(e -> {
            colorPanel.setBackground(Color.RED);
            colorInfoLabel.setText("RGB: (255, 0, 0)");
        });

        greenButton.addActionListener(e -> {
            colorPanel.setBackground(Color.GREEN);
            colorInfoLabel.setText("RGB: (0, 255, 0)");
        });

        blueButton.addActionListener(e -> {
            colorPanel.setBackground(Color.BLUE);
            colorInfoLabel.setText("RGB: (0, 0, 255)");
        });

        randomButton.addActionListener(e -> {
            Color randomColor = new Color(
                (int) (Math.random() * 256),
                (int) (Math.random() * 256),
                (int) (Math.random() * 256)
            );
            colorPanel.setBackground(randomColor);
            colorInfoLabel.setText(String.format("RGB: (%d, %d, %d)", 
                randomColor.getRed(), 
                randomColor.getGreen(), 
                randomColor.getBlue()));
        });

        // Add components
        controlPanel.add(chooseColorButton);
        controlPanel.add(redButton);
        controlPanel.add(greenButton);
        controlPanel.add(blueButton);
        controlPanel.add(randomButton);

        // Layout
        frame.setLayout(new BorderLayout(10, 10));
        frame.add(colorPanel, BorderLayout.CENTER);
        frame.add(controlPanel, BorderLayout.NORTH);
        frame.add(colorInfoLabel, BorderLayout.SOUTH);

        // Padding
        JPanel paddingPanel = new JPanel(new BorderLayout());
        paddingPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        paddingPanel.add(controlPanel, BorderLayout.NORTH);
        paddingPanel.add(colorPanel, BorderLayout.CENTER);
        paddingPanel.add(colorInfoLabel, BorderLayout.SOUTH);
        frame.add(paddingPanel);

        frame.setVisible(true);
    }

    /**
     * Contoh 5: Simple Notepad
     * Mendemonstrasikan text area dan menu
     */
    private static void notepadExample() {
        JFrame frame = new JFrame("Simple Notepad");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);

        // Menu bar
        JMenuBar menuBar = new JMenuBar();

        // File menu
        JMenu fileMenu = new JMenu("File");
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        // Edit menu
        JMenu editMenu = new JMenu("Edit");
        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem pasteItem = new JMenuItem("Paste");
        JMenuItem clearItem = new JMenuItem("Clear All");

        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);
        editMenu.addSeparator();
        editMenu.add(clearItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        // Text area
        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Status bar
        JLabel statusLabel = new JLabel("Ready");
        statusLabel.setBorder(BorderFactory.createEtchedBorder());

        // Event handlers
        newItem.addActionListener(e -> {
            textArea.setText("");
            statusLabel.setText("New document created");
        });

        openItem.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            if (fileChooser.showOpenDialog(frame) == JFileChooser.APPROVE_OPTION) {
                try {
                    java.io.File file = fileChooser.getSelectedFile();
                    java.util.Scanner scanner = new java.util.Scanner(file);
                    StringBuilder content = new StringBuilder();
                    while (scanner.hasNextLine()) {
                        content.append(scanner.nextLine()).append("\n");
                    }
                    scanner.close();
                    textArea.setText(content.toString());
                    statusLabel.setText("Opened: " + file.getName());
                } catch (java.io.IOException ex) {
                    JOptionPane.showMessageDialog(frame, "Error opening file: " + ex.getMessage());
                }
            }
        });

        saveItem.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            if (fileChooser.showSaveDialog(frame) == JFileChooser.APPROVE_OPTION) {
                try {
                    java.io.File file = fileChooser.getSelectedFile();
                    java.io.FileWriter writer = new java.io.FileWriter(file);
                    writer.write(textArea.getText());
                    writer.close();
                    statusLabel.setText("Saved: " + file.getName());
                } catch (java.io.IOException ex) {
                    JOptionPane.showMessageDialog(frame, "Error saving file: " + ex.getMessage());
                }
            }
        });

        exitItem.addActionListener(e -> frame.dispose());

        cutItem.addActionListener(e -> {
            textArea.cut();
            statusLabel.setText("Text cut");
        });

        copyItem.addActionListener(e -> {
            textArea.copy();
            statusLabel.setText("Text copied");
        });

        pasteItem.addActionListener(e -> {
            textArea.paste();
            statusLabel.setText("Text pasted");
        });

        clearItem.addActionListener(e -> {
            textArea.setText("");
            statusLabel.setText("Text cleared");
        });

        // Text area listener
        textArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                int lineCount = textArea.getLineCount();
                int caretPosition = textArea.getCaretPosition();
                try {
                    int currentLine = textArea.getLineOfOffset(caretPosition) + 1;
                    statusLabel.setText("Line: " + currentLine + "/" + lineCount + " | Chars: " + textArea.getText().length());
                } catch (Exception ex) {
                    statusLabel.setText("Chars: " + textArea.getText().length());
                }
            }
        });

        // Layout
        frame.setJMenuBar(menuBar);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(statusLabel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    /**
     * Contoh 6: Image Viewer
     * Mendemonstrasikan file chooser dan image display
     */
    private static void imageViewerExample() {
        JFrame frame = new JFrame("Image Viewer");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);

        // Image label
        JLabel imageLabel = new JLabel("No image loaded", SwingConstants.CENTER);
        imageLabel.setBorder(BorderFactory.createLineBorder(Color.GRAY));

        // Control panel
        JPanel controlPanel = new JPanel(new FlowLayout());

        JButton openButton = new JButton("Open Image");
        JButton zoomInButton = new JButton("Zoom In");
        JButton zoomOutButton = new JButton("Zoom Out");
        JButton fitButton = new JButton("Fit to Window");

        // Info label
        JLabel infoLabel = new JLabel("Image: None | Size: 0x0 | Zoom: 100%");
        infoLabel.setBorder(BorderFactory.createEtchedBorder());

        // Image properties
        ImageIcon originalIcon = null;
        double zoomFactor = 1.0;

        // Event handlers
        openButton.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter(
                "Image Files", "jpg", "jpeg", "png", "gif", "bmp"
            ));

            if (fileChooser.showOpenDialog(frame) == JFileChooser.APPROVE_OPTION) {
                java.io.File file = fileChooser.getSelectedFile();
                originalIcon = new ImageIcon(file.getAbsolutePath());
                zoomFactor = 1.0;
                updateImageDisplay(imageLabel, originalIcon, zoomFactor, infoLabel);
            }
        });

        zoomInButton.addActionListener(e -> {
            if (originalIcon != null) {
                zoomFactor *= 1.2;
                updateImageDisplay(imageLabel, originalIcon, zoomFactor, infoLabel);
            }
        });

        zoomOutButton.addActionListener(e -> {
            if (originalIcon != null) {
                zoomFactor /= 1.2;
                updateImageDisplay(imageLabel, originalIcon, zoomFactor, infoLabel);
            }
        });

        fitButton.addActionListener(e -> {
            if (originalIcon != null) {
                // Calculate zoom to fit window
                int imageWidth = originalIcon.getIconWidth();
                int imageHeight = originalIcon.getIconHeight();
                int panelWidth = imageLabel.getWidth();
                int panelHeight = imageLabel.getHeight();

                double scaleX = (double) panelWidth / imageWidth;
                double scaleY = (double) panelHeight / imageHeight;
                zoomFactor = Math.min(scaleX, scaleY) * 0.9; // 90% of available space

                updateImageDisplay(imageLabel, originalIcon, zoomFactor, infoLabel);
            }
        });

        // Layout
        controlPanel.add(openButton);
        controlPanel.add(zoomInButton);
        controlPanel.add(zoomOutButton);
        controlPanel.add(fitButton);

        frame.setLayout(new BorderLayout(10, 10));
        frame.add(new JScrollPane(imageLabel), BorderLayout.CENTER);
        frame.add(controlPanel, BorderLayout.NORTH);
        frame.add(infoLabel, BorderLayout.SOUTH);

        // Padding
        JPanel paddingPanel = new JPanel(new BorderLayout());
        paddingPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        paddingPanel.add(controlPanel, BorderLayout.NORTH);
        paddingPanel.add(new JScrollPane(imageLabel), BorderLayout.CENTER);
        paddingPanel.add(infoLabel, BorderLayout.SOUTH);
        frame.add(paddingPanel);

        frame.setVisible(true);
    }

    /**
     * Helper method untuk update image display
     */
    private static void updateImageDisplay(JLabel label, ImageIcon icon, double zoom, JLabel infoLabel) {
        if (icon != null) {
            int width = (int) (icon.getIconWidth() * zoom);
            int height = (int) (icon.getIconHeight() * zoom);
            
            Image scaledImage = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
            label.setIcon(new ImageIcon(scaledImage));
            
            infoLabel.setText(String.format("Image: Loaded | Size: %dx%d | Zoom: %.0f%%", 
                icon.getIconWidth(), icon.getIconHeight(), zoom * 100));
        }
    }

    /**
     * Contoh 7: Timer Application
     * Mendemonstrasikan Timer dan threading
     */
    private static void timerExample() {
        JFrame frame = new JFrame("Timer Application");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);

        // Timer display
        JLabel timeLabel = new JLabel("00:00:00", SwingConstants.CENTER);
        timeLabel.setFont(new Font("Digital-7", Font.BOLD, 48));
        timeLabel.setForeground(Color.RED);
        timeLabel.setBackground(Color.BLACK);
        timeLabel.setOpaque(true);

        // Control panel
        JPanel controlPanel = new JPanel(new FlowLayout());

        JButton startButton = new JButton("Start");
        JButton stopButton = new JButton("Stop");
        JButton resetButton = new JButton("Reset");
        JButton lapButton = new JButton("Lap");

        // Lap times
        DefaultListModel<String> lapModel = new DefaultListModel<>();
        JList<String> lapList = new JList<>(lapModel);
        JScrollPane lapScrollPane = new JScrollPane(lapList);
        lapScrollPane.setPreferredSize(new Dimension(150, 100));

        // Timer variables
        Timer timer;
        int seconds = 0;
        boolean isRunning = false;

        // Timer setup
        timer = new Timer(1000, e -> {
            seconds++;
            updateTimeDisplay(timeLabel, seconds);
        });

        // Event handlers
        startButton.addActionListener(e -> {
            if (!isRunning) {
                timer.start();
                isRunning = true;
                startButton.setEnabled(false);
                stopButton.setEnabled(true);
            }
        });

        stopButton.addActionListener(e -> {
            if (isRunning) {
                timer.stop();
                isRunning = false;
                startButton.setEnabled(true);
                stopButton.setEnabled(false);
            }
        });

        resetButton.addActionListener(e -> {
            timer.stop();
            seconds = 0;
            isRunning = false;
            updateTimeDisplay(timeLabel, seconds);
            lapModel.clear();
            startButton.setEnabled(true);
            stopButton.setEnabled(false);
        });

        lapButton.addActionListener(e -> {
            if (isRunning) {
                String lapTime = formatTime(seconds);
                lapModel.addElement("Lap " + (lapModel.getSize() + 1) + ": " + lapTime);
            }
        });

        // Initial state
        stopButton.setEnabled(false);

        // Layout
        controlPanel.add(startButton);
        controlPanel.add(stopButton);
        controlPanel.add(resetButton);
        controlPanel.add(lapButton);

        frame.setLayout(new BorderLayout(10, 10));
        frame.add(timeLabel, BorderLayout.NORTH);
        frame.add(controlPanel, BorderLayout.CENTER);
        frame.add(lapScrollPane, BorderLayout.SOUTH);

        // Padding
        JPanel paddingPanel = new JPanel(new BorderLayout());
        paddingPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        paddingPanel.add(timeLabel, BorderLayout.NORTH);
        paddingPanel.add(controlPanel, BorderLayout.CENTER);
        paddingPanel.add(lapScrollPane, BorderLayout.SOUTH);
        frame.add(paddingPanel);

        frame.setVisible(true);
    }

    /**
     * Helper method untuk update time display
     */
    private static void updateTimeDisplay(JLabel label, int totalSeconds) {
        label.setText(formatTime(totalSeconds));
    }

    /**
     * Helper method untuk format time
     */
    private static String formatTime(int totalSeconds) {
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}