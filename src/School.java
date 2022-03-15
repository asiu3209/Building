public class School extends Buildings {
    private int population; String gradeLevels;
    public School(String name, String address, int age, int population, String gradeLevels){
        super(name, address, age);
        this.gradeLevels = gradeLevels;
        this.population = population;
    }

    public int getPopulation() {
        return population;
    }

    public String getGradeLevels(){
        return gradeLevels;
    }
}
