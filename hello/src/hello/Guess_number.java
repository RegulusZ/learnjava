package hello;

import java.util.Scanner;

public class Guess_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int number = (int)(Math.random()*100+1);
		System.out.print("请输入一个数字:");
		Scanner in = new Scanner(System.in);
		int a;
		int count =0;
		do 
		{
			a = in.nextInt();
			if (a>number)
			{
				System.out.println("偏大");
			}
			else if (a<number)
			{
				System.out.println("偏小");
			}
			count += 1;
		}while (a != number);
		System.out.println("恭喜你，猜对了！你猜的次数是"+count);
				
	}

}
