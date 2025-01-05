package Praktikum.Sesi12.Quiz2.No3;

interface Phone {
    void powerOn();

    void powerOff();

    void volumeUp();

    void volumeDown();
}

class PhoneUser {
    private Phone phone;

    public PhoneUser(Phone phone) {
        this.phone = phone;
    }

    public void turnOnThePhone() {
        phone.powerOn();
    }

    public void turnOffThePhone() {
        phone.powerOff();
    }

    public void makeThePhoneLouder() {
        phone.volumeUp();
    }

    public void makeThePhoneSilent() {
        phone.volumeDown();
    }
}

class Xiaomi implements Phone {
    private int volume;
    private boolean isPowerOn;

    public Xiaomi() {
        this.volume = 10;
        this.isPowerOn = true;
    }

    @Override
    public void powerOn() {
        if (isPowerOn) {
            System.out.println("Xiaomi Phone is already ON");
        } else {
            isPowerOn = true;
            System.out.println("Xiaomi Phone is ON");
            System.out.println("Current volume: " + volume);
        }
    }

    @Override
    public void powerOff() {
        if (!isPowerOn) {
            System.out.println("Xiaomi Phone is already OFF");
        } else {
            isPowerOn = false;
            System.out.println("Xiaomi Phone is OFF");
        }
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (volume < 100) {
                volume++;
                System.out.println("Volume increased to: " + volume);
            } else {
                System.out.println("Volume is already at max (100)");
            }
        } else {
            System.out.println("Cannot adjust volume. The phone is OFF");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (volume > 0) {
                volume--;
                System.out.println("Volume decreased to: " + volume);
            } else {
                System.out.println("Volume is already at min (0)");
            }
        } else {
            System.out.println("Cannot adjust volume. The phone is OFF");
        }
    }

    public int getVolume() {
        return volume;
    }
}

class iPhone implements Phone {
    private int volume;
    private boolean isPowerOn;

    public iPhone() {
        this.volume = 15;
        this.isPowerOn = true;
    }

    @Override
    public void powerOn() {
        if(isPowerOn) {
            System.out.println("iPhone is already ON");
        }
        else{
            isPowerOn = true;
            System.out.println("iPhone is ON");
            System.out.println("Current volume: " + volume);
        }
    }

    @Override
    public void powerOff() {
        if(!isPowerOn) {
            System.out.println("iPhone is already OFF");
        }
        else{
            System.out.println("iPhone is OFF");
        }
    }

    @Override
    public void volumeUp() {
        if(isPowerOn) {
            if(volume < 100){
                volume++;
                System.out.println("Volume increased to: " + volume);
            }
            else {
                System.out.println("Volume is already at max (100)");
            }
        }
        else{
            System.out.println("Cannot adjust the volume. The phone is OFF");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if(volume > 0){
                volume--;
                System.out.println("Volume decreased to: " + volume);
            }
            else{
                System.out.println("Volume is already at minimum (0)");
            }
        }
        else{
            System.out.println("Cannot adjust the volume. The phone is off");
        }
    }

    public int getVolume() {
        return volume;
    }
}

class Samsung implements Phone {
    private int volume;
    private boolean isPowerOn;

    public Samsung() {
        this.volume = 100;
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        if(isPowerOn) {
            System.out.println("Samsung Phone is already ON");
        }
        else{
            isPowerOn = true;
            System.out.println("Samsung Phone is ON");
            System.out.println("Current volume: " + volume);
        }
    }

    @Override
    public void powerOff() {
        if(!isPowerOn){
            System.out.println("Samsung Phone is already OFF");
        }
        else{
            System.out.println("Samsung Phone is OFF");
        }
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if(volume < 100) {
                volume++;
                System.out.println("Volume increased to: " + volume);
            }
            else{
                System.out.println("Volume is already max (100)");
            }
        }
        else{
            System.out.println("Cannot adjust the volume. The phone is OFF");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if(volume > 0) {
                volume--;
                System.out.println("Volume decreased to: " + volume);
            }
            else{
                System.out.println("Volume is already min (0)");
            }
        }
        else{
            System.out.println("Cannot adjust the volume. The phone is OFF");
        }
    }

    public int getVolume() {
        return volume;
    }
}

class Oppo implements Phone {
    private int volume;
    private boolean isPowerOn;

    public Oppo() {
        this.volume = 0;
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        if(isPowerOn) {
            System.out.println("Oppo Phone is already ON");
        }
        else{
            isPowerOn = true;
            System.out.println("Oppo Phone is ON");
            System.out.println("Current volume: " + volume);
        }
    }

    @Override
    public void powerOff() {
        if(!isPowerOn){
            System.out.println("Oppo Phone is already OFF");
        }
        else{
            System.out.println("Oppo Phone is OFF");
        }
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if(volume < 100) {
                volume++;
                System.out.println("Volume increased to: " + volume);
            }
            else{
                System.out.println("Volume is already at max (100)");
            }
        }
        else {
            System.out.println("Cannot adjust the volume. The phone is OFF");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if(volume > 0){
                volume--;
                System.out.println("Volume decreased to: " + volume);
            }
            else {
                System.out.println("Volume is already at min (0)");
            }
        }
        else{
            System.out.println("Cannot adjust the volume. The phone is OFF");
        }
    }

    public int getVolume() {
        return volume;
    }
}

public class Main {
    public static void main(String[] args) {
        Phone phone = new Xiaomi();
        PhoneUser user = new PhoneUser(phone); //Dependency Injection lewat Konstruktor
        user.turnOnThePhone();
        user.makeThePhoneLouder();
        user.makeThePhoneSilent();
        user.turnOffThePhone();
        user.turnOffThePhone();
        System.out.println("\n==================================");

        Phone phone2 = new iPhone();
        PhoneUser user2 = new PhoneUser(phone2);
        user2.turnOnThePhone();
        user2.makeThePhoneLouder();
        user2.makeThePhoneSilent();
        user2.turnOffThePhone();
        System.out.println("\n==================================");

        Phone phone3 = new Samsung();
        PhoneUser user3 = new PhoneUser(phone3);
        user3.makeThePhoneLouder();
        user3.turnOnThePhone();
        user3.makeThePhoneLouder();
        user3.makeThePhoneSilent();
        user3.turnOffThePhone();
        System.out.println("\n==================================");

        Phone phone4 = new Oppo();
        PhoneUser user4 = new PhoneUser(phone4);
        user4.makeThePhoneSilent();
        user4.turnOffThePhone();
        user4.turnOnThePhone();
        user4.makeThePhoneSilent();
        user4.makeThePhoneLouder();
        user4.turnOffThePhone();
    }
}
