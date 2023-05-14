package Pattern;

import java.util.Scanner;

public class Pattern21 {

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
			
			int j = i;
			while(j<n)
			{
				System.out.print(j+1);
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
