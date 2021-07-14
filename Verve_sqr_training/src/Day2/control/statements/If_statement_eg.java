package Day2.control.statements;

/* To check if the book is present in library or not*/

public class If_statement_eg
{
	static int libId;
	//To check whether book is present in library or not
	public void getlibrary_book_present(String strBookName)
	{
		strBookName = strBookName;
		if(strBookName.equals("Gulliver's Travel"))
		{
			System.out.println("The book is present in library:"+strBookName);
			this.getlibrary_row_check(50);
		}
		else if(strBookName.equals("Harry Potter"))
		{
			System.out.println("The book is present which is: "+strBookName);
			this.getlibrary_row_check(167);
		}
		else if(strBookName.equals("Anne Frank"))
		{
			System.out.println("The book is present which is:"+strBookName);
			this.getlibrary_row_check(500);
		}
		else
		{
			System.out.println("The book is not in library :");
		}
	}
	
	
	//To check the book is in which row
	public void getlibrary_row_check(int libId)
	{
		System.out.println("To check whether the book is in the 3 rows ?:");
		if(libId <= 100)
		{
		System.out.println("The book is in the 1st row: ");
		}
		else if(libId > 100 && libId <=200)
		{
			System.out.println("The book is in the 2nd row: ");
		}
		else if(libId > 200  && libId <=500)
		{
			System.out.println("The book is in the last row: ");
		}
		else
		{
			System.out.println(" Book is not present in any of the row: ");
		}
	}

}
