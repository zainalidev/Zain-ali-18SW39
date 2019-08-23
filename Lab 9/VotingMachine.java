class VotingMachine
{
	String[] cname;
	String name;
	int[] count;
	public void addCandidates(String[] name)
	{
		cname=new String[name.length];
		for (int i=0;i<name.length;i++) 
		{
			cname[i]=name[i];
		}
		count=new int[cname.length];
	}
	public void casteVote(int age,String voteToCandidates)
	{
		try
		{
			if(age>=18)
			{
				for (int i=0;i<cname.length;i++) 
				{
					if (cname[i]==voteToCandidates)
					{
						name=voteToCandidates;
						count[i]++;
					}
				}
			}
		else 
			throw new Exception("Invalid age");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	public void printResults()
	{
		//System.out.println("name of Candidates "+name);
		for (int i=0; i<count.length;i++) 
		{
			if(name.equals(cname[i])){
				System.out.println("name of Candidates "+name);
				System.out.println("casted Vote "+count[i]);	
			}
		}
	}
	public static void main(String[] args) 
	{
		String[] na={"jabbar","ali","jawad","inayat"};
		VotingMachine vote=new VotingMachine();
		vote.addCandidates(na);
		vote.casteVote(20,"jabbar");
		vote.casteVote(30,"ali");
		vote.casteVote(30,"ali");
		vote.printResults();
	}
}