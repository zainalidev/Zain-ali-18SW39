//Task 3: Create a program that demonstrates how final keyword
//stops method overriding
class Final
{
	final public void demo()
	{
		System.out.println("This Final method it can't Override ");
	}
}
class UseFinal extends Final
{
	public void demo()
	{
		System.out.println("Hi Final Override method ");
	}
	public static void main(String[] args) 
	{
		UseFinal f=new UseFinal();
		f.demo();
	}
}