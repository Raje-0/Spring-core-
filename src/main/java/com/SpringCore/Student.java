package com.SpringCore;

public class Student {
	private int studentsId;
	private String studentName;
	private String studentAddress;

	public int getStudentsId() {
		return studentsId;
	}

	public void setStudentsId(int studentsId) {
		System.out.println("setting student id");
		this.studentsId = studentsId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		System.out.println("setting student name");
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		System.out.println("setting student Address");
		this.studentAddress = studentAddress;
	}

	public Student(int studentsId, String studentName, String studentAddress) {
		super();
		this.studentsId = studentsId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [studentsId=" + studentsId + ", studentName=" + studentName + ", studentAddress="
				+ studentAddress + "]";
	}

}
