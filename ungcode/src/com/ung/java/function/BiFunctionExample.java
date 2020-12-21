package com.ung.java.function;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

import com.ung.java.utilities.Planet;
/**
 * Let's see some java  Bifunction Interfaces
 * 
 * @author A.M
 *
 */
public class BiFunctionExample {

	
	public static void main(String[] args) {
		
		// 1. BiFunction with apply
		
		BiFunction<String, String, String> person = (name,username)->name.concat(username);
		
		String fullname = person.apply("John", " Doe");
		
		System.out.println("After apply: "+fullname);
		
		// 2. BiFunction with andThen 
		Function<String, String> location  = address -> address.contains("John") ? address : null;
		String address = person.andThen(location).apply("Hauer Landstr 20", " John");
		
		System.out.println("andThen: "+address);
		
		// 3. BiFunction with compute 

		System.out.println("Initial countries: "+ Planet.getCountries());
		
		BiFunction<Integer, String, String> newCountry = (key,country) -> country == null ? Planet.defaultCountry : country;
		
		Planet.getCountries().compute(1, newCountry);
		Planet.getCountries().compute(2, newCountry);
		Planet.getCountries().compute(5, newCountry);
		
		System.out.println("--------------------- ");
		System.out.println("After compute : "+ Planet.getCountries());
		
		//4. BiFunction with computeIfPresent
		newCountry = (key, country) -> country.concat(Planet.defaultCountry);
		Planet.getCountries().computeIfPresent(4, newCountry);
		Planet.getCountries().computeIfPresent(7, newCountry);
		
		System.out.println("--------------------- ");
		System.out.println("After computeIfPresent: "+ Planet.getCountries());
		
		
		// 5. with merge(key, value, BiFunction)
		
		BiFunction<String, String, String> merge = (key, country) -> country.concat(Planet.defaultCountry);
		Planet.getCountries().merge(1, " Peru ", merge);
		Planet.getCountries().merge(2, " Brazil ", merge);
		Planet.getCountries().merge(4, " Mexico ", merge);
		
		// add if key does not exist
		Planet.getCountries().merge(8, " UK ", merge);
		
	    System.out.println("HashMap using merge() => " + Planet.getCountries());

	}

}
