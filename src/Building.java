import java.util.ArrayList;


public class Building {
    String name;
    int endurance;
    int constructionTime;

    public Building() {
        this.name = "";
        this.endurance = 0;
        this.constructionTime = 0;
    }

    public Building(String name, int endurance, int constructionTime) {
        this.name = name;
        this.endurance = endurance;
        this.constructionTime = constructionTime;
    }

    public static boolean uniqueBuilding(String buildingName,ArrayList<Building> buildingsObj) {
        boolean isUnique = false;

        if (buildingName.equalsIgnoreCase("Hospital")||buildingName.equalsIgnoreCase("Town Hall")){
            for (int i = 0; i < buildingsObj.size(); i++) {
                if (buildingName.equalsIgnoreCase(buildingsObj.get(i).name)){
                    isUnique = true;
                }
            }
        }

        return isUnique;
    }


}
