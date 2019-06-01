package hello;

import java.util.Scanner;

//求出两个数的最大公约数
public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int gcd = 1;
		for (int i = 2;i<=a && i<=b;i=i+1)
		{
			if (a%i==0)
			{
				if(b%i==0)
				{
					gcd = i;
				}
			}
		}
		System.out.println(a+"和"+b+"的最大公约数是："+gcd);
	}

}
