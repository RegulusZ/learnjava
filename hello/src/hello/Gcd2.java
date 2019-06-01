package hello;

import java.util.Scanner;

//求出两个数的最大公约数（辗转相除法）
public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int oa = a;
		int ob = b;
		int gcd = 1;
		while (b != 0)
		{
			int r = a%b;
			a = b;
			b = r;
		}
		System.out.println(oa+"和"+ob+"的最大公约数是："+a);
	}

}
