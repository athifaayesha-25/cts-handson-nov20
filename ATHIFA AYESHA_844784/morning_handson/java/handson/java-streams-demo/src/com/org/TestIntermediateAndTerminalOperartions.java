package com.org;

import java.util.ArrayList;
import java.util.List;

public class TestIntermediateAndTerminalOperartions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//suppose u want to only add names of the laptops in a separate list
		List<Laptop> list = Laptop.fetchLaptops();
	/*	List<String> names = new ArrayList<String>();
		for(Laptop laptop:list){
			names.add(laptop.getBrandName());
		}
		for(String name:names){
			System.out.println(name);
		}*/
		//map allows u to give a data and get a different data
		//you give complex type and get some other type, like pass laptop and get names
		list.stream().map(item->item.getBrandName()).distinct().forEach(item-> System.out.println(item));
		//counting the number of items
		long count = list.stream().filter(item-> item.getBrandName().equals("Acer")).count();
		System.out.println("Count: "+count);

	}

}
