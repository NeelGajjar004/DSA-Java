package Pattern;

import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i=0;
		System.out.print("Enter Number :-");
		int n = scan.nextInt();
		while(i<n)
		{
			int j=0;
			while(j<=i)
			{
				System.out.print((char) ('D'-i+j) + " ");
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
