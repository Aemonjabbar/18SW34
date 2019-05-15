class Marksheet
{
	int sub1;
	int sub2;
	int sub3;


	Marksheet()

	{
	    sub1=0;
	    sub2=0;
	    sub3=0;
	}

	public void setmarks(int m1,int m2,int m3)
	{
	    sub1=m1;
	    sub2=m2;
	    sub3=m3;
	}
	public void totalmarks()
	{

	   int marks=sub1+sub2+sub3;
	   System.out.println("Total marks="+marks);

	   double per=(marks*100)/300;
	   System.out.println("percentage is="+per);
	}

}

class MainMarksheet
{
	public static void main(String args[])
	{
	   Marksheet m1;
	   m1=new Marksheet();
	   m1.setmarks(10,10,20);
	   m1.totalmarks();
	}
}