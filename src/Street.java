import java.util.List;

public class Street {
    private String name;
    private List<House> houses;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void addHouse(int number, House house){
        this.houses.add(house);
    }
}
