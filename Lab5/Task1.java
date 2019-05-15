import java.util.Scanner;
class Task1
{
	public static void main(String args[])
	{
	   Scanner s=new Scanner(System.in);
	   System.out.println("Enter the string name and integer number");

	   String name=s.next();
	   int rollno=s.nextInt();

	   System.out.println(name+" "+rollno);
	}
}