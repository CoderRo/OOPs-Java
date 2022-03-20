package basic;

import encapsulation.Encapsulation;

public class MainClass {	
	public static void main(String args[]) {
		Person p1 = new Person();// Creating an object of a class.
		p1.age = 21;
		p1.name =  "Rohan";
		System.out.println(p1.name + " " + p1.age);
		
		Person p2 = new Person(32,"fg");
//		p2.name = "Sham";
//		p2.age = 32;
		
		p1.walk();
		p2.eat();
		p1.walk(23);
		System.out.println(Person.count);
		
		developer devObj = new developer(13,"Vijendra");
		devObj.walk();
		Encapsulation EpClass = new Encapsulation();
		EpClass.doWork(); // As this is the public method in Encapsulation class this will work fine.
		//EpClassdoWork1(); // As this is not a public method , So this will only be accessed inside the class.
		
	}
}
class developer extends Person{
	public developer(int age, String name) {
		super(age,name);
	}
	void walk() { // Runtime polymorphism -> parent and child class contain the method with the same name and child class object is going to call child class methods
		System.out.println("Developer "+ this.name + " is walking");
	}
}
class Person{
	int age;
	String name;
	
	static int count;
	
	//Constructor
	public Person() {
		count++;
		System.out.println("Creating an object");
	}
	
	public Person( int age, String name) {
		this(); // this keyword is used to call a constructor from other constructor.
		this.age = age;
		this.name = name;
	}
	
	void walk() {
		System.out.println(name +" is walking");
	}
	
	void eat() {
		System.out.println(name +" is drinking");
	}
	
	void walk(int noOfSteps) { // this is compile time polymorphism
		System.out.println(name +" is running " + noOfSteps + " Steps");
	}
	
}
