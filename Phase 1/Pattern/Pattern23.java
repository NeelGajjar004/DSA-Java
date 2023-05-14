package Pattern;

import java.util.Scanner;

public class Pattern23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i=0;
		System.out.print("Enter Number :-");
		int n = scan.nextInt();
		while(i<n)
		{
			int space = n-i-1;
			while(space>0) {
				System.out.print(" ");
				space--;
			}
			
			int j = 0;
			while(j<=i)
			{
				System.out.print(j+1);
				j++;
			}
			
			

			
			int k=i;
			while(k>0)
			{
				System.out.print(k);
				k--;
			}
			
			System.out.println();
			i++;
		}
	}

}
