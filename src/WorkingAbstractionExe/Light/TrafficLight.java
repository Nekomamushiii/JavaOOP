package WorkingAbstractionExe.Light;

public class TrafficLight {
    private Color color;

    public TrafficLight(Color color) {
        this.color = color;
    }
    public void change(){
        switch (color){
            case RED : this.color= Color.GREEN;break;
            case GREEN : this.color=Color.YELLOW;break;
            case YELLOW : color=Color.RED;break;
        }
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
