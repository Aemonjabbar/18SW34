class Task4{
	public static void main(String args[]){
	int FirstNo=Integer.parseInt(args[0]);
	int SecondNo=Integer.parseInt(args[1]);
	char operator=args[2].charAt(0);
	System.out.println(args[0]+args[2]+args[1]);
	switch(operator){
	case '+':
	System.out.println(FirstNo + SecondNo);
	break;
	case '-':
	System.out.println(FirstNo - SecondNo);
	break;
	case '*':
	System.out.println(FirstNo * SecondNo);
	break;
	case '/':
	System.out.println(FirstNo / SecondNo);
	break;
	default:
	System.out.println("Invalid Entery");
	}
  }
}