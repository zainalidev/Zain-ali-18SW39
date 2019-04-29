import java.util.*;
class Task6{
	public static void main(String[] args) {
		int array[]={1,2,3,4,6};
		System.out.print("Enter a Number : ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int position=0;
		int count=0;
		for(int i=0;i<array.length;i++){
			if(array[i]==num){
              position=i+1;
              count=0;
              break; 
			}
			else
				count++;
		}
         if (count==0) {
         	System.out.print("Position of Element : "+position);
         	
         }
         else
         	System.out.print("Element not found ");
	}
}