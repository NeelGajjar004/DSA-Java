package Pattern;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i=1;
		System.out.print("Enter Number :-");
		int n = scan.nextInt();
		while(i<=n) {
			int j = 1;
			while(j<=n)
			{
				System.out.print(j);
//				System.out.print(n-j+1);
				
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
