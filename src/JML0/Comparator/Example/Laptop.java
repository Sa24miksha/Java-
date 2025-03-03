package JML0.Comparator.Example;

public class Laptop implements Comparable<Laptop> {
    private String brand;
    private int ram;
    private int price;

    @Override
    public int compareTo(Laptop o) {
        return 0;
    }

    //Constructor
    public Laptop(String brand, int ram, int price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    //Getters and Setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void print(String brand, int ram, int price){
        System.out.println("The brand is:" + brand + "of RAM:" + ram + "in just" + price);
    }
}
