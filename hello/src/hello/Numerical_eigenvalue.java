package hello;

import java.util.Scanner;

public class Numerical_eigenvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number;
		number = in.nextInt();
		int n=0;
		int x=0;
		int count = 0;
		int result = 0;
		while (number>0)
		{
			x = number%10;
			number = number/10;
			n += 1;
			if (x%2 == n%2)
			{
				count = 1;
				result = (int) (result + Math.pow(2, (n-1)));
			}
			else
			{
				count =0;
			}
		}
		System.out.println(result);
	}

}
