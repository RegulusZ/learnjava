package hello;

import java.util.Scanner;

public class Heghit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int foot;
		double inch;
		Scanner in = new Scanner(System.in);
		System.out.print("请输入英尺：");
		foot = in.nextInt();
		System.out.print("请输入英寸：");
		inch = in.nextDouble();
		System.out.println("foot="+foot+",inch="+inch);
		System.out.println((int)((foot+inch/12.0)*0.3048*100)+"cm");
	}

}
