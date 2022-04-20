public class Variables {
   static void strVariables() {
        String practice = "I'm growing my coding muscle by learning ";
        String language = "Java";

        String experience = "My experience so far has been ok. I would rate Java with a(n) ";
        char rate = 'A';

        System.out.println(practice + language);
        System.out.println(experience + rate);
    }

    static void intVariables() {
        int days = 1 + 2;
        int blogs = 2;
        String sentence = "I have been learning for " + days + " days, and have written " + blogs + " blogs";
        
        System.out.println(sentence);
    }

    public static void main(String[] args) throws Exception {
        strVariables();
        intVariables();
        
    }
}
