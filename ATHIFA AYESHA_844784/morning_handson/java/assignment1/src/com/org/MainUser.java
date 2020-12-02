package com.org;

import java.util.ArrayList;
import java.util.List;

public class MainUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<User> list = new ArrayList<>();
		list.add(new User(701 , "akash" , "akash123"));
		list.add(new User(702 , "Bobby" , "bobby123"));
		list.add(new User(703 , "Charles" , "charles123"));
		list.add(new User(704 , "Daniel" , "daniel123"));
		list.add(new User(705 , "edward" , "edward123"));
		
		for(User user: list) {
			if(user.getName().length()>5) {
				System.out.println(user);
			}
		}

	}

}
