package hw4Q2JavaVariables;

public class AboutMe {

	public String name ="Tanjida Rahman"; 
	public byte myAge = 30;
	public short houseRent = 3000;
	public int mySalary = 2000000000;
	public long myBankBalance = 500000000l;
	public float height = 5.4f;
	public double myGrade = 3.67893;
	public char sex = 'F';
	public boolean usCitizen = false;

	public AboutMe() {			//Constructor
		System.out.println("This is all about me:");
		
	}
	
	public void aboutMe() {
		System.out.println("\nMy name is: "+name+ "\nMy Age: "+myAge+ "\nMy House rent: "+houseRent+ "\nMy Yearly salary: "
				+mySalary+ "\nMy bank balance: "+myBankBalance+ "\nMy height: "+height+"\nMy grade: "+myGrade+"\nMy sex: "
				+sex+ "\nAm I US citizen: "+usCitizen);
	}
	public static void main(String[] args) {
		AboutMe aboutMe= new AboutMe();
		aboutMe.aboutMe();
	}

}
