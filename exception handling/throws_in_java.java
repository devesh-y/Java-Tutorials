
public class throws_in_java
{
    //throws is a keyword in Java which is used in the signature of method to indicate that this method might throw one of the listed type exceptions
	static void fun() throws IllegalAccessException
	{
		System.out.println("Inside fun(). ");
		throw new IllegalAccessException("demo");
	}
	public static void main(String args[])
	{
		try
		{
			fun();
		}
		catch(IllegalAccessException e)
		{
			System.out.println("caught in main.");
		}
	}
}
