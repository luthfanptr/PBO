package Praktikum.Sesi7;

class Waktu {
    private int menitWaktu;

    // konstruktor
    public Waktu(int j, int m) {
        this.menitWaktu = j * 60 + m; // memisahkan jam dengan menit
    }

    // getter
    public int getJam() {
        return menitWaktu / 60; // membagi total menit dengan 60 (misal 120/60 berarti 2 jam)
    }

    public int getMenit() {
        return menitWaktu % 60; // misal 125 menit (125 % 60 = 2 Jam sisa 5 menit)
    }

    // setter
    public void setJam(int j) {
        menitWaktu = j * 60 + getMenit(); // menyimpan jam baru dengan tetap mempertahankan menitnya
    }

    public void setMenit(int m) {
        menitWaktu = getJam() * 60 + m; // menyimpan menit baru dengan tetap mempertahankan jamnya
    }

    public int getTotalMenit() {
        return menitWaktu;
    }

    public void tambahJam(int j) {
        menitWaktu += j * 60; // menambahkan jam
    }

    public void tambahMenit(int m) {
        menitWaktu += m; // menambahkan menit
    }

    public void tambahWaktu(int j, int m) {
        menitWaktu += j * 60 + m; // menambahkan jam dan menit
    }

    public void tampilWaktu() {
        int j = getJam();
        int m = getMenit();
        System.out.println("JAM: " + j + " Menit: " + m);
    }

}

public class WaktuTester {
    public static void main(String[] args) {
        Waktu w = new Waktu(0, 0);
        System.out.println("1. Total Menit : " + w.getTotalMenit());
        w.setJam(10);
        System.out.println("2. Total Menit : " + w.getTotalMenit());
        w.setMenit(57);
        System.out.println("3. Total Menit: " + w.getTotalMenit());
        w.tampilWaktu();
        w.tambahJam(7);
        System.out.println("4. JAM: " + w.getJam() + " MENIT:" + w.getMenit());
        w.tambahMenit(40);
        System.out.println("5. JAM: " + w.getJam() + " MENIT:" + w.getMenit());

    }
}