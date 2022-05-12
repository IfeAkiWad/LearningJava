class NewGarden{
    protected String announce = "In season!";
    public void characteristcs() {
        String name = "Aster";
        String color = " white, pink, red, orange, yellow, or purple";
        System.out.println("Flower: " + name + " -" + " color(s): " + color);
    }

    public void bloomTime() {
        String time = "late spring";
        System.out.println("In bloom: " + time);
    }
}


public class Flower extends NewGarden{
    private String bloom = "BLOOM!";

    public static void main(String[] args) {
        Flower aster = new Flower();
        aster.characteristcs();
        aster.bloomTime();
        System.out.println(aster.announce);
        System.out.println(aster.bloom);

        
    }
}
