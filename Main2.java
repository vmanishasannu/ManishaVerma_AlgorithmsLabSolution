package com.greatLearning.targetProblem;

import java.util.Scanner;

public class Main2 {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int arrLen=sc.nextInt();
		System.out.println("Enter the values of array");
		int arr[]=new int[arrLen];
		for(int i=0;i<arrLen;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the total no of targets that needs to be achieved");
		int targetNo=sc.nextInt();
		for(int i=0;i<targetNo;i++) {
			CalculateTransaction.calculateTransactionVal(arr,arrLen);
		}
	}
}
