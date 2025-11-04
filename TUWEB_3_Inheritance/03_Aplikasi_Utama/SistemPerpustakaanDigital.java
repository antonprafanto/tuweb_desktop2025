import java.util.ArrayList;
import java.util.Scanner;

/**
 * SistemPerpustakaanDigital.java
 * Aplikasi manajemen perpustakaan menggunakan konsep Inheritance
 *
 * Hierarki Class:
 * - ItemPerpustakaan (Parent)
 *   ├── Buku (Child)
 *   ├── Majalah (Child)
 *   ├── Jurnal (Child)
 *   └── DVD (Child)
 *
 * @author Anton Prafanto, S.Kom, M.T.
 * @version 1.0
 * Tutorial Ke-3: Inheritance
 */

// ==================== PARENT CLASS ====================
abstract class ItemPerpustakaan {
    protected String kode;
    protected String judul;
    protected String penerbit;
    protected int tahunTerbit;
    protected boolean tersedia;

    public ItemPerpustakaan(String kode, String judul, String penerbit, int tahunTerbit) {
        this.kode = kode;
        this.judul = judul;
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
        this.tersedia = true;
    }

    // Abstract method - harus diimplementasikan child class
    public abstract void tampilkanInfo();
    public abstract String getJenisItem();

    // Method yang bisa digunakan semua child
    public void pinjam() {
        if (tersedia) {
            tersedia = false;
            System.out.println("✅ Item berhasil dipinjam!");
        } else {
            System.out.println("❌ Item sedang dipinjam!");
        }
    }

    public void kembalikan() {
        tersedia = true;
        System.out.println("✅ Item berhasil dikembalikan!");
    }

    // Getter
    public String getKode() { return kode; }
    public String getJudul() { return judul; }
    public boolean isTersedia() { return tersedia; }
}

// ==================== CHILD CLASS 1: BUKU ====================
class Buku extends ItemPerpustakaan {
    private String pengarang;
    private int jumlahHalaman;
    private String kategori;

    public Buku(String kode, String judul, String penerbit, int tahunTerbit,
                String pengarang, int jumlahHalaman, String kategori) {
        super(kode, judul, penerbit, tahunTerbit);
        this.pengarang = pengarang;
        this.jumlahHalaman = jumlahHalaman;
        this.kategori = kategori;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║            INFORMASI BUKU              ║");
        System.out.println("╠════════════════════════════════════════╣");
        System.out.printf("║ Kode          : %-23s║\n", kode);
        System.out.printf("║ Judul         : %-23s║\n", judul);
        System.out.printf("║ Pengarang     : %-23s║\n", pengarang);
        System.out.printf("║ Penerbit      : %-23s║\n", penerbit);
        System.out.printf("║ Tahun         : %-23d║\n", tahunTerbit);
        System.out.printf("║ Halaman       : %-23d║\n", jumlahHalaman);
        System.out.printf("║ Kategori      : %-23s║\n", kategori);
        System.out.printf("║ Status        : %-23s║\n", tersedia ? "Tersedia" : "Dipinjam");
        System.out.println("╚════════════════════════════════════════╝");
    }

    @Override
    public String getJenisItem() {
        return "Buku";
    }

    public String getPengarang() { return pengarang; }
}

// ==================== CHILD CLASS 2: MAJALAH ====================
class Majalah extends ItemPerpustakaan {
    private int edisi;
    private String bulan;

    public Majalah(String kode, String judul, String penerbit, int tahunTerbit,
                   int edisi, String bulan) {
        super(kode, judul, penerbit, tahunTerbit);
        this.edisi = edisi;
        this.bulan = bulan;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║          INFORMASI MAJALAH             ║");
        System.out.println("╠════════════════════════════════════════╣");
        System.out.printf("║ Kode          : %-23s║\n", kode);
        System.out.printf("║ Judul         : %-23s║\n", judul);
        System.out.printf("║ Penerbit      : %-23s║\n", penerbit);
        System.out.printf("║ Tahun         : %-23d║\n", tahunTerbit);
        System.out.printf("║ Edisi         : %-23d║\n", edisi);
        System.out.printf("║ Bulan         : %-23s║\n", bulan);
        System.out.printf("║ Status        : %-23s║\n", tersedia ? "Tersedia" : "Dipinjam");
        System.out.println("╚════════════════════════════════════════╝");
    }

