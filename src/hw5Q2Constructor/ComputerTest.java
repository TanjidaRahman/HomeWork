package hw5Q2Constructor;

public class ComputerTest {

	public static void main(String[] args) {
		// Default constructor is initialized here
		Computer computer01 = new Computer();
		System.out.println(".....................................................................");
		//parameterized constructor initialized here
		Computer computer02 = new Computer("Apple", "MacBook Air", "MacOS Mojave", 800 , false , 'A');
		System.out.println(".....................................................................");
		Computer computer03 = new Computer("Lenovo", "IdealPad", "Windows 11", 750 , false , 'A' );
		
	}

}
