package com.dgoing.www;


public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = new int[5][5];
		
		int num = 1;
		
		for(int i = 0;i<5;i++)
		{
			for(int j =0;j<5;j++)
			{
				a[i][j] = num++;
			}
		}
		
		for(int i=0;i<5;i++)
		{
			for(int j =0;j<5;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int b[][] = new int[5][5];
		
		for(int i =0;i<5;i++)
		{
			for(int j =0; j<5;j++)
			{
				b[i][j] = a[5-1-j][i];
			}
		}
		
		for(int i=0;i<5;i++)
		{
			for(int j =0;j<5;j++)
			{
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
		
		
	}

}
