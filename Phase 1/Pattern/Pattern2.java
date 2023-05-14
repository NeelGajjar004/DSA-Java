package Pattern;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i=1;
		System.out.print("Enter Number :-");
		int n = scan.nextInt();
		while(i<=n) {
			int j = 1;
			while(j<=n)
			{
				System.out.print(i);
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
