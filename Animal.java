class Animal{
    protected String name;

    Animal(String name){
        this.name = name;
    }

    public void speak(){
        System.out.println("the Animal makes a sound *[INSERT SOUND HERE]*");
    }

    @Override
    public String toString(){
        return "Animal: " + this.name;
    }

    @Override
    public boolean equals(Object o){
        if (o instanceof Animal){
            return ((Animal)o).name == this.name;
        } else {
            return false;
        }
    }
}
// Base class
// TODO: Define a class called Animal with:
// - A protected String field called name
// - A constructor that takes a name and assigns it
// - A public void method called speak() that prints a generic sound
// - Override toString() to return "Animal: " + name
// - Override equals(Object o) to compare names if o is an Animal


class Mammal extends Animal{
    protected boolean warmBlooded;
    protected String dietType;
    protected int numLegs;
    protected String sound;

    Mammal(String name, boolean warmBlooded, String dietType, int legs, String sounds){
        super(name);
        this.warmBlooded = warmBlooded;
        this.dietType = dietType;
        this.numLegs = legs;
        this.sound = sounds;
    }

    @Override
    public void speak(){
        System.out.printf("The %s says %s\n", this.name, this.sound);
    }

    public void preformTrick(){
        System.out.println("The mammal does... omgomgomg the SICKEST BACKFLIP YOU'VE EVER SEEN... like what??? you didn't teach it to do that...... how????? what?!!??!?!?????");
    }
}
// Subclass
// TODO: Define a class called Mammal that extends Animal with:
// - A protected boolean field called warmBlooded (set to true)
// - A protected String field called dietType (e.g., "herbivore")
// - A protected int field called numLegs (e.g., 4)
// - A protected String field called sound (e.g., "growl")
// - A constructor that uses super to set name and sets these fields
// - Override speak() to print the value of sound prefixed by name


class Dog extends Mammal{
    Dog(String name){
        super(name, true, "Omnivore", 4, "Woof!!");
    }
    @Override
    public void speak(){
        System.out.println(this.name + " says: Woof!!");
    }
    @Override
    public boolean equals(Object o){
        if (o instanceof Dog){
            return ((Dog)o).name == this.name;
        } else {
            return false;
        }
    }
}
// Subclasses of Mammal
// TODO: Define a class Dog that extends Mammal
// - Constructor takes name and passes name, true, "omnivore", 4, "Woof!" to super
// - Override speak() to print "<name> says: Woof!"

class Cat extends Mammal{
    Cat(String name){
        super(name, true, "carnivore", 4, "Meow!!! :3:3:3:3:3:3 meowmeowmeowmeowmeowmeowmeowmeowmeowmeow");
    }
    @Override
    public void speak(){
        System.out.println(this.name + " says: " + this.sound);
    }
}
// TODO: Define a class Cat that extends Mammal
// - Constructor takes name and passes name, true, "carnivore", 4, "Meow!" to super
// - Override speak() to print "<name> says: Meow!"


final class Human extends Mammal{
    Human(String name){
        super(name, true, "Omnivore", 2, "HAIIII!!!!! HAI HAI HAI HAI HAI :3:3:3  HELLOO !!!!");
    }
}
// TODO: Define a final class Human that extends Mammal
// - Constructor takes name and passes name, true, "omnivore", 2, "Hello!" to super

class Reptile extends Animal{
    boolean warmBlooded = false;
    int numLegs;
    String dietType;
    String sound;

    Reptile(String name, boolean warmBlooded, int numLegs, String dietType, String sound){
        super(name);
        this.warmBlooded = warmBlooded;
        this.dietType = dietType;
        this.numLegs = numLegs;
        this.sound = sound;
    }

    @Override
    public void speak(){
        System.out.println(this.name + " Syas: " + this.sound);
    }
}
// TODO: Define a class Reptile that extends Animal
// - Add fields: boolean warmBlooded (set to false), int numLegs, String dietType, String sound
// - Constructor should take all values and use super for name
// - Override speak() to print the value of sound prefixed by name


class AnimalKingdomTest{
    public static void main(String[] args) {
        Animal a1 = new Dog("Buddy");
        Animal a2 = new Cat("Whiskers");
        a1.speak();
        a2.speak();
        System.out.println(a1.toString() + a2.toString());

        System.out.println(a1.equals(new Dog("Buddy")));

        Animal blu = new Animal("Abram!!!!!");
        Mammal belugaWhale = (Mammal)blu;
        belugaWhale.preformTrick();
    }
}
// Main class to test
// TODO: Define class AnimalKingdomTest with a main method
// - Create Animal a1 = new Dog("Buddy")
// - Create Animal a2 = new Cat("Whiskers")
// - Call speak() on both (demonstrating polymorphism)
// - Print both using System.out.println
// - Use equals() to compare a1 to a new Dog("Buddy")

class Bird extends Animal{

    Bird(String name){
        super(name);
    }

    @Override
    public void speak(){
        System.out.println("SQUAAAKKK im gonna kill ya SQUAAAKK!!!!!! 🦜🦜🦜🦜🦜");
    }
}

class NewYorker extends Human{ // So..... what had happened was.... Human be like.. final and shih so...... *Liam in the other room*[ON GOD BRO IT BE LIKE.. SO FINAL FOR REAL] it be like a constant fr so, *Liam*[SO constant bro, like you can't be changing that shih at ALL.... ANYWHERE..... on GOD!!!!!!!!!!!!!!] can't be changed type shih, ykwim???
    protected String sound = "F*#K you!!!!";

    NewYorker(String name){
        super(name);
    }
}


// Additional TODOs:
// 1. Create a new subclass of Animal (e.g., Bird) and override speak()
// 2. Try to extend Human – what happens and why?
// 3. Override equals() in Dog or Cat to also check the type
// 4. Add a method to Mammal called performTrick() and call it via downcasting
