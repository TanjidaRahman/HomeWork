package hw5Q2Constructor;

public class Student {

	public String stName;
	public int stID;
	public char stSex;
	public boolean stIsProgrammer;
	public float grade;

	public Student() {
		System.out.println("This is from default Constructor of Student class");
	}

	// Parameterized constructor declared.
	public Student(String stName, int stID, char stSex, boolean stIsProgrammer, float grade) {
		this.stName = stName;
		this.stID = stID;
		this.stIsProgrammer = stIsProgrammer;
		this.grade = grade;
		System.out.println("Student name:" +stName + "," + "Student ID:" +stID + "," + "Is student a programmer?:"
				+ "," + stIsProgrammer + "Student grade:" + "," + grade + ",");

	}

}
