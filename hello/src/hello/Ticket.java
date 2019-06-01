package hello;

import java.util.Scanner;

public class Ticket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
//		����Ͷ�ҽ��
		System.out.print("请投票");
		int amount = in.nextInt();
		System.out.println("您投入的金额是："+amount);
//		��ӡ��Ʊ
		if ( amount >= 10)
		{
		System.out.println("**************");
		System.out.println("*Java城际专乘*");
		System.out.println("*  票价      *");
		System.out.println("*  10元        *");
		System.out.println("**************");
//		���㲢��ӡ����
		System.out.println("你的找零是："+(amount-10));
		}
	}

}
