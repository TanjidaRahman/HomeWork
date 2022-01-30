package hw5Q2Constructor;

public class Computer {
	public String brand;
	public String model;
	public String operatingSystem;
	public int price;
	public boolean madeInUSA;
	public char grade;
	
	//Default constructor declared.
	public Computer() {
		System.out.println("This is from default constructor of computer class");
	}
	
	//Parameterized constructor declared.
	public Computer(String brand, String model, String operatingSystem, int price, boolean madeInUSA, char grade ) {
		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.madeInUSA = madeInUSA;
		this.grade = grade;
		System.out.println("Computer brand :"+ brand + ", Model :"+ model + ", Operating system :" 
		+ operatingSystem +", Price :"+ price + ", Grade :"+ grade + ", MadeInUSA :"+ madeInUSA );				
	}
	}
