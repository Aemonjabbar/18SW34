class Task7 
{
	public  static void main(String [] args)
	{
		String a="Nittalia , 19  , software";
		String b="Aemon , 19  , software";
		String [] c=a.split(", " , 3);
		String [] d=b.split(", " , 3);
		System.out.println("Student 1");
		for(int i=0 ; i<3 ; i++)
		{
			System.out.println(c[i]);

		}
		System.out.println("Student 2");
		for(int i=0 ; i<3 ; i++)
		{
			System.out.println(d[i]);

		}
	}
}