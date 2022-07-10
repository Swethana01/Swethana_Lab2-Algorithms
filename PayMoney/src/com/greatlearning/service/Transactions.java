package com.greatlearning.service;

public class Transactions {
	public void Servise(int transactionarr[], int target) {
		int n = transactionarr.length;
		int sum = 0;
		int i = 0;
		while (sum <= target && i < n) {
			sum = sum + transactionarr[i];
			i++;
		}
		if (sum >= target) {
			System.out.println("target achieved after" + (i + 1) + " Transaction");
			
		} else {
			System.out.println("target not achieved");
		}
		
	}

}
