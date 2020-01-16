public class Flowers {
    private String flowerName;
    private String flowerColor;
    private int flowerPetals;
    private boolean flowerScent;

    public Flowers(String name, String color, int petals, boolean scent) {
        flowerName = name;
        flowerColor = color;
        flowerPetals = petals;
        flowerScent = scent;
    }

    public void printFlowerDetails() {
        System.out.println(getFlowerName() + " " + getFlowerColor() + " " + getFlowerPetals() + " " + getFlowerScent());
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

    public static void main(String[] args) {
        Flowers rose = new Flowers("rose", "red", 40, true);
        System.out.println(rose.flowerName + " " + rose.flowerColor + " " + rose.flowerPetals + " " + rose.flowerScent);
        System.out.println();

        Flowers pansy = new Flowers("pansy", "yellow", 5, true);
        System.out.println(pansy.flowerName + " " + pansy.flowerColor + " " + pansy.flowerPetals + " " + pansy.flowerScent);
        System.out.println();

        Flowers lily = new Flowers("lily", "pink", 6, true);
        System.out.println(lily.flowerName + " " + lily.flowerColor + " " + lily.flowerPetals + " " + lily.flowerScent);
        System.out.println();

        Flowers tulip = new Flowers("tulip", "yellow", 3, true);
        tulip.setFlowerName("pink tulip");
        tulip.setFlowerColor("pink");
        tulip.setFlowerPetals(3);
        tulip.setFlowerScent(true);
        tulip.printFlowerDetails();
    }
}
