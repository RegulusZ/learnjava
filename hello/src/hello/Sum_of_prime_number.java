package hello;

import java.util.Scanner;

//计算第n个素数和第m个素数之间的所有素数和
public class Sum_of_prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int sum = 0;
		int isPrime = 1;
		int j = 1;
		int s = 2;
		while (j<=m)
		{
			for (int i = 2;i<s ; i++)
			{
				if (s%i == 0)
				{
					isPrime = 0;
					break;
				}
				else
				{
					isPrime =1;
				}
			}
			if (isPrime == 1)
			{
				if (j>=n)
				{
					sum += s;
				}
				j ++;
			}
			s++;
		}
		System.out.println(sum);
	}

}
