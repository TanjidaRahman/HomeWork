package hw4Q2JavaVariables;

public class AboutMeVariableDeclared {

	public String name; 
	public byte myAge;
	public short houseRent;
	public int mySalary;
	public long myBankBalance;
	public float height;
	public double myGrade;
	public char sex;
	public boolean usCitizen;

	public AboutMeVariableDeclared() {			//Constructor
		System.out.println("This is all about me:");
		
	}
	
	public void aboutMe() {
		System.out.println("My name is: "+name+ "\nMy Age: "+myAge+ "\nMy House rent: "+houseRent+ "\nMy Yearly salary: "
				+mySalary+ "\nMy bank balance: "+myBankBalance+ "\nMy height: "+height+"\nMy grade: "+myGrade+"\nMy sex: "
				+sex+ "\nAm I US citizen: "+usCitizen);
	}
	public static void main(String[] args) {
		AboutMe aboutMe= new AboutMe();
		aboutMe.aboutMe();
	}

}
