# Interface

- Interface adalah sekumpulan method abstract.

- Interface adalah kontrak interaksi objek dengan dunia luar.

- Class dapat mengembangkan sebuah interface dengan cara mengimplementasikannya.

- Cara menuliskan interface mirip dengan cara menuliskan class, tetapi interface bukanlah class.

## Perbedaan Interface dengan Class:

1. Interface dikembangkan dengan keyword implements.
```java
public class PersegiPanjang implements Bidang2D {
    
    // Properti dari *class*

}
```

2. Class dikembangkan/diturunkan dengan keyword extends

3. Semua method yang ada di interface **WAJIB** diimplementasikan di class yang mengimplementasikannya.

4. Setiap method yang ada di interface harus diimplementasikan, sedangkan pada class tidak semua method harus di override.