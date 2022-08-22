import java.util.Scanner;

public class Mini_ATM_Project {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER USER NAME");
		String userName = scan.nextLine();
		System.out.println("WELCOME\t" + userName);
		int userAmount = 1000;
		int pinNumber = 1234;
		String reply = "yes";
		System.out.println("ENER YOUR 4-DIGIT PASSWORD");
		int password = scan.nextInt();
		if (password == pinNumber) {
			scan.nextLine();
			System.out.println("HOW MUCH AMOUNT DO YOU WANT?");
			int amount = scan.nextInt();
			userAmount = userAmount - amount;
			scan.nextLine();

			System.out.println("DO YOU WANT TO CHECK THE CURERNT BALANCE?");
			String response = scan.nextLine();
			if (reply.equals(response)) {
				System.out.println("YOUR CURRENT BALANCE:" + userAmount);
				System.out.println("THANK YOU\t" + userName);
				System.out.println("PLEASE TAKE A CARD BEFORE EXIT THE ATM");

			}

		} else {
     System.out.println("THANKS\t"+userName);
		}

	}

}
