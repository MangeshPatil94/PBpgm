package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedlist 
{
public static void main(String[] args) 
{
	LinkedList ll=new LinkedList();
	ll.add("rahul");
	ll.add(100);
	ll.add(65.5f);
	ll.add('A');
	ll.add(100);
	ll.add(null);
	ll.add(null);
	System.out.println(ll);
	System.out.println(ll.size());
	ll.set(5,200);
	System.out.println(ll);
//	System.out.println(ll.isEmpty());
//	System.out.println(ll.contains('A'));
//	System.out.println(ll.get(5));
	ll.remove(6);
	System.out.println(ll);
	 Iterator ir = ll.iterator();
	 while(ir.hasNext())
	 {
		 System.out.print(ir.next()+" ");
	 }
	 System.out.println();
	 System.out.println("list iterator-----------");
	 ListIterator litr = ll.listIterator();
	 while(litr.hasNext())
	 {
		 System.out.print(litr.next()+" ");
	 }
	 System.out.println();
	System.out.println("for each----------");
	for(Object fe:ll)
	{
		System.out.print(fe+" ");
	}
}
}
