import java.util.ArrayList;
import java.util.Scanner;

public class Worker {
    String unitName;
    int health;
    int constrSpeed;

    int numberOfObjects;


    public Worker(){
        this.unitName="Worker";
        this.health=10;
        this.constrSpeed=5;
        this.numberOfObjects++;
    }

    public Worker(String unitName){
        this.unitName=unitName;
        this.health=10;
        this.constrSpeed=5;
        this.numberOfObjects++;
    }

    public static void build(ArrayList<String> buildings, ArrayList<String> workers, String buildingName, int buildingConstructionTime, int workerConstSpeed) {
        if (Building.uniqueBuilding(buildings)){ //
            System.out.println("You can build only 1 "+buildingName + "in your Town");
            return;
        }else {
            if (workers.size() > 1) {
                System.out.println("Currently you have " + workers.size() + " available.");
                System.out.println("How many do you want to use");
                int workersUsed=workersUsedMenu(workers);
                int constructionDuration = buildingConstructionTime / (workerConstSpeed * workersUsed);
                System.out.println(buildingName + " will be build after " + constructionDuration + " seconds");
            } else {
                System.out.println("Currently you have 1 Worker available");
                int constructionDuration = buildingConstructionTime / workerConstSpeed;
                System.out.println(buildingName + " will be build after " + constructionDuration + " seconds");
            }
        }
    }

    public static int workersUsedMenu(ArrayList<String> workers) {

        Scanner sc = new Scanner(System.in);
        String workersUsed = sc.nextLine();
        try {
            Integer.parseInt(workersUsed);
            if (Integer.parseInt(workersUsed) < 1 || Integer.parseInt(workersUsed) > workers.size()) {
                System.out.println("Invalid choice! Enter Digit from 1 to " + workers.size());
                workersUsedMenu(workers);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid choice! Enter Digit from 1 to " + workers.size());
            System.out.println();
            workersUsedMenu(workers);
        }
        return Integer.parseInt(workersUsed);
    }
}
