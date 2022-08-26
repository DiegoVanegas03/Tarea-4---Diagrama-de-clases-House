import java.util.List;

public class Neighborhood {
    private List<Street> streets;
    private int gardens;
    private boolean basketballCourt;
    private boolean footballCourt;
    private boolean swimmingPool;

    public Street getStreets(){
        Street temp;
        temp =streets.get(streets.size());
        return temp;
    }

    public int getGardens(){
        return gardens;
    }
    public boolean getBasketballCourt(){
        return basketballCourt;
    }

    public boolean getFotballCourt(){
        return footballCourt;
    }
     public boolean getSwimmingPool(){
        return swimmingPool;
     }

     public void setStreets(Street streets){
        this.streets.add(streets);
     }

    public void setBasketballCourt(boolean basketballCourt) {
        this.basketballCourt = basketballCourt;
    }

    public void setGardens(int gardens){
        this.gardens = gardens;
    }

    public void setFootballCourt(boolean footballCourt){
        this.footballCourt = footballCourt;
    }

    public void setSwimmingPool(boolean swimmingPool){
        this.swimmingPool= swimmingPool;
    }
}
