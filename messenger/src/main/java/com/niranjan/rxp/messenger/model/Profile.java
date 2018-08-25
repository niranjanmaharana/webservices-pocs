package com.niranjan.rxp.messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Profile {
	private long profileId;
	private String profileName;
	private String firstName;
	private String lastName;
	private Date created;
	
	public Profile() {
	}
	
	public Profile(long profileId, String profileName, String firstName, String lastName) {
		this.profileId = profileId;
		this.profileName = profileName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.created = this.created == null ? new Date() : created;
	}
	public long getProfileId() {
		return profileId;
	}
	public void setProfileId(long profileId) {
		this.profileId = profileId;
	}
	public String getProfileName() {
		return profileName;
	}
	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	@Override
	public String toString() {
		return "Profile [profileId=" + profileId + ", profileName=" + profileName + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", created=" + created + "]";
	}
}