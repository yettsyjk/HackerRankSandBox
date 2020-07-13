package com.yettsyjknapp.arrays;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ArrayManipulation {
	//start is 1 n+1 index is -100
	//sum out the  range and the max is 200
	 // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
    	long[] result = new long[n];
    	int length = queries.length;
    	long maxIndex = Long.MIN_VALUE;
    	long sumIndex = 0;
    	for(int i = 0; i <length; i++) {//loop through query length
    		int start = queries[i][0] - 1;//set the end to start, array is one index so subtract 1
    		int end = queries[i][1] -1;//array is one index so subtract 1
    		int add = queries[i][2];//what we are adding at the second index
    		result[start] += add;
    		if(end + 1 < n) {//checking the out of bounds at 6
    			result[end + 1] -= add;
    		}
    	}
    	for(int i = 0; i < n; i++) {//add the previous so it is set to 1
    		//add the numbers into the result array
    		sumIndex += result[i];//adding the first index
    		maxIndex = Math.max(maxIndex, sumIndex);//set the max each time
    	}
    	return maxIndex;//runtime is O(n) since we are looping through once
    }
	
	
	
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

}
