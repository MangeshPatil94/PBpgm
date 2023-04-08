package interview;

import java.util.ArrayList;

public class sample1 
{
public static void main(String[] args) 
{
String s1="dad mom child";
String []ar=s1.split(" ");
for (int i=0;i<3;i++)
{
String a=ar[i];
String b="";
for(int j=a.length()-1;j>=0;j--)
{
	b=b+a.charAt(j);	
}

if(b.equals(a))
{
	System.out.println(a+": is a palandrome");
}

else
{
	System.out.println(a+": isn't a palandrome");
}

}
















//	ArryList ar= new ArrayList();
//for (int i=0;i<ar.length;i++)
//{
//	//<input type="text" name="user1234" />
//	//input[@name='user1234']
//}
}




}