    @Override
    public String getJenisItem() {
        return "Majalah";
    }
}

// ==================== CHILD CLASS 3: JURNAL ====================
class Jurnal extends ItemPerpustakaan {
    private String bidangIlmu;
    private int volume;
    private int nomor;

    public Jurnal(String kode, String judul, String penerbit, int tahunTerbit,
                  String bidangIlmu, int volume, int nomor) {
        super(kode, judul, penerbit, tahunTerbit);
        this.bidangIlmu = bidangIlmu;
        this.volume = volume;
        this.nomor = nomor;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║           INFORMASI JURNAL             ║");
        System.out.println("╠════════════════════════════════════════╣");
        System.out.printf("║ Kode          : %-23s║\n", kode);
        System.out.printf("║ Judul         : %-23s║\n", judul);
        System.out.printf("║ Penerbit      : %-23s║\n", penerbit);
        System.out.printf("║ Tahun         : %-23d║\n", tahunTerbit);
        System.out.printf("║ Bidang Ilmu   : %-23s║\n", bidangIlmu);
        System.out.printf("║ Volume        : %-23d║\n", volume);
        System.out.printf("║ Nomor         : %-23d║\n", nomor);
        System.out.printf("║ Status        : %-23s║\n", tersedia ? "Tersedia" : "Dipinjam");
        System.out.println("╚════════════════════════════════════════╝");
    }

    @Override
    public String getJenisItem() {
        return "Jurnal";
    }
}

// ==================== CHILD CLASS 4: DVD ====================
class DVD extends ItemPerpustakaan {
    private String sutradara;
    private int durasi; // dalam menit
    private String genre;

    public DVD(String kode, String judul, String penerbit, int tahunTerbit,
               String sutradara, int durasi, String genre) {
        super(kode, judul, penerbit, tahunTerbit);
        this.sutradara = sutradara;
        this.durasi = durasi;
        this.genre = genre;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║            INFORMASI DVD               ║");
        System.out.println("╠════════════════════════════════════════╣");
        System.out.printf("║ Kode          : %-23s║\n", kode);
        System.out.printf("║ Judul         : %-23s║\n", judul);
        System.out.printf("║ Sutradara     : %-23s║\n", sutradara);
        System.out.printf("║ Studio        : %-23s║\n", penerbit);
        System.out.printf("║ Tahun         : %-23d║\n", tahunTerbit);
        System.out.printf("║ Durasi        : %-20d min║\n", durasi);
        System.out.printf("║ Genre         : %-23s║\n", genre);
        System.out.printf("║ Status        : %-23s║\n", tersedia ? "Tersedia" : "Dipinjam");
        System.out.println("╚════════════════════════════════════════╝");
    }

    @Override
    public String getJenisItem() {
        return "DVD";
    }
}

// ==================== MAIN APPLICATION ====================
public class SistemPerpustakaanDigital {
    static ArrayList<ItemPerpustakaan> koleksi = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Inisialisasi data awal
        initData();

        int pilihan;

        tampilkanHeader();

