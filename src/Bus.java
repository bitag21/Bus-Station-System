public abstract class Bus {
    private String busNumber;
    private String driverName;
    private String route;

    Bus(String busNumber, String driverName, String route) {
        this.busNumber = busNumber;
        this.driverName = driverName;
        this.route = route;
    }

    public String getBusNumber(){
        return busNumber;
    }

    public String getDriverName() {
        return driverName;
    }

    public String getRoute() {
        return route;
    }

    public abstract void displayInfo();

    public final void showCompany() {
        System.out.println("Company : City Bus Service");
    }

    public static void type() {
        System.out.println("General Bus");
    }
}