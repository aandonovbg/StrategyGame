import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> buildings=new ArrayList<>();
        ArrayList<String> workers=new ArrayList<>();
        ArrayList<String> soldiers=new ArrayList<>();
        Worker worker=new Worker();

        Methods.startMenu(buildings, workers, worker);

    }
}