import java.util.Scanner;
class Practice{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Size of Array");
	int size=sc.nextInt();
	int arr[]=new int[size];
	populatearray(size,arr);
	System.out.print("Even: ");
	for(int i=0;i<arr.length;i++){
		if(arr[i]%2==0){
			System.out.print(arr[i]+" ");
		}
	}
	System.out.print("\nOdd: ");
	for(int i=0;i<arr.length;i++){
		if(arr[i]%2!=0){
			System.out.print(arr[i]+" ");
		}
	}
	}
      public static void populatearray(int size,int arr[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Elements of Array");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
	}
}


