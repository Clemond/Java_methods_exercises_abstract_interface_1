public class Cat implements Soundable {

    String name;

    public Cat(String name){
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " is mjaaoing");
    }
    
}