        do {
            tampilkanMenu();
            pilihan = input.nextInt();
            input.nextLine(); // Clear buffer

            System.out.println();

            switch (pilihan) {
                case 1:
                    lihatKoleksi();
                    break;
                case 2:
                    cariItem();
                    break;
                case 3:
                    tambahItem();
                    break;
                case 4:
                    pinjamItem();
                    break;
                case 5:
                    kembalikanItem();
                    break;
                case 6:
                    statistikKoleksi();
                    break;
                case 0:
                    System.out.println("═══════════════════════════════════════");
                    System.out.println("  Terima kasih telah menggunakan");
                    System.out.println("  Sistem Perpustakaan Digital!");
                    System.out.println("═══════════════════════════════════════");
                    break;
                default:
                    System.out.println("❌ Pilihan tidak valid!");
            }

            if (pilihan != 0) {
                System.out.print("\nTekan ENTER untuk melanjutkan...");
                input.nextLine();
                System.out.println();
            }

        } while (pilihan != 0);
    }

    static void tampilkanHeader() {
        System.out.println("═══════════════════════════════════════");
        System.out.println("   SISTEM PERPUSTAKAAN DIGITAL");
        System.out.println("   Universitas Terbuka");
        System.out.println("═══════════════════════════════════════");
        System.out.println("   Demonstrasi Konsep Inheritance");
        System.out.println("═══════════════════════════════════════\n");
    }

    static void tampilkanMenu() {
        System.out.println("═══════════════════════════════════════");
        System.out.println("            MENU UTAMA");
        System.out.println("═══════════════════════════════════════");
        System.out.println("1. Lihat Semua Koleksi");
        System.out.println("2. Cari Item");
        System.out.println("3. Tambah Item Baru");
        System.out.println("4. Pinjam Item");
        System.out.println("5. Kembalikan Item");
        System.out.println("6. Statistik Koleksi");
        System.out.println("0. Keluar");
        System.out.println("═══════════════════════════════════════");
        System.out.print("Pilihan Anda: ");
    }

    static void initData() {
        // Data awal buku
        koleksi.add(new Buku("B001", "Java Programming", "Informatika", 2023,
                            "John Doe", 450, "Pemrograman"));
        koleksi.add(new Buku("B002", "Database Design", "Andi Publisher", 2022,
                            "Jane Smith", 380, "Database"));
        koleksi.add(new Buku("B003", "Web Development", "Graha Ilmu", 2023,
                            "Bob Wilson", 520, "Web"));

        // Data awal majalah
        koleksi.add(new Majalah("M001", "Tech Today", "Media Tech", 2024, 145, "Januari"));
        koleksi.add(new Majalah("M002", "Science Monthly", "Ilmu Pengetahuan", 2024, 98, "Februari"));

        // Data awal jurnal
        koleksi.add(new Jurnal("J001", "AI Research", "IEEE", 2023,
                               "Artificial Intelligence", 15, 3));
        koleksi.add(new Jurnal("J002", "Data Science Review", "ACM", 2024,
                               "Data Science", 8, 1));

        // Data awal DVD
        koleksi.add(new DVD("D001", "Tutorial Java", "Oracle", 2023,
                           "Tech Team", 180, "Educational"));
        koleksi.add(new DVD("D002", "Documentary: AI", "Discovery", 2024,
                           "Science Team", 120, "Documentary"));
    }

    static void lihatKoleksi() {
        System.out.println("═══════════════════════════════════════");
        System.out.println("          DAFTAR KOLEKSI");
        System.out.println("═══════════════════════════════════════");

        if (koleksi.isEmpty()) {
            System.out.println("Koleksi masih kosong.");
            return;
        }

        // Polymorphism: semua child class diperlakukan sebagai parent
        for (ItemPerpustakaan item : koleksi) {
            System.out.printf("%-6s | %-8s | %-30s | %s\n",
                            item.getKode(),
                            item.getJenisItem(),
                            item.getJudul(),
                            item.isTersedia() ? "✅ Tersedia" : "❌ Dipinjam");
        }

        System.out.println("═══════════════════════════════════════");
        System.out.println("Total: " + koleksi.size() + " item");
    }

    static void cariItem() {
        System.out.println("═══════════════════════════════════════");
        System.out.println("            PENCARIAN ITEM");
        System.out.println("═══════════════════════════════════════");

        System.out.print("Masukkan kode atau judul: ");
        String keyword = input.nextLine().toLowerCase();

        boolean ditemukan = false;

        for (ItemPerpustakaan item : koleksi) {
            if (item.getKode().toLowerCase().contains(keyword) ||
                item.getJudul().toLowerCase().contains(keyword)) {
                System.out.println();
                item.tampilkanInfo();  // Polymorphic method call
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("\n❌ Item tidak ditemukan!");
        }
    }

    static void tambahItem() {
        System.out.println("═══════════════════════════════════════");
        System.out.println("         TAMBAH ITEM BARU");
        System.out.println("═══════════════════════════════════════");
        System.out.println("Jenis Item:");
        System.out.println("1. Buku");
        System.out.println("2. Majalah");
        System.out.println("3. Jurnal");
        System.out.println("4. DVD");
        System.out.print("Pilihan: ");
        int jenis = input.nextInt();
        input.nextLine();

        System.out.print("Kode: ");
        String kode = input.nextLine();
        System.out.print("Judul: ");
        String judul = input.nextLine();
        System.out.print("Penerbit: ");
        String penerbit = input.nextLine();
        System.out.print("Tahun Terbit: ");
        int tahun = input.nextInt();
        input.nextLine();

        switch (jenis) {
            case 1:
                System.out.print("Pengarang: ");
                String pengarang = input.nextLine();
                System.out.print("Jumlah Halaman: ");
                int halaman = input.nextInt();
                input.nextLine();
                System.out.print("Kategori: ");
                String kategori = input.nextLine();
                koleksi.add(new Buku(kode, judul, penerbit, tahun, pengarang, halaman, kategori));
                break;

            case 2:
                System.out.print("Edisi: ");
                int edisi = input.nextInt();
                input.nextLine();
                System.out.print("Bulan: ");
                String bulan = input.nextLine();
                koleksi.add(new Majalah(kode, judul, penerbit, tahun, edisi, bulan));
                break;

            case 3:
                System.out.print("Bidang Ilmu: ");
                String bidang = input.nextLine();
                System.out.print("Volume: ");
                int volume = input.nextInt();
                System.out.print("Nomor: ");
                int nomor = input.nextInt();
                input.nextLine();
                koleksi.add(new Jurnal(kode, judul, penerbit, tahun, bidang, volume, nomor));
                break;

            case 4:
                System.out.print("Sutradara: ");
                String sutradara = input.nextLine();
                System.out.print("Durasi (menit): ");
                int durasi = input.nextInt();
                input.nextLine();
                System.out.print("Genre: ");
                String genre = input.nextLine();
                koleksi.add(new DVD(kode, judul, penerbit, tahun, sutradara, durasi, genre));
                break;

            default:
                System.out.println("❌ Jenis tidak valid!");
                return;
        }

        System.out.println("\n✅ Item berhasil ditambahkan!");
    }

    static void pinjamItem() {
        System.out.println("═══════════════════════════════════════");
        System.out.println("            PEMINJAMAN");
        System.out.println("═══════════════════════════════════════");

        System.out.print("Masukkan kode item: ");
        String kode = input.nextLine();

        for (ItemPerpustakaan item : koleksi) {
            if (item.getKode().equalsIgnoreCase(kode)) {
                System.out.println();
                item.tampilkanInfo();
                System.out.println();
                item.pinjam();  // Polymorphic method call
                return;
            }
        }

        System.out.println("❌ Item tidak ditemukan!");
    }

    static void kembalikanItem() {
        System.out.println("═══════════════════════════════════════");
        System.out.println("          PENGEMBALIAN");
        System.out.println("═══════════════════════════════════════");

        System.out.print("Masukkan kode item: ");
        String kode = input.nextLine();

        for (ItemPerpustakaan item : koleksi) {
            if (item.getKode().equalsIgnoreCase(kode)) {
                System.out.println();
                item.kembalikan();  // Polymorphic method call
                return;
            }
        }

        System.out.println("❌ Item tidak ditemukan!");
    }

    static void statistikKoleksi() {
        System.out.println("═══════════════════════════════════════");
        System.out.println("        STATISTIK KOLEKSI");
        System.out.println("═══════════════════════════════════════");

        int totalBuku = 0, totalMajalah = 0, totalJurnal = 0, totalDVD = 0;
        int tersedia = 0, dipinjam = 0;

        for (ItemPerpustakaan item : koleksi) {
            // Count by type (demonstrasi instanceof)
            if (item instanceof Buku) totalBuku++;
            else if (item instanceof Majalah) totalMajalah++;
            else if (item instanceof Jurnal) totalJurnal++;
            else if (item instanceof DVD) totalDVD++;

            // Count by availability
            if (item.isTersedia()) tersedia++;
            else dipinjam++;
        }

        System.out.println("\n--- Berdasarkan Jenis ---");
        System.out.println("Buku     : " + totalBuku + " item");
        System.out.println("Majalah  : " + totalMajalah + " item");
        System.out.println("Jurnal   : " + totalJurnal + " item");
        System.out.println("DVD      : " + totalDVD + " item");

        System.out.println("\n--- Berdasarkan Status ---");
        System.out.println("Tersedia : " + tersedia + " item");
        System.out.println("Dipinjam : " + dipinjam + " item");

        System.out.println("\n═══════════════════════════════════════");
        System.out.println("Total Koleksi: " + koleksi.size() + " item");
    }
}
