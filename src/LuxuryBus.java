public class LuxuryBus extends Bus{
    private boolean hasAc;

    public LuxuryBus(String busNumber, String driverName, String route, boolean hasAc){
        super(busNumber,driverName,route);
        this.hasAc=hasAc;
    }

    @Override
    public void displayInfo() {
        System.out.println("BUS INFORMATION");
        System.out.println("~~~~~~~~~~~~~~~");
        System.out.println("Bus Number: " + getBusNumber());
        System.out.println("Driver: " + getDriverName());
        System.out.println("Route: " + getRoute());
        System.out.println("AC : " + (hasAc? "Yes": "No"));
        System.out.println("Type : Luxury Bus");
    }
    public static void type(){
        System.out.println("Luxury Bus");
    }
}
