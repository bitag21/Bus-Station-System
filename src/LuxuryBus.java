public class LuxuryBus extends Bus{
    boolean hasAc;

    public LuxuryBus(String busNumber, String driverName, String route, boolean hasAc){
        super(busNumber,driverName,route);
        this.hasAc=hasAc;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Air Condition:"+(hasAc?"Yes":"No"));
        System.out.println("Type:Luxury Bus");
    }
}
