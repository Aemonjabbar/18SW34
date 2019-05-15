//   Task2   
import java.util.Scanner;

class PopulateArray
{
	Scanner x=new Scanner(System.in);
	int arr[]=new int[5];
	public void set_array()
	{
	   System.out.println("Enter Array Element");
	   for(int i=0;i<=4;i++)
	   arr[i]=x.nextInt();
	}


     public void get_array()
     {
	     for(int j=0;j<=4;j++)
	     {
	         if(arr[j]%2==0)
	         {
	            System.out.println("Even="+arr[j]);
	         }
	         if(arr[j]%2!=0)
	         {
	      	     System.out.println("Odd="+arr[j]);
	      	 }   
	     }
 	}

}
 class MainPopulateArray
 {
     public static void main(String args[])
     {
       PopulateArray p1;
       p1=new PopulateArray();
       p1.set_array();
       p1.get_array();
     }
 }