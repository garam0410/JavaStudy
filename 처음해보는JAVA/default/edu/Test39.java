package edu;

public class Test39 {

	public static void main(String[] args) {
		
		int arr[][] = new int[5][5];
		int num = 1;
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {

			for(int j = 0; j < arr[i].length; j++) {
					
				arr[i][j] = num;
				num++;
				
				if(i == j)
					sum += arr[i][j];
			}
		}
		
		System.out.println(sum);

	}
}
