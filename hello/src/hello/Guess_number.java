package hello;

import java.util.Scanner;

public class Guess_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int number = (int)(Math.random()*100+1);
		System.out.print("������һ������:");
		Scanner in = new Scanner(System.in);
		int a;
		int count =0;
		do 
		{
			a = in.nextInt();
			if (a>number)
			{
				System.out.println("ƫ��");
			}
			else if (a<number)
			{
				System.out.println("ƫС");
			}
			count += 1;
		}while (a != number);
		System.out.println("��ϲ�㣬�¶��ˣ���µĴ�����"+count);
				
	}

}
