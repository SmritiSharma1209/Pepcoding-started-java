package Lecture_1;
import java.util.Scanner;

public class Grading_system {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n>90) {
			System.out.println("excellent");
		
		}
		else if(n>80 && n<=90) {
			System.out.println("good");
			
		}
		else if(n>70 && n<=80) {
			System.out.println("fair");
			
		}
		else if(n>60 && n<=70) {
			System.out.println("need to meet expectations");
			
		}
		else {
			System.out.println("below par");
		}

	}

}
