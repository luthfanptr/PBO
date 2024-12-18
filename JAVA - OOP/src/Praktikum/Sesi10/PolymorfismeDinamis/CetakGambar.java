package Praktikum.Sesi10.PolymorfismeDinamis;

public class CetakGambar extends Bentuk {
    
    private void tampil(Bentuk[] obj) {
        // Polimorfisme
        // Memanggil method yang sama yaitu method gambar() dan hapus() pada masing-masing class
        for(int i = 0; i < obj.length; i++){
            obj[i].gambar();
            obj[i].hapus();
            System.out.println("=======================================");
        }
    }

    public static void main(String[] args) {
        Bentuk[] obj = {    new Lingkaran(),
                            new Elips(),
                            new Segitiga()    
                        };
        CetakGambar cetak = new CetakGambar();

        // Menampilkan method gambar() & hapus() pada class Bentuk (superclass)
        cetak.gambar();
        cetak.hapus();
        System.out.println("=======================================");

        // Overriding
        // Menumpuk Method gambar() & hapus() pada class Bentuk (superclass) 
        // dengan method gambar() & hapus() pada subclass-nya
        // yaitu class Lingkaran, Elips dan Segitiga
        cetak.tampil(obj);
    }
}
