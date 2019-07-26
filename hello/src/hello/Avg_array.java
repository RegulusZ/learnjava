//利用数组计算一组数的平均值并输出大于平均值的数
package hello;

import java.util.Scanner;

public class Avg_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
//		存放输入的数
		int[] numbers = new int[100];
		int cnt = 0;
		double sum = 0;
		cnt = in.nextInt();
		if (cnt > 0)
		{
			for (int i=0; i<cnt; i++)
			{
				numbers[i] = in.nextInt();
				sum += numbers[i];
			}
	//			找到大于平均值的数并输出
			double average = sum/cnt;
			for (int i=0; i<numbers.length; i++)
			{
				if (numbers[i] > average)
				{
					System.out.println(numbers[i]);
				}
			}
				System.out.println(sum/cnt);
		}
	}
}

