package com.greatLearning.currencyProb;
import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size of currency denominations");
		int arrLen=sc.nextInt();
		System.out.println("Enter the currency denominations value");
		int arr[]=new int[arrLen];
		for(int i=0;i<arrLen;i++) {
			arr[i]=sc.nextInt();
		}
		MergeSortClass ob = new MergeSortClass();
		ob.sort(arr, 0, arr.length - 1);
        ob.printArray(arr);
		System.out.println("Enter the amount you want to pay");
		int payAmt=sc.nextInt();
		int temp=payAmt;
		String[] op=new String[arrLen];
		int j=0;
		for(int i=arrLen-1;i>=0;i--) {
			if(temp-arr[i]>=0) {
				int count=0;
				while(temp-arr[i]>=0) {
					count++;
					temp=temp-arr[i];
					op[j]=arr[i]+" : "+count;
					
				}
				j++;
			}
		}
		ob.printArray(op);
	}
}
