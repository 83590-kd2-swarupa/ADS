package com.assignment2;

import java.util.Arrays;

public class AS2Q2 {

	
	public static void insertionsort(int arr[],int size)
	{
	
		for(int i=1;i<size;i++)
		{
			int temp=arr[i];
			int j=i-1;
		
			while(j>=0 &&arr[j]<temp)
			{
				
				arr[j+1]=arr[j];
				j--;
			
				
			}
			
			arr[j+1]=temp;
		}
	
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int arr[]= {11,55,88,99,77,25,456};
		
		System.out.println("Array before sorting " + Arrays.toString(arr));
		insertionsort(arr,arr.length);
		
		System.out.println("Array after sorting " + Arrays.toString(arr));
		

	}
}
