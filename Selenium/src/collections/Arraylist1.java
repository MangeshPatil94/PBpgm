package collections;

import java.util.ArrayList;

public class Arraylist1 
{
public static void main(String[] args) 
{
	ArrayList al= new ArrayList();
	al.add("ram");
	al.add("sita");
	al.add(25);
	al.add(18);
	System.out.println(al);
	System.out.println(al.size());
	System.out.println(al.isEmpty());
	System.out.println(al.contains("sita"));
	al.add(2,"laxman");
	System.out.println(al);
	al.remove(2);
	System.out.println(al);
	al.set(3, 21);
	System.out.println(al);
}
}
