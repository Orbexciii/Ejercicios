package idea.ejer4;

public class Main {
    public static void main(String[] args) {

        SmartWatch appleWatch = new SmartWatch("AppleWatch", "AppleWatch2","Apple", "ADKEIOCPOOO","2");
        System.out.println(appleWatch.name);
        System.out.println(appleWatch.model);
        System.out.println(appleWatch.manufacturer);
        System.out.println(appleWatch.serialNumber);
        System.out.println(appleWatch.version);

        smartPhone Iphone = new smartPhone("IPhone", "ProMax","Apple", "ADKEIOCPOOO3","14" );
        System.out.println(Iphone.name);
        System.out.println(Iphone.model);
        System.out.println(Iphone.manufacturer);
        System.out.println(Iphone.serialNumber);
        System.out.println(Iphone.version);

    }
}