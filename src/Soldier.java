public class Soldier {
    String unitName;
    int attack;
    int defense;
    int health;

    public Soldier(){
        this.unitName="Soldier";
        this.attack=50;
        this.defense=20;
        this.health=50;
    }
    public Soldier(String eliteSoldier){
        this.unitName=eliteSoldier;
        this.attack=50;
        this.defense=20;
        this.health=50;
    }
    public void attack(String buildingName, int buildingEndurance,int attackDuration){
        System.out.println(this.unitName + " attacked " + buildingName);

        if (this.attack*attackDuration>buildingEndurance){
            int destructionTime=this.attack*attackDuration-(this.attack*attackDuration-buildingEndurance);
            System.out.println(buildingName + " was destroyed by " + this.unitName + " for "+destructionTime + " seconds");
        }
    }
}
