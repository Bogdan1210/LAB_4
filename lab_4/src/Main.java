public class Main {
    public static void main(String[] args) {
        FireClass fire = new FireClass(10.5);
        Firefighter firefighter = new Firefighter("John", 5);
        FireTruck fireTruck = new FireTruck(500);

        fire.extinguishFire();
        firefighter.rescuePeople();
        fireTruck.refillWater();

        fire.customFireMethod();
        firefighter.customFirefighterMethod();
        fireTruck.customFireTruckMethod();

        FireTruck.FireTruckEquipment equipment = fireTruck.new FireTruckEquipment();
        equipment.operateEquipment();
    }
}