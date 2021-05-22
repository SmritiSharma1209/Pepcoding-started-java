package Lecture_1;
import java.util.Scanner;

public class Rotate_A_number_by_n {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		int rnum=0;
		int temp=n;
		int count=0;
		while(temp!=0) {
			temp=temp/10;
			count++;
			}
		k=k%count;
		if(k<0) {
			k=k+count;
		}
		
		int div=(int)Math.pow(10, k);
		int r=n%div;
		int q=n/div;
		int mul=(int)Math.pow(10,count-k);
		rnum=(r*mul)+q;
		System.out.println(rnum);
		
		

	}

}
