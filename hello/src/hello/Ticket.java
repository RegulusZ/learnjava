package hello;

import java.util.Scanner;

public class Ticket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
//		����Ͷ�ҽ��
		System.out.print("��Ͷ�ң�");
		int amount = in.nextInt();
		System.out.println("��Ͷ��Ľ���ǣ�"+amount);
//		��ӡ��Ʊ
		if ( amount >= 10)
		{
		System.out.println("**************");
		System.out.println("*Java�Ǽ���·ר��*");
		System.out.println("*  ��ָ����λƱ      *");
		System.out.println("*  Ʊ�ۣ�10Ԫ        *");
		System.out.println("**************");
//		���㲢��ӡ����
		System.out.println("���㣺"+(amount-10));
		}
	}

}