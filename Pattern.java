package Assignmentss;
import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        System.out.println("Enter your number");
	        int n=sc.nextInt();
	        for(int i=0;i<=n;i++){
	            for(int j=0;j<i;j++){
	                System.out.print("*");

	            }
	            System.out.println();
	        }

	}

}
