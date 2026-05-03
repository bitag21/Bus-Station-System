final class MiniBus extends Bus {
    public MiniBus(String busNumber,String driverName, String route){
        super(busNumber, driverName, route);
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Type: Mini BUs");
    }
}
