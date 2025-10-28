import java.util.ArrayList;
import java.util.Scanner;

/**
 * Sistem Manajemen Kendaraan
 * Demonstrasi konsep inheritance dalam aplikasi nyata
 */
class SistemManajemenKendaraan {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Kendaraan> daftarKendaraan = new ArrayList<>();
        
        System.out.println("=================================");
        System.out.println("  SISTEM MANAJEMEN KENDARAAN  ");
        System.out.println("=================================");
        
        // Tambah data kendaraan sample
        tambahSampleData(daftarKendaraan);
        
        // Menu utama
        int pilihan;
        do {
            tampilkanMenu();
            System.out.print("Pilih menu (1-6): ");
            pilihan = input.nextInt();
            input.nextLine(); // Clear buffer
            
            switch (pilihan) {
                case 1:
                    tambahKendaraan(daftarKendaraan, input);
                    break;
                case 2:
                    tampilkanSemuaKendaraan(daftarKendaraan);
                    break;
                case 3:
                    cariKendaraan(daftarKendaraan, input);
                    break;
                case 4:
                    updateKendaraan(daftarKendaraan, input);
                    break;
                case 5:
                    hapusKendaraan(daftarKendaraan, input);
                    break;
                case 6:
                    System.out.println("Terima kasih telah menggunakan sistem ini!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
            
            if (pilihan != 6) {
                System.out.println("\nTekan Enter untuk melanjutkan...");
                input.nextLine();
            }
            
        } while (pilihan != 6);
        
        input.close();
    }
    
    // Method untuk menampilkan menu
    public static void tampilkanMenu() {
        System.out.println("\n=================================");
        System.out.println("           MENU UTAMA           ");
        System.out.println("=================================");
        System.out.println("1. Tambah Kendaraan");
        System.out.println("2. Tampilkan Semua Kendaraan");
        System.out.println("3. Cari Kendaraan");
        System.out.println("4. Update Kendaraan");
        System.out.println("5. Hapus Kendaraan");
        System.out.println("6. Keluar");
        System.out.println("=================================");
    }
    
    // Method untuk menambah sample data
    public static void tambahSampleData(ArrayList<Kendaraan> daftar) {
        daftar.add(new Mobil("Toyota", 2020, "Avanza", 4));
        daftar.add(new Motor("Honda", 2021, "CBR", "Sport"));
        daftar.add(new Mobil("Suzuki", 2019, "Ertiga", 7));
        daftar.add(new Motor("Yamaha", 2022, "NMAX", "Matic"));
        daftar.add(new Mobil("Daihatsu", 2021, "Xenia", 6));
    }
    
    // Method untuk menambah kendaraan baru
    public static void tambahKendaraan(ArrayList<Kendaraan> daftar, Scanner input) {
        System.out.println("\n--- TAMBAH KENDARAAN BARU ---");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.print("Pilih jenis kendaraan (1-2): ");
        int jenis = input.nextInt();
        input.nextLine();
        
        System.out.print("Masukkan merk: ");
        String merk = input.nextLine();
        
        System.out.print("Masukkan tahun: ");
        int tahun = input.nextInt();
        input.nextLine();
        
        if (jenis == 1) {
            System.out.print("Masukkan model: ");
            String model = input.nextLine();
            
            System.out.print("Masukkan jumlah pintu: ");
            int jumlahPintu = input.nextInt();
            input.nextLine();
            
            Mobil mobil = new Mobil(merk, tahun, model, jumlahPintu);
            daftar.add(mobil);
            System.out.println("Mobil berhasil ditambahkan!");
            
        } else if (jenis == 2) {
            System.out.print("Masukkan tipe: ");
            String tipe = input.nextLine();
            
            System.out.print("Masukkan jenis motor: ");
            String jenisMotor = input.nextLine();
            
            Motor motor = new Motor(merk, tahun, tipe, jenisMotor);
            daftar.add(motor);
            System.out.println("Motor berhasil ditambahkan!");
            
        } else {
            System.out.println("Jenis kendaraan tidak valid!");
        }
    }
    
    // Method untuk menampilkan semua kendaraan
    public static void tampilkanSemuaKendaraan(ArrayList<Kendaraan> daftar) {
        System.out.println("\n--- DAFTAR SEMUA KENDARAAN ---");
        
        if (daftar.isEmpty()) {
            System.out.println("Belum ada data kendaraan!");
            return;
        }
        
        for (int i = 0; i < daftar.size(); i++) {
            System.out.println("\n[" + (i + 1) + "]");
            Kendaraan k = daftar.get(i);
            k.info();
            
            // Polymorphism: method khusus berdasarkan tipe objek
            if (k instanceof Mobil) {
                Mobil mobil = (Mobil) k;
                mobil.bukaPintu();
            } else if (k instanceof Motor) {
                Motor motor = (Motor) k;
                motor.standar();
            }
            
            System.out.println("Status: " + (k.isStatus() ? "Aktif" : "Tidak Aktif"));
        }
    }
    
    // Method untuk mencari kendaraan
    public static void cariKendaraan(ArrayList<Kendaraan> daftar, Scanner input) {
        System.out.println("\n--- CARI KENDARAAN ---");
        System.out.print("Masukkan merk yang dicari: ");
        String merkDicari = input.nextLine();
        
        boolean ditemukan = false;
        for (int i = 0; i < daftar.size(); i++) {
            Kendaraan k = daftar.get(i);
            if (k.getMerk().toLowerCase().contains(merkDicari.toLowerCase())) {
                System.out.println("\n[" + (i + 1) + "]");
                k.info();
                ditemukan = true;
            }
        }
        
        if (!ditemukan) {
            System.out.println("Kendaraan dengan merk '" + merkDicari + "' tidak ditemukan!");
        }
    }
    
    // Method untuk update kendaraan
    public static void updateKendaraan(ArrayList<Kendaraan> daftar, Scanner input) {
        System.out.println("\n--- UPDATE KENDARAAN ---");
        
        if (daftar.isEmpty()) {
            System.out.println("Belum ada data kendaraan!");
            return;
        }
        
        // Tampilkan daftar untuk dipilih
        for (int i = 0; i < daftar.size(); i++) {
            System.out.println("[" + (i + 1) + "] " + daftar.get(i).getMerk() + " (" + daftar.get(i).getTahun() + ")");
        }
        
        System.out.print("Pilih nomor kendaraan yang akan diupdate: ");
        int nomor = input.nextInt();
        input.nextLine();
        
        if (nomor < 1 || nomor > daftar.size()) {
            System.out.println("Nomor tidak valid!");
            return;
        }
        
        Kendaraan k = daftar.get(nomor - 1);
        
        System.out.print("Masukkan merk baru (kosongkan jika tidak diubah): ");
        String merkBaru = input.nextLine();
        
        System.out.print("Masukkan tahun baru (0 jika tidak diubah): ");
        int tahunBaru = input.nextInt();
        input.nextLine();
        
        // Update data
        if (!merkBaru.isEmpty()) {
            k.setMerk(merkBaru);
        }
        if (tahunBaru != 0) {
            k.setTahun(tahunBaru);
        }
        
        System.out.println("Data kendaraan berhasil diupdate!");
        k.info();
    }
    
    // Method untuk hapus kendaraan
    public static void hapusKendaraan(ArrayList<Kendaraan> daftar, Scanner input) {
        System.out.println("\n--- HAPUS KENDARAAN ---");
        
        if (daftar.isEmpty()) {
            System.out.println("Belum ada data kendaraan!");
            return;
        }
        
        // Tampilkan daftar untuk dipilih
        for (int i = 0; i < daftar.size(); i++) {
            System.out.println("[" + (i + 1) + "] " + daftar.get(i).getMerk() + " (" + daftar.get(i).getTahun() + ")");
        }
        
        System.out.print("Pilih nomor kendaraan yang akan dihapus: ");
        int nomor = input.nextInt();
        input.nextLine();
        
        if (nomor < 1 || nomor > daftar.size()) {
            System.out.println("Nomor tidak valid!");
            return;
        }
        
        Kendaraan k = daftar.get(nomor - 1);
        System.out.print("Apakah yakin ingin menghapus " + k.getMerk() + "? (y/n): ");
        String konfirmasi = input.nextLine();
        
        if (konfirmasi.equalsIgnoreCase("y")) {
            daftar.remove(nomor - 1);
            System.out.println("Kendaraan berhasil dihapus!");
        } else {
            System.out.println("Penghapusan dibatalkan!");
        }
    }
}

// Parent Class - Kendaraan
abstract class Kendaraan {
    protected String merk;
    protected int tahun;
    protected boolean status;
    
