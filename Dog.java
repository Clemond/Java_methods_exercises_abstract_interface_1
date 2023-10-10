public class Dog implements Soundable{

    private String name;
    private int age;

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }


    @Override
    public void makeSound() {
        
        System.out.println("This dog called " + name + " and is " + age + " years old and is making a sound");
        
    }
    
}
