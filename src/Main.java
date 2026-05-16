import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        RegularBus regular;
        LuxuryBus luxury;
        VIPLuxuryBus vip;
        MiniBus mini;

        try {
            System.out.println("Enter Bus Number: ");
            String busNumber = input.nextLine();

            System.out.println("Enter Driver Name: ");
            String driverName = input.nextLine();

            System.out.println("Enter Route: ");
            String route = input.nextLine();

            System.out.println("Enter Stops: ");
            int stops = input.nextInt();

            regular = new RegularBus(busNumber, driverName, route, stops);
            luxury = new LuxuryBus("A102", "Eyob Teklaye", "Addis Ababa-Bahirdar",true);
            vip = new VIPLuxuryBus("V202", "Biruk Goshu", "Addis Ababa-Gonder", true, true);
            mini = new MiniBus("B203", "Dawit Worku", "Addis Ababa-Mekelle");

            ArrayList<Bus> buses = new ArrayList<>();

            buses.add(regular);
            buses.add(luxury);
            buses.add(vip);
            buses.add(mini);

            System.out.println("~~~~~~~~ BUS MANAGEMENT SYSTEM ~~~~~~~~\n");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            for (Bus bus:buses){
                bus.displayInfo();
                bus.showCompany();
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
            }
            System.out.println("Bus Types");
            Bus.type();
            LuxuryBus.type();

        } catch (Exception e){
            System.out.println("Invalid Input");
        }
        input.close();
        }
}
