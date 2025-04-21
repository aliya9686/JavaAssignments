package Assignmentss;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int n=sc.nextInt();
        int rem=1;
        for(int i=2;i<=n;i++){
          rem*=i;
        }

        System.out.println(rem);

	}

}
