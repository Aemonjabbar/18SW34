class Student1
{

      String name;
      int rollno;
     Student1()
     {
     name="unknwon";
     rollno=0;
     }
     Student1(String n , int r )
     {
      name=n;
      rollno=r;
     }

     public void display()
     {

     System.out.println("Name is="+name+" and rollno is= "+rollno);
     }

           
 }

  class Student
   {
     public static void main(String args[])
	{
	    Student1 s1=new Student1("Aemon" , 34);
	    	    s1.display();

	}

  
     }
	