package hello;

import java.util.Scanner;

public class Time_conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�����뱱��ʱ�䣺");
		Scanner in = new Scanner(System.in);
		int BJT = in.nextInt();
		int UTC;
		if (BJT>=800)
		{
			UTC = BJT - 800;
		}
		else
		{
			UTC = BJT + 1600;
		};
		if (UTC<10)
		{
			System.out.println("��Ӧ������ʱ���ǣ�0"+UTC);
		}
		else
		{
			System.out.println("��Ӧ������ʱ���ǣ�"+UTC);
		}
	}

}
