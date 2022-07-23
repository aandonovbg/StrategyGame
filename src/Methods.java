import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Methods {
    public static void startMenu(ArrayList<Building> buildingsObj, ArrayList<Worker> workersObj) {

        System.out.println("Please choose what to do");
        System.out.println("1 - > Build;");
        System.out.println("2 - > Attack;");
        System.out.println("3 - > List of Buildings;");
        System.out.println("4 - > EXIT;");
        System.out.print("Your choice - > ");
        Scanner sc = new Scanner(System.in);
        String choice = sc.next();
        try {
            Integer.parseInt(choice);
            if (Integer.parseInt(choice) < 1 || Integer.parseInt(choice) > 3) {
                System.out.println();
                System.out.println("Invalid choice! Enter Digit from 1 to 3");
                System.out.println();
                startMenu(buildingsObj, workersObj);
            }
        } catch (NumberFormatException e) {
            System.out.println();
            System.out.println("Invalid choice! Enter Digit from 1 to 3");
            System.out.println();
            startMenu(buildingsObj, workersObj);
        }

        switch (Integer.parseInt(choice)) {
            case 1 -> buildMenu(buildingsObj, workersObj);
            //case 2 -> attackMenu();
            case 3 -> listBuildings(buildingsObj, workersObj);

        }
    }

    public static void listBuildings(ArrayList<Building> buildingsObj, ArrayList<Worker> workersObj) {
        if (buildingsObj.size() == 0) {
            System.out.println("List is still empty.\nBuild something!!!");
            buildMenu(buildingsObj, workersObj);
        } else {
            int barracksCount = 0;
            for (int i = 0; i < buildingsObj.size(); i++) {
                if (buildingsObj.get(i).name.equals("Barracks")) {
                    barracksCount++;
                }
            }
            if (barracksCount > 1){
            for (int i = 0; i <buildingsObj.size() ; i++) {
                    if (!buildingsObj.get(i).name.equals("Barracks")) {
                        System.out.println(buildingsObj.get(i).name);
                    }
                }
                System.out.println(barracksCount + " Barracks");
            }else {
                for (int i = 0; i < buildingsObj.size(); i++) {
                    System.out.println(buildingsObj.get(i).name);
                }
            }
        }
        startMenu(buildingsObj, workersObj);
    }

    public static void buildMenu(ArrayList<Building> buildingsObj, ArrayList<Worker> workersObj) {
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
                startMenu(buildingsObj, workersObj);
            }
        } catch (NumberFormatException e) {
            System.out.println();
            System.out.println("Invalid choice! Enter Digit from 1 to 4");
            System.out.println();

            startMenu(buildingsObj, workersObj);
        }
        switch (Integer.parseInt(choice1)) {
            case 1 -> {
                Worker.build("Town Hall", 1000, 100, buildingsObj, workersObj);
                buildMenu(buildingsObj, workersObj);
            }
            case 2 -> {
                Worker.build("Barracks", 500, 50, buildingsObj, workersObj);
                buildMenu(buildingsObj, workersObj);
            }
            case 3 -> {
                Worker.build("Hospital", 700, 70, buildingsObj, workersObj);
                buildMenu(buildingsObj, workersObj);
            }
            case 4 -> startMenu(buildingsObj, workersObj);
        }
    }

    public static void attackMenu(ArrayList<String> buildings, ArrayList<String> soldiers) {

        for (int i = 1; i <= buildings.size(); i++) {
            System.out.println((i) + ". " + buildings.get(i) + ".");
        }
        System.out.println("Which building you want to attack?");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        //Soldier.attack(soldiers,buildings.get(choice-1));
 /*   try {
        Integer.parseInt(choice);
        if (Integer.parseInt(choice) < 1 || Integer.parseInt(choice) > buildings.size()) {
            System.out.println();
            System.out.println("Invalid choice! Enter Digit from 1 to "+buildings.size());
            System.out.println();
            attackMenu(buildings,soldiers);
        }
    } catch (NumberFormatException e) {
        System.out.println();
        System.out.println("Invalid choice! Enter Digit from 1 to "+buildings.size());
        System.out.println();

        attackMenu(buildings,soldiers);
    }*/


    }

}
