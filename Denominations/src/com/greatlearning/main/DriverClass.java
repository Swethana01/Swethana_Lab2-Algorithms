package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.service.MergeSortImplementation;
import com.greatlearning.service.NotesCount;

public class DriverClass {
	

	public static void main(String[] args) {
		MergeSortImplementation MS=new MergeSortImplementation();
		NotesCount NC=new NotesCount();
		System.out.println("Enter the size of currency denominations");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int note[]=new int[size];
		System.out.println("Enter the currency denomination value");
		for(int i=0;i<size;i++)
		{
			note[i]=sc.nextInt();
			
		}
		System.out.println("Enter the amount you want to pay");
		int amount=sc.nextInt();
		MS.mergeSort(note,0,note.length-1);
		NC.notesCountImplementation(note,amount);
			}

}
