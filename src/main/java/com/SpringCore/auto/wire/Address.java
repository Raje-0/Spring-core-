package com.SpringCore.auto.wire;

public class Address {
	private String sreet;
	private String city;

	public String getSreet() {
		return sreet;
	}

	public void setSreet(String sreet) {
		this.sreet = sreet;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [sreet=" + sreet + ", city=" + city + "]";
	}

}
