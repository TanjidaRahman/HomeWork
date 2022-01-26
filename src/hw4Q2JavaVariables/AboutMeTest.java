package hw4Q2JavaVariables;

public class AboutMeTest {

	
	public static void main(String[] args) {
		
		AboutMe aboutMe= new AboutMe(); //Constructor is initialized here when object is created.
		aboutMe.name= "Tanjida";
		aboutMe.myAge = 30;
		aboutMe.houseRent = 3000;
		aboutMe.mySalary = 2000000000;
		aboutMe.myBankBalance = 500000000l;
		aboutMe.height = 5.4f;
		aboutMe.myGrade = 3.67893;
		aboutMe.sex = 'F';
		aboutMe.usCitizen = false;	
		aboutMe.aboutMe();
	
		System.out.println("\nThis is all about my best friend Shanta: \n");
		
		AboutMe myFriend= new AboutMe();
		myFriend.name= "Shanta";
		myFriend.myAge = 30;
		myFriend.houseRent = 5000;
		myFriend.mySalary = 300000000;
		myFriend.myBankBalance = 400000000l;
		myFriend.height = 5.5f;
		myFriend.myGrade = 4.67893;
		myFriend.sex = 'F';
		myFriend.usCitizen = true;	
		myFriend.aboutMe();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
