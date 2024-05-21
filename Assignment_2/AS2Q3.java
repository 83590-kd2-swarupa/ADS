package com.assignment2;

import java.util.Arrays;

public class AS2Q3 
{

	
	public static void sortBysalary(Employee[] arr,int n)
	{
		
			double sal[]=new double[n];
			for(int i=0;i<n;i++)
			{
				sal[i]=arr[i].getSalary();
				
			}
			
						
			for(int j=1;j<sal.length;j++)
			{
				double temp=sal[j];
				int k=j-1;
				
				while(k>=0 && sal[k]>temp)
				{
					sal[k+1]=sal[k];
					k--;
				}
				sal[k+1]=temp;
			}
			
			
			
				for(int z=0;z<sal.length;z++)
				{
					for(int y=0;y<arr.length;y++)
					if(arr[y].getSalary()==sal[z])
					{
						System.out.println(arr[y]);
					}
				}
			
		
	
	}
			
		
	
	
	public static void main(String[] args) {

		Employee earr[] = { 
				new Employee(1, "Sanky", 90000), 
				new Employee(2, "Amit", 80000),
				new Employee(3, "Abhi", 70000), 
				new Employee(4, "Suraj", 60000), 
				new Employee(5, "Rohit", 50000), 
		};
		

		sortBysalary(earr, 5);

	}
	
};

class Employee {
	int empid;
	String name;
	double salary;

	public Employee(int empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}


}
