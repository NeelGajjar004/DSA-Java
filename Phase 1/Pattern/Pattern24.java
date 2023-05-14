package Pattern;

import java.util.Scanner;

public class Pattern24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i=0;
		System.out.print("Enter Number :-");
		int n = scan.nextInt();
		while(i<n)
		{
			
			int j=0;
			while(j<n-i) {
				System.out.print(j+1 +" ");
				j++;
			}
			
			int space = i;
			while(space>0) {
				System.out.print("* * ");
				space--;
			}
			
			int k=n-i;
			while(k>0){
				System.out.print(k + " ");
				k--;
				
			}

			System.out.println();
			i++;
		}
	}

}
