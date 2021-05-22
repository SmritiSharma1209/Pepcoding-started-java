package Lecture_1;
import java.util.Scanner;

public class Prime_factorisation_of_a_number {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		for(int i=2;i<=Math.pow(n, 0.5);++i) {
			while(n%i==0) {
				n=n/i;
				System.out.print(i+"");
				}
			}
		if(n!=1) {
			System.out.println(n);
		}

}

}
