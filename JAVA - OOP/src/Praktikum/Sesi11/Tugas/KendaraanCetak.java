package Praktikum.Sesi11.Tugas;

// Abstract class Kendaraan
abstract class Kendaraan {
    private final String nama;

    public Kendaraan(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public abstract int hitungHargaSewa(int hari);
}

// Interface Asuransi
interface Asuransi {
    int hitungBiayaAsuransi(int hari);
}

// Kelas Mobil
final class Mobil extends Kendaraan implements Asuransi {
    private final String jenisBahanBakar;
    private static final int BIAYA_SEWA_PER_HARI = 500000;
    private static final int BIAYA_ASURANSI_PER_HARI = 50000;

    public Mobil(String nama, String jenisBahanBakar) {
        super(nama);
        this.jenisBahanBakar = jenisBahanBakar;
    }

    public String getJenisBahanBakar() {
        return jenisBahanBakar;
    }

    @Override
    public int hitungHargaSewa(int hari) {
        return BIAYA_SEWA_PER_HARI * hari;
    }

    @Override
    public int hitungBiayaAsuransi(int hari) {
        return BIAYA_ASURANSI_PER_HARI * hari;
    }
}

// Kelas Motor
final class Motor extends Kendaraan implements Asuransi {
    private final int kapasitasMesin;
    private static final int BIAYA_SEWA_PER_HARI = 200000;
    private static final int BIAYA_ASURANSI_PER_HARI = 20000;

    public Motor(String nama, int kapasitasMesin) {
        super(nama);
        this.kapasitasMesin = kapasitasMesin;
    }

    public int getKapasitasMesin() {
        return kapasitasMesin;
    }

    @Override
    public int hitungHargaSewa(int hari) {
        return BIAYA_SEWA_PER_HARI * hari;
    }

    @Override
    public int hitungBiayaAsuransi(int hari) {
        return BIAYA_ASURANSI_PER_HARI * hari;
    }
}

// Program utama
public class KendaraanCetak {
    public static void main(String[] args) {
        // Membuat objek Mobil dan Motor
        Mobil mobil = new Mobil("Toyota Avanza", "Bensin");
        Motor motor = new Motor("Yamaha NMAX", 155);

        // Menghitung harga sewa total (termasuk asuransi) untuk beberapa hari
        int hariSewa = 3;

        int totalMobil = mobil.hitungHargaSewa(hariSewa) + mobil.hitungBiayaAsuransi(hariSewa);
        int totalMotor = motor.hitungHargaSewa(hariSewa) + motor.hitungBiayaAsuransi(hariSewa);

        // Mencetak informasi kendaraan beserta total biayanya
        System.out.println("Informasi Sewa Kendaraan:");
        System.out.println("Mobil: " + mobil.getNama() + ", Jenis Bahan Bakar: " + mobil.getJenisBahanBakar());
        System.out.println("Total Biaya (" + hariSewa + " hari): Rp. " + totalMobil);

        System.out.println();

        System.out.println("Motor: " + motor.getNama() + ", Kapasitas Mesin: " + motor.getKapasitasMesin() + " cc");
        System.out.println("Total Biaya (" + hariSewa + " hari): Rp. " + totalMotor);
    }
}
