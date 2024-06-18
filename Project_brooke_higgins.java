import java.util.Scanner;

public class Project_brooke_higgins {

	public static void main(String[] args) {
		//Initializing scanner
		Scanner input = new Scanner(System.in);
		//Getting all the information from the user to create policy.
		System.out.println("Please enter the Policy Number: ");
		int pNumber = input.nextInt();
		input.nextLine();
		System.out.println("Please enter the Provider Name: ");
		String pName = input.nextLine();
		System.out.println("Please enter the Policyholder's First Name: ");
		String phFirstName = input.nextLine();
		System.out.println("Please enter the Policyholder's Last Name: ");
		String phLastName = input.nextLine();
		System.out.println("Please enter the Policyholder's Age: ");
		int phAge = input.nextInt();
		input.nextLine();
		System.out.println("Please enter the Policyholder's Smoking Status (smoker/non-smooker): ");
		String phSmokingStatus = input.nextLine();
		System.out.println("Please enter the Policyholder's Height (in inches): ");
		double phHeight = input.nextDouble();
		System.out.println("Please enter the Policyholder's Weight (in pounds): ");
		double phWeight = input.nextDouble();
		//Initializing policy with user inputs
		Policy user = new Policy(pNumber, pName, phFirstName, phLastName, phAge, phSmokingStatus, phHeight, phWeight);
		//Displaying the results of the user's policy
		System.out.println("Policy Number: " + user.getPolicyNumber());
		System.out.println("Provider Name: " + user.getProviderName());
		System.out.println("Policyholder's First Name: " + user.getPolicyholderFirstName());
		System.out.println("Policyholder's Last Name: " + user.getPolicyholderLastName());
		System.out.println("Policyholder's Age: " + user.getPolicyholderAge());
		System.out.println("Policyholder's Smoking Status: " + user.getPolicyholderSmokingStatus());
		System.out.println("Policyholder's Height: " + user.getPolicyholderHeight() + " inches");
		System.out.println("Policyholder's Weight: " + user.getPolicyholderWeight() + " pounds");
		System.out.println("Policyholder's BMI: " + String.format("%.2f", user.findBMI()));
		System.out.println("Policy Price: $" + String.format("%.2f", user.calculateInsurancePolicyPrice()));
		
	}

}
