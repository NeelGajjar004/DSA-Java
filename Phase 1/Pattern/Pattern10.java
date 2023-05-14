package Pattern;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i=0;
		System.out.print("Enter Number :-");
		int n = scan.nextInt();
		while(i<n)
		{
			int j=0;
			while(j<n)
			{
				System.out.print((char) ('A'+j) + " ");
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
