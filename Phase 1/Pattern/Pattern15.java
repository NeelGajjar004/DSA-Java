package Pattern;

import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i=0;
		int count = 0;
		System.out.print("Enter Number :-");
		int n = scan.nextInt();
		while(i<n)
		{
			int j=0;
			while(j<=i)
			{
				System.out.print((char) ('A'+j+count) + " ");
				j++;
			}
			System.out.println();
			count++;
			i++;
		}
	}

}
