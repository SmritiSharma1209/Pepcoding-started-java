package Lecture_1;
import java.util.Scanner;
public class No_of_digits {

	public static void main(String[] args) {
     Scanner s= new Scanner(System.in);
     int n=s.nextInt();
     int count=0;
     while(n>0) {
    	int r=n%10;
    	 count++;
    	 n=n/10;
    	 
     }
     System.out.println(count);



	}

}
