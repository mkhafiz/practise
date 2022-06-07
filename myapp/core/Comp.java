package myapp.core;

public class Comp {

    // Properties
    private Integer cost;
    private String brand;
    private long sinceBought;
    private boolean on = false;

    // Default constructor
    public Comp() {
        System.out.println("New PC");

    }

    public Comp(Integer cost) {
        this.cost = cost;
        System.out.printf("This PC costs %d\n", this.getCost());
    }

    public Comp(Integer cost, String brand) {
        this.cost = cost;
        this.brand = brand;
        System.out.printf("This %s PC costs %d\n", this.getBrand(), this.getCost());
    }

    // Getter and Setter
    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public long getSinceBought() {
        return sinceBought;
    }

    public void setSinceBought(long sinceBought) {
        this.sinceBought = sinceBought;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void on() {
        if (!this.on) {
            System.out.println("PC turning ON\n");
        } else {
            System.out.println("Weeee");
            System.out.println("Im working hard");
        }

    }

}
