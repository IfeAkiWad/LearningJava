
public class ClassConstructorTwo {
    String humanName;
    int humanAge;
    
    public ClassConstructorTwo(String name, int age) {
       humanName = name;
        humanAge = age;
    }

    public static void main(String[] args) {
        ClassConstructorTwo human = new ClassConstructorTwo("Bill", 32); 
        System.out.println(human.humanName + " " + human.humanAge);
    }
}
