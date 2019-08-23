class Test
{
	String str="a";
	public void A()
	{
		try
		{
			str+="b";
			B();
		}catch (Exception e) 
		{
			str+="c";
		}
	}
	public void B() throws Exception
	{
		try
		{
			str+="d";
			C();
		}catch (Exception e) 
		{
			throw new Exception();
		}
		finally
		{
			str+="e";
		}
		str+="f";
	}
	public void C() throws Exception
	{
		throw new Exception();
	}
	public void display()
	{
		System.out.println(str);
	}
	public static void main(String[] args) {
		Test test=new Test();
		test.A();
		test.display();
	}
}