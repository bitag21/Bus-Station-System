public class Main {
    public static void main(String[] args){
        RegularBus regular=new RegularBus("A201","Dawit Worku","Addis Ababa-Adama",12);
        LuxuryBus luxury=new LuxuryBus("B101","Eyob Teklaye","Addis Ababa-Bahir Dar",true);
        VIPLuxuryBus vip=new VIPLuxuryBus("V203","Natnael Gebeyw","Addis Ababa-Gonder",true,true);
        MiniBus mini=new MiniBus("M101","Yosef Tamerat","Addis Ababa-Mekelle");

        Bus[] buses=new Bus[4];
        buses[0]=regular;
        buses[1]=luxury;
        buses[2]=vip;
        buses[3]=mini;

        System.out.println("~~~~~~~~ BUS MANAGEMENT SYSTEM ~~~~~~~~\n");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (Bus bus:buses){
            bus.displayInfo();
            bus.showCompany();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        }
        System.out.println("Bus Types");
        Bus.type();
        LuxuryBus.type();
    }
}
