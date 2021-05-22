package Lecture_1;
import java.util.Scanner;

public class Is_prime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
				for(int i=0;i<t;++i) {
					int n=s.nextInt();
					int count=0;
					for(int j=2;j<=(int)Math.pow(n, 0.5);++j){
						if(n%j==0) {
						count++;
						break;
					}
				}
					if(count==0) {
						System.out.println("Prime");
					}else {
						System.out.println("Not Prime");
					}
   


	}

	}
}