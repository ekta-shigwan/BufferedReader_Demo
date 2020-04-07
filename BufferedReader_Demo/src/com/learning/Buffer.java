package com.learning;

import java.io.*;

public class Buffer 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Student Name : ");
		String name=reader.readLine();
		
		System.out.println("Enter Roll Number : ");
		int roll=Integer.parseInt(reader.readLine());
		
		System.out.println("Enter three subject marks : ");
		System.out.println("English : ");
		int m1=Integer.parseInt(reader.readLine());

		System.out.println("Maths : ");
		int m2=Integer.parseInt(reader.readLine());

		System.out.println("Hindi : ");
		int m3=Integer.parseInt(reader.readLine());
		
		System.out.println("Student Name is : "+name);
		System.out.println("Student Roll Number is : "+roll);
		System.out.println("Marks ");
		System.out.println("English : "+m1);
		System.out.println("Maths : "+m2);
		System.out.println("Hindi : "+m3);
		int tot=m1+m2+m3;
		System.out.println("Total is : "+tot);
		
	}

}
