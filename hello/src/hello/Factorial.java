package hello;

import java.util.Scanner;
//����׳�
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		double factor = 1;
//		while (i<=n)
//		{
//			factor = factor * i;
//			i = i+1;
//		}
		for (int i=1; i<=n; i=i+1)
		{
			factor = factor * i;
		}
		System.out.println(factor);
	}

}
