package com.greatelearning.main;

import java.util.Scanner;

import com.greatlearning.service.Transactions;

public class DriverClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the transaction array");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter the value of an array");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i] + "");
		}
		System.out.println("Enter the value of Target");
		int target = sc.nextInt();
		Transactions s=new Transactions();
		s.Servise(arr, target);
		sc.close();

	}

}
