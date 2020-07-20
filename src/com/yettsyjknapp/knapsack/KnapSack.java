package com.yettsyjknapp.knapsack;

public class KnapSack {
	static int max(int a, int b) {
		return (a > b) ? a : b;
	}
	// knapSack of capacity 'w' to get maximum total value in the knapSack

	static int knapSack(int maxCapacity, int weight[], int value[], int n) {
		// base case
		if (n == 0 || maxCapacity == 0) {
			return 0;
		}
		if (weight[n - 1] > maxCapacity) {
			return knapSack(maxCapacity, weight, value, n - 1);
		} else {
			return max(value[n - 1] + knapSack(maxCapacity - weight[n - 1], weight, value, n - 1),
					knapSack(maxCapacity, weight, value, n - 1));
		}//time complexity O(2^n)
	}//recursion tree

	// given two integer arrays of value and weight associated with n items
	public static void main(String args[]) {
		int value[] = new int[] { 60, 100, 120 };
		int weight[] = new int[] { 10, 20, 30 };
		int maxCapacity = 50;
		int n = value.length;
		System.out.println("knapSack: " + knapSack(maxCapacity, weight, value, n));
	}
}
