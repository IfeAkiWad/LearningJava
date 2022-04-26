public class Parameters {
    static void stringParameter(String place) {
        System.out.println("I have been to " + place);
    }

    static void intParameter(int integer) {
        System.out.println(integer);
    }

    static void boolParameter(boolean trueOrFalse) {
        System.out.println(trueOrFalse);
    }

    public static void main(String[] args) {
        stringParameter("Rome");
        stringParameter("China");
        stringParameter("Disney Land");
        stringParameter("the circus");

        intParameter(1);
        intParameter(2);
        intParameter(3);
        intParameter(4);
        intParameter(5);

        boolParameter(false);
        boolParameter(true);
        
    }
}
