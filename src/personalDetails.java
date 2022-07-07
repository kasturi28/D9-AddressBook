import java.util.Scanner;

public class personalDetails {

	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	int zipNo;
	long phoneNumber;
	static Scanner sc = new Scanner(System.in);

	public personalDetails() {
		System.out.println("Welcome to Address Book Program");
		System.out.println("Enter firstName");
		firstName =sc.nextLine();
		
		System.out.println("Enter LastName");
		lastName =sc.nextLine();
		
		System.out.println("Enter Address");
		address =sc.nextLine();
		
		System.out.println("Enter City");
		city =sc.nextLine();
		
		System.out.println("Enter State");
		state =sc.nextLine();
		
		System.out.println("Enter Zip");
		zipNo =sc.nextInt();
		
		System.out.println("Enter phoneNumber");
		phoneNumber =sc.nextLong();
	}

	
	
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Person Details");
		System.out.println("FirstName = "+ firstName);
		System.out.println("last name =" +lastName);
		System.out.println("Address = "+ address);
		System.out.println("city = "+ city);
		System.out.println("state = "+ state);
		System.out.println("zip = " +zipNo);
		System.out.println("phoneNumber =" + phoneNumber);

		
		
	}
}
