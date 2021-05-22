package Lecture_1;
import java.util.Scanner;

public class Reverse_a_number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int count=0;
		int temp=n;
		while(temp!=0) {
			temp=temp/10;
			count++;
			}
		while(count!=0) {
			int r=n%10;
			System.out.println(r);
			n=n/10;
			count--;
		}
		
	}

}
