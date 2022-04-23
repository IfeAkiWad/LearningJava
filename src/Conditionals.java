public class Conditionals {
    public static void main(String[] args) throws Exception {
        ifStatement();
        doWhile();
    }

    static void ifStatement() {
        int laurenAge = 20;

        if (laurenAge < 10) {
            System.out.println("Elementary school is fun!");
        }else if (laurenAge < 18) {
            System.out.println("Can't wait to get my license!");
        }else if (laurenAge < 25) {
            System.out.println("College is real stressful!");
        }else {
            System.out.println("I'm getting too old for this crap!");
        }
    }

    static void doWhile() {
        int laurenAge = 0;

        do {
            System.out.println("Elementary school is fun!");
            laurenAge ++;
        } while (laurenAge < 10);
       
    }
}
