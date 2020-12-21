package com.ung.java.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import com.ung.java.utilities.Planet;


public class FunctionExample {

	
	public static void main(String[] args) {
		
		Planet planet = new Planet();
		
		//function with apply method
		Function<List<Planet>, Boolean> isEarth  = planets ->planets.get(2).getName().equals("EARTH");
		
		System.out.println("is earth: "+ isEarth.apply(planet.getPlanets()));
		
		//function with andThen and apply method
		Function<Boolean, Planet>showDetails  = check ->planet.getFeatures(check);
		
		System.out.println("Earth fearures: "+isEarth.andThen(showDetails).apply(planet.getPlanets()));
		
		
		
	}
}
