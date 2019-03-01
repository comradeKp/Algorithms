package com.kpcorp.algorithms.sorting;

import java.util.Arrays;
import java.util.Scanner;

import com.kpcorp.algorithms.util.UtilClass;

/**
 * Hello world!
 *
 */
public class SelectionSort {
	public static void main(String[] args) {
		System.out.println("Enter the number of elements to be entered :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println("Enter the Elements :");
		int a[] = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Array Before Sorting:");
		System.out.println(Arrays.toString(a));
		selection(a);
		System.out.println("Sorted Array :");
		for (int i : a) {
			System.out.println(i);
		}
		sc.close();
	}

	static int[] selection(int[] a) {
		int n = a.length;
		int min_index = 0;
		boolean swapFlag = false;
		for (int i = 0; i < n - 1; i++) {
			min_index = i;
			for (int j = i + 1; j < n; j++) {
				if (a[j] < a[min_index]) {
					min_index = j;
					swapFlag = true;
				}
			}
			if (swapFlag) {
//				UtilClass.swap(a[i], a[min_index]);
				int temp = a[min_index];
				a[min_index] = a[i];
				a[i] = temp;
			}
		}
		return a;
	}
}
