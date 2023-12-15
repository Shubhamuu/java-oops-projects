class multiplecatches{
	public static void main(String args[])
	{
	try
	{
	int a = args.length;
	System.out.println("a: "+a);
	int b = 15/a;
	int c[]= {19,2};
	c[7]=99;

	} 
	catch(ArithmeticException e)
	{
	System.out.println("divide by zero:" +e);

	}
	catch(ArrayIndexOutOfBoundsException d){
	System.out.println("out of bound"+d);
	}
	System.out.println("After try/catch blocks");
	}
}