package hello;

import java.util.Scanner;

public class Count_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("������������֣�");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int count = 0;
		do
		{
			number = number/10;
			count += 1;
		}while (number >0);
		System.out.println("�������������"+count+"λ��");
	}

}
