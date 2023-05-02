package com.ExceptionHanding;

public class ToCharArra {


	static void convert(String s)
	{
		char arr[]=s.toCharArray();
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=='a' ||arr[i]=='e' ||arr[i]=='i' ||arr[i]=='o' ||arr[i]=='u')
			{
				arr[i]='$';
				System.out.print(arr[i]);
			}
			else
				System.out.print(arr[i]);
		}
		
		
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.print(arr[i]);
//		}
//		
		String s1=new String(arr);
		System.out.println(s1);
		
	}

	public static void main(String[] args) {
		String s="hello java";// vowels->$
		
		
	//	s=s.replace('e', '$');
		System.out.println(s);
		
		
		convert(s);
		
	}

}
	
