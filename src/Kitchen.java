public class Kitchen {
    private boolean stove;
    private  boolean sink;
    private int windows;
    private boolean refrigerator;
    private boolean oven;
    private int width;
    private int height;
    private String color;

    public boolean getStove(){
        return stove;
    }

    public boolean getSink(){
        return sink;
    }

    public int getWindows(){
        return  windows;
    }

    public boolean getRefrigerator(){
        return  refrigerator;
    }

    public boolean getOven(){
        return oven;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public String getColor(){
        return color;
    }

    public void setStove(boolean stove){
        this.stove = stove;
    }

    public void setSink(boolean sink){
        this.sink = sink;
    }

    public void setWindows(int windows){
        this.windows = windows;
    }

    public void setRefrigerator(boolean refrigerator){
        this.refrigerator = refrigerator;
    }

    public void setOven(boolean oven){
        this.oven = oven;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public void setColor(String color){
        this.color = color;
    }
}
