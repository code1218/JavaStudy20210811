package b11_배열;

public class DoubleArray {
	// 이차원 배열
	// 이차원 배열의 형태 -> 자료형[][];
	
	public static void main(String[] args) {
		
		int[][] d_arr = new int[3][5];
		
		d_arr[0][0] = 10;
		d_arr[1][4] = 100;
		
		System.out.println(d_arr[0][0]);
		System.out.println(d_arr[2][4]);
		
		System.out.println("[1, 4]");
		
		System.out.println(d_arr.length);
		System.out.println(d_arr[0].length);
		
		for(int i = 0; i < d_arr.length; i++) {	//운동장 3바퀴
			for(int j = 0; j < d_arr[i].length; j++) {
				if(d_arr[i][j] != 100) {
					continue;
				}
				System.out.println("[" + i + ", " + j + "]");
				break;
			}
		}
		
		
		
	}
}




