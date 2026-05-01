public class Main {
    public static void main(String[] args){
        RegularBus regular=new RegularBus("A201","Dawit Worku","Addis Ababa-Adama",12);
        LuxuryBus luxury=new LuxuryBus("B101","Eyob Teklaye","Addis Ababa-Bahir Dar",true);

        Bus[] buses=new Bus[2];
        buses[0]=regular;
        buses[1]=luxury;

        System.out.println("--- Bus information ---");
        for (Bus bus:buses){
            bus.displayInfo();
            System.out.println();
        }
    }
}