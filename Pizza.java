// Pizza.java
public class Pizza {

    private String type;
    private int size; // Size in inches
    private double price;

    public Pizza(){}

    public Pizza(String type, int size, double price) {
        this.type = type;
        this.size = size;
        this.price = price;
    }

    // Gets the type of pizza
    public String getType() {
        return type;
    }

    // Sets the type of pizza
    public void setType(String type) {
        this.type = type;
    }

    // Gets the size of the pizza
    public int getSize() {
        return size;
    }

    // Sets the size of the pizza
    public void setSize(int size) {
        this.size = size;
    }

    // Gets the price of the pizza
    public double getPrice() {
        return price;
    }

    // Sets the price of the pizza
    public void setPrice(double price) {
        this.price = price;
    }

    // Calculates the price per inch of the pizza
    public double calculatePricePerInch() {
        if (size <= 0) {
            throw new IllegalArgumentException("Size must be greater than 0");
        }
        return price / size;
    }
}
