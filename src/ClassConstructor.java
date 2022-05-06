public class ClassConstructor {
    String forConstructor;
    String humanName;
    int humanAge;
    
    public ClassConstructor(String x, String name, int age) {
        forConstructor = "This is an attribute initialized in a constructor";
        forConstructor = x;

        humanName = name;
        humanAge = age;
    }

    public void ClassConstructorTwo(String name, int age) {
       humanName = name;
        humanAge = age;
    }

    public static void main(String[] args) {
        ClassConstructor myObj = new ClassConstructor("work"); 
        System.out.println(myObj.forConstructor);
        
        ClassConstructor human = new ClassConstructorTwo("Bill", 32); 
    }
}
