class Voting
{
    int count;
	String name[];
	int age;
	int n=10;

	

	void Addcandidates(String []name)
	{
		for(int i=0;i<n;i++)
		{
			this.name[i]=name[i];
		}
	}

	void Castvote(int age,String name)
	{
		for(int i=0;i<n;i++)
		{
			if(this.name[i]==name)
			{
				System.out.println("Name:"+name+ "Vote"+count);	
			}
			this.age=age;
		}
	
	}	}

class invalidage extends Exception
{
	invalidage(String s)
	{
	   super(s);
	}
}
class UseVoting
{
	public static void main(String args[])
	{
	   int age=17;
	   try
	   {
	   if(age<18)
	   {
	      throw new invalidage("valid Age");
	   }
	   }

	   catch(invalidage i)
	   {
	      System.out.println(i);
	   }
	}
}