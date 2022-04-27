public class Garden {
    public static void main(String[] args) {
        // Garden aster = new Garden();
        asterFlower();
        azaleaFlower();
    }

    public static void asterFlower() {
        Garden aster = new Garden();
        aster.characteristcs("Aster", " blue, purple, lilac, pink, or white");
        aster.bloomTime("late summer through fall");
    } 

    public static void azaleaFlower() {
        Garden azalea = new Garden();
        azalea.characteristcs("Azalea", " white, pink, red, orange, yellow, or purple");
        azalea.bloomTime("late spring");
    } 

    public void characteristcs(String name, String color) {
        System.out.println("Flower: " + name + " -" + " color(s): " + color);
    }

    public void bloomTime(String time) {
        System.out.println("In bloom: " + time);
    }
}