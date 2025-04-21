package Assignmentss;
import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        System.out.println("Enter your number");
	        int n=sc.nextInt();
	        int i=1;

	        while(i<=10){
	            int sum=n*i;
	            System.out.println(n+"*"+i+"="+sum);
	            i++;
	        }

	}

}
