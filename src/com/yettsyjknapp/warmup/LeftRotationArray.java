package com.yettsyjknapp.warmup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LeftRotationArray {
//array left rotation hackerrank solution java
	static int[] rotLeft(int[] a, int d) {
	//because the constraints state d < n, shifting > n units is not a concern
		int n = a.length;
	//create a new array for rotated elements	
		int[] rotatedArr = new int[n];

		System.arraycopy(a, d, rotatedArr, 0, n - d);
		System.arraycopy(a, 0, rotatedArr, n - d, d);
		System.out.println(rotatedArr + " : ");
		return rotatedArr;
	}
	/*
	 * modular arithmetic to calculate the position of the each element and placed
	 * them as I read from input. So if I divide the number of rotations (X) by the
	 * length of the array (lenArr) I should get the amount of times the array has
	 * been fully rotated.
	 */

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));//Exception thrown at this line if you don't have 
        //this line can't be replaced as it is used within Hackerrank environment to run tests////
	String[] nd = scanner.nextLine().split(" ");
	int n = Integer.parseInt(nd[0]);
	int d = Integer.parseInt(nd[1]);

    int[] a = new int[n];

    String[] aItems = scanner.nextLine().split(" ");
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    for (int i = 0; i < n; i++) {
        int aItem = Integer.parseInt(aItems[i]);
        a[i] = aItem;
    }

    int[] result = rotLeft(a, d);

    for (int i = 0; i < result.length; i++) {
        bufferedWriter.write(String.valueOf(result[i]));

        if (i != result.length - 1) {
            bufferedWriter.write(" ");
        }
    }

    bufferedWriter.newLine();

    bufferedWriter.close();

    scanner.close();
	
	
	}
}


