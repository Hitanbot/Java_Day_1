public class Printer {
    private Integer paper;
    private Integer toner;

    public Printer(Integer paper,Integer toner) {
        this.paper = paper;
        this.toner = toner;
    }

    public Integer getPaper() {
        return paper;
    }

    public Integer getToner() {
        return toner;
    }

    public void print(Integer pages,Integer copies){
        if (this.paper>=pages*copies){
            this.paper-=pages*copies;
            this.toner-=1;
        }
    }
}
