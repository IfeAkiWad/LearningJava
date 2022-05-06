public class ClassConstructor {
    String forConstructor;
    
    
    public ClassConstructor(String x) {
        forConstructor = "This is an attribute initialized in a constructor";
        forConstructor = x;
    }

    public static void main(String[] args) {
        ClassConstructor myObj = new ClassConstructor("work"); 
        System.out.println(myObj.forConstructor);
        
    }
}
