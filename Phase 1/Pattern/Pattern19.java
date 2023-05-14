package Pattern;

import java.util.Scanner;

public class Pattern19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i=0;
		System.out.print("Enter Number :-");
		int n = scan.nextInt();
		while(i<n)
		{
			int space = i;
			while(space>=1) {
				System.out.print(" ");
				space--;
			}
			
			int j = 0;
			while(j<n-i)
			{
//				System.out.print("*");
				System.out.print(i);
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
