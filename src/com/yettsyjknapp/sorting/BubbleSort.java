package com.yettsyjknapp.sorting;

import java.util.Scanner;

public class BubbleSort {
	 // Complete the countSwaps function below.
    static void countSwaps(int[] a) {
    	int n = a.length;
    	int numberOfSwaps = 0;
    	for(int i = 0; i < n; i++) {
    		boolean swapped = false;
    		
    		for(int j = 0; j < n - 1; j++ ) {
    			if(a[j] > a[j + 1]) {
    				int tempo = a[j];
    				a[j] = a[j + 1];
    				a[j + 1] = tempo;
    				swapped = true;
    				numberOfSwaps++;
    			}
    		}
    		if(!swapped) {
    			break;
    	}//the test passes on the printline 
    		System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
            System.out.println("First Element: " + a[0]);
            System.out.println("Last Element: " + a[n - 1]);
    	}//no return needed
  
    }//end bubble sort
   
	
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        countSwaps(a);

        scanner.close();
    }

}
