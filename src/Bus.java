public class Bus {
    protected String busNumber;
    protected String driverName;
    protected String route;

    public Bus(String busNumber, String driverName, String route) {
        this.busNumber = busNumber;
        this.driverName = driverName;
        this.route = route;
    }

    public void displayInfo() {
        System.out.println("        BUS INFORMATION");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Bus Number : " + busNumber);
        System.out.println("Driver : " + driverName);
        System.out.println("Route : " + route);
    }

    public final void showCompany() {
        System.out.println("Company : City Bus Service");
    }

    public static void type() {
        System.out.println("General Bus");
    }
}