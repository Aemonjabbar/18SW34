import java.util.Scanner;
class Task1{
	public static void main(String args[]){
	int marksobtained;
	char grade='a';
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter your obtained marks:");
	marksobtained= scan.nextInt();
	if(marksobtained>90){
	grade='A';
	}
	else if(marksobtained>70 && marksobtained<79){
	grade='B';
	}
	else if(marksobtained>60 && marksobtained<69){
	grade='C';

	}
	else if(marksobtained<60){
	grade='F';
	}
	System.out.println(grade);

	}
}