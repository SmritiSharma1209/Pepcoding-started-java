package Lecture_1;
import java.util.Scanner;

public class Print_digits_of_number {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		
		int count=0;
		int temp=n;
		while(temp!=0) {
			temp=temp/10;
			++count;
		}
		System.out.println(count);
		
		int div=(int)Math.pow(10, count-1);
		while(div!=0) {
			int q=n/div;
			System.out.println(q);
			n=n%div;
			div=div/10;
		}
		
	}

}
