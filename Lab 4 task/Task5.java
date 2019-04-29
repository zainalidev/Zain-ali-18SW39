class Task5{
	public static void main(String[] args) {
		int[] arr={22,33,44,55,66};
		int max=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		System.out.print("Maximum Number is "+max);
	}
}