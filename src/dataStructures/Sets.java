package dataStructures;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		// HashSet: Random Order
		// LinkedHashSet: In the order they were entered
		// TreeSet: Natural Order (Alphabetic or Numerical)
		Set<String> animals = new HashSet<String>();
		
		
		// 2. Adding elements
		animals.add("Pig");
		animals.add("Cat");
		animals.add("Snake");
		animals.add("Bird");
		animals.add("Fish");
		animals.add("Goose");
		
		
		// Create a new set that we can use for comparison 
		Set<String> farmAnimals = new HashSet<String>();
		farmAnimals.add("Horse");
		farmAnimals.add("Pig");
		farmAnimals.add("Cow");
		farmAnimals.add("Chicken");
		farmAnimals.add("Dog");
		
		
		// What is the INTERSECTION (only animals and farm animals "AND")
		// 1. Copy existing set into a new set
		Set<String> intersectionSet = new HashSet<String>(animals);
		
		
		// 2. Retain only the elements that are also in the other set
		intersectionSet.retainAll(farmAnimals);
		System.out.println("The intersection is: " + intersectionSet);
		
		
		// What is the union (are both animals and farm animals "OR")
		Set<String> unionSet = new HashSet<String>(farmAnimals);
		unionSet.addAll(animals);
		System.out.println("The union is: " + unionSet);
		
		
		// What is the difference (In the circle, but not the inner circle - in 1 and not the other)
		Set<String> differenceSet = new HashSet<String>(animals);
		differenceSet.removeAll(farmAnimals);
		System.out.println("The difference is: " + differenceSet);

	}

}
