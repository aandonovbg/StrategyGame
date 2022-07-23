import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        ArrayList<Worker> workersObj=new ArrayList<>();
        ArrayList<Soldier> soldiersObj=new ArrayList<>();
        ArrayList<Building> buildingsObj=new ArrayList<>();
       // workersObj.add(new Worker("Worker"));

        //Methods.startMenu(buildingsObj,workersObj);
        for (int i = 0; i < 10; i++) {
            workersObj.add(new Worker());

        }
       for (int i = 0; i < workersObj.size(); i++) {
           System.out.println(workersObj.get(i).toString());
        }

    }
}