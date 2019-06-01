package hello;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MINOR = 35;
		System.out.print("请输入你的年龄：");
		Scanner in = new Scanner(System.in);
		int age = in.nextInt();
		System.out.println("你的年龄是："+age);
		if (age <= MINOR)
		{
			System.out.print("年轻是美好的,");
		}
		System.out.println("珍惜时光吧");
	}

}
