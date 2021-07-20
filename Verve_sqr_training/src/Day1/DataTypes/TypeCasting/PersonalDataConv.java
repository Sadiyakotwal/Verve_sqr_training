package Day1.DataTypes.TypeCasting;

/*To demonstrate Type conversion using Laptop brands
 * String s ={"Asus","Dell","hp","Apple","Microsoft"};
 */

public class PersonalDataConv 
{
	
	public void stringToOther()
	{
		String s1= "200";
		String s2 ="Asus";
		String s3 ="39893987398";
		System.out.println("String to other Types ");
		System.out.println("----------------------------");
		//String to integer
		int StringToInt = Integer.parseInt(s1);
		System.out.println("String to Int :"+StringToInt);
		//String to Int using value of method
		Integer StringToInt1 = Integer.valueOf(s1);
		System.out.println("String to Int Using value of : "+StringToInt1);
		//Throws number format exception if String of char is passed 
		int StringToInt3 = Integer.parseInt(s2);
		System.out.println("String to int if String contains alphabets :"+StringToInt3);
		//String to Long
		long Stringtolong = Long.parseLong(s3);
		System.out.println("String to long :"+Stringtolong);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) 
	{
		PersonalDataConv objPersonalDataConv =new PersonalDataConv();
		objPersonalDataConv.stringToOther();
		
	}

}
