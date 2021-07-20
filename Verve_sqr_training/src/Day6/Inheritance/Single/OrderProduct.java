package Day6.Inheritance.Single;

public class OrderProduct extends AmazonLoginPage
{
	//Step 4 :To order a mobile
	public void mobileOrder(String strMobile)
	{
		System.out.println("\n\tOrder Placed : Mobile");
		System.out.println("Mobile Name:"+strMobile);
	}
	
	//Step 5: To order a laptop
	public void laptopOrder(String strLaptop)
	{
		System.out.println("\n\tOrder Placed : Laptop");
		System.out.println("Laptop Name:"+strLaptop);
		
	}
	

}
