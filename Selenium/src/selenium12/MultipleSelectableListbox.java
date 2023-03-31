package selenium12;

import java.util.Arrays;
import java.util.Scanner;

public class MultipleSelectableListbox 
{
public static void main(String[] args)
  {
	
		int ar1[] = { 10, 20, 30 };
		int ar2[] = { 40, 50, 60 ,70,80,90};
		int ar3[] = { 40, 50, 60 ,70,80,90};
		
		System.out.println(Arrays.equals(ar1, ar2));  //false
		System.out.println(Arrays.equals(ar1, ar3));  // false
		System.out.println(Arrays.equals(ar2, ar3));  //true
			
//	String b="12345";
//	
//	
//	for(int i=b.length()-1; i>=0;i--)
//	{
//		System.out.print(b.charAt(i));
//	}
		Scanner l= new Scanner(System.in);
		System.out.println("enter the String :");
		String s= l.nextLine();
	//	String s="a s dffg e q";
		int q=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			char h=s.charAt(i);
			char g=' ';
			if(g==h)
			{
			 q=q+1;
			}	
		}
		System.out.println(q);
  }

private static String nextLine() {
	// TODO Auto-generated method stub
	return null;
}
}
