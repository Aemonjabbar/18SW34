import java.util.Scanner;
class Task3{
	public static void main(String args[]){
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter a character:");
	char ch= scan.next().charAt(0);
	switch (ch){
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
	System.out.println(ch+"It is a vowel");
	break;
	default:
	System.out.println(ch+"It is a conconant");
	}
 }
}