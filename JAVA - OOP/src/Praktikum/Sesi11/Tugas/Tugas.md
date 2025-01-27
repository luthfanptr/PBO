## Soal Abstrak dan Interface Dalam Java OOP

buatlah sebuah program untuk sistem pemesanan (sewa) kendaraan dengan ketentuan sebagai berikut:

1. Buat **abstract class** bernama ```Kendaraan``` yang memiliki:
    - Atribut ```nama``` (String) yang bersifat ```final```.
    - Metode abstrak ```hitungHargaSewa``` (int hari) untuk menghitung biaya sewa kendaraan berdasarkan jumlah hari.

2. Buat **interface** bernama ```Asuransi``` yang memiliki:
    - metode ```hitungBiayaAsuransi``` (int hari) untuk menghitung biaya asuransi kendaraan per hari.

3. Buat **dua kelas turunan** dari ```Kendaraan```:
    - ```Mobil```:
        - Atribut tambahan: ```jenisBahanBakar``` (String).
        - Biaya sewa per hari Rp. 500.000.
        - Implementasikan interface ```Asuransi``` dengan biaya asuransi Rp. 50.000 per hari.
        - Gunakan modifier ```final``` untuk menentukan biaya sewa dan asuransi agar tidak dapat diubah.
    
    - ```Motor```:
        - Atribut tambahan ```kapasitasMesin``` (int).
        - Biaya sewa per hari Rp. 200.000
        - Implementasikan interface ```Asuransi``` dengan asuransi Rp.20.000 per hari.
        - Gunakan modifier ```final``` untuk menentukan biaya sewa dan asuransi agar tidak dapat diubah.

4. Buat program utama untuk: 
    - Membuat objek ```Mobil``` dan ```Motor```.
    - Menghitung harga sewa total (termasuk biaya asuransi) untuk beberapa hari, dan mencetak informasi kendaraan beserta total biayanya.