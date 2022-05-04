public class ClassConstructor {
    String forConstructor;

    public ClassConstructor() {
        forConstructor = "This is an attribute initialized in a constructor";
    }

    public static void main(String[] args) {
        ClassConstructor myObj = new ClassConstructor(); 
        System.out.println(myObj.forConstructor); 
    }
}
