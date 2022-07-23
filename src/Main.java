import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Worker> workersObj=new ArrayList<>();
        ArrayList<Soldier> soldiersObj=new ArrayList<>();
        ArrayList<Building> buildingsObj=new ArrayList<>();
        workersObj.add(new Worker("Worker"));

        Methods.startMenu(buildingsObj,workersObj);

    }
}