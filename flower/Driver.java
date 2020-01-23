package flower;

import java.util.ArrayList;
import java.nio.file.*;

public class Driver {

    public static void main(String[] args) {
        Flower rose = new Flower("rose", "red", 40, true); // creates Flower objects

        Flower pansy = new Flower("pansy", "yellow", 5, true);

        Flower lily = new Flower("lily", "pink", 6, true);

        Flower tulip = new Flower("tulip", "yellow", 3, true);

        ArrayList<Flower> flowers = new ArrayList<Flower>(); // makes ArrayList and adds each flower to it
        flowers.add(rose);
        flowers.add(pansy);
        flowers.add(lily);
        flowers.add(tulip);

        Path path = Paths.get("flower/flowers.txt"); // sets path to write data

        try { // prevents IOException ?
            Files.writeString(path, ""); // clears file
            for (int i = 0; i < flowers.size(); i++) { // writes flower details to file
                flowers.get(i).printFlowerDetails();
                Files.writeString(path, flowers.get(i).getFlowerName().toString() + ": ", StandardOpenOption.APPEND);
                Files.writeString(path, flowers.get(i).getFlowerColor().toString() + ", ", StandardOpenOption.APPEND);
                Files.writeString(path, String.valueOf(flowers.get(i).getFlowerPetals()) + ", ", StandardOpenOption.APPEND);
                Files.writeString(path, String.valueOf(flowers.get(i).getFlowerScent()), StandardOpenOption.APPEND);
                Files.writeString(path, System.lineSeparator(), StandardOpenOption.APPEND);

            }
        }
        catch (Exception e) {
            System.out.println("Problem writing to file.");
        }
    }
}