public class RegularBus extends Bus{
    int stops;

    public RegularBus(String busNumber, String driverName, String route, int stops){
        super(busNumber,driverName,route);
        this.stops=stops;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("stops:"+stops);
        System.out.println("Type: Regular Bus");
    }

}
