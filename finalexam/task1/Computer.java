package finalexam.task1;

public class Computer {

    private String brand; 
    private int memory; 
    private int ssd; 
    private int hdd;

    public Computer(String brand, int memory, int ssd, int hdd) {
        this.brand = brand;
        this.memory = memory;
        this.ssd = ssd;
        this.hdd = hdd;
    }

    public String toString() {
        return "Brand: " + brand + ", Memory: " + memory + "GB, SSD: " + ssd + "GB, HDD: " + hdd + "GB";
    }
}
