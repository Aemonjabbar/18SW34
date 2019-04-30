import java.util.Scanner;
class Task2{
	public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter table of:");
	int table = scan.nextInt();
	System.out.print("upto:");
	int upto = scan.nextInt();
	for(int i=5;i<=upto;i++){
	System.out.println(table+"*"+i+"="+i*table);
	}

	}
}