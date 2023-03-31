package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class hasSet 
{
public static void main(String[] args) 
{
	HashSet hs=new HashSet();
	//ArrayList hs=new ArrayList();
	hs.add("ram");
	hs.add(200);
	hs.add(null);
	hs.add(100);
	hs.add(50);
	hs.add(200);
	hs.add(200);
	System.out.println(hs);
	Iterator itr = hs.iterator();
	while(itr.hasNext())
	{
		System.out.print(itr.next()+" ");
	}
	System.out.println();
	for(Object fe:hs)
	{
		System.out.print(fe+" ");
	}
	System.out.println();
	HashSet hst = new HashSet(hs);
	for(Object fe:hst)
	{
		System.out.print(fe+" ");
	}
}
}
