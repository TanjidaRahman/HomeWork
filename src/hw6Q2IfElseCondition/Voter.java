package hw6Q2IfElseCondition;

public class Voter {

	public static void main(String[] args) {
		int age = 25;

		if (age == 18) {
			System.out.println("I'm a voter");
		} else if (age < 18) {
			System.out.println("I'm not a voter");
		} else if (age > 18) {
			System.out.println("I'm a voter");
		} else {
			System.out.println("Please add a valid age");
		}
	}
}
