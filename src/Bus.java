public class Bus {
    String busNumber;
    String driverName;
    String route;

    public Bus(String busNumber,String driverName,String route){
        this.busNumber=busNumber;
        this.driverName=driverName;
        this.route=route;
    }
    public void displayInfo(){
        System.out.println("Bus Number:"+busNumber);
        System.out.println("Driver:"+driverName);
        System.out.println("Route:"+route);
    }
}
