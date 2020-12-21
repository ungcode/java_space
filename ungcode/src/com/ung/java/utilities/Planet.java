package com.ung.java.utilities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Planet {

	private String name;
	private double mass;
	private double radius;
	public static final double gravitational = 6.67300E-11;
	public static String defaultCountry = "Germany";
	

	public Planet(String name, double mass, double radius) {
		this.name = name;
		this.mass = mass;
		this.radius = radius;
	}
	public Planet() {
		
	}

	public double surfaceGravity() {
		return gravitational * mass / (radius * radius);
	}

	public double surfaceWeight(double otherMass) {
		return otherMass * surfaceGravity();
	}

	public boolean isPlanet(String planetName) {

		for(Planet planet : getPlanets()) {
			if (planet.getName().equals(planetName)) {
				return true;
			}
		}
		return false;

	}

	public boolean isLivable(String planetName) {

		for(Planet planet : getPlanets()) {
			if (planet.getName().equals(planetName)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isNearEarth(boolean flag) {

		if(flag) {
			getPlanets().remove(0);
			getPlanets().remove(2);
			getPlanets().remove(3);
			getPlanets().remove(4);
			getPlanets().remove(5);
			getPlanets().remove(6);
			getPlanets().remove(7);
		
			return true;
		}
		return false;
	}
	
	public Planet getFeatures(boolean check) {
		
		Planet earth= new Planet("EARTH", 5.976e+24, 6.37814e6);
		return check ? earth : null;
	}
	
	public List<Planet> nearEarth(){
	
		getPlanets().remove(0);
		getPlanets().remove(2);
		getPlanets().remove(3);
		getPlanets().remove(4);
		getPlanets().remove(5);
		getPlanets().remove(6);
		getPlanets().remove(7);
		return getPlanets();
	}

	public List<Planet> getPlanets() {

		List<Planet> planets = new ArrayList<Planet>();
		planets.add(new Planet("MERCURY", 3.303e+23, 2.4397e6));
		planets.add(new Planet("VENUS", 4.869e+24, 6.0518e6));
		planets.add(new Planet("EARTH", 5.976e+24, 6.37814e6));
		planets.add(new Planet("MARS", 6.421e+23, 3.3972e6));
		planets.add(new Planet("JUPITER", 1.9e+27, 7.1492e7));
		planets.add(new Planet("SATURN ", 5.688e+26, 6.0268e7));
		planets.add(new Planet("URANUS", 8.686e+25, 2.5559e7));
		planets.add(new Planet("NEPTUNE ", 1.024e+26, 2.4746e7));
		return planets;

	}

	public String getName() {
		return name;
	}

	public double getMass() {
		return mass;
	}

	public double getRadius() {
		return radius;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Planet [name=");
		builder.append(name);
		builder.append(", mass=");
		builder.append(mass);
		builder.append(", radius=");
		builder.append(radius);
		builder.append("]");
		return builder.toString();
	}
	
public static Map<Integer,String>getCountries() {
		
		
		Map<Integer,String> countries = new HashMap<Integer,String>();
		countries.put(1, "Germany");
		countries.put(2, "USA");
		countries.put(3, "South Africa");
		countries.put(4, "Angola");
		countries.put(5, null);
		return countries;
	}
	
	

}
