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
}
