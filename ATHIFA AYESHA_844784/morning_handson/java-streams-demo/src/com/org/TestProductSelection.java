package com.org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestProductSelection {

	public static void main(String[] args) {
		// Suppose user wants only Lenova, but ratings should be in sorted order
		List<Laptop> laptops = Laptop.fetchLaptops();
		// get only particular laptop and add to the collection
		/*List<Laptop> particularLaptops = new ArrayList<Laptop>();
		for(Laptop laptop : laptops) {
			if(laptop.getBrandName().equals("Lenova"))
				particularLaptops.add(laptop);
		}
		// sort the particular laptop with ratings in sorted order
		Collections.sort(particularLaptops, new Comparator<Laptop>() {
			@Override
			public int compare(Laptop o1, Laptop o2) {
				return Double.compare(o2.getRatings(), o1.getRatings());
			}
		});
		// iterate the sorted laptops
		for(Laptop laptop : particularLaptops) {
			System.out.println(laptop);
		}*/
		
		/*List<Laptop> particularLaptop = laptops.stream()
				.filter(item-> item.getBrandName().equals("Lenova") || item.getBrandName().equals("Acer"))
				.filter(item-> item.getPrice()>30000)
				.sorted((l1, l2) -> Double.compare(l2.getRatings(), l1.getRatings()))
                .collect(Collectors.toList());
particularLaptop.forEach(item-> System.out.println(item));*/
		
		System.out.println("----sequesntial stream----");
		laptops.stream().filter(item-> item.getRatings()>4.3).forEach(item->System.out.println(item));
		System.out.println("----Parallel stream----");
		laptops.parallelStream().filter(item-> item.getRatings()>4.3)
		//.sorted((item1, item2)-> Double.compare(item2.getRatings(), item1.getRatings()))
		//.forEach(item->System.out.println(item));
		.collect(Collectors.toList()).stream().sorted((item1, item2) -> Double.compare(item2.getRatings(),item1.getRatings()))
		.forEach(item->System.out.println(item));
		 

	}

}
