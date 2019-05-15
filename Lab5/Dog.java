class Dog
{
	String name;
	String breed;
	int age;


	public void SetDetails(String n,String b,int a)
	{
	 name=n;
	 breed=b;
	 age=a;
	}

    public void ShowDetails()
    {
       System.out.println(name+" "+breed+" "+age);
    }
}

class MainDog
{
      public static void main(String args[])
      {

      Dog d1;
      d1=new Dog();
      d1.SetDetails("tommy","tommy",2);
      d1.ShowDetails();
      }
}