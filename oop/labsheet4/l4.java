class Animal {
   
    private String name;
    private int age;


    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

  
    public void makeSound() {
        System.out.println("Animal makes a generic sound.");
    }

    public String getName() {
        return name;
    }

    
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

class Mammal extends Animal {

    private String furColor;


    public Mammal(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }

    @Override
    public void makeSound() {
        System.out.println("Mammal makes a mammal-specific sound.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Fur Color: " + furColor;
    }
}

class Bird extends Animal {

    private double wingSpan;


    public Bird(String name, int age, double wingSpan) {
        super(name, age);
        this.wingSpan = wingSpan;
    }

    @Override
    public void makeSound() {
        System.out.println("Bird makes a bird-specific sound.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Wing Span: " + wingSpan;
    }
}

class Dog extends Mammal {
  
    private String breed;

    public Dog(String name, int age, String furColor, String breed) {
        super(name, age, furColor);
        this.breed = breed;
    }

    @Override
    public String toString() {
        return super.toString() + ", Breed: " + breed;
    }
}

public class l4 {
    public static void main(String[] args) {
       
        Animal animal = new Animal("Generic Animal", 5);
        Mammal mammal = new Mammal("Mammal One", 3, "Brown");
        Bird bird = new Bird("Bird One", 2, 20.5);
        Dog dog = new Dog("Dog One", 4, "White", "Golden Retriever");

        animal.makeSound();
        System.out.println("Animal Info: " + animal);

        mammal.makeSound();
        System.out.println("Mammal Info: " + mammal);

        bird.makeSound();
        System.out.println("Bird Info: " + bird);

        System.out.println("Dog Info: " + dog);
    }
}
