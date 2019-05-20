class useStatic{
	static int count=0;
	useStatic(){
		count++;
	}
	public int getCount(){
		return count;
	}
}
class Task6{
	public static void main(String args[]){
		useStatic s1=new useStatic();
		System.out.println(s1.getCount());
		useStatic s2=new useStatic();
		useStatic s3=new useStatic();
		useStatic s4=new useStatic();
		System.out.println(s4.getCount());
	}
}