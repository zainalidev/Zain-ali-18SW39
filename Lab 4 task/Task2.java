import java.util.*;
class Table{
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
      System.out.print("Enter a Number : ");
      int num=sc.nextInt();
      System.out.print("Enter a Starting  : ");
      int x=sc.nextInt();
	 System.out.print("Enter Ending point : ");
      int y=sc.nextInt();
	while(x<=y){
	
		int ans=num*x;
		
		System.out.println(num+"x"+x+"="+ans);
		x++;		
        }
      }
}