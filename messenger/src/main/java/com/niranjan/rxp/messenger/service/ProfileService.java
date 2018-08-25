package com.niranjan.rxp.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.niranjan.rxp.messenger.database.DatabaseManager;
import com.niranjan.rxp.messenger.model.Profile;

public class ProfileService {
	
	private static Map<String, Profile> profiles = DatabaseManager.getAllProfiles();
	
	public List<Profile> getAllProfiles(){
		return new ArrayList<Profile>(profiles.values());
	}
	
	public Profile getProfile(String profileName){
		return profiles.get(profileName);
	}
	
	public Profile addProfile(Profile profile){
		profile.setProfileId(profiles.size() + 1);
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public Profile updateProfile(Profile profile){
		if(profile.getProfileName().isEmpty())
			return null;
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public Profile removeProfile(String profileName){
		return profiles.remove(profileName);
	}
}