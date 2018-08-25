package com.niranjan.rxp.messenger.database;

import java.util.LinkedHashMap;
import java.util.Map;

import com.niranjan.rxp.messenger.model.Message;
import com.niranjan.rxp.messenger.model.Profile;

public class DatabaseManager {
	private static Map<Long, Message> messages = new LinkedHashMap<Long, Message>();
	private static Map<String, Profile> profiles = new LinkedHashMap<String, Profile>();
	
	static{
		messages.put(1L, new Message(1, "Welcome to Java!", "Goutham"));
		messages.put(2L, new Message(2, "Welcome to Webservices!", "Parsuram"));
		messages.put(3L, new Message(3, "Welcome to Jersey!", "Jagannath"));
		
		profiles.put("niranjan", new Profile(1L, "niranjan", "Niranjan", "Maharana"));
		profiles.put("gourav", new Profile(2L, "gourav", "Gourav", "Sharma"));
		profiles.put("arati", new Profile(3L, "arati", "Arati", "Goswami"));
	}
	
	public static Map<Long, Message> getAllMessages(){
		return messages;
	}
	
	public static Map<String, Profile> getAllProfiles(){
		return profiles;
	}
}