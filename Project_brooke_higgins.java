import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Project_brooke_higgins {

	public static void main(String[] args) throws IOException {
		
		//Initializing ArrayList, Scanner, and File
		ArrayList<Policy> policies = new ArrayList<Policy>();
		File file = new File("PolicyInformation.txt");
		Scanner input = new Scanner(file);
		
		//Loop to read through the text file and create policies until the end
		while (input.hasNext()) {
			//Storing all the file information into variables for the policy object values
			String pNumber = input.nextLine();
			String pName = input.nextLine();
			String phFirstName = input.nextLine();
			String phLastName = input.nextLine();
			int phAge = input.nextInt();
			input.nextLine();
			String phSmokingStatus = input.nextLine();
			double phHeight = input.nextDouble();
			double phWeight = input.nextDouble();
			
			//Checking if we've reached the end of the file.
			if (input.hasNext()) {
				input.nextLine();
				if (input.hasNext()) {
					input.nextLine();
				}
			}
			
			//Using the information received and creating a Policy object
			policies.add(new Policy(pNumber, pName, phFirstName, phLastName, phAge, phSmokingStatus, phHeight, phWeight));
         
         //Variable to keep track of the number of smokers
         int smokers = 0;
         
         //Loop to display information for each policy
			for (Policy policy : policies) {
				System.out.println("Policy Number: " + policy.getPolicyNumber());
				System.out.println("Provider Name: " + policy.getProviderName());
				System.out.println("Policyholder's First Name: " + policy.getPolicyholderFirstName());
				System.out.println("Policyholder's Last Name: " + policy.getPolicyholderLastName());
				System.out.println("Policyholder's Age: " + policy.getPolicyholderAge());
				System.out.println("Policyholder's Smoking Status (smoker/non-smoker): " + policy.getPolicyholderSmokingStatus());
				System.out.println("Policyholder's Height: " + policy.getPolicyholderHeight() + " inches");
				System.out.println("Policyholder's Weight: " + policy.getPolicyholderWeight() + " pounds");
				System.out.println("Policyholder's BMI: " + String.format("%.2f", policy.findBMI()));
				System.out.println("Policy Price: $" + String.format("%.2f", policy.calculateInsurancePolicyPrice()));
            
            //If statement to determine if the current policy has a smoker
            if (policy.getPolicyholderSmokingStatus().equalsIgnoreCase("Smoker")) {
               smokers++;
            }
			}
         
         //Printing out
         System.out.println("\nThe number of policies with a smoker is: " + smokers);
         System.out.println("The number of policies with a non-smoker is: " + (policies.size() - smokers));
		}
	}

}
