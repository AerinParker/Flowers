public class flowers {
    String name;
    String color;
    int petals;
    boolean scent;

    public static void main(String[] args) {
        flowers rose = new flowers();
        rose.name = "rose";
        System.out.println(rose.name);
        rose.color = "red";
        System.out.println(rose.color);
        rose.petals = 40;
        System.out.println(rose.petals);
        rose.scent = true;
        System.out.println(rose.scent);
        System.out.println();

        flowers pansy = new flowers();
        pansy.name = "pansy";
        System.out.println(pansy.name);
        pansy.color = "yellow";
        System.out.println(pansy.color);
        pansy.petals = 5;
        System.out.println(pansy.petals);
        pansy.scent = true;
        System.out.println(pansy.scent);
        System.out.println();

        flowers lily = new flowers();
        lily.name = "lily";
        System.out.println(lily.name);
        lily.color = "pink";
        System.out.println(lily.color);
        lily.petals = 6;
        System.out.println(lily.petals);
        lily.scent = true;
        System.out.println(lily.scent);
        System.out.println();
    }
}
