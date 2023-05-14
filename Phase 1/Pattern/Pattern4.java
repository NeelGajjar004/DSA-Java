package Pattern;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int i=0;
		System.out.print("Enter Number :-");
		int n = scan.nextInt();
		int count = 1;
		while(i<n)
		{
			int j=0;
			while(j<n)
			{
				System.out.print(i+j+count + " ");
				j++;
			}
			System.out.println();
			count += 9;
			i++;
		}
		
	}

}
