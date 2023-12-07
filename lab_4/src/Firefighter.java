public class Firefighter {
    private String name;
    private int experience;

    public Firefighter(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    public void rescuePeople() {
        System.out.println(name + " рятує людей з вогню.");
    }

    public int getExperience() {
        return experience;
    }

    public void reportStatus() {
        System.out.println(name + " має " + experience + " Роки досвіду.");
    }

    public void customFirefighterMethod() {
        System.out.println("Виконання спеціального методу пожежного");
    }
}
