package flower;

public class Flower {
    private String flowerName;
    private String flowerColor;
    private int flowerPetals;
    private boolean flowerScent;

    public Flower(String name, String color, int petals, boolean scent) { // constructor
        flowerName = name;
        flowerColor = color;
        flowerPetals = petals;
        flowerScent = scent;
    }

    public void printFlowerDetails() {
        System.out.println(getFlowerName() + ": " + getFlowerColor() + ", " + getFlowerPetals() + ", " + getFlowerScent());
    }

    public String getFlowerName() {
        return flowerName;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public int getFlowerPetals() {
        return flowerPetals;
    }

    public boolean getFlowerScent() {
        return flowerScent;
    }

    public void setFlowerName(String newFlowerName) {
        this.flowerName = newFlowerName;
    }
    public void setFlowerColor(String newFlowerColor) {
        this.flowerColor = newFlowerColor;
    }

    public void setFlowerPetals(int newFlowerPetals) {
        this.flowerPetals = newFlowerPetals;
    }

    public void setFlowerScent(boolean newFlowerScent) {
        this.flowerScent = newFlowerScent;
    }
}