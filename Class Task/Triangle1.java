class Triangle1
{
	    double hyp;
	    double base;
	    double perp;
	    Triangle1(double base,double perp)
	   {
	    this.hyp=hyp;
	    this.base=base;
	    this.perp=perp;
	   }
	   Triangle1(float base,float perp)
	   {
	   this.hyp=hyp;
	   this.base=base;
	   this.perp=perp;
	   }
	   Triangle1()
	   {
	   hyp=hyp;
	   base=base;
	   perp=perp;

	   }
	   public double getBase(double hyp,double perp)
	   {
	   base=Math.sqrt((hyp*hyp)+(perp*perp));
	   return base;
	   }
        public  double getHyp(double base,double perp)
          {	 
	  hyp=Math.sqrt((base*base)-(perp*perp));
	  return hyp;
	  }
	 public double getPerp(double base,double hyp)
	{
	 perp=Math.sqrt((base*base)-(hyp*hyp));
	 return perp;
        }
	 
	 
}



class ClassTask
{
	    public static void main(String args [])
	    {
	    			Triangle obj=new Triangle(4.5d,6.88d);
	    			Triangle obj1=new Triangle(9.5f,8.88f);
	    			Triangle obj2= new Triangle();
	    			System.out.println("\n");
	    			System.out.println("The Base Of Rigth Angle Triangle Is ="+obj1.getBase(5.99d,8.99d));
	    		        System.out.println("\n");
	    			System.out.println("The Hypotenus Of Rigth Angle Triangle Is ="+obj.getHyp(5.33d,4.44d));
                                System.out.println("\n");
	    			System.out.println("The Perpendicular Of Rigth Angle Triangle Is ="+obj.getPerp(7.55d,6.55d));
                    
	    		 	
                    
	    		 	
                    
	    		 	
	    }
}