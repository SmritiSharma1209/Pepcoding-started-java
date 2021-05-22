package Lecture_1;
import java.util.Scanner;

public class print_range_of_prime_numbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int low=s.nextInt();
		int high=s.nextInt();
		for(int i=low;i<=high;++i) {
			int j=2;
			int count=0;
			while(j<=Math.pow(i, 0.5)) {
				if(i%j==0) {
					count++;
					break;
				}
				j++;
			}
			if(count==0) {
				System.out.println(i);
			}
		}



	}

}
