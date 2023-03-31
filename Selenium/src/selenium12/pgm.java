package selenium12;

import java.util.Scanner;

public class pgm 
{
public static void main(String[] args) {
	
	int count=0;
	Scanner p= new Scanner(System.in);
	String s1=p.nextLine();
	for(int i=0;i<=s1.length()-1;i=i+2)
	{
		char c = s1.charAt(i);
		if(c=='a')
		{
			count++;
		} 
	}
	System.out.println("count of charactor a :"+count);
}
}
