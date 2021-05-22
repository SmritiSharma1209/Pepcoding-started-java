package Lecture_1;
import java.util.Scanner;

public class fibonacci_numbers_till_N {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int a=0;
		int b=1;
		int c=0;
		
		for(int i=0;i<n;++i) {
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
			
		}
		



	}

}
