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

    public static boolean uniqueBuilding(ArrayList<String> buildings) {
        boolean isUnique = true;
        for (int i = 0; i < buildings.size(); i++) {
            if (!buildings.get(i).equalsIgnoreCase("Town Hall")||!buildings.get(i).equalsIgnoreCase("Hospital")) {
                isUnique = false;
                break;
            }
        }
        return isUnique;
    }

    public static void build(ArrayList<String> buildings,ArrayList<String> workers, String buildingName, int buildingConstructionTime, int workerConstSpeed) {
        if (uniqueBuilding(buildings)){ //
            System.out.println("You can build only 1 "+buildingName + "in your Town");
            return;
        }else {
            if (workers.size() > 1) {
                System.out.println("Currently you have " + workers.size() + " available.");
                System.out.println("How many do you want to use");
                int workersUsed=Worker.workersUsedMenu(workers);
                int constructionDuration = buildingConstructionTime / (workerConstSpeed * workersUsed);
                System.out.println(buildingName + " will be build after " + constructionDuration + " seconds");
            } else {
                System.out.println("Currently you have 1 Worker available");
                int constructionDuration = buildingConstructionTime / workerConstSpeed;
                System.out.println(buildingName + " will be build after " + constructionDuration + " seconds");
            }
        }
    }
}
