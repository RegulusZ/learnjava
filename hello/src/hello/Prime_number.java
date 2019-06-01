package hello;

import java.util.Scanner;

public class Prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int count = 0;
		for (int i=2; i<n; i++)
		{
			if (n % i == 0)
			{
				count += 1;
			}
		}
		if (count>0)
		{
			System.out.println("不是素数");
		}
		else
		{
			System.out.println("是素数");
		}
	}

}
