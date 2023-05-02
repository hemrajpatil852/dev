package com.String;

public class DuplicatesCharacters 
{
	public static void main(String argu[]) 
	{
		String str = "Good bye bye world world ";
		
		char[] c = str.toCharArray();
				
		System.out.print("Duplicate Characters: ");
		
		for (int i = 0; i < str.length(); i++)
		{
			for (int j = i + 1; j < str.length(); j++)
			{
				if (c[i] == c[j])
				{
					System.out.print(c[i] + " ");
					break;
				}
			}
		}
	}
}
