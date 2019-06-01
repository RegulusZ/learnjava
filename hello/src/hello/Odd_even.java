package hello;

import java.util.Scanner;

public class Odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		int odd=0;
		int even=0;
		Scanner in = new Scanner(System.in);
		do
		{
			number = in.nextInt();
			if (number%2==0)
			{
				even += 1;
			}
			else if(number%2==1)
			{
				odd += 1;
			}
		}while(number!=-1);
		System.out.println(odd+" "+even);
	}

}