    public Kendaraan(String merk, int tahun) {
        this.merk = merk;
        this.tahun = tahun;
        this.status = true; // Default aktif
    }
    
    // Abstract method - wajib diimplementasikan subclass
    public abstract void info();
    
    // Concrete method - bisa digunakan subclass
    public void start() {
        System.out.println(merk + " dinyalakan...");
    }
    
    public void stop() {
        System.out.println(merk + " dimatikan...");
    }
    
    // Getter dan Setter
    public String getMerk() { return merk; }
    public void setMerk(String merk) { this.merk = merk; }
    
    public int getTahun() { return tahun; }
    public void setTahun(int tahun) { this.tahun = tahun; }
    
    public boolean isStatus() { return status; }
    public void setStatus(boolean status) { this.status = status; }
}

// Child Class 1 - Mobil
class Mobil extends Kendaraan {
    private String model;
    private int jumlahPintu;
    
    public Mobil(String merk, int tahun, String model, int jumlahPintu) {
        super(merk, tahun); // Panggil constructor parent
        this.model = model;
        this.jumlahPintu = jumlahPintu;
    }
    
    @Override // Override abstract method dari parent
    public void info() {
        System.out.println("Mobil - Merk: " + merk + ", Model: " + model + 
                         ", Tahun: " + tahun + ", Pintu: " + jumlahPintu);
    }
    
