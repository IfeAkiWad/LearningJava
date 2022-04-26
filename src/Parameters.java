public class Parameters {
    static void stringParameter(String place) {
        System.out.println("I have been to " + place);
    }

    public static void main(String[] args) {
        stringParameter("Rome");
        stringParameter("China");
        stringParameter("Disney Land");
        stringParameter("the circus");
    }
}
