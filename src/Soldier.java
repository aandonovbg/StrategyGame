import java.util.ArrayList;
import java.util.Scanner;

public class Soldier {
    String unitName;
    int attack;
    int defense;
    int health;

    public Soldier() {

        this.unitName = "Soldier";
        this.attack = 30;
        this.defense = 10;
        this.health = 30;
    }

    public Soldier(String eliteSoldier) {
        eliteSoldier = "Elite Soldier";
        this.unitName = eliteSoldier;
        this.attack = 50;
        this.defense = 20;
        this.health = 50;
    }

    public void attack(ArrayList<String> soldiers, String buildingName, int buildingEndurance, int attackDuration) {
        int normalSoldiersCount = 0;
        int eliteSoldierCount = 0;
        int eliteSoldiersUsed = 0;
        int normalSoldiersUsed = 0;
        if (soldiers.size() > 1) {


            for (int i = 0; i < soldiers.size(); i++) {
                if (soldiers.get(i).equals("Soldier")) {
                    normalSoldiersCount++;
                } else if (soldiers.get(i).equals("Elite Soldier")) {
                    eliteSoldierCount++;
                }
            }
            System.out.println("Currently you have " + normalSoldiersCount + " Soldiers available");
            if (eliteSoldierCount > 0) {
                if (eliteSoldierCount == 1) {
                    System.out.println("And 1 Elite Soldier ");
                } else {
                    System.out.println("And " + eliteSoldierCount + " Elite Soldiers");
                }
            }

            normalSoldiersUsed = normalSoldiersUsed(normalSoldiersCount);

            if (eliteSoldierCount > 0) {

                eliteSoldiersUsed = eliteSoldiersUsed(eliteSoldierCount);
            }
        }
        System.out.println(this.unitName + " attacked " + buildingName);

        if ((this.attack * normalSoldiersUsed+this.attack*eliteSoldiersUsed) * attackDuration > buildingEndurance) {
            int destructionTime = (this.attack * normalSoldiersUsed+this.attack*eliteSoldiersUsed) * attackDuration - ((this.attack * normalSoldiersUsed+this.attack*eliteSoldiersUsed) * attackDuration - buildingEndurance);
            System.out.println(buildingName + " was destroyed for " + destructionTime + " seconds");
        }
    }

    public static int eliteSoldiersUsed(int eliteSoldierCount) {
        System.out.print("How many Elite Soldiers -> ");
        Scanner sc = new Scanner(System.in);
        String eliteSoldiersUsed = sc.nextLine();
        try {
            Integer.parseInt(eliteSoldiersUsed);
            if (Integer.parseInt(eliteSoldiersUsed) < 1 || Integer.parseInt(eliteSoldiersUsed) > eliteSoldierCount) {
                System.out.println("Invalid choice! Enter Digit from 1 to " + eliteSoldierCount);
                eliteSoldiersUsed(eliteSoldierCount);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid choice! Enter Digit from 1 to " + eliteSoldierCount);
            System.out.println();
            eliteSoldiersUsed(eliteSoldierCount);
        }
        return Integer.parseInt(eliteSoldiersUsed);
    }

    public static int normalSoldiersUsed(int normalSoldierCount) {
        System.out.print("How many Soldiers you want to use -> ");
        Scanner sc = new Scanner(System.in);
        String normalSoldiersUsed = sc.nextLine();
        try {
            Integer.parseInt(normalSoldiersUsed);
            if (Integer.parseInt(normalSoldiersUsed) < 1 || Integer.parseInt(normalSoldiersUsed) > normalSoldierCount) {
                System.out.println("Invalid choice! Enter Digit from 1 to " + normalSoldierCount);
                normalSoldiersUsed(normalSoldierCount);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid choice! Enter Digit from 1 to " + normalSoldierCount);
            System.out.println();
            normalSoldiersUsed(normalSoldierCount);
        }
        return Integer.parseInt(normalSoldiersUsed);
    }
}

