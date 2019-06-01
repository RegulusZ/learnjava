package hello;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请投币");
		Scanner in = new Scanner(System.in);
//		System.out.println("echo:" + in.nextLine());
		int amount = 100;
		System.out.print("您的");
		amount = in.nextInt();
		int price = 0;
		System.out.print("您的找零是：");
		price = in.nextInt();
		System.out.println(amount+"-"+price+"=" + (amount - price));
	}

}
