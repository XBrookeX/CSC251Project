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
		}
	}

}
