package com.ung.java.methodreference;

import java.util.function.Function;

@FunctionalInterface
interface FirstTask {

	void execute();

}

@FunctionalInterface
interface SecondTask {

	String execute();

}

@FunctionalInterface
interface ThirdTask {

	String execute(String name);

}

@FunctionalInterface
interface fourthTask{
	
	String execute(String name);
}

interface Icar{
	
	Car show(String name);
}
class Car{
	
	public Car(String name) {
		
		System.out.println("car name: "+name);
	}
	
}
public class Animal {
	
	
	public static void walk() {

		System.out.println("animal is walking...");
	}

	public static String sleep() {

		return "The animal is sleeping";
	}

	public static String wakeUp(String name) {

		return "wake up: " + name;
	}
	
	public String eat(String name) {
		
		return name;
	}
	

	public static void main(String[] args) {

		// 1. Method reference Reference to static method 
		// 1.2 method with no parameter
		FirstTask task1 = Animal::walk;
		task1.execute();

		// 1.3 method with return statement
		SecondTask task2 = Animal::sleep;

		String result = task2.execute();
		System.out.println("result: " + result);

		// 1.4. method with parameter and return statement 
		ThirdTask task3 = Animal::wakeUp;

		result = task3.execute("Snoopy");
		System.out.println("result: " + result);
		
		//1.5 We can also use a predefined functional interfaces to refer a method
		Function<String, String> animal = Animal::wakeUp;
		
		System.out.println("result: "+animal.apply("Cat"));
		
		//2. Reference non-static method .
		
		// 2.1 We can also use predefined functional interface
		
		Animal a = new Animal(); // create the object
		fourthTask task4 = a::eat;
		System.out.println(task4.execute("Horse"));
		
		
		//3. Reference to a Constructor
		Icar car = Car::new;
		car.show("BMW");
		
		// *** BONUS***
		// 2.2 We can also use predefined functional interface
		
		Function<String, String> status = new Animal()::eat;
		System.out.println(status.apply("Squirrel"));
			
	}

}
