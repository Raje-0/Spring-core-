package com.SpringCore.rajeClick;

public class RajeClick {
	private int num;
	private String name;
	private String address;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public RajeClick() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "RajeClick [num=" + num + ", name=" + name + ", address=" + address + "]";
	}
	

}
