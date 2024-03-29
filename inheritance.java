// Java program to demonstrate the concept of inheritance

//base class
class Animal {
  //the animal class has two fields
  private Sting name;
  private int numberOfLegs;
  
  // animal has two abstract methods
  public void speak();
  public void attack();

  //the animal class has two constructors
  public Aminal(){
  };
  public Animal(String name, int numberOfLegs){
    this.name = name;
    this.numberOfLegs = numberOfLegs;
  }
  // Methods to get and set name and number of legs
  public int getNumberOfLegs(){
    return this.numberOfLegs;
  }
  public String getName(){
    return this.name;
  }
  public void setNumberOfLegs(int legs){
    this.numberOfLegs = legs;
  }
  public void setName(String newName){
    this.name = newName;
  }

  // method to display information about animal
  public void displayInformation(){
    System.out.println("Name: " + this.name, " Number of Legs: " + this.numberOfLegs);
  }
}

// Create a child class that extends the parent class animal
class Dog extends Animal{
  // add new fields that are specific to the dog class
  String breed;

  // the dog class has one constructor
  public Dog(String name, int numberOfLegs, String breed){
    super(name, numberOfLegs);
    this.breed = breed;
  }

  //override the speak and attack methods
  @Override public void speak(){
    System.out.println("WOOF");
  }
  @Override public void attack(){
    System.out.println("Biting");
  }
  @Override public void displayInformation(){
    System.out.println(super.displayInformation + " Breed: " + this.breed);
  }
}

//main class
public class Main{
  public static void main(String[] args){
    // create instance of animal
    Animal animal1 = new Animal();
    Animal animal2 = new Animal("Frogger", 4);

    // create instance of subclass
    Dog dog1 = new Dog("Fido", 4, "Lab");

    //display information
    animal2.displayInformation();
    dog1.displayInformation();
  }
}

