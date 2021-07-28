package Day11.Collections.Hashtable;

public class FBCreateAccountFlow
{
	private FBAccountDetails objFBAccountDetails;
	private FBHomePage objFBHomePage;
	private FBHashTable objFBHashTable;
	public String testData="";
	
	 public FBCreateAccountFlow()
	 {
		 objFBAccountDetails = new FBAccountDetails();
		 objFBHomePage = new FBHomePage();
		 objFBHashTable = new FBHashTable();
	 }

	 
	 public void accountCreation()
	 {
		 testData = objFBHashTable.createAccountTestData().get("FirstName");
		 if(!testData.equals(""))
		 {
			 objFBAccountDetails.setFirstName(testData);
		 }

		 testData = objFBHashTable.createAccountTestData().get("LastName");
		 if(!testData.equals(""))
		 {
			 objFBAccountDetails.setLastname(testData);
		 }
		 testData = objFBHashTable.createAccountTestData().get("EmailAddress");
		 if(!testData.equals(""))
		 {
			 objFBAccountDetails.setEmailAddres(testData);
		 }
		 
		 testData = objFBHashTable.createAccountTestData().get("Password");
		 if(!testData.equals(""))
		 {
			 objFBAccountDetails.setPassword(testData);
		 }
		 
		 testData = objFBHashTable.createAccountTestData().get("Date");
		 if(!testData.equals(""))
		 {
			 objFBAccountDetails.setDate(testData);
		 }
		 
		 testData = objFBHashTable.createAccountTestData().get("Month");
		 if(!testData.equals(""))
		 {
			 objFBAccountDetails.setMonth(testData);
		 }
		 
		 testData = objFBHashTable.createAccountTestData().get("Year");
		 if(!testData.equals(""))
		 {
			 objFBAccountDetails.setYear(testData);
		 }
		 
		 testData = objFBHashTable.createAccountTestData().get("Gender");
		 if(!testData.equals(""))
		 {
			 objFBAccountDetails.setGender(testData);
		 }
		 
		 testData = objFBHashTable.createAccountTestData().get("Sign-Up");
		 if(!testData.equals(""))
		 {
			 objFBAccountDetails.clickOnSignUpButton(testData);
		 }
		 
		 
	 }
}
