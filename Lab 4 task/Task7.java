class Task7{
	public static void main(String args[]){
		int arr[]={1,4,3,6,3,8,2,7,5,9,12,10};
		System.out.print("Before Sorting:");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.print("\nAfter Sorting: ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
}