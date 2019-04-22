class Task4{
	public static void main(String args[]){
		int a=Integer.parseInt(args[0]);
		String ope=args[1];
		int b=Integer.parseInt(args[2]);
		int result=0;
		switch(ope){
			case "+":
			result=a+b;
			System.out.print("Sum="+result);
			break;
			case "-":
			result=a-b;
			System.out.print("Difference="+result);
			break;
			case "*":
			result=a*b;
			System.out.print("Product="+result);
			break;
			case "/":
			result=a/b;
			System.out.print("Division="+result);
			break;
			default:
			System.out.println("Invalid Operator!");
		}
	}
}