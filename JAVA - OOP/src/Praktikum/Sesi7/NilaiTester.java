package Praktikum.Sesi7;

class Nilai {
    private double Quis;
    private double UTS;
    private double UAS;

    // Setter
    public void setQuis(double x){
        if(x >= 0 && x <= 100){
            Quis = x;
        }
    }

    public void setUTS(double x){
        if(x >= 0 && x <= 100){
            UTS = x;
        }
    }

    public void setUAS(double x){
        if(x >= 0 && x <= 100){
            UAS = x; 
        }  
    }

    // Getter
    public double getQuis(){
        return Quis;
    }

    public double getUTS(){
        return UTS;
    }

    public double getUAS(){
        return UAS;
    }

    public double getNA() {
        return 0.20 * Quis + 0.30 * UTS + 0.5 * UAS;
    }
}

public class NilaiTester {
    public static void main(String[] args) {
        Nilai n = new Nilai();
        n.setQuis(90);
        n.setUTS(70);
        n.setUAS(150);

        System.out.println("NA : " + n.getNA());
    }
}
