package com.assignment2;

import java.util.Arrays;

public class AS2Q1 {

	
	public static int insertionsort(int arr[],int size)
	{
		int comp=0;
		for(int i=1;i<size;i++)
		{
			int temp=arr[i];
			int j=i-1;
			if(!(arr[j]>temp))
			{
				comp++;
			}
			while(j>=0 &&arr[j]>temp)
			{
				comp++;
				arr[j+1]=arr[j];
				
				
				j--;
				if(j>=0 && arr[j]<temp)
				{
					comp++;
				}
				
			}
			
			arr[j+1]=temp;
		}
		return comp;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//int arr[]= {11,55,88,99,77,25,456};
		int arr[]= {55,44,22,66,11,33};
		
		System.out.println("Array before sorting " + Arrays.toString(arr));
		int comp=insertionsort(arr,arr.length);
		
		System.out.println("Array after sorting " + Arrays.toString(arr));
		System.out.println("The no of comparisons "+comp);

	}
}
