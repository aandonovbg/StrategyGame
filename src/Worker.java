import java.util.ArrayList;
import java.util.Scanner;

public class Worker {
    String unitName;
    int health;
    int constrSpeed;




    public Worker(){
        this.unitName="Worker";
        this.health=10;
        this.constrSpeed=5;

    }

    public Worker(String unitName){
        this.unitName=unitName;
        this.health=10;
        this.constrSpeed=5;

    }
public int getConstrSpeed(){
        return constrSpeed;
}
    public static void build(String buildingName,int buildingEndurance,int buildingConstrTime,ArrayList<Building> buildingsObj, ArrayList<Worker> workersObj) {
        if (Building.uniqueBuilding(buildingName,buildingsObj )){ // if TRUE
            System.out.println("You can build only 1 "+buildingName + "in your Town");
            return;
        }else {

            if (workersObj.size() > 1) {
                System.out.println("Currently you have " + workersObj.size() + " available.");
                System.out.println("How many do you want to use");
                int workersUsed=workersUsedMenu(workersObj);
                buildingsObj.add(new Building(buildingName,buildingEndurance,buildingConstrTime));
                int constructionDuration = buildingsObj.get(buildingsObj.size()-1).constructionTime / (workersObj.get(0).constrSpeed * workersUsed);
                System.out.println(buildingName + " will be build after " + constructionDuration + " seconds");
            } else {

                System.out.println("Currently you have 1 Worker available");
                buildingsObj.add(new Building(buildingName,buildingEndurance,buildingConstrTime));
                int constructionDuration = buildingsObj.get(buildingsObj.size()-1).constructionTime / workersObj.get(0).constrSpeed;
                System.out.println(buildingName + " will be build after " + constructionDuration + " seconds");
            }
        }
    }

    public static int workersUsedMenu(ArrayList<Worker> workers) {

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
