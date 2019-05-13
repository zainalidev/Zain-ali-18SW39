class Marksheet{
	int cp;
	int laag;
	int dcld;
	int total;
	int obt;
	float percentage;
	void setDetails(int cp,int laag,int dcld,int total){
		this.cp=cp;
		this.laag=laag;
		this.dcld=dcld;
		this.total=total;
	}
	void showDetails(){
		obt=cp+laag+dcld;
		System.out.println("Marks in CP:"+cp);
		System.out.println("Marks in Eng:"+laag);
		System.out.println("Marks in DCLD:"+dcld);
		System.out.println("Total Obtained Marks"+obt);
		System.out.println("Total Marks:"+total);
		System.out.println("Your Percentage is:"+calculatePercentage());
		System.out.println("Your Grade is:"+grade());
	}
	float calculatePercentage(){
		obt=cp+laag+dcld;
		percentage=(obt*100/total);
		return percentage;
	}
	char grade(){
		if(percentage>80)
			return 'A';
		else if(percentage>=70 && percentage<80)
			return 'B';
		else if(percentage>=60 && percentage<70)
			return 'C';
		else if(percentage>=50 && percentage<60)
			return 'D';
		else if(percentage>=40 && percentage<50)
			return 'E';
		else
			return 'F';
	}
}
class Task5{
	public static void main(String args[]){
		Marksheet m1=new Marksheet();
		m1.setDetails(85,80,95,300);
		m1.showDetails();
	}
}