package com.greatLearning.targetProblem;

import java.util.Scanner;

public class CalculateTransaction {
	public static void calculateTransactionVal(int[] arr, int arrLen) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of target");
		int currentTarget=sc.nextInt();
		int sum=0;
		int counter=0;
		for(int i=0;i<arrLen;i++) {
			sum=sum+arr[i];
			if(sum<currentTarget) {
				counter++;
			} else if(sum==currentTarget) {
				counter++;
				break;
			}else if(currentTarget<=arr[i]) {
					counter++;
					break;
			}
		}
		if(counter==0) {
			System.out.println("Given target is not achieved");
		}else {
			System.out.println("Target achieved after "+counter+" transactions");
		}
		
	}
}
