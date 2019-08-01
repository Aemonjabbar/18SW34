class Sports
{
	String getName()
	{
	   return "Generic Sports";
	}

	void getNumberOfTeamMembers()
	{
	  System.out.println("Each Number has 11 players in"+getName());
	}
}

class Cricket extends Sports
{
	String getName()
	{
	   return "Generic Cricket";
	}

	void getNumberOfTeamMembers()
	{
	  System.out.println("Each Number has 11 players in"+getName());
	}
}
class Soccer extends Cricket
{
	String getName()
	{
	   return "Generic Soccer";
	}

	void getNumberOfTeamMembers()
	{
	  System.out.println("Each Number has 11 players in"+getName());
	}
}
class Task2
{
     public static void main(String args[])
     {
        Cricket c=new Cricket();
        Soccer s=new Soccer();

        
        String a=c.getName();
        System.out.println(a);
      
         String z=s.getName();
         System.out.println(z);
      
         c.getNumberOfTeamMembers();
         s.getNumberOfTeamMembers();      

        
    }
}