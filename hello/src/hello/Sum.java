package hello;

import java.util.Scanner;

//求1到1/n的和
public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		double sum = 0.0;
		for (int i=1; i<=n; i++)
		{
			sum += 1.0/i;
		}
		System.out.printf("%.2f", sum);
	}

}
