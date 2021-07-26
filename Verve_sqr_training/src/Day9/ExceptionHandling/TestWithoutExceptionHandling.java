package Day9.ExceptionHandling;

import java.io.FileNotFoundException;

public class TestWithoutExceptionHandling
{
       public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException 
       {
    	   
   			WithExceptionHandling objWithExceptionHandling = new WithExceptionHandling();
   			//Without Exceptions
   			//objWithExceptionHandling.verifyArrayWithoutException(7);
   			//objWithExceptionHandling.verifyFileWithoutException();
   			//objWithExceptionHandling.verifyNullPointerWithoutException();
   			//objWithExceptionHandling.verifyStringIndexException();
   			objWithExceptionHandling.verifyNumberFormatWithoutException();
   			
		
	}
	

}
