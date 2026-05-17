package transport;

public class RegularBus extends Bus {
    private int stops;

    public RegularBus(String busNumber, String driverName, String route, int stops){
        super(busNumber,driverName,route);
        this.stops=stops;
    }
    @Override
    public void displayInfo(){
        System.out.println("BUS INFORMATION");
        System.out.println("~~~~~~~~~~~~~~~");
        System.out.println("Bus Number: " + getBusNumber());
        System.out.println("Driver: "+ getDriverName());
        System.out.println("Route: " + getRoute());
        System.out.println("Stops : " + stops);
        System.out.println("Type : Regular Bus");
    }

}
