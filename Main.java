public class Main{
    public static void main(String[] args) {
        
        // Skapa ett interface som heter Soundable med en abstract metod som heter makeSound()
        // Skapa två nya klasser, Cat, Dog eller något annat djur som låter. Modifiera metoden makeSound.

        Cat cat1 = new Cat("Majsan");
        Dog dog1 = new Dog("Scooby", 4);

        cat1.makeSound();
        dog1.makeSound();

    }
}