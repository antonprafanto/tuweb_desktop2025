/**
 * Contoh Kode Sederhana - Demonstrasi OOP Dasar
 * File pendukung untuk mahasiswa pemula
 */

class ContohKodeSederhanaOOP {
    
    public static void main(String[] args) {
        
        System.out.println("=== CONTOH DASAR OOP & INHERITANCE ===\n");
        
        // 1. Membuat Object dari Class
        System.out.println("1. MEMBUAT OBJECT:");
        Mahasiswa mhs1 = new Mahasiswa("Andi", "2021001", 3.75);
        Mahasiswa mhs2 = new Mahasiswa("Budi", "2021002", 3.50);
        
        mhs1.info();
        mhs2.info();
        
        // 2. Inheritance - Parent dan Child Class
        System.out.println("\n2. INHERITANCE:");
        Hewan kucing = new Kucing("Tom");
        Hewan anjing = new Anjing("Spike");
        
        kucing.bersuara();
        anjing.bersuara();
        
        // 3. Polymorphism - Satu Interface, Multiple Implementations
        System.out.println("\n3. POLYMORPHISM:");
        BangunDatar persegi = new Persegi(5);
        BangunDatar lingkaran = new Lingkaran(7);
        
        System.out.println("Luas Persegi: " + persegi.hitungLuas());
        System.out.println("Luas Lingkaran: " + lingkaran.hitungLuas());
        
        // 4. Encapsulation - Private Fields dengan Public Methods
        System.out.println("\n4. ENCAPSULATION:");
        RekeningBank rekening = new RekeningBank("12345", 1000000);
        
        System.out.println("Saldo awal: Rp " + rekening.getSaldo());
        rekening.setor(500000);
        System.out.println("Saldo setelah setor: Rp " + rekening.getSaldo());
        rekening.tarik(200000);
        System.out.println("Saldo setelah tarik: Rp " + rekening.getSaldo());
        
        // 5. Method Overriding
        System.out.println("\n5. METHOD OVERRIDING:");
        Kendaraan mobil = new Mobil("Toyota", 2020, "Sedan", 4);
        Kendaraan motor = new Motor("Honda", 2021, "Sport", "Manual");
        
        mobil.info();
        motor.info();
        
        // 6. Super Keyword
        System.out.println("\n6. SUPER KEYWORD:");
        mobil.start(); // Memanggil method parent dan child
        motor.start(); // Memanggil method parent dan child
        
        // 7. instanceof dan Type Casting
        System.out.println("\n7. TYPE CHECKING & CASTING:");
        Object[] objects = {mhs1, kucing, persegi, mobil};
        
        for (Object obj : objects) {
            System.out.println("Object: " + obj.getClass().getSimpleName());
            
            if (obj instanceof Mahasiswa) {
                Mahasiswa mhs = (Mahasiswa) obj;
                System.out.println("  - Ini adalah Mahasiswa dengan IPK: " + mhs.getIpk());
            } else if (obj instanceof Hewan) {
                Hewan hewan = (Hewan) obj;
                hewan.bersuara();
            } else if (obj instanceof BangunDatar) {
                BangunDatar bangun = (BangunDatar) obj;
                System.out.println("  - Luas: " + bangun.hitungLuas());
            } else if (obj instanceof Kendaraan) {
                Kendaraan kendaraan = (Kendaraan) obj;
                kendaraan.info();
            }
        }
        
        // 8. Abstract Class
        System.out.println("\n8. ABSTRACT CLASS:");
        // Tidak bisa membuat object dari abstract class
        // Pegawai pegawai = new Pegawai(); // ERROR!
        
        Pegawai dosen = new Dosen("Dr. Budi", "D001", "Teknik Informatika");
        Pegawai staff = new Staff("Ani", "S001", "Administrasi");
        
        dosen.info();
        dosen.kerja();
        
        staff.info();
        staff.kerja();
        
        // 9. Multilevel Inheritance
        System.out.println("\n9. MULTILEVEL INHERITANCE:");
        MobilSport sportCar = new MobilSport("Ferrari", 2022, "F8", 2, 350);
        sportCar.info();
        sportCar.aktifkanTurbo();
        
        System.out.println("\n=== SELESAI ===");
    }
}

// 1. Basic Class
class Mahasiswa {
    private String nama;
    private String nim;
    private double ipk;
    
    public Mahasiswa(String nama, String nim, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
    }
    
    public void info() {
        System.out.println("Mahasiswa: " + nama + ", NIM: " + nim + ", IPK: " + ipk);
    }
    
    // Getters
    public String getNama() { return nama; }
    public String getNim() { return nim; }
    public double getIpk() { return ipk; }
    
