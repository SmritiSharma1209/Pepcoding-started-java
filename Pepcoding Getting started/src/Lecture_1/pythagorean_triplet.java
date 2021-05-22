package Lecture_1;
import java.util.Scanner;

public class pythagorean_triplet {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		
		if(a>b && a>c) {
			if((int)Math.pow(a, 2)==(int)( Math.pow(b, 2)+Math.pow(c, 2))){
				System.out.println("true");
				
			}else {
				System.out.println("false");
				
			}
			
			
		}else if(b>c && b>a) {
			if((int)Math.pow(b, 2)==(int)( Math.pow(a, 2)+Math.pow(c, 2))){
				System.out.println("true");
			}
			else {
				System.out.println("false");
				
			}
			
		}
		else if(c>a && c>b) {
			if((int)Math.pow(c, 2)==(int)( Math.pow(a, 2)+Math.pow(b, 2))){
				System.out.println("true");
			}
			else {
				System.out.println("false");
				
			}
			
		}else {
			System.out.println("false");
		}
		


	}

}
