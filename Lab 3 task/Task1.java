import java.util.*;
class Marksheet{
	public static void main(String[] args){
		Scanner mar=new Scanner(System.in);
		System.out.println("Enter in C++ Subject Marks : ");
		int cm=mar.nextInt();
		System.out.println("Enter in Data Structure Subject Marks : ");
		int dm=mar.nextInt();
       System.out.println("Enter in Operating System Subject Marks : ");
		int om=mar.nextInt();
		int tm=cm+dm+om;
		double pm=tm*100/300;
       System.out.println("Total Marks = "+tm);
       System.out.println("Total Parcentage = "+pm);
       if(pm>=90){
       	System.out.println("your Grade : A ");
       }
       	else if(pm>=80 && pm<90){
       		System.out.println("your Grade : B ");
       	}
       	else if(pm>=70 && pm<=79){
       		System.out.println("your Grade : C ");
       	}
       	else if (pm>60 && pm<=69){
       		System.out.println("your Grade : D ");
         }
       	  else{
       		System.out.println("your Grade : Fail  ");

       	  } 

       	}
}

	
