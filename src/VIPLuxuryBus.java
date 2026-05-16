public class VIPLuxuryBus extends LuxuryBus{
    private boolean hasWifi;

    public VIPLuxuryBus(String busNumber,String driverName,String route, boolean hasAc,boolean hasWifi){
        super(busNumber, driverName,route, hasAc);
        this.hasWifi=hasWifi;
    }
    @Override
    public void displayInfo(){
        System.out.println("BUS INFORMATION");
        System.out.println("~~~~~~~~~~~~~~~");
        System.out.println("Bus Number: " + getBusNumber());
        System.out.println("Driver: " + getDriverName());
        System.out.println("Route: " + getRoute());
        System.out.println("Wifi : " + (hasWifi? "Available": "No"));
        System.out.println("Type : VIP Luxury Bus");
    }
}
