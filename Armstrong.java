package Assignmentss;
import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.println("Armstrong numbers from 1 to 1000:");
        
        for (int i = 1; i <= 1000; i++) {
            int n = i;
            int sum = 0;

            while (n > 0) {
                int b = n % 10;
                sum += (b * b * b);
                n = n / 10;
            }

            if (sum == i) {
                System.out.println(i + " ");
            }
        }

        sc.close(); // Optional: Good habit to close the scanner
    }
}