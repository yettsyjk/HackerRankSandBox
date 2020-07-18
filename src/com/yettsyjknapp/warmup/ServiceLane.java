package com.yettsyjknapp.warmup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ServiceLane {
	// Complete the serviceLane function below.
   static int[] serviceLane(int n, int[][] cases) {
//    	//1.Get an array of arrays of road elements slicing at the start(i) and result(j)
//    	int[] width = new int[n];
//    	 int start = 0;
    	int[] result = new int[cases.length];
//    	
//    	int minCases = 3;
//    	//2.Get an array of maximum car width that can pass through each road element
//    		//time complexity is O(n)
//    	for(int i =0; i < cases.length; i++) {
//    		result[i] = 4;
//    		for(int j = cases[i][0]; j <= cases[i][j]; j++) {
//    			if(width[j] < result[i]) {
//    				result[i] = width[j];
//    			}
//    		}
		return result;
//    	}
   }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nt = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nt[0]);

        int t = Integer.parseInt(nt[1]);

        int[] width = new int[n];

        String[] widthItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int widthItem = Integer.parseInt(widthItems[i]);
            width[i] = widthItem;
        }

        int[][] cases = new int[t][2];

        for (int i = 0; i < t; i++) {
            String[] casesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int casesItem = Integer.parseInt(casesRowItems[j]);
                cases[i][j] = casesItem;
            }
        }

        int[] result = serviceLane(n, cases);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
