package Day11.Collections.Hashtable;

import java.util.Hashtable;

public class FBHashTable 
{
	UtilityFB objUtilityFB = new UtilityFB();
	public Hashtable<String, String> objHashTable;

	public FBHashTable()
	{
		
		objHashTable = new Hashtable<String,String>();
	
	}
	
	public Hashtable<String,String> createAccountTestData()
	{
		objHashTable.put("FirstName",objUtilityFB.getRandomFirstName());
		objHashTable.put("LastName",objUtilityFB.getRandomLirstName() );
		objHashTable.put("EmailAddress",objUtilityFB.getRandomEmail());
		objHashTable.put("Password", objUtilityFB.getRandomPassword());
		objHashTable.put("Date",objUtilityFB.getRandomDate());
		objHashTable.put("Month", objUtilityFB.getRandomMonth());
		objHashTable.put("Year", objUtilityFB.getRandomYear());
		objHashTable.put("Gender", objUtilityFB.getRandomGender());
		objHashTable.put("Sign-Up","Sign-Up");


		return objHashTable;
	}


}
