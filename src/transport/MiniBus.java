package transport;

public final class MiniBus extends Bus {
    public MiniBus(String busNumber,String driverName, String route){
        super(busNumber, driverName, route);
    }

    @Override
    public void displayInfo(){
        System.out.println("BUS INFORMATION");
        System.out.println("~~~~~~~~~~~~~~~");
        System.out.println("Bus Number: " + getBusNumber());
        System.out.println("Driver: " + getDriverName());
        System.out.println("Route: " + getRoute());
        System.out.println("Type: Mini Bus");
    }
}