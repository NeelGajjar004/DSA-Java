package Pattern;

import java.util.Scanner;

public class Pattern22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i=0;
		int count=1;
		System.out.print("Enter Number :-");
		int n = scan.nextInt();
		while(i<n)
		{
			int space = n-i-1;
			while(space>0) {
				System.out.print("  ");
				space--;
			}
			
			int j = 0;
			while(j<=i)
			{
				System.out.print(count + " ");
				count++;
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
