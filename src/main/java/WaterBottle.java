public class WaterBottle {
    private Integer volume;


    public WaterBottle() {
        this.volume = 100;
    }

    public Integer getVolume() {
        return volume;
    }

    public void drink() {
        if (this.volume > 0) {
            this.volume -= 10;
        }
        else{
            System.out.println("Nothing to drink");
        }
    }

    public void empty() {
        this.volume = 0;
    }

    public void fill() {
        this.volume = 100;
    }
}
