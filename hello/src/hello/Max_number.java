package hello;

import java.util.Scanner;

public class Max_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x,y,z,max=0;
		x = in.nextInt();
		y = in.nextInt();
		z = in.nextInt();
		if (x>y) {
			if (x>z)
			{
				max = x;
			}
			else
			{	
				max = z;
			}
		}
		else 
		{
			if (y>z)
			{
				max = y;
			}
			else 
			{
				max = z;
			}
		}
		System.out.println("最大值是"+max);
	}

}
