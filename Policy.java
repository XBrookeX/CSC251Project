public class Policy {
	//Private variables for the insurance policy
	private int policyNumber;
	private String providerName;
	private String policyholderFirstName;
	private String policyholderLastName;
	private int policyholderAge;
	private String policyholderSmokingStatus; //"smoker" or "non-smoker"
	private int policyholderHeight; //In inches
	private int policyholderWeight; //In pounds
	
	public Policy() {
		policyNumber = 0;
		providerName = null;
		policyholderFirstName = null;
		policyholderLastName = null;
		policyholderAge = 0;
		policyholderSmokingStatus = null;
		policyholderHeight = 0;
		policyholderWeight = 0;
	}
	public Policy(int newPolicyNumber, String newProviderName, String newPolicyholderFirstName, 
			String newPolicyholderLastName, int newPolicyholderAge, String newPolicyholderSmokingStatus,
			int newPolicyholderHeight, int newPolicyholderWeight) {
		policyNumber = newPolicyNumber;
		providerName = newProviderName;
		policyholderFirstName = newPolicyholderFirstName;
		policyholderLastName = newPolicyholderLastName;
		policyholderAge = newPolicyholderAge;
		policyholderSmokingStatus = newPolicyholderSmokingStatus;
		policyholderHeight = newPolicyholderHeight;
		policyholderWeight = newPolicyholderWeight;
	}
	public int getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(int newPolicyNumber) {
		policyNumber = newPolicyNumber;
	}
	public String getProviderName() {
		return providerName;
	}
	public void setProviderName(String newProviderName) {
		providerName = newProviderName;
	}
	public String getPolicyholderFirstName() {
		return policyholderFirstName;
	}
	public void setPolicyholderFirstName(String newPolicyholderFirstName) {
		policyholderFirstName = newPolicyholderFirstName;
	}
	public String getPolicyholderLastName() {
		return policyholderLastName;
	}
	public void setPolicyholderLastName(String newPolicyholderLastName) {
		policyholderLastName = newPolicyholderLastName;
	}
	public int getPolicyholderAge() {
		return policyholderAge;
	}
	public void setPolicyholderAge(int newPolicyholderAge) {
		policyholderAge = newPolicyholderAge;
	}
	public String getPolicyholderSmokingStatus() {
		return policyholderSmokingStatus;
	}
	public void setPolicyholderSmokingStatus(String newPolicyholderSmokingStatus) {
		policyholderSmokingStatus = newPolicyholderSmokingStatus;
	}
	public int getPolicyholderHeight() {
		return policyholderHeight;
	}
	public void setPolicyholderHeight(int newPolicyholderHeight) {
		policyholderHeight = newPolicyholderHeight;
	}
	public int getPolicyholderWeight() {
		return policyholderWeight;
	}
	public void setPolicyholderWeight(int newPolicyholderWeight) {
		policyholderWeight = newPolicyholderWeight;
	}
	public int findBMI() {
		return (policyholderWeight*703) / (policyholderHeight^2);
	}
	public double calculateInsurancePolicyPrice() {
		int price = 600;
		int BMI = findBMI();
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
