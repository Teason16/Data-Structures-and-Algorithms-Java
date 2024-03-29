// Java program to demonstrate the concept of inheritance

//base class
class Animal {
  //the animal class has two fields
  private Sting name;
  private int numberOfLegs;
  
  // animal has two abstract methods
  this.speak();
  this.attack();

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
