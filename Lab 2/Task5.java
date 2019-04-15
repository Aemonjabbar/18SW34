class Task5{
	public static void main(String args[]){
	int p=50, q=10, r=0;
	r=p&q;
	System.out.println("r=p&q: "+r);
	r=p|q;
	System.out.println("r=p|q: "+r);
	r=p^q;
	System.out.println("r=p^q: "+r);
	r=~q;
	System.out.println("r=~q: "+r);
	r=p>>2;
	System.out.println("r=p>>2: "+r);
	r=q<<2;
	System.out.println("r=q<<2: "+r);
	r=p>>>2;
	System.out.println("r=p>>>2: "+r);


	}
}