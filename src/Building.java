import java.util.ArrayList;
import java.util.Scanner;

public class Building {
    String type;
    int endurance;
    int constructionTime;

    public Building() {
        this.type = "";
        this.endurance = 0;
        this.constructionTime = 0;
    }

    public Building(String type, int endurance, int constructionTime) {
        this.type = type;
        this.endurance = endurance;
        this.constructionTime = constructionTime;
    }

    public static void build(ArrayList<String> workers, String buildingName, int buildingConstructionTime, int workerConstructSpeed) {
        if (workers.size() > 1) {

            System.out.println("Currently you have " + workers.size() + " Workers available");
            System.out.println("How many of them you want to use?");
            Scanner sc = new Scanner(System.in);
            byte workersUsed = sc.nextByte();
            try {
                if (workersUsed < 1 || workersUsed > workers.size()) {
                    System.out.println("Players range can be from 1 to " + workers.size());
                    Methods.workersUsedMenu(workers);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice! Enter Digit from 1 to " + workers.size());
                System.out.println();
                Methods.workersUsedMenu(workers);
            }

            int constructionDuration = buildingConstructionTime / (workerConstructSpeed * workersUsed);
            System.out.println(buildingName + " will be build after " + constructionDuration + " seconds");
        } else {
            System.out.println("Currently you have 1 Worker available");
            int constructionDuration = buildingConstructionTime / workerConstructSpeed;
            System.out.println(buildingName + " will be build after " + constructionDuration + " seconds");
        }
    }
}
