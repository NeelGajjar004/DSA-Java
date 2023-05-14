package Pattern;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i=0;
		int count=0;
		System.out.print("Enter Number :-");
		int n = scan.nextInt();
		while(i<n)
		{
			int j=0;
			while(j<n)
			{
				System.out.print((char) ('A'+i+j+count) + " ");
				j++;
			}
			System.out.println();
			count += 2;
			i++;
		}
	}

}
