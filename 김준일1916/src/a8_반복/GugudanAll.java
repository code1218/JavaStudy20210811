package a8_�ݺ�;

import java.util.Scanner;

public class GugudanAll {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("���� �ܼ�: ");
		int gugudanStart = in.nextInt();
		System.out.print("������ �ܼ�: ");
		int gugudanEnd = in.nextInt();
		
		for(; gugudanStart < gugudanEnd+1; gugudanStart++) {
			
			System.out.println(gugudanStart + "��");
			for(int j = 0; j < 9; j++) {
				int j2 = j + 1;
				
				System.out.println(gugudanStart + " X " + j2 + " = " + gugudanStart*j2);
			}
			System.out.println();
		}
		

	}

}
