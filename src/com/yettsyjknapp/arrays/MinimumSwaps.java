package com.yettsyjknapp.arrays;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinimumSwaps {
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

    
 // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
    	//the arr is consecutive and  
    	int minIndex = 0;//minimum element to find consecutive order initial position 
    	int min = arr[0];
    	int swaps = 0;//keep track number of swaps in this variable

    	for(int i = 1; i < arr.length; i++) {
    		if (arr[i] < min) {//check for each position
    			minIndex = i;
    			min = arr[i];
    		}
    	}
    		if(minIndex != 0 ) {//if the elements are not equal to zero swap the elements 
    			int temp = arr[0];
    			 arr[0] = arr[minIndex];
    			arr[minIndex]  = temp;
    			swaps++;
    	}
    		for(int currentSwap = 1;currentSwap < arr.length -1; currentSwap++ ) {
    			int swapPosition = arr[currentSwap]- arr[0];
    			while(arr[swapPosition] != arr[currentSwap]) {
    				int swapTempo = arr[swapPosition];
    				arr[swapPosition] = arr[currentSwap]; 
    				arr[currentSwap] = swapTempo;
    				swaps++;
    				swapPosition = arr[currentSwap] - arr[0];
    			}
    			currentSwap = swapPosition;//reducing time complexity
    		}
    	
    	return swaps;
    	
    }
}
