package collections;

import java.util.ArrayList;

public class Arraylist
{
public static void main(String[] args) {
	 
	ArrayList al = new ArrayList();
	al.add("rahul");
	al.add("ramesh");
	al.add(78);	
	al.add(null);
	al.add(3,35f);
	al.add(null);
	
	System.out.println(al);
	System.out.println(al.size());
	System.out.println(al.isEmpty());
	
}
}
