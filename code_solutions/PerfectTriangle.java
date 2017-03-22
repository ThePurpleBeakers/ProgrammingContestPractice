/*

2017 WSFCS Career Center Internal Programming Competition
Problem B ~ Perfect Triangle

Malcolm Jones
March 17, 2017

*/

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class PerfectTriangle {

	public static void main(String[] args) throws IOException
	{
		
		Scanner file = new Scanner(new File("triangles.txt"));
		
		String part = file.nextLine();
		int rows = Integer.parseInt(file.nextLine());
		
		
		drawTriangle(part, rows);
		
	}
	
	public static void drawTriangle(String part, int rows)
	{
		
		String rowOutput = part.substring(0, 1);
		System.out.println(rowOutput);
		
		for(int i = 1; i <= rows - 1; i++)
		{
			
			if(i % 2 == 0)
			{
				rowOutput = part.substring(0,  1) + rowOutput;
			}
			else
			{
				rowOutput = part.substring(1) + rowOutput;
			}
			
			System.out.println(rowOutput);
			
		}
		
		rowOutput = rowOutput.substring(1);
		rowOutput += rowOutput.substring(rowOutput.length()-2, rowOutput.length()-1);
		
		
		for(int i = 1; i <= rows; i++)
		{
			System.out.println(rowOutput);
			rowOutput = rowOutput.substring(1);
		}
		
	}
	
	public static String reverse(String str)
	{
		String output = "";
		
		for(int i = str.length()-1; i >= 0; i--)
		{
			output += str.substring(i, i+1);
		}
		
		return output;
	}
	
	
	

}
