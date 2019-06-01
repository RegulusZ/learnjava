package hello;

import java.util.Scanner;

public class Signal_report {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("请输入代码：");
		Scanner in = new Scanner(System.in);
		int code = in.nextInt();
		switch (code%10)
		{
		case 1:
			System.out.print("Faint signals, barely perceptible, ");
			break;
		case 2:
			System.out.print("Very weak signals, ");
			break;
		case 3:
			System.out.print("Weak signals, ");
			break;
		case 4:
			System.out.print("Fair signals, ");
			break;
		case 5:
			System.out.print("Fairly good signals, ");
			break;
		case 6:
			System.out.print("Good signals, ");
			break;
		case 7:
			System.out.print("Moderately strong signals, ");
			break;
		case 8:
			System.out.print("Strong signals, ");
			break;
		case 9:
			System.out.print("Extremely strong signals, ");
			break;
		}
		switch(code/10)
		{
		case 1:
			System.out.println("unreadable.");
			break;
		case 2:
			System.out.println("barely readable, occasional words distinguishable.");
			break;
		case 3:
			System.out.println("readable with considerable difficulty.");
			break;
		case 4:
			System.out.println("readable with practically no difficulty.");
			break;
		case 5:
			System.out.println("perfectly readable.");
			break;
		}
		
	}

}
