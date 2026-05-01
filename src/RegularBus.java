public class RegularBus extends Bus{
    int stops;

    public RegularBus(String busNumber, String driverNmae, String route, int stpos){
        super(busNumber,driverNmae,route);
        this.stops=stpos;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("stops:"+stops);
        System.out.println("Type: Regular Bus");
    }

}