    // Setters
    public void setNama(String nama) { this.nama = nama; }
    public void setNim(String nim) { this.nim = nim; }
    public void setIpk(double ipk) { this.ipk = ipk; }
}

// 2. Inheritance Example
abstract class Hewan {
    protected String nama;
    
    public Hewan(String nama) {
        this.nama = nama;
    }
    
    public abstract void bersuara();
    
    public void makan() {
        System.out.println(nama + " sedang makan");
    }
}

class Kucing extends Hewan {
    public Kucing(String nama) {
        super(nama);
    }
    
    @Override
    public void bersuara() {
        System.out.println(nama + " mengatakan: Meow!");
    }
}

class Anjing extends Hewan {
    public Anjing(String nama) {
        super(nama);
    }
    
    @Override
    public void bersuara() {
        System.out.println(nama + " mengatakan: Guk guk!");
    }
}

// 3. Polymorphism Example
abstract class BangunDatar {
    public abstract double hitungLuas();
    
    public void info() {
        System.out.println("Ini adalah bangun datar");
    }
}

class Persegi extends BangunDatar {
    private double sisi;
    
    public Persegi(double sisi) {
        this.sisi = sisi;
    }
    
    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }
    
    @Override
    public void info() {
        System.out.println("Ini adalah persegi dengan sisi " + sisi);
    }
}

class Lingkaran extends BangunDatar {
    private double jariJari;
    
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }
    
    @Override
    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }
    
    @Override
    public void info() {
        System.out.println("Ini adalah lingkaran dengan jari-jari " + jariJari);
    }
}

// 4. Encapsulation Example
class RekeningBank {
    private String nomorRekening;
    private double saldo;
    
    public RekeningBank(String nomorRekening, double saldoAwal) {
        this.nomorRekening = nomorRekening;
        this.saldo = saldoAwal;
    }
    
    public void setor(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Berhasil setor Rp " + jumlah);
        } else {
            System.out.println("Jumlah setor harus positif!");
        }
    }
    
    public void tarik(double jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Berhasil tarik Rp " + jumlah);
        } else {
            System.out.println("Jumlah tarik tidak valid!");
        }
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public String getNomorRekening() {
        return nomorRekening;
    }
}

// 5. Method Overriding Example - Using classes defined above

// 8. Abstract Class Example
abstract class Pegawai {
    protected String nama;
    protected String nip;
    
    public Pegawai(String nama, String nip) {
        this.nama = nama;
        this.nip = nip;
    }
    
    public abstract void info();
    public abstract void kerja();
    
    public void absen() {
        System.out.println(nama + " melakukan absensi");
    }
}

class Dosen extends Pegawai {
    private String jurusan;
    
    public Dosen(String nama, String nip, String jurusan) {
        super(nama, nip);
        this.jurusan = jurusan;
    }
    
    @Override
    public void info() {
        System.out.println("Dosen: " + nama + ", NIP: " + nip + ", Jurusan: " + jurusan);
    }
    
    @Override
    public void kerja() {
        System.out.println(nama + " sedang mengajar di jurusan " + jurusan);
    }
    
    public void mengajar() {
        System.out.println(nama + " sedang memberikan kuliah");
    }
}

class Staff extends Pegawai {
    private String bagian;
    
    public Staff(String nama, String nip, String bagian) {
        super(nama, nip);
        this.bagian = bagian;
    }
    
    @Override
    public void info() {
        System.out.println("Staff: " + nama + ", NIP: " + nip + ", Bagian: " + bagian);
    }
    
    @Override
    public void kerja() {
        System.out.println(nama + " sedang bekerja di bagian " + bagian);
    }
    
    public void administrasi() {
        System.out.println(nama + " sedang melakukan tugas administrasi");
    }
}

// 9. Multilevel Inheritance Example
class MobilSport extends Mobil {
    private int kecepatanMax;
    private boolean turboAktif;
    
    public MobilSport(String merk, int tahun, String model, int jumlahPintu, int kecepatanMax) {
        super(merk, tahun, model, jumlahPintu); // Panggil constructor Mobil
        this.kecepatanMax = kecepatanMax;
        this.turboAktif = false;
    }
    
    @Override
    public void info() {
        System.out.println("Mobil Sport - Merk: " + merk + ", Tahun: " + tahun + 
                         ", Kecepatan Max: " + kecepatanMax + " km/jam");
    }
    
    public void aktifkanTurbo() {
        turboAktif = true;
        System.out.println("Turbo mobil " + merk + " diaktifkan!");
    }
    
    public void deaktifkanTurbo() {
        turboAktif = false;
        System.out.println("Turbo mobil " + merk + " dideaktifkan!");
    }
    
    public boolean isTurboAktif() {
        return turboAktif;
    }
}