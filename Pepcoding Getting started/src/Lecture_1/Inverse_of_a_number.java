package Lecture_1;
import java .util.Scanner;
public class Inverse_of_a_number {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int temp=n;
		int count=0;
		while(temp!=0) {
			temp=temp/10;
			count++;
		}
		int arr[]=new int[count+1];
		for(int i=1;i<=count;++i) {
			int q=n%10;
			arr[q]=i;
			n=n/10;
			
		}
           for(int j=arr.length-1;j>0;--j) {
        	   System.out.print(arr[j]);
           }


	}

}
