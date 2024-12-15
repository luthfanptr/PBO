# Abstract

- *Class* abstract adalah *class* yang tidak dapat diinstansiasikan.

- Semua member/parameter dari *class* tetap ada tetapi tidak dapat diinstansiasikan.

- Jika *class* abstract ingin diinstansiasikan, maka harus diturunkan terlebih dahulu ke subclassnya.

- Abstract dapat digunakan pada level *Class* atau Method.

- Untuk menyatakan sebuah class adalah class abstract, tambahkan keyword abstract ketika mendefinisikan class.
```java
public abstract class Pegawai { // Contoh penggunaan abstract
    
    // Properti dari *class* Pegawai

}
```
- *Class* abstract dikembangkan dengan keyword extends
```java
public class Staff extends Pegawai { // contoh penggunaan keyword extends
    
    // Properti dari *class* Staff

} 
```

- Abstract terjadi ketika seorang pendesain sistem baru memikirkan rencana method yang ada tetapi belum terlalu memperdulikan bagaimana implementasinya.

---

## Pendefinisian Lain dari Abstract

- Pendefinisian kelas induk yang di dalamnya terdapat deklarasi method yang tidak didefinisikan implementasinya sama sekali.
- Superclass yang mempunyai beberapa method dengan implementasi, sedangkan yang lain tidak.
- Method pada *class* abstract yang tidak memiliki implementasi disebut abstract method.
- Semua abstract method harus diimplementasikan di subclass.