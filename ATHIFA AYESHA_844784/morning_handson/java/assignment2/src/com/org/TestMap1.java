package com.org;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,List<String>> map = new HashMap<String,List<String>>();
		List<String> list1 = new ArrayList<String>();
		list1.add("student1");
		list1.add("student2");
		
		List<String> list2 = new ArrayList<String>();
		list2.add("student3");
		list2.add("student4");
		
		map.put("CS",list1);
		map.put("EC",list2);
		
		System.out.println(map.get("CS"));
		System.out.println(map.get("EC"));
		
		
		
		

	}

}
