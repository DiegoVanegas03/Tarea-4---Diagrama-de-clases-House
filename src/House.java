public class House {
    private Kitchen kitchen;
    private DiningRoom diningRoom;
    private LivingRoom livingRoom;
    private RestRoom []restRooms;
    private BedRoom []bedRooms;
    private Yard yard;

    public Kitchen getKitchen(){
        return kitchen;
    }

    public DiningRoom getDiningRoom(){
        return diningRoom;
    }

    public LivingRoom getLivingRoom(){
        return livingRoom;
    }

    public Yard getYard(){
        return yard;
    }

    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public void setDiningRoom(DiningRoom diningRoom) {
        this.diningRoom = diningRoom;
    }

    public void setLivingRoom(LivingRoom livingRoom) {
        this.livingRoom = livingRoom;
    }

    public void setYard(Yard yard){
        this.yard = yard;
    }

    public void addRoom(BedRoom bedRoom){
        int i = this.bedRooms.length;
        this.bedRooms[i+1] = bedRoom;
    }

    public void addRoom(RestRoom restRoom){
        int i = this.restRooms.length;
        this.restRooms[i+1] = restRoom;
    }
}
