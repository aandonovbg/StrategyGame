import java.util.ArrayList;
import java.util.Scanner;

public class Methods {
    public static void startMenu(ArrayList<String> buildings, ArrayList<String> workers, Worker worker) {

        System.out.println("Please choose what to do");
        System.out.println("1 - > Build;");
        System.out.println("2 - > Attack;");
        System.out.println("3 - > EXIT;");
        System.out.print("Your choice - > ");
        Scanner sc = new Scanner(System.in);
        String choice = sc.next();
        try {
            Integer.parseInt(choice);
            if (Integer.parseInt(choice) < 1 || Integer.parseInt(choice) > 3) {
                System.out.println();
                System.out.println("Invalid choice! Enter Digit from 1 to 3");
                System.out.println();
                startMenu(buildings, workers, worker);
            }
        } catch (NumberFormatException e) {
            System.out.println();
            System.out.println("Invalid choice! Enter Digit from 1 to 3");
            System.out.println();
            startMenu(buildings, workers, worker);
        }

        switch (Integer.parseInt(choice)) {
            case 1 -> buildMenu(buildings, workers, worker);

        }
    }

    public static void buildMenu(ArrayList<String> buildings, ArrayList<String> workers, Worker worker) {
        System.out.println();
        System.out.println("Which building you want to build:");
        System.out.println("1 - > Town Hall - Produce Workers;");
        System.out.println("2 - > Barracks - Produce/ Upgrade Soldiers;");
        System.out.println("3 - > Hospital - Heal Soldiers;");
        System.out.println("4 - > Back");
        System.out.print("Your choice - > ");
        Scanner sc = new Scanner(System.in);
        String choice1 = sc.next();
        try {
            Integer.parseInt(choice1);
            if (Integer.parseInt(choice1) < 1 || Integer.parseInt(choice1) > 4) {
                System.out.println();
                System.out.println("Invalid choice! Enter Digit from 1 to 4");
                System.out.println();
                startMenu(buildings, workers, worker);
            }
        } catch (NumberFormatException e) {
            System.out.println();
            System.out.println("Invalid choice! Enter Digit from 1 to 4");
            System.out.println();

            startMenu(buildings, workers, worker);
        }
        switch (Integer.parseInt(choice1)) {
            case 1 -> {
                Building.build(buildings,workers,"Town Hall",1000,worker.constrSpeed);
                buildings.add("Town Hall");
                buildMenu(buildings, workers, worker);
            }
            case 2->{
                Building.build(buildings,workers,"Barracks",300,worker.constrSpeed);
                buildings.add("Barracks");
                buildMenu(buildings, workers, worker);
            }
            case 3 ->{
                Building.build(buildings,workers,"Hospital",300,worker.constrSpeed);
                buildings.add("Hospital");
                buildMenu(buildings, workers, worker);
            }
            case 4 ->startMenu(buildings, workers, worker);
        }
    }




}
