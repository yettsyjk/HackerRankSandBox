package com.yettsyjknapp;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ArrayTest {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int[][] arr = new int[6][6];

		for (int i = 0; i < 6; i++) {
			String[] arrRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 6; j++) {
				int arrItem = Integer.parseInt(arrRowItems[j]);
				arr[i][j] = arrItem;
			}
		}

		int result = hourglassSum(arr);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}

	static int hourglassSum(int[][] arr) {
		int max = 0;
		int current = 0;
		for(int y = 0; y <=3; y++) {
			for(int x = 0; x <=3; x++) {
				current = calculateHourGlass(x,y, arr);
				System.out.println("size: " + current);
				if(current > max || (x == 0 && y == 0)) {
					max = current;
				}
				current = 0;
			}
		}
		
		return max;
	}
	public static int calculateHourGlass(int x, int y, int[][] arr) {
		int count = 0;
		for(int p = y; p <=y +2; p++ ) {
			for(int q = x; q <= x +2; q++) {
				if((p == y +1) && (q == x || q == x +2)) {
					count += 0;
				} else {
					count += arr[p][q];
				}
			}
		}
		
		return count;
	}

}
