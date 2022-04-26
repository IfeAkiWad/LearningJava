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

    static void multipleParameter(String place, int integer, boolean trueOrFalse) {
        System.out.println("Sammy going to " + place + integer + " years ago is " + trueOrFalse);
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

        multipleParameter("NYC ", 5, true);
    }
}
