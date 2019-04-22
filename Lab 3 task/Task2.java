import java.util.*;
class Bill{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Please Enter unit consumed = ");
		int b=sc.nextInt();
		if(b<=50){
			int u=10*b;
			System.out.println("Total Electricity Bill "+u);
		}
		else if(b>50 && b<=100){
			int p=(50*10)+(b-50)*15;
			System.out.println("Total Electricity Bill "+p);
		}
		else if(b>=101 && b<=200){
			int z=(50*10)+(100-50)*15+(b-100)*20;
			System.out.println("Total Electricity Bill "+z);
		}
		else if(b>=201 && b<=300){
			int m=(50*10)+(50*15)+(100*20)+(b-200)*25;
			System.out.println("Total Electricity Bill "+m);
		}
		else if(b>300){
              int k=(50*10)+(50*15)+(100*20)+(100*25)+(b-300)*30;
              System.out.println("Total Electricity Bill "+k);
		}
	}
}
