public class Policy {
	//Private variables/fields for the insurance policy
	private int policyNumber;
	private String providerName;
	private String policyholderFirstName;
	private String policyholderLastName;
	private int policyholderAge;
	private String policyholderSmokingStatus; //"smoker" or "non-smoker"
	private double policyholderHeight; //In inches
	private double policyholderWeight; //In pounds
	
	//No-arg constructor that initializes all private fields to 0 or an empty string
	public Policy() {
		policyNumber = 0;
		providerName = "";
		policyholderFirstName = "";
		policyholderLastName = "";
		policyholderAge = 0;
		policyholderSmokingStatus = "";
		policyholderHeight = 0;
		policyholderWeight = 0;
	}
	
	/** Policy Class constructor that accepts new arguments for each field
	 @param newPolicyNumber ~ The Policy Number
	 @param newProviderName ~ The Provider Name
	 @param newPolicyholderFirstName ~ The Policyholder's First Name
	 @param newPolicyholderLastName ~ The Policyholder's Last Name
	 @param newPolicyholderAge ~ The Policyholder's Age
	 @param newPolicyholderSmokingStatus ~ The Policyholder's SmokingStatus
	 @param newPolicyholderHeight ~ The Policyholder's Height
	 @param newPolicyholderWeight ~ The Policyholder's Weight
	 */
	public Policy(int newPolicyNumber, String newProviderName, String newPolicyholderFirstName, 
			String newPolicyholderLastName, int newPolicyholderAge, String newPolicyholderSmokingStatus,
			double newPolicyholderHeight, double newPolicyholderWeight) {
		policyNumber = newPolicyNumber;
		providerName = newProviderName;
		policyholderFirstName = newPolicyholderFirstName;
		policyholderLastName = newPolicyholderLastName;
		policyholderAge = newPolicyholderAge;
		policyholderSmokingStatus = newPolicyholderSmokingStatus;
		policyholderHeight = newPolicyholderHeight;
		policyholderWeight = newPolicyholderWeight;
	}
	
	/**Getter for Policy Number
	 * @return The Policy Number */
	public int getPolicyNumber() {
		return policyNumber;
	}
	
	/**Setter for Policy Number
	 * @param newPolicyNumber ~ The Policy Number */
	public void setPolicyNumber(int newPolicyNumber) {
		policyNumber = newPolicyNumber;
	}
	
	/**Getter for Provider Name
	 * @return The Provider Name */
	public String getProviderName() {
		return providerName;
	}
	
	/**Setter for Provider Name
	 * @param newProviderName ~ The Provider Name */
	public void setProviderName(String newProviderName) {
		providerName = newProviderName;
	}
	
	/**Getter for Policyholder's First Name
	 * @return The Policyholder's First Name */
	public String getPolicyholderFirstName() {
		return policyholderFirstName;
	}
	
	/**Setter for Policyholder's First Name
	 * @param newPolicyholderFirstName ~ The Policyholder's First Name */
	public void setPolicyholderFirstName(String newPolicyholderFirstName) {
		policyholderFirstName = newPolicyholderFirstName;
	}
	
	/**Getter for Policyholder's Last Name
	 * @return The Policyholder's Last Name */
	public String getPolicyholderLastName() {
		return policyholderLastName;
	}
	
	/**Setter for Policyholder's Last Name
	 * @param newPolicyholderLastName ~ The Policyholder's Last Name */
	public void setPolicyholderLastName(String newPolicyholderLastName) {
		policyholderLastName = newPolicyholderLastName;
	}
	
	/**Getter for Policyholder's Age
	 * @return The Policyholder's Age */
	public int getPolicyholderAge() {
		return policyholderAge;
	}
	
	/**Setter for Policyholder's Age
	 * @param newPolicyholderAge ~ The Policyholder's Age */
	public void setPolicyholderAge(int newPolicyholderAge) {
		policyholderAge = newPolicyholderAge;
	}
	
	/**Getter for Policyholder's Smoking Status
	 * @return The Policyholder's Smoking Status */
	public String getPolicyholderSmokingStatus() {
		return policyholderSmokingStatus;
	}
	
	/**Setter for Policyholder's Smoking Status
	 * @param newPolicyholderSmokingStatus ~ The Policyholder's Smoking Status */
	public void setPolicyholderSmokingStatus(String newPolicyholderSmokingStatus) {
		policyholderSmokingStatus = newPolicyholderSmokingStatus;
	}
	
	/**Getter for Policyholder's Height
	 * @return The Policyholder's Height */
	public double getPolicyholderHeight() {
		return policyholderHeight;
	}
	
	/**Setter for Policyholder's Height
	 * @param newPolicyholderHeight ~ The Policyholder's Height */
	public void setPolicyholderHeight(double newPolicyholderHeight) {
		policyholderHeight = newPolicyholderHeight;
	}
	
	/**Getter for Policyholder's Weight
	 * @return The Policyholder's Weight */
	public double getPolicyholderWeight() {
		return policyholderWeight;
	}
	
	/**Setter for Policyholder's Weight
	 * @param newPolicyholderWeight ~ The Policyholder's Weight */
	public void setPolicyholderWeight(double newPolicyholderWeight) {
		policyholderWeight = newPolicyholderWeight;
	}
	
	/**Method that calculates the Policyholder's BMI
	 * @return The Policyholder's BMI */
	public double findBMI() {
		return (policyholderWeight*703) / (policyholderHeight*policyholderHeight);
	}
	
	/**Method that calculates the Policy's price 
	 * @return The Policy's price*/
	public double calculateInsurancePolicyPrice() {
		double price = 600;
		double BMI = findBMI();
		if (policyholderAge > 50) {
			price += 75;
		}
		if (policyholderSmokingStatus.equals("smoker")) {
			price += 100;
		}
		if (BMI > 35) {
			price += ((BMI - 35) * 20);
		}
		return price;
	}
}
