package Praktikum.Sesi11.LatihanSoal.Soal2;

public abstract class OperasiBilanganAbs {
    protected double a, b, c;

    protected abstract void set_A(double a);
    protected abstract void set_B(double b);
    protected abstract void set_C();

    protected abstract double get_A();
    protected abstract double get_B();
    protected abstract double get_C();

    protected abstract void tampil();
}

class OperasiPenjumlahan extends OperasiBilanganAbs {
    
    //setter
    @Override 
    protected void set_A(double a) {
        this.a = a;
    }

    @Override 
    protected void set_B(double b) {
        this.b = b;
    }

    @Override 
    protected void set_C() {
        this.c = this.a + this.b;
    }

    //getter
    @Override
    protected double get_A() {
        return this.a;
    }

    @Override 
    protected double get_B() {
        return this.b;
    }

    @Override 
    protected double get_C() {
        return this.c;
    }

    @Override
    protected void tampil() {
        System.out.println("Nilai a: " + get_A());
        System.out.println("Nilai b: " + get_B());
        System.out.println("Hasil Penjumlahan: " + get_C());
    }
}

class OperasiPengurangan extends OperasiBilanganAbs {
    
    //setter
    @Override 
    protected void set_A(double a) {
        this.a = a;
    }

    @Override 
    protected void set_B(double b) {
        this.b = b;
    }

    @Override 
    protected void set_C() {
        this.c = this.a - this.b;
    }
    
    //getter
    @Override
    protected double get_A() {
        return this.a;
    }

    @Override 
    protected double get_B() {
        return this.b;
    }

    @Override 
    protected double get_C() {
        return this.c;
    }

    @Override
    protected void tampil() {
        System.out.println("Nilai a: " + get_A());
        System.out.println("Nilai b: " + get_B());
        System.out.println("Hasil Pengurangan: " + get_C());
    }
}

class OperasiPerkalian extends OperasiBilanganAbs {
    
    //setter
    @Override 
    protected void set_A(double a) {
        this.a = a;
    }

    @Override 
    protected void set_B(double b) {
        this.b = b;
    }

    @Override 
    protected void set_C() {
        this.c = this.a * this.b;
    }
    
    //getter
    @Override
    protected double get_A() {
        return this.a;
    }

    @Override 
    protected double get_B() {
        return this.b;
    }

    @Override 
    protected double get_C() {
        return this.c;
    }

    @Override
    protected void tampil() {
        System.out.println("Nilai a: " + get_A());
        System.out.println("Nilai b: " + get_B());
        System.out.println("Hasil Perkalian: " + get_C());
    }
}

class OperasiPembagian extends OperasiBilanganAbs {
    
    //setter
    @Override 
    protected void set_A(double a) {
        this.a = a;
    }

    @Override 
    protected void set_B(double b) {
        this.b = b;
    }

    @Override 
    protected void set_C() {
        this.c = this.a / this.b;
    }
    
    //getter
    @Override
    protected double get_A() {
        return this.a;
    }

    @Override 
    protected double get_B() {
        return this.b;
    }

    @Override 
    protected double get_C() {
        return this.c;
    }

    @Override
    protected void tampil() {
        System.out.println("Nilai a: " + get_A());
        System.out.println("Nilai b: " + get_B());
        System.out.println("Hasil Pembagian: " + get_C());
    }
}

final class OperasiBilanganAbsCetak {
    private void cetakSemua(OperasiBilanganAbs[] OB, double a, double b) {
        for(OperasiBilanganAbs ob : OB){
            ob.set_A(a);
            ob.set_B(b);
            ob.set_C();
            ob.tampil();
        }
    }
    public static void main(String[] args) {
        double a = 6.5;
        double b = 0.5;

        OperasiBilanganAbs[] op = new OperasiBilanganAbs[4];
        op[0] = new OperasiPenjumlahan();
        op[1] = new OperasiPengurangan();
        op[2] = new OperasiPerkalian();
        op[3] = new OperasiPembagian();

        OperasiBilanganAbsCetak cetak = new OperasiBilanganAbsCetak();
        cetak.cetakSemua(op, a, b);
    }
}