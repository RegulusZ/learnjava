package hello;

import java.util.Scanner;

public class temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int F = 0;
		System.out.print("�����뻪���¶ȣ�");
		F = in.nextInt();
		int C = 0;
		C = (int)((F-32)*5/9.0);
		System.out.println("ת��Ϊ�����¶�Ϊ��"+C);

	}

}