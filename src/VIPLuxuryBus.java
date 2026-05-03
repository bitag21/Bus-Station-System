public class VIPLuxuryBus extends LuxuryBus{
    boolean hasWifi;

    public VIPLuxuryBus(String busNumber,String driverName,String route, boolean hasAc,boolean hasWifi){
        super(busNumber, driverName,route, hasAc);
        this.hasWifi=hasWifi;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Wifi : "+(hasWifi?"Available":"No"));
        System.out.println("Type : VIP Luxury Bus");
    }
}
