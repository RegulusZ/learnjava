package hello;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MINOR = 35;
		System.out.print("������������䣺");
		Scanner in = new Scanner(System.in);
		int age = in.nextInt();
		System.out.println("��������ǣ�"+age);
		if (age <= MINOR)
		{
			System.out.print("���������õ�,");
		}
		System.out.println("�����������ľ������磬�ú���ϧ��");
	}

}