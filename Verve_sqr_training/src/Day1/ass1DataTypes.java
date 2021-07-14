package Day1;
/*To perform operations on different data types
 * Byte-1 byte memory-range:-127 to 127
 * Short-          -range:-32768 to 32767
 * int- upto 10 digit number-range:
 * long-upto 19 digit-range:
 * char- 2 bytes memory-range:0 to 65535
 * */

public class ass1DataTypes
{
	//Integer type
	int a = 10;
	//Short  type
	short s1 = -1;
	//Float type 
	float f1= 3.5f;
	float f2 = (float)8.9;
	//Double type
	double d1= 6788;
	double d2 = 'a';
	//Long type
	long l1 = 1234567899246L;
	long l2 = 16626;
	//Char type
	char c = 'A';
	//10 = \n
	char c1 = 10;
	//Boolean type
	boolean bvalue = true;
	boolean bvalue1 = 10>20;
	//Byte type
	byte b1 =126;
	//String class
	String str = "Java";
	
	

	public static void main(String[] args) 
	{

		ass1DataTypes  ass1DataTypes = new ass1DataTypes();
		
		System.out.println("Integer value is:"+ass1DataTypes.a);
		System.out.println("Short  value is:"+ass1DataTypes.s1);
		System.out.println("Float value is:"+ass1DataTypes.f1);
		System.out.println("Float value is:"+ass1DataTypes.f2);
		System.out.println("Long value is:"+ass1DataTypes.l1);
		System.out.println("Long value is:"+ass1DataTypes.l2);
		System.out.println("Character is:"+ass1DataTypes.c);
		System.out.println("Character is:"+ass1DataTypes.c1);
		System.out.println("Double value is:"+ass1DataTypes.d1);
		System.out.println("Double value is:"+ass1DataTypes.d2);
		System.out.println("Byte value is:"+ass1DataTypes.b1);
		System.out.println("String is:"+ass1DataTypes.str);


	}

}
