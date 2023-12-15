class finallyKeyword
{
	public static void main(String[] args) {
		try 
		{
			System.out.println("First statement of try block");
			int num = 50/0;
			System.out.println("value of number "+ num);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		finally{
			System.out.println("this will execute at any cost");
		}
		System.out.println("after finally block");
	}
}