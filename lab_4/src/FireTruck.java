public class FireTruck {
    private int waterCapacity;

    public FireTruck(int capacity) {
        this.waterCapacity = capacity;
    }

    public void refillWater() {
        System.out.println("Заправний резервуар для води ємкікстю " + waterCapacity + " галонів.");
    }

    public void deployTruck() {
        System.out.println("Розгортання пожежного автомобіля з ємністю для води " + waterCapacity + " галонів.");
    }

    public void customFireTruckMethod() {
        System.out.println("Виконання спеціального методу пожежної машини");
    }
    
    public class FireTruckEquipment {
        public void operateEquipment() {
            System.out.println("Експлуатаційне обладнання пожежного автомобіля ємкістю: " + waterCapacity + " галонів.");
        }
    }
}
