import java.util.Scanner;
class Task1{
	public static void main(String args[]){
		Scanner scanf=new Scanner(System.in);
		System.out.println("Enter Your Name:");
		String name=scanf.nextLine();
		System.out.println("Enter Your RollNo:");
		String rollno=scanf.nextLine();
		System.out.println("Enter Your Age:");
		int age=scanf.nextInt();
		System.out.println("Name:"+name+" RollNo:"+rollno+" Age:"+age);
		}
}