package b11_�迭;

import java.util.Arrays;

public class ArrayMaxAndMin {
	public static void main(String[] args) {
		int arr[] = {4, 3, 2, 6, 1, 8, 7, 9, 5};
		
		int max = 0, min = 0;
		
		for(int i = 0; i < arr.length; i++) {
			max = max < arr[i] ? arr[i] : max;
			min = min > arr[i] ? arr[i] : min;
		}		
		
		System.out.println("�ִ밪: " + max);
		System.out.println("�ּҰ�: " + min);
		
		Arrays.sort(arr);
		
		System.out.println("�ִ밪: " + arr[arr.length - 1]);
		System.out.println("�ּҰ�: " + arr[0]);
	}
}
