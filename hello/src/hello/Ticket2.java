package hello;

import java.util.Scanner;

public class Ticket2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int balance = 0;
//		����Ͷ�ҽ��
		while (true)
		{
			System.out.print("��Ͷ�ң�");
			int amount = in.nextInt();
			balance = balance + amount;
			System.out.println("����Ͷ��Ľ���ǣ�"+balance);
	//		��ӡ��Ʊ
			if ( balance >= 10)
			{
			System.out.println("**************");
			System.out.println("*Java�Ǽ���·ר��*");
			System.out.println("*  ��ָ����λƱ      *");
			System.out.println("*  Ʊ�ۣ�10Ԫ        *");
			System.out.println("**************");
	//		���㲢��ӡ����
			System.out.println("���㣺"+(balance-10));
			balance = 0;
			}

		}
	}

}
