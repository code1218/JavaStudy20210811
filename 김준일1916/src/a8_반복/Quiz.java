package a8_�ݺ�;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		System.out.print("�ݺ�Ƚ��: ");
		int num = (new Scanner(System.in).nextInt());
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num-i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	
}
