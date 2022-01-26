package hw3Q2JavaVariables;
//Create a package name "hw3Q2JavaVariables" inside the Home work project, Create a Class name "AboutMe". 
//Declare only one type of variable(so you know declare vs initialize), and initialize String and other 
//8 types of variable (you can give a different name from mine). Instantiate AboutMe class under main method 
//and call few variables by object (you can use String concatenation to make it more meaningful outcome). 
//Give a single line comment where a variable is declared and initialized. Follow indentation by Organizing 
//the code and paste below. [Mark distribution (80) : using variable --20, instantiate class - 20, 
//call variables by object and print a meaningful outcome 20, comment for variable is declared and 
//initialized - 10, organize code and other-- 10]50 points


public class AboutMe {
	public string myInfo;//here variable is declared by myInfo.        
	public String name ="Tanjida Rahman"; //here variable is initialized by assigning the name value Tanjida Rahman.
	public byte myAge = 30;
	public short houseRent = 3000;
	public int mySalary = 2000000000;
	public long myBankBalance = 500000000l;
	public float height = 5.4f;
	public double myGrade = 3.67893;
	public char sex = 'F';
	public boolean usCitizen = false;

	        public static void main(String[] args) {
	                AboutMe aboutMe = new AboutMe();
	                System.out.println(aboutMe.name);
	                System.out.println(aboutMe.myAge);
	                System.out.println(aboutMe.height);
	                System.out.println(aboutMe.sex);
	                System.out.println("Myname: "+aboutMe.name + ", Myage: "+ aboutMe.myAge + ", Mysex:"+ aboutMe.sex);
	

	}

}