    // Method khusus Mobil
    public void bukaPintu() {
        System.out.println("Membuka " + jumlahPintu + " pintu mobil " + merk);
    }
    
    public void bukaBagasi() {
        System.out.println("Membuka bagasi mobil " + merk);
    }
    
    // Getter dan Setter tambahan
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
    
    public int getJumlahPintu() { return jumlahPintu; }
    public void setJumlahPintu(int jumlahPintu) { this.jumlahPintu = jumlahPintu; }
}

// Child Class 2 - Motor
class Motor extends Kendaraan {
    private String tipe;
    private String jenisMotor;
    
    public Motor(String merk, int tahun, String tipe, String jenisMotor) {
        super(merk, tahun);
        this.tipe = tipe;
        this.jenisMotor = jenisMotor;
    }
    
    @Override
    public void info() {
        System.out.println("Motor - Merk: " + merk + ", Tipe: " + tipe + 
                         ", Tahun: " + tahun + ", Jenis: " + jenisMotor);
    }
    
    // Method khusus Motor
    public void standar() {
        System.out.println("Motor " + merk + " diletakkan di standar");
    }
    
    public void stang() {
        System.out.println("Motor " + merk + " menggunakan stang untuk kemudi");
    }
    
    // Override method parent dengan tambahan perilaku
    @Override
    public void start() {
        System.out.println("Motor " + merk + " dinyalakan dengan starter elektrik...");
        super.start(); // Panggil method parent
    }
    
    // Getter dan Setter tambahan
    public String getTipe() { return tipe; }
    public void setTipe(String tipe) { this.tipe = tipe; }
    
    public String getJenisMotor() { return jenisMotor; }
    public void setJenisMotor(String jenisMotor) { this.jenisMotor = jenisMotor; }
}