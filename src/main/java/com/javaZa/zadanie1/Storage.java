package com.javaZa.zadanie1;

import java.util.HashMap;
import java.util.Map;
public class Storage {

	private Map<String, User> users;
	
	public Storage() {
		this.users = new HashMap<String, User>();
	}
	
	public Map<String, User> getUsers() {
		return users;
	}
}
